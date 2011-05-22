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

import com.ning.metrics.collector.MockEvent;
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.serialization.writer.MockEventWriter;
import org.skife.config.ConfigurationObjectFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEventSpoolDispatcher
{
    @Test(groups = "slow")
    public void testShutdown() throws Exception
    {
        final EventSpoolDispatcher dispatcher = new EventSpoolDispatcher(new MockEventWriter(), new WriterStats(), null);
        Assert.assertTrue(dispatcher.isRunning());
        dispatcher.shutdown();
        Assert.assertFalse(dispatcher.isRunning());
    }

    @Test(groups = "fast")
    public void testOffer() throws Exception
    {
        final CollectorConfig collectorConfig = new ConfigurationObjectFactory(System.getProperties()).build(CollectorConfig.class);
        final WriterStats stats = new WriterStats();
        final EventSpoolDispatcher dispatcher = new EventSpoolDispatcher(new MockEventWriter(), stats, collectorConfig);

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
}
