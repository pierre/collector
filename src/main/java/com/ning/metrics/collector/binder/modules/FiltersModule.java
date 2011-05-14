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

package com.ning.metrics.collector.binder.modules;

import com.google.inject.Binder;
import com.google.inject.Inject;
import com.google.inject.Module;
import com.google.inject.TypeLiteral;
import com.google.inject.name.Names;
import com.ning.metrics.collector.binder.providers.ArrayListProvider;
import com.ning.metrics.collector.binder.providers.EventFilterProvider;
import com.ning.metrics.collector.binder.annotations.EventEndpointRequestFilter;
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.endpoint.filters.FieldExtractors;
import com.ning.metrics.collector.endpoint.filters.OrFilter;
import com.ning.metrics.collector.util.Filter;
import org.weakref.jmx.guice.ExportBuilder;
import org.weakref.jmx.guice.MBeanModule;

import java.util.List;

/**
 * This module contains the setup for the Filters, which are used in the event processing flow of the HTTP API
 */
public class FiltersModule implements Module
{
    private final CollectorConfig config;

    @Inject
    public FiltersModule(CollectorConfig config)
    {
        this.config = config;
    }

    @Override
    public void configure(Binder binder)
    {
        // JMX exporter
        ExportBuilder builder = MBeanModule.newExporter(binder);

        String filterListDelimiter = config.getFilters();

        binder.bind(Filter.class).annotatedWith(EventEndpointRequestFilter.class).to(OrFilter.class);

        binder.bind(Filter.class).annotatedWith(Names.named("host"))
            .toProvider(new EventFilterProvider(FieldExtractors.HOST, config.getFiltersHost(), filterListDelimiter)).asEagerSingleton();
        builder.export(Filter.class).annotatedWith(Names.named("host")).as("com.ning.metrics.collector.filters:name=Host");

        binder.bind(Filter.class).annotatedWith(Names.named("ip"))
            .toProvider(new EventFilterProvider(FieldExtractors.IP, config.getFiltersIp(), filterListDelimiter)).asEagerSingleton();
        builder.export(Filter.class).annotatedWith(Names.named("ip")).as("com.ning.metrics.collector.filters:name=IP");

        binder.bind(Filter.class).annotatedWith(Names.named("user-agent"))
            .toProvider(new EventFilterProvider(FieldExtractors.USERAGENT, config.getFiltersUserAgent(), filterListDelimiter)).asEagerSingleton();
        builder.export(Filter.class).annotatedWith(Names.named("user-agent")).as("com.ning.metrics.collector.filters:name=UserAgent");

        binder.bind(Filter.class).annotatedWith(Names.named("path"))
            .toProvider(new EventFilterProvider(FieldExtractors.PATH, config.getFiltersPath(), filterListDelimiter)).asEagerSingleton();
        builder.export(Filter.class).annotatedWith(Names.named("path")).as("com.ning.metrics.collector.filters:name=Path");

        binder.bind(Filter.class).annotatedWith(Names.named("event-type"))
            .toProvider(new EventFilterProvider(FieldExtractors.EVENT_TYPE, config.getFiltersEventType(), filterListDelimiter)).asEagerSingleton();
        builder.export(Filter.class).annotatedWith(Names.named("event-type")).as("com.ning.metrics.collector.filters:name=EventType");

        binder.bind(new TypeLiteral<List<Filter>>()
        {
        })
            .toProvider(new ArrayListProvider<Filter>()
                .add(Names.named("host"), Filter.class)
                .add(Names.named("ip"), Filter.class)
                .add(Names.named("user-agent"), Filter.class)
                .add(Names.named("path"), Filter.class)
                .add(Names.named("event-type"), Filter.class)
            )
            .asEagerSingleton();
    }
}
