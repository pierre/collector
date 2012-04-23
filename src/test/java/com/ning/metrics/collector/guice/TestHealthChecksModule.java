/*
 * Copyright 2010-2012 Ning, Inc.
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

package com.ning.metrics.collector.guice;

import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.hadoop.processing.EventSpoolDispatcher;
import com.ning.metrics.collector.hadoop.processing.PersistentWriterFactory;
import com.ning.metrics.collector.hadoop.processing.WriterStats;
import com.ning.metrics.collector.healthchecks.HadoopHealthCheck;
import com.ning.metrics.collector.healthchecks.RealtimeHealthCheck;
import com.ning.metrics.collector.healthchecks.WriterHealthCheck;
import com.ning.metrics.collector.realtime.EventQueueProcessor;
import com.ning.metrics.collector.realtime.EventQueueProcessorImpl;
import com.ning.metrics.collector.realtime.GlobalEventQueueStats;
import com.ning.metrics.serialization.hadoop.FileSystemAccess;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.yammer.metrics.reporting.AdminServlet;
import org.mockito.Mockito;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHealthChecksModule
{
    @Test(groups = "fast")
    public void testConfigure()
    {
        try {
            final Injector injector = Guice.createInjector(new AbstractModule()
            {
                @Override
                protected void configure()
                {
                    bind(FileSystemAccess.class).toInstance(Mockito.mock(FileSystemAccess.class));
                    bind(EventQueueProcessor.class).toInstance(Mockito.mock(EventQueueProcessorImpl.class));
                    bind(GlobalEventQueueStats.class).toInstance(Mockito.mock(GlobalEventQueueStats.class));
                    bind(EventSpoolDispatcher.class).toInstance(Mockito.mock(EventSpoolDispatcher.class));
                    bind(PersistentWriterFactory.class).toInstance(Mockito.mock(PersistentWriterFactory.class));
                    bind(WriterStats.class).toInstance(Mockito.mock(WriterStats.class));
                    bind(CollectorConfig.class).toInstance(Mockito.mock(CollectorConfig.class));
                }
            }, new HealthChecksModule());

            Assert.assertNotNull(injector.getBinding(AdminServlet.class));

            Assert.assertNotNull(injector.getBinding(HadoopHealthCheck.class));
            Assert.assertNotNull(injector.getBinding(RealtimeHealthCheck.class));
            Assert.assertNotNull(injector.getBinding(WriterHealthCheck.class));
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }
}
