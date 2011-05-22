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
import com.ning.metrics.collector.binder.config.CollectorConfig;
import org.skife.config.ConfigurationObjectFactory;

public class TestConfigModule extends AbstractModule
{    abstract static class FastCollectorConfig implements CollectorConfig
    {
        /**
         * Maximum number of events per file in the temporary spooling area. Past this threshold,
         * buffered events are promoted to the final spool queue.
         *
         * @return the maximum number of events per file
         */
        @Override
        public long getFlushEventQueueSize()
        {
            return 2;
        }

        /**
         * Delay between flushes (in seconds)
         *
         * @return delay between flushes to HDFS
         */
        @Override
        public long getFlushIntervalInSeconds()
        {
            return 1L;
        }
    }

    @Override
    protected void configure()
    {
        final CollectorConfig collectorConfig = new ConfigurationObjectFactory(System.getProperties()).build(FastCollectorConfig.class);
        bind(CollectorConfig.class).toInstance(collectorConfig);
    }
}
