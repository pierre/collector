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

import com.ning.metrics.collector.endpoint.ParsedRequest;
import com.ning.metrics.collector.endpoint.extractors.DeserializationType;
import com.ning.metrics.serialization.event.Granularity;

import com.google.inject.Inject;
import com.yammer.metrics.annotation.Timed;
import org.joda.time.DateTime;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

/**
 * Version 1 of the collector's external API.
 */
@Path("/1")
public class CollectorResource
{
    private final EventDeserializerRequestHandler requestHandler;

    @Inject
    public CollectorResource(final EventDeserializerRequestHandler requestHandler)
    {
        this.requestHandler = requestHandler;
    }

    @GET
    @Timed(name = "GET_API")
    public Response get(@QueryParam("v") final String eventName,
                        @QueryParam("date") final String eventDateTimeString,
                        @QueryParam(Granularity.GRANULARITY_QUERY_PARAM) final String eventGranularity,
                        @Context final HttpHeaders httpHeaders,
                        @Context final HttpServletRequest request)
    {
        final DateTime eventDateTime = new DateTime(eventDateTimeString);
        final ParsedRequest parsedRequest = new ParsedRequest(eventName, httpHeaders, eventDateTime,
                                                              eventGranularity, request.getRemoteAddr(), DeserializationType.DECIMAL_QUERY);
        return requestHandler.handleEventRequest(parsedRequest);
    }
}
