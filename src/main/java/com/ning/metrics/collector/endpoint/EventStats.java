package com.ning.metrics.collector.endpoint;

/**
 * Track stats on a per event basis.
 */
public class EventStats
{
    private final long receivedTimeStamp;
    private long acceptedTimeStamp;

    private long extractedTimeStamp;

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

    /**
     * Set the timestamp when the event has been extracted from its original payload.
     * This can means a bunch of things depending on the API.
     */
    public void recordExtracted()
    {
        extractedTimeStamp = System.nanoTime();
    }

    public double getAcceptedDelayMillis()
    {
        return (acceptedTimeStamp - receivedTimeStamp) / 1000000.0;
    }

    public double getExtractedDelayMillis()
    {
        return (acceptedTimeStamp - extractedTimeStamp) / 1000000.0;
    }
}
