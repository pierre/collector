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
import com.ning.metrics.collector.MockEvent;
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.serialization.writer.MockEventWriter;
import org.testng.Assert;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

@Guice(modules = ConfigTestModule.class)
public class TestEventSpoolDispatcherWithMockWriter
{
    @Inject
    private CollectorConfig collectorConfig;

    @Test(groups = "slow")
    public void testShutdown() throws Exception
    {
        final WriterStats stats = new WriterStats();
        final EventSpoolDispatcher dispatcher = new EventSpoolDispatcher(new MockPersistentWriterFactory(), stats, collectorConfig);
        final MockEvent eventA = new MockEvent();
        eventA.setOutputPath("/a");

        Assert.assertTrue(dispatcher.isRunning());
        Assert.assertEquals(stats.getIgnoredEvents(), 0);

        // Send an event and wait for the dequeuer to work
        dispatcher.offer(eventA);
        Thread.sleep(100);
        final LocalQueueAndWriter writer = (LocalQueueAndWriter) dispatcher.getQueuesPerPath().values().toArray()[0];
        Assert.assertEquals(stats.getIgnoredEvents(), 0);
        Assert.assertEquals(stats.getWrittenEvents(), 1);
        assertWriterQueues(writer, 1, 0, 0, 0);

        // Shutdown and make sure all queues are empty
        dispatcher.shutdown();
        Assert.assertFalse(dispatcher.isRunning());
        Assert.assertEquals(stats.getIgnoredEvents(), 0);
        Assert.assertEquals(stats.getWrittenEvents(), 1);
        assertWriterQueues(writer, 0, 0, 0, 1);

        // Make sure subsequent offers are ignored
        dispatcher.offer(eventA);
        Assert.assertEquals(stats.getIgnoredEvents(), 1);
        Assert.assertEquals(stats.getWrittenEvents(), 1);
        assertWriterQueues(writer, 0, 0, 0, 1);
    }

    @Test(groups = "fast")
    public void testOffer() throws Exception
    {
        final WriterStats stats = new WriterStats();
        final EventSpoolDispatcher dispatcher = new EventSpoolDispatcher(new MockPersistentWriterFactory(), stats, collectorConfig);

        final MockEvent eventA = new MockEvent();
        eventA.setOutputPath("/a");

        final MockEvent eventB = new MockEvent();
        eventB.setOutputPath("/b");

        Assert.assertNull(dispatcher.getQueuesSizes().get("/a"));
        Assert.assertNull(dispatcher.getQueuesSizes().get("/b"));

        dispatcher.offer(eventA);
        Assert.assertNotNull(dispatcher.getQueuesSizes().get("/a"));
        Assert.assertNull(dispatcher.getQueuesSizes().get("/b"));
        Assert.assertEquals(dispatcher.getQueuesSizes().keySet().size(), 1);
        Assert.assertEquals(stats.getEnqueuedEvents(), 1);

        dispatcher.offer(eventB);
        Assert.assertNotNull(dispatcher.getQueuesSizes().get("/a"));
        Assert.assertNotNull(dispatcher.getQueuesSizes().get("/b"));
        Assert.assertEquals(dispatcher.getQueuesSizes().keySet().size(), 2);
        Assert.assertEquals(stats.getEnqueuedEvents(), 2);

        dispatcher.offer(eventA);
        Assert.assertNotNull(dispatcher.getQueuesSizes().get("/a"));
        Assert.assertNotNull(dispatcher.getQueuesSizes().get("/b"));
        Assert.assertEquals(dispatcher.getQueuesSizes().keySet().size(), 2);
        Assert.assertEquals(stats.getEnqueuedEvents(), 3);
    }

    /**
     * @param writer      writer object
     * @param written     number of events written in the current underlying open file
     * @param committed   number of events in the closed file (ready to be flushed)
     * @param quarantined number of events unable to be committed
     * @param flushed     number of events sent remotely (written to HDFS)
     */
    private void assertWriterQueues(final LocalQueueAndWriter writer, final int written, final int committed, final int quarantined, final int flushed)
    {
        final MockEventWriter eventWriter = (MockEventWriter) writer.getEventWriter();
        Assert.assertEquals(eventWriter.getWrittenEventList().size(), written);
        Assert.assertEquals(eventWriter.getCommittedEventList().size(), committed);
        Assert.assertEquals(eventWriter.getQuarantinedEventList().size(), quarantined);
        Assert.assertEquals(eventWriter.getFlushedEventList().size(), flushed);
    }
}
