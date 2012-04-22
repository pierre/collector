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

package com.ning.metrics.collector.processing;

import com.ning.metrics.collector.hadoop.processing.EventSpoolDispatcher;
import com.ning.metrics.collector.realtime.EventListenerDispatcher;
import com.ning.metrics.serialization.event.Event;

import com.google.inject.Inject;
import com.yammer.metrics.Metrics;
import com.yammer.metrics.aop.annotation.Metered;
import com.yammer.metrics.core.MeterMetric;
import com.yammer.metrics.core.MetricName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.weakref.jmx.Managed;

import java.util.concurrent.TimeUnit;

public class EventCollector
{
    private static final Logger log = LoggerFactory.getLogger(EventCollector.class);

    private final EventListenerDispatcher forwardDispatcher;
    private final EventSpoolDispatcher spoolDispatcher;

    private final MeterMetric spooledMeter;
    private final MeterMetric lostMeter;

    @Inject
    public EventCollector(final EventListenerDispatcher forwardDispatcher, final EventSpoolDispatcher spoolDispatcher)
    {
        this.forwardDispatcher = forwardDispatcher;
        this.spoolDispatcher = spoolDispatcher;

        final String group = EventCollector.class.getPackage().getName();

        spooledMeter = Metrics.newMeter(new MetricName(group, "EventStats", "Spooled"), "events", TimeUnit.SECONDS);
        lostMeter = Metrics.newMeter(new MetricName(group, "EventStats", "Lost"), "events", TimeUnit.SECONDS);

        Runtime.getRuntime().addShutdownHook(new Thread()
        {
            @Override
            public void run()
            {
                log.info("Starting main shutdown sequence");

                // Stop accepting events and flush all events in memory to disk
                shutdown();

                log.info("Main shutdown sequence terminated");
            }
        });
    }

    /**
     * Shutdown the EventCollector. In practice, the collector will continue accepting requests (HTTP or Thrift),
     * but events won't be accepted anymore.
     * This stops:
     * the AMQ hook
     * the workers queue of disk write operations
     * <p/>
     */
    public void shutdown()
    {
        log.info("Stop accepting new events");

        // Disable realtime hook
        forwardDispatcher.stop();

        // Disable writer to disk
        spoolDispatcher.shutdown();
    }

    @Metered
    public boolean collectEvent(final Event event)
    {
        // Async forwarder (i.e. realtime queue)
        forwardDispatcher.offer(event);

        if (spoolDispatcher.offer(event)) {
            spooledMeter.mark();
            return true;
        }
        else {
            lostMeter.mark();
            return false;
        }
    }

    @Managed(description = "Number of events in memory (spool queue)")
    public int getQueueSizes()
    {
        int length = 0;
        for (final Integer len : spoolDispatcher.getQueuesSizes().values()) {
            length += len;
        }

        return length;
    }
}
