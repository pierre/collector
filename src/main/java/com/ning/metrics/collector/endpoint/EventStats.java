package com.ning.metrics.collector.endpoint;

import org.joda.time.DateTime;

/**
 * Track stats on a per event basis.
 */
public class EventStats
{
    private final long receivedTimeStamp;
    private long acceptedTimeStamp;

    public EventStats()
    {
        receivedTimeStamp = System.nanoTime();
    }

    /**
     * Set the timestamp when the event was accepted.
     * This is set after the event has been processed and is ready to be flushed to disk.
     */
    public void recordAccepted()
    {
        acceptedTimeStamp = System.nanoTime();
    }

    public double getAcceptedDelayMillis()
    {
        return (acceptedTimeStamp - receivedTimeStamp) / 1000000L;
    }
}
