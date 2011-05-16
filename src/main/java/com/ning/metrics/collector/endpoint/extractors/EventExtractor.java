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

package com.ning.metrics.collector.endpoint.extractors;

import com.ning.metrics.collector.endpoint.ExtractedAnnotation;
import com.ning.metrics.serialization.event.Event;

import java.util.Collection;

public interface EventExtractor
{
    /**
     * Extract event from the API call.
     * The annotation is a special extractor for the http request. To save space in the request, one can delegate to the
     * annotation to populate certain fields.
     *
     * @param annotation annotation for the http request
     * @return a constructed Event
     * @throws EventParsingException if the event can't be parsed properly
     */
    public Collection<? extends Event> extractEvent(ExtractedAnnotation annotation) throws EventParsingException;
}
