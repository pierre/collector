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

package com.ning.metrics.collector.endpoint.resources;

import com.google.inject.Inject;
import com.ning.http.client.AsyncHttpClient;
import com.ning.http.client.Response;
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.endpoint.servers.JettyServer;
import com.ning.metrics.collector.hadoop.processing.BufferingEventCollector;
import com.ning.metrics.collector.util.Ip;
import com.ning.metrics.serialization.event.Event;
import com.ning.metrics.serialization.thrift.ThriftEnvelope;
import com.ning.metrics.serialization.thrift.ThriftField;
import com.ning.metrics.serialization.writer.MockEventWriter;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

@Test(groups = "slow", singleThreaded = true)
@Guice(modules = JettyTestModule.class)
public class TestCollectorResource extends TestPublicAPI
{
    @Inject
    CollectorConfig config;

    @Inject
    JettyServer server;

    @Inject
    BufferingEventCollector incomingQueue;

    @Inject
    MockEventWriter hdfsWriter;

    @BeforeClass
    public void setup() throws Exception
    {
        super.setUp(server);
    }

    @AfterClass
    public void tearDown() throws Exception
    {
        super.tearDown(server);
    }

    public void testGetSimpleEvent() throws Exception
    {
        final Event event = sendGetEvent("/1?v=Hello,sWorld");

        Assert.assertEquals(event.getName(), "Hello");

        final List<ThriftField> payload = ((ThriftEnvelope) event.getData()).getPayload();
        Assert.assertEquals(payload.get(0).getDataItem().getString(), "World");
    }

    public void testGetComplicatedEvent() throws Exception
    {
        // TODO datetime?
        final long dateTimeBeforeSend = System.currentTimeMillis();
        final Event event = sendGetEvent("/1?v=ComplicatedEvent,xdate,xhost,xpath,xua,xip,scookie,ssubdomain,sscreename,ssection,b1,b1,b0,81231956164000");
        final long dateTimeAfterSend = System.currentTimeMillis();

        Assert.assertEquals(event.getName(), "ComplicatedEvent");

        final List<ThriftField> payload = ((ThriftEnvelope) event.getData()).getPayload();

        final long eventDateTime = payload.get(0).getDataItem().getLong();
        Assert.assertTrue(eventDateTime > dateTimeBeforeSend);
        Assert.assertTrue(eventDateTime < dateTimeAfterSend);

        Assert.assertEquals(payload.get(1).getDataItem().getString(), AWESOME_REFERRER_HOST);
        Assert.assertEquals(payload.get(2).getDataItem().getString(), AWESOME_REFERRER_PATH);
        Assert.assertEquals(payload.get(3).getDataItem().getString(), MEGATRON_2000_USER_AGENT);
        Assert.assertEquals(payload.get(4).getDataItem().getInteger(), new Integer(Ip.ipToInt("127.0.0.1")));
        Assert.assertEquals(payload.get(5).getDataItem().getString(), "cookie");
        Assert.assertEquals(payload.get(6).getDataItem().getString(), "subdomain");
        Assert.assertEquals(payload.get(7).getDataItem().getString(), "screename");
        Assert.assertEquals(payload.get(8).getDataItem().getString(), "section");
        Assert.assertEquals(payload.get(9).getDataItem().getBoolean(), Boolean.TRUE);
        Assert.assertEquals(payload.get(10).getDataItem().getBoolean(), Boolean.TRUE);
        Assert.assertEquals(payload.get(11).getDataItem().getBoolean(), Boolean.FALSE);
        Assert.assertEquals(payload.get(12).getDataItem().getLong(), new Long(1231956164000L));
    }

    private Event sendGetEvent(final String path) throws InterruptedException, ExecutionException, IOException
    {
        assertCleanQueues(incomingQueue);

        final AsyncHttpClient.BoundRequestBuilder requestBuilder = client.prepareGet("http://127.0.0.1:" + config.getLocalPort() + path)
            .addHeader("Referer", "http://" + AWESOME_REFERRER_HOST + AWESOME_REFERRER_PATH);

        final Response response = requestBuilder.execute().get();
        Assert.assertEquals(response.getStatusCode(), 202);

        return assertEventWasWrittenToHDFS(incomingQueue, hdfsWriter);
    }
}
