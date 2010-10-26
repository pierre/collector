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

import com.google.inject.Inject;
import com.ning.metrics.collector.binder.annotations.InternalEventRequestHandler;
import com.ning.metrics.collector.endpoint.EventStats;
import com.ning.metrics.collector.events.parsing.EventExtractorUtil;
import com.ning.metrics.collector.events.parsing.ParsedRequest;
import com.ning.metrics.collector.util.Granularity;
import org.joda.time.DateTime;

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
public class ThriftResource
{
    private final EventRequestHandler requestHandler;
    private final EventExtractorUtil extractorUtil;

    @Inject
    public ThriftResource(
        @InternalEventRequestHandler EventRequestHandler requestHandler,
        EventExtractorUtil extractorUtil
    )
    {
        this.requestHandler = requestHandler;
        this.extractorUtil = extractorUtil;
    }

    @POST
    @Consumes("ning/thrift")
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/rest/1.0/event")
    public Response post(
        @QueryParam("name") String eventName,
        @QueryParam("date") String eventDateTimeString,
        @QueryParam(Granularity.GRANULARITY_QUERY_PARAM) String eventGranularity,
        byte[] content,
        @Context HttpHeaders request
    )
    {
        EventStats eventStats = new EventStats();
        DateTime eventDateTime = new DateTime(eventDateTimeString);
        return requestHandler.handleEventRequest(eventName, new ParsedRequest(request, new ByteArrayInputStream(content), eventDateTime, eventGranularity, extractorUtil), eventStats);
    }
}