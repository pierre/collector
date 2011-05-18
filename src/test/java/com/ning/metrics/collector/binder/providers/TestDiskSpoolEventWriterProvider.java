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

package com.ning.metrics.collector.binder.providers;

import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.util.NamedThreadFactory;
import com.ning.metrics.serialization.event.Event;
import com.ning.metrics.serialization.event.Granularity;
import com.ning.metrics.serialization.event.SmileBucketEvent;
import com.ning.metrics.serialization.event.SmileEnvelopeEvent;
import com.ning.metrics.serialization.smile.JsonStreamToSmileBucketEvent;
import com.ning.metrics.serialization.writer.DiskSpoolEventWriter;
import com.ning.metrics.serialization.writer.MockEventWriter;
import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.smile.SmileFactory;
import org.codehaus.jackson.smile.SmileGenerator;
import org.codehaus.jackson.smile.SmileParser;
import org.joda.time.DateTime;
import org.skife.config.ConfigurationObjectFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

public class TestDiskSpoolEventWriterProvider
{
    private static final Logger log = Logger.getLogger(TestDiskSpoolEventWriterProvider.class);
    private static final String tmpFile = System.getProperty("java.io.tmpdir") + "TestDiskSpoolEventWriterProvider";

    private Event originalEvent;
    private DiskSpoolEventWriter writer;
    private static final Granularity EVENT_GRANULARITY = Granularity.MONTHLY;
    private static final DateTime EVENT_DATE_TIME = new DateTime(2010, 1, 1, 12, 0, 0, 42);
    private static final String EVENT_NAME = "mySmile";
    private final AtomicBoolean testsRun = new AtomicBoolean(false);

    abstract static class TestConfig implements CollectorConfig
    {
        @Override
        public long getFlushIntervalInSeconds()
        {
            return 1;
        }

        @Override
        public String getSpoolDirectoryName()
        {
            return tmpFile;
        }
    }

    @BeforeTest(alwaysRun = true)
    public void setUp() throws IOException
    {
        createSmilePayload();

        final CollectorConfig config = new ConfigurationObjectFactory(System.getProperties()).build(TestConfig.class);

        writer = new DiskSpoolEventWriterProvider(
            new MockEventWriter()
            {
                @Override
                public void write(final Event event) throws IOException
                {
                    try {
                        Assert.assertEquals(event.getClass(), SmileBucketEvent.class);
                        Assert.assertEquals(((SmileBucketEvent) event).getNumberOfEvent(), 5);

                        Assert.assertEquals(event.getName(), originalEvent.getName());
                        Assert.assertEquals(event.getGranularity(), originalEvent.getGranularity());
                        Assert.assertEquals(event.getOutputDir("bleh"), originalEvent.getOutputDir("bleh"));

                        final DateTime eventDateTime = SmileEnvelopeEvent.getEventDateTimeFromJson(((SmileBucketEvent) event).getBucket().get(0));
                        Assert.assertEquals(eventDateTime, EVENT_DATE_TIME);

                        Assert.assertEquals(event.getSerializedEvent(), originalEvent.getSerializedEvent());
                    }
                    finally {
                        testsRun.set(true);
                    }
                }
            },
            new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("spool to HDFS promoter")),
            config
        ).get();
    }

    @AfterTest(alwaysRun = true)
    public void tearDown() throws IOException
    {
        new File(tmpFile).delete();
    }

    @Test(groups = "slow")
    public void testGet() throws Exception
    {
        Assert.assertEquals(writer.getDiskSpoolSize(), 0);

        writer.write(originalEvent); // Goes to disk
        writer.commit();
        //Assert.assertTrue(writer.getDiskSpoolSize() > 0); -- too tiny, less than 1K

        writer.flush(); // Picked up from disk, handed off to handler above
        Assert.assertEquals(writer.getDiskSpoolSize(), 0);

        while (!testsRun.get()) {
            log.info("Tests still running, sleeping...");
            Thread.sleep(100);
        }
    }

    void createSmilePayload() throws IOException
    {
        // Use same configuration as SmileEnvelopeEvent
        final SmileFactory f = new SmileFactory();
        f.configure(SmileGenerator.Feature.CHECK_SHARED_NAMES, true);
        f.configure(SmileGenerator.Feature.CHECK_SHARED_STRING_VALUES, true);
        f.configure(SmileParser.Feature.REQUIRE_HEADER, false);

        final ByteArrayOutputStream stream = new ByteArrayOutputStream();
        final JsonGenerator g = f.createJsonGenerator(stream);

        // Add multiple events in the bucket
        addObject(g, "pierre");
        addObject(g, "tatu");
        addObject(g, "on");
        addObject(g, "a");
        addObject(g, "tree");

        g.close(); // important: will force flushing of output, close underlying output stream

        final Collection<SmileBucketEvent> buckets = JsonStreamToSmileBucketEvent.extractEvent(EVENT_NAME, new ByteArrayInputStream(stream.toByteArray()));

        // This is one BucketEvent with 5 Smile events (the collection return one element because the output paths are the same)
        originalEvent = (SmileBucketEvent) buckets.toArray()[0];
    }

    private void addObject(final JsonGenerator g, final String randomness) throws IOException
    {
        g.writeStartObject();
        g.writeStringField(SmileEnvelopeEvent.SMILE_EVENT_GRANULARITY_TOKEN_NAME, EVENT_GRANULARITY.toString());
        g.writeObjectFieldStart("name");
        g.writeStringField("first", randomness);
        g.writeStringField("last", "Sixpack");
        g.writeEndObject(); // for field 'name'
        g.writeStringField("gender", "MALE");
        g.writeNumberField(SmileEnvelopeEvent.SMILE_EVENT_DATETIME_TOKEN_NAME, EVENT_DATE_TIME.getMillis());
        g.writeBooleanField("verified", false);
        g.writeEndObject();
    }
}
