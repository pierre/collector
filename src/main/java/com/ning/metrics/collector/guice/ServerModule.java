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
import com.ning.metrics.collector.binder.config.CollectorConfigurationObjectFactory;
import com.ning.metrics.collector.endpoint.resources.ScribeModule;
import com.ning.metrics.collector.hadoop.writer.HdfsModule;
import com.ning.metrics.collector.nagios.CollectorServiceCheck;
import com.ning.metrics.collector.nagios.NagiosMonitor;
import com.ning.metrics.collector.realtime.RealTimeQueueModule;
import com.ning.metrics.collector.util.F5PoolMemberControl;
import com.ning.nagios.FakeNagiosMonitor;
import com.ning.nagios.ServiceCheck;
import com.ning.nagios.ServiceMonitor;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.google.inject.servlet.ServletModule;
import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;
import com.yammer.metrics.guice.InstrumentationModule;
import org.atmosphere.guice.GuiceManagedAtmosphereServlet;
import org.eclipse.jetty.servlet.DefaultServlet;
import org.skife.config.ConfigurationObjectFactory;
import org.weakref.jmx.guice.ExportBuilder;
import org.weakref.jmx.guice.MBeanModule;

import javax.management.MBeanServer;
import java.lang.management.ManagementFactory;
import java.util.HashMap;

public class ServerModule extends ServletModule
{
    static final String EVENTS_RESOURCES_PATTERN = "/[^a](.*)";
    static final String ASYNC_RESOURCES_PATTERN = "/a(.*)";

    @Override
    protected void configureServlets()
    {
        final ConfigurationObjectFactory configFactory = new CollectorConfigurationObjectFactory(System.getProperties());
        final CollectorConfig config = configFactory.build(CollectorConfig.class);
        bind(ConfigurationObjectFactory.class).toInstance(configFactory);
        bind(CollectorConfig.class).toInstance(config);

        installStats();
        installHealthChecks();
        installJMX();
        installNagios(config);
        installF5();
        installJaxrsSupport(config);
        installScribe();
        installPersistentSink();
        installHDFS();
        installRealtimeSink();

        // Static files
        bind(DefaultServlet.class).asEagerSingleton();
        serve("/media/*").with(DefaultServlet.class);

        serveRegex(ASYNC_RESOURCES_PATTERN).with(GuiceManagedAtmosphereServlet.class, new HashMap<String, String>()
        {
            {
                put(PackagesResourceConfig.PROPERTY_PACKAGES, "com.ning.metrics.collector.jaxrs");
            }
        });
        serveRegex(EVENTS_RESOURCES_PATTERN).with(GuiceContainer.class, new HashMap<String, String>()
        {
            {
                put(PackagesResourceConfig.PROPERTY_PACKAGES, "com.ning.metrics.collector.jaxrs");
            }
        });
    }

    protected void installStats()
    {
        install(new InstrumentationModule());
    }

    protected void installHealthChecks()
    {
        install(new HealthChecksModule());
    }

    protected void installJMX()
    {
        bind(MBeanServer.class).toInstance(ManagementFactory.getPlatformMBeanServer());
        install(new MBeanModule());
    }

    protected void installNagios(final CollectorConfig config)
    {
        bind(ServiceCheck.class).to(CollectorServiceCheck.class).asEagerSingleton();
        if (config.isNagiosEnabled()) {
            bind(ServiceMonitor.class).to(NagiosMonitor.class).asEagerSingleton();
        }
        else {
            final ServiceMonitor monitor = new FakeNagiosMonitor(config.getNagiosCheckRate());
            bind(ServiceMonitor.class).toInstance(monitor);
        }

    }

    protected void installF5()
    {
        bind(F5PoolMemberControl.class).asEagerSingleton();

        final ExportBuilder builder = MBeanModule.newExporter(binder());
        builder.export(F5PoolMemberControl.class).as("com.ning.metrics.collector:name=F5poolMemberControl");
    }

    protected void installJaxrsSupport(final CollectorConfig config)
    {
        bind(JacksonJsonProvider.class).asEagerSingleton();

        install(new RequestHandlersModule());
        install(new FiltersModule(config));
    }

    protected void installScribe()
    {
        install(new ScribeModule());
    }

    protected void installPersistentSink()
    {
        install(new EventCollectorModule());
    }

    protected void installHDFS()
    {
        install(new HdfsModule());
    }

    protected void installRealtimeSink()
    {
        install(new RealTimeQueueModule());
    }
}
