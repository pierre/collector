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

package com.ning.metrics.collector.endpoint;

import com.ning.metrics.collector.endpoint.extractors.BodyEventExtractor;
import com.ning.serialization.DataItemFactory;
import com.ning.serialization.ThriftEnvelope;
import com.ning.serialization.ThriftFieldImpl;
import com.ning.serialization.ThriftFieldListSerializer;
import org.apache.thrift.TException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ning.metrics.collector.events.Event;
import com.ning.metrics.collector.events.data.ThriftEnvelopeEvent;
import com.ning.metrics.collector.events.parsing.EventExtractorUtilImpl;
import com.ning.metrics.collector.events.parsing.EventParsingException;
import com.ning.metrics.collector.events.parsing.ParsedRequest;

import java.io.ByteArrayInputStream;

public class TestInternalEventExtractor
{
    private BodyEventExtractor extractor = null;
    private ThriftFieldList data = null;
    private String eventType = null;
    private byte[] payload = null;
    private int payloadSize = 0;

    @BeforeMethod(alwaysRun = true)
    void setup() throws TException, org.apache.thrift.TException
    {
        extractor = new BodyEventExtractor();
        ThriftFieldListSerializer serializer = new ThriftFieldListSerializer();

        data = new ThriftFieldList();
        data.add(new ThriftFieldImpl(DataItemFactory.create("fuu"), (short) 1));
        data.add(new ThriftFieldImpl(DataItemFactory.create(true), (short) 2));
        data.add(new ThriftFieldImpl(DataItemFactory.create(3.1459), (short) 2));
        data.add(new ThriftFieldImpl(DataItemFactory.create(10001000000L), (short) 3));

        payload = serializer.createPayload(data);
        payloadSize = payload.length;

        eventType = "FuuEvent";
    }

    @Test(groups = "fast")
    public void testValidRequest() throws Exception
    {
        ParsedRequest validRequest = new ParsedRequest(
            new MockHttpHeaders("http://appname.ning.com/path", "my-user-agent", "10.11.12.13", payloadSize),
            new ByteArrayInputStream(payload),
            null,
            null,
            new EventExtractorUtilImpl()
        );
        Event event = extractor.extractEvent(eventType, validRequest);

        Assert.assertEquals(event.getClass(), ThriftEnvelopeEvent.class);
        ThriftEnvelopeEvent thriftEnvelopeEvent = (ThriftEnvelopeEvent) event;

        Assert.assertEquals(thriftEnvelopeEvent.getName(), eventType);
        ThriftEnvelope envelope = (ThriftEnvelope) thriftEnvelopeEvent.getData();
        Assert.assertEquals(envelope.getTypeName(), eventType);
        Assert.assertEquals(envelope.getPayload(), data);
    }

    @Test(groups = "fast")
    public void testValidRequestWithRoute() throws Exception
    {
        ParsedRequest routedRequest = new ParsedRequest(
            new MockHttpHeaders("http://appname.ning.com/path", "my-user-agent", "10.11.12.13", payloadSize),
            new ByteArrayInputStream(payload),
            null,
            null,
            new EventExtractorUtilImpl()
        );

        Event event = extractor.extractEvent(eventType, routedRequest);

        Assert.assertEquals(event.getClass(), ThriftEnvelopeEvent.class);
        ThriftEnvelopeEvent thriftEnvelopeEvent = (ThriftEnvelopeEvent) event;

        Assert.assertEquals(thriftEnvelopeEvent.getName(), eventType);
        ThriftEnvelope envelope = (ThriftEnvelope) thriftEnvelopeEvent.getData();
        Assert.assertEquals(envelope.getTypeName(), eventType);
        Assert.assertEquals(envelope.getPayload(), data);
    }

    @Test(groups = "fast")
    public void testNoNameParameter() throws Exception
    {
        ParsedRequest missingNameRequest = new ParsedRequest(
            new MockHttpHeaders(null, null, null, payloadSize),
            null,
            null,
            null,
            new EventExtractorUtilImpl()
        );
        Assert.assertEquals(extractor.extractEvent(null, missingNameRequest), null);
    }

    @Test(groups = "fast")
    public void testGetInputThrowsIOException() throws Exception
    {
        ParsedRequest throwsIOExceptionRequest = new ParsedRequest(
            new MockHttpHeaders("http://appname.ning.com/path", "my-user-agent", "10.11.12.13", payloadSize),
            null,
            null,
            null,
            new EventExtractorUtilImpl()
        );

        try {
            extractor.extractEvent(eventType, throwsIOExceptionRequest);
            Assert.fail("expected exception");
        }
        catch (Exception e) {
            Assert.assertEquals(e.getClass(), EventParsingException.class);
        }
    }

    @Test(groups = "fast")
    public void testGetInputThrowsParseException() throws Exception
    {
        byte[] invalidBytes = {1, 2, 3};
        ParsedRequest throwsParseExceptionRequest = new ParsedRequest(
            new MockHttpHeaders("http://appname.ning.com/path", "my-user-agent", "10.11.12.13"),
            new ByteArrayInputStream(invalidBytes),
            null,
            null,
            new EventExtractorUtilImpl()
        );

        try {
            extractor.extractEvent(eventType, throwsParseExceptionRequest);
            Assert.fail("expected exception");
        }
        catch (Exception e) {
            Assert.assertEquals(e.getClass(), EventParsingException.class);
        }
    }

    @Test(groups = "fast")
    public void testInvalidContentType() throws Exception
    {
        ParsedRequest invalidContentTypeRequest = new ParsedRequest(
            new MockHttpHeaders("http://appname.ning.com/path", "my-user-agent", "10.11.12.13", null),
            new ByteArrayInputStream(payload),
            null,
            null,
            new EventExtractorUtilImpl()
        );

        try {
            extractor.extractEvent(eventType, invalidContentTypeRequest);
            Assert.fail("expected exception");
        }
        catch (Exception e) {
            Assert.assertEquals(e.getClass(), EventParsingException.class);
        }
    }
}