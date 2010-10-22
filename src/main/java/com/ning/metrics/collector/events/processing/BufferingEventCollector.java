/*
 * Copyright 2010 Ning, Inc.
 *
 * Ning licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.ning.metrics.collector.events.processing;

import com.google.inject.Inject;
import com.google.inject.internal.Nullable;
import com.ning.metrics.collector.binder.annotations.BufferingEventCollectorEventWriter;
import com.ning.metrics.collector.binder.annotations.BufferingEventCollectorExecutor;
import com.ning.metrics.collector.binder.annotations.Managed;
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.events.Event;
import com.ning.metrics.collector.events.writers.EventWriter;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class BufferingEventCollector implements EventCollector
{
    private static final Logger log = Logger.getLogger(BufferingEventCollector.class);

    private final EventWriter eventWriter;
    private final AtomicLong maxQueueSize;
    private final AtomicInteger refreshDelayInSeconds;
    private final ScheduledExecutorService executor;
    private final TaskQueueService taskQueueService;
    private final ActiveMQController activeMQController;

    @Inject
    public BufferingEventCollector(
        @BufferingEventCollectorEventWriter EventWriter eventWriter,
        @BufferingEventCollectorExecutor ScheduledExecutorService executor,
        TaskQueueService taskQueueService,
        @Nullable ActiveMQController activeMQController,
        CollectorConfig config
    )
    {
        this(eventWriter, executor, taskQueueService, activeMQController, config.getMaxQueueSize(), config.getRefreshDelayInSeconds());
    }

    public BufferingEventCollector(
        EventWriter eventWriter,
        ScheduledExecutorService executor,
        TaskQueueService taskQueueService,
        ActiveMQController activeMQController,
        long maxQueueSize,
        int refreshDelayInSeconds
    )
    {
        this.eventWriter = eventWriter;
        this.taskQueueService = taskQueueService;
        this.maxQueueSize = new AtomicLong(maxQueueSize);
        this.refreshDelayInSeconds = new AtomicInteger(refreshDelayInSeconds);
        this.executor = executor;
        this.activeMQController = activeMQController;
    }

    public void shutdown() throws InterruptedException
    {
        taskQueueService.shutdown();
        taskQueueService.awaitTermination(15, TimeUnit.SECONDS);
        performOperation(new DiskOperation()
        {
            @Override
            public void execute() throws IOException
            {
                eventWriter.forceCommit();
            }
        });
    }

    @Inject
    public void startFlusher()
    {
        executor.schedule(new Runnable()
        {
            @Override
            public void run()
            {
                try {
                    performOperation(new DiskOperation()
                    {
                        @Override
                        public void execute() throws IOException
                        {
                            eventWriter.commit();

                        }
                    });
                }
                finally {
                    executor.schedule(this, refreshDelayInSeconds.get(), TimeUnit.SECONDS);
                }
            }
        }, refreshDelayInSeconds.get(), TimeUnit.SECONDS);
    }

    @Override
    public boolean collectEvent(final Event event)
    {
        if ((activeMQController != null) && (event != null)) {
            String humanReadableMessage = event.getData().toString();
            activeMQController.offerEvent(event.getName(), humanReadableMessage);
        }

        if (taskQueueService.getQueueSize() < maxQueueSize.get()) {
            try {
                taskQueueService.execute(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        performOperation(new DiskOperation()
                        {
                            @Override
                            public void execute() throws IOException
                            {
                                eventWriter.write(event);
                            }
                        });
                    }
                });
            }
            catch (RejectedExecutionException e) {
                return false;
            }

            return true;
        }

        return false;
    }

    private void performOperation(DiskOperation operation)
    {
        boolean rollback = true;

        try {
            operation.execute();
            rollback = false;
        }
        catch (IOException e) {
            log.warn("Error processing event queue list", e);
        }

        catch (RuntimeException e) {
            log.warn("Runtime exception while processing event queue list", e);
        }
        finally {
            if (rollback) {
                try {
                    log.warn("exception performing IO operation, attempting rollback");
                    eventWriter.rollback();
                }
                catch (IOException e1) {
                    //noinspection ThrowFromFinallyBlock
                    log.warn("Unable to rollback on commit error", e1);
                }
            }
        }
    }

    @Managed(description = "set the max number of elements in the in-memory queue; queue size > this => reject events")
    public void setMaxQueueSize(long maxQueueSize)
    {
        this.maxQueueSize.set(maxQueueSize);
    }

    @Managed(description = "the max number of elements in the in-memory queue; queue size > this => reject events")
    public long getMaxQueueSize()
    {
        return maxQueueSize.get();
    }

    @Managed(description = "number of events in memory queue")
    public long getQueueSize()
    {
        return taskQueueService.getQueueSize();
    }
}