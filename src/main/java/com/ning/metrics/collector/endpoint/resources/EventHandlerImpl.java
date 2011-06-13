/*
 * Copyright 2010-2011 Ning, Inc.
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

import com.google.inject.Inject;
import com.ning.metrics.collector.binder.annotations.EventEndpointRequestFilter;
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.endpoint.EventEndPointStats;
import com.ning.metrics.collector.endpoint.EventStats;
import com.ning.metrics.collector.endpoint.extractors.EventParsingException;
import com.ning.metrics.collector.endpoint.ExtractedAnnotation;
import com.ning.metrics.collector.endpoint.filters.Filter;
import com.ning.metrics.collector.hadoop.processing.EventCollector;
import com.ning.metrics.serialization.event.Event;
import org.apache.log4j.Logger;
import org.weakref.jmx.Managed;

import javax.ws.rs.core.CacheControl;
import javax.ws.rs.core.Response;

public class EventHandlerImpl implements EventHandler
{
    private static final Logger log = Logger.getLogger(EventHandlerImpl.class);

    private final EventCollector collector;

    @SuppressWarnings("unchecked")
    private final Filter requestFilter;
    private volatile boolean collectionEnabled;
    private final CacheControl cacheControl;

    @Inject
    public EventHandlerImpl(
        final EventCollector collector,
        @SuppressWarnings("unchecked") @EventEndpointRequestFilter final Filter requestFilter,
        final CollectorConfig config
    )
    {
        this(collector, requestFilter, config.isEventEndpointEnabled());
    }

    public EventHandlerImpl(
        final EventCollector collector,
        @SuppressWarnings("unchecked") final Filter requestFilter,
        final boolean enabled
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
    //TODO no need for stats
    public Response processEvent(final Event event, final ExtractedAnnotation annotation, final EventEndPointStats stats, final EventStats eventStats)
    {
        stats.updateTotalEvents();

        if (collectionEnabled) {
            if (event == null) {
                final String msg = "Received empty event";
                log.info(msg);
                return handleFailure(Response.Status.BAD_REQUEST, stats, new EventParsingException(msg));
            }
            else {
                // TODO we don't actually use filtering. should we still support this?
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
    public Response handleFailure(final Response.Status status, final EventEndPointStats stats, final Exception e)
    {
        stats.updateFailedEvents();
        return Response.status(status)
            .header("Warning", "199 " + e.toString())
            .cacheControl(cacheControl)
            .build();
    }

    @Managed(description = "enable/disable collection of events")
    public void setCollectionEnabled(final boolean value)
    {
        collectionEnabled = value;
    }

    @Managed(description = "event collection enabled?")
    public boolean getCollectionEnabled()
    {
        return collectionEnabled;
    }
}
