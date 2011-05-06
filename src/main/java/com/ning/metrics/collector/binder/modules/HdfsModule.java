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
import com.ning.metrics.collector.binder.DiskSpoolEventWriterProvider;
import com.ning.metrics.collector.binder.FileSystemProvider;
import com.ning.metrics.collector.binder.annotations.HdfsDiskSpoolFlushExecutor;
import com.ning.metrics.collector.binder.annotations.HdfsEventWriter;
import com.ning.metrics.collector.events.hadoop.writer.HadoopFileEventWriter;
import com.ning.metrics.collector.util.NamedThreadFactory;
import com.ning.metrics.serialization.writer.DiskSpoolEventWriter;
import com.ning.metrics.serialization.writer.EventWriter;
import org.apache.hadoop.fs.FileSystem;
import org.weakref.jmx.guice.ExportBuilder;
import org.weakref.jmx.guice.MBeanModule;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * This module provides the wiring for the back-end writers to Hadoop
 */
public class HdfsModule implements Module
{
    @Override
    public void configure(Binder binder)
    {   // JMX exporter
        ExportBuilder builder = MBeanModule.newExporter(binder);

        // The ThresholdEventWriter, controlled by the front-end EventCollector, delegates to this DiskSpoolEventWriter
        // @see DiskSpoolEventWriterProvider
        binder.bind(DiskSpoolEventWriter.class).toProvider(DiskSpoolEventWriterProvider.class).asEagerSingleton();
        builder.export(DiskSpoolEventWriter.class).as("com.ning.metrics.collector:name=DiskSpoolEventWriter");

        // The DiskSpoolEventWriter is responsible for periodic flushes to HDFS
        binder.bind(ScheduledExecutorService.class).annotatedWith(HdfsDiskSpoolFlushExecutor.class)
            .toInstance(new ScheduledThreadPoolExecutor(2, new NamedThreadFactory("spool to HDFS promoter")));
        binder.bind(EventWriter.class).annotatedWith(HdfsEventWriter.class).to(HadoopFileEventWriter.class).asEagerSingleton();
        builder.export(HadoopFileEventWriter.class).as("com.ning.metrics.collector:name=HadoopFileEventWriter");

        // HDFS raw access
        binder.bind(FileSystem.class).toProvider(FileSystemProvider.class).asEagerSingleton();
    }
}
