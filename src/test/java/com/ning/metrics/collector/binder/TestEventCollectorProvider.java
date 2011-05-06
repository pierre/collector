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
import com.ning.metrics.collector.binder.annotations.BufferingEventCollectorExecutor;
import com.ning.metrics.collector.binder.annotations.HdfsDiskSpoolFlushExecutor;
import com.ning.metrics.collector.binder.annotations.HdfsEventWriter;
import com.ning.metrics.collector.endpoint.EventStats;
import com.ning.metrics.collector.events.processing.BufferingEventCollector;
import com.ning.metrics.collector.events.processing.EventQueueProcessor;
import com.ning.metrics.collector.events.processing.TaskQueueService;
import com.ning.metrics.serialization.event.StubEvent;
import com.ning.metrics.serialization.writer.DiskSpoolEventWriter;
import com.ning.metrics.serialization.writer.EventWriter;
import com.ning.metrics.serialization.writer.MockEventWriter;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import java.util.concurrent.ScheduledExecutorService;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

@Test(groups = {"fast"})
@Guice(modules = MockCollectorModule.class)
public class TestEventCollectorProvider
{
    @Inject
    private BufferingEventCollector collector;

    @Inject
    @BufferingEventCollectorExecutor
    private ScheduledExecutorService executor;

    @Inject
    private TaskQueueService taskQueueService;

    @Inject
    private EventQueueProcessor queueProcessor;

    @Inject
    private MockEventWriter bufferingEventWriter;

    @Inject
    @HdfsDiskSpoolFlushExecutor
    private ScheduledExecutorService hdfsExecutor;

    @Inject
    @HdfsEventWriter
    private EventWriter hdfsEventWriter;

    @Inject
    private DiskSpoolEventWriter hdfsWriter;

    @Test
    public void testGet() throws Exception
    {
        assertTrue(collector.collectEvent(new StubEvent(), new EventStats()));
        assertEquals(bufferingEventWriter.getCommittedEventList().size(), 0);
        assertEquals(((MockEventWriter) hdfsEventWriter).getCommittedEventList().size(), 0);

        EventCollectorProvider.mainCollectorShutdownHook(collector, hdfsWriter);

        assertFalse(collector.collectEvent(new StubEvent(), new EventStats()));

        assertFalse(queueProcessor.isRunning()); // AMQ
        assertTrue(taskQueueService.isTerminated()); // Acceptance queue

        assertTrue(executor.isTerminated()); // Writer executor
        assertEquals(bufferingEventWriter.getCommittedEventList().size(), 1);

        assertTrue(hdfsExecutor.isTerminated()); // Writer executor
        assertEquals(((MockEventWriter) hdfsEventWriter).getNumberOfFlushedEvents(), 1);
    }
}
