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
import com.ning.metrics.collector.realtime.EventQueueStats;
import com.ning.metrics.serialization.event.Event;
import com.ning.metrics.serialization.writer.CallbackHandler;
import com.ning.metrics.serialization.writer.DiskSpoolEventWriter;
import com.ning.metrics.serialization.writer.EventHandler;
import com.ning.metrics.serialization.writer.EventWriter;
import com.ning.metrics.serialization.writer.SyncType;
import com.ning.metrics.serialization.writer.ThresholdEventWriter;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

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
    private final EventWriter hadoopEventWriter;
    private final ScheduledExecutorService hadoopExecutor;

    @Inject
    public EventSpoolDispatcher(@HdfsEventWriter final EventWriter hadoopEventWriter, @HdfsDiskSpoolFlushExecutor final ScheduledExecutorService executor,
                                final EventQueueStats stats, final CollectorConfig config)
    {
        this.hadoopEventWriter = hadoopEventWriter;
        this.hadoopExecutor = executor;
        this.stats = stats;
        this.config = config;
    }

    public void shutdown() throws InterruptedException
    {
        for (final LocalQueueAndWriter queue : queuesPerPath.values()) {
            queue.close();
        }
        queuesPerPath.clear();
    }

    public void offer(final Event event)
    {
        if (event != null) {
            final String hdfsPath = event.getOutputDir(config.getEventOutputDirectory());
            LocalQueueAndWriter queue = queuesPerPath.get(hdfsPath);

            if (queue == null) {
                synchronized (queueMapMonitor) {
                    queue = queuesPerPath.get(hdfsPath);
                    if (queue == null) {
                        queue = new LocalQueueAndWriter(config, hdfsPath, getEventWriter(), stats);
                        queuesPerPath.put(hdfsPath, queue);
                    }
                }
            }

            queue.offer(event);
        }
        else {
            stats.registerEventIgnored();
        }
    }

    public Map<String, Integer> getQueuesSizes()
    {
        final Map<String, Integer> map = new HashMap<String, Integer>();
        for (final String path : queuesPerPath.keySet()) {
            map.put(path, queuesPerPath.get(path).size());
        }

        return map;
    }

    private EventWriter getEventWriter()
    {
        final EventWriter eventWriter = new DiskSpoolEventWriter(new EventHandler()
        {
            // TODO handler?
            @Override
            public void handle(final ObjectInputStream objectInputStream, final CallbackHandler handler) throws ClassNotFoundException, IOException
            {
                log.info("Flushing locally buffered events to HDFS");

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
        }, config.getSpoolDirectoryName(), config.isFlushEnabled(), config.getFlushIntervalInSeconds(), hadoopExecutor,
            SyncType.valueOf(config.getSyncType()), config.getSyncBatchSize(), config.getRateWindowSizeMinutes());
        return new ThresholdEventWriter(eventWriter, config.getFlushEventQueueSize(), config.getRefreshDelayInSeconds());
    }
}
