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

import com.google.inject.Inject;
import com.yammer.metrics.Metrics;
import com.yammer.metrics.core.Meter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class EventFilterRequestHandler
{
    private static final Logger log = LoggerFactory.getLogger(EventFilterRequestHandler.class);

    private final Meter receivedMeter = Metrics.newMeter(EventFilterRequestHandler.class, "Received", "events", TimeUnit.SECONDS);
    private final Meter filteredMeter = Metrics.newMeter(EventFilterRequestHandler.class, "Filtered", "events", TimeUnit.SECONDS);
    private final Meter succeededMeter = Metrics.newMeter(EventFilterRequestHandler.class, "Succeeded", "events", TimeUnit.SECONDS);
    private final Meter failedMeter = Metrics.newMeter(EventFilterRequestHandler.class, "Failed", "events", TimeUnit.SECONDS);

    private final EventCollector collector;
    private final Filter<ParsedRequest> requestFilter;

    @Inject
    public EventFilterRequestHandler(final EventCollector collector, final Filter<ParsedRequest> requestFilter)
    {
        this.collector = collector;
        this.requestFilter = requestFilter;
    }

    public boolean processEvent(final Event event, final ParsedRequest parsedRequest)
    {
        receivedMeter.mark();

        final String eventName = event.getName();
        if (requestFilter.passesFilter(eventName, parsedRequest)) {
            filteredMeter.mark();
            // Mark the processing as succeeded: the client doesn't need to know (and shouldn't retry) if the collector
            // is configured to ignore such events
            return true;
        }
        else {
            // At this point, the event will be dispatched to the various backend modules
            log.debug("Receiving event of type {}", eventName);

            if (collector.collectEvent(event)) {
                succeededMeter.mark();
                return true;
            }
            else {
                failedMeter.mark();
                return false;
            }
        }
    }

    //@VisibleForTesting
    Meter getReceivedMeter()
    {
        return receivedMeter;
    }

    //@VisibleForTesting
    Meter getFilteredMeter()
    {
        return filteredMeter;
    }

    //@VisibleForTesting
    Meter getSucceededMeter()
    {
        return succeededMeter;
    }

    //@VisibleForTesting
    Meter getFailedMeter()
    {
        return failedMeter;
    }
}
