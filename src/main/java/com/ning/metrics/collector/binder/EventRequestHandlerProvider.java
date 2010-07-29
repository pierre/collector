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

package com.ning.metrics.collector.binder;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.Provider;
import com.ning.metrics.collector.endpoint.EventEndPointStats;
import com.ning.metrics.collector.endpoint.EventExtractor;
import com.ning.metrics.collector.endpoint.EventRequestHandler;
import com.ning.metrics.collector.events.processing.EventHandler;

import java.lang.annotation.Annotation;

public class EventRequestHandlerProvider implements Provider<EventRequestHandler>
{
    private Key<? extends EventExtractor> eventExtractorKey;
    private Key<EventEndPointStats> eventEndPointStatsKey;
    private Injector injector = null;

    public EventRequestHandlerProvider(
        Class<? extends EventExtractor> eventExtractorClazz,
        Annotation eventExtractorAnnotation,
        Class<? extends Annotation> eventEndPointStatsAnnotation
    )
    {
        this.eventExtractorKey = Key.get(eventExtractorClazz, eventExtractorAnnotation);
        this.eventEndPointStatsKey = Key.get(EventEndPointStats.class, eventEndPointStatsAnnotation);
    }


    public EventRequestHandlerProvider(
        Class<? extends EventExtractor> eventExtractorClazz,
        Class<? extends Annotation> eventEndPointStatsAnnotation
    )
    {
        this.eventExtractorKey = Key.get(eventExtractorClazz);
        this.eventEndPointStatsKey = Key.get(EventEndPointStats.class, eventEndPointStatsAnnotation);
    }

    @Inject
    public void configure(Injector injector)
    {
        this.injector = injector;
    }

    @Override
    public EventRequestHandler get()
    {
        EventHandler eventHandler = injector.getInstance(EventHandler.class);
        EventExtractor eventExtractor = injector.getInstance(eventExtractorKey);
        EventEndPointStats stats = injector.getInstance(eventEndPointStatsKey);

        return new EventRequestHandler(eventHandler, eventExtractor, stats);
    }
}
