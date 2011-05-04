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
