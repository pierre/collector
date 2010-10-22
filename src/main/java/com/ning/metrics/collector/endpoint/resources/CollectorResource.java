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
import org.joda.time.DateTime;

import com.ning.metrics.collector.binder.annotations.ExternalEventRequestHandler;
import com.ning.metrics.collector.events.parsing.EventExtractorUtil;
import com.ning.metrics.collector.events.parsing.ParsedRequest;
import com.ning.metrics.collector.util.Granularity;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

/**
 * Version 1 of the collector's external API
 */
@Path("/1")
public class CollectorResource
{
    private final EventRequestHandler requestHandler;
    private final EventExtractorUtil extractorUtil;

    @Inject
    public CollectorResource(
        @ExternalEventRequestHandler EventRequestHandler requestHandler,
        EventExtractorUtil extractorUtil
    )
    {
        this.requestHandler = requestHandler;
        this.extractorUtil = extractorUtil;
    }

    @GET
    public Response get(
        @QueryParam("v") String event,
        @QueryParam("date") String eventDateTimeString,
        @QueryParam(Granularity.GRANULARITY_QUERY_PARAM) String eventGranularity,
        @Context HttpHeaders httpHeaders

    )
    {
        DateTime eventDateTime = new DateTime(eventDateTimeString);
        return requestHandler.handleEventRequest(event, new ParsedRequest(httpHeaders, eventDateTime, eventGranularity, extractorUtil));
    }
}
