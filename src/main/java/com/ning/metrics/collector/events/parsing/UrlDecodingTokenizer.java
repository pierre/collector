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

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class UrlDecodingTokenizer implements Tokenizer
{
    private final Tokenizer baseTokenizer;

    public UrlDecodingTokenizer(Tokenizer baseTokenizer)
    {
        this.baseTokenizer = baseTokenizer;
    }

    @Override
    public boolean hasNext()
    {
        return baseTokenizer.hasNext();
    }

    public Token next() throws EventParsingException
    {
        try {
            Token baseToken = baseTokenizer.next();
            if (baseToken.isEmpty()) {
                return baseToken;
            }
            else {
                String value = URLDecoder.decode(baseToken.getValue(), "UTF-8");

                return new Token(value, baseToken.getType());
            }
        }
        catch (UnsupportedEncodingException e) {
            throw new EventParsingException("error URL decoding token", e);
        }
    }

    public int getTokenCount()
    {
        return baseTokenizer.getTokenCount();
    }
}
