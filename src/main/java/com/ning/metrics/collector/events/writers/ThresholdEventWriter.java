/*
 * Copyright 2010 Ning, Inc.
 *
 * Ning licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.ning.metrics.collector.events.writers;

import com.ning.metrics.collector.binder.annotations.Managed;
import com.ning.metrics.collector.events.Event;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

public class ThresholdEventWriter implements EventWriter
{
    private static final Logger log = Logger.getLogger(ThresholdEventWriter.class);

    private final EventWriter delegate;
    private final AtomicLong maxWriteCount;
    private volatile long maxFlushPeriodNanos;

    private long lastFlushNanos;
    private long uncommitedWriteCount = 0;

    public ThresholdEventWriter(EventWriter delegate, long maxUncommittedWriteCount, long maxFlushPeriodInSeconds)
    {
        this.delegate = delegate;
        this.maxWriteCount = new AtomicLong(maxUncommittedWriteCount);
        setMaxFlushPeriodInSeconds(maxFlushPeriodInSeconds);
        this.lastFlushNanos = getNow();
    }

    @Override
    public synchronized void write(Event event) throws IOException
    {
        delegate.write(event);
        uncommitedWriteCount++;

        commitIfNeeded();
    }

    @Managed(description = "commit locally spooled events for flushing to hdfs")
    @Override
    public synchronized void forceCommit() throws IOException
    {
        log.info("performing commit on delegate EventWriter");
        delegate.commit();
        uncommitedWriteCount = 0;
        lastFlushNanos = getNow();
    }

    @Override
    public synchronized void commit() throws IOException
    {
        commitIfNeeded();
    }

    @Override
    public synchronized void rollback() throws IOException
    {
        delegate.rollback();
    }

    private synchronized void commitIfNeeded() throws IOException
    {
        if (uncommitedWriteCount > maxWriteCount.get() || (getNow() - maxFlushPeriodNanos > lastFlushNanos)) {
            forceCommit();
        }
    }

    //unit testing hook;
    protected long getNow()
    {
        return System.nanoTime();
    }

    @Managed(description = "set the max number of writes before a commit is performed")
    public void setMaxWriteCount(long maxWriteCount)
    {
        this.maxWriteCount.set(maxWriteCount);
    }

    @Managed(description = "set the max number of writes before a commit is performed")
    public long getMaxWriteCount()
    {
        return maxWriteCount.get();
    }

    @Managed(description = "set the max number of seconds between commits of local disk spools")
    public void setMaxFlushPeriodInSeconds(long maxFlushPeriodInSeconds)
    {
        this.maxFlushPeriodNanos = maxFlushPeriodInSeconds * 1000000000;
    }

    @Managed(description = "the max number of seconds between commits of local disk spools")
    public long getMaxFlushPeriodInSeconds()
    {
        return maxFlushPeriodNanos * 1000000000;
    }
}
