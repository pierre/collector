/*
 * Copyright 2010 Ning, Inc.
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

package com.ning.metrics.collector.endpoint.extractors;

import com.google.inject.Inject;
import org.apache.log4j.Logger;

import com.ning.metrics.serialization.event.Event;
import com.ning.metrics.collector.events.parsing.EventParser;
import com.ning.metrics.collector.events.parsing.EventParsingException;
import com.ning.metrics.collector.events.parsing.ExtractedAnnotation;

/**
 * API versions 1 and 2: query parameters-based API (via GET)
 */
public class QueryParameterEventExtractor implements EventExtractor
{
    private static final Logger log = Logger.getLogger(QueryParameterEventExtractor.class);
    private final EventParser thriftEventParser;

    @Inject
    public QueryParameterEventExtractor(EventParser thriftEventParser)
    {
        this.thriftEventParser = thriftEventParser;
    }

    @Override
    public Event extractEvent(String event, ExtractedAnnotation annotation) throws EventParsingException
    {
        if (event != null) {
            log.debug(String.format("Query parameter to process: %s", event));
            String type = event.substring(0, event.indexOf(","));
            String eventTypeString = event.substring(event.indexOf(",") + 1);

            log.debug(String.format("Event type [%s], event string [%s]", type, eventTypeString));

            return thriftEventParser.parseThriftEvent(type, eventTypeString, annotation);
        }
        else {
            return null;
        }
    }
}