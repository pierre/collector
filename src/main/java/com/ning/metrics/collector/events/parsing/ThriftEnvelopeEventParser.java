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

package com.ning.metrics.collector.events.parsing;

import com.google.inject.Inject;
import com.ning.metrics.collector.events.Event;
import com.ning.metrics.collector.events.data.ThriftEnvelopeEvent;
import com.ning.metrics.collector.events.parsing.converters.BooleanConverter;
import com.ning.metrics.collector.events.parsing.converters.ByteConverter;
import com.ning.metrics.collector.events.parsing.converters.DoubleConverter;
import com.ning.metrics.collector.events.parsing.converters.IntegerConverter;
import com.ning.metrics.collector.events.parsing.converters.NumberConverter;
import com.ning.metrics.collector.events.parsing.converters.ShortConverter;
import com.ning.metrics.collector.util.Ip;
import com.ning.serialization.BooleanDataItem;
import com.ning.serialization.ByteDataItem;
import com.ning.serialization.DoubleDataItem;
import com.ning.serialization.IntegerDataItem;
import com.ning.serialization.LongDataItem;
import com.ning.serialization.ShortDataItem;
import com.ning.serialization.StringDataItem;
import com.ning.serialization.ThriftEnvelope;
import com.ning.serialization.ThriftField;
import com.ning.serialization.ThriftFieldImpl;
import org.apache.thrift.protocol.TField;
import org.apache.thrift.protocol.TType;

import java.util.ArrayList;
import java.util.List;

public class ThriftEnvelopeEventParser implements EventParser
{
    private static final String TOKEN_SEPARATOR = ",";
    private static final BooleanConverter BOOLEAN_CONVERTER = new BooleanConverter();
    private static final DoubleConverter DOUBLE_CONVERTER = new DoubleConverter();
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
            short id = 1;

            while (tokenizer.hasNext()) {
                Token token = tokenizer.next();

                if (!token.isEmpty()) {
                    ThriftField field;
                    TField tField;

                    switch (token.getType()) {
                        case 'b':
                            tField = new TField(String.valueOf(id), TType.BOOL, id);
                            field = new ThriftFieldImpl(new BooleanDataItem(BOOLEAN_CONVERTER.convert(token.getValue())), tField);
                            break;
                        case '1':
                            tField = new TField(String.valueOf(id), TType.BYTE, id);
                            field = new ThriftFieldImpl(new ByteDataItem(byteConverter.convert(token.getValue())), tField);
                            break;
                        case '2':
                            tField = new TField(String.valueOf(id), TType.I16, id);
                            field = new ThriftFieldImpl(new ShortDataItem(shortConverter.convert(token.getValue())), tField);
                            break;
                        case '4':
                            tField = new TField(String.valueOf(id), TType.I32, id);
                            field = new ThriftFieldImpl(new IntegerDataItem(integerConverter.convert(token.getValue())), tField);
                            break;
                        case '8':
                            tField = new TField(String.valueOf(id), TType.I64, id);
                            field = new ThriftFieldImpl(new LongDataItem(numberConverter.convert(token.getValue())), tField);
                            break;
                        case 'd':
                            tField = new TField(String.valueOf(id), TType.DOUBLE, id);
                            field = new ThriftFieldImpl(new DoubleDataItem(DOUBLE_CONVERTER.convert(token.getValue())), tField);
                            break;
                        case 's':
                            tField = new TField(String.valueOf(id), TType.STRING, id);
                            field = new ThriftFieldImpl(new StringDataItem(token.getValue()), tField);
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
        String function = token.getValue().toLowerCase();
        if ("date".equals(function)) {
            return new ThriftFieldImpl(new LongDataItem(annotation.getDateTime().getMillis()), new TField(String.valueOf(id), TType.I64, id));
        }
        else if ("host".equals(function)) {
            return new ThriftFieldImpl(new StringDataItem(annotation.getReferrerHost()), new TField(String.valueOf(id), TType.STRING, id));
        }
        else if ("path".equals(function)) {
            return new ThriftFieldImpl(new StringDataItem(annotation.getReferrerPath()), new TField(String.valueOf(id), TType.STRING, id));
        }
        else if ("ua".equals(function)) {
            return new ThriftFieldImpl(new StringDataItem(annotation.getUserAgent()), new TField(String.valueOf(id), TType.STRING, id));
        }
        else if ("ip".equals(function)) {
            return new ThriftFieldImpl(new IntegerDataItem(Ip.ipToInt(annotation.getIpAddress())), new TField(String.valueOf(id), TType.I32, id));
        }

        throw new IllegalArgumentException(String.format("invalid annotation function: %s", function));
    }
}