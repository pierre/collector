/*
 * Copyright 2010 Ning, Inc.
 *
 * Ning licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
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
import com.ning.metrics.serialization.util.Managed;
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.endpoint.EventStats;
import com.ning.metrics.serialization.event.Event;
import com.ning.metrics.serialization.writer.EventWriter;
import com.ning.metrics.collector.util.Stats;
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

    private final Stats acceptanceStats = Stats.timeWindow(30, TimeUnit.MINUTES);
    private final Stats writerStats = Stats.timeWindow(30, TimeUnit.MINUTES);
    private final Stats extractionStats = Stats.timeWindow(30, TimeUnit.MINUTES);

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
    public boolean collectEvent(final Event event, final EventStats eventStats)
    {
        if ((activeMQController != null) && (event != null)) {
            String humanReadableMessage = event.getData().toString();
            activeMQController.offerEvent(event.getName(), humanReadableMessage);
        }

        if (taskQueueService.getQueueSize() < maxQueueSize.get()) {
            // Note the TimeStamp when we accepted the record
            eventStats.recordAccepted();

            // Schedule the write to disk
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

            // Update the statistics
            updateEndPointsStats(eventStats);

            return true;
        }

        return false;
    }

    private void updateEndPointsStats(EventStats eventStats)
    {
        extractionStats.record(eventStats.getExtractedDelayMillis());
        acceptanceStats.record(eventStats.getAcceptedDelayMillis());
    }

    /**
     * Perform a disk operation. On failure, rollback (put the file in the quarantine area).
     * This needs to be synchronized, since the eventWriter keeps track of the current file being worked on.
     *
     * @param operation DiskOperation to perform
     */
    synchronized private void performOperation(final DiskOperation operation)
    {
        writerStats.profile(new Runnable()
        {
            @Override
            public void run()
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
                            log.warn("Exception performing I/O operation, attempting rollback");
                            eventWriter.rollback();
                        }
                        catch (IOException e1) {
                            //noinspection ThrowFromFinallyBlock
                            log.warn("Unable to rollback on commit error", e1);
                        }
                    }
                }
            }
        });
    }

    @Managed(description = "Set the max number of elements in the in-memory queue; queue size > this => reject events")
    @SuppressWarnings("unused")
    public void setMaxQueueSize(long maxQueueSize)
    {
        this.maxQueueSize.set(maxQueueSize);
    }

    @Managed(description = "The max number of elements in the in-memory queue; queue size > this => reject events")
    @SuppressWarnings("unused")
    public long getMaxQueueSize()
    {
        return maxQueueSize.get();
    }

    @Managed(description = "Number of events in the in-memory queue")
    public long getQueueSize()
    {
        return taskQueueService.getQueueSize();
    }

    @Managed(description = "TP99 of the current capacity (events/second)")
    @SuppressWarnings("unused")
    public double getEventsSecondTP99()
    {
        return 1000.0 / acceptanceStats.getMillisTP99();
    }

    @Managed(description = "TP99 of the acceptance time per event (until it's scheduled to be flushed to disk)")
    @SuppressWarnings("unused")
    public double getEventsMillisTP99()
    {
        return acceptanceStats.getMillisTP99();
    }

    @Managed(description = "Number of events used to calculate the events TP99")
    @SuppressWarnings("unused")
    public double getEventsCount()
    {
        return acceptanceStats.getCount();
    }

    @Managed(description = "TP99 of the write operations")
    @SuppressWarnings("unused")
    public double getWriteMillisTP99()
    {
        return writerStats.getMillisTP99();
    }

    @Managed(description = "Number of write operations used to calculate the writes TP99")
    @SuppressWarnings("unused")
    public double getWriteCount()
    {
        return writerStats.getCount();
    }

    @Managed(description = "TP99 of the time used to extract events from their original payload")
    @SuppressWarnings("unused")
    public double getExtractionMillisTP99()
    {
        return extractionStats.getMillisTP99();
    }

    @Managed(description = "Number of events used to calculate the extraction TP99")
    @SuppressWarnings("unused")
    public double getExtractionCount()
    {
        return extractionStats.getCount();
    }
}