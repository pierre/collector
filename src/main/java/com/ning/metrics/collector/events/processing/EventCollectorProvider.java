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

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.realtime.EventQueueProcessor;
import org.apache.log4j.Logger;

class EventCollectorProvider implements Provider<EventCollector>
{
    private static final Logger log = Logger.getLogger(EventCollectorProvider.class);

    private final EventQueueProcessor activeMQController;
    private final EventSpoolDispatcher dispatcher;

    @Inject
    public EventCollectorProvider(final EventQueueProcessor activeMQController, final EventSpoolDispatcher dispatcher, final CollectorConfig config)
    {
        this.activeMQController = activeMQController;
        this.dispatcher = dispatcher;
    }

    /**
     * Provides the main EventCollector instance.
     * We could simply bind it but we want to cleanly shutdown the core. Due to the nature of the collector
     * (front-end thread processing incomming requests and back-end HDFS writer thread are independent),
     * we need to carefully control the lifecycle of the shutdown hook.
     *
     * @return EventCollector instance
     */
    @Override
    public EventCollector get()
    {
        final BufferingEventCollector collector = new BufferingEventCollector(activeMQController, dispatcher);
        Runtime.getRuntime().addShutdownHook(new Thread()
        {
            @Override
            public void run()
            {
                mainCollectorShutdownHook(collector, dispatcher);
            }
        });

        return collector;
    }

    static void mainCollectorShutdownHook(final BufferingEventCollector collector, final EventSpoolDispatcher dispatcher)
    {
        log.info("Starting main shutdown sequence");

        log.info("Stop accepting new events");
        // Stop accepting events and flush all events in memory to disk
        try {
            collector.shutdown();
        }
        catch (InterruptedException e) {
            log.warn("Interrupted while trying to shutdown the main collector thread", e);
        }

        try {
            dispatcher.shutdown();
        }
        catch (InterruptedException e) {
            log.warn("Interrupted while trying to shutdown the event dispatcher", e);
        }

        log.info("Main shutdown sequence has terminated");
    }
}
