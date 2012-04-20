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

import com.ning.metrics.collector.endpoint.EventEndPointStats;
import com.ning.metrics.collector.endpoint.EventStats;
import com.ning.metrics.collector.endpoint.ExtractedAnnotation;
import com.ning.metrics.collector.endpoint.extractors.DeserializationType;
import com.ning.metrics.collector.endpoint.extractors.EventDeserializerFactory;
import com.ning.metrics.collector.endpoint.resources.EventHandler;
import com.ning.metrics.serialization.event.Event;
import com.ning.metrics.serialization.event.EventDeserializer;
import com.yammer.metrics.Metrics;
import com.yammer.metrics.core.MeterMetric;
import org.apache.log4j.Logger;

import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Event handler for the HTTP API (GET and POST).
 */
public class EventDeserializerRequestHandler
{
    private static final Logger log = Logger.getLogger(EventDeserializerRequestHandler.class);

    private final EventEndPointStats endPointStats;
    private final EventHandler eventHandler;

    private final EventDeserializerFactory eventDeserializerFactory;
    private final Map<String, MeterMetric> metrics = new HashMap<String, MeterMetric>();

    public EventDeserializerRequestHandler(
            final EventHandler eventHandler,
            final EventEndPointStats stats,
            final EventDeserializerFactory eventDeserializerFactory
    )
    {
        this.endPointStats = stats;
        this.eventHandler = eventHandler;
        this.eventDeserializerFactory = eventDeserializerFactory;

        // Exposes stats per Event type
        for (final DeserializationType deserializationType : DeserializationType.values()) {
            metrics.put(getSuccessMetricsKey(deserializationType),
                Metrics.newMeter(EventDeserializerRequestHandler.class, getSuccessMetricsKey(deserializationType), "events", TimeUnit.SECONDS));
            metrics.put(getFailureMetricsKey(deserializationType),
                Metrics.newMeter(EventDeserializerRequestHandler.class, getFailureMetricsKey(deserializationType), "events", TimeUnit.SECONDS));
        }
    }

    public Response handleEventRequest(final ExtractedAnnotation annotation, final EventStats eventStats)
    {
        final EventDeserializer extractor;
        final DeserializationType type = annotation.getContentType();

        try {
            extractor = eventDeserializerFactory.getEventDeserializer(annotation);
        }
        // Can occur if the deserializer fails immediately (if the stream/file doesn't begin correctly)
        // fail fast and notify the sender that their message is improperly formatted
        catch (IOException e) {
            metrics.get(getFailureMetricsKey(type)).mark();
            return eventHandler.handleFailure(Response.Status.BAD_REQUEST, endPointStats, e);
        }

        int success = 0;
        try {
            while (extractor.hasNextEvent()) {
                final Event event = extractor.getNextEvent();

                log.debug(String.format("Processing event %s", event));
                // We ignore the Response here (see below)
                eventHandler.processEvent(event, annotation, endPointStats, eventStats);
                metrics.get(getSuccessMetricsKey(type)).mark();
                success++;
            }
        }
        catch (Exception e) {
            log.warn(String.format("Exception while extracting or processing an event. [%s] %s", annotation.toString(), e.toString()));
            metrics.get(getFailureMetricsKey(type)).mark();
            // Send a 202, but w/ a warning message stating how many succeeded
            return eventHandler.handleFailure(Response.Status.ACCEPTED, endPointStats, new IOException(String.format("[%d successes] %s", success, e.toString())));
        }

        return Response.status(Response.Status.ACCEPTED).build();
    }

    private String getSuccessMetricsKey(final DeserializationType type)
    {
        return type.toString() + "_SUCCES";
    }

    private String getFailureMetricsKey(final DeserializationType type)
    {
        return type.toString() + "_FAILURE";
    }
}
