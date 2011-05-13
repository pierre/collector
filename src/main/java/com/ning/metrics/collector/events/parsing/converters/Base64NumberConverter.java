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

package com.ning.metrics.collector.events.parsing.converters;

import java.util.HashMap;
import java.util.Map;

public class Base64NumberConverter implements NumberConverter
{
    @Override
    public Long convert(String input)
    {
        return decode(input.toCharArray());
    }

    private static final char[] ENCODING_MAP = new char[]{
        '!',
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
        'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
        '_',
        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
        'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
    };

    private static final Map<Character, Integer> DECODING_MAP = new HashMap<Character, Integer>();

    static {
        for (int i = 0; i < ENCODING_MAP.length; i++) {
            DECODING_MAP.put(ENCODING_MAP[i], i);
        }
    }

    private static long decode(char[] input)
    {
        long value = 0;
        boolean isNegative = false;
        int i = 0;

        if (input.length > 1 && input[0] == '-') {
            isNegative = true;
            i = 1;
        }

        for (; i < input.length; i++) {
            char c = input[i];

            Integer charValue = DECODING_MAP.get(c);

            value <<= 6;

            if (charValue == null) {
                throw new IllegalArgumentException(String.format("invalid input character %c", c));
            }

            value += charValue;
        }

        return isNegative ? -value : value;
    }
}
