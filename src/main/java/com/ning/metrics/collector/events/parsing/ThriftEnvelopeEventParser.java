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

package com.ning.metrics.collector.events.parsing;

import com.google.inject.Inject;
import com.ning.metrics.collector.endpoint.extractors.EventParsingException;
import com.ning.metrics.collector.endpoint.extractors.ExtractedAnnotation;
import com.ning.metrics.collector.events.parsing.converters.BooleanConverter;
import com.ning.metrics.collector.events.parsing.converters.ByteConverter;
import com.ning.metrics.collector.events.parsing.converters.DoubleConverter;
import com.ning.metrics.collector.events.parsing.converters.IntegerConverter;
import com.ning.metrics.collector.events.parsing.converters.NumberConverter;
import com.ning.metrics.collector.events.parsing.converters.ShortConverter;
import com.ning.metrics.collector.util.Ip;
import com.ning.metrics.serialization.event.Event;
import com.ning.metrics.serialization.event.ThriftEnvelopeEvent;
import com.ning.metrics.serialization.thrift.ThriftEnvelope;
import com.ning.metrics.serialization.thrift.ThriftField;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ThriftEnvelopeEventParser implements EventParser
{
    private static final String TOKEN_SEPARATOR = ",";
    private static final BooleanConverter booleanConverter = new BooleanConverter();
    private static final DoubleConverter doubleConverter = new DoubleConverter();
    private final NumberConverter numberConverter;
    private final ByteConverter byteConverter;
    private final ShortConverter shortConverter;
    private final IntegerConverter integerConverter;

    @Inject
    public ThriftEnvelopeEventParser(NumberConverter numberConverter)
    {
        this.numberConverter = numberConverter;
        this.byteConverter = new ByteConverter(numberConverter);
        this.shortConverter = new ShortConverter(numberConverter);
        this.integerConverter = new IntegerConverter(numberConverter);
    }

    @Override
    public Event parseThriftEvent(final String eventTypeName, String input, final ExtractedAnnotation extractedAnnotation) throws EventParsingException
    {
        try {
            Tokenizer tokenizer = new UrlDecodingTokenizer(new SplitTokenizer(input, TOKEN_SEPARATOR));
            List<ThriftField> payload = new ArrayList<ThriftField>();
            short id = (short) 1;

            while (tokenizer.hasNext()) {
                Token token = tokenizer.next();

                if (!token.isEmpty()) {
                    ThriftField field;

                    switch (token.getType()) {
                        case 'b':
                            field = ThriftField.createThriftField(booleanConverter.convert(token.getValue()), id);
                            break;
                        case '1':
                            field = ThriftField.createThriftField(byteConverter.convert(token.getValue()), id);
                            break;
                        case '2':
                            field = ThriftField.createThriftField(shortConverter.convert(token.getValue()), id);
                            break;
                        case '4':
                            field = ThriftField.createThriftField(integerConverter.convert(token.getValue()), id);
                            break;
                        case '8':
                            field = ThriftField.createThriftField(numberConverter.convert(token.getValue()), id);
                            break;
                        case 'd':
                            field = ThriftField.createThriftField(doubleConverter.convert(token.getValue()), id);
                            break;
                        case 's':
                            field = ThriftField.createThriftField(token.getValue(), id);
                            break;
                        case 'x':
                            field = getAnnotatedValue(id, token, extractedAnnotation);
                            break;
                        default:
                            throw new EventParsingException(String.format("unknown type %c", token.getType()));
                    }

                    payload.add(field);
                }

                id++;
            }

            ThriftEnvelope thriftEnvelope = new ThriftEnvelope(eventTypeName, payload);

            return new ThriftEnvelopeEvent(extractedAnnotation.getDateTime(), thriftEnvelope, extractedAnnotation.getBucketGranularity());
        }
        catch (RuntimeException e) {
            throw new EventParsingException("runtime exception parsing event", e);
        }
    }

    private ThriftField getAnnotatedValue(short id, Token token, ExtractedAnnotation annotation)
    {
        String function = token.getValue().toLowerCase(Locale.US);
        if ("date".equals(function)) {
            return ThriftField.createThriftField(annotation.getDateTime().getMillis(), id);
        }
        else if ("host".equals(function)) {
            return ThriftField.createThriftField(annotation.getReferrerHost(), id);
        }
        else if ("path".equals(function)) {
            return ThriftField.createThriftField(annotation.getReferrerPath(), id);
        }
        else if ("ua".equals(function)) {
            return ThriftField.createThriftField(annotation.getUserAgent(), id);
        }
        else if ("ip".equals(function)) {
            return ThriftField.createThriftField(Ip.ipToInt(annotation.getIpAddress()), id);
        }

        throw new IllegalArgumentException(String.format("invalid annotation function: %s", function));
    }
}
