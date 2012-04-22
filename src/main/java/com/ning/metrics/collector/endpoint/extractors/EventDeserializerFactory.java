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

import com.ning.metrics.collector.endpoint.ParsedRequest;
import com.ning.metrics.collector.events.parsing.ThriftEnvelopeEventParser;
import com.ning.metrics.collector.events.parsing.converters.Base64NumberConverter;
import com.ning.metrics.collector.events.parsing.converters.DecimalNumberConverter;
import com.ning.metrics.serialization.event.EventDeserializer;
import com.ning.metrics.serialization.smile.SmileEnvelopeEventDeserializer;
import com.ning.metrics.serialization.thrift.ThriftEnvelopeEventDeserializer;

import java.io.IOException;

public class EventDeserializerFactory
{
    private static final ThriftEnvelopeEventParser decimalParser = new ThriftEnvelopeEventParser(new DecimalNumberConverter());
    private static final ThriftEnvelopeEventParser base64Parser = new ThriftEnvelopeEventParser(new Base64NumberConverter());

    // question: why is this class not static?
    // answer: so we can replace this factory with a mock one during tests
    public EventDeserializer getEventDeserializer(final ParsedRequest annotation) throws IOException
    {
        switch (annotation.getContentType()) {
            case SMILE:
                return new SmileEnvelopeEventDeserializer(annotation.getInputStream(), false);
            case JSON:
                return new SmileEnvelopeEventDeserializer(annotation.getInputStream(), true);
            case THRIFT:
                return new ThriftEnvelopeEventDeserializer(annotation.getInputStream());
            case DECIMAL_QUERY:
                return new QueryParameterEventDeserializer(decimalParser, annotation);
            case BASE_64_QUERY:
                return new QueryParameterEventDeserializer(base64Parser, annotation);
            default:
                return new ThriftLegacyDeserializer(annotation);
        }
    }
}
