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

package com.ning.metrics.collector.binder;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.ning.metrics.collector.binder.annotations.BufferingEventCollectorEventWriter;
import com.ning.metrics.collector.binder.annotations.BufferingEventCollectorExecutor;
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.events.processing.BufferingEventCollector;
import com.ning.metrics.collector.events.processing.EventCollector;
import com.ning.metrics.collector.events.processing.EventQueueProcessor;
import com.ning.metrics.collector.events.processing.TaskQueueService;
import com.ning.metrics.serialization.writer.DiskSpoolEventWriter;
import com.ning.metrics.serialization.writer.EventWriter;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.concurrent.ScheduledExecutorService;

public class EventCollectorProvider implements Provider<EventCollector>
{
    private static final Logger log = Logger.getLogger(EventCollectorProvider.class);

    private final EventWriter eventWriter;
    private final ScheduledExecutorService executor;
    private final TaskQueueService taskQueueService;
    private final EventQueueProcessor activeMQController;
    private final CollectorConfig config;
    private final DiskSpoolEventWriter hdfsWriter;

    @Inject
    public EventCollectorProvider(
        @BufferingEventCollectorEventWriter EventWriter eventWriter,
        @BufferingEventCollectorExecutor ScheduledExecutorService executor,
        TaskQueueService taskQueueService,
        EventQueueProcessor activeMQController,
        CollectorConfig config,
        DiskSpoolEventWriter hdfsWriter
    )
    {
        this.eventWriter = eventWriter;
        this.executor = executor;
        this.taskQueueService = taskQueueService;
        this.activeMQController = activeMQController;
        this.config = config;
        this.hdfsWriter = hdfsWriter;
    }

    /**
     * Provides the main EventCollector instance.
     * We could simply bind it but we want to cleanly shutdown the core. Due to the nature of the collector
     * (front-end thread processing incomming requests and back-end HDFS writer thread are independent),
     * we need to carefully control the lifecycle of the shutdown hook.
     *
     * @return EventCollector instance
     * @see DiskSpoolEventWriterProvider
     */
    @Override
    public EventCollector get()
    {
        final BufferingEventCollector collector = new BufferingEventCollector(eventWriter, executor, taskQueueService, activeMQController, config);
        Runtime.getRuntime().addShutdownHook(new Thread()
        {
            @Override
            public void run()
            {
                mainCollectorShutdownHook(collector, hdfsWriter);
            }
        });

        return collector;
    }

    protected static void mainCollectorShutdownHook(BufferingEventCollector collector, DiskSpoolEventWriter hdfsWriter)
    {
        // Stop accepting events and flush all events in memory to disk
        try {
            collector.shutdown();
        }
        catch (InterruptedException e) {
            log.warn("Interrupted while trying to shutdown the main collector thread", e);
        }

        // Stop the periodic flusher from local disk to HDFS
        try {
            hdfsWriter.shutdown();
        }
        catch (InterruptedException e) {
            log.warn("Interrupted while trying to shutdown the HDFS flusher", e);
        }

        // Commit the current file
        try {
            hdfsWriter.forceCommit();
        }
        catch (IOException e) {
            log.warn("IOExeption while committing current file", e);
        }

        // Give quarantined events a last chance
        hdfsWriter.processQuarantinedFiles();

        // Flush events to HDFS
        try {
            hdfsWriter.flush();
        }
        catch (IOException e) {
            log.warn("IOException while flushing last files to HFDS", e);
        }
    }
}
