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
import org.joda.time.DateTime;
import org.joda.time.Period;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

public class ThresholdEventWriter implements EventWriter
{
    private static final Logger log = Logger.getLogger(ThresholdEventWriter.class);

    private final EventWriter delegate;
    private final AtomicLong maxWriteCount;
    private volatile Period maxFlushPeriod;

    private DateTime lastFlush;
    private long uncommitedWriteCount = 0;

    public ThresholdEventWriter(EventWriter delegate, long maxUncommittedWriteCount, int maxFlushPeriodInSeconds)
    {
        this.delegate = delegate;
        this.maxWriteCount = new AtomicLong(maxUncommittedWriteCount);
        this.maxFlushPeriod = Period.seconds(maxFlushPeriodInSeconds);
        this.lastFlush = getNow();
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
        lastFlush = getNow();
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
        DateTime now = getNow();

        if (uncommitedWriteCount > maxWriteCount.get() || now.minus(maxFlushPeriod).isAfter(lastFlush)) {
            forceCommit();
        }
    }

    //unit testing hook;
    protected DateTime getNow()
    {
        return new DateTime();
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
    public void setMaxFlushPeriodInSeconds(int maxFlushPeriodInSeconds)
    {
        this.maxFlushPeriod = Period.seconds(maxFlushPeriodInSeconds);
    }

    @Managed(description = "the max number of seconds between commits of local disk spools")
    public int getMaxFlushPeriodInSeconds()
    {
        return maxFlushPeriod.getSeconds();
    }
}
