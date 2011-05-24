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

package com.ning.metrics.collector.util;

import org.apache.commons.math.stat.descriptive.DescriptiveStatistics;
import org.weakref.jmx.Managed;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Provides size and timing statistics on operations.
 */
public class Stats
{
    private final AtomicLong count = new AtomicLong(0);
    private final AtomicLong size = new AtomicLong(0);

    private final DescriptiveStatistics millisStats;
    private final DescriptiveStatistics sizeStats;

    private final String windowString;

    private enum WindowType
    {
        SAMPLE,
        TIME
    }

    /**
     * Create a time window stats object.
     *
     * @param period length of the time window
     * @param unit   unit of period
     * @return stats
     */
    public static Stats timeWindow(final long period, final TimeUnit unit)
    {
        final long millis = TimeUnit.MILLISECONDS.convert(period, unit);
        return new Stats(new SynchronizedTimeWindowStatistics(millis), new SynchronizedTimeWindowStatistics(millis), WindowType.TIME, 0, period, unit);
    }

    private Stats(final DescriptiveStatistics millisStats, final DescriptiveStatistics sizeStats, final WindowType windowType, final int capacity, final long period, final TimeUnit unit)
    {
        this.millisStats = millisStats;
        this.sizeStats = sizeStats;
        if (windowType == WindowType.SAMPLE) {
            windowString = String.format("%d samples", capacity);
        }
        else {
            windowString = String.format("%d second window", TimeUnit.SECONDS.convert(period, unit));
        }
    }

    /**
     * Record one operation.
     *
     * @param millis number of milliseconds the operation took
     */
    public void record(final double millis)
    {
        count.incrementAndGet();
        millisStats.addValue(millis);
    }

    /**
     * Count.
     *
     * @return count
     */
    @Managed
    public long getCount()
    {
        return count.get();
    }

    /**
     * @return bytes read
     */
    @Managed
    @SuppressWarnings("unused")
    public long getSize()
    {
        return size.get();
    }

    /**
     * @return min
     */
    @Managed
    @SuppressWarnings("unused")
    public double getMillisMin()
    {
        final double min = millisStats.getMin();
        return Double.isNaN(min) ? 0.0 : min;
    }

    /**
     * @return max
     */
    @Managed
    @SuppressWarnings("unused")
    public double getMillisMax()
    {
        final double max = millisStats.getMax();
        return Double.isNaN(max) ? 0.0 : max;
    }

    /**
     * Average.
     *
     * @return average
     */
    @Managed
    @SuppressWarnings("unused")
    public double getMillisAvg()
    {
        final double avg = millisStats.getMean();
        return Double.isNaN(avg) ? 0.0 : avg;
    }

    /**
     * 50th percentile.
     *
     * @return 50th percentile
     */
    @Managed
    @SuppressWarnings("unused")
    public double getMillisTP50()
    {
        final double percentile = millisStats.getPercentile(50);
        return Double.isNaN(percentile) ? 0.0 : percentile;
    }

    /**
     * 90th percentile
     *
     * @return 90th percentile
     */
    @Managed
    @SuppressWarnings("unused")
    public double getMillisTP90()
    {
        final double percentile = millisStats.getPercentile(90);
        return Double.isNaN(percentile) ? 0.0 : percentile;
    }

    /**
     * 99th percentile
     *
     * @return 99th percentile
     */
    @Managed
    public double getMillisTP99()
    {
        final double percentile = millisStats.getPercentile(99);
        return Double.isNaN(percentile) ? 0.0 : percentile;
    }

    /**
     * 99.9th percentile
     *
     * @return 99.9th percentile
     */
    @Managed
    @SuppressWarnings("unused")
    public double getMillisTP999()
    {
        final double percentile = millisStats.getPercentile(99.9);
        return Double.isNaN(percentile) ? 0.0 : percentile;
    }

    /**
     * 99.99th percentile
     *
     * @return 99.99th percentile
     */
    @Managed
    @SuppressWarnings("unused")
    public double getMillisTP9999()
    {
        final double percentile = millisStats.getPercentile(99.99);
        return Double.isNaN(percentile) ? 0.0 : percentile;
    }

    /**
     * 99.999th percentile
     *
     * @return 99.999th percentile
     */
    @Managed
    @SuppressWarnings("unused")
    public double getMillisTP99999()
    {
        final double percentile = millisStats.getPercentile(99.999);
        return Double.isNaN(percentile) ? 0.0 : percentile;
    }

    /**
     * @return min
     */
    @Managed
    @SuppressWarnings("unused")
    public double getSizeMin()
    {
        final double min = sizeStats.getMin();
        return Double.isNaN(min) ? 0.0 : min;
    }

    /**
     * @return max
     */
    @Managed
    @SuppressWarnings("unused")
    public double getSizeMax()
    {
        final double max = sizeStats.getMax();
        return Double.isNaN(max) ? 0.0 : max;
    }

    /**
     * Average.
     *
     * @return average
     */
    @Managed
    @SuppressWarnings("unused")
    public double getSizeAvg()
    {
        final double avg = sizeStats.getMean();
        return Double.isNaN(avg) ? 0.0 : avg;
    }

    /**
     * 50th percentile.
     *
     * @return 50th percentile
     */
    @Managed
    @SuppressWarnings("unused")
    public double getSizeTP50()
    {
        final double percentile = sizeStats.getPercentile(50);
        return Double.isNaN(percentile) ? 0.0 : percentile;
    }

    /**
     * 90th percentile
     *
     * @return 90th percentile
     */
    @Managed
    @SuppressWarnings("unused")
    public double getSizeTP90()
    {
        final double percentile = sizeStats.getPercentile(90);
        return Double.isNaN(percentile) ? 0.0 : percentile;
    }

    /**
     * 99th percentile
     *
     * @return 99th percentile
     */
    @Managed
    @SuppressWarnings("unused")
    public double getSizeTP99()
    {
        final double percentile = sizeStats.getPercentile(99);
        return Double.isNaN(percentile) ? 0.0 : percentile;
    }

    /**
     * 99.9th percentile
     *
     * @return 99.9th percentile
     */
    @Managed
    @SuppressWarnings("unused")
    public double getSizeTP999()
    {
        final double percentile = sizeStats.getPercentile(99.9);
        return Double.isNaN(percentile) ? 0.0 : percentile;
    }

    /**
     * 99.99th percentile
     *
     * @return 99th percentile
     */
    @Managed
    @SuppressWarnings("unused")
    public double getSizeTP9999()
    {
        final double percentile = sizeStats.getPercentile(99.99);
        return Double.isNaN(percentile) ? 0.0 : percentile;
    }

    /**
     * 99.999th percentile
     *
     * @return 99.999th percentile
     */
    @Managed
    @SuppressWarnings("unused")
    public double getSizeTP99999()
    {
        final double percentile = sizeStats.getPercentile(99.999);
        return Double.isNaN(percentile) ? 0.0 : percentile;
    }

    /**
     * @return the windowType
     */
    @Managed
    @SuppressWarnings("unused")
    public String getWindowType()
    {
        return windowString;
    }
}
