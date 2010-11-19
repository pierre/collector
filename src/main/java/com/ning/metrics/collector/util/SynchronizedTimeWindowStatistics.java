/*
 * Copyright 2010 Ning, Inc.
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

package com.ning.metrics.collector.util;

import org.apache.commons.math.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math.stat.descriptive.UnivariateStatistic;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * This class wraps DescriptiveStatistics to provide a time window rather
 * than a number-of-samples window.  It does so by overriding the methods
 * that access data to ensure that samples older than the time window are
 * first discarded.  This class contains an auxiliary queue of millisecond
 * times to find old samples.  It also overrides the  methods overriden by
 * SynchronizedDescriptiveStatistics, making those methods synchronous so
 * that this class is thread-safe.  All of the data access methods call
 * flushOldSamples() to get rid of samples outside the time window, and then
 * call super.
 * <p/>
 * When elements are added or removed from the queue of times, the window
 * size of the supertype DescriptiveStatistics is set to the expected number
 * of elements.  From the implementation of DescriptiveStatistics, it
 * appears that the performance cost of managing the window size in this
 * way is low.
 */
public class SynchronizedTimeWindowStatistics extends DescriptiveStatistics
{

    private static final long serialVersionUID = 1L;

    // Discard samples older than this many ms ago
    private long timeWindow;
    // All the access methods are synchronized, so we can use the fastest representation.
    private Queue<Long> queuedTimes = new ArrayDeque<Long>();

    /**
     * @param timeWindow
     */
    public SynchronizedTimeWindowStatistics(long timeWindow)
    {
        this.timeWindow = timeWindow;
    }

    /**
     * @return sample count
     */
    public synchronized int getSampleCount()
    {
        return queuedTimes.size();
    }

    /**
     * @return time window
     */
    public synchronized long getTimeWindow()
    {
        return timeWindow;
    }

    /**
     * @param timeWindow
     */
    public synchronized void setTimeWindow(long timeWindow)
    {
        this.timeWindow = timeWindow;
        flushOldSamples();
    }

    private void flushOldSamples()
    {
        flushOlderThan(System.currentTimeMillis() - timeWindow);
    }

    private void flushOlderThan(long time)
    {
        Long oldestQueuedTime = 0L;
        while ((oldestQueuedTime = queuedTimes.peek()) != null && oldestQueuedTime < time) {
            queuedTimes.remove();
        }
        int sampleCount = queuedTimes.size();
        if (sampleCount == 0) {
            super.clear();
        }
        else {
            setWindowSize(sampleCount);
        }
    }

    @Override
    public synchronized void addValue(double value)
    {
        final long time = System.currentTimeMillis();
        flushOlderThan(time - timeWindow);
        int sampleCount = queuedTimes.size();
        // Make room for the new sample
        setWindowSize(sampleCount + 1);
        queuedTimes.add(time);
        eDA.addElement(value);//super.addValue(value);
    }

    @Override
    public synchronized void clear()
    {
        queuedTimes.clear();
        super.clear();
    }

    // All the remaining methods just ensure the old samples are flushed
    // and then invoke the superclass method

    @Override
    public synchronized double apply(UnivariateStatistic stat)
    {
        flushOldSamples();
        return super.apply(stat);
    }

    @Override
    public synchronized double getElement(int index)
    {
        flushOldSamples();
        return super.getElement(index);
    }

    @Override
    public synchronized long getN()
    {
        flushOldSamples();
        return super.getN();
    }

    @Override
    public synchronized double getStandardDeviation()
    {
        flushOldSamples();
        return super.getStandardDeviation();
    }

    @Override
    public synchronized double[] getValues()
    {
        flushOldSamples();
        return super.getValues();
    }

    @Override
    public synchronized double getPercentile(double p)
    {
        flushOldSamples();
        return super.getPercentile(p);
    }

    @Override
    public synchronized String toString()
    {
        flushOldSamples();
        return super.toString();
    }
}
