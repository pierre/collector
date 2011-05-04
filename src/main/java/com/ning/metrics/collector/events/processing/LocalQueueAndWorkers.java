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

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.util.FailsafeScheduledExecutor;
import com.ning.metrics.collector.util.NamedThreadFactory;

public class LocalQueueAndWorkers
{
    private final BlockingQueue<Object> queue;
    private final EventQueueSession processor;
    private final ExecutorService executor;
    private final EventQueueStats stats;

    public LocalQueueAndWorkers(CollectorConfig config, String type, EventQueueSession processor, EventQueueStats stats)
    {
        this.queue = new LinkedBlockingQueue<Object>(config.getActiveMQBufferLength());
        this.processor = processor;
        this.stats = stats;
        this.executor = new FailsafeScheduledExecutor(config.getActiveMQNumSendersPerCategory(), new NamedThreadFactory(type + "-workers"));
        for (int idx = 0; idx < config.getActiveMQNumSendersPerCategory(); idx++) {
            executor.submit(new LocalQueueWorker(queue, processor, stats));
        }
    }

    public void close()
    {
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

    public void offer(Object event)
    {
        if (queue.offer(event)) {
            stats.registerEventEnqueued();
        }
        else {
            stats.registerEventDropped();
        }
    }
}
