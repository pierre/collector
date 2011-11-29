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

package com.ning.metrics.collector.hadoop.processing;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.ning.metrics.collector.MockEvent;
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.endpoint.EventStats;
import com.ning.metrics.collector.realtime.EventQueueProcessor;
import com.ning.metrics.collector.realtime.EventQueueProcessorImpl;
import com.ning.metrics.collector.realtime.GlobalEventQueueStats;
import com.ning.metrics.collector.realtime.RealTimeQueueTestModule;
import com.ning.metrics.serialization.event.Event;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import java.util.Collection;
import java.util.concurrent.locks.Lock;

import static org.testng.Assert.assertEquals;

@Guice(modules = {ConfigTestModule.class, EventCollectorModule.class, MockHdfsModule.class, RealTimeQueueTestModule.class})
public class TestBufferingEventCollector
{
    @Inject
    private CollectorConfig config;

    @Inject
    private BufferingEventCollector collector;

    @Inject
    private EventSpoolDispatcher dispatcher;

    @Inject
    private EventQueueProcessor msgSender;

    @Inject
    private GlobalEventQueueStats stats;

    /**
     * @see RealTimeQueueTestModule
     */
    @Inject
    @Named("amqSessionLock")
    private Lock sessionLock;

    /**
     * @see RealTimeQueueTestModule
     */
    @SuppressWarnings({"MismatchedQueryAndUpdateOfCollection"})
    @Inject
    @Named("sentEvents")
    private Collection sentEvents;

    private Event event;
    private EventStats eventStats;

    @BeforeMethod(alwaysRun = true)
    void setup()
    {
        dispatcher.getStats().clear();
        sentEvents.clear();
        stats.clear();

        event = new MockEvent();
        eventStats = new EventStats();
    }

    @Test(groups = "slow")
    public void testAMQIntegration() throws Exception
    {
        // Message type not recognized yet
        collector.collectEvent(event, eventStats);
        collector.collectEvent(event, eventStats);
        Thread.sleep(100);
        assertEquals(sentEvents.size(), 0);
        assertEquals(stats.getIgnoredEvents(), 2);
        assertEquals(stats.getEnqueuedEvents(), 0);
        assertEquals(stats.getDroppedEvents(), 0);
        assertEquals(stats.getSentEvents(), 0);
        assertEquals(stats.getErroredEvents(), 0);

        // Message type now recognized
        ((EventQueueProcessorImpl) msgSender).addTypeToCollect(event.getName());
        collector.collectEvent(event, eventStats);
        collector.collectEvent(event, eventStats);
        Thread.sleep(100);
        assertEquals(sentEvents.size(), 2);
        assertEquals(stats.getIgnoredEvents(), 2);
        assertEquals(stats.getEnqueuedEvents(), 2);
        assertEquals(stats.getDroppedEvents(), 0);
        assertEquals(stats.getSentEvents(), 2);
        assertEquals(stats.getErroredEvents(), 0);

        // Close the firehose
        ((EventQueueProcessorImpl) msgSender).disable();
        collector.collectEvent(event, eventStats);
        collector.collectEvent(event, eventStats);
        Thread.sleep(100);
        assertEquals(sentEvents.size(), 2);
        assertEquals(stats.getIgnoredEvents(), 4);
        assertEquals(stats.getEnqueuedEvents(), 2);
        assertEquals(stats.getDroppedEvents(), 0);
        assertEquals(stats.getSentEvents(), 2);
        assertEquals(stats.getErroredEvents(), 0);

        // Re-open the firehose
        // The queues are re-created, hence the stats for the bar event are reset
        ((EventQueueProcessorImpl) msgSender).enable();
        collector.collectEvent(event, eventStats);
        collector.collectEvent(event, eventStats);
        Thread.sleep(100);
        assertEquals(sentEvents.size(), 4);
        assertEquals(stats.getIgnoredEvents(), 4);
        assertEquals(stats.getEnqueuedEvents(), 2); // Went down to 0, now back to 2
        assertEquals(stats.getDroppedEvents(), 0);
        assertEquals(stats.getSentEvents(), 2); // Went down to 0, now back to 2
        assertEquals(stats.getErroredEvents(), 0);
    }

    @Test(groups = "slow")
    public void testAMQQueueOverflow() throws Exception
    {
        // Need to force sending via AMQ even without actual schema (for testing)
        ((EventQueueProcessorImpl) msgSender).addTypeToCollect(event.getName());

        for (int idx = 0; idx < config.getActiveMQBufferLength(); idx++) {
            collector.collectEvent(event, eventStats);
        }
        Thread.sleep(config.getActiveMQBufferLength() / 10);
        assertEquals(sentEvents.size(), config.getActiveMQBufferLength());
        assertEquals(stats.getIgnoredEvents(), 0);
        assertEquals(stats.getEnqueuedEvents(), config.getActiveMQBufferLength());
        assertEquals(stats.getDroppedEvents(), 0);
        assertEquals(stats.getSentEvents(), config.getActiveMQBufferLength());
        assertEquals(stats.getErroredEvents(), 0);

        sessionLock.lock();
        try {
            for (int idx = 0; idx < config.getActiveMQBufferLength() + config.getActiveMQBufferLength(); idx++) {
                collector.collectEvent(event, eventStats);
            }
        }
        finally {
            sessionLock.unlock();
        }
        Thread.sleep(config.getActiveMQBufferLength() / 2);
        // the lock is queried after the take() call, so the first of the second batch of events has been read already
        assertEquals(sentEvents.size(), config.getActiveMQBufferLength() + config.getActiveMQBufferLength() + 1);
        assertEquals(stats.getIgnoredEvents(), 0);
        assertEquals(stats.getEnqueuedEvents(), config.getActiveMQBufferLength() + config.getActiveMQBufferLength() + 1);
        assertEquals(stats.getDroppedEvents(), config.getActiveMQBufferLength() - 1);
        assertEquals(stats.getSentEvents(), config.getActiveMQBufferLength() + config.getActiveMQBufferLength() + 1);
        assertEquals(stats.getErroredEvents(), 0);
    }

    @Test(groups = "slow")
    public void testCollectFlow() throws Exception
    {
        // TODO
        // Regular test - make sure events are written to disk (test w/ commit, not the flush here)
    }

    @Test(groups = "fast")
    public void testWriteFails() throws Exception
    {
        // TODO
        // Test the writer library failed
        // Make sure events that have been written, but not committed yet, are not wiped when a write fails

    }

    @Test(groups = "fast")
    public void testQueueIsFull() throws Exception
    {
        // TODO
        // Test writer queues are full
    }
}
