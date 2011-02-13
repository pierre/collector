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

package com.ning.metrics.collector.endpoint;

import com.ning.metrics.collector.endpoint.resources.ScribeEventRequestHandler;
import com.ning.metrics.serialization.event.Granularity;
import com.ning.metrics.serialization.event.SmileBucketEvent;
import com.ning.metrics.serialization.event.SmileEnvelopeEvent;
import com.ning.metrics.serialization.smile.SmileBucket;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.smile.SmileFactory;
import org.codehaus.jackson.smile.SmileGenerator;
import org.codehaus.jackson.smile.SmileParser;
import org.joda.time.DateTime;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import scribe.thrift.LogEntry;
import scribe.thrift.ResultCode;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestScribeEventRequestHandler
{
    private EventEndPointStats stats = null;
    private MockScribeEventHandler eventHandler = null;
    private ScribeEventRequestHandler eventRequestHandler = null;

    private static final String EVENT_NAME = "myMsg";
    private static final DateTime EVENT_DATE_TIME = new DateTime();
    private final String THRIFT_MSG = String.format("%s:msg", EVENT_DATE_TIME.getMillis());

    @BeforeMethod(alwaysRun = true)
    void setup()
    {
        stats = new EventEndPointStats(5);
        eventHandler = new MockScribeEventHandler(stats);
        eventRequestHandler = new ScribeEventRequestHandler(eventHandler);
    }

    @Test(groups = "fast")
    public void testSmileSuccess() throws Exception
    {
        SmileBucketEvent smileEvent = createSmileBucketEvent();

        // See ScribeSender in com.ning:metrics.eventtracker
        List<LogEntry> logEntries = new ArrayList<LogEntry>();
        logEntries.add(new LogEntry(EVENT_NAME, new String(smileEvent.getSerializedEvent(), SmileEnvelopeEvent.CHARSET)));

        Assert.assertEquals(eventRequestHandler.Log(logEntries), ResultCode.OK);
        Assert.assertEquals(eventHandler.getProcessedEventList().size(), 1);
        Assert.assertEquals(eventHandler.getProcessedEventList().get(0).getName(), EVENT_NAME);
        Assert.assertEquals(stats.getTotalEvents(), 1);
        Assert.assertEquals(stats.getSuccessfulParseEvents(), 1);
        Assert.assertEquals(stats.getFailedToParseEvents(), 0);
    }

    @Test(groups = "fast")
    public void testSuccess() throws Exception
    {
        List<LogEntry> logEntries = new ArrayList<LogEntry>();
        logEntries.add(new LogEntry(EVENT_NAME, THRIFT_MSG));
        Assert.assertEquals(eventRequestHandler.Log(logEntries), ResultCode.OK);

        Assert.assertEquals(eventHandler.getProcessedEventList().size(), 1);
        Assert.assertEquals(eventHandler.getProcessedEventList().get(0).getName(), EVENT_NAME);
        Assert.assertEquals(stats.getTotalEvents(), 1);
        Assert.assertEquals(stats.getSuccessfulParseEvents(), 1);
        Assert.assertEquals(stats.getFailedToParseEvents(), 0);
    }

    @Test(groups = "fast")
    public void testUnsupportedEvent() throws Exception
    {
        List<LogEntry> logEntries = new ArrayList<LogEntry>();
        logEntries.add(new LogEntry(EVENT_NAME, "msg"));
        Assert.assertEquals(eventRequestHandler.Log(logEntries), ResultCode.OK);

        Assert.assertEquals(eventHandler.getProcessedEventList().size(), 0);
        Assert.assertEquals(stats.getTotalEvents(), 1);
        Assert.assertEquals(stats.getSuccessfulParseEvents(), 0);
        Assert.assertEquals(stats.getFailedToParseEvents(), 1);
    }

    @Test(groups = "fast")
    public void testCollectorFailure() throws Exception
    {
        eventHandler.setFakeCollectorFailure(true);
        List<LogEntry> logEntries = new ArrayList<LogEntry>();
        logEntries.add(new LogEntry(EVENT_NAME, null));
        Assert.assertEquals(eventRequestHandler.Log(logEntries), ResultCode.OK);

        Assert.assertEquals(eventHandler.isHandleFailureCalled(), true);
        Assert.assertEquals(eventHandler.getProcessedEventList().size(), 0);
        Assert.assertEquals(stats.getTotalEvents(), 1);
        Assert.assertEquals(stats.getSuccessfulParseEvents(), 0);
        Assert.assertEquals(stats.getFailedToParseEvents(), 1);
        Assert.assertEquals(stats.getRejectedEvents(), 0);
    }

    private SmileBucketEvent createSmileBucketEvent() throws IOException
    {
        SmileBucket nodes = new SmileBucket();
        for (int i = 0; i < 5; i++) {
            nodes.add((JsonNode) createSmileEvent().getData());
        }

        return new SmileBucketEvent(EVENT_NAME, Granularity.HOURLY, nodes);
    }

    private SmileEnvelopeEvent createSmileEvent() throws IOException
    {
        // Use same configuration as SmileEnvelopeEvent
        SmileFactory f = new SmileFactory();
        f.configure(SmileGenerator.Feature.CHECK_SHARED_NAMES, true);
        f.configure(SmileGenerator.Feature.CHECK_SHARED_STRING_VALUES, true);
        f.configure(SmileParser.Feature.REQUIRE_HEADER, false);

        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        JsonGenerator g = f.createJsonGenerator(stream);

        g.writeStartObject();
        g.writeStringField(SmileEnvelopeEvent.SMILE_EVENT_GRANULARITY_TOKEN_NAME, Granularity.HOURLY.toString());
        g.writeObjectFieldStart("name");
        g.writeStringField("first", "Joe");
        g.writeStringField("last", "Sixpack");
        g.writeEndObject(); // for field 'name'
        g.writeStringField("gender", "MALE");
        g.writeNumberField(SmileEnvelopeEvent.SMILE_EVENT_DATETIME_TOKEN_NAME, EVENT_DATE_TIME.getMillis());
        g.writeBooleanField("verified", false);
        g.writeEndObject();
        g.close(); // important: will force flushing of output, close underlying output stream

        return new SmileEnvelopeEvent(EVENT_NAME, stream.toByteArray(), EVENT_DATE_TIME, Granularity.HOURLY);
    }
}
