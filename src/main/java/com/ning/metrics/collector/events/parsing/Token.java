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

public class Token
{
    private final char type;
    private final String value;
    private final boolean isEmpty;

    public static Token createEmptyToken()
    {
        return new Token("", '-', true);
    }

    public Token(String value, char type)
    {
        this(value, type, false);
    }

    private Token(String value, char type, boolean isEmpty)
    {
        this.value = value;
        this.type = type;
        this.isEmpty = isEmpty;
    }

    public char getType()
    {
        return type;
    }

    public String getValue()
    {
        return value;
    }

    public boolean isEmpty()
    {
        return isEmpty;
    }
}
