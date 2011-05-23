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

import com.google.inject.Inject;
import com.ning.metrics.collector.binder.annotations.HdfsDiskSpoolFlushExecutor;
import com.ning.metrics.collector.binder.annotations.HdfsEventWriter;
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.events.hadoop.writer.FileSystemAccess;
import com.ning.metrics.collector.realtime.EventQueueStats;
import com.ning.metrics.collector.util.FailsafeScheduledExecutor;
import com.ning.metrics.collector.util.NamedThreadFactory;
import com.ning.metrics.serialization.event.Event;
import com.ning.metrics.serialization.event.EventSerializer;
import com.ning.metrics.serialization.event.SmileEnvelopeEvent;
import com.ning.metrics.serialization.event.ThriftEnvelopeEvent;
import com.ning.metrics.serialization.smile.SmileEnvelopeEventSerializer;
import com.ning.metrics.serialization.writer.*;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.serializer.Serialization;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Manager of all queues
 */
public class EventSpoolDispatcher
{
    private final Logger log = Logger.getLogger(EventSpoolDispatcher.class);

    private final Map<String, LocalQueueAndWriter> queuesPerPath = new HashMap<String, LocalQueueAndWriter>();
    private final EventQueueStats stats;
    private final CollectorConfig config;
    private final Object queueMapMonitor = new Object();
    private final ScheduledExecutorService hadoopExecutor;
    private final FileSystemAccess hdfsAccess;

    @Inject
    public EventSpoolDispatcher(final FileSystemAccess hdfsAccess, @HdfsDiskSpoolFlushExecutor final ScheduledExecutorService executor,
                                final EventQueueStats stats, final CollectorConfig config)
    {
        this.hdfsAccess = hdfsAccess;
        this.hadoopExecutor = executor;
        this.stats = stats;
        this.config = config;

        // Background committer (close the current open file and promote it to the final spool area for flush)
        final ScheduledExecutorService scheduledExecutor = new FailsafeScheduledExecutor(1, new NamedThreadFactory("queueReaper"));
        scheduledExecutor.schedule(new Runnable()
        {
            @Override
            public void run()
            {
                try {
                    for (String queuePath : queuesPerPath.keySet()) {
                        LocalQueueAndWriter queueAndWriter = queuesPerPath.get(queuePath);
                        if (queueAndWriter.isEmpty()) {
                            boolean isRemoved = false;
                            // synchronized to avoid conflicts when we get a queue to offer an event to
                            synchronized (queueMapMonitor) {
                                if (queueAndWriter.isEmpty()) {
                                    queuesPerPath.remove(queuePath);
                                    isRemoved = true;
                                }
                            }
                            if (isRemoved) {
                                // closing is expensive b/c we're destroying threads, so we don't want to do this
                                // within the synchronized block
                                queueAndWriter.close();
                            }
                        }
                    }
                }
                finally {
                    scheduledExecutor.schedule(this, config.getRefreshDelayInSeconds(), TimeUnit.SECONDS);
                }
            }
        }, 1, TimeUnit.HOURS);
    }

    public void shutdown() throws InterruptedException
    {
        for (final LocalQueueAndWriter queue : queuesPerPath.values()) {
            queue.close();
        }
        queuesPerPath.clear();
    }

    // TODO add a cleanup function

    public void offer(final Event event)
    {
        EventType eventType = EventType.DEFAULT;
        if (event instanceof SmileEnvelopeEvent) {
            eventType = EventType.SMILE;
        }
        else if (event instanceof ThriftEnvelopeEvent) {
            eventType = EventType.THRIFT;
        }

        if (event != null) {
            final String hdfsPath = event.getOutputDir(config.getEventOutputDirectory());
            String key = String.format("%s|%s", eventType.name(), hdfsPath);

            // synchronized so it doesn't conflict w/ queue removal
            synchronized (queueMapMonitor) {
                LocalQueueAndWriter queue = queuesPerPath.get(key);

                if (queue == null) {
                    queue = new LocalQueueAndWriter(config, hdfsPath, getEventWriter(hdfsPath, eventType), stats);
                    queuesPerPath.put(key, queue);
                }

                queue.offer(event);
            }
        }
        else {
            stats.registerEventIgnored();
        }
    }

    private EventWriter getEventWriter(final String path, final EventType eventType)
    {
        final EventSerializer serializer = eventType.getSerializer();
        // TODO Specify the correct eventserializer for this specific queue
        final EventWriter eventWriter = new DiskSpoolEventWriter<Event>(new EventHandler()
        {
            @Override
            public void handle(final File file, final CallbackHandler handler)
            {
                log.info("Flushing locally buffered events to HDFS");

                try {
                    hdfsAccess.get().copyFromLocalFile(new Path(file.getAbsolutePath()), new Path(path));
                }
                catch (IOException e) {
                    handler.onError(e, file);
                }

                handler.onSuccess(file);
            }
        }, config.getSpoolDirectoryName() + path, config.isFlushEnabled(), config.getFlushIntervalInSeconds(), hadoopExecutor,
            SyncType.valueOf(config.getSyncType()), config.getSyncBatchSize(), config.getRateWindowSizeMinutes(),
            serializer);
        return new ThresholdEventWriter(eventWriter, config.getFlushEventQueueSize(), config.getRefreshDelayInSeconds());
    }

    private enum EventType
    {
        SMILE
            {
                @Override
                public EventSerializer getSerializer()
                {
                    return new SmileEnvelopeEventSerializer(false);
                }
            },
        JSON
            {
                @Override
                public EventSerializer getSerializer()
                {
                    return new SmileEnvelopeEventSerializer(true);
                }
            },
        THRIFT,
        DEFAULT;

        public EventSerializer getSerializer()
        {
            return new ObjectOutputEventSerializer();
        }
    }
}
