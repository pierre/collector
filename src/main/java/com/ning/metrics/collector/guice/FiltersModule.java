/*
 * Copyright 2010-2012 Ning, Inc.
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

package com.ning.metrics.collector.guice;

import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.binder.providers.ArrayListProvider;
import com.ning.metrics.collector.endpoint.ParsedRequest;
import com.ning.metrics.collector.filtering.FieldExtractors;
import com.ning.metrics.collector.filtering.Filter;
import com.ning.metrics.collector.filtering.OrFilter;
import com.ning.metrics.collector.guice.providers.EventFilterProvider;

import com.google.inject.Binder;
import com.google.inject.Inject;
import com.google.inject.Key;
import com.google.inject.Module;
import com.google.inject.TypeLiteral;
import com.google.inject.name.Names;
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
    public FiltersModule(final CollectorConfig config)
    {
        this.config = config;
    }

    @Override
    public void configure(final Binder binder)
    {
        // JMX exporter
        final ExportBuilder builder = MBeanModule.newExporter(binder);

        final String filterListDelimiter = config.getFilters();

        final TypeLiteral<Filter<ParsedRequest>> filterTypeLiteral = new TypeLiteral<Filter<ParsedRequest>>() {};
        binder.bind(filterTypeLiteral).to(OrFilter.class).asEagerSingleton();

        binder.bind(filterTypeLiteral).annotatedWith(Names.named("host"))
              .toProvider(new EventFilterProvider(FieldExtractors.HOST, config.getFiltersHost(), filterListDelimiter)).asEagerSingleton();
        builder.export(Key.get(filterTypeLiteral, Names.named("host"))).as("com.ning.metrics.collector.filters:name=Host");

        binder.bind(filterTypeLiteral).annotatedWith(Names.named("ip"))
              .toProvider(new EventFilterProvider(FieldExtractors.IP, config.getFiltersIp(), filterListDelimiter)).asEagerSingleton();
        builder.export(Key.get(filterTypeLiteral, Names.named("ip"))).as("com.ning.metrics.collector.filters:name=IP");

        binder.bind(filterTypeLiteral).annotatedWith(Names.named("user-agent"))
              .toProvider(new EventFilterProvider(FieldExtractors.USERAGENT, config.getFiltersUserAgent(), filterListDelimiter)).asEagerSingleton();
        builder.export(Key.get(filterTypeLiteral, Names.named("user-agent"))).as("com.ning.metrics.collector.filters:name=UserAgent");

        binder.bind(filterTypeLiteral).annotatedWith(Names.named("path"))
              .toProvider(new EventFilterProvider(FieldExtractors.PATH, config.getFiltersPath(), filterListDelimiter)).asEagerSingleton();
        builder.export(Key.get(filterTypeLiteral, Names.named("path"))).as("com.ning.metrics.collector.filters:name=Path");

        binder.bind(filterTypeLiteral).annotatedWith(Names.named("event-type"))
              .toProvider(new EventFilterProvider(FieldExtractors.EVENT_TYPE, config.getFiltersEventType(), filterListDelimiter)).asEagerSingleton();
        builder.export(Key.get(filterTypeLiteral, Names.named("event-type"))).as("com.ning.metrics.collector.filters:name=EventType");

        final ArrayListProvider<Filter<ParsedRequest>> filterListProvider = new ArrayListProvider<Filter<ParsedRequest>>()
                                                                                    .add(Key.get(filterTypeLiteral, Names.named("host")))
                                                                                    .add(Key.get(filterTypeLiteral, Names.named("ip")))
                                                                                    .add(Key.get(filterTypeLiteral, Names.named("user-agent")))
                                                                                    .add(Key.get(filterTypeLiteral, Names.named("path")))
                                                                                    .add(Key.get(filterTypeLiteral, Names.named("event-type")));
        binder.bind(new TypeLiteral<List<Filter<ParsedRequest>>>() {}).toProvider(filterListProvider).asEagerSingleton();
    }
}
