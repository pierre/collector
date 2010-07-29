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

package com.ning.metrics.collector.binder.modules;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Scopes;
import com.google.inject.TypeLiteral;
import com.google.inject.name.Names;
import com.google.inject.util.Providers;
import com.ning.metrics.collector.FixedManagedJmxExportScope;
import com.ning.metrics.collector.binder.ArrayListProvider;
import com.ning.metrics.collector.binder.EventEndPointStatsProvider;
import com.ning.metrics.collector.binder.EventFilterProvider;
import com.ning.metrics.collector.binder.EventRequestHandlerProvider;
import com.ning.metrics.collector.binder.ExternalEventExtractorProvider;
import com.ning.metrics.collector.binder.FileSystemProvider;
import com.ning.metrics.collector.binder.ThresholdEventWriterProvider;
import com.ning.metrics.collector.binder.ThriftEnvelopeEventParserProvider;
import com.ning.metrics.collector.binder.annotations.Base64ExternalEventRequestHandler;
import com.ning.metrics.collector.binder.annotations.BufferingEventCollectorEventWriter;
import com.ning.metrics.collector.binder.annotations.BufferingEventCollectorExecutor;
import com.ning.metrics.collector.binder.annotations.DiskSpoolFlushExecutor;
import com.ning.metrics.collector.binder.annotations.EventEndpointRequestFilter;
import com.ning.metrics.collector.binder.annotations.ExternalEventEndPointStats;
import com.ning.metrics.collector.binder.annotations.ExternalEventRequestHandler;
import com.ning.metrics.collector.binder.annotations.HdfsEventWriter;
import com.ning.metrics.collector.binder.annotations.InternalEventEndPointStats;
import com.ning.metrics.collector.binder.annotations.InternalEventRequestHandler;
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.endpoint.EventEndPointStats;
import com.ning.metrics.collector.endpoint.EventRequestHandler;
import com.ning.metrics.collector.endpoint.ExternalEventExtractor;
import com.ning.metrics.collector.endpoint.InternalEventExtractor;
import com.ning.metrics.collector.endpoint.filters.FieldExtractors;
import com.ning.metrics.collector.endpoint.filters.OrFilter;
import com.ning.metrics.collector.events.parsing.ThriftEnvelopeEventParser;
import com.ning.metrics.collector.events.parsing.converters.Base64NumberConverter;
import com.ning.metrics.collector.events.parsing.converters.DecimalNumberConverter;
import com.ning.metrics.collector.events.processing.ActiveMQController;
import com.ning.metrics.collector.events.processing.ActiveMQControllerImpl;
import com.ning.metrics.collector.events.processing.ActiveMQSender;
import com.ning.metrics.collector.events.processing.ActiveMQSenderImpl;
import com.ning.metrics.collector.events.processing.BufferingEventCollector;
import com.ning.metrics.collector.events.processing.EventCollector;
import com.ning.metrics.collector.events.processing.EventHandler;
import com.ning.metrics.collector.events.processing.EventHandlerImpl;
import com.ning.metrics.collector.events.processing.TaskQueueService;
import com.ning.metrics.collector.events.processing.TaskQueueServiceImpl;
import com.ning.metrics.collector.events.writers.DiskSpoolEventWriter;
import com.ning.metrics.collector.events.writers.EventWriter;
import com.ning.metrics.collector.events.writers.HadoopFileEventWriter;
import com.ning.metrics.collector.util.Filter;
import org.apache.hadoop.fs.FileSystem;
import org.apache.log4j.Logger;
import org.skife.config.ConfigurationObjectFactory;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * This module contains the minimal plumbing to instantiate the EventCollector.
 */
public class EventCollectorModule implements Module
{
    private static final Logger log = Logger.getLogger(EventCollectorModule.class);

    @Override
    public void configure(Binder binder)
    {
        CollectorConfig config = new ConfigurationObjectFactory(System.getProperties()).build(CollectorConfig.class);
        binder.bind(CollectorConfig.class).toInstance(config);

        if (config.isActiveMQEnabled()) {
            binder.bind(ActiveMQSender.class)
                .to(ActiveMQSenderImpl.class)
                .in(new FixedManagedJmxExportScope(log, "com.ning.metrics.collector:name=ActiveMQEventCollectorSender"));

            binder.bind(ActiveMQController.class)
                .to(ActiveMQControllerImpl.class)
                .in(new FixedManagedJmxExportScope(log, "com.ning.metrics.collector:name=ActiveMQEventCollector"));
        }
        else {
            binder.bind(ActiveMQSender.class)
                .toProvider(Providers.<ActiveMQSender>of(null));

            binder.bind(ActiveMQController.class)
                .toProvider(Providers.<ActiveMQController>of(null));
        }

        binder.bind(FileSystem.class)
            .toProvider(FileSystemProvider.class)
            .asEagerSingleton();

        /*
         * EventWriters
         */
        binder.bind(EventWriter.class)
            .annotatedWith(HdfsEventWriter.class)
            .to(HadoopFileEventWriter.class)
            .in(new FixedManagedJmxExportScope(log, "com.ning.metrics.collector:name=HadoopFileEventWriter"));

        binder.bind(DiskSpoolEventWriter.class)
            .in(new FixedManagedJmxExportScope(log, "com.ning.metrics.collector:name=DiskSpoolEventWriter"));

        binder.bind(EventWriter.class)
            .annotatedWith(BufferingEventCollectorEventWriter.class)
            .toProvider(ThresholdEventWriterProvider.class)
            .in(new FixedManagedJmxExportScope(log, "com.ning.metrics.collector:name=ThresholdEventWriter"));

        /*
         * TaskQueue
         */
        binder.bind(TaskQueueService.class)
            .to(TaskQueueServiceImpl.class);
        /*
            * ScheduledExecutorServices
            */
        binder.bind(ScheduledExecutorService.class)
            .annotatedWith(DiskSpoolFlushExecutor.class)
            .toInstance(new ScheduledThreadPoolExecutor(2, Executors.defaultThreadFactory()));

        binder.bind(ScheduledExecutorService.class)
            .annotatedWith(BufferingEventCollectorExecutor.class)
            .toInstance(new ScheduledThreadPoolExecutor(2, Executors.defaultThreadFactory()));

        /*
         * Filters
         */
        String filterListDelimiter = config.getFilters();

        binder.bind(Filter.class)
            .annotatedWith(EventEndpointRequestFilter.class)
            .to(OrFilter.class);

        binder.bind(Filter.class)
            .annotatedWith(Names.named("host"))
            .toProvider(new EventFilterProvider(FieldExtractors.HOST, config.getFiltersHost(), filterListDelimiter))
            .in(new FixedManagedJmxExportScope("com.ning.metrics.collector.filters:name=Host"));

        binder.bind(Filter.class)
            .annotatedWith(Names.named("ip"))
            .toProvider(new EventFilterProvider(FieldExtractors.IP, config.getFiltersIp(), filterListDelimiter))
            .in(new FixedManagedJmxExportScope("com.ning.metrics.collector.filters:name=IP"));

        binder.bind(Filter.class)
            .annotatedWith(Names.named("user-agent"))
            .toProvider(new EventFilterProvider(FieldExtractors.USERAGENT, config.getFiltersUserAgent(), filterListDelimiter))
            .in(new FixedManagedJmxExportScope("com.ning.metrics.collector.filters:name=UserAgent"));

        binder.bind(Filter.class)
            .annotatedWith(Names.named("path"))
            .toProvider(new EventFilterProvider(FieldExtractors.PATH, config.getFiltersPath(), filterListDelimiter))
            .in(new FixedManagedJmxExportScope("com.ning.metrics.collector.filters:name=Path"));

        binder.bind(Filter.class)
            .annotatedWith(Names.named("event-type"))
            .toProvider(new EventFilterProvider(FieldExtractors.EVENT_TYPE, config.getFiltersEventType(), filterListDelimiter))
            .in(new FixedManagedJmxExportScope("com.ning.metrics.collector.filters:name=EventType"));

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

        /*
         * Request handlers
         */
        binder.bind(EventRequestHandler.class)
            .annotatedWith(ExternalEventRequestHandler.class)
            .toProvider(new EventRequestHandlerProvider(
                ExternalEventExtractor.class,
                Names.named("base10"),
                ExternalEventEndPointStats.class
            ))
            .in(new FixedManagedJmxExportScope(log, "com.ning.metrics.collector:name=ExternalEventHandler"));

        binder.bind(ThriftEnvelopeEventParser.class)
            .annotatedWith(Names.named("base64"))
            .toProvider(new ThriftEnvelopeEventParserProvider(Base64NumberConverter.class))
            .in(Scopes.SINGLETON);

        binder.bind(ExternalEventExtractor.class)
            .annotatedWith(Names.named("base64"))
            .toProvider(new ExternalEventExtractorProvider(Names.named("base64")))
            .in(Scopes.SINGLETON);

        binder.bind(ThriftEnvelopeEventParser.class)
            .annotatedWith(Names.named("base10"))
            .toProvider(new ThriftEnvelopeEventParserProvider(DecimalNumberConverter.class))
            .in(Scopes.SINGLETON);

        binder.bind(ExternalEventExtractor.class)
            .annotatedWith(Names.named("base10"))
            .toProvider(new ExternalEventExtractorProvider(Names.named("base10")))
            .in(Scopes.SINGLETON);

        binder.bind(EventRequestHandler.class)
            .annotatedWith(Base64ExternalEventRequestHandler.class)
            .toProvider(new EventRequestHandlerProvider(
                ExternalEventExtractor.class,
                Names.named("base64"),
                ExternalEventEndPointStats.class
            ))
            .in(new FixedManagedJmxExportScope(log, "com.ning.metrics.collector:name=Base64ExternalEventHandler"));

        binder.bind(EventRequestHandler.class)
            .annotatedWith(InternalEventRequestHandler.class)
            .toProvider(new EventRequestHandlerProvider(
                InternalEventExtractor.class,
                InternalEventEndPointStats.class
            ))
            .in(new FixedManagedJmxExportScope(log, "com.ning.metrics.collector:name=InternalEventHandler"));

        binder.bind(EventEndPointStats.class)
            .annotatedWith(ExternalEventEndPointStats.class)
            .toProvider(EventEndPointStatsProvider.class)
            .in(new FixedManagedJmxExportScope("com.ning.metrics.collector:name=ExternalEventEndPointStats"));

        binder.bind(EventEndPointStats.class)
            .annotatedWith(InternalEventEndPointStats.class)
            .toProvider(EventEndPointStatsProvider.class)
            .in(new FixedManagedJmxExportScope("com.ning.metrics.collector:name=InternalEventEndPointStats"));

        binder.bind(EventHandler.class)
            .to(EventHandlerImpl.class)
            .in(new FixedManagedJmxExportScope(log, "com.ning.metrics.collector:name=EventHandler"));

        /*
        * Final wiring
        */
        binder.bind(BufferingEventCollector.class)
            .in(new FixedManagedJmxExportScope(log, "com.ning.metrics.collector:name=BufferingEventCollector"));

        binder.bind(EventCollector.class)
            .to(BufferingEventCollector.class);
    }
}
