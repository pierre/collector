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

import com.ning.metrics.collector.realtime.EventQueueStats;
import com.ning.metrics.serialization.event.Event;
import com.ning.metrics.serialization.writer.EventWriter;
import org.apache.log4j.Logger;

import java.util.concurrent.BlockingQueue;

/**
 * Worker that constantly dequeues events from its underlying queue and writes them to disk
 */
class LocalQueueWorker implements Runnable
{
    private static final Logger logger = Logger.getLogger(LocalQueueWorker.class);

    private final BlockingQueue<Event> eventQueue;
    private final EventWriter processor;
    private final EventQueueStats stats;

    public LocalQueueWorker(final BlockingQueue<Event> msgQueue, final EventWriter eventWriter, final EventQueueStats stats)
    {
        this.eventQueue = msgQueue;
        this.processor = eventWriter;
        this.stats = stats;
    }

    /**
     * Dequeue an event from its underlying queue, blocking if necessary
     */
    public void run()
    {
        while (true) {
            try {
                final Event event = eventQueue.take();
                processor.write(event);
                stats.registerEventSent();
            }
            catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
                return;
            }
            catch (Exception ex) {
                logger.error("Got error while trying to send an event to disk", ex);
                stats.registerEventSendingErrored();
            }
        }
    }
}