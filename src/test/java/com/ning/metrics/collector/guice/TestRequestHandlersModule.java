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
import com.ning.metrics.collector.endpoint.ParsedRequest;
import com.ning.metrics.collector.endpoint.extractors.EventDeserializerFactory;
import com.ning.metrics.collector.filtering.Filter;
import com.ning.metrics.collector.jaxrs.EventDeserializerRequestHandler;
import com.ning.metrics.collector.jaxrs.EventFilterRequestHandler;
import com.ning.metrics.collector.processing.EventCollector;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.TypeLiteral;
import org.mockito.Mockito;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestRequestHandlersModule
{
    @Test(groups = "fast")
    public void testConfigure()
    {
        final CollectorConfig config = Mockito.mock(CollectorConfig.class);

        try {
            final Injector injector = Guice.createInjector(new AbstractModule()
            {
                @Override
                protected void configure()
                {
                    bind(CollectorConfig.class).toInstance(config);
                    bind(EventCollector.class).toInstance(Mockito.mock(EventCollector.class));
                }
            }, new RequestHandlersModule(), new FiltersModule(config));

            Assert.assertEquals(injector.findBindingsByType(new TypeLiteral<CollectorConfig>() {}).size(), 1);
            Assert.assertEquals(injector.findBindingsByType(new TypeLiteral<EventCollector>() {}).size(), 1);
            Assert.assertEquals(injector.findBindingsByType(new TypeLiteral<EventDeserializerFactory>() {}).size(), 1);
            Assert.assertEquals(injector.findBindingsByType(new TypeLiteral<EventFilterRequestHandler>() {}).size(), 1);
            Assert.assertEquals(injector.findBindingsByType(new TypeLiteral<EventDeserializerRequestHandler>() {}).size(), 1);
            Assert.assertEquals(injector.findBindingsByType(new TypeLiteral<Filter<ParsedRequest>>() {}).size(), 6);
            Assert.assertEquals(injector.findBindingsByType(new TypeLiteral<List<Filter<ParsedRequest>>>() {}).size(), 1);
        }
        catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }
}
