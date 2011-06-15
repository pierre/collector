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

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.Provider;
import com.ning.metrics.collector.endpoint.EventEndPointStats;
import com.ning.metrics.collector.endpoint.resources.EventHandler;
import com.ning.metrics.collector.endpoint.resources.EventRequestHandler;

import java.lang.annotation.Annotation;

class EventRequestHandlerProvider implements Provider<EventRequestHandler>
{
    private static final EventDeserializerFactory eventDeserializerFactory = new EventDeserializerFactory();

    private final Key<EventEndPointStats> eventEndPointStatsKey;
    private Injector injector;

    public EventRequestHandlerProvider(final Class<? extends Annotation> eventEndPointStatsAnnotation)
    {
        eventEndPointStatsKey = Key.get(EventEndPointStats.class, eventEndPointStatsAnnotation);
    }

    @Inject
    public void configure(final Injector injector)
    {
        this.injector = injector;
    }

    @Override
    public EventRequestHandler get()
    {
        final EventHandler eventHandler = injector.getInstance(EventHandler.class);
        final EventEndPointStats stats = injector.getInstance(eventEndPointStatsKey);

        return new EventRequestHandler(eventHandler, stats, eventDeserializerFactory);
    }
}
