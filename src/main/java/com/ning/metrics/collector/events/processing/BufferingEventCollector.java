/*
 * Copyright 2010-2011 Ning, Inc.
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
import com.ning.metrics.collector.binder.annotations.BufferingEventCollectorEventWriter;
import com.ning.metrics.collector.binder.annotations.BufferingEventCollectorExecutor;
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.endpoint.EventStats;
import com.ning.metrics.collector.realtime.EventQueueProcessor;
import com.ning.metrics.collector.util.Stats;
import com.ning.metrics.serialization.event.Event;
import com.ning.metrics.serialization.writer.EventWriter;
import org.apache.log4j.Logger;
import org.perf4j.aop.Profiled;
import org.weakref.jmx.Managed;

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
    private final EventQueueProcessor activeMQController;
    private final AtomicLong lostEvents = new AtomicLong(0);

    private final Stats acceptanceStats = Stats.timeWindow(30, TimeUnit.MINUTES);
    private final Stats extractionStats = Stats.timeWindow(30, TimeUnit.MINUTES);

    @Inject
    public BufferingEventCollector(
        @BufferingEventCollectorEventWriter EventWriter eventWriter,
        @BufferingEventCollectorExecutor ScheduledExecutorService executor,
        TaskQueueService taskQueueService,
        EventQueueProcessor activeMQController,
        CollectorConfig config
    )
    {
        this(eventWriter, executor, taskQueueService, activeMQController, config.getMaxQueueSize(), config.getRefreshDelayInSeconds());
    }

    public BufferingEventCollector(
        EventWriter eventWriter,
        ScheduledExecutorService executor,
        TaskQueueService taskQueueService,
        EventQueueProcessor activeMQController,
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

    /**
     * Shutdown the EventCollector. In practice, the collector will continue accepting requests (HTTP or Thrift),
     * but events won't be accepted anymore.
     * This stops:
     * the AMQ hook
     * the workers queue of disk write operations
     * the flusher which promotes files from the temporary area to the final area
     * <p/>
     *
     * @throws InterruptedException if we are interrupted while waiting for the queue of workers to be shutdown
     */
    public void shutdown() throws InterruptedException
    {
        // Disable AMQ hook
        activeMQController.stop();

        // Stop accepting incoming events
        taskQueueService.shutdown();
        taskQueueService.awaitTermination(15, TimeUnit.SECONDS);

        // Stop the periodic flusher
        executor.shutdown();
        executor.awaitTermination(15, TimeUnit.SECONDS);

        // Promote files to the final area
        try {
            eventWriter.forceCommit();
        }
        catch (IOException e) {
            log.warn("Got IOException when trying to promote files to the final spool area", e);
        }
    }

    @Inject
    public void startCommiter()
    {
        executor.schedule(new Runnable()
        {
            @Override
            public void run()
            {
                try {
                    eventWriter.commit();
                }
                catch (IOException e) {
                    try {
                        eventWriter.rollback();
                    }
                    catch (IOException e1) {
                        log.warn("Got IOException while trying to quarantine a file", e1);
                    }
                }
                finally {
                    executor.schedule(this, refreshDelayInSeconds.get(), TimeUnit.SECONDS);
                }
            }
        }, refreshDelayInSeconds.get(), TimeUnit.SECONDS);
    }

    @Override
    @Profiled(tag = "jmx", message = "Time to collect an event")
    public boolean collectEvent(final Event event, final EventStats eventStats)
    {
        if ((activeMQController != null) && (event != null)) {
            activeMQController.send(event);
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
                        try {
                            eventWriter.write(event);
                        }
                        catch (IOException e) {
                            log.debug(String.format("Unable to serialize event. Event is LOST: %s", event.toString()));
                            lostEvents.getAndIncrement();
                        }
                    }
                });
            }
            catch (RejectedExecutionException e) {
                // shutdown called
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

    @Managed(description = "Set the max number of elements in the in-memory queue; queue size > this => reject events")
    public void setMaxQueueSize(long maxQueueSize)
    {
        this.maxQueueSize.set(maxQueueSize);
    }

    @Managed(description = "The max number of elements in the in-memory queue; queue size > this => reject events")
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
    public double getEventsSecondTP99()
    {
        return 1000.0 / acceptanceStats.getMillisTP99();
    }

    @Managed(description = "TP99 of the acceptance time per event (until it's scheduled to be flushed to disk)")
    public double getEventsMillisTP99()
    {
        return acceptanceStats.getMillisTP99();
    }

    @Managed(description = "Number of events used to calculate the events TP99")
    public double getEventsCount()
    {
        return acceptanceStats.getCount();
    }

    @Managed(description = "TP99 of the time used to extract events from their original payload")
    public double getExtractionMillisTP99()
    {
        return extractionStats.getMillisTP99();
    }

    @Managed(description = "Number of events used to calculate the extraction TP99")
    public double getExtractionCount()
    {
        return extractionStats.getCount();
    }

    @Managed(description = "Number of events lost")
    public long getLostEvents()
    {
        return lostEvents.get();
    }
}
