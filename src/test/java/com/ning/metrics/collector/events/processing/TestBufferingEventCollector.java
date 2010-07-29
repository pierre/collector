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

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ning.metrics.collector.events.Event;
import com.ning.metrics.collector.events.writers.MockEventWriter;
import com.ning.metrics.collector.events.writers.StubEvent;
import com.ning.metrics.collector.events.writers.StubScheduledExecutorService;
import com.ning.metrics.collector.events.writers.StubTaskQueueService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class TestBufferingEventCollector
{
    private List<ScheduledCommand> flusherCommands = new ArrayList<ScheduledCommand>();
    private List<Runnable> drainerCommands = new ArrayList<Runnable>();
    private MockEventWriter eventWriter = null;
    private Event event = null;
    private BufferingEventCollector collector = null;
    private ActiveMQControllerImpl activeMQController = null;

    @BeforeMethod(alwaysRun = true)
    void setup()
    {
        flusherCommands = new ArrayList<ScheduledCommand>();
        drainerCommands = new ArrayList<Runnable>();
        eventWriter = new MockEventWriter();
        activeMQController = new ActiveMQControllerImpl(new ArrayList<String>(), new MockActiveMQSender());
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
            activeMQController, 5, 30);
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

    @Test(groups = "fast")
    public void testActiveMQ() throws Exception
    {
        startCollectorThreads();

        // Message type not recognized yet
        collector.collectEvent(event);
        collector.collectEvent(event);
        Assert.assertEquals(activeMQController.getMessagesDisallowed(), 2);
        Assert.assertEquals(activeMQController.getMessagesSent(), 0);
        Assert.assertEquals(activeMQController.getMessagesRejected(), 0);

        // Message type now recognized
        activeMQController.addEventTypeToCollect(event.getName());
        collector.collectEvent(event);
        collector.collectEvent(event);
        Assert.assertEquals(activeMQController.getMessagesDisallowed(), 2);
        Assert.assertEquals(activeMQController.getMessagesSent(), 2);
        Assert.assertEquals(activeMQController.getMessagesRejected(), 0);

        // Close the firehose
        activeMQController.disableCollection();
        collector.collectEvent(event);
        collector.collectEvent(event);
        Assert.assertEquals(activeMQController.getMessagesDisallowed(), 2);
        Assert.assertEquals(activeMQController.getMessagesSent(), 2);
        Assert.assertEquals(activeMQController.getMessagesRejected(), 2);

        // Re-open the firehose
        activeMQController.enableCollection();
        collector.collectEvent(event);
        collector.collectEvent(event);
        Assert.assertEquals(activeMQController.getMessagesDisallowed(), 2);
        Assert.assertEquals(activeMQController.getMessagesSent(), 4);
        Assert.assertEquals(activeMQController.getMessagesRejected(), 2);
    }

    @Test(groups = "fast")
    public void testCollectFlow() throws Exception
    {
        startCollectorThreads();
        collector.collectEvent(event);
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
        Assert.assertEquals(collector.collectEvent(event), false);
    }

    private void assertEventCounts(int written, int commit)
    {
        Assert.assertEquals(eventWriter.getWrittenEventList().size(), written);
        Assert.assertEquals(eventWriter.getCommittedEventList().size(), commit);
    }

    private void submitEvents(int num)
    {
        for (int i = 0; i < num; i++) {
            Assert.assertEquals(collector.collectEvent(event), true);
        }
    }

    private static class ScheduledCommand
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