package com.ning.metrics.collector.util;

import com.ning.metrics.collector.binder.annotations.Managed;
import org.apache.commons.math.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math.stat.descriptive.SynchronizedDescriptiveStatistics;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Provides size and timing statistics on operations.
 */
public class Stats
{
    private final AtomicLong count = new AtomicLong(0);
    private final AtomicLong size = new AtomicLong(0);

    private volatile DescriptiveStatistics millisStats;
    private volatile DescriptiveStatistics sizeStats;
    private final WindowType windowType;
    private final String windowString;

    private int capacity;
    private long period;
    private TimeUnit timeUnit;

    private enum WindowType
    {
        SAMPLE,
        TIME
    }

    /**
     * Computes the number of milliseconds since the give reference time (in ns)
     *
     * @param startNanos the reference time in nanoseconds (use System.nanoTime()) to fetch
     * @return the number of milliseconds
     */
    public static double millisElapsedSince(long startNanos)
    {
        return (System.nanoTime() - startNanos) / 1e6;
    }

    /**
     * Create a fixed sample size window stats object.
     *
     * @param capacity
     * @return stats
     */
    public static Stats sampleWindow(int capacity)
    {
        return new Stats(new SynchronizedDescriptiveStatistics(capacity), new SynchronizedDescriptiveStatistics(capacity), WindowType.SAMPLE, capacity, 0, null);
    }

    /**
     * Create a time window stats object.
     *
     * @param period
     * @param unit
     * @return stats
     */
    public static Stats timeWindow(long period, TimeUnit unit)
    {
        long millis = TimeUnit.MILLISECONDS.convert(period, unit);
        return new Stats(new SynchronizedTimeWindowStatistics(millis), new SynchronizedTimeWindowStatistics(millis), WindowType.TIME, 0, period, unit);
    }

    private Stats(DescriptiveStatistics millisStats, DescriptiveStatistics sizeStats, WindowType windowType, int capacity, long period, TimeUnit unit)
    {
        this.capacity = capacity;
        this.period = period;
        this.timeUnit = unit;

        this.millisStats = millisStats;
        this.sizeStats = sizeStats;
        this.windowType = windowType;
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
     * @param millis
     */
    public void record(double millis)
    {
        count.incrementAndGet();
        millisStats.addValue(millis);
    }

    /**
     * Record one operation.
     *
     * @param millis
     * @param size   magnitude of operation, i.e., bytes or items processed
     */
    public void record(double millis, long size)
    {
        count.incrementAndGet();
        this.size.addAndGet(size);
        millisStats.addValue(millis);
        sizeStats.addValue(size);
    }

    /**
     * Profile a {@link Runnable}.
     *
     * @param task
     * @return result
     * @throws Exception
     */
    public void profile(Runnable task)
    {
        long start = System.nanoTime();
        try {
            task.run();
        }
        finally {
            record(millisElapsedSince(start));
        }
    }

    /**
     * Profile a {@link Callable}.
     *
     * @param <T>
     * @param task
     * @return result
     * @throws Exception
     */
    public <T> T profile(Callable<T> task) throws Exception
    {
        long start = System.nanoTime();
        try {
            return task.call();
        }
        finally {
            record(millisElapsedSince(start));
        }
    }

    /**
     * Profile a {@link Callable}..
     *
     * @param <T>
     * @param task
     * @param size
     * @return result
     * @throws Exception
     */
    public <T> T profile(Callable<T> task, long size) throws Exception
    {
        long start = System.nanoTime();
        try {
            return task.call();
        }
        finally {
            record(millisElapsedSince(start), size);
        }
    }

    /**
     * Reset all statistics
     */
    /*
     * For some reason, this had funky behavior
    @Managed
    public void reset()
    {
    	count.set(0);
    	size.set(0);
    	if (windowType == WindowType.SAMPLE) {
    		millisStats = new SynchronizedDescriptiveStatistics(capacity);
    		sizeStats = new SynchronizedDescriptiveStatistics(capacity);
    	} else {
    		millisStats = new SynchronizedTimeWindowStatistics(TimeUnit.SECONDS.convert(period, timeUnit));
    		sizeStats = new SynchronizedTimeWindowStatistics(TimeUnit.SECONDS.convert(period, timeUnit));
    	}
    } */

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
    public long getSize()
    {
        return size.get();
    }

    /**
     * @return min
     */
    @Managed
    public double getMillisMin()
    {
        double min = millisStats.getMin();
        return Double.isNaN(min) ? 0.0 : min;
    }

    /**
     * @return max
     */
    @Managed
    public double getMillisMax()
    {
        double max = millisStats.getMax();
        return Double.isNaN(max) ? 0.0 : max;
    }

    /**
     * Average.
     *
     * @return average
     */
    @Managed
    public double getMillisAvg()
    {
        double avg = millisStats.getMean();
        return Double.isNaN(avg) ? 0.0 : avg;
    }

    /**
     * 50th percentile.
     *
     * @return 50th percentile
     */
    @Managed
    public double getMillisTP50()
    {
        double percentile = millisStats.getPercentile(50);
        return Double.isNaN(percentile) ? 0.0 : percentile;
    }

    /**
     * 90th percentile
     *
     * @return 90th percentile
     */
    @Managed
    public double getMillisTP90()
    {
        double percentile = millisStats.getPercentile(90);
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
        double percentile = millisStats.getPercentile(99);
        return Double.isNaN(percentile) ? 0.0 : percentile;
    }

    /**
     * 99.9th percentile
     *
     * @return 99.9th percentile
     */
    @Managed
    public double getMillisTP999()
    {
        double percentile = millisStats.getPercentile(99.9);
        return Double.isNaN(percentile) ? 0.0 : percentile;
    }

    /**
     * 99.99th percentile
     *
     * @return 99.99th percentile
     */
    @Managed
    public double getMillisTP9999()
    {
        double percentile = millisStats.getPercentile(99.99);
        return Double.isNaN(percentile) ? 0.0 : percentile;
    }

    /**
     * 99.999th percentile
     *
     * @return 99.999th percentile
     */
    @Managed
    public double getMillisTP99999()
    {
        double percentile = millisStats.getPercentile(99.999);
        return Double.isNaN(percentile) ? 0.0 : percentile;
    }

    /**
     * @return min
     */
    @Managed
    public double getSizeMin()
    {
        double min = sizeStats.getMin();
        return Double.isNaN(min) ? 0.0 : min;
    }

    /**
     * @return max
     */
    @Managed
    public double getSizeMax()
    {
        double max = sizeStats.getMax();
        return Double.isNaN(max) ? 0.0 : max;
    }

    /**
     * Average.
     *
     * @return average
     */
    @Managed
    public double getSizeAvg()
    {
        double avg = sizeStats.getMean();
        return Double.isNaN(avg) ? 0.0 : avg;
    }

    /**
     * 50th percentile.
     *
     * @return 50th percentile
     */
    @Managed
    public double getSizeTP50()
    {
        double percentile = sizeStats.getPercentile(50);
        return Double.isNaN(percentile) ? 0.0 : percentile;
    }

    /**
     * 90th percentile
     *
     * @return 90th percentile
     */
    @Managed
    public double getSizeTP90()
    {
        double percentile = sizeStats.getPercentile(90);
        return Double.isNaN(percentile) ? 0.0 : percentile;
    }

    /**
     * 99th percentile
     *
     * @return 99th percentile
     */
    @Managed
    public double getSizeTP99()
    {
        double percentile = sizeStats.getPercentile(99);
        return Double.isNaN(percentile) ? 0.0 : percentile;
    }

    /**
     * 99.9th percentile
     *
     * @return 99.9th percentile
     */
    @Managed
    public double getSizeTP999()
    {
        double percentile = sizeStats.getPercentile(99.9);
        return Double.isNaN(percentile) ? 0.0 : percentile;
    }

    /**
     * 99.99th percentile
     *
     * @return 99th percentile
     */
    @Managed
    public double getSizeTP9999()
    {
        double percentile = sizeStats.getPercentile(99.99);
        return Double.isNaN(percentile) ? 0.0 : percentile;
    }

    /**
     * 99.999th percentile
     *
     * @return 99.999th percentile
     */
    @Managed
    public double getSizeTP99999()
    {
        double percentile = sizeStats.getPercentile(99.999);
        return Double.isNaN(percentile) ? 0.0 : percentile;
    }

    /**
     * @return the windowType
     */
    @Managed
    public String getWindowType()
    {
        return windowString;
    }
}
