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

package com.ning.metrics.collector.healthchecks;

import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.hadoop.processing.EventSpoolDispatcher;
import com.ning.metrics.collector.hadoop.processing.HadoopWriterFactory;
import com.ning.metrics.collector.hadoop.processing.LocalQueueAndWriter;
import com.ning.metrics.collector.hadoop.processing.PersistentWriterFactory;
import com.ning.metrics.collector.hadoop.processing.WriterStats;

import com.google.inject.Inject;
import com.yammer.metrics.core.HealthCheck;

import java.util.Set;

public class WriterHealthCheck extends HealthCheck
{
    private final EventSpoolDispatcher processor;
    private final WriterStats stats;
    private final PersistentWriterFactory factory;
    private final CollectorConfig config;

    @Inject
    public WriterHealthCheck(final EventSpoolDispatcher processor, final PersistentWriterFactory factory, final WriterStats stats, final CollectorConfig config)
    {
        super(WriterHealthCheck.class.getName());
        this.processor = processor;
        this.factory = factory;
        this.stats = stats;
        this.config = config;
    }

    @Override
    public Result check()
    {
        try {
            final StringBuilder builder = new StringBuilder();

            builder.append(String.format("running: %s, ", processor.isRunning()));

            builder.append("local files: {");
            int i = 1;
            final Set<String> paths = processor.getQueuesPerPath().keySet();
            for (final String queue : paths) {
                final LocalQueueAndWriter worker = processor.getQueuesPerPath().get(queue);
                builder.append(String.format("%s: %d", queue, worker.size()));
                if (worker.size() == config.getMaxQueueSize()) {
                    builder.append(" [FULL]");
                }

                if (i < paths.size()) {
                    builder.append(", ");
                }
                i++;
            }
            builder.append("}, ");

            builder.append(String.format("enqueued: %s, ", stats.getEnqueuedEvents()));
            builder.append(String.format("written: %s, ", stats.getWrittenEvents()));
            builder.append(String.format("dropped: %s, ", stats.getDroppedEvents())); // queue full
            builder.append(String.format("errored: %s, ", stats.getErroredEvents())); // I/O error
            builder.append(String.format("ignored: %s, ", stats.getIgnoredEvents())); // system disabled
            if (factory instanceof HadoopWriterFactory) {
                builder.append(String.format("pendingFiles: %s, ", ((HadoopWriterFactory) factory).nbLocalFiles())); // files waiting to be flushed
            }
            builder.append(String.format("flushes: %s", stats.getHdfsFlushes())); // HDFS flushes

            final String message = builder.toString();
            if (!processor.isRunning()) {
                return Result.unhealthy(message);
            }
            else {
                return Result.healthy(message);
            }
        }
        catch (Exception e) {
            return Result.unhealthy("Exception when trying to access writer subsystem");
        }
    }
}
