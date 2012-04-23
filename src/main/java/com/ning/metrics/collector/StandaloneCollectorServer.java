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

package com.ning.metrics.collector;

import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.binder.config.CollectorConfigurationObjectFactory;
import com.ning.metrics.collector.guice.HealthChecksModule;
import com.ning.metrics.collector.guice.RequestHandlersModule;
import com.ning.metrics.collector.guice.FiltersModule;
import com.ning.metrics.collector.endpoint.resources.ScribeModule;
import com.ning.metrics.collector.endpoint.servers.JettyServer;
import com.ning.metrics.collector.endpoint.servers.ScribeServer;
import com.ning.metrics.collector.guice.EventCollectorModule;
import com.ning.metrics.collector.hadoop.writer.HdfsModule;
import com.ning.metrics.collector.nagios.CollectorServiceCheck;
import com.ning.metrics.collector.nagios.NagiosMonitor;
import com.ning.metrics.collector.realtime.RealTimeQueueModule;
import com.ning.metrics.collector.util.F5PoolMemberControl;
import com.ning.nagios.FakeNagiosMonitor;
import com.ning.nagios.ServiceCheck;
import com.ning.nagios.ServiceMonitor;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Stage;
import com.google.inject.servlet.ServletModule;
import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;
import com.yammer.metrics.guice.InstrumentationModule;
import org.atmosphere.guice.GuiceManagedAtmosphereServlet;
import org.eclipse.jetty.servlet.DefaultServlet;
import org.skife.config.ConfigurationObjectFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.weakref.jmx.guice.ExportBuilder;
import org.weakref.jmx.guice.MBeanModule;

import javax.management.MBeanServer;
import java.lang.management.ManagementFactory;
import java.util.HashMap;

/**
 * If you are writing your own Main class, make sure to match the name since
 * the GuiceServletContextListener implementation needs to access the injector created here.
 *
 * @see com.ning.metrics.collector.binder.modules.JettyListener
 */
public class StandaloneCollectorServer
{
    private static final Logger log = LoggerFactory.getLogger(StandaloneCollectorServer.class);
    private static Injector injector = null;

    static final String EVENTS_RESOURCES_PATTERN = "/[^a](.*)";
    static final String ASYNC_RESOURCES_PATTERN = "/a(.*)";

    public static void main(final String... args) throws Exception
    {
        final long startTime = System.currentTimeMillis();

        final ConfigurationObjectFactory configFactory = new CollectorConfigurationObjectFactory(System.getProperties());
        final CollectorConfig config = configFactory.build(CollectorConfig.class);

        // Stage.PRODUCTION is mandatory for jmxutils
        injector = Guice.createInjector(Stage.PRODUCTION,
            new MBeanModule(),               /* Used to trigger registration of mbeans exported via ExportBuilder */
            new AbstractModule()
            {
                @Override
                protected void configure()
                {
                    bind(ConfigurationObjectFactory.class).toInstance(configFactory);
                    bind(CollectorConfig.class).toInstance(config);
                    bind(MBeanServer.class).toInstance(ManagementFactory.getPlatformMBeanServer());

                    // JMX exporter
                    final ExportBuilder builder = MBeanModule.newExporter(binder());

                    // F5 slb stuff
                    bind(F5PoolMemberControl.class).asEagerSingleton();
                    builder.export(F5PoolMemberControl.class).as("com.ning.metrics.collector:name=F5poolMemberControl");

                    // Nagios stuff
                    bind(ServiceCheck.class).to(CollectorServiceCheck.class).asEagerSingleton();
                    if (config.isNagiosEnabled()) {
                        bind(ServiceMonitor.class).to(NagiosMonitor.class).asEagerSingleton();
                    }
                    else {
                        final ServiceMonitor monitor = new FakeNagiosMonitor(config.getNagiosCheckRate());
                        bind(ServiceMonitor.class).toInstance(monitor);
                    }

                    bind(JacksonJsonProvider.class).asEagerSingleton();
                }
            },
            new InstrumentationModule(),     /* Provide metrics */
            new HealthChecksModule(),        /* Setup healthchecks */
            new RequestHandlersModule(),
            new HdfsModule(),                /* Wiring for Hadoop */
            new EventCollectorModule(),      /* Required, wire up the event processor and the writer */
            new RealTimeQueueModule(),       /* AMQ integration */
            new FiltersModule(config),       /* Provide filters for the HTTP API */
            new ServletModule()              /* Optional, provide the Jetty endpoint */
            {
                @Override
                protected void configureServlets()
                {
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
            },
            new ScribeModule()              /* Optional, provide the Scribe endpoint */
        );

        /* Start the Jetty endpoint */
        final JettyServer jetty = injector.getInstance(JettyServer.class);
        jetty.start();

        Runtime.getRuntime().addShutdownHook(new Thread()
        {
            @Override
            public void run()
            {
                try {
                    log.info("Shutting down the server...");
                    jetty.stop();
                    log.info("Server has stopped.");
                }
                catch (Exception ex) {
                    log.error("Error when stopping Jetty server: " + ex.getMessage(), ex);
                }
            }
        });

        // We need to wait for Jetty to be fully up (it will setup SLF4j). Otherwise, we may encounter a race condition:
        //SLF4J: The following loggers will not work becasue they were created
        //SLF4J: during the default configuration phase of the underlying logging system.
        //SLF4J: See also http://www.slf4j.org/codes.html#substituteLogger
        //SLF4J: org.apache.thrift.transport.TIOStreamTransport
        while (!jetty.isInitialized()) {
            Thread.sleep(100);
        }

        /* Start the Scribe endpoint */
        injector.getInstance(ScribeServer.class);

        // Create a F5 BIP-IP controller
        // This is a standalone class, access it via JMX when you need to take a collector in or out of a pool
        injector.getInstance(F5PoolMemberControl.class);

        // Talk to Nagios
        final ServiceCheck check = injector.getInstance(ServiceCheck.class);
        final ServiceMonitor serviceMonitor = injector.getInstance(ServiceMonitor.class);
        serviceMonitor.registerServiceCheck(config.getNagiosServiceName(), check);

        final long secondsToStart = (System.currentTimeMillis() - startTime) / 1000;
        log.info(String.format("Collector initialized in %d:%02d", secondsToStart / 60, secondsToStart % 60));
    }

    /**
     * Hack to share the injector with the Jersey GuiceFilter
     *
     * @return the main injector
     * @see com.ning.metrics.collector.binder.modules.JettyListener
     */
    public static Injector getInjector()
    {
        return injector;
    }
}
