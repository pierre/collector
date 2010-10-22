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

package com.ning.metrics.collector.endpoint.extractors;

import com.ning.metrics.collector.endpoint.ThriftFieldListParser;
import com.ning.serialization.ThriftEnvelope;
import com.ning.serialization.ThriftField;
import org.apache.log4j.Logger;

import com.ning.metrics.collector.events.Event;
import com.ning.metrics.collector.events.data.ThriftEnvelopeEvent;
import com.ning.metrics.collector.events.parsing.EventParsingException;
import com.ning.metrics.collector.events.parsing.ExtractedAnnotation;

import java.io.IOException;
import java.util.List;

public class BodyEventExtractor implements EventExtractor
{
    private static final Logger log = Logger.getLogger(BodyEventExtractor.class);

    @Override
    public Event extractEvent(String eventType, ExtractedAnnotation annotation) throws EventParsingException
    {
        if (eventType != null) {
            log.debug(String.format("receiving event of type %s", eventType));
            List<ThriftField> thriftFieldList;

            try {
                thriftFieldList = new ThriftFieldListParser().parse(annotation.getContentLength(), annotation.getInputStream());
            }
            catch (IOException e) {
                throw new EventParsingException(String.format("IOException while trying to parse event from post body"), e);
            }
            catch (IllegalArgumentException e) {
                throw new EventParsingException(String.format("Parse exception while trying to parse event from post body"), e);
            }

            ThriftEnvelope envelope = new ThriftEnvelope(eventType, thriftFieldList);

            return new ThriftEnvelopeEvent(annotation.getDateTime(), envelope, annotation.getBucketGranularity());
        }

        return null;
    }
}