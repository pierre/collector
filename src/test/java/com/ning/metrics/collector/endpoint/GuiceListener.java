/*
 * Copyright 2010 Ning, Inc.
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

package com.ning.metrics.collector.endpoint;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;

import com.ning.metrics.collector.endpoint.resources.EventHandler;

import java.util.HashMap;
import java.util.Map;

public class GuiceListener extends GuiceServletContextListener
{
    /**
     * Override this method to create (or otherwise obtain a reference to) your
     * injector.
     */
    @Override
    protected Injector getInjector()
    {
        return Guice.createInjector(new ServletModule()
        {

            @Override
            protected void configureServlets()
            {
                bind(EventHandler.class).to(MockEventHandler.class);
                final Map<String, String> params = new HashMap<String, String>();
                params.put("com.sun.jersey.config.property.packages", "com.ning.metrics.collector.endpoint");
                serve("/*").with(GuiceContainer.class, params);
            }
        });
    }
}

