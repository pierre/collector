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

import com.ning.metrics.collector.endpoint.EventEndPointStats;
import com.ning.metrics.collector.endpoint.EventStats;
import com.ning.metrics.collector.endpoint.ExtractedAnnotation;
import com.ning.metrics.collector.endpoint.extractors.DeserializationType;
import com.ning.metrics.collector.endpoint.extractors.EventDeserializerFactory;
import com.ning.metrics.serialization.event.Event;
import com.ning.metrics.serialization.event.EventDeserializer;
import org.apache.log4j.Logger;
import org.weakref.jmx.Managed;

import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Event handler for the HTTP API (GET and POST).
 */
public class EventRequestHandler
{
    private static final Logger log = Logger.getLogger(EventRequestHandler.class);

    private final EventEndPointStats endPointStats;
    private final EventHandler eventHandler;

    private final HashMap<String, AtomicInteger> stats = new HashMap<String, AtomicInteger>(10);
    private EventDeserializerFactory eventDeserializerFactory;

    public EventRequestHandler(
        final EventHandler eventHandler,
        final EventEndPointStats stats,
        final EventDeserializerFactory eventDeserializerFactory
    )
    {
        this.endPointStats = stats;
        this.eventHandler = eventHandler;
        this.eventDeserializerFactory = eventDeserializerFactory;
    }

    public Response handleEventRequest(final ExtractedAnnotation annotation, final EventStats eventStats)
    {

        Event event;
        int successCount = 0;
        EventDeserializer extractor;
        DeserializationType type = annotation.getContentType();

        try {
            extractor = eventDeserializerFactory.getEventDeserializer(annotation);
        }
        // can occur if the deserializer fails immediately (if the stream/file doesn't begin correctly)
        // fail fast and notify the sender that their message is improperly formatted
        catch (IOException e) {
            getFailures(type).incrementAndGet();
            return eventHandler.handleFailure(Response.Status.BAD_REQUEST, endPointStats, e);
        }

        try {
            while (extractor.hasNextEvent()) {
                event = extractor.getNextEvent();

                log.debug(String.format("Processing event %s", event));
                // We ignore the Response here (see below)
                eventHandler.processEvent(event, annotation, endPointStats, eventStats);
                getSuccesses(type).incrementAndGet();
            }
        }
        catch (IOException e) {
            log.warn(String.format("Exception while extracting or processing an event. [%s] %s", annotation.toString(), e.toString()));
            getFailures(type).incrementAndGet();
            // send a 202, but w/ a warning message stating how many succeeded
            return eventHandler.handleFailure(Response.Status.ACCEPTED, endPointStats, new IOException(String.format("[%d successes] %s", successCount, e.getMessage())));
        }

        return Response.status(Response.Status.ACCEPTED).build();
    }

    private AtomicInteger getSuccesses(final DeserializationType type)
    {
        final String key = "s|" + type.name();
        return getStat(key);
    }

    private AtomicInteger getFailures(final DeserializationType type)
    {
        final String key = "f|" + type.name();
        return getStat(key);
    }

    private AtomicInteger getStat(String key) {
        AtomicInteger stat = stats.get(key);

        if (stat == null) {
            stat = new AtomicInteger(0);
            stats.put(key, stat);
        }

        return stat;
    }

    @Managed(description = "Number of Thrift events the collector successfully deserialized")
    public long getThriftSuccess()
    {
        return getSuccesses(DeserializationType.THRIFT).get();
    }

    @Managed(description = "Number of Thrift requests the collector couldn't fully deserialize")
    public long getThriftFailure()
    {
        return getFailures(DeserializationType.THRIFT).get();
    }

    @Managed(description = "Number of Smile events the collector successfully deserialized")
    public long getSmileSuccess()
    {
        return getSuccesses(DeserializationType.JSON).get() +
            getSuccesses(DeserializationType.SMILE).get();
    }

    @Managed(description = "Number of Smile requests the collector couldn't fully deserialize")
    public long getSmileFailure()
    {
        return getFailures(DeserializationType.JSON).get() +
            getFailures(DeserializationType.SMILE).get();
    }

    @Managed(description = "Number of GET requests the collector couldn't fully deserialize")
    public long getQueryFailure()
    {
        return getFailures(DeserializationType.DECIMAL_QUERY).get() +
            getFailures(DeserializationType.BASE_64_QUERY).get();
    }

    @Managed(description = "Number of Thrift events from GET API the collector successfully deserialized")
    public long getQuerySuccess()
    {
        return getFailures(DeserializationType.DECIMAL_QUERY).get() +
            getFailures(DeserializationType.BASE_64_QUERY).get();
    }
}
