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

import com.ning.metrics.collector.endpoint.extractors.EventParsingException;

public class SplitTokenizer implements Tokenizer
{
    private final String[] parts;
    private int position = 0;

    public SplitTokenizer(String inputString, String tokenString)
    {
        parts = inputString.split(tokenString);
    }

    @Override
    public boolean hasNext()
    {
        return position < parts.length;
    }

    public Token next() throws EventParsingException
    {
        if (position >= parts.length) {
            throw new EventParsingException(String.format("request for index %d when max index is %d", position, parts.length - 1));
        }

        String value = parts[position++];
        Token token;

        if (value.isEmpty()) {
            token = Token.createEmptyToken();
        }
        else {
            token = new Token(value.substring(1), value.charAt(0));
        }

        return token;

    }
}
