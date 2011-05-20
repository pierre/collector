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

import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.realtime.EventQueueStats;
import com.ning.metrics.collector.util.FailsafeScheduledExecutor;
import com.ning.metrics.collector.util.NamedThreadFactory;
import com.ning.metrics.serialization.event.Event;
import com.ning.metrics.serialization.writer.EventWriter;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Writer manager for a specific queue
 */
class LocalQueueAndWriter
{
    private final Logger log = Logger.getLogger(LocalQueueAndWriter.class);

    private final BlockingQueue<Event> queue;
    private final EventWriter eventWriter;
    private final ScheduledExecutorService scheduledExecutor;
    private final ExecutorService executor;
    private final EventQueueStats stats;

    public LocalQueueAndWriter(final CollectorConfig config, final String path, final EventWriter eventWriter, final EventQueueStats stats)
    {
        this.queue = new LinkedBlockingQueue<Event>(config.getMaxQueueSize());
        this.eventWriter = eventWriter;
        this.stats = stats;

        // Background commiter (close the current open file and promote it to the final spool area for flush)
        this.scheduledExecutor = new FailsafeScheduledExecutor(1, new NamedThreadFactory(path + "-commiter"));
        scheduledExecutor.schedule(new Runnable()
            {
                @Override
                public void run()
                {
                    try {

                        eventWriter.commit();
                    }
                    catch (IOException e) {
                        try {
                            eventWriter.rollback();
                        }
                        catch (IOException e1) {
                            log.warn("Got IOException while trying to quarantine a file", e1);
                        }
                    }
                    finally {
                        scheduledExecutor.schedule(this, config.getRefreshDelayInSeconds(), TimeUnit.SECONDS);
                    }
                }
            }, config.getRefreshDelayInSeconds(), TimeUnit.SECONDS);

        // Underlying dequeuer (writer)
        this.executor = new FailsafeScheduledExecutor(1, new NamedThreadFactory(path + "-writer"));
        executor.submit(new LocalQueueWorker(queue, eventWriter, stats));
    }

    public void close()
    {
        executor.shutdown();
        try {
            executor.awaitTermination(5, TimeUnit.SECONDS);
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        executor.shutdownNow();

        scheduledExecutor.shutdown();
        try {
            scheduledExecutor.awaitTermination(5, TimeUnit.SECONDS);
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        scheduledExecutor.shutdownNow();

        // Promote files to the final area
        try {
            eventWriter.forceCommit();
        }
        catch (IOException e) {
            log.warn("Got IOException when trying to promote files to the final spool area", e);
        }

        queue.clear();
    }

    /**
     * Insert an event to the underlying queue
     *
     * @param event event to insert
     */
    public void offer(final Event event)
    {
        if (queue.offer(event)) {
            stats.registerEventEnqueued();
        }
        else {
            stats.registerEventDropped();
        }
    }
}