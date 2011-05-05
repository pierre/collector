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

import org.weakref.jmx.Managed;

import java.util.concurrent.atomic.AtomicLong;

public class EventQueueStats
{
    private final AtomicLong ignoredEvents = new AtomicLong(0);
    private final AtomicLong enqueuedEvents = new AtomicLong(0);
    private final AtomicLong droppedEvents = new AtomicLong(0);
    private final AtomicLong sentEvents = new AtomicLong(0);
    private final AtomicLong erroredEvents = new AtomicLong(0);

    public void registerEventIgnored()
    {
        ignoredEvents.incrementAndGet();
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

    @Managed(description = "Number of ignored events")
    public long getIgnoredEvents()
    {
        return ignoredEvents.get();
    }

    @Managed(description = "Number of locally enqueued events")
    public long getEnqueuedEvents()
    {
        return enqueuedEvents.get();
    }

    @Managed(description = "Number of dropped events")
    public long getDroppedEvents()
    {
        return droppedEvents.get();
    }

    @Managed(description = "Number of successfully sent events")
    public long getSentEvents()
    {
        return sentEvents.get();
    }

    @Managed(description = "Number of events that could not be sent due to an error")
    public long getErroredEvents()
    {
        return erroredEvents.get();
    }


}
