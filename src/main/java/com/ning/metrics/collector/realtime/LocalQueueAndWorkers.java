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

package com.ning.metrics.collector.realtime;

import com.mogwee.executors.FailsafeScheduledExecutor;
import com.ning.metrics.collector.binder.config.CollectorConfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.weakref.jmx.MBeanExporter;

import java.lang.management.ManagementFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

class LocalQueueAndWorkers
{
    private static final Logger logger = LoggerFactory.getLogger(LocalQueueAndWorkers.class);
    private static final MBeanExporter exporter = new MBeanExporter(ManagementFactory.getPlatformMBeanServer());

    private final BlockingQueue<Object> queue;
    private final String type;
    private final EventQueueSession processor;
    private final ExecutorService executor;
    private final EventQueueStats stats;

    public LocalQueueAndWorkers(final String type, final EventQueueSession processor,
            final GlobalEventQueueStats globalEventQueueStats)
    {
        this.type = type;
        this.processor = processor;

        // important: MUST use config from processor, to get per-category overrides!
        final CollectorConfig config = processor.getConfig();
        final int queueLength = config.getActiveMQBufferLength();

        this.queue = new LinkedBlockingQueue<Object>(queueLength);

        // Gather per-queue stats and expose them via JMX
        stats = globalEventQueueStats.createLocalStats(type, queue, queueLength);
        // Each type is exported as a child bean of RTQueueStats
        exporter.export(getMBeanName(), stats);

        final int senderCount = config.getActiveMQNumSendersPerCategory();
        this.executor = new FailsafeScheduledExecutor(senderCount, type + "-workers");
        
        logger.info(String.format("Creating %d senders for category '%s', max queue length: %d",
                senderCount, type, queueLength));
        
        for (int idx = 0; idx < senderCount; idx++) {
            executor.submit(new LocalQueueWorker(queue, processor, stats));
        }
    }

    public void close()
    {
        exporter.unexport(getMBeanName());
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.SECONDS);
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        executor.shutdownNow();
        processor.close();
        queue.clear();
    }

    public void offer(final Object event)
    {
        if (queue.offer(event)) {
            stats.registerEventEnqueued();
        }
        else {
            stats.registerEventDropped();
        }
    }

    private String getMBeanName()
    {
        return String.format("com.ning.metrics.collector:name=RTQueueStats,Type=%s", type);
    }
}
