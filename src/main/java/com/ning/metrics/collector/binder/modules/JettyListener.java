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

package com.ning.metrics.collector.binder.modules;

import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.ning.metrics.collector.StandaloneCollectorServer;


public class JettyListener extends GuiceServletContextListener
{
    @Override
    protected Injector getInjector()
    {
        return StandaloneCollectorServer.getInjector();
    }
}
