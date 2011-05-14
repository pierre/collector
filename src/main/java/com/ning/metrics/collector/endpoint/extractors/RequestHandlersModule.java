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

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.name.Names;
import com.ning.metrics.collector.binder.annotations.Base64ExternalEventRequestHandler;
import com.ning.metrics.collector.binder.annotations.ExternalEventEndPointStats;
import com.ning.metrics.collector.binder.annotations.ExternalEventRequestHandler;
import com.ning.metrics.collector.binder.annotations.InternalEventEndPointStats;
import com.ning.metrics.collector.binder.annotations.InternalEventRequestHandler;
import com.ning.metrics.collector.endpoint.EventEndPointStatsProvider;
import com.ning.metrics.collector.binder.providers.EventRequestHandlerProvider;
import com.ning.metrics.collector.binder.providers.ThriftEnvelopeEventParserProvider;
import com.ning.metrics.collector.endpoint.EventEndPointStats;
import com.ning.metrics.collector.endpoint.resources.EventRequestHandler;
import com.ning.metrics.collector.events.parsing.ThriftEnvelopeEventParser;
import com.ning.metrics.collector.events.parsing.converters.Base64NumberConverter;
import com.ning.metrics.collector.events.parsing.converters.DecimalNumberConverter;
import com.ning.metrics.collector.events.processing.EventHandler;
import com.ning.metrics.collector.events.processing.EventHandlerImpl;
import org.weakref.jmx.guice.ExportBuilder;
import org.weakref.jmx.guice.MBeanModule;

public class RequestHandlersModule implements Module
{
    @Override
    public void configure(final Binder binder)
    {
        // JMX exporter
        final ExportBuilder builder = MBeanModule.newExporter(binder);

        binder.bind(EventRequestHandler.class).annotatedWith(ExternalEventRequestHandler.class)
            .toProvider(new EventRequestHandlerProvider(QueryParameterEventExtractor.class, Names.named("base10"), ExternalEventEndPointStats.class)).asEagerSingleton();
        builder.export(EventRequestHandler.class).annotatedWith(ExternalEventRequestHandler.class)
            .as("com.ning.metrics.collector:name=ExternalEventHandler");

        binder.bind(ThriftEnvelopeEventParser.class).annotatedWith(Names.named("base64"))
            .toProvider(new ThriftEnvelopeEventParserProvider(Base64NumberConverter.class)).asEagerSingleton();

        binder.bind(QueryParameterEventExtractor.class).annotatedWith(Names.named("base64"))
            .toProvider(new QueryParameterEventExtractorProvider(Names.named("base64"))).asEagerSingleton();

        binder.bind(ThriftEnvelopeEventParser.class).annotatedWith(Names.named("base10"))
            .toProvider(new ThriftEnvelopeEventParserProvider(DecimalNumberConverter.class)).asEagerSingleton();

        binder.bind(QueryParameterEventExtractor.class).annotatedWith(Names.named("base10"))
            .toProvider(new QueryParameterEventExtractorProvider(Names.named("base10"))).asEagerSingleton();

        binder.bind(EventRequestHandler.class).annotatedWith(Base64ExternalEventRequestHandler.class)
            .toProvider(new EventRequestHandlerProvider(QueryParameterEventExtractor.class, Names.named("base64"), ExternalEventEndPointStats.class)).asEagerSingleton();
        builder.export(EventRequestHandler.class).annotatedWith(Base64ExternalEventRequestHandler.class)
            .as("com.ning.metrics.collector:name=Base64ExternalEventHandler");

        binder.bind(EventRequestHandler.class).annotatedWith(InternalEventRequestHandler.class)
            .toProvider(new EventRequestHandlerProvider(BodyEventExtractor.class, InternalEventEndPointStats.class)).asEagerSingleton();
        builder.export(EventRequestHandler.class).annotatedWith(InternalEventRequestHandler.class)
            .as("com.ning.metrics.collector:name=InternalEventHandler");

        binder.bind(EventEndPointStats.class).annotatedWith(ExternalEventEndPointStats.class)
            .toProvider(EventEndPointStatsProvider.class).asEagerSingleton();
        builder.export(EventEndPointStats.class).annotatedWith(ExternalEventEndPointStats.class)
            .as("com.ning.metrics.collector:name=ExternalEventEndPointStats");

        binder.bind(EventEndPointStats.class).annotatedWith(InternalEventEndPointStats.class)
            .toProvider(EventEndPointStatsProvider.class).asEagerSingleton();
        builder.export(EventEndPointStats.class).annotatedWith(InternalEventEndPointStats.class)
            .as("com.ning.metrics.collector:name=InternalEventEndPointStats");

        binder.bind(EventHandler.class).to(EventHandlerImpl.class).asEagerSingleton();
        builder.export(EventHandlerImpl.class).as("com.ning.metrics.collector:name=EventHandler");
    }
}
