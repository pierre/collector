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

package com.ning.metrics.collector.events.parsing.converters;

import com.ning.metrics.collector.events.parsing.EventParsingException;

public class IntegerConverter implements Converter<Integer>
{
    private final NumberConverter numberConverter;

    public IntegerConverter(NumberConverter numberConverter)
    {
        this.numberConverter = numberConverter;
    }

    public Integer convert(String input) throws EventParsingException
    {
        try {
            Long value = numberConverter.convert(input);

            if (value < Integer.MIN_VALUE || value > Integer.MAX_VALUE) {
                throw new EventParsingException(String.format("Value out of range(%d, %d). Value:\"%s\"", Integer.MIN_VALUE, Integer.MAX_VALUE, input));
            }

            return value.intValue();
        }
        catch (NumberFormatException e) {
            throw new EventParsingException(String.format("cannot convert %s to Integer", input), e);
        }
    }
}