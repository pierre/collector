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
import com.ning.metrics.serialization.event.Granularity;
import com.ning.metrics.serialization.event.GranularityPathMapper;
import com.ning.metrics.serialization.writer.CallbackHandler;
import com.ning.metrics.serialization.writer.DiskSpoolEventWriter;
import com.ning.metrics.serialization.writer.EventHandler;
import com.ning.metrics.serialization.writer.EventWriter;
import com.ning.metrics.serialization.writer.SyncType;
import com.ning.metrics.serialization.writer.ThresholdEventWriter;
import org.apache.axis.utils.StringUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.hadoop.fs.Path;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadableInstant;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.weakref.jmx.Managed;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

public class HadoopWriterFactory implements PersistentWriterFactory
{
    private static final Logger log = Logger.getLogger(HadoopWriterFactory.class);
    private static final DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH.mm.ss").withZone(DateTimeZone.UTC);

    private final CollectorConfig config;
    private final FileSystemAccess hdfsAccess;
    private final AtomicBoolean flushEnabled = new AtomicBoolean(true);

    @Inject
    public HadoopWriterFactory(final FileSystemAccess hdfsAccess, final CollectorConfig config)
    {
        this.hdfsAccess = hdfsAccess;
        this.config = config;
    }

    @Override
    public EventWriter createPersistentWriter(final WriterStats stats, final SerializationType serializationType, final String eventName, final String hdfsDir)
    {
        final ReadableInstant timeStamp = new DateTime();
        final String localFilename = String.format("%s-%d-%s.%s.%s", config.getLocalIp(), config.getLocalPort(), dateFormatter.print(timeStamp), eventName, serializationType.getFileSuffix());

        final EventWriter eventWriter = new DiskSpoolEventWriter(new EventHandler()
        {
            private int flushCount = 0;

            @Override
            public void handle(final File file, final CallbackHandler handler)
            {
                if (!flushEnabled.get()) {
                    return; // HDFS upgrade maybe?
                }

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

    /**
     * In case the EventWriter responsible for a certain queue goes away (e.g. collector restarted),
     * we need to process manually all files left below.
     * This includes all files in all directories under the spool directory, but the ones in _tmp. _tmp are files being written,
     * since they may not have been be closed, we don't want to upload garbage.
     *
     * @throws java.io.IOException Exception when writing to HDFS
     * @see <a href="http://en.wikipedia.org/wiki/Thank_God,_It's_Doomsday">Left Below</a>
     */
    @Override
    @Managed(description = "Process all local files files")
    public void processLeftBelowFiles() throws IOException
    {
        for (final File file : FileUtils.listFiles(new File(config.getSpoolDirectoryName()), FileFilterUtils.trueFileFilter(), FileFilterUtils.notFileFilter(FileFilterUtils.nameFileFilter("_tmp")))) {
            // Find the spool directory name
            String parentDirectory = file.getParent();
            if (parentDirectory.endsWith("/_lock") || parentDirectory.endsWith("_quarantine")) {
                parentDirectory = file.getParentFile().getParent();
            }

            // parentDirectory is like 127.0.0.1-8080-2011-05-27T15.42.03.FrontDoorVisit.smile
            final String[] directoryTokens = StringUtils.split(parentDirectory, '.');
            final String fileSuffix = directoryTokens[directoryTokens.length - 1];
            final String eventName = directoryTokens[directoryTokens.length - 2];

            // TODO Use default granularity of HOURLY, we could have different granularity in the file though :(
            // This may be already broken in EventSpoolDispatcher
            final GranularityPathMapper pathMapper = new GranularityPathMapper(String.format("%s/%s", config.getEventOutputDirectory(), eventName), Granularity.HOURLY);
            final String hdfsDir = pathMapper.getPathForDateTime(new DateTime(file.lastModified()));

            // We need the flush count if we have multiple quarantined files for a specific event and hour for instance
            int flushCount = 1;
            final String outputPath = String.format("%s/left_below-%s-%d-%s-f%d.%s", hdfsDir, config.getLocalIp(), config.getLocalPort(), dateFormatter.print(new DateTime()), flushCount, fileSuffix);

            log.info(String.format("Flushing events to HDFS: [%s] -> [%s]", file.getAbsolutePath(), outputPath));
            hdfsAccess.get().copyFromLocalFile(new Path(file.getAbsolutePath()), new Path(outputPath));
            if (!file.delete()) {
                log.warn(String.format("Exception cleaning up left below file: %s. We might have DUPS in HDFS!", file.toString()));
            }

            flushCount++;
        }
    }

    @Managed(description = "Whether files should be flushed to HDFS")
    public AtomicBoolean getFlushEnabled()
    {
        return flushEnabled;
    }

    @Managed(description = "Enable flush to HDFS")
    public void enableFlush()
    {
        flushEnabled.set(true);
    }

    @Managed(description = "Disable flush to HDFS")
    public void disableFlush()
    {
        flushEnabled.set(false);
    }
}
