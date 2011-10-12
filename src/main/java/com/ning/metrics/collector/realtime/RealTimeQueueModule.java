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

import com.google.inject.Binder;
import com.google.inject.Module;
import com.ning.metrics.collector.realtime.amq.ActiveMQConnectionFactory;
import org.weakref.jmx.guice.ExportBuilder;
import org.weakref.jmx.guice.MBeanModule;

public class RealTimeQueueModule implements Module
{
    @Override
    public void configure(final Binder binder)
    {
        // JMX exporter
        final ExportBuilder builder = MBeanModule.newExporter(binder);

        binder.bind(EventListenerDispatcher.class).asEagerSingleton();
        builder.export(EventListenerDispatcher.class).as("com.ning.metrics.collector:name=Listeners");

        // The following is for AMQ
        binder.bind(GlobalEventQueueStats.class).asEagerSingleton();
        builder.export(GlobalEventQueueStats.class).as("com.ning.metrics.collector:name=RTQueueStats");

        binder.bind(EventQueueConnectionFactory.class).to(ActiveMQConnectionFactory.class).asEagerSingleton();

        binder.bind(EventQueueProcessor.class).to(EventQueueProcessorImpl.class).asEagerSingleton();
        builder.export(EventQueueProcessorImpl.class).as("com.ning.metrics.collector:name=RTSubsystem");
    }
}
