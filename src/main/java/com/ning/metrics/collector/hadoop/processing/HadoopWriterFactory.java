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

package com.ning.metrics.collector.hadoop.processing;

import com.google.inject.Inject;
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.hadoop.writer.FileSystemAccess;
import com.ning.metrics.collector.util.NamedThreadFactory;
import com.ning.metrics.serialization.event.Event;
import com.ning.metrics.serialization.event.EventSerializer;
import com.ning.metrics.serialization.writer.CallbackHandler;
import com.ning.metrics.serialization.writer.DiskSpoolEventWriter;
import com.ning.metrics.serialization.writer.EventHandler;
import com.ning.metrics.serialization.writer.EventWriter;
import com.ning.metrics.serialization.writer.SyncType;
import com.ning.metrics.serialization.writer.ThresholdEventWriter;
import org.apache.hadoop.fs.Path;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

class HadoopWriterFactory implements PersistentWriterFactory
{
    private final Logger log = Logger.getLogger(HadoopWriterFactory.class);

    private final CollectorConfig config;
    private final FileSystemAccess hdfsAccess;

    @Inject
    public HadoopWriterFactory(final FileSystemAccess hdfsAccess, final CollectorConfig config)
    {
        this.hdfsAccess = hdfsAccess;
        this.config = config;
    }

    @Override
    public EventWriter createPersistentWriter(final WriterStats stats, final EventSerializer serializer, final String hdfsPath)
    {
        final EventWriter eventWriter = new DiskSpoolEventWriter<Event>(new EventHandler()
        {
            @Override
            public void handle(final File file, final CallbackHandler handler)
            {
                log.info("Flushing locally buffered events to HDFS");

                try {
                    hdfsAccess.get().copyFromLocalFile(new Path(file.getAbsolutePath()), new Path(hdfsPath));
                }
                catch (IOException e) {
                    handler.onError(e, file);
                }

                handler.onSuccess(file);
            }
        }, config.getSpoolDirectoryName(), config.isFlushEnabled(), config.getFlushIntervalInSeconds(), new ScheduledThreadPoolExecutor(2, new NamedThreadFactory("spool to HDFS promoter")),
            SyncType.valueOf(config.getSyncType()), config.getSyncBatchSize(), config.getRateWindowSizeMinutes(),
            serializer);
        return new ThresholdEventWriter(eventWriter, config.getFlushEventQueueSize(), config.getRefreshDelayInSeconds());
    }
}
