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

package com.ning.metrics.collector.guice;

import com.ning.metrics.collector.endpoint.extractors.EventDeserializerFactory;
import com.ning.metrics.collector.jaxrs.EventDeserializerRequestHandler;
import com.ning.metrics.collector.jaxrs.EventFilterRequestHandler;

import com.google.inject.AbstractModule;
import org.weakref.jmx.guice.ExportBuilder;
import org.weakref.jmx.guice.MBeanModule;

public class RequestHandlersModule extends AbstractModule
{
    @Override
    public void configure()
    {
        // JMX exporter
        final ExportBuilder builder = MBeanModule.newExporter(binder());

        bind(EventDeserializerFactory.class).asEagerSingleton();

        bind(EventFilterRequestHandler.class).asEagerSingleton();

        bind(EventDeserializerRequestHandler.class).asEagerSingleton();
        builder.export(EventDeserializerRequestHandler.class).withGeneratedName();
    }
}
