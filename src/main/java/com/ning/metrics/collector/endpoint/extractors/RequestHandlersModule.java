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
import com.google.inject.TypeLiteral;
import com.ning.metrics.collector.binder.annotations.Base64ExternalEventRequestHandler;
import com.ning.metrics.collector.binder.annotations.ExternalEventEndPointStats;
import com.ning.metrics.collector.binder.annotations.ExternalEventRequestHandler;
import com.ning.metrics.collector.binder.annotations.InternalEventEndPointStats;
import com.ning.metrics.collector.binder.annotations.InternalEventRequestHandler;
import com.ning.metrics.collector.binder.providers.ArrayListProvider;
import com.ning.metrics.collector.endpoint.EventEndPointStats;
import com.ning.metrics.collector.endpoint.EventEndPointStatsProvider;
import com.ning.metrics.collector.endpoint.resources.EventHandler;
import com.ning.metrics.collector.endpoint.resources.EventHandlerImpl;
import com.ning.metrics.collector.endpoint.resources.EventRequestHandler;
import com.ning.metrics.collector.hadoop.processing.WriterHealthCheck;
import com.ning.metrics.collector.hadoop.writer.HadoopHealthCheck;
import com.ning.metrics.collector.realtime.RealtimeHealthCheck;
import com.ning.metrics.collector.util.ComponentHealthCheck;
import org.weakref.jmx.guice.ExportBuilder;
import org.weakref.jmx.guice.MBeanModule;

import java.util.List;

public class RequestHandlersModule implements Module
{
    @Override
    public void configure(final Binder binder)
    {
        // JMX exporter
        final ExportBuilder builder = MBeanModule.newExporter(binder);

        // Base10 GET Api
        binder.bind(EventRequestHandler.class).annotatedWith(ExternalEventRequestHandler.class)
            .toProvider(new EventRequestHandlerProvider(ExternalEventEndPointStats.class)).asEagerSingleton();

        // Base64 GET Api
        binder.bind(EventRequestHandler.class).annotatedWith(Base64ExternalEventRequestHandler.class)
            .toProvider(new EventRequestHandlerProvider(ExternalEventEndPointStats.class)).asEagerSingleton();

        binder.bind(EventEndPointStats.class).annotatedWith(ExternalEventEndPointStats.class)
            .toProvider(EventEndPointStatsProvider.class).asEagerSingleton();
        builder.export(EventEndPointStats.class).annotatedWith(ExternalEventEndPointStats.class)
            .as("com.ning.metrics.collector:name=GETEndPointStats");

        // POST Api
        binder.bind(EventRequestHandler.class).annotatedWith(InternalEventRequestHandler.class)
            .toProvider(new EventRequestHandlerProvider(InternalEventEndPointStats.class)).asEagerSingleton();

        binder.bind(EventEndPointStats.class).annotatedWith(InternalEventEndPointStats.class)
            .toProvider(EventEndPointStatsProvider.class).asEagerSingleton();
        builder.export(EventEndPointStats.class).annotatedWith(InternalEventEndPointStats.class)
            .as("com.ning.metrics.collector:name=POSTEndPointStats");

        binder.bind(EventHandler.class).to(EventHandlerImpl.class).asEagerSingleton();
        builder.export(EventHandlerImpl.class).as("com.ning.metrics.collector:name=HTTPEventHandler");

        // Healthchecks
        binder.bind(new TypeLiteral<List<ComponentHealthCheck>>()
        {
        })
            .toProvider(new ArrayListProvider<ComponentHealthCheck>()
                .add(WriterHealthCheck.class)
                .add(RealtimeHealthCheck.class)
                .add(HadoopHealthCheck.class));
    }
}
