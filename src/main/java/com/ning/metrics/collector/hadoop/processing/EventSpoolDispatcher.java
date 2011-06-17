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
import com.ning.metrics.collector.util.FailsafeScheduledExecutor;
import com.ning.metrics.collector.util.NamedThreadFactory;
import com.ning.metrics.serialization.event.Event;
import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Manager of writer queues
 */
class EventSpoolDispatcher
{
    private final Logger log = Logger.getLogger(EventSpoolDispatcher.class);

    private final PersistentWriterFactory factory;
    private final WriterStats stats;
    private final CollectorConfig config;
    private final Map<String, LocalQueueAndWriter> queuesPerPath = new ConcurrentHashMap<String, LocalQueueAndWriter>();
    private final Object queueMapMonitor = new Object();
    private final AtomicBoolean isRunning = new AtomicBoolean(true);

    @Inject
    public EventSpoolDispatcher(final PersistentWriterFactory factory, final WriterStats stats, final CollectorConfig config)
    {
        this.factory = factory;
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
                        final Set<String> queuePaths = new HashSet<String>(queuesPerPath.keySet());
                        for (final String queuePath : queuePaths) {
                            final LocalQueueAndWriter queueAndWriter = queuesPerPath.get(queuePath);
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

    /**
     * Close all underlying queues
     */
    public void shutdown()
    {
        log.info("Closing all local writer queues");
        for (final LocalQueueAndWriter queue : queuesPerPath.values()) {
            queue.close();
        }
        queuesPerPath.clear();
        isRunning.set(false);
    }

    public boolean isRunning()
    {
        return isRunning.get();
    }

    /**
     * Dispatch the specified event to its final eventwriter
     *
     * @param event Event to dispatch
     * @return true on success, false otherwise
     */
    public boolean offer(final Event event)
    {
        final SerializationType eventType = SerializationType.get(event);

        if (event != null && isRunning.get()) {
            final String hdfsDir = event.getOutputDir(config.getEventOutputDirectory());
            final String key = String.format("%s|%s", event.getOutputDir(config.getEventOutputDirectory()), eventType.getFileSuffix());
            LocalQueueAndWriter queue = queuesPerPath.get(key);

            if (queue == null) {
                synchronized (queueMapMonitor) {
                    queue = queuesPerPath.get(key);
                    if (queue == null) {
                        queue = new LocalQueueAndWriter(config, hdfsDir, factory.createPersistentWriter(stats, eventType, event.getName(), hdfsDir), stats);
                        queuesPerPath.put(key, queue);
                    }
                }
            }

            return queue.offer(event);
        }
        else {
            stats.registerEventIgnored();
            return false;
        }
    }

    /**
     * Number of events not yet committed (combined size of all queues)
     *
     * @return number of uncommitted events
     */
    public Map<String, Integer> getQueuesSizes()
    {
        final Map<String, Integer> map = new HashMap<String, Integer>();
        for (final String path : queuesPerPath.keySet()) {
            map.put(path, queuesPerPath.get(path).size());
        }

        return map;
    }

    /**
     * Unit test hook
     *
     * @return underlying map
     */
    Map<String, LocalQueueAndWriter> getQueuesPerPath()
    {
        return queuesPerPath;
    }

    /**
     * Unit test hook
     *
     * @return stats object, accounting for all queues
     */
    public WriterStats getStats()
    {
        return stats;
    }
}
