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
import com.ning.metrics.collector.endpoint.extractors.EventExtractor;
import com.ning.metrics.serialization.event.Event;
import com.ning.metrics.collector.events.parsing.EventParsingException;
import com.ning.metrics.collector.events.parsing.ExtractedAnnotation;
import com.ning.metrics.collector.events.processing.EventHandler;
import org.apache.log4j.Logger;

import javax.ws.rs.core.Response;
import java.util.Collection;

/**
 * Event handler for the HTTP GET API.
 * also called within internal event pipeline
 */
public class EventRequestHandler
{
    private static final Logger log = Logger.getLogger(EventRequestHandler.class);

    private final EventExtractor eventExtractor;
    private final EventEndPointStats endPointStats;
    private final EventHandler eventHandler;

    public EventRequestHandler(
            EventHandler eventHandler,
            EventExtractor eventExtractor,
            EventEndPointStats stats
    )
    {
        this.eventExtractor = eventExtractor;
        this.endPointStats = stats;
        this.eventHandler = eventHandler;
    }

    // TODO the statistics we collect here are less relevant now that we're processing collections of events at a time
    public Response handleEventRequest(String eventString, ExtractedAnnotation annotation, EventStats eventStats)
    {
        Collection<? extends Event> events;

        try {
            // do not update stats here, while extracting events. update when processing.
            events = eventExtractor.extractEvent(eventString, annotation);
            eventStats.recordExtracted();
        }
        catch (EventParsingException e) {
            log.info(String.format("Unable to extract event: %s [%s]", eventString, annotation.toString()), e);
            // If one event fails, the entire collection of events is rejected
            return eventHandler.handleFailure(Response.Status.BAD_REQUEST, endPointStats, e);
        }
        catch (RuntimeException e) {
            log.info(String.format("Unable to extract event: %s [%s]", eventString, annotation.toString()), e);
            // If one event fails, the entire collection of events is rejected
            return eventHandler.handleFailure(Response.Status.INTERNAL_SERVER_ERROR, endPointStats, e);
        }

        if (events == null) {
            if (eventString == null) {
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

        for (Event event : events) {
            try {
                log.debug(String.format("Processing event %s", event));
                // We ignore the Response here (see below)
                eventHandler.processEvent(event, annotation, endPointStats, eventStats);
            }
            catch (RuntimeException e) {
                failCount++;
                log.info(String.format("Exception while processing event: %s [%s]", eventString, annotation.toString()), e);
                // We don't care about the Response returned here, but we do care about incrementing stats about failed events
                eventHandler.handleFailure(Response.Status.INTERNAL_SERVER_ERROR, endPointStats, e);
            }
        }

        if (failCount > 0) {
            log.warn(String.format("%d total exceptions while processing event: %s [%s]", failCount, eventString, annotation.toString()));
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
}
