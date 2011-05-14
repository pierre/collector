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

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Stage;
import com.google.inject.servlet.ServletModule;
import com.ning.metrics.collector.binder.ProfiledInterceptor;
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.binder.modules.EventCollectorModule;
import com.ning.metrics.collector.binder.modules.FiltersModule;
import com.ning.metrics.collector.binder.modules.HdfsModule;
import com.ning.metrics.collector.binder.modules.RealTimeQueueModule;
import com.ning.metrics.collector.endpoint.extractors.RequestHandlersModule;
import com.ning.metrics.collector.binder.modules.ScribeModule;
import com.ning.metrics.collector.endpoint.servers.JettyServer;
import com.ning.metrics.collector.endpoint.servers.ScribeServer;
import com.ning.metrics.collector.util.F5PoolMemberControl;
import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.guice.spi.container.servlet.GuiceContainer;
import org.aopalliance.intercept.MethodInterceptor;
import org.apache.log4j.Logger;
import org.perf4j.aop.Profiled;
import org.skife.config.ConfigurationObjectFactory;
import org.weakref.jmx.guice.ExportBuilder;
import org.weakref.jmx.guice.MBeanModule;

import javax.management.MBeanServer;
import java.lang.management.ManagementFactory;
import java.util.HashMap;
import java.util.Map;

import static com.google.inject.matcher.Matchers.annotatedWith;
import static com.google.inject.matcher.Matchers.any;

/**
 * If you are writing your own Main class, make sure to match the name since
 * the GuiceServletContextListener implementation needs to access the injector created here.
 *
 * @see com.ning.metrics.collector.binder.modules.JettyListener
 */
public class StandaloneCollectorServer
{
    private final static Logger log = Logger.getLogger(StandaloneCollectorServer.class);
    private static Injector injector = null;

    public static void main(String... args) throws Exception
    {
        final long startTime = System.currentTimeMillis();

        /* Scan for Jersey endpoints */
        final Map<String, String> params = new HashMap<String, String>();
        params.put(PackagesResourceConfig.PROPERTY_PACKAGES, "com.ning.metrics.collector.endpoint");

        final CollectorConfig config = new ConfigurationObjectFactory(System.getProperties()).build(CollectorConfig.class);

        // Stage.PRODUCTION is mandatory for jmxutils
        injector = Guice.createInjector(Stage.PRODUCTION,
            new MBeanModule(),               /* Used to trigger registration of mbeans exported via ExportBuilder */
            new AbstractModule()
            {
                @Override
                protected void configure()
                {
                    bind(CollectorConfig.class).toInstance(config);
                    bind(MBeanServer.class).toInstance(ManagementFactory.getPlatformMBeanServer());

                    // JMX exporter
                    ExportBuilder builder = MBeanModule.newExporter(binder());

                    // Perf4j Stuff
                    MethodInterceptor interceptor = new ProfiledInterceptor();
                    bindInterceptor(any(), annotatedWith(Profiled.class), interceptor);

                    // F5 slb stuff
                    bind(F5PoolMemberControl.class).asEagerSingleton();
                    builder.export(F5PoolMemberControl.class).as("com.ning.metrics.collector:name=F5poolMemberControl");
                }
            },
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
                    // Note! It's "*", NOT "/*"
                    serve("*").with(GuiceContainer.class, params);
                }
            },
            new ScribeModule()              /* Optional, provide the Scribe endpoint */
        );

        /* Start the Jetty endpoint */
        JettyServer jetty = injector.getInstance(JettyServer.class);

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

        final long secondsToStart = (System.currentTimeMillis() - startTime) / 1000;
        log.info(String.format("Collector initialized in %d:%02d", secondsToStart / 60, secondsToStart % 60));
    }

    /**
     * Hack to share the injector with the Jersey GuiceFilter
     *
     * @see com.ning.metrics.collector.binder.modules.JettyListener
     * @return the main injector
     */
    public static Injector getInjector()
    {
        return injector;
    }
}
