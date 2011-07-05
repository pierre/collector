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
import com.ning.metrics.collector.endpoint.OpsAlert;
import com.ning.metrics.collector.endpoint.servers.JettyServer;
import com.ning.metrics.collector.hadoop.processing.BufferingEventCollector;
import com.ning.metrics.serialization.event.Event;
import com.ning.metrics.serialization.thrift.ThriftEnvelope;
import com.ning.metrics.serialization.thrift.ThriftField;
import com.ning.metrics.serialization.writer.MockEventWriter;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.transport.TIOStreamTransport;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;


@Test(groups = "slow", singleThreaded = true, enabled = false)
@Guice(modules = JettyTestModule.class)
public class TestBodyResource extends TestPublicAPI
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

    public void testPostThriftEvent() throws Exception
    {
        final long dateTime = System.currentTimeMillis();
        final OpsAlert alert = new OpsAlert("NAGIOS", "nagios@ning.com", "pierre@ning.com", "Alerting alert", dateTime);
        final ByteArrayOutputStream out = generateThriftPayload(alert);
        final Event event = sendPostEvent(out, "OpsAlert", null, "ning/thrift");

        Assert.assertEquals(event.getName(), "OpsAlert");

        final List<ThriftField> payload = ((ThriftEnvelope) event.getData()).getPayload();

        Assert.assertEquals(payload.get(0).getDataItem().getString(), "NAGIOS");
        Assert.assertEquals(payload.get(1).getDataItem().getString(), "nagios@ning.com");
        Assert.assertEquals(payload.get(2).getDataItem().getString(), "pierre@ning.com");
        Assert.assertEquals(payload.get(3).getDataItem().getString(), "Alerting alert");
        Assert.assertEquals(payload.get(4).getDataItem().getLong(), new Long(dateTime));
    }

    public void testPostThriftEventWithDate() throws Exception
    {
        final long dateTime = System.currentTimeMillis();
        final OpsAlert alert = new OpsAlert("NAGIOS", "nagios@ning.com", "pierre@ning.com", "Alerting alert", dateTime);
        final ByteArrayOutputStream out = generateThriftPayload(alert);
        final Event event = sendPostEvent(out, "OpsAlert", "2009-01-02T03:04:05.006Z", "ning/thrift");

        Assert.assertEquals(event.getName(), "OpsAlert");

        final List<ThriftField> payload = ((ThriftEnvelope) event.getData()).getPayload();

        Assert.assertEquals(payload.get(0).getDataItem().getString(), "NAGIOS");
        Assert.assertEquals(payload.get(1).getDataItem().getString(), "nagios@ning.com");
        Assert.assertEquals(payload.get(2).getDataItem().getString(), "pierre@ning.com");
        Assert.assertEquals(payload.get(3).getDataItem().getString(), "Alerting alert");
        // TODO datetime?
        Assert.assertEquals(payload.get(4).getDataItem().getLong(), new Long(dateTime));
    }

    private ByteArrayOutputStream generateThriftPayload(final OpsAlert alert) throws org.apache.thrift.TException, IOException
    {
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final TBinaryProtocol protocol = new TBinaryProtocol(new TIOStreamTransport(out));
        alert.write(protocol);
        out.flush();
        out.close();
        return out;
    }

    private Event sendPostEvent(final ByteArrayOutputStream out, final String name, final String dateTime, final String contentType) throws IOException, ExecutionException, InterruptedException
    {
        assertCleanQueues(incomingQueue);

        final AsyncHttpClient.BoundRequestBuilder requestBuilder = client.preparePost("http://127.0.0.1:" + config.getLocalPort() + "/rest/1.0/event")
            .addHeader("Content-Type", contentType)
            .setBody(out.toByteArray());
        if (name != null) {
            requestBuilder.addQueryParameter("name", name);
        }
        if (dateTime != null) {
            requestBuilder.addQueryParameter("date", dateTime);
        }

        final Response response = requestBuilder.execute().get();
        Assert.assertEquals(response.getStatusCode(), 202);

        return assertEventWasWrittenToHDFS(incomingQueue, hdfsWriter);
    }
}
