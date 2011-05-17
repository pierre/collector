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
import com.google.inject.servlet.GuiceFilter;
import com.ning.http.client.AsyncHttpClient;
import com.ning.http.client.AsyncHttpClientConfig;
import com.ning.metrics.collector.binder.annotations.HdfsEventWriter;
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.endpoint.servers.JettyServer;
import com.ning.metrics.collector.events.processing.BufferingEventCollector;
import com.ning.metrics.serialization.writer.DiskSpoolEventWriter;
import com.ning.metrics.serialization.writer.EventWriter;
import com.ning.metrics.serialization.writer.MockEventWriter;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

@org.testng.annotations.Guice(modules = JettyTestModule.class)
public abstract class TestPublicAPI
{
    private static final Logger log = Logger.getLogger(TestPublicAPI.class);

    @Inject
    CollectorConfig config;

    @Inject
    JettyServer server;

    @Inject
    BufferingEventCollector incomingQueue;

    @Inject
    DiskSpoolEventWriter spooler;

    @Inject
    @HdfsEventWriter
    EventWriter hdfsWriter;

    static final String MEGATRON_2000_USER_AGENT = "NING_MEGATR0N/2000";
    static final String AWESOME_REFERRER_HOST = "mouraf.ning.com";
    static final String AWESOME_REFERRER_PATH = "/unit-test?pass=true&awesome=true";

    final AsyncHttpClientConfig clientConfig = new AsyncHttpClientConfig.Builder()
        .setIdleConnectionInPoolTimeoutInMs(100)
        .setConnectionTimeoutInMs(100)
        .setUserAgent(MEGATRON_2000_USER_AGENT)
        .build();
    final AsyncHttpClient client = new AsyncHttpClient(clientConfig);

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception
    {
        server.start();

        while (!server.isInitialized()) {
            Thread.sleep(100);
        }

        log.info("Test collector initialized");
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception
    {
        server.stop();
        log.info("Test collector stopped");
        client.close();
        log.info("Test http client stopped");

        new GuiceFilter().destroy();
    }

    @AfterMethod(alwaysRun = true)
    public void cleanupState() throws Exception
    {
        ((MockEventWriter) hdfsWriter).getCommittedEventList().clear();
    }

    void assertCleanQueues()
    {
        Assert.assertEquals(incomingQueue.getQueueSize(), 0);
        Assert.assertEquals(spooler.getDiskSpoolSize(), 0);
        Assert.assertEquals(spooler.getQuarantineSize(), 0);
        Assert.assertEquals(0, ((MockEventWriter) hdfsWriter).getWrittenEventList().size());
        Assert.assertEquals(0, ((MockEventWriter) hdfsWriter).getCommittedEventList().size());
        Assert.assertEquals(0, ((MockEventWriter) hdfsWriter).getQuarantinedEventList().size());
    }

    void assertEventWasWrittenToHDFS() throws InterruptedException
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
