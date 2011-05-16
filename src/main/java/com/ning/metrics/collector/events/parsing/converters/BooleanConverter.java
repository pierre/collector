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

import com.ning.metrics.collector.endpoint.extractors.EventParsingException;

public class BooleanConverter implements Converter<Boolean>
{
    public Boolean convert(String input) throws EventParsingException
    {
        if ("1".equals(input)) {
            return true;
        }
        else if ("0".equals(input)) {
            return false;
        }

        throw new EventParsingException("expected 0 or 1, got " + input);
    }
}
