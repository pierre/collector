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

package com.ning.metrics.collector.endpoint.extractors;

import com.ning.metrics.collector.endpoint.MockHttpHeaders;
import com.ning.metrics.collector.endpoint.ParsedRequest;
import com.ning.metrics.serialization.event.Event;
import com.ning.metrics.serialization.event.ThriftEnvelopeEvent;
import com.ning.metrics.serialization.thrift.ThriftEnvelope;
import com.ning.metrics.serialization.thrift.ThriftField;
import com.ning.metrics.serialization.thrift.ThriftFieldListSerializer;
import org.apache.thrift.TException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.ws.rs.WebApplicationException;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;

public class TestBodyEventExtractor
{
    private BodyEventExtractor extractor = null;
    private ArrayList<ThriftField> data = null;
    private String eventType = null;
    private byte[] payload = null;
    private int payloadSize = 0;

    @BeforeMethod(alwaysRun = true)
    void setup() throws TException, org.apache.thrift.TException
    {
        extractor = new BodyEventExtractor();
        ThriftFieldListSerializer serializer = new ThriftFieldListSerializer();

        data = new ArrayList<ThriftField>();
        data.add(ThriftField.createThriftField("Fuu", (short) 1));
        data.add(ThriftField.createThriftField(true, (short) 2));
        data.add(ThriftField.createThriftField(3.1459, (short) 3));
        data.add(ThriftField.createThriftField(10001000000L, (short) 4));

        payload = serializer.createPayload(data);
        payloadSize = payload.length;

        eventType = "FuuEvent";
    }

    @Test(groups = "fast")
    public void testValidRequest() throws Exception
    {
        ParsedRequest validRequest = new ParsedRequest(
            eventType,
            new MockHttpHeaders("http://appname.ning.com/path", "my-user-agent", "10.11.12.13", payloadSize),
            new ByteArrayInputStream(payload),
            null,
            null,
            null
        );
        Collection<? extends Event> events = extractor.extractEvent(validRequest);

        for (Event event : events) {
            Assert.assertEquals(event.getClass(), ThriftEnvelopeEvent.class);
            ThriftEnvelopeEvent thriftEnvelopeEvent = (ThriftEnvelopeEvent) event;

            Assert.assertEquals(thriftEnvelopeEvent.getName(), eventType);
            ThriftEnvelope envelope = (ThriftEnvelope) thriftEnvelopeEvent.getData();
            Assert.assertEquals(envelope.getTypeName(), eventType);
            Assert.assertEquals(envelope.getPayload(), data);
        }
    }

    @Test(groups = "fast")
    public void testValidRequestWithRoute() throws Exception
    {
        ParsedRequest routedRequest = new ParsedRequest(
            eventType,
            new MockHttpHeaders("http://appname.ning.com/path", "my-user-agent", "10.11.12.13", payloadSize),
            new ByteArrayInputStream(payload),
            null,
            null,
            null
        );

        Collection<? extends Event> events = extractor.extractEvent(routedRequest);

        for (Event event : events) {
            Assert.assertEquals(event.getClass(), ThriftEnvelopeEvent.class);
            ThriftEnvelopeEvent thriftEnvelopeEvent = (ThriftEnvelopeEvent) event;

            Assert.assertEquals(thriftEnvelopeEvent.getName(), eventType);
            ThriftEnvelope envelope = (ThriftEnvelope) thriftEnvelopeEvent.getData();
            Assert.assertEquals(envelope.getTypeName(), eventType);
            Assert.assertEquals(envelope.getPayload(), data);
        }
    }

    @Test(groups = "fast")
    public void testNoNameParameter() throws Exception
    {
        try {
            ParsedRequest missingNameRequest = new ParsedRequest(
                null,
                new MockHttpHeaders(null, null, null, payloadSize),
                null,
                null,
                null,
                null
            );
            Assert.fail();
        }
        catch (WebApplicationException e) {
            Assert.assertTrue(true);
        }
    }

    @Test(groups = "fast")
    public void testGetInputThrowsIOException() throws Exception
    {
        ParsedRequest throwsIOExceptionRequest = new ParsedRequest(
            eventType,
            new MockHttpHeaders("http://appname.ning.com/path", "my-user-agent", "10.11.12.13", payloadSize),
            null,
            null,
            null,
            null
        );

        try {
            extractor.extractEvent(throwsIOExceptionRequest);
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
            eventType,
            new MockHttpHeaders("http://appname.ning.com/path", "my-user-agent", "10.11.12.13"),
            new ByteArrayInputStream(invalidBytes),
            null,
            null,
            null
        );

        try {
            extractor.extractEvent(throwsParseExceptionRequest);
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
            eventType,
            new MockHttpHeaders("http://appname.ning.com/path", "my-user-agent", "10.11.12.13", null),
            new ByteArrayInputStream(payload),
            null,
            null,
            null
        );

        try {
            extractor.extractEvent(invalidContentTypeRequest);
            Assert.fail("expected exception");
        }
        catch (Exception e) {
            Assert.assertEquals(e.getClass(), EventParsingException.class);
        }
    }

    @Test(groups = "fast")
    public void testManuallySetIp() throws Exception
    {
        MockHttpHeaders headers = new MockHttpHeaders("http://appname.ning.com/path", "my-user-agent", null, payloadSize);

        ParsedRequest request = new ParsedRequest(
            eventType,
            headers,
            new ByteArrayInputStream(payload),
            null,
            null,
            "1.2.3.4"
        );

        Assert.assertEquals(request.getIpAddress(), "1.2.3.4");
    }
}
