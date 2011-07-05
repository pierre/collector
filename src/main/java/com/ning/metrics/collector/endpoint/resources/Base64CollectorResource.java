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
import com.ning.metrics.collector.binder.annotations.Base64ExternalEventRequestHandler;
import com.ning.metrics.collector.endpoint.EventStats;
import com.ning.metrics.collector.endpoint.ExtractedAnnotation;
import com.ning.metrics.collector.endpoint.ParsedRequest;
import com.ning.metrics.collector.endpoint.extractors.DeserializationType;
import com.ning.metrics.serialization.event.Granularity;
import com.yammer.metrics.guice.Timed;
import org.joda.time.DateTime;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Version 2 of the collector's external API encodes numbers as in a custom base64 encoding.
 */
@Path("/2")
public class Base64CollectorResource
{
    private final EventRequestHandler requestHandler;

    @Inject
    public Base64CollectorResource(@Base64ExternalEventRequestHandler final EventRequestHandler requestHandler)
    {
        this.requestHandler = requestHandler;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Timed(name = "GET_Base64_API")
    public Response get(
        @QueryParam("v") final String eventName,
        @QueryParam("date") final String eventDateTimeString,
        @QueryParam(Granularity.GRANULARITY_QUERY_PARAM) final String eventGranularity,
        @Context final HttpHeaders httpHeaders,
        @Context final HttpServletRequest request
    )
    {
        final EventStats eventStats = new EventStats();
        final DateTime eventDateTime = new DateTime(eventDateTimeString);
        final ExtractedAnnotation annotation = new ParsedRequest(eventName, httpHeaders, eventDateTime,
            eventGranularity, request.getRemoteAddr(), DeserializationType.BASE_64_QUERY);
        return requestHandler.handleEventRequest(annotation, eventStats);
    }
}
