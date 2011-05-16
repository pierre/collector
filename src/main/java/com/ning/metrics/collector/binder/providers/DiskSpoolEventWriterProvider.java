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

package com.ning.metrics.collector.binder.providers;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.ning.metrics.collector.binder.annotations.HdfsDiskSpoolFlushExecutor;
import com.ning.metrics.collector.binder.annotations.HdfsEventWriter;
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.serialization.event.Event;
import com.ning.metrics.serialization.writer.CallbackHandler;
import com.ning.metrics.serialization.writer.DiskSpoolEventWriter;
import com.ning.metrics.serialization.writer.EventHandler;
import com.ning.metrics.serialization.writer.EventWriter;
import com.ning.metrics.serialization.writer.SyncType;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.concurrent.ScheduledExecutorService;

public class DiskSpoolEventWriterProvider implements Provider<DiskSpoolEventWriter>
{
    private final EventWriter hadoopEventWriter;
    private final ScheduledExecutorService executor;
    private final CollectorConfig config;

    @Inject
    public DiskSpoolEventWriterProvider(
        @HdfsEventWriter final EventWriter hadoopEventWriter,
        @HdfsDiskSpoolFlushExecutor final ScheduledExecutorService executor,
        final CollectorConfig config
    )
    {
        this.hadoopEventWriter = hadoopEventWriter;
        this.executor = executor;
        this.config = config;
    }

    @Override
    public DiskSpoolEventWriter get()
    {
        return new DiskSpoolEventWriter(new EventHandler()
        {
            // TODO handler?
            @Override
            public void handle(final ObjectInputStream objectInputStream, final CallbackHandler handler) throws ClassNotFoundException, IOException
            {
                while (objectInputStream.read() != -1) {
                    final Event event = (Event) objectInputStream.readObject();
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
        }, config.getSpoolDirectoryName(), config.isFlushEnabled(), config.getFlushIntervalInSeconds(), executor,
            SyncType.valueOf(config.getSyncType()), config.getSyncBatchSize(), config.getRateWindowSizeMinutes());
    }
}
