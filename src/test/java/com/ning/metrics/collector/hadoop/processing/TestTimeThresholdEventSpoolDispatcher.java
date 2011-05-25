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
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.hadoop.writer.FileSystemAccess;
import com.ning.metrics.collector.hadoop.writer.HdfsModule;
import com.ning.metrics.collector.realtime.RealTimeQueueTestModule;
import com.ning.metrics.serialization.event.Event;
import com.ning.metrics.serialization.event.ThriftEnvelopeEvent;
import com.ning.metrics.serialization.thrift.ThriftEnvelope;
import com.ning.metrics.serialization.thrift.ThriftField;
import org.joda.time.DateTime;
import org.testng.Assert;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

@Guice(modules = {ConfigTestModule.class, EventCollectorModule.class, HdfsModule.class, RealTimeQueueTestModule.class})
public class TestTimeThresholdEventSpoolDispatcher
{
    @Inject
    CollectorConfig collectorConfig;

    @Inject
    EventSpoolDispatcher dispatcher;

    @Inject
    FileSystemAccess hdfsAccess;

    @Test(groups = "slow")
    public void testFlushTimeThreshold() throws Exception
    {
        final List<ThriftField> fields = new ArrayList<ThriftField>();
        fields.add(ThriftField.createThriftField("hello", (short) 1));
        final ThriftEnvelope envelope = new ThriftEnvelope("MockEvent", fields);
        final Event eventA = new ThriftEnvelopeEvent(new DateTime(), envelope);

        // Send an event and wait for the dequeuer to work
        dispatcher.offer(eventA);
        Thread.sleep(200);
        Assert.assertEquals(dispatcher.getStats().getWrittenEvents(), 1);
        Assert.assertEquals(dispatcher.getStats().getHdfsFlushes(), 0);

        // Send another event and wait for the dequeuer to work. The threshold being two in FastCollectorConfig,
        // we should not have triggered a commit yet, however, since we waited for more than 1 second (time threshold),
        // it will trigger a flush.
        Thread.sleep(900);
        dispatcher.offer(eventA);
        Thread.sleep(1500);
        Assert.assertEquals(dispatcher.getStats().getWrittenEvents(), 2);
        Assert.assertEquals(dispatcher.getStats().getHdfsFlushes(), 1);

        // We now cross the size threshold, it will flush again
        dispatcher.offer(eventA);
        Thread.sleep(1500);
        Assert.assertEquals(dispatcher.getStats().getWrittenEvents(), 3);
        Assert.assertEquals(dispatcher.getStats().getHdfsFlushes(), 2);
    }
}
