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

import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.util.FailsafeScheduledExecutor;
import com.ning.metrics.collector.util.NamedThreadFactory;
import com.ning.metrics.serialization.event.Event;
import com.ning.metrics.serialization.writer.EventWriter;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Writer manager for a specific queue
 */
class LocalQueueAndWriter
{
    private final Logger log = Logger.getLogger(LocalQueueAndWriter.class);

    private final BlockingQueue<Event> queue;
    private final EventWriter eventWriter;
    private final ExecutorService executor;
    private final WriterStats stats;

    public LocalQueueAndWriter(final CollectorConfig config, final String path, final EventWriter eventWriter, final WriterStats stats)
    {
        this.queue = new LinkedBlockingQueue<Event>(config.getMaxQueueSize());
        this.eventWriter = eventWriter;
        this.stats = stats;

        // Underlying dequeuer (writer)
        this.executor = new FailsafeScheduledExecutor(1, new NamedThreadFactory(path + "-writer"));
        executor.submit(new LocalQueueWorker(queue, eventWriter, stats));
    }

    public void close()
    {
        // Stop the writer
        executor.shutdown();
        try {
            executor.awaitTermination(5, TimeUnit.SECONDS);
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        executor.shutdownNow();

        try {
            // Promote files to the final area
            eventWriter.forceCommit();
            // Flush to HDFS
            eventWriter.flush();
        }
        catch (IOException e) {
            log.warn("Got IOException when trying to promote files to the final spool area", e);
        }

        queue.clear();
    }

    /**
     * Inserts the specified element into this queue if it is possible to do
     * so immediately without violating capacity restrictions, returning
     * <tt>true</tt> upon success and <tt>false</tt> if no space is currently
     * available.
     *
     * @param event event to insert
     * @return <tt>true</tt> if the element was added to this queue, else
     *         <tt>false</tt>
     */
    public boolean offer(final Event event)
    {
        if (queue.offer(event)) {
            stats.registerEventEnqueued();
            return true;
        }
        else {
            stats.registerEventDropped();
            return false;
        }
    }

    public int size()
    {
        return queue.size();
    }

    /**
     * Unit test hook
     *
     * @return underlying eventwriter
     */
    EventWriter getEventWriter()
    {
        return eventWriter;
    }
}