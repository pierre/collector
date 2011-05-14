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

package com.ning.metrics.collector.binder.providers;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.Provider;
import com.ning.metrics.collector.events.parsing.ThriftEnvelopeEventParser;
import com.ning.metrics.collector.events.parsing.converters.NumberConverter;

public class ThriftEnvelopeEventParserProvider implements Provider<ThriftEnvelopeEventParser>
{
    private Injector injector = null;
    private final Key<? extends NumberConverter> numberConverterKey;

    public ThriftEnvelopeEventParserProvider(Class<? extends NumberConverter> numberConverterClazz)
    {
        numberConverterKey = Key.get(numberConverterClazz);
    }

    @Inject
    public void configure(Injector injector)
    {
        this.injector = injector;
    }

    @Override
    public ThriftEnvelopeEventParser get()
    {
        NumberConverter numberConverter = injector.getInstance(numberConverterKey);

        return new ThriftEnvelopeEventParser(numberConverter);
    }
}
