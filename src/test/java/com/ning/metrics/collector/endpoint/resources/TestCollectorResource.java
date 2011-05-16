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
import com.ning.http.client.AsyncHttpClientConfig;
import com.ning.http.client.Response;
import com.ning.metrics.collector.binder.annotations.HdfsEventWriter;
import com.ning.metrics.collector.endpoint.OpsAlert;
import com.ning.metrics.collector.endpoint.servers.JettyServer;
import com.ning.metrics.collector.events.processing.BufferingEventCollector;
import com.ning.metrics.collector.util.Ip;
import com.ning.metrics.serialization.event.Event;
import com.ning.metrics.serialization.thrift.ThriftEnvelope;
import com.ning.metrics.serialization.writer.DiskSpoolEventWriter;
import com.ning.metrics.serialization.writer.EventWriter;
import com.ning.metrics.serialization.writer.MockEventWriter;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.transport.TIOStreamTransport;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

@org.testng.annotations.Guice(modules = JettyTestModule.class)
public class TestCollectorResource
{
    @Inject
    private JettyServer server;

    @Inject
    private BufferingEventCollector incomingQueue;

    @Inject
    private DiskSpoolEventWriter spooler;

    @Inject
    @HdfsEventWriter
    private EventWriter hdfsWriter;

    private static final String MEGATRON_2000_USER_AGENT = "NING_MEGATR0N/2000";
    private static final String AWESOME_REFERRER_HOST = "mouraf.ning.com";
    private static final String AWESOME_REFERRER_PATH = "/unit-test?pass=true&awesome=true";

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception
    {
        while (!server.isInitialized()) {
            Thread.sleep(100);
        }
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception
    {
        server.stop();
    }

    // TODO: logging in classes
    // TODO fix /tmp dir tests + cleanup?
    // TODO get rid of flush() in hdfsWriter

    @Test(groups = "slow")
    public void testGetSimpleEvent() throws Exception
    {
        final AsyncHttpClient client = sendGetEvent("/1?v=Hello,sWorld");

        // Check the event written
        final Event event = ((MockEventWriter) hdfsWriter).getCommittedEventList().get(0);
        Assert.assertEquals(event.getName(), "Hello");
        Assert.assertEquals(((ThriftEnvelope) event.getData()).getPayload().get(0).getDataItem().getString(), "World");

        client.close();
    }

    @Test(groups = "slow")
    public void testGetComplicatedEvent() throws Exception
    {
        final long dateTimeBeforeSend = System.currentTimeMillis();
        final AsyncHttpClient client = sendGetEvent("/1?v=ComplicatedEvent,xdate,xhost,xpath,xua,xip,scookie,ssubdomain,sscreename,ssection,b1,b1,b0,81231956164000");
        final long dateTimeAfterSend = System.currentTimeMillis();

        final Event event = ((MockEventWriter) hdfsWriter).getCommittedEventList().get(0);
        Assert.assertEquals(event.getName(), "ComplicatedEvent");
        final long eventDateTime = ((ThriftEnvelope) event.getData()).getPayload().get(0).getDataItem().getLong();
        Assert.assertTrue(eventDateTime > dateTimeBeforeSend);
        Assert.assertTrue(eventDateTime < dateTimeAfterSend);
        Assert.assertEquals(((ThriftEnvelope) event.getData()).getPayload().get(1).getDataItem().getString(), AWESOME_REFERRER_HOST);
        Assert.assertEquals(((ThriftEnvelope) event.getData()).getPayload().get(2).getDataItem().getString(), AWESOME_REFERRER_PATH);
        Assert.assertEquals(((ThriftEnvelope) event.getData()).getPayload().get(3).getDataItem().getString(), MEGATRON_2000_USER_AGENT);
        Assert.assertEquals(((ThriftEnvelope) event.getData()).getPayload().get(4).getDataItem().getInteger(), new Integer(Ip.ipToInt("127.0.0.1")));
        Assert.assertEquals(((ThriftEnvelope) event.getData()).getPayload().get(5).getDataItem().getString(), "cookie");
        Assert.assertEquals(((ThriftEnvelope) event.getData()).getPayload().get(6).getDataItem().getString(), "subdomain");
        Assert.assertEquals(((ThriftEnvelope) event.getData()).getPayload().get(7).getDataItem().getString(), "screename");
        Assert.assertEquals(((ThriftEnvelope) event.getData()).getPayload().get(8).getDataItem().getString(), "section");
        Assert.assertEquals(((ThriftEnvelope) event.getData()).getPayload().get(9).getDataItem().getBoolean(), Boolean.TRUE);
        Assert.assertEquals(((ThriftEnvelope) event.getData()).getPayload().get(10).getDataItem().getBoolean(), Boolean.TRUE);
        Assert.assertEquals(((ThriftEnvelope) event.getData()).getPayload().get(11).getDataItem().getBoolean(), Boolean.FALSE);
        Assert.assertEquals(((ThriftEnvelope) event.getData()).getPayload().get(12).getDataItem().getLong(), new Long(1231956164000L));

        client.close();
    }

    @Test(groups = "slow")
    public void testPostThriftEvent() throws Exception
    {
        final long dateTime = System.currentTimeMillis();
        final OpsAlert alert = new OpsAlert("NAGIOS", "nagios@ning.com", "pierre@ning.com", "Alerting alert", dateTime);
        final ByteArrayOutputStream out = generateThriftPayload(alert);
        final AsyncHttpClient client = sendPostEvent(out, "OpsAlert", null, "ning/thrift");

        final Event event = ((MockEventWriter) hdfsWriter).getCommittedEventList().get(0);
        Assert.assertEquals(event.getName(), "OpsAlert");
        Assert.assertEquals(((ThriftEnvelope) event.getData()).getPayload().get(0).getDataItem().getString(), "NAGIOS");
        Assert.assertEquals(((ThriftEnvelope) event.getData()).getPayload().get(1).getDataItem().getString(), "nagios@ning.com");
        Assert.assertEquals(((ThriftEnvelope) event.getData()).getPayload().get(2).getDataItem().getString(), "pierre@ning.com");
        Assert.assertEquals(((ThriftEnvelope) event.getData()).getPayload().get(3).getDataItem().getString(), "Alerting alert");
        Assert.assertEquals(((ThriftEnvelope) event.getData()).getPayload().get(4).getDataItem().getLong(), new Long(dateTime));

        client.close();
    }

    @Test(groups = "slow")
    public void testPostThriftEventWithDate() throws Exception
    {
        final long dateTime = System.currentTimeMillis();
        final OpsAlert alert = new OpsAlert("NAGIOS", "nagios@ning.com", "pierre@ning.com", "Alerting alert", dateTime);
        final ByteArrayOutputStream out = generateThriftPayload(alert);
        final AsyncHttpClient client = sendPostEvent(out, "OpsAlert", "2009-01-02T03:04:05.006Z", "ning/thrift");

        final Event event = ((MockEventWriter) hdfsWriter).getCommittedEventList().get(0);
        Assert.assertEquals(event.getName(), "OpsAlert");
        Assert.assertEquals(((ThriftEnvelope) event.getData()).getPayload().get(0).getDataItem().getString(), "NAGIOS");
        Assert.assertEquals(((ThriftEnvelope) event.getData()).getPayload().get(1).getDataItem().getString(), "nagios@ning.com");
        Assert.assertEquals(((ThriftEnvelope) event.getData()).getPayload().get(2).getDataItem().getString(), "pierre@ning.com");
        Assert.assertEquals(((ThriftEnvelope) event.getData()).getPayload().get(3).getDataItem().getString(), "Alerting alert");
        // TODO datetime?
        Assert.assertEquals(((ThriftEnvelope) event.getData()).getPayload().get(4).getDataItem().getLong(), new Long(dateTime));

        client.close();
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

    private AsyncHttpClient sendPostEvent(final ByteArrayOutputStream out, final String name, final String dateTime, final String contentType) throws IOException, ExecutionException, InterruptedException
    {
        assertCleanQueues();

        final AsyncHttpClientConfig clientConfig = new AsyncHttpClientConfig.Builder()
            .setUserAgent(MEGATRON_2000_USER_AGENT)
            .build();
        final AsyncHttpClient client = new AsyncHttpClient(clientConfig);
        final AsyncHttpClient.BoundRequestBuilder requestBuilder = client.preparePost("http://127.0.0.1:8080/rest/1.0/event")
            .addHeader("Referer", "http://" + AWESOME_REFERRER_HOST + AWESOME_REFERRER_PATH)
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

        assertEventWasWrittenToHDFS();

        return client;
    }

    private AsyncHttpClient sendGetEvent(final String path) throws InterruptedException, ExecutionException, IOException
    {
        assertCleanQueues();

        final AsyncHttpClientConfig clientConfig = new AsyncHttpClientConfig.Builder()
            .setUserAgent(MEGATRON_2000_USER_AGENT)
            .build();
        final AsyncHttpClient client = new AsyncHttpClient(clientConfig);
        final AsyncHttpClient.BoundRequestBuilder requestBuilder = client.prepareGet("http://127.0.0.1:8080" + path)
            .addHeader("Referer", "http://" + AWESOME_REFERRER_HOST + AWESOME_REFERRER_PATH);

        final Response response = requestBuilder.execute().get();
        Assert.assertEquals(response.getStatusCode(), 202);

        assertEventWasWrittenToHDFS();

        return client;
    }

    private void assertCleanQueues()
    {
        Assert.assertEquals(incomingQueue.getQueueSize(), 0);
        Assert.assertEquals(spooler.getDiskSpoolSize(), 0);
        Assert.assertEquals(spooler.getQuarantineSize(), 0);
        Assert.assertEquals(0, ((MockEventWriter) hdfsWriter).getWrittenEventList().size());
        Assert.assertEquals(0, ((MockEventWriter) hdfsWriter).getCommittedEventList().size());
        Assert.assertEquals(0, ((MockEventWriter) hdfsWriter).getQuarantinedEventList().size());
    }

    private void assertEventWasWrittenToHDFS() throws InterruptedException
    {
        // Give some time for the flushes
        Thread.sleep(2000);

        // Check the spooler is empty
        Assert.assertEquals(incomingQueue.getQueueSize(), 0);
        Assert.assertEquals(spooler.getDiskSpoolSize(), 0);
        Assert.assertEquals(spooler.getQuarantineSize(), 0);

        // Check the event was 'committed' to HDFS
        Assert.assertEquals(0, ((MockEventWriter) hdfsWriter).getWrittenEventList().size());
        Assert.assertEquals(1, ((MockEventWriter) hdfsWriter).getCommittedEventList().size());
        Assert.assertEquals(0, ((MockEventWriter) hdfsWriter).getQuarantinedEventList().size());
    }
}
