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
import com.ning.metrics.collector.endpoint.extractors.EventExtractor;
import com.ning.metrics.collector.endpoint.extractors.EventParsingException;
import com.ning.metrics.serialization.event.Event;
import com.ning.metrics.serialization.smile.SmileEnvelopeEventExtractor;
import org.apache.log4j.Logger;

import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.Collection;

/**
 * Event handler for the HTTP API (GET and POST).
 */
public class EventRequestHandler
{
    private static final Logger log = Logger.getLogger(EventRequestHandler.class);

    private final EventExtractor eventExtractor;
    private final EventEndPointStats endPointStats;
    private final EventHandler eventHandler;

    public EventRequestHandler(
        final EventHandler eventHandler,
        final EventExtractor eventExtractor,
        final EventEndPointStats stats
    )
    {
        this.eventExtractor = eventExtractor;
        this.endPointStats = stats;
        this.eventHandler = eventHandler;
    }

    // TODO the statistics we collect here are less relevant now that we're processing collections of events at a time
    public Response handleEventRequest(final ExtractedAnnotation annotation, final EventStats eventStats)
    {
        final String eventName = annotation.getEventName();
        final Collection<? extends Event> events;

        try {
            // do not update stats here, while extracting events. update when processing.
            events = eventExtractor.extractEvent(annotation);
            eventStats.recordExtracted();
        }
        catch (EventParsingException e) {
            log.info(String.format("Unable to extract event: %s [%s]", eventName, annotation.toString()), e);
            // If one event fails, the entire collection of events is rejected
            return eventHandler.handleFailure(Response.Status.BAD_REQUEST, endPointStats, e);
        }
        catch (RuntimeException e) {
            log.info(String.format("Unable to extract event: %s [%s]", eventName, annotation.toString()), e);
            // If one event fails, the entire collection of events is rejected
            return eventHandler.handleFailure(Response.Status.INTERNAL_SERVER_ERROR, endPointStats, e);
        }

        if (events == null) {
            if (eventName == null) {
                log.warn("No event type specified");
                return eventHandler.handleFailure(Response.Status.BAD_REQUEST, endPointStats, new IllegalArgumentException("Event name wasn't specified."));
            }
            else {
                log.warn("No event specified");
                return eventHandler.handleFailure(Response.Status.BAD_REQUEST, endPointStats, new IllegalArgumentException("No event specified."));
            }
        }

        // We were able to parse all events
        int failCount = 0;

        for (final Event event : events) {
            try {
                log.debug(String.format("Processing event %s", event));
                // We ignore the Response here (see below)
                eventHandler.processEvent(event, annotation, endPointStats, eventStats);
            }
            catch (RuntimeException e) {
                failCount++;
                log.info(String.format("Exception while processing event: %s [%s]", eventName, annotation.toString()), e);
                // We don't care about the Response returned here, but we do care about incrementing stats about failed events
                eventHandler.handleFailure(Response.Status.INTERNAL_SERVER_ERROR, endPointStats, e);
            }
        }

        if (failCount > 0) {
            log.warn(String.format("%d total exceptions while processing event: %s [%s]", failCount, eventName, annotation.toString()));
        }

        // Even though some events weren't processed correctly, we still return a 202.
        // I.e. if the client sent 10 events, and we were able to process only 5 of them, we effectively
        // drop the remaining 5 (the eventtracker library won't quarantine the original 10).
        // Making the whole process atomic is a bit tricky and we want to avoid receiving duplicates.
        // Also, we expect to have bad events (sent by the browser for instance). It would be suboptimal
        // to drop the whole collection even if only a single event is bad.
        // The only reason we won't return ACCEPTED is when the event is not parsable (see above).
        return Response.status(Response.Status.ACCEPTED).build();
    }

    public Response handleJsonRequest(final boolean plainJson, final EventStats eventStats, final ExtractedAnnotation annotation)
    {
        // TODO right now all the events in a file are sharing the same eventStats

        final SmileEnvelopeEventExtractor extractor;
        try {
            extractor = new SmileEnvelopeEventExtractor(annotation.getInputStream(), plainJson);
        }
        catch (RuntimeException e) {
            log.info(String.format("Unable to extract event. [%s]", annotation.toString()), e);
            // If one event fails, the entire collection of events is rejected
            return eventHandler.handleFailure(Response.Status.INTERNAL_SERVER_ERROR, endPointStats, e);
        }
        catch (IOException e) {
            // TODO
            log.info(String.format("Unable to extract event. [%s]", annotation.toString()), e);
            // If one event fails, the entire collection of events is rejected
            return eventHandler.handleFailure(Response.Status.BAD_REQUEST, endPointStats, e);
        }

        int failCount = 0;
        int successCount = 0;

        while (true) {
            try {
                final Event event = extractor.extractNextEvent();
                eventStats.recordExtracted(); // TODO see above TODO (all events share this eventStats object)

                // if has reached EOF
                if (event == null) {
                    break;
                }

                log.debug(String.format("Processing event %s", event));
                // We ignore the Response here (see below)
                eventHandler.processEvent(event, annotation, endPointStats, eventStats);
                successCount++;
            }
            // IOExceptions are thrown by extractEvent
            catch (IOException e) {
                failCount++;
                log.warn(String.format("Exception while extracting or processing an event: [%s] [%s]", annotation.toString(), e.getLocalizedMessage()));

                eventHandler.handleFailure(Response.Status.BAD_REQUEST, endPointStats, new IllegalArgumentException("Invalid body formatting."));
            }
            catch (RuntimeException e) {
                failCount++;
                log.warn(String.format("Exception while extracting or processing an event. [%s] [%s]", annotation.toString(), e.getLocalizedMessage());

                // We don't care about the Response returned here, but we do care about incrementing stats about failed events
                eventHandler.handleFailure(Response.Status.INTERNAL_SERVER_ERROR, endPointStats, e);
            }
        }

        // if no events specified
        if (failCount == 0 && successCount == 0) {
            return eventHandler.handleFailure(Response.Status.BAD_REQUEST, endPointStats, new IllegalArgumentException("No events specified."));
        }
        // if all fail
        else if (successCount == 0) {
            // TODO give a more appropriate response & exception
            return eventHandler.handleFailure(Response.Status.BAD_REQUEST, endPointStats, new IllegalArgumentException("No valid events specified."));
        }
        // if some fail but some succeed
        else if (failCount > 0) {
            log.warn(String.format("%d total exceptions while processing events. [%s]", failCount, annotation.toString()));
        }

        // if we accept at least one event, return a 202.
        // i.e. we drop the failed events
        return Response.status(Response.Status.ACCEPTED).build();

    }
}
