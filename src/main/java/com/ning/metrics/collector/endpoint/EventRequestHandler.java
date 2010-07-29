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

package com.ning.metrics.collector.endpoint;

import org.apache.log4j.Logger;

import com.ning.metrics.collector.events.Event;
import com.ning.metrics.collector.events.parsing.EventParsingException;
import com.ning.metrics.collector.events.parsing.ExtractedAnnotation;
import com.ning.metrics.collector.events.processing.EventHandler;

import javax.ws.rs.core.Response;

public class EventRequestHandler
{
    private static final Logger log = Logger.getLogger(EventRequestHandler.class);

    private final EventExtractor eventExtractor;
    private final EventEndPointStats stats;
    private final EventHandler eventHandler;

    public EventRequestHandler(
        EventHandler eventHandler,
        EventExtractor eventExtractor,
        EventEndPointStats stats
    )
    {
        this.eventExtractor = eventExtractor;
        this.stats = stats;
        this.eventHandler = eventHandler;
    }

    public Response handleEventRequest(String eventString, ExtractedAnnotation annotation)
    {
        try {
            Event event = eventExtractor.extractEvent(eventString, annotation);
            log.debug(String.format("Processing event %s", event));
            return eventHandler.processEvent(event, annotation, stats);
        }
        catch (EventParsingException e) {
            stats.updateTotalEvents();

            log.info(String.format("Unable to process event: %s [%s]", eventString, annotation.toString()), e);
            return eventHandler.handleFailure(Response.Status.BAD_REQUEST, stats, e);
        }
        catch (RuntimeException e) {
            log.info(String.format("Exception while processing event: %s [%s]", eventString, annotation.toString()), e);
            return eventHandler.handleFailure(Response.Status.INTERNAL_SERVER_ERROR, stats, e);
        }
    }
}