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

package com.ning.metrics.collector.events.processing;

import com.ning.metrics.collector.endpoint.EventEndPointStats;
import com.ning.metrics.collector.endpoint.EventStats;
import com.ning.metrics.collector.endpoint.MockEventHandler;
import com.ning.metrics.collector.endpoint.ThriftFieldList;
import com.ning.metrics.collector.events.parsing.EventExtractorUtilImpl;
import com.ning.metrics.collector.events.parsing.ParsedRequest;
import com.ning.serialization.DataItemFactory;
import com.ning.serialization.ThriftEnvelope;
import com.ning.serialization.ThriftFieldImpl;
import com.ning.serialization.ThriftFieldListSerializer;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.protocol.TProtocol;
import org.joda.time.DateTime;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.UUID;

public class TestThriftEventProcessor
{
    private ThriftEventProcessor eventProcessor = null;
    private EventEndPointStats stats = null;
    private MockEventHandler eventHandler = null;
    private EventStats eventStats = null;

    @BeforeMethod(alwaysRun = true)
    void setup()
    {
        stats = new EventEndPointStats(5);
        eventHandler = new MockEventHandler();
        eventProcessor = new ThriftEventProcessor(eventHandler, stats);
        eventStats = new EventStats();
    }

    @Test(groups = "fast")
    public void testValidThriftEvent() throws Exception
    {
        ThriftEvent event = new ThriftEvent(new DateTime("2009-01-01"), "thrifty", UUID.randomUUID(), createDummyThrift());

        Response response = eventProcessor.processEvent(event, createDummyAnnotation(), eventStats);

        Assert.assertEquals(eventHandler.getProcessedEventList().size(), 1);
        Assert.assertEquals(response.getStatus(), Response.Status.ACCEPTED.getStatusCode());
        Assert.assertEquals(stats.getTotalEvents(), 1);
        Assert.assertEquals(stats.getSuccessfulParseEvents(), 1);
        Assert.assertEquals(stats.getFailedToParseEvents(), 0);
    }

    @Test(groups = "fast")
    public void testNonThriftEvent() throws Exception
    {
        ThriftEvent event = new StubEvent("not-thrift");

        Response response = eventProcessor.processEvent(event, createDummyAnnotation(), eventStats);

        Assert.assertEquals(eventHandler.getProcessedEventList().size(), 0);
        Assert.assertEquals(response.getStatus(), Response.Status.BAD_REQUEST.getStatusCode());
        Assert.assertEquals(stats.getTotalEvents(), 1);
        Assert.assertEquals(stats.getSuccessfulParseEvents(), 0);
        Assert.assertEquals(stats.getFailedToParseEvents(), 1);
    }

    @Test(groups = "fast")
    public void testEventHandlerThrowsBeforeEvent() throws Exception
    {
        ThriftEvent event = new ThriftEvent(new DateTime("2009-01-01"), "thrifty", UUID.randomUUID(), createDummyThrift());

        eventHandler.setThrowExceptionBeforeEvent(true);

        Response response = eventProcessor.processEvent(event, createDummyAnnotation(), eventStats);

        Assert.assertEquals(eventHandler.getProcessedEventList().size(), 0);
        Assert.assertEquals(response.getStatus(), Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
        Assert.assertEquals(stats.getTotalEvents(), 1);
        Assert.assertEquals(stats.getSuccessfulParseEvents(), 0);
        Assert.assertEquals(stats.getFailedToParseEvents(), 1);
    }

    @Test(groups = "fast")
    public void testEventHandlerThrowsAfterEvent() throws Exception
    {
        ThriftEvent event = new ThriftEvent(new DateTime("2009-01-01"), "thrifty", UUID.randomUUID(), createDummyThrift());

        eventHandler.setThrowExceptionAfterEvent(true);

        Response response = eventProcessor.processEvent(event, createDummyAnnotation(), eventStats);

        Assert.assertEquals(eventHandler.getProcessedEventList().size(), 1);
        Assert.assertEquals(response.getStatus(), Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
        Assert.assertEquals(stats.getTotalEvents(), 1);
        Assert.assertEquals(stats.getSuccessfulParseEvents(), 0);
        Assert.assertEquals(stats.getFailedToParseEvents(), 1);
    }

    @Test(groups = "fast")
    public void testEventHandlerThrowsOnHandleFailure() throws Exception
    {
        ThriftEvent event = new ThriftEvent(new DateTime("2009-01-01"), "thrifty", UUID.randomUUID(), createDummyThrift());

        eventHandler.setThrowExceptionBeforeEvent(true);
        Response response = eventProcessor.processEvent(event, createDummyAnnotation(), eventStats);

        Assert.assertEquals(eventHandler.getProcessedEventList().size(), 0);
        Assert.assertEquals(response.getStatus(), Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
        Assert.assertEquals(stats.getTotalEvents(), 1);
        Assert.assertEquals(stats.getSuccessfulParseEvents(), 0);
        Assert.assertEquals(stats.getFailedToParseEvents(), 1);
    }

    @Test(groups = "fast")
    public void testThriftDeserializationError() throws Exception
    {
        ThriftEvent event = new ThriftEvent(new DateTime("2009-01-01"), "thrifty", UUID.randomUUID(), createDummyThrift())
        {
            @Override
            public ThriftEnvelope getThriftEnvelope() throws TException
            {
                throw new TException();
            }
        };

        Response response = eventProcessor.processEvent(event, createDummyAnnotation(), eventStats);

        // Edge case where eventHandler never sees the event
        Assert.assertEquals(eventHandler.getProcessedEventList().size(), 0);
        Assert.assertEquals(response.getStatus(), Response.Status.BAD_REQUEST.getStatusCode());
        Assert.assertEquals(stats.getTotalEvents(), 1);
        Assert.assertEquals(stats.getSuccessfulParseEvents(), 0);
        Assert.assertEquals(stats.getFailedToParseEvents(), 1);
    }

    private TBase createDummyThrift()
    {
        final ThriftFieldListSerializer serializer = new ThriftFieldListSerializer();
        final ThriftFieldList thriftFieldList = new ThriftFieldList();
        thriftFieldList.add(new ThriftFieldImpl(DataItemFactory.create("string"), (short) 1));
        thriftFieldList.add(new ThriftFieldImpl(DataItemFactory.create(true), (short) 2));
        thriftFieldList.add(new ThriftFieldImpl(DataItemFactory.create((byte) 1), (short) 3));
        thriftFieldList.add(new ThriftFieldImpl(DataItemFactory.create((short) 2), (short) 4));
        thriftFieldList.add(new ThriftFieldImpl(DataItemFactory.create(4), (short) 5));
        thriftFieldList.add(new ThriftFieldImpl(DataItemFactory.create(8L), (short) 6));
        thriftFieldList.add(new ThriftFieldImpl(DataItemFactory.create(3.1459), (short) 7));

        return new TBase()
        {
            @Override
            public void read(TProtocol tProtocol)
            {
            }

            @Override
            public void write(TProtocol tProtocol) throws TException
            {
                tProtocol.writeBinary(serializer.createPayload(thriftFieldList));
            }

            /**
             * @deprecated
             */
            @Override
            public boolean isSet(int i)
            {
                return false;
            }

            @Override
            public boolean isSet(TFieldIdEnum tFieldIdEnum)
            {
                return false;
            }

            /**
             * @deprecated
             */
            @Override
            public Object getFieldValue(int i)
            {
                return null;
            }

            @Override
            public Object getFieldValue(TFieldIdEnum tFieldIdEnum)
            {
                return null;
            }

            /**
             * @deprecated
             */
            @Override
            public void setFieldValue(int i, Object o)
            {
            }

            @Override
            public void setFieldValue(TFieldIdEnum tFieldIdEnum, Object o)
            {
            }

            @Override
            public TBase deepCopy()
            {
                return null;
            }
        };
    }

    private static class StubEvent extends ThriftEvent
    {
        private StubEvent(String eventType) throws IOException, TException
        {
            super(new DateTime(), eventType, UUID.randomUUID(), null);
        }

    }

    private ParsedRequest createDummyAnnotation()
    {
        return new ParsedRequest(null, null, null, null, new EventExtractorUtilImpl());
    }
}