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

import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.endpoint.EventStats;
import com.ning.metrics.serialization.event.Event;
import com.ning.metrics.serialization.event.StubEvent;
import com.ning.metrics.serialization.writer.MockEventWriter;
import com.ning.metrics.serialization.writer.StubScheduledExecutorService;
import org.skife.config.ConfigurationObjectFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
    private List<ScheduledCommand> flusherCommands;
    private List<Runnable> drainerCommands;
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
        flusherCommands = new ArrayList<ScheduledCommand>();
        drainerCommands = new ArrayList<Runnable>();
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
                flusherCommands.add(new ScheduledCommand(command, delay, unit));

                return null;
            }
        };
        event = new StubEvent();
        collector = new BufferingEventCollector(eventWriter, executor, new StubTaskQueueService()
        {
            @Override
            public void execute(Runnable command)
            {
                drainerCommands.add(command);
            }

            @Override
            public void shutdown()
            {
                runDrainerCommands();
            }

            @Override
            public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException
            {
                return drainerCommands.isEmpty();
            }

            @Override
            public int getQueueSize()
            {
                return drainerCommands.size();
            }
        },
            msgSender, 5, 30);
        eventStats = new EventStats();
    }

    private void startCollectorThreads()
    {
        collector.startFlusher();
    }

    private void runFlusherCommand()
    {
        flusherCommands.remove(0).getCommand().run();
    }

    private void runDrainerCommands()
    {
        while (!drainerCommands.isEmpty()) {
            drainerCommands.remove(0).run();
        }
    }

    @Test(groups = "fast")
    public void testStartFlusher() throws Exception
    {
        collector.startFlusher();
        Assert.assertEquals(flusherCommands.size(), 1);
    }


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

    @Test(groups = "slow")
    public void testQueueOverflow() throws Exception
    {
        startCollectorThreads();

        // Need to force sending via AMQ even without actual schema (for testing)
        msgSender.addTypeToCollect(event.getName());

        for (int idx = 0; idx < config.getActiveMQBufferLength(); idx++) {
            collector.collectEvent(event, eventStats);
        }
        Thread.sleep(100);
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
        Thread.sleep(100);
        // the lock is queried after the take() call, so the first of the second batch of events has been read already
        assertEquals(sentEvents.size(), config.getActiveMQBufferLength() + config.getActiveMQBufferLength() + 1);
        assertEquals(stats.getIgnoredEvents(), 0);
        assertEquals(stats.getEnqueuedEvents(), config.getActiveMQBufferLength() + config.getActiveMQBufferLength() + 1);
        assertEquals(stats.getDroppedEvents(), config.getActiveMQBufferLength() - 1);
        assertEquals(stats.getSentEvents(), config.getActiveMQBufferLength() + config.getActiveMQBufferLength() + 1);
        assertEquals(stats.getErroredEvents(), 0);
    }

    @Test(groups = "fast")
    public void testCollectFlow() throws Exception
    {
        startCollectorThreads();
        collector.collectEvent(event, eventStats);
        assertEventCounts(0, 0);
        runDrainerCommands();
        assertEventCounts(1, 0);
        runFlusherCommand();
        assertEventCounts(0, 1);
    }

    @Test(groups = "fast")
    public void testWriteFails() throws Exception
    {
        //make sure events that are drained, but not committed are wiped when a write fails and calls rollback()
        startCollectorThreads();
        submitEvents(4);
        runDrainerCommands();
        assertEventCounts(4, 0);
        eventWriter.setWriteThrowsException(true);
        submitEvents(1);
        runDrainerCommands();
        assertEventCounts(0, 0);
    }

    @Test(groups = "fast")
    public void testCommitFails() throws Exception
    {
        //if a commit fails, those writes are rolled back
        startCollectorThreads();
        eventWriter.setCommitThrowsException(true);
        submitEvents(4);
        runDrainerCommands();
        assertEventCounts(4, 0);
        collector.shutdown();
        assertEventCounts(0, 0);
    }

    @Test(groups = "fast")
    public void testRollbackFails() throws Exception
    {
        //if rollback fails, event counts are unaltered
        startCollectorThreads();
        submitEvents(4);
        runDrainerCommands();
        assertEventCounts(4, 0);
        eventWriter.setWriteThrowsException(true);
        eventWriter.setRollbackThrowsException(true);
        submitEvents(1);
        runDrainerCommands();
        assertEventCounts(4, 0);
    }

    @Test(groups = "fast")
    public void testBlockingDrain() throws Exception
    {
        startCollectorThreads();
        submitEvents(5);
        assertEventCounts(0, 0);
        runDrainerCommands();

        assertEventCounts(5, 0);
    }

    @Test(groups = "fast")
    public void testNonBlockingDrain() throws Exception
    {
        startCollectorThreads();
        submitEvents(5);
        assertEventCounts(0, 0);
        collector.shutdown();
        assertEventCounts(0, 5);
    }

    @Test(groups = "fast")
    public void testFlush() throws Exception
    {
        startCollectorThreads();
        submitEvents(5);
        assertEventCounts(0, 0);
        runDrainerCommands();
        assertEventCounts(5, 0);
        flusherCommands.remove(0).getCommand().run();
        assertEventCounts(0, 5);
    }

    @Test(groups = "fast")
    public void testQueueIsFull() throws Exception
    {
        startCollectorThreads();
        submitEvents(5);
        Assert.assertEquals(collector.getQueueSize(), 5);
        Assert.assertEquals(collector.collectEvent(event, eventStats), false);
    }

    private void assertEventCounts(int written, int commit)
    {
        Assert.assertEquals(eventWriter.getWrittenEventList().size(), written);
        Assert.assertEquals(eventWriter.getCommittedEventList().size(), commit);
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
        private final long delay;
        private final TimeUnit unit;

        private ScheduledCommand(Runnable command, long delay, TimeUnit unit)
        {
            this.command = command;
            this.delay = delay;
            this.unit = unit;
        }

        public Runnable getCommand()
        {
            return command;
        }

        public long getDelay()
        {
            return delay;
        }

        public TimeUnit getUnit()
        {
            return unit;
        }
    }
}
