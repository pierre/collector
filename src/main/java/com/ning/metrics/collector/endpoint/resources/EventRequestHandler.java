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

/**
 * Event handler for the HTTP GET API.
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

    public Response handleEventRequest(String eventString, ExtractedAnnotation annotation, EventStats eventStats)
    {
        try {
            Event event = eventExtractor.extractEvent(eventString, annotation);
            eventStats.recordExtracted();

            log.debug(String.format("Processing event %s", event));
            return eventHandler.processEvent(event, annotation, endPointStats, eventStats);
        }
        catch (EventParsingException e) {
            endPointStats.updateTotalEvents();

            log.info(String.format("Unable to process event: %s [%s]", eventString, annotation.toString()), e);
            return eventHandler.handleFailure(Response.Status.BAD_REQUEST, endPointStats, eventStats, e);
        }
        catch (RuntimeException e) {
            log.info(String.format("Exception while processing event: %s [%s]", eventString, annotation.toString()), e);
            return eventHandler.handleFailure(Response.Status.INTERNAL_SERVER_ERROR, endPointStats, eventStats, e);
        }
    }
}