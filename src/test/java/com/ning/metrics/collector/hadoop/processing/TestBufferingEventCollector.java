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

import com.ning.metrics.collector.MockEvent;
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.endpoint.EventStats;
import com.ning.metrics.collector.realtime.EventQueueConnection;
import com.ning.metrics.collector.realtime.EventQueueConnectionFactory;
import com.ning.metrics.collector.realtime.EventQueueProcessorImpl;
import com.ning.metrics.collector.realtime.EventQueueSession;
import com.ning.metrics.collector.realtime.EventQueueStats;
import com.ning.metrics.serialization.event.Event;
import com.ning.metrics.serialization.writer.MockEventWriter;
import com.ning.metrics.serialization.writer.StubScheduledExecutorService;
import org.skife.config.ConfigurationObjectFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

import static org.testng.Assert.assertEquals;

public class TestBufferingEventCollector
{
    private static final int REFRESH_DELAY_IN_SECONDS = 3;
    private List<ScheduledCommand> commiterCommands;
    private List<Runnable> writesCommands;
    private List<Object> sentEvents;
    private MockEventWriter eventWriter;
    private Event event;
    private CollectorConfig config;
    private BufferingEventCollector collector;
    private EventQueueStats stats;
    private EventQueueProcessorImpl msgSender;
    private ReentrantLock sessionLock = new ReentrantLock();
    private EventStats eventStats;

    @BeforeMethod(alwaysRun = true)
    void setup()
    {
        commiterCommands = new ArrayList<ScheduledCommand>();
        writesCommands = new ArrayList<Runnable>();
        sentEvents = new CopyOnWriteArrayList<Object>();
        eventWriter = new MockEventWriter();

        Properties properties = new Properties();
        properties.setProperty("collector.activemq.enabled", "true");
        config = new ConfigurationObjectFactory(properties).build(CollectorConfig.class);

        EventQueueConnectionFactory factory = new EventQueueConnectionFactory()
        {
            @Override
            public EventQueueConnection createConnection()
            {
                return new EventQueueConnection()
                {
                    @Override
                    public void reconnect()
                    {
                    }

                    @Override
                    public EventQueueSession getSessionFor(String type)
                    {
                        return new EventQueueSession()
                        {
                            @Override
                            public void send(Object event)
                            {
                                sessionLock.lock();
                                try {
                                    sentEvents.add(event);
                                }
                                finally {
                                    sessionLock.unlock();
                                }
                            }

                            @Override
                            public void close()
                            {
                            }
                        };
                    }

                    @Override
                    public void close()
                    {
                    }
                };
            }
        };
        stats = new EventQueueStats();
        msgSender = new EventQueueProcessorImpl(config, factory, stats);
        final ScheduledExecutorService executor = new StubScheduledExecutorService()
        {
            @Override
            public ScheduledFuture<?> schedule(Runnable command, long delay, TimeUnit unit)
            {
                //only flush commands come in via schedule
                commiterCommands.add(new ScheduledCommand(command, delay, unit));

                return null;
            }

            @Override
            public void shutdown()
            {
                commiterCommands.clear();
            }

            @Override
            public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException
            {
                // no-op
                return true;
            }
        };
        event = new MockEvent();
        final WriterStats stats = new WriterStats();
        final EventSpoolDispatcher dispatcher = new EventSpoolDispatcher(new HadoopWriterFactory(eventWriter, config), stats, config);
        collector = new BufferingEventCollector(msgSender, dispatcher);
        eventStats = new EventStats();
    }

    private void startCollectorThreads()
    {
    }

    private void stopCollectorThreads() throws InterruptedException
    {
        collector.shutdown();
    }

    private void performCommits()
    {
        commiterCommands.remove(0).getCommand().run();
    }

    private void performWrites()
    {
        while (!writesCommands.isEmpty()) {
            writesCommands.remove(0).run();
        }
    }

    private void performFlushes()
    {
        try {
            eventWriter.flush();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // AMQ test
    @Test(groups = "slow")
    public void testQueue() throws Exception
    {
        startCollectorThreads();

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
        msgSender.addTypeToCollect(event.getName());
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
        msgSender.disable();
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
        msgSender.enable();
        collector.collectEvent(event, eventStats);
        collector.collectEvent(event, eventStats);
        Thread.sleep(100);
        assertEquals(sentEvents.size(), 4);
        assertEquals(stats.getIgnoredEvents(), 4);
        assertEquals(stats.getEnqueuedEvents(), 4);
        assertEquals(stats.getDroppedEvents(), 0);
        assertEquals(stats.getSentEvents(), 4);
        assertEquals(stats.getErroredEvents(), 0);
    }

    // AMQ test
    @Test(groups = "slow")
    public void testQueueOverflow() throws Exception
    {
        startCollectorThreads();

        // Need to force sending via AMQ even without actual schema (for testing)
        msgSender.addTypeToCollect(event.getName());

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
        Thread.sleep(config.getActiveMQBufferLength() / 10);
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
        startCollectorThreads();
        collector.collectEvent(event, eventStats);
        assertEventCounts(0, 0, 0, 0);
        performWrites();
        assertEventCounts(1, 0, 0, 0);
        performCommits();
        assertEventCounts(0, 1, 0, 0);
    }

    @Test(groups = "fast")
    public void testWriteFails() throws Exception
    {
        // Make sure events that have been written, but not committed yet, are not wiped when a write fails
        startCollectorThreads();
        submitEvents(4);
        assertEventCounts(0, 0, 0, 0);
        performWrites();
        assertEventCounts(4, 0, 0, 0);
        eventWriter.setWriteThrowsException(true); // It's lost, we can't do much about it
        submitEvents(1);
        performWrites();
        assertEventCounts(4, 0, 0, 0);
    }

    @Test(groups = "fast")
    public void testCommitFails() throws Exception
    {
        // If a commit fails, those writes are rolled back
        startCollectorThreads();
        eventWriter.setCommitThrowsException(true);
        submitEvents(4);
        assertEventCounts(0, 0, 0, 0);
        performWrites();
        assertEventCounts(4, 0, 0, 0);
        performCommits();
        assertEventCounts(0, 0, 4, 0);
    }

    @Test(groups = "fast")
    public void testRollbackFails() throws Exception
    {
        // If rollback fails, event counts are unaltered
        startCollectorThreads();
        submitEvents(4);
        performWrites();
        assertEventCounts(4, 0, 0, 0);
        performCommits();
        assertEventCounts(0, 4, 0, 0);
        eventWriter.setCommitThrowsException(true);
        eventWriter.setRollbackThrowsException(true);
        submitEvents(1);
        performWrites();
        assertEventCounts(1, 4, 0, 0);
        stopCollectorThreads();
        assertEventCounts(1, 4, 0, 0);
    }

    @Test(groups = "slow")
    public void testBlockingDrain() throws Exception
    {
        startCollectorThreads();
        submitEvents(5);
        assertEventCounts(0, 0, 0, 0); // This just adds events to write (stub executor)
        performWrites();
        assertEventCounts(5, 0, 0, 0);
    }

    @Test(groups = "fast")
    public void testNonBlockingDrain() throws Exception
    {
        startCollectorThreads();
        submitEvents(5);
        assertEventCounts(0, 0, 0, 0);
        performWrites();
        performCommits();
        performFlushes();
        assertEventCounts(0, 0, 0, 5);
    }

    @Test(groups = "fast")
    public void testCommit() throws Exception
    {
        startCollectorThreads();
        submitEvents(5);
        assertEventCounts(0, 0, 0, 0);
        performWrites();
        assertEventCounts(5, 0, 0, 0);
        commiterCommands.remove(0).getCommand().run();
        assertEventCounts(0, 5, 0, 0);
    }

    @Test(groups = "fast")
    public void testQueueIsFull() throws Exception
    {
        startCollectorThreads();
        submitEvents(5);
        Assert.assertEquals(collector.getQueueSizes(), 5);
        Assert.assertEquals(collector.collectEvent(event, eventStats), false);
    }

    private void assertEventCounts(int written, int committed, int quarantined, int flushed)
    {
        Assert.assertEquals(eventWriter.getWrittenEventList().size(), written);
        Assert.assertEquals(eventWriter.getCommittedEventList().size(), committed);
        Assert.assertEquals(eventWriter.getQuarantinedEventList().size(), quarantined);
        Assert.assertEquals(eventWriter.getFlushedEventList().size(), flushed);
    }

    private void submitEvents(int num)
    {
        for (int i = 0; i < num; i++) {
            Assert.assertEquals(collector.collectEvent(event, eventStats), true);
        }
    }

    static class ScheduledCommand
    {
        private final Runnable command;

        private ScheduledCommand(Runnable command, long delay, TimeUnit unit)
        {
            this.command = command;
        }

        public Runnable getCommand()
        {
            return command;
        }
    }
}
