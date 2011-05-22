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

import org.weakref.jmx.Managed;

import java.util.concurrent.atomic.AtomicLong;

/**
 * The serialization-writer library exposes stats on a per writer basis. This class manages stats across all writers.
 *
 * Needs to be public for JMX
 */
public class WriterStats
{
    private final AtomicLong ignoredEvents = new AtomicLong(0);
    private final AtomicLong enqueuedEvents = new AtomicLong(0);
    private final AtomicLong droppedEvents = new AtomicLong(0);
    private final AtomicLong writtenEvents = new AtomicLong(0);
    private final AtomicLong erroredEvents = new AtomicLong(0);
    private final AtomicLong commits = new AtomicLong(0);
    private final AtomicLong commitFailures = new AtomicLong(0);
    private final AtomicLong hdfsFlushes = new AtomicLong(0);

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

    public void registerEventWritten()
    {
        writtenEvents.incrementAndGet();
    }

    public void registerEventWritingErrored()
    {
        erroredEvents.incrementAndGet();
    }

    public void registerHdfsFlush()
    {
        hdfsFlushes.incrementAndGet();
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

    @Managed(description = "Number of dropped events - queues being full")
    public long getDroppedEvents()
    {
        return droppedEvents.get();
    }

    @Managed(description = "Number of successfully written events")
    public long getWrittenEvents()
    {
        return writtenEvents.get();
    }

    @Managed(description = "Number of events that could not be written due to an I/O error")
    public long getErroredEvents()
    {
        return erroredEvents.get();
    }

    @Managed(description = "Number of files written to Hadoop")
    public long getHdfsFlushes()
    {
        return hdfsFlushes.get();
    }
}
