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

package com.ning.metrics.collector.events.processing;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.ning.metrics.collector.binder.annotations.BufferingEventCollectorEventWriter;
import com.ning.metrics.collector.binder.annotations.BufferingEventCollectorExecutor;
import com.ning.metrics.collector.binder.providers.ThresholdEventWriterProvider;
import com.ning.metrics.collector.util.NamedThreadFactory;
import com.ning.metrics.serialization.writer.EventWriter;
import org.weakref.jmx.guice.ExportBuilder;
import org.weakref.jmx.guice.MBeanModule;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class EventCollectorModule implements Module
{
    @Override
    public void configure(final Binder binder)
    {
        // JMX exporter
        final ExportBuilder builder = MBeanModule.newExporter(binder);

        binder.bind(EventWriter.class).annotatedWith(BufferingEventCollectorEventWriter.class).toProvider(ThresholdEventWriterProvider.class).asEagerSingleton();
        builder.export(EventWriter.class).annotatedWith(BufferingEventCollectorEventWriter.class).as("com.ning.metrics.collector:name=ThresholdEventWriter");

        binder.bind(ScheduledExecutorService.class).annotatedWith(BufferingEventCollectorExecutor.class)
            .toInstance(new ScheduledThreadPoolExecutor(2, new NamedThreadFactory("tmp to spool promoter")));

        binder.bind(BufferingEventCollector.class).asEagerSingleton();
        builder.export(BufferingEventCollector.class).as("com.ning.metrics.collector:name=BufferingEventCollector");

        binder.bind(TaskQueueService.class).to(TaskQueueServiceImpl.class).asEagerSingleton();

        binder.bind(EventCollector.class).toProvider(EventCollectorProvider.class).asEagerSingleton();
    }
}
