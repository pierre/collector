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

import com.google.inject.Binder;
import com.google.inject.Module;
import com.ning.metrics.collector.binder.annotations.ScribeStats;
import com.ning.metrics.collector.binder.providers.EventEndPointStatsProvider;
import com.ning.metrics.collector.endpoint.EventEndPointStats;
import com.ning.metrics.collector.endpoint.resources.ScribeEventRequestHandler;
import com.ning.metrics.collector.events.processing.ScribeEventHandler;
import com.ning.metrics.collector.events.processing.ScribeEventHandlerImpl;
import org.weakref.jmx.guice.ExportBuilder;
import org.weakref.jmx.guice.MBeanModule;
import scribe.thrift.scribe;

public class ScribeModule implements Module
{
    /**
     * Contributes bindings and other configurations to a {@code Binder}.
     */
    @Override
    public void configure(final Binder binder)
    {
        final ExportBuilder builder = MBeanModule.newExporter(binder);

        binder.bind(scribe.Iface.class).to(ScribeEventRequestHandler.class);

        binder.bind(EventEndPointStats.class).annotatedWith(ScribeStats.class).toProvider(EventEndPointStatsProvider.class).asEagerSingleton();
        builder.export(EventEndPointStats.class).as("com.ning.metrics.collector:name=ScribeEventEndPointStats");

        binder.bind(ScribeEventHandler.class).to(ScribeEventHandlerImpl.class);
    }
}
