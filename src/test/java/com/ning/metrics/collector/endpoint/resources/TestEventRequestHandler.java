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

package com.ning.metrics.collector.endpoint.resources;

import com.ning.metrics.collector.endpoint.EventEndPointStats;
import com.ning.metrics.collector.endpoint.EventStats;
import com.ning.metrics.collector.endpoint.ExtractedAnnotation;
import com.ning.metrics.collector.endpoint.MockEventHandler;
import com.ning.metrics.collector.endpoint.MockHttpHeaders;
import com.ning.metrics.collector.endpoint.ParsedRequest;
import com.ning.metrics.collector.endpoint.extractors.EventDeserializerFactory;
import com.ning.metrics.collector.endpoint.extractors.MockEventDeserializer;
import com.ning.metrics.collector.jaxrs.EventDeserializerRequestHandler;
import com.ning.metrics.serialization.event.Event;
import com.ning.metrics.serialization.event.EventDeserializer;
import com.ning.metrics.serialization.event.StubEvent;
import org.apache.commons.lang.StringUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.ws.rs.core.Response;
import java.io.IOException;

public class TestEventRequestHandler
{
    private EventEndPointStats stats = null;
    private MockEventHandler eventHandler = null;
    private MockEventDeserializer eventDeserializer = null;
    private EventDeserializerRequestHandler eventRequestHandler = null;
    private EventStats eventStats = null;
    private MockEventDeserializerFactory eventDeserializerFactory;

    @BeforeMethod(alwaysRun = true)
    void setup()
    {
        eventHandler = new MockEventHandler();
        stats = new EventEndPointStats(5);
        eventDeserializer = new MockEventDeserializer();
        eventDeserializerFactory = new MockEventDeserializerFactory();
        // Every test shares the same factory, and they all expect it to provide different types of events.
        // so the tests can't run in parallel. Hence the "synchronized" keyword everywhere.
        eventRequestHandler = new EventDeserializerRequestHandler(eventHandler, stats, eventDeserializerFactory);
        eventStats = new EventStats();
    }

    @Test(groups = "fast")
    public synchronized void testSuccess() throws Exception
    {
        final Event event = createEvent("fuu");
        eventDeserializer.setEvent(event);
        final Response res = eventRequestHandler.handleEventRequest(createMockRequestAnnotation(), eventStats);

        Assert.assertEquals(eventHandler.getProcessedEventList().size(), 1);
        Assert.assertEquals(eventHandler.getProcessedEventList().get(0).getName(), "fuu");

        Assert.assertEquals(res.getStatus(), Response.Status.ACCEPTED.getStatusCode());

        Assert.assertEquals(stats.getTotalEvents(), 1);
        Assert.assertEquals(stats.getSuccessfulParseEvents(), 1);
        Assert.assertEquals(stats.getFailedToParseEvents(), 0);
    }

    @Test(groups = "fast")
    public synchronized void testEventExtractorReturnsNull() throws Exception
    {
        eventDeserializer.setEvent(null);
        final Response res = eventRequestHandler.handleEventRequest(createMockRequestAnnotation(), eventStats);

        // Test that eventHandler sees the null value
        Assert.assertEquals(eventHandler.getProcessedEventList().size(), 1);
        Assert.assertEquals(eventHandler.getProcessedEventList().get(0), null);

        Assert.assertEquals(res.getStatus(), 202);

        Assert.assertEquals(stats.getTotalEvents(), 1);
        Assert.assertEquals(stats.getSuccessfulParseEvents(), 1);
        Assert.assertEquals(stats.getFailedToParseEvents(), 0);
    }

    @Test(groups = "fast")
    public synchronized void testEventExtractorThrowsEventParse() throws Exception
    {
        eventDeserializer.setThrowsIOException(true);

        final Response response = eventRequestHandler.handleEventRequest(createMockRequestAnnotation(), eventStats);

        Assert.assertEquals(eventHandler.isHandleFailureCalled(), true);
        Assert.assertEquals(eventHandler.getProcessedEventList().size(), 0);

        Assert.assertEquals(response.getStatus(), Response.Status.ACCEPTED.getStatusCode());
        Assert.assertTrue(StringUtils.contains((String) response.getMetadata().get("Warning").get(0), "java.io.IOException"));

        Assert.assertEquals(stats.getTotalEvents(), 0); // if it can't parse the events, it can't count the total events
        Assert.assertEquals(stats.getSuccessfulParseEvents(), 0);
        Assert.assertEquals(stats.getFailedToParseEvents(), 1);
    }

    @Test(groups = "fast")
    public synchronized void testEventExtractorThrowsRuntimeException() throws Exception
    {
        eventDeserializer.setThrowsRuntimeException(true);

        final Response response = eventRequestHandler.handleEventRequest(createMockRequestAnnotation(), eventStats);

        Assert.assertEquals(eventHandler.isHandleFailureCalled(), true);
        Assert.assertEquals(eventHandler.getProcessedEventList().size(), 0);

        Assert.assertEquals(response.getStatus(), Response.Status.ACCEPTED.getStatusCode());
        Assert.assertTrue(StringUtils.contains((String) response.getMetadata().get("Warning").get(0), "java.lang.RuntimeException"));

        Assert.assertEquals(stats.getTotalEvents(), 0);
        Assert.assertEquals(stats.getSuccessfulParseEvents(), 0);
        Assert.assertEquals(stats.getFailedToParseEvents(), 1);
    }

    @Test(groups = "fast")
    public synchronized void testEventHandlerThrowsBeforeEventProcessed() throws Exception
    {
        eventHandler.setThrowExceptionBeforeEvent(true);

        final Response response = eventRequestHandler.handleEventRequest(createMockRequestAnnotation(), eventStats);

        Assert.assertEquals(eventHandler.getProcessedEventList().size(), 0);
        Assert.assertEquals(response.getStatus(), Response.Status.ACCEPTED.getStatusCode());
        Assert.assertTrue(StringUtils.contains((String) response.getMetadata().get("Warning").get(0), "java.lang.RuntimeException"));

        Assert.assertEquals(stats.getTotalEvents(), 1);
        Assert.assertEquals(stats.getSuccessfulParseEvents(), 0);
        Assert.assertEquals(stats.getFailedToParseEvents(), 1);
    }

    @Test(groups = "fast")
    public synchronized void testEventHandlerThrowsAfterEventProcessed() throws Exception
    {
        eventHandler.setThrowExceptionAfterEvent(true);

        final Response response = eventRequestHandler.handleEventRequest(createMockRequestAnnotation(), eventStats);

        Assert.assertEquals(eventHandler.getProcessedEventList().size(), 1);
        Assert.assertEquals(response.getStatus(), Response.Status.ACCEPTED.getStatusCode());

        Assert.assertEquals(stats.getTotalEvents(), 1);
        Assert.assertEquals(stats.getSuccessfulParseEvents(), 0);
        Assert.assertEquals(stats.getFailedToParseEvents(), 1);
    }

    @Test(groups = "fast")
    public synchronized void testEventHandlerThrowsOnGetEventDeserializer() throws Exception
    {
        // Input stream error?
        eventDeserializerFactory.setThrowsOnGetEventDeserializer(true);

        final Response response = eventRequestHandler.handleEventRequest(createMockRequestAnnotation(), eventStats);

        Assert.assertEquals(eventHandler.getProcessedEventList().size(), 0);
        Assert.assertEquals(response.getStatus(), Response.Status.BAD_REQUEST.getStatusCode());

        Assert.assertEquals(stats.getTotalEvents(), 0);
        Assert.assertEquals(stats.getSuccessfulParseEvents(), 0);
        Assert.assertEquals(stats.getFailedToParseEvents(), 1);
    }

    private Event createEvent(final String description)
    {
        return new StubEvent()
        {
            @Override
            public String getName()
            {
                return description;
            }
        };
    }


    /**
     * The event handler doesn't care about the annotation (only the event extractor does).
     * Generate a dummy one.
     *
     * @return an empty annotation
     */
    private ExtractedAnnotation createMockRequestAnnotation()
    {
        return new ParsedRequest("DummyEvent", new MockHttpHeaders(), null, null, null, null, null);
    }

    private class MockEventDeserializerFactory extends EventDeserializerFactory
    {
        private boolean throwsOnGetEventDeserializer = false;

        @Override
        public EventDeserializer getEventDeserializer(final ExtractedAnnotation annotation) throws IOException
        {
            if (throwsOnGetEventDeserializer) {
                throw new IOException("IGNORE. Exception for tests.");
            }

            return eventDeserializer;
        }

        public boolean isThrowsOnGetEventDeserializer()
        {
            return throwsOnGetEventDeserializer;
        }

        public void setThrowsOnGetEventDeserializer(boolean throwsOnGetEventDeserializer)
        {
            this.throwsOnGetEventDeserializer = throwsOnGetEventDeserializer;
        }
    }
}
