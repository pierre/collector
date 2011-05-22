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

package com.ning.metrics.collector.hadoop.processing;

import com.google.inject.AbstractModule;
import com.ning.metrics.collector.binder.annotations.HdfsDiskSpoolFlushExecutor;
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.realtime.EventQueueProcessor;
import com.ning.metrics.serialization.event.Event;
import com.ning.metrics.serialization.writer.CallbackHandler;
import com.ning.metrics.serialization.writer.DiskSpoolEventWriter;
import com.ning.metrics.serialization.writer.EventHandler;
import com.ning.metrics.serialization.writer.EventWriter;
import com.ning.metrics.serialization.writer.MockEventWriter;
import com.ning.metrics.serialization.writer.StubScheduledExecutorService;
import com.ning.metrics.serialization.writer.SyncType;
import com.ning.metrics.serialization.writer.ThresholdEventWriter;
import org.skife.config.ConfigurationObjectFactory;
import org.testng.Assert;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class MockCollectorModule extends AbstractModule
{
    private final MockEventWriter diskSpoolWriter = new MockEventWriter();
    private final EventWriter thresholdEventWriter = new ThresholdEventWriter(diskSpoolWriter, 2, 300);
    private final MockEventWriter hdfsEventWriter = new MockEventWriter();

    @Override
    protected void configure()
    {
        // For testing only
        bind(MockEventWriter.class).toInstance(diskSpoolWriter);

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
            public void send(final Event event)
            {
            }
        });

        final CollectorConfig config = new ConfigurationObjectFactory(System.getProperties()).build(CollectorConfig.class);
        bind(CollectorConfig.class).toInstance(config);

        bind(BufferingEventCollector.class).asEagerSingleton();

        bind(EventCollector.class).toProvider(EventCollectorProvider.class).asEagerSingleton();

        final ScheduledExecutorService hdfsService = new StubScheduledExecutorService()
        {
            public AtomicBoolean isShutdown = new AtomicBoolean(false);

            @Override
            public boolean awaitTermination(final long timeout, final TimeUnit unit) throws InterruptedException
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
        bind(EventWriter.class).toInstance(hdfsEventWriter);

        bind(DiskSpoolEventWriter.class).toInstance(
            new MockDiskSpoolEventWriter(new EventHandler()
            {
                @Override
                public void handle(final ObjectInputStream objectInputStream, final CallbackHandler handler) throws ClassNotFoundException, IOException
                {
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

        public MockDiskSpoolEventWriter(final EventHandler eventHandler, final String spoolPath, final boolean flushEnabled, final long flushIntervalInSeconds, final ScheduledExecutorService executor, final SyncType syncType, final int syncBatchSize, final int rateWindowSizeMinutes)
        {
            super(eventHandler, spoolPath, flushEnabled, flushIntervalInSeconds, executor, syncType, syncBatchSize, rateWindowSizeMinutes);
            this.delegate = eventHandler;
        }

        /**
         * We need to override the flush method as we don't want to deal with files
         */
        @Override
        public void flush()
        {
            try {
                delegate.handle(null, new CallbackHandler()
                {
                    @Override
                    public void onError(final Throwable t, final Event event)
                    {
                    }

                    @Override
                    public void onSuccess(final Event event)
                    {
                    }
                });
            }
            catch (ClassNotFoundException e) {
                Assert.fail(e.getLocalizedMessage());
            }
            catch (IOException e) {
                Assert.fail(e.getLocalizedMessage());
            }
        }
    }
}