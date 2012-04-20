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

package com.ning.metrics.collector.hadoop.processing;

import com.ning.metrics.collector.endpoint.EventEndPointStats;
import com.ning.metrics.collector.endpoint.EventStats;
import com.ning.metrics.collector.endpoint.ExtractedAnnotation;
import com.ning.metrics.collector.endpoint.ParsedRequest;
import com.ning.metrics.collector.endpoint.extractors.DeserializationType;
import com.ning.metrics.collector.jaxrs.EventFilterRequestHandler;
import com.ning.metrics.collector.filtering.Filter;
import com.ning.metrics.serialization.event.Event;
import com.ning.metrics.serialization.event.StubEvent;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.ws.rs.core.CacheControl;
import javax.ws.rs.core.Response;

public class TestEventHandlerImpl
{
    private MockEventCollector collector = null;
    private boolean filterValue = false;
    private EventEndPointStats stats = null;
    private EventFilterRequestHandler eventHandler = null;
    private ExtractedAnnotation annotation = null;
    private EventStats eventStats = null;

    @BeforeMethod(alwaysRun = true)
    void setup()
    {
        collector = new MockEventCollector(true, false);
        filterValue = false;
        final Filter<ExtractedAnnotation> requestFilter = new Filter<ExtractedAnnotation>()
        {
            @Override
            public boolean passesFilter(final String eventName, final ExtractedAnnotation input)
            {
                return filterValue;
            }
        };
        stats = new EventEndPointStats(5);
        annotation = new ParsedRequest("DummyEvent", null, null, null, null, DeserializationType.DEFAULT);
        eventHandler = new EventFilterRequestHandler(collector, requestFilter, true);
        eventStats = new EventStats();
    }

    @Test(groups = "fast")
    public void testNormalEvent() throws Exception
    {
        final Event event = createEvent("fuu");

        final Response res = eventHandler.processEvent(event, annotation, stats, eventStats);
        assertSuccessfulEvent(res);
    }

    @Test(groups = "fast")
    public void testCollectorReturnsFalse() throws Exception
    {
        final Event event = createEvent("fuu");

        collector.setAcceptsEvents(false);

        final Response res = eventHandler.processEvent(event, annotation, stats, eventStats);
        assertRejectedEvent(res);
    }

    @Test(groups = "fast")
    public void testNullEvent() throws Exception
    {
        final Response response = eventHandler.processEvent(null, annotation, stats, eventStats);
        assertFailedEvent(response);
        Assert.assertEquals((String) response.getMetadata().getFirst("Warning"), "199 com.ning.metrics.collector.endpoint.extractors.EventParsingException: Received empty event");
    }

    @Test(groups = "fast")
    public void testFilteredRequest() throws Exception
    {
        filterValue = true;
        final Response res = eventHandler.processEvent(createEvent("fuu"), annotation, stats, eventStats);
        assertFilteredEvent(res);
    }

    @Test(groups = "fast")
    public void testCollectorThrowsRuntimeException() throws Exception
    {
        try {
            collector.setThrowsException(true);
            eventHandler.processEvent(createEvent("fuu"), annotation, stats, eventStats);
            Assert.fail("expected exception");
        }
        catch (Exception e) {
            Assert.assertEquals(e.getClass(), RuntimeException.class);
        }
    }

    @Test(groups = "fast")
    public void testDisabledCollection() throws Exception
    {
        eventHandler.setCollectionEnabled(false);

        final Response response = eventHandler.processEvent(createEvent("fuu"), annotation, stats, eventStats);
        assertRejectedEvent(response);
    }

    private void assertSuccessfulEvent(final Response res)
    {
        assertStats(1, 0, 0, 0);
        Assert.assertEquals(collector.getEventList().size(), 1);
        Assert.assertEquals(res.getStatus(), Response.Status.ACCEPTED.getStatusCode());
        assertNoCache(res);
    }

    void assertFailedEvent(final Response res)
    {
        assertStats(0, 1, 0, 0);
        Assert.assertEquals(collector.getEventList().size(), 0);
        Assert.assertEquals(res.getStatus(), Response.Status.BAD_REQUEST.getStatusCode());
        assertNoCache(res);
    }

    void assertRejectedEvent(final Response res)
    {
        assertStats(0, 0, 1, 0);
        Assert.assertEquals(collector.getEventList().size(), 0);
        Assert.assertEquals(res.getStatus(), Response.Status.SERVICE_UNAVAILABLE.getStatusCode());
        assertNoCache(res);
    }

    void assertFilteredEvent(final Response res)
    {
        assertStats(0, 0, 0, 1);
        Assert.assertEquals(collector.getEventList().size(), 0);
        Assert.assertEquals(res.getStatus(), Response.Status.ACCEPTED.getStatusCode());
        assertNoCache(res);
    }

    void assertStats(final int success, final int failed, final int rejected, final int filtered)
    {
        Assert.assertEquals(stats.getSuccessfulParseEvents(), success);
        Assert.assertEquals(stats.getFailedToParseEvents(), failed);
        Assert.assertEquals(stats.getRejectedEvents(), rejected);
        Assert.assertEquals(stats.getFilteredEvents(), filtered);
    }

    void assertNoCache(final Response res)
    {
        final CacheControl control = (CacheControl) res.getMetadata().getFirst("Cache-Control");
        Assert.assertTrue(control.isNoCache());
        Assert.assertTrue(control.isPrivate());
        Assert.assertTrue(control.isProxyRevalidate());
        Assert.assertTrue(control.isNoTransform());
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

            @Override
            public String getVersion()
            {
                return description + "-version";
            }
        };
    }
}
