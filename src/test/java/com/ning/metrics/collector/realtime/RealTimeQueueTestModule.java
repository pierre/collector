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

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.binder.config.CollectorConfigurationObjectFactory;

import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.skife.config.ConfigurationObjectFactory;

public class RealTimeQueueTestModule extends AbstractModule
{
    private final Lock sessionLock = new ReentrantLock();
    @SuppressWarnings({"MismatchedQueryAndUpdateOfCollection"})
    private final Collection<Object> sentEvents = new CopyOnWriteArrayList<Object>();

    @Override
    protected void configure()
    {
        bind(Lock.class).annotatedWith(Names.named("amqSessionLock")).toInstance(sessionLock);
        bind(Collection.class).annotatedWith(Names.named("sentEvents")).toInstance(sentEvents);

        bind(GlobalEventQueueStats.class).asEagerSingleton();
        ConfigurationObjectFactory configFactory = new CollectorConfigurationObjectFactory(System.getProperties());
        bind(ConfigurationObjectFactory.class).toInstance(configFactory);

        final EventQueueConnectionFactory factory = new EventQueueConnectionFactory()
        {
            @Override
            public EventQueueConnection createConnection()
            {
                return new TestEventQueueConnection();
            }
        };
        bind(EventQueueConnectionFactory.class).toInstance(factory);

        bind(EventQueueProcessor.class).to(EventQueueProcessorImpl.class).asEagerSingleton();
    }

    private class TestEventQueueConnection implements EventQueueConnection
    {
        @Override
        public void reconnect() { }

        @Override
        public EventQueueSession getSessionFor(final String type, CollectorConfig config)
        {
            return new TestEventQueueSession(config);
        }

        @Override
        public void close() { }

        private class TestEventQueueSession implements EventQueueSession
        {
            private final CollectorConfig config;
            
            public TestEventQueueSession(CollectorConfig config)
            {
                this.config = config;
            }
            
            @Override
            public void send(final Object event)
            {
                sessionLock.lock();
                try {
                    sentEvents.add(event);
                }
                finally {
                    sessionLock.unlock();
                }
            }

            @Override
            public void close() { }

            @Override
            public CollectorConfig getConfig() { return config; }
        }

        @Override
        public void setUseBytesMessage(boolean state) { }
    }
}
