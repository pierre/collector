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

package com.ning.metrics.collector.hadoop.processing;

import com.google.inject.Inject;
import com.ning.metrics.collector.endpoint.EventStats;
import com.ning.metrics.collector.realtime.EventQueueProcessor;
import com.ning.metrics.collector.util.Stats;
import com.ning.metrics.serialization.event.Event;
import org.apache.log4j.Logger;
import org.perf4j.aop.Profiled;
import org.weakref.jmx.Managed;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class BufferingEventCollector implements EventCollector
{
    private static final Logger log = Logger.getLogger(BufferingEventCollector.class);

    private final EventQueueProcessor activeMQController;
    private final EventSpoolDispatcher dispatcher;

    private final AtomicLong lostEvents = new AtomicLong(0);

    private final Stats acceptanceStats = Stats.timeWindow(30, TimeUnit.MINUTES);
    private final Stats extractionStats = Stats.timeWindow(30, TimeUnit.MINUTES);

    @Inject
    public BufferingEventCollector(final EventQueueProcessor activeMQController, final EventSpoolDispatcher dispatcher)
    {
        this.activeMQController = activeMQController;
        this.dispatcher = dispatcher;
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

        // Disable writer to disk
        dispatcher.shutdown();
    }

    @Override
    @Profiled(tag = "jmx", message = "Time to collect an event")
    public boolean collectEvent(final Event event, final EventStats eventStats)
    {
        if (activeMQController != null && event != null) {
            activeMQController.send(event);
        }

        eventStats.recordAccepted();

        // Update the endpoint statistics
        updateEndPointsStats(eventStats);

        if (dispatcher.isRunning() && dispatcher.offer(event)) {
            return true;
        }
        else {
            lostEvents.incrementAndGet();
            return false;
        }
    }

    private void updateEndPointsStats(EventStats eventStats)
    {
        extractionStats.record(eventStats.getExtractedDelayMillis());
        acceptanceStats.record(eventStats.getAcceptedDelayMillis());
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

    @Managed(description = "Number of events in memory")
    public int getQueueSizes()
    {
        int length = 0;
        for (final Integer len : dispatcher.getQueuesSizes().values()) {
            length += len;
        }

        return length;
    }
}
