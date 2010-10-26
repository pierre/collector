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

import com.google.inject.Inject;
import com.ning.metrics.collector.binder.annotations.EventEndpointRequestFilter;
import com.ning.metrics.collector.binder.annotations.Managed;
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.endpoint.EventEndPointStats;
import com.ning.metrics.collector.endpoint.EventStats;
import com.ning.metrics.collector.events.Event;
import com.ning.metrics.collector.events.parsing.EventParsingException;
import com.ning.metrics.collector.events.parsing.ExtractedAnnotation;
import com.ning.metrics.collector.util.Filter;
import org.apache.log4j.Logger;

import javax.ws.rs.core.CacheControl;
import javax.ws.rs.core.Response;

public class EventHandlerImpl implements EventHandler
{
    private static final Logger log = Logger.getLogger(EventHandlerImpl.class);

    private final EventCollector collector;
    private final Filter requestFilter;
    private volatile boolean collectionEnabled;
    private final CacheControl cacheControl;

    @SuppressWarnings("unused")
    @Inject
    public EventHandlerImpl(
        EventCollector collector,
        @EventEndpointRequestFilter Filter requestFilter,
        CollectorConfig config
    )
    {
        this(collector, requestFilter, config.isEventEndpointEnabled());
    }

    public EventHandlerImpl(
        EventCollector collector,
        Filter requestFilter,
        boolean enabled
    )
    {
        this.collector = collector;
        this.requestFilter = requestFilter;
        this.collectionEnabled = enabled;

        cacheControl = new CacheControl();
        cacheControl.setPrivate(true);
        cacheControl.setNoCache(true);
        cacheControl.setProxyRevalidate(true);
    }

    @SuppressWarnings("unchecked")
    @Override
    //TODO no  need for stats
    public Response processEvent(Event event, ExtractedAnnotation annotation, EventEndPointStats stats, EventStats eventStats)
    {
        stats.updateTotalEvents();

        if (collectionEnabled) {
            if (event == null) {
                String msg = "Received empty event";
                log.info(msg);
                return handleFailure(Response.Status.BAD_REQUEST, stats, eventStats, new EventParsingException(msg));
            }
            else {
                if (requestFilter.passesFilter(event.getName(), annotation)) {
                    stats.updateFilteredEvents();
                    return Response.status(Response.Status.ACCEPTED).cacheControl(cacheControl).build();
                }
                else {
                    log.debug(String.format("Receiving event of type %s", event.getName()));

                    if (collector.collectEvent(event, eventStats)) {
                        stats.updateSuccesfulEventCounters(event);
                        return Response.status(Response.Status.ACCEPTED).cacheControl(cacheControl).build();
                    }
                    else {
                        stats.updateRejectedEvents();
                        log.warn(String.format("Event rejected: %s", event));
                        return Response.status(Response.Status.SERVICE_UNAVAILABLE).cacheControl(cacheControl).build();
                    }
                }
            }
        }
        else {
            stats.updateRejectedEvents();

            log.info(String.format("Collection disabled, rejecting event: %s", event));
            return Response.status(Response.Status.SERVICE_UNAVAILABLE).cacheControl(cacheControl).build();
        }
    }

    @Override
    public Response handleFailure(Response.Status status, EventEndPointStats stats, EventStats eventStats, Exception e)
    {
        stats.updateFailedEvents();
        return Response.status(status)
            .header("Warning", "199 " + e.toString())
            .cacheControl(cacheControl)
            .build();
    }

    @Managed(description = "enable/disable collection of events")
    public void setCollectionEnabled(boolean value)
    {
        collectionEnabled = value;
    }

    @Managed(description = "event collection enabled?")
    public boolean getCollectionEnabled()
    {
        return collectionEnabled;
    }
}
