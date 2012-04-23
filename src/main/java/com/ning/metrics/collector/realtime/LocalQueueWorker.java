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

package com.ning.metrics.collector.realtime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.BlockingQueue;

class LocalQueueWorker implements Runnable
{
    private static final Logger logger = LoggerFactory.getLogger(LocalQueueWorker.class);

    private final BlockingQueue<Object> eventQueue;
    private final EventQueueSession processor;
    private final EventQueueStats stats;

    public LocalQueueWorker(final BlockingQueue<Object> msgQueue, final EventQueueSession processor, final EventQueueStats stats)
    {
        this.eventQueue = msgQueue;
        this.processor = processor;
        this.stats = stats;
    }

    public void run()
    {
        while (true) {
            try {
                final Object event = eventQueue.take();

                processor.send(event);
                stats.registerEventSent();
            }
            catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
                return;
            }
            catch (Exception ex) {
                logger.error("Got error while trying to send an event to the RT queue", ex);
                stats.registerEventSendingErrored();
            }
        }
    }
}
