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
import com.ning.metrics.serialization.writer.CallbackHandler;
import com.ning.metrics.serialization.writer.DiskSpoolEventWriter;
import com.ning.metrics.serialization.writer.EventHandler;
import com.ning.metrics.serialization.writer.EventWriter;
import com.ning.metrics.serialization.writer.SyncType;
import com.ning.metrics.serialization.writer.ThresholdEventWriter;
import org.apache.hadoop.fs.Path;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class HadoopWriterFactory implements PersistentWriterFactory
{
    private static final Logger log = Logger.getLogger(HadoopWriterFactory.class);
    private static final DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH.mm.ss").withZone(DateTimeZone.UTC);

    private final CollectorConfig config;
    private final FileSystemAccess hdfsAccess;

    @Inject
    public HadoopWriterFactory(final FileSystemAccess hdfsAccess, final CollectorConfig config)
    {
        this.hdfsAccess = hdfsAccess;
        this.config = config;
    }

    @Override
    public EventWriter createPersistentWriter(final WriterStats stats, final SerializationType serializationType, final String eventName, final String hdfsDir)
    {
        final DateTime timeStamp = new DateTime();
        final String localFilename = String.format("%s-%d-%s.%s", config.getLocalIp(), config.getLocalPort(), dateFormatter.print(timeStamp), serializationType.getFileSuffix());

        final EventWriter eventWriter = new DiskSpoolEventWriter<Event>(new EventHandler()
        {
            private int flushCount = 0;

            @Override
            public void handle(final File file, final CallbackHandler handler)
            {
                try {
                    /* fileName includes a number of things to avoid collisions:
                       ip  to avoid conflicts between machines
                       fileExtension  (serialization-type-specific) so multiple file extensions can be written to same directory
                       flushCount  so the same queue can write multiple times
                       queueCreationTimestamp  so if, for instance, we shut down and restart the collector within an hour, their writes won't conflict
                    */
                    final String outputPath = String.format("%s/%s-%d-%s-f%d.%s", hdfsDir, config.getLocalIp(), config.getLocalPort(), dateFormatter.print(timeStamp), flushCount, serializationType.getFileSuffix());
                    log.info(String.format("Flushing events to HDFS: [%s] -> [%s]", file.getAbsolutePath(), outputPath));
                    hdfsAccess.get().copyFromLocalFile(new Path(file.getAbsolutePath()), new Path(outputPath));
                }
                catch (IOException e) {
                    handler.onError(e, file);
                }

                handler.onSuccess(file);
                stats.registerHdfsFlush();
                flushCount++;
            }
        }, String.format("%s/%s", config.getSpoolDirectoryName(), localFilename), config.isFlushEnabled(), config.getFlushIntervalInSeconds(), new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("spool to HDFS promoter")),
            SyncType.valueOf(config.getSyncType()), config.getSyncBatchSize(), config.getRateWindowSizeMinutes(), serializationType.getSerializer());
        return new ThresholdEventWriter(eventWriter, config.getFlushEventQueueSize(), config.getRefreshDelayInSeconds());
    }
}
