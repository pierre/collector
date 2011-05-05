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
import com.google.inject.Module;
import com.google.inject.TypeLiteral;
import com.google.inject.name.Names;
import com.ning.metrics.collector.binder.ArrayListProvider;
import com.ning.metrics.collector.binder.DiskSpoolEventWriterProvider;
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
import com.ning.metrics.collector.endpoint.extractors.BodyEventExtractor;
import com.ning.metrics.collector.endpoint.extractors.QueryParameterEventExtractor;
import com.ning.metrics.collector.endpoint.filters.FieldExtractors;
import com.ning.metrics.collector.endpoint.filters.OrFilter;
import com.ning.metrics.collector.endpoint.resources.EventRequestHandler;
import com.ning.metrics.collector.events.hadoop.writer.HadoopFileEventWriter;
import com.ning.metrics.collector.events.parsing.ThriftEnvelopeEventParser;
import com.ning.metrics.collector.events.parsing.converters.Base64NumberConverter;
import com.ning.metrics.collector.events.parsing.converters.DecimalNumberConverter;
import com.ning.metrics.collector.events.processing.ActiveMQConnectionFactory;
import com.ning.metrics.collector.events.processing.BufferingEventCollector;
import com.ning.metrics.collector.events.processing.EventCollector;
import com.ning.metrics.collector.events.processing.EventHandler;
import com.ning.metrics.collector.events.processing.EventHandlerImpl;
import com.ning.metrics.collector.events.processing.EventQueueConnectionFactory;
import com.ning.metrics.collector.events.processing.EventQueueProcessor;
import com.ning.metrics.collector.events.processing.EventQueueProcessorImpl;
import com.ning.metrics.collector.events.processing.EventQueueStats;
import com.ning.metrics.collector.events.processing.TaskQueueService;
import com.ning.metrics.collector.events.processing.TaskQueueServiceImpl;
import com.ning.metrics.collector.util.F5PoolMemberControl;
import com.ning.metrics.collector.util.Filter;
import com.ning.metrics.collector.util.NamedThreadFactory;
import com.ning.metrics.serialization.writer.DiskSpoolEventWriter;
import com.ning.metrics.serialization.writer.EventWriter;
import org.apache.hadoop.fs.FileSystem;
import org.skife.config.ConfigurationObjectFactory;
import org.weakref.jmx.guice.ExportBuilder;
import org.weakref.jmx.guice.MBeanModule;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * This module contains the minimal plumbing to instantiate the EventCollector.
 */
public class EventCollectorModule implements Module
{
    @SuppressWarnings("unchecked")
    @Override
    public void configure(Binder binder)
    {
        CollectorConfig config = new ConfigurationObjectFactory(System.getProperties()).build(CollectorConfig.class);
        binder.bind(CollectorConfig.class).toInstance(config);

        // JMX exporter
        ExportBuilder builder = MBeanModule.newExporter(binder);

        binder.bind(EventQueueStats.class).asEagerSingleton();
        builder.export(EventQueueStats.class).as("com.ning.metrics.collector:name=QueueStats");

        binder.bind(EventQueueConnectionFactory.class).to(ActiveMQConnectionFactory.class).asEagerSingleton();

        binder.bind(EventQueueProcessor.class).to(EventQueueProcessorImpl.class).asEagerSingleton();
        builder.export(EventQueueProcessorImpl.class).as("com.ning.metrics.collector:name=EventQueueProcessor");

        binder.bind(FileSystem.class).toProvider(FileSystemProvider.class).asEagerSingleton();

        /*
         * EventWriters
         */
        binder.bind(EventWriter.class).annotatedWith(HdfsEventWriter.class).to(HadoopFileEventWriter.class).asEagerSingleton();
        builder.export(HadoopFileEventWriter.class).as("com.ning.metrics.collector:name=HadoopFileEventWriter");

        binder.bind(DiskSpoolEventWriter.class).toProvider(DiskSpoolEventWriterProvider.class).asEagerSingleton();
        builder.export(DiskSpoolEventWriter.class).as("com.ning.metrics.collector:name=DiskSpoolEventWriter");

        binder.bind(EventWriter.class).annotatedWith(BufferingEventCollectorEventWriter.class).toProvider(ThresholdEventWriterProvider.class).asEagerSingleton();
        builder.export(EventWriter.class).annotatedWith(BufferingEventCollectorEventWriter.class).as("com.ning.metrics.collector:name=ThresholdEventWriter");

        /*
         * TaskQueue
         */
        binder.bind(TaskQueueService.class).to(TaskQueueServiceImpl.class);

        /*
         * ScheduledExecutorServices
         */
        binder.bind(ScheduledExecutorService.class).annotatedWith(DiskSpoolFlushExecutor.class)
            .toInstance(new ScheduledThreadPoolExecutor(2, new NamedThreadFactory("spool to HDFS promoter")));

        binder.bind(ScheduledExecutorService.class).annotatedWith(BufferingEventCollectorExecutor.class)
            .toInstance(new ScheduledThreadPoolExecutor(2, new NamedThreadFactory("tmp to spool promoter")));

        /*
         * Filters
         */
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

        /*
         * Request handlers
         */
        binder.bind(EventRequestHandler.class).annotatedWith(ExternalEventRequestHandler.class)
            .toProvider(new EventRequestHandlerProvider(QueryParameterEventExtractor.class, Names.named("base10"), ExternalEventEndPointStats.class)).asEagerSingleton();
        builder.export(EventRequestHandler.class).annotatedWith(ExternalEventRequestHandler.class)
            .as("com.ning.metrics.collector:name=ExternalEventHandler");

        binder.bind(ThriftEnvelopeEventParser.class).annotatedWith(Names.named("base64"))
            .toProvider(new ThriftEnvelopeEventParserProvider(Base64NumberConverter.class)).asEagerSingleton();

        binder.bind(QueryParameterEventExtractor.class).annotatedWith(Names.named("base64"))
            .toProvider(new ExternalEventExtractorProvider(Names.named("base64"))).asEagerSingleton();

        binder.bind(ThriftEnvelopeEventParser.class).annotatedWith(Names.named("base10"))
            .toProvider(new ThriftEnvelopeEventParserProvider(DecimalNumberConverter.class)).asEagerSingleton();

        binder.bind(QueryParameterEventExtractor.class).annotatedWith(Names.named("base10"))
            .toProvider(new ExternalEventExtractorProvider(Names.named("base10"))).asEagerSingleton();

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

        /*
         * Final wiring
         */
        binder.bind(BufferingEventCollector.class).asEagerSingleton();
        builder.export(BufferingEventCollector.class).as("com.ning.metrics.collector:name=BufferingEventCollector");

        binder.bind(EventCollector.class).to(BufferingEventCollector.class);

        binder.bind(F5PoolMemberControl.class).asEagerSingleton();
        builder.export(F5PoolMemberControl.class).as("com.ning.metrics.collector:name=F5poolMemberControl");
    }
}
