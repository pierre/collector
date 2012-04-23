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

import com.ning.metrics.collector.healthchecks.HadoopHealthCheck;
import com.ning.metrics.collector.healthchecks.RealtimeHealthCheck;
import com.ning.metrics.collector.healthchecks.WriterHealthCheck;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;
import com.yammer.metrics.core.HealthCheck;
import com.yammer.metrics.guice.servlet.AdminServletModule;

public class HealthChecksModule extends AbstractModule
{
    @Override
    protected void configure()
    {
        install(new AdminServletModule());

        final Multibinder<HealthCheck> healthChecksBinder = Multibinder.newSetBinder(binder(), HealthCheck.class);
        healthChecksBinder.addBinding().to(HadoopHealthCheck.class).asEagerSingleton();
        healthChecksBinder.addBinding().to(RealtimeHealthCheck.class).asEagerSingleton();
        healthChecksBinder.addBinding().to(WriterHealthCheck.class).asEagerSingleton();
    }
}
