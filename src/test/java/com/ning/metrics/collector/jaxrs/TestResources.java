/*
 * Copyright 2010-2012 Ning, Inc.
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

package com.ning.metrics.collector.jaxrs;

import com.ning.metrics.collector.endpoint.ParsedRequest;
import com.ning.metrics.collector.endpoint.extractors.DeserializationType;
import com.ning.metrics.collector.endpoint.extractors.EventDeserializerFactory;
import com.ning.metrics.collector.endpoint.extractors.MockEventDeserializer;
import com.ning.metrics.serialization.event.Event;
import com.ning.metrics.serialization.event.Granularity;

import com.yammer.metrics.Metrics;
import com.yammer.metrics.core.MetricName;
import org.apache.commons.lang.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.mockito.Mockito;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.CacheControl;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import java.io.IOException;

/**
 * This class tests the different code paths from the resources up to the EventFilterRequestHandler.
 * It verifies all the different scenarii possible when going through the EventDeserializerRequestHandler,
 * and make sure the stats bookkeeping is correct, as well as the actual content of the response to the client.
 * <p/>
 * This test doesn't validate the behavior of EventFilterRequestHandler, nor the parsing done in ParsedRequest
 * and in the various EventDeserializers, i.e. the event payload is never verified.
 *
 * @param <T> A jaxrs resource
 */
public abstract class TestResources<T>
{
    protected static final String EVENT_NAME = "hello";
    protected static final DateTime EVENT_DATETIME = new DateTime(DateTimeZone.UTC);
    protected static final Granularity EVENT_GRANULARITY = Granularity.MINUTE;

    protected HttpHeaders httpHeaders;
    protected HttpServletRequest request;
    protected EventFilterRequestHandler filterRequestHandler;
    protected EventDeserializerFactory deserializerFactory;
    protected MockEventDeserializer eventDeserializer;

    protected T resource;
    protected final DeserializationType deserializationType;

    public abstract T setupResource(final EventDeserializerRequestHandler requestHandler);

    public abstract Response callEndpoint();

    protected TestResources(final DeserializationType deserializationType)
    {
        this.deserializationType = deserializationType;
    }

    @BeforeMethod(alwaysRun = true)
    protected void setUp()
    {
        // Make sure to reset the registry (static...)
        for (final MetricName metricName : Metrics.allMetrics().keySet()) {
            Metrics.removeMetric(metricName);
        }

        httpHeaders = Mockito.mock(HttpHeaders.class);
        request = Mockito.mock(HttpServletRequest.class);
        filterRequestHandler = Mockito.mock(EventFilterRequestHandler.class);
        deserializerFactory = Mockito.mock(EventDeserializerFactory.class);
        eventDeserializer = new MockEventDeserializer();

        Mockito.verifyZeroInteractions(httpHeaders, request, filterRequestHandler, deserializerFactory);
    }

    @Test(groups = "fast")
    public void testGetWhenCollectionIsDisabled()
    {
        final EventDeserializerRequestHandler disabledRequestHandler = new EventDeserializerRequestHandler(false, filterRequestHandler, deserializerFactory);
        resource = setupResource(disabledRequestHandler);

        // Verify initial state
        verifyInitialState(disabledRequestHandler);

        // Send the request
        final Response response = callEndpoint();

        // Verify end state
        Assert.assertEquals(disabledRequestHandler.getRejectedMeter().count(), 1);
        Assert.assertEquals(disabledRequestHandler.getBadRequestMeter().count(), 0);
        verifyNoEventWentThroughTheFilterRequestHandler(disabledRequestHandler);
        verifyCollectionDisabled(response);

        // Verify side effects
        Mockito.verify(httpHeaders, Mockito.times(5)).getRequestHeader(Mockito.<String>any());
        Mockito.verify(request, Mockito.times(1)).getRemoteAddr();
        Mockito.verifyNoMoreInteractions(httpHeaders, request);
        Mockito.verifyZeroInteractions(filterRequestHandler, deserializerFactory);
    }

    @Test(groups = "fast")
    public void testEventDeserializerThrowsExceptionOnCreation()
    {
        makeEventDeserializerThrowExceptionOnCreation();
        final EventDeserializerRequestHandler enabledRequestHandler = new EventDeserializerRequestHandler(true, filterRequestHandler, deserializerFactory);
        resource = setupResource(enabledRequestHandler);

        // Verify initial state
        verifyInitialState(enabledRequestHandler);

        // Send the request
        final Response response = callEndpoint();

        // Verify end state
        Assert.assertEquals(enabledRequestHandler.getRejectedMeter().count(), 0);
        Assert.assertEquals(enabledRequestHandler.getBadRequestMeter().count(), 1);
        verifyNoEventWentThroughTheFilterRequestHandler(enabledRequestHandler);
        verifyBadRequest(response);

        // Verify side effects
        verifyMocksWhenEventDoesntGoThrough();
    }

    @Test(groups = "fast")
    public void testEventDeserializerThrowsIOExceptionOnNextEvent()
    {
        makeEventDeserializerThrowIOExceptionOnNextEvent();
        final EventDeserializerRequestHandler enabledRequestHandler = new EventDeserializerRequestHandler(true, filterRequestHandler, deserializerFactory);
        resource = setupResource(enabledRequestHandler);

        // Verify initial state
        verifyInitialState(enabledRequestHandler);

        // Send the request
        final Response response = callEndpoint();

        // Verify end state
        Assert.assertEquals(enabledRequestHandler.getRejectedMeter().count(), 0);
        Assert.assertEquals(enabledRequestHandler.getBadRequestMeter().count(), 1);
        verifyNoEventWentThroughTheFilterRequestHandler(enabledRequestHandler);
        verifyBadRequest(response);

        // Verify side effects
        verifyMocksWhenEventDoesntGoThrough();
    }

    @Test(groups = "fast")
    public void testEventDeserializerThrowsRuntimeExceptionOnNextEvent()
    {
        makeEventDeserializerThrowRuntimeExceptionOnNextEvent();
        final EventDeserializerRequestHandler enabledRequestHandler = new EventDeserializerRequestHandler(true, filterRequestHandler, deserializerFactory);
        resource = setupResource(enabledRequestHandler);

        // Verify initial state
        verifyInitialState(enabledRequestHandler);

        // Send the request
        final Response response = callEndpoint();

        // Verify end state
        Assert.assertEquals(enabledRequestHandler.getRejectedMeter().count(), 0);
        Assert.assertEquals(enabledRequestHandler.getBadRequestMeter().count(), 1);
        verifyNoEventWentThroughTheFilterRequestHandler(enabledRequestHandler);
        verifyBadRequest(response);

        // Verify side effects
        verifyMocksWhenEventDoesntGoThrough();
    }

    @Test(groups = "fast")
    public void testSendEmptyPayload()
    {
        populateEventDeserializer(null);
        eventDeserializer.setHasNextEvent(false);
        final EventDeserializerRequestHandler enabledRequestHandler = new EventDeserializerRequestHandler(true, filterRequestHandler, deserializerFactory);
        resource = setupResource(enabledRequestHandler);

        // Verify initial state
        verifyInitialState(enabledRequestHandler);

        // Send the request
        final Response response = callEndpoint();

        // Verify end state
        Assert.assertEquals(enabledRequestHandler.getRejectedMeter().count(), 0);
        Assert.assertEquals(enabledRequestHandler.getBadRequestMeter().count(), 0);
        verifyNoEventWentThroughTheFilterRequestHandler(enabledRequestHandler);
        verifyGoodRequest(response, false);

        // Verify side effects
        verifyMocksWhenEventDoesntGoThrough();
    }

    @Test(groups = "fast")
    public void testSendValidPayload()
    {
        makeFilterRequestHandlerPass();
        populateEventDeserializer(Mockito.mock(Event.class));
        final EventDeserializerRequestHandler enabledRequestHandler = new EventDeserializerRequestHandler(true, filterRequestHandler, deserializerFactory);
        resource = setupResource(enabledRequestHandler);

        // Verify initial state
        verifyInitialState(enabledRequestHandler);

        // Send the request
        final Response response = callEndpoint();

        // Verify end state
        Assert.assertEquals(enabledRequestHandler.getRejectedMeter().count(), 0);
        Assert.assertEquals(enabledRequestHandler.getBadRequestMeter().count(), 0);
        final MetricName successMetricName = enabledRequestHandler.getSuccessMetricsKey(deserializationType);
        for (final MetricName name : enabledRequestHandler.getMetrics().keySet()) {
            if (name.equals(successMetricName)) {
                Assert.assertEquals(enabledRequestHandler.getMetrics().get(name).count(), 1);
            }
            else {
                Assert.assertEquals(enabledRequestHandler.getMetrics().get(name).count(), 0);
            }
        }
        verifyGoodRequest(response, false);

        // Verify side effects
        Mockito.verify(httpHeaders, Mockito.times(5)).getRequestHeader(Mockito.<String>any());
        Mockito.verify(request, Mockito.times(1)).getRemoteAddr();
        try {
            Mockito.verify(deserializerFactory, Mockito.times(1)).getEventDeserializer(Mockito.<ParsedRequest>any());
        }
        catch (IOException e) {
            Assert.fail();
        }
        Mockito.verify(filterRequestHandler, Mockito.times(1)).processEvent(Mockito.<Event>any(), Mockito.<ParsedRequest>any());
        Mockito.verifyNoMoreInteractions(httpHeaders, request, deserializerFactory, filterRequestHandler);
    }

    @Test(groups = "fast")
    public void testSendValidPayloadButFiltered()
    {
        populateEventDeserializer(Mockito.mock(Event.class));
        final EventDeserializerRequestHandler enabledRequestHandler = new EventDeserializerRequestHandler(true, filterRequestHandler, deserializerFactory);
        resource = setupResource(enabledRequestHandler);

        // Verify initial state
        verifyInitialState(enabledRequestHandler);

        // Send the request
        final Response response = callEndpoint();

        // Verify end state
        Assert.assertEquals(enabledRequestHandler.getRejectedMeter().count(), 0);
        Assert.assertEquals(enabledRequestHandler.getBadRequestMeter().count(), 0);
        final MetricName failureMetricsKey = enabledRequestHandler.getFailureMetricsKey(deserializationType);
        for (final MetricName name : enabledRequestHandler.getMetrics().keySet()) {
            if (name.equals(failureMetricsKey)) {
                Assert.assertEquals(enabledRequestHandler.getMetrics().get(name).count(), 1);
            }
            else {
                Assert.assertEquals(enabledRequestHandler.getMetrics().get(name).count(), 0);
            }
        }
        // Filtered, but it's still a valid payload
        verifyGoodRequest(response, true);

        // Verify side effects
        Mockito.verify(httpHeaders, Mockito.times(5)).getRequestHeader(Mockito.<String>any());
        Mockito.verify(request, Mockito.times(1)).getRemoteAddr();
        try {
            Mockito.verify(deserializerFactory, Mockito.times(1)).getEventDeserializer(Mockito.<ParsedRequest>any());
        }
        catch (IOException e) {
            Assert.fail();
        }
        Mockito.verify(filterRequestHandler, Mockito.times(1)).processEvent(Mockito.<Event>any(), Mockito.<ParsedRequest>any());
        Mockito.verifyNoMoreInteractions(httpHeaders, request, deserializerFactory, filterRequestHandler);
    }

    protected void makeEventDeserializerThrowExceptionOnCreation()
    {
        try {
            Mockito.when(deserializerFactory.getEventDeserializer(Mockito.<ParsedRequest>any())).thenThrow(new IOException("IGNORE - Expected exception for tests"));
        }
        catch (IOException e) {
            Assert.fail();
        }
    }

    protected void makeEventDeserializerThrowIOExceptionOnNextEvent()
    {
        eventDeserializer.setThrowsIOException(true);
        try {
            Mockito.when(deserializerFactory.getEventDeserializer(Mockito.<ParsedRequest>any())).thenReturn(eventDeserializer);
        }
        catch (IOException e) {
            Assert.fail();
        }
    }

    protected void makeEventDeserializerThrowRuntimeExceptionOnNextEvent()
    {
        eventDeserializer.setThrowsRuntimeException(true);
        try {
            Mockito.when(deserializerFactory.getEventDeserializer(Mockito.<ParsedRequest>any())).thenReturn(eventDeserializer);
        }
        catch (IOException e) {
            Assert.fail();
        }
    }

    protected void populateEventDeserializer(final Event event)
    {
        eventDeserializer.setEvent(event);

        try {
            Mockito.when(deserializerFactory.getEventDeserializer(Mockito.<ParsedRequest>any())).thenReturn(eventDeserializer);
        }
        catch (IOException e) {
            Assert.fail();
        }
    }

    protected void makeFilterRequestHandlerPass()
    {
        Mockito.when(filterRequestHandler.processEvent(Mockito.<Event>any(), Mockito.<ParsedRequest>any())).thenReturn(true);
    }

    protected void verifyMocksWhenEventDoesntGoThrough()
    {
        Mockito.verify(httpHeaders, Mockito.times(5)).getRequestHeader(Mockito.<String>any());
        Mockito.verify(request, Mockito.times(1)).getRemoteAddr();
        try {
            Mockito.verify(deserializerFactory, Mockito.times(1)).getEventDeserializer(Mockito.<ParsedRequest>any());
        }
        catch (IOException e) {
            Assert.fail();
        }
        Mockito.verifyNoMoreInteractions(httpHeaders, request, deserializerFactory);
        Mockito.verifyZeroInteractions(filterRequestHandler);
    }

    protected void verifyInitialState(final EventDeserializerRequestHandler handler)
    {
        Assert.assertEquals(handler.getRejectedMeter().count(), 0);
        Assert.assertEquals(handler.getBadRequestMeter().count(), 0);
        verifyNoEventWentThroughTheFilterRequestHandler(handler);
    }

    protected void verifyNoEventWentThroughTheFilterRequestHandler(final EventDeserializerRequestHandler handler)
    {
        for (final MetricName name : handler.getMetrics().keySet()) {
            Assert.assertEquals(handler.getMetrics().get(name).count(), 0);
        }
    }

    protected void verifyCollectionDisabled(final Response response)
    {
        Assert.assertEquals(response.getStatus(), Response.Status.SERVICE_UNAVAILABLE.getStatusCode());
        Assert.assertEquals(response.getMetadata().get("Warning").size(), 1);
        Assert.assertEquals(response.getMetadata().get("Warning").get(0), "199 Collection disabled");

        verifyCacheControl(response);
    }

    protected void verifyBadRequest(final Response response)
    {
        Assert.assertEquals(response.getStatus(), Response.Status.BAD_REQUEST.getStatusCode());
        Assert.assertEquals(response.getMetadata().get("Warning").size(), 1);
        Assert.assertTrue(StringUtils.contains(((String) response.getMetadata().get("Warning").get(0)), "199"));

        verifyCacheControl(response);
    }

    protected void verifyGoodRequest(final Response response, final boolean warningHeaderPresent)
    {
        Assert.assertEquals(response.getStatus(), Response.Status.ACCEPTED.getStatusCode());
        if (warningHeaderPresent) {
            Assert.assertEquals(response.getMetadata().get("Warning").size(), 1);
            Assert.assertTrue(StringUtils.contains(((String) response.getMetadata().get("Warning").get(0)), "199"));
        }
        else {
            Assert.assertNull(response.getMetadata().get("Warning"));
        }

        verifyCacheControl(response);
    }

    private void verifyCacheControl(final Response response)
    {
        Assert.assertEquals(response.getMetadata().get("Cache-Control").size(), 1);

        final CacheControl cacheControl = (CacheControl) response.getMetadata().get("Cache-Control").get(0);
        Assert.assertTrue(cacheControl.isPrivate());
        Assert.assertTrue(cacheControl.isNoCache());
        Assert.assertTrue(cacheControl.isProxyRevalidate());
    }
}
