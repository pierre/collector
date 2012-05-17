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

import com.ning.arecibo.jmx.Monitored;
import com.ning.arecibo.jmx.MonitoringType;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Needs to be public for JMX
 */
public class EventQueueStats
{
    private final AtomicLong enqueuedEvents = new AtomicLong(0);
    private final AtomicLong droppedEvents = new AtomicLong(0);
    private final AtomicLong sentEvents = new AtomicLong(0);
    private final AtomicLong erroredEvents = new AtomicLong(0);

    private final Collection<Object> queue;

    private final long maxQueueLength;

    public EventQueueStats(final Collection<Object> queue,
                           final long maxQueueLength)
    {
        this.queue = queue;
        this.maxQueueLength = maxQueueLength;
    }

    public void registerEventEnqueued()
    {
        enqueuedEvents.incrementAndGet();
    }

    public void registerEventDropped()
    {
        droppedEvents.incrementAndGet();
    }

    public void registerEventSent()
    {
        sentEvents.incrementAndGet();
    }

    public void registerEventSendingErrored()
    {
        erroredEvents.incrementAndGet();
    }

    public long getEnqueuedEvents()
    {
        return enqueuedEvents.get();
    }

    public long getDroppedEvents()
    {
        return droppedEvents.get();
    }

    public long getSentEvents()
    {
        return sentEvents.get();
    }

    public long getErroredEvents()
    {
        return erroredEvents.get();
    }

    public long getQueueSize()
    {
        return queue.size();
    }

    /**
     * Unit test hook
     */
    public synchronized void clear()
    {
        enqueuedEvents.set(0);
        droppedEvents.set(0);
        sentEvents.set(0);
        erroredEvents.set(0);
    }
}
