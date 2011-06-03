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

import com.ning.metrics.collector.endpoint.ExtractedAnnotation;
import com.ning.metrics.collector.events.parsing.ThriftEnvelopeEventParser;
import com.ning.metrics.collector.events.parsing.converters.Base64NumberConverter;
import com.ning.metrics.collector.events.parsing.converters.DecimalNumberConverter;
import com.ning.metrics.collector.util.Ip;
import com.ning.metrics.serialization.event.Granularity;
import com.ning.metrics.serialization.event.ThriftEnvelopeEvent;
import com.ning.metrics.serialization.thrift.ThriftEnvelope;
import org.joda.time.DateTime;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.InputStream;

public class TestThriftEnvelopeEventParser
{
    private ThriftEnvelopeEventParser base10Parser = null;
    private ThriftEnvelopeEventParser base64Parser = null;
    private ExtractedAnnotation annotation = null;

    @BeforeMethod(alwaysRun = true)
    void setup()
    {
        base10Parser = new ThriftEnvelopeEventParser(new DecimalNumberConverter());
        base64Parser = new ThriftEnvelopeEventParser(new Base64NumberConverter()); //TODO: test this
        annotation = createDefaultAnnotation();
    }

    @Test(groups = "fast")
    public void testBase64Parsing() throws Exception
    {
        final ThriftEnvelope result = parseThriftEnvelopeBase64("event-name", "sstring,b0,b1,100,2A0,4B0B0,8C0C0C0,d3.1459");

        Assert.assertEquals(result.getPayload().size(), 8);
        Assert.assertEquals(result.getPayload().get(0).getDataItem().getString(), "string");
        Assert.assertEquals(result.getPayload().get(1).getDataItem().getBoolean(), Boolean.FALSE);
        Assert.assertEquals(result.getPayload().get(2).getDataItem().getBoolean(), Boolean.TRUE);
        Assert.assertEquals(result.getPayload().get(3).getDataItem().getByte(), Byte.valueOf((byte) 65));
        Assert.assertEquals(result.getPayload().get(4).getDataItem().getShort(), Short.valueOf((short) 705));
        Assert.assertEquals(result.getPayload().get(5).getDataItem().getInteger(), Integer.valueOf(3150593));
        Assert.assertEquals(result.getPayload().get(6).getDataItem().getLong(), Long.valueOf(13978833729L));
        Assert.assertEquals(result.getPayload().get(7).getDataItem().getDouble(), 3.1459);
    }

    @Test(groups = "fast")
    public void testParseBoolean() throws Exception
    {
        final ThriftEnvelope result = parseThriftEnvelopeBase10("event-name", "b0,b1,b0");

        Assert.assertEquals(result.getPayload().size(), 3);
        Assert.assertEquals(result.getTypeName(), "event-name");
        Assert.assertEquals(result.getPayload().get(0).getDataItem().getBoolean(), Boolean.FALSE);
        Assert.assertEquals(result.getPayload().get(1).getDataItem().getBoolean(), Boolean.TRUE);
        Assert.assertEquals(result.getPayload().get(2).getDataItem().getBoolean(), Boolean.FALSE);

        testParseFail("event-name", "b2");
        testParseFail("event-name", "b-2");
        testParseFail("event-name", "ba-string");
    }

    @Test(groups = "fast")
    public void testParseByte() throws Exception
    {
        final ThriftEnvelope result = parseThriftEnvelopeBase10("event-name", "11,12,1127,1-128");

        Assert.assertEquals(result.getPayload().size(), 4);
        Assert.assertEquals(result.getTypeName(), "event-name");
        Assert.assertEquals(result.getPayload().get(0).getDataItem().getByte(), Byte.valueOf((byte) 1));
        Assert.assertEquals(result.getPayload().get(1).getDataItem().getByte(), Byte.valueOf((byte) 2));
        Assert.assertEquals(result.getPayload().get(2).getDataItem().getByte(), Byte.valueOf((byte) 127));
        Assert.assertEquals(result.getPayload().get(3).getDataItem().getByte(), Byte.valueOf((byte) -128));

        testParseFail("event-name", "1128");
        testParseFail("event-name", "1-129");
        testParseFail("event-name", "1a-string");
    }

    @Test(groups = "fast")
    public void testParseShort() throws Exception
    {
        final ThriftEnvelope result = parseThriftEnvelopeBase10("event-name", "21,22,2127,2-128,232767,2-32768");

        Assert.assertEquals(result.getPayload().size(), 6);
        Assert.assertEquals(result.getTypeName(), "event-name");
        Assert.assertEquals(result.getPayload().get(0).getDataItem().getShort(), Short.valueOf((short) 1));
        Assert.assertEquals(result.getPayload().get(1).getDataItem().getShort(), Short.valueOf((short) 2));
        Assert.assertEquals(result.getPayload().get(2).getDataItem().getShort(), Short.valueOf((short) 127));
        Assert.assertEquals(result.getPayload().get(3).getDataItem().getShort(), Short.valueOf((short) -128));
        Assert.assertEquals(result.getPayload().get(4).getDataItem().getShort(), Short.valueOf((short) 32767));
        Assert.assertEquals(result.getPayload().get(5).getDataItem().getShort(), Short.valueOf((short) -32768));

        testParseFail("event-name", "232768");
        testParseFail("event-name", "2-32769");
        testParseFail("event-name", "2a-string");
    }

    @Test(groups = "fast")
    public void testParseInteger() throws Exception
    {
        final ThriftEnvelope result = parseThriftEnvelopeBase10("event-name", "41,42,4127,4-128,432767,4-32768,42147483647,4-2147483648");

        Assert.assertEquals(result.getPayload().size(), 8);
        Assert.assertEquals(result.getTypeName(), "event-name");
        Assert.assertEquals(result.getPayload().get(0).getDataItem().getInteger(), Integer.valueOf(1));
        Assert.assertEquals(result.getPayload().get(1).getDataItem().getInteger(), Integer.valueOf(2));
        Assert.assertEquals(result.getPayload().get(2).getDataItem().getInteger(), Integer.valueOf(127));
        Assert.assertEquals(result.getPayload().get(3).getDataItem().getInteger(), Integer.valueOf(-128));
        Assert.assertEquals(result.getPayload().get(4).getDataItem().getInteger(), Integer.valueOf(32767));
        Assert.assertEquals(result.getPayload().get(5).getDataItem().getInteger(), Integer.valueOf(-32768));
        Assert.assertEquals(result.getPayload().get(6).getDataItem().getInteger(), Integer.valueOf(2147483647));
        Assert.assertEquals(result.getPayload().get(7).getDataItem().getInteger(), Integer.valueOf(-2147483648));

        testParseFail("event-name", "42147483648");
        testParseFail("event-name", "4-2147483649");
        testParseFail("event-name", "4a-string");
    }

    @Test(groups = "fast")
    public void testParseLong() throws Exception
    {
        final ThriftEnvelope result = parseThriftEnvelopeBase10("event-name", "81,82,8127,8-128,432767,8-32768,82147483647,8-2147483648,810000000000,8-20000000000");

        Assert.assertEquals(result.getPayload().size(), 10);
        Assert.assertEquals(result.getTypeName(), "event-name");
        Assert.assertEquals(result.getPayload().get(0).getDataItem().getLong(), Long.valueOf(1));
        Assert.assertEquals(result.getPayload().get(1).getDataItem().getLong(), Long.valueOf(2));
        Assert.assertEquals(result.getPayload().get(2).getDataItem().getLong(), Long.valueOf(127));
        Assert.assertEquals(result.getPayload().get(3).getDataItem().getLong(), Long.valueOf(-128));
        Assert.assertEquals(result.getPayload().get(4).getDataItem().getLong(), Long.valueOf(32767));
        Assert.assertEquals(result.getPayload().get(5).getDataItem().getLong(), Long.valueOf(-32768));
        Assert.assertEquals(result.getPayload().get(6).getDataItem().getLong(), Long.valueOf(2147483647));
        Assert.assertEquals(result.getPayload().get(7).getDataItem().getLong(), Long.valueOf(-2147483648));
        Assert.assertEquals(result.getPayload().get(8).getDataItem().getLong(), Long.valueOf(10000000000L));
        Assert.assertEquals(result.getPayload().get(9).getDataItem().getLong(), Long.valueOf(-20000000000L));

        testParseFail("event-name", "8a-string");
    }

    @Test(groups = "fast")
    public void testParseDouble() throws Exception
    {
        final ThriftEnvelope result = parseThriftEnvelopeBase10("event-name", "d1.0,d1,d0,d-1,d-2.72,d3.14");

        Assert.assertEquals(result.getPayload().size(), 6);
        Assert.assertEquals(result.getTypeName(), "event-name");
        Assert.assertEquals(result.getPayload().get(0).getDataItem().getDouble(), 1.0);
        Assert.assertEquals(result.getPayload().get(1).getDataItem().getDouble(), 1.0);
        Assert.assertEquals(result.getPayload().get(2).getDataItem().getDouble(), 0.0);
        Assert.assertEquals(result.getPayload().get(3).getDataItem().getDouble(), -1.0);
        Assert.assertEquals(result.getPayload().get(4).getDataItem().getDouble(), -2.72);
        Assert.assertEquals(result.getPayload().get(5).getDataItem().getDouble(), 3.14);

        testParseFail("event-name", "da-string");
    }

    @Test(groups = "fast")
    public void testParseString() throws Exception
    {
        final ThriftEnvelope result = parseThriftEnvelopeBase10("event-name", "sa very long string,sanother-string");

        Assert.assertEquals(result.getPayload().size(), 2);
        Assert.assertEquals(result.getTypeName(), "event-name");
        Assert.assertEquals(result.getPayload().get(0).getDataItem().getString(), "a very long string");
        Assert.assertEquals(result.getPayload().get(1).getDataItem().getString(), "another-string");
    }

    private void testParseFail(final String eventName, final String eventString)
    {
        try {
            parseThriftEnvelopeBase10(eventName, eventString);
            Assert.fail("expected EventParseException");
        }
        catch (EventParsingException e) {
            Assert.assertEquals(e.getClass(), EventParsingException.class);
        }
    }

    @Test(groups = "fast")
    public void testFunctionParse() throws Exception
    {
        final ExtractedAnnotation annotation = createDefaultAnnotation();
        final ThriftEnvelope result = parseThriftEnvelopeBase10("event-name", "xdate,xhost,xpath,xip,xua");

        Assert.assertEquals(result.getPayload().size(), 5);
        Assert.assertEquals(result.getTypeName(), "event-name");
        Assert.assertEquals(result.getPayload().get(0).getDataItem().getLong(), Long.valueOf(annotation.getDateTime().getMillis()));
        Assert.assertEquals(result.getPayload().get(1).getDataItem().getString(), annotation.getReferrerHost());
        Assert.assertEquals(result.getPayload().get(2).getDataItem().getString(), annotation.getReferrerPath());
        Assert.assertEquals(Ip.intToIp(result.getPayload().get(3).getDataItem().getInteger()), annotation.getIpAddress());
        Assert.assertEquals(result.getPayload().get(4).getDataItem().getString(), annotation.getUserAgent());
    }

    private ThriftEnvelope parseThriftEnvelopeBase64(final String eventType, final String eventString) throws EventParsingException
    {
        return parseThriftEnvelope(base64Parser, eventType, eventString);
    }

    private ThriftEnvelope parseThriftEnvelopeBase10(final String eventType, final String eventString) throws EventParsingException
    {
        return parseThriftEnvelope(base10Parser, eventType, eventString);
    }

    private ThriftEnvelope parseThriftEnvelope(final ThriftEnvelopeEventParser parser, final String eventType, final String eventString) throws EventParsingException
    {
        final ThriftEnvelopeEvent event = parseThriftEnvelopeEvent(parser, eventType, eventString);

        return (ThriftEnvelope) event.getData();
    }

    private ThriftEnvelopeEvent parseThriftEnvelopeEvent(final ThriftEnvelopeEventParser parser, final String eventType, final String eventString) throws EventParsingException
    {
        return (ThriftEnvelopeEvent) parser.parseThriftEvent(eventType, eventString, annotation);
    }

    private ExtractedAnnotation createDefaultAnnotation()
    {

        return new ConcreteAnnotation(new DateTime("2009-01-01T00:00:01"), "1.2.3.4", "ref-host", "/some-path", "user-agent-EventEndpointRequestFilter");
    }

    private static class ConcreteAnnotation implements ExtractedAnnotation
    {
        private final String eventName = null;
        private final DateTime dateTime;
        private final String ip;
        private final String referrerHost;
        private final String referrerPath;
        private final String userAgent;

        private ConcreteAnnotation(final DateTime dateTime, final String ip, final String referrerHost, final String referrerPath, final String userAgent)
        {
            this.dateTime = dateTime;
            this.ip = ip;
            this.referrerHost = referrerHost;
            this.referrerPath = referrerPath;
            this.userAgent = userAgent;
        }

        @Override
        public String getEventName()
        {
            return eventName;
        }

        @Override
        public DateTime getDateTime()
        {
            return dateTime;
        }

        @Override
        public String getIpAddress()
        {
            return ip;
        }

        @Override
        public String getReferrerHost()
        {
            return referrerHost;
        }

        @Override
        public String getReferrerPath()
        {
            return referrerPath;
        }

        @Override
        public String getUserAgent()
        {
            return userAgent;
        }

        @Override
        public Granularity getBucketGranularity()
        {
            return Granularity.HOURLY;
        }

        @Override
        public int getContentLength()
        {
            return 0;
        }

        @Override
        public DeserializationType getContentType()
        {
            return null;
        }

        @Override
        public InputStream getInputStream()
        {
            return null;
        }
    }
}
