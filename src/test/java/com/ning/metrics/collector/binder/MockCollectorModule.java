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

import com.google.inject.AbstractModule;
import com.ning.metrics.collector.binder.annotations.BufferingEventCollectorEventWriter;
import com.ning.metrics.collector.binder.annotations.BufferingEventCollectorExecutor;
import com.ning.metrics.collector.binder.annotations.HdfsDiskSpoolFlushExecutor;
import com.ning.metrics.collector.binder.annotations.HdfsEventWriter;
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.events.processing.BufferingEventCollector;
import com.ning.metrics.collector.events.processing.EventCollector;
import com.ning.metrics.collector.events.processing.EventQueueProcessor;
import com.ning.metrics.collector.events.processing.StubEventQueueProcessor;
import com.ning.metrics.collector.events.processing.TaskQueueService;
import com.ning.metrics.collector.events.processing.TaskQueueServiceImpl;
import com.ning.metrics.serialization.event.Event;
import com.ning.metrics.serialization.event.StubEvent;
import com.ning.metrics.serialization.writer.CallbackHandler;
import com.ning.metrics.serialization.writer.DiskSpoolEventWriter;
import com.ning.metrics.serialization.writer.EventHandler;
import com.ning.metrics.serialization.writer.EventWriter;
import com.ning.metrics.serialization.writer.MockEventWriter;
import com.ning.metrics.serialization.writer.StubScheduledExecutorService;
import com.ning.metrics.serialization.writer.SyncType;
import com.ning.metrics.serialization.writer.ThresholdEventWriter;
import org.skife.config.ConfigurationObjectFactory;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class MockCollectorModule extends AbstractModule
{
    private MockEventWriter diskSpoolWriter = new MockEventWriter();
    private ThresholdEventWriter thresholdEventWriter = new ThresholdEventWriter(diskSpoolWriter, 2, 300);
    private MockEventWriter hdfsEventWriter = new MockEventWriter();

    @Override
    protected void configure()
    {
        // For testing only
        bind(MockEventWriter.class).toInstance(diskSpoolWriter);

        bind(EventWriter.class).annotatedWith(BufferingEventCollectorEventWriter.class).toInstance(thresholdEventWriter);
        bind(ScheduledExecutorService.class).annotatedWith(BufferingEventCollectorExecutor.class).toInstance(new StubScheduledExecutorService()
        {
            public AtomicBoolean isShutdown = new AtomicBoolean(false);

            @Override
            public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException
            {
                return true;
            }

            @Override
            public void shutdown()
            {
                isShutdown.set(true);
            }

            @Override
            public boolean isShutdown()
            {
                return isShutdown.get();
            }

            @Override
            public boolean isTerminated()
            {
                return isShutdown.get();
            }
        });

        bind(TaskQueueService.class).to(TaskQueueServiceImpl.class).asEagerSingleton();

        bind(EventQueueProcessor.class).toInstance(new StubEventQueueProcessor()
        {
            public AtomicBoolean isStopped = new AtomicBoolean(true);

            @Override
            public boolean isRunning()
            {
                return !isStopped.get();
            }

            @Override
            public void stop()
            {
                isStopped.set(true);
            }

            @Override
            public void send(String type, Object event)
            {
            }
        });

        final CollectorConfig config = new ConfigurationObjectFactory(System.getProperties()).build(CollectorConfig.class);
        bind(CollectorConfig.class).toInstance(config);

        bind(BufferingEventCollector.class).asEagerSingleton();

        bind(EventCollector.class).toProvider(EventCollectorProvider.class).asEagerSingleton();

        ScheduledExecutorService hdfsService = new StubScheduledExecutorService()
        {
            public AtomicBoolean isShutdown = new AtomicBoolean(false);

            @Override
            public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException
            {
                return true;
            }

            @Override
            public void shutdown()
            {
                isShutdown.set(true);
            }

            @Override
            public boolean isShutdown()
            {
                return isShutdown.get();
            }

            @Override
            public boolean isTerminated()
            {
                return isShutdown.get();
            }

        };
        bind(ScheduledExecutorService.class).annotatedWith(HdfsDiskSpoolFlushExecutor.class).toInstance(hdfsService);
        bind(EventWriter.class).annotatedWith(HdfsEventWriter.class).toInstance(hdfsEventWriter);

        bind(DiskSpoolEventWriter.class).toInstance(
            new MockDiskSpoolEventWriter(new EventHandler()
            {
                @Override
                public void handle(ObjectInputStream objectInputStream, CallbackHandler handler) throws ClassNotFoundException, IOException
                {
                    while (objectInputStream.read() != -1) {
                        Event event = (Event) objectInputStream.readObject();
                        hdfsEventWriter.write(event);
                    }

                    objectInputStream.close();
                    hdfsEventWriter.forceCommit();
                    hdfsEventWriter.flush();
                }

                @Override
                public void rollback() throws IOException
                {
                    hdfsEventWriter.rollback();
                }

                @Override
                public String toString()
                {
                    return hdfsEventWriter.toString();
                }
            }, config.getSpoolDirectoryName(), config.isFlushEnabled(), config.getFlushIntervalInSeconds(), hdfsService,
                SyncType.valueOf(config.getSyncType()), config.getSyncBatchSize(), config.getRateWindowSizeMinutes()));
    }

    static class MockDiskSpoolEventWriter extends DiskSpoolEventWriter
    {

        private final EventHandler delegate;

        public MockDiskSpoolEventWriter(EventHandler eventHandler, String spoolPath, boolean flushEnabled, long flushIntervalInSeconds, ScheduledExecutorService executor, SyncType syncType, int syncBatchSize, int rateWindowSizeMinutes)
        {
            super(eventHandler, spoolPath, flushEnabled, flushIntervalInSeconds, executor, syncType, syncBatchSize, rateWindowSizeMinutes);
            this.delegate = eventHandler;
        }

        @Override
        public void flush() throws IOException
        {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ObjectOutputStream outStream = new ObjectOutputStream(out);
            new StubEvent().writeExternal(outStream);
            outStream.flush();
            outStream.close();

            try {
                delegate.handle(new ObjectInputStream(new ByteArrayInputStream(out.toByteArray())), new CallbackHandler()
                {
                    @Override
                    public void onError(Throwable t, Event event)
                    {
                    }

                    @Override
                    public void onSuccess(Event event)
                    {
                    }
                });
            }
            catch (ClassNotFoundException e) {
                throw new IOException(e);
            }
        }
    }
}