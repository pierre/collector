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
import com.ning.metrics.collector.binder.annotations.InternalEventRequestHandler;
import com.ning.metrics.collector.endpoint.EventStats;
import com.ning.metrics.collector.endpoint.extractors.ExtractedAnnotation;
import com.ning.metrics.collector.endpoint.extractors.ParsedRequest;
import com.ning.metrics.serialization.event.Granularity;
import org.joda.time.DateTime;

import javax.servlet.ServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.ByteArrayInputStream;

/**
 * Internal event API
 */
@Path("/rest/1.0/event")
public class BodyResource
{
    private static final String APPLICATION_JSON_SMILE = "application/json+smile";
    private static final String NING_THRIFT = "ning/thrift";

    private final EventRequestHandler requestHandler;

    @Inject
    public BodyResource(@InternalEventRequestHandler final EventRequestHandler requestHandler)
    {
        this.requestHandler = requestHandler;
    }

    @POST
    @Consumes(NING_THRIFT)
    @Produces(MediaType.TEXT_PLAIN)
    public Response postThrift(
        @QueryParam("name") final String eventName,
        @QueryParam("date") final String eventDateTimeString,
        @QueryParam(Granularity.GRANULARITY_QUERY_PARAM) final String eventGranularity,
        final byte[] content,
        @Context final HttpHeaders httpHeaders,
        @Context final ServletRequest request
    )
    {
        final EventStats eventStats = new EventStats();
        final DateTime eventDateTime = new DateTime(eventDateTimeString);
        final ExtractedAnnotation annotation = new ParsedRequest(eventName, httpHeaders, new ByteArrayInputStream(content), eventDateTime, eventGranularity, request.getRemoteAddr(), NING_THRIFT);
        return requestHandler.handleEventRequest(annotation, eventStats);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response postJson(
        @QueryParam("name") final String eventName,
        @QueryParam("date") final String eventDateTimeString,
        @QueryParam(Granularity.GRANULARITY_QUERY_PARAM) final String eventGranularity,
        final byte[] content,
        @Context final HttpHeaders httpHeaders,
        @Context final ServletRequest request
    )
    {
        final EventStats eventStats = new EventStats();
        final DateTime eventDateTime = new DateTime(eventDateTimeString);
        final ExtractedAnnotation annotation = new ParsedRequest(eventName, httpHeaders, new ByteArrayInputStream(content), eventDateTime, eventGranularity, request.getRemoteAddr(), MediaType.APPLICATION_JSON);
        return requestHandler.handleEventRequest(annotation, eventStats);
    }

    @POST
    @Consumes(APPLICATION_JSON_SMILE)
    @Produces(MediaType.TEXT_PLAIN)
    public Response postSmile(
        @QueryParam("name") final String eventName,
        @QueryParam("date") final String eventDateTimeString,
        @QueryParam(Granularity.GRANULARITY_QUERY_PARAM) final String eventGranularity,
        final byte[] content,
        @Context final HttpHeaders httpHeaders,
        @Context final ServletRequest request
    )
    {
        final EventStats eventStats = new EventStats();
        final DateTime eventDateTime = new DateTime(eventDateTimeString);
        final ExtractedAnnotation annotation = new ParsedRequest(eventName, httpHeaders, new ByteArrayInputStream(content), eventDateTime, eventGranularity, request.getRemoteAddr(), APPLICATION_JSON_SMILE);
        return requestHandler.handleEventRequest(annotation, eventStats);
    }
}
