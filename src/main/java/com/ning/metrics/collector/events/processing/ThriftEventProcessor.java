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
import com.ning.metrics.collector.binder.annotations.InternalEventEndPointStats;
import com.ning.metrics.collector.endpoint.EventEndPointStats;
import com.ning.metrics.collector.endpoint.EventStats;
import com.ning.metrics.collector.events.Event;
import com.ning.metrics.collector.events.data.ThriftEnvelopeEvent;
import com.ning.metrics.collector.events.parsing.EventParsingException;
import com.ning.metrics.collector.events.parsing.ExtractedAnnotation;
import com.ning.serialization.ThriftEnvelope;
import org.apache.log4j.Logger;
import org.apache.thrift.TException;
import org.joda.time.DateTime;

import javax.ws.rs.core.Response;

public class ThriftEventProcessor
{
    private static final Logger log = Logger.getLogger(ThriftEventProcessor.class);
    private final EventEndPointStats stats;
    private final EventHandler eventHandler;

    @Inject
    public ThriftEventProcessor(
        EventHandler eventHandler,
        @InternalEventEndPointStats EventEndPointStats stats
    )
    {
        this.eventHandler = eventHandler;
        this.stats = stats;
    }

    public Response processEvent(ThriftEvent realtimeEvent, ExtractedAnnotation annotation, EventStats eventStats)
    {
        try {
            ThriftEnvelope envelope = realtimeEvent.getThriftEnvelope();

            if (envelope == null) {
                throw new EventParsingException("Null payload");
            }

            Event event = new ThriftEnvelopeEvent(new DateTime(realtimeEvent.getTimestamp()), envelope);
            eventStats.recordExtracted();

            log.debug(String.format("receiving event of type %s", envelope.getTypeName()));
            return eventHandler.processEvent(event, annotation, stats, eventStats);
        }
        /* Null payload */
        catch (EventParsingException e) {
            stats.updateTotalEvents();
            return eventHandler.handleFailure(Response.Status.BAD_REQUEST, stats, eventStats, e);
        }
        /* Invalid event, serialization error */
        catch (TException e) {
            stats.updateTotalEvents();

            log.info(String.format("Unable to process event: %s [%s]", realtimeEvent.toString(), annotation.toString()), e);
            return eventHandler.handleFailure(Response.Status.BAD_REQUEST, stats, eventStats, e);
        }
        catch (RuntimeException e) {
            log.info(String.format("Exception while processing event: %s [%s]", realtimeEvent.toString(), annotation.toString()), e);
            return eventHandler.handleFailure(Response.Status.INTERNAL_SERVER_ERROR, stats, eventStats, e);
        }
    }
}