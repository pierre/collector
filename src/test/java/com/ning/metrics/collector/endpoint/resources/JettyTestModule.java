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

package com.ning.metrics.collector.endpoint.resources;

import com.google.inject.AbstractModule;
import com.google.inject.servlet.ServletModule;
import com.ning.metrics.collector.FastCollectorConfig;
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.binder.config.CollectorConfigurationObjectFactory;
import com.ning.metrics.collector.endpoint.extractors.RequestHandlersModule;
import com.ning.metrics.collector.endpoint.filters.FiltersModule;
import com.ning.metrics.collector.hadoop.processing.EventCollectorModule;
import com.ning.metrics.collector.hadoop.processing.MockPersistentWriterFactory;
import com.ning.metrics.collector.hadoop.processing.PersistentWriterFactory;
import com.ning.metrics.collector.realtime.RealTimeQueueModule;
import com.ning.metrics.serialization.writer.MockEventWriter;
import com.ning.metrics.serialization.writer.ThresholdEventWriter;
import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;

import javax.management.MBeanServer;

import org.skife.config.ConfigurationObjectFactory;

import java.lang.management.ManagementFactory;
import java.util.HashMap;
import java.util.Map;

public class JettyTestModule extends AbstractModule
{
    abstract static class AutoFlushConfig extends FastCollectorConfig
    {
        /**
         * Maximum number of events per file in the temporary spooling area. Past this threshold,
         * buffered events are promoted to the final spool queue.
         *
         * @return the maximum number of events per file
         */
        @Override
        public long getMaxUncommittedWriteCount()
        {
            return 0L;
        }
    }

    @Override
    protected void configure()
    {
        final ConfigurationObjectFactory configFactory = new CollectorConfigurationObjectFactory(System.getProperties());
        final CollectorConfig config = configFactory.build(AutoFlushConfig.class);
        bind(MBeanServer.class).toInstance(ManagementFactory.getPlatformMBeanServer());
        
        // Install all production (real) modules...
        install(new AbstractModule()
        {
            @Override
            protected void configure()
            {
                bind(ConfigurationObjectFactory.class).toInstance(configFactory);
                bind(CollectorConfig.class).toInstance(config);
            }
        });
        install(new RequestHandlersModule());
        install(new EventCollectorModule());
        install(new RealTimeQueueModule());
        install(new FiltersModule(config));
        install(new ServletModule()
        {
            @Override
            protected void configureServlets()
            {
                final Map<String, String> params = new HashMap<String, String>();
                params.put(PackagesResourceConfig.PROPERTY_PACKAGES, "com.ning.metrics.collector.endpoint");
                // Note! It's "*", NOT "/*"
                serve("*").with(GuiceContainer.class, params);
            }
        });

        // ...except for the Hadoop flusher that we Mock
        final MockEventWriter writer = new MockEventWriter();
        bind(MockEventWriter.class).toInstance(writer);
        // Wrap around ThresholdEventWriter to trigger commits
        bind(PersistentWriterFactory.class).toInstance(new MockPersistentWriterFactory(new ThresholdEventWriter(writer, 0, 1)));
    }
}
