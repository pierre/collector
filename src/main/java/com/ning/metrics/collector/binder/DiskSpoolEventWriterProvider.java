/*
 * Copyright 2010 Ning, Inc.
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

package com.ning.metrics.collector.binder;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;
import com.ning.metrics.collector.binder.annotations.DiskSpoolFlushExecutor;
import com.ning.metrics.collector.binder.annotations.HdfsEventWriter;
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.serialization.event.Event;
import com.ning.metrics.serialization.writer.DiskSpoolEventWriter;
import com.ning.metrics.serialization.writer.EventHandler;
import com.ning.metrics.serialization.writer.EventWriter;
import com.ning.metrics.serialization.writer.SyncType;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.concurrent.ScheduledExecutorService;

public class DiskSpoolEventWriterProvider implements Provider<DiskSpoolEventWriter>
{
    private final Injector injector;
    private final EventWriter hadoopEventWriter;
    private final ScheduledExecutorService executor;

    @Inject
    public DiskSpoolEventWriterProvider(
        Injector injector,
        @HdfsEventWriter EventWriter hadoopEventWriter,
        @DiskSpoolFlushExecutor ScheduledExecutorService executor
    )
    {
        this.injector = injector;
        this.hadoopEventWriter = hadoopEventWriter;
        this.executor = executor;
    }

    /**
     * Provides an instance of {@code T}. Must never return {@code null}.
     *
     * @throws com.google.inject.OutOfScopeException
     *          when an attempt is made to access a scoped object while the scope
     *          in question is not currently active
     * @throws com.google.inject.ProvisionException
     *          if an instance cannot be provided. Such exceptions include messages
     *          and throwables to describe why provision failed.
     */
    @Override
    public DiskSpoolEventWriter get()
    {
        CollectorConfig config = injector.getInstance(CollectorConfig.class);
        return new DiskSpoolEventWriter(new EventHandler()
        {
            @Override
            public void handle(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException
            {
                while (objectInputStream.read() != -1) {
                    Event event = (Event) objectInputStream.readObject();
                    hadoopEventWriter.write(event);
                }

                objectInputStream.close();
                hadoopEventWriter.forceCommit();
            }

            @Override
            public void rollback() throws IOException
            {
                hadoopEventWriter.rollback();
            }

            @Override
            public String toString()
            {
                return hadoopEventWriter.toString();
            }
        }, config.getSpoolDirectoryName(), config.isFlushEnabled(), config.getFlushIntervalInSeconds(), executor, SyncType.valueOf(config.getSyncType()), config.getRateWindowSizeMinutes());
    }
}
