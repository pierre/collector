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

import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.endpoint.ParsedRequest;
import com.ning.metrics.collector.endpoint.extractors.DeserializationType;
import com.ning.metrics.collector.endpoint.extractors.EventDeserializerFactory;
import com.ning.metrics.serialization.event.Event;
import com.ning.metrics.serialization.event.EventDeserializer;

import com.google.inject.Inject;
import com.yammer.metrics.Metrics;
import com.yammer.metrics.core.MeterMetric;
import com.yammer.metrics.core.MetricName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.weakref.jmx.Managed;

import javax.ws.rs.core.CacheControl;
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
    private static final Logger log = LoggerFactory.getLogger(EventDeserializerRequestHandler.class);
    private static final String METRICS_GROUP = EventDeserializerRequestHandler.class.getPackage().getName();

    final EventFilterRequestHandler filterRequestHandler;
    final EventDeserializerFactory eventDeserializerFactory;

    private final CacheControl cacheControl;

    // We keep two meters (success and failure) for each DeserializationType
    private final Map<MetricName, MeterMetric> metrics = new HashMap<MetricName, MeterMetric>();
    private final MeterMetric rejectedMeter;
    private final MeterMetric badRequestMeter;

    private volatile boolean collectionEnabled;

    @Inject
    public EventDeserializerRequestHandler(final CollectorConfig config,
                                           final EventFilterRequestHandler filterRequestHandler,
                                           final EventDeserializerFactory deserializerFactory)
    {
        this(config.isEventEndpointEnabled(), filterRequestHandler, deserializerFactory);
    }

    //@VisibleForTesting
    public EventDeserializerRequestHandler(final boolean isCollectionEnabled,
                                           final EventFilterRequestHandler filterRequestHandler,
                                           final EventDeserializerFactory deserializerFactory)
    {
        this.collectionEnabled = isCollectionEnabled;
        this.filterRequestHandler = filterRequestHandler;
        this.eventDeserializerFactory = deserializerFactory;

        rejectedMeter = Metrics.newMeter(new MetricName(METRICS_GROUP, "DeserializationStats", "Rejected"), "events", TimeUnit.SECONDS);
        badRequestMeter = Metrics.newMeter(new MetricName(METRICS_GROUP, "DeserializationStats", "BadRequest"), "events", TimeUnit.SECONDS);

        // Exposes stats per Event type
        for (final DeserializationType deserializationType : DeserializationType.values()) {
            final MetricName successMetricName = getSuccessMetricsKey(deserializationType);
            final MetricName failureMetricName = getFailureMetricsKey(deserializationType);

            metrics.put(successMetricName, Metrics.newMeter(successMetricName, "events", TimeUnit.SECONDS));
            metrics.put(failureMetricName, Metrics.newMeter(failureMetricName, "events", TimeUnit.SECONDS));
        }

        cacheControl = new CacheControl();
        cacheControl.setPrivate(true);
        cacheControl.setNoCache(true);
        cacheControl.setProxyRevalidate(true);
    }

    public Response handleEventRequest(final ParsedRequest parsedRequest)
    {
        // If collection is disabled for this collector, ignore
        if (!collectionEnabled) {
            log.debug("Collection disabled, rejecting request: {}", parsedRequest);
            rejectedMeter.mark();
            return Response.status(Response.Status.SERVICE_UNAVAILABLE)
                           .header("Warning", String.format("199 Collection disabled"))
                           .cacheControl(cacheControl)
                           .build();
        }

        // First, create a deserializer from the request
        final EventDeserializer extractor;
        try {
            extractor = eventDeserializerFactory.getEventDeserializer(parsedRequest);
        }
        // Can occur if the deserializer fails immediately (if the stream/file doesn't begin correctly)
        // fail fast and notify the sender that their message is improperly formatted
        catch (IOException e) {
            return handleDeserializationFailure(parsedRequest, 0, 0, e);
        }

        // Then, try to deserialize and process the event(s)
        int successes = 0;
        int failures = 0;
        try {
            while (extractor.hasNextEvent()) {
                final Event event = extractor.getNextEvent();
                if (event == null) {
                    continue;
                }
                log.debug(String.format("Processing event %s", event));

                final DeserializationType deserializationType = parsedRequest.getContentType();
                if (filterRequestHandler.processEvent(event, parsedRequest)) {
                    metrics.get(getSuccessMetricsKey(deserializationType)).mark();
                    successes++;
                }
                else {
                    metrics.get(getFailureMetricsKey(deserializationType)).mark();
                    failures++;
                }
            }
        }
        // Catch IOException (getNextEvent() failed) and RuntimeExceptions
        catch (Exception e) {
            return handleDeserializationFailure(parsedRequest, successes, failures, e);
        }

        return buildResponse(parsedRequest, successes, failures);
    }

    private Response buildResponse(final ParsedRequest parsedRequest, final int successes, final int failures)
    {
        if (failures == 0) {
            return Response.status(Response.Status.ACCEPTED)
                           .cacheControl(cacheControl)
                           .build();
        }
        else {
            log.warn("Some events in the request couldn't be processed: {} successes/{} failures [{}]", new Object[]{successes, failures, parsedRequest.toString()});
            return Response.status(Response.Status.ACCEPTED)
                           .header("Warning", String.format("199 [%d successes] [%d failures]", successes, failures))
                           .cacheControl(cacheControl)
                           .build();
        }
    }

    public Response handleDeserializationFailure(final ParsedRequest parsedRequest, final int successes, final int failures, final Exception e)
    {
        log.warn(String.format("Exception while extracting or processing an event. [%s] %s", parsedRequest.toString(), e.toString()));
        badRequestMeter.mark();

        return Response.status(Response.Status.BAD_REQUEST)
                       .header("Warning", String.format("199 [%d successes] [%d failures] [%s]", successes, failures, e.toString()))
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

    //@VisibleForTesting
    MetricName getSuccessMetricsKey(final DeserializationType type)
    {
        return new MetricName(METRICS_GROUP, "DeserializationStats", type.toString() + "_SUCCESS");
    }

    //@VisibleForTesting
    MetricName getFailureMetricsKey(final DeserializationType type)
    {
        return new MetricName(METRICS_GROUP, "DeserializationStats", type.toString() + "_FAILURE");
    }

    //@VisibleForTesting
    Map<MetricName, MeterMetric> getMetrics()
    {
        return metrics;
    }

    //@VisibleForTesting
    MeterMetric getRejectedMeter()
    {
        return rejectedMeter;
    }

    //@VisibleForTesting
    MeterMetric getBadRequestMeter()
    {
        return badRequestMeter;
    }
}
