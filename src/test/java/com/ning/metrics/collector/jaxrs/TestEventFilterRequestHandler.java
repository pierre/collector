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
import com.ning.metrics.collector.filtering.Filter;
import com.ning.metrics.collector.processing.EventCollector;
import com.ning.metrics.serialization.event.Event;

import com.yammer.metrics.Metrics;
import com.yammer.metrics.core.MetricName;
import org.mockito.Mockito;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * This class tests the behavior and stats of EventFilterRequestHandler.
 * <p/>
 * One has to be careful under which circumstances processEvent() returns false,
 * as it might make the client retransmit the payload. This should only happen
 * if the EventCollector rejects the event (e.g. under high load).
 */
public class TestEventFilterRequestHandler
{
    private abstract static class ParsedRequestFilter implements Filter<ParsedRequest> {}

    private Event event;
    private ParsedRequest parsedRequest;
    private EventCollector collector;
    private Filter<ParsedRequest> requestFilter;
    private EventFilterRequestHandler eventHandler;

    @BeforeMethod(alwaysRun = true)
    public void setup()
    {
        // Make sure to reset the registry (static...)
        for (final MetricName metricName : Metrics.allMetrics().keySet()) {
            Metrics.removeMetric(metricName);
        }

        event = Mockito.mock(Event.class);
        parsedRequest = Mockito.mock(ParsedRequest.class);
        collector = Mockito.mock(EventCollector.class);
        requestFilter = Mockito.mock(ParsedRequestFilter.class);
        eventHandler = new EventFilterRequestHandler(collector, requestFilter);

        Mockito.verifyZeroInteractions(event, parsedRequest, collector, requestFilter);
    }

    @Test(groups = "fast")
    public void testEventPass() throws Exception
    {
        Mockito.when(collector.collectEvent(Mockito.<Event>any())).thenReturn(true);

        Assert.assertTrue(eventHandler.processEvent(event, parsedRequest));
        checkStats(1, 0, 1, 0);

        Mockito.verify(event, Mockito.times(1)).getName();
        Mockito.verify(requestFilter, Mockito.times(1)).passesFilter(Mockito.<String>any(), Mockito.<ParsedRequest>any());
        Mockito.verify(collector, Mockito.times(1)).collectEvent(Mockito.<Event>any());
        Mockito.verifyNoMoreInteractions(event, requestFilter, collector);
        Mockito.verifyZeroInteractions(parsedRequest);
    }

    @Test(groups = "fast")
    public void testCollectorReturnsFalse() throws Exception
    {
        Assert.assertFalse(eventHandler.processEvent(event, parsedRequest));
        checkStats(1, 0, 0, 1);

        Mockito.verify(event, Mockito.times(1)).getName();
        Mockito.verify(requestFilter, Mockito.times(1)).passesFilter(Mockito.<String>any(), Mockito.<ParsedRequest>any());
        Mockito.verify(collector, Mockito.times(1)).collectEvent(Mockito.<Event>any());
        Mockito.verifyNoMoreInteractions(event, requestFilter, collector);
        Mockito.verifyZeroInteractions(parsedRequest);
    }

    @Test(groups = "fast")
    public void testFilteredRequest() throws Exception
    {
        Mockito.when(requestFilter.passesFilter(Mockito.<String>any(), Mockito.<ParsedRequest>any())).thenReturn(true);

        Assert.assertTrue(eventHandler.processEvent(event, parsedRequest));
        checkStats(1, 1, 0, 0);

        Mockito.verify(event, Mockito.times(1)).getName();
        Mockito.verify(requestFilter, Mockito.times(1)).passesFilter(Mockito.<String>any(), Mockito.<ParsedRequest>any());
        Mockito.verifyNoMoreInteractions(event, requestFilter);
        Mockito.verifyZeroInteractions(parsedRequest, collector);
    }

    private void checkStats(final int received, final int filtered, final int succeeded, final int failed)
    {
        Assert.assertEquals(eventHandler.getReceivedMeter().count(), received);
        Assert.assertEquals(eventHandler.getFilteredMeter().count(), filtered);
        Assert.assertEquals(eventHandler.getSucceededMeter().count(), succeeded);
        Assert.assertEquals(eventHandler.getFailedMeter().count(), failed);
    }
}
