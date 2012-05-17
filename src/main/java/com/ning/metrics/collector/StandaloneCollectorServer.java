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

import com.ning.arecibo.jmx.AreciboProfile;
import com.ning.arecibo.metrics.AreciboMetricsReporter;
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.endpoint.servers.JettyServer;
import com.ning.metrics.collector.endpoint.servers.ScribeServer;
import com.ning.metrics.collector.guice.ServerModule;
import com.ning.nagios.ServiceCheck;
import com.ning.nagios.ServiceMonitor;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StandaloneCollectorServer
{
    private static final Logger log = LoggerFactory.getLogger(StandaloneCollectorServer.class);

    private final CollectorConfig config;
    private final JettyServer jettyServer;
    private final ScribeServer scribeServer;
    private final ServiceCheck serviceCheck;
    private final ServiceMonitor serviceMonitor;
    private final AreciboProfile areciboProfile;

    @Inject
    public StandaloneCollectorServer(final CollectorConfig config,
                                     final JettyServer jettyServer,
                                     final ScribeServer scribeServer,
                                     final ServiceCheck serviceCheck,
                                     final ServiceMonitor serviceMonitor,
                                     final AreciboProfile areciboProfile)
    {
        this.config = config;
        this.jettyServer = jettyServer;
        this.scribeServer = scribeServer;
        this.serviceCheck = serviceCheck;
        this.serviceMonitor = serviceMonitor;
        this.areciboProfile = areciboProfile;
    }

    private void start()
    {
        try {
            log.info("Starting the Jetty server...");
            jettyServer.start();
            log.info("Jetty server has started");

            log.info("Starting the Scribe server...");
            scribeServer.start();
            log.info("Scribe server has started");
        }
        catch (Exception ex) {
            log.error("Error when stopping servers: " + ex.getMessage(), ex);
        }

        // Talk to Nagios
        serviceMonitor.registerServiceCheck(config.getNagiosServiceName(), serviceCheck);

        // Report metrics to Arecibo
        AreciboMetricsReporter.enable(areciboProfile);
    }

    private void stop()
    {
        try {
            log.info("Shutting down the Jetty server...");
            jettyServer.stop();
            log.info("Jetty server has stopped");

            log.info("Shutting down the Scribe server...");
            scribeServer.stop();
            log.info("Scribe server has stopped");
        }
        catch (Exception ex) {
            log.error("Error when stopping servers: " + ex.getMessage(), ex);
        }
    }

    public static void main(final String... args) throws Exception
    {
        final long startTime = System.currentTimeMillis();

        // Stage.PRODUCTION is mandatory for jmxutils
        final Injector injector = Guice.createInjector(Stage.PRODUCTION, new ServerModule());
        final StandaloneCollectorServer server = injector.getInstance(StandaloneCollectorServer.class);

        Runtime.getRuntime().addShutdownHook(new Thread()
        {
            @Override
            public void run()
            {
                server.stop();
            }
        });

        server.start();

        final long secondsToStart = (System.currentTimeMillis() - startTime) / 1000;
        log.info(String.format("Collector initialized in %d:%02d", secondsToStart / 60, secondsToStart % 60));

        Thread.currentThread().join();
    }
}
