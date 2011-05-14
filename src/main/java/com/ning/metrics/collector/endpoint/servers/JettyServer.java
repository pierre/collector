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

package com.ning.metrics.collector.endpoint.servers;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.servlet.GuiceFilter;
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.binder.modules.JettyListener;
import com.ning.metrics.collector.endpoint.setup.SetupJULBridge;
import org.apache.log4j.Logger;
import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.nio.SelectChannelConnector;
import org.eclipse.jetty.server.ssl.SslConnector;
import org.eclipse.jetty.server.ssl.SslSelectChannelConnector;
import org.eclipse.jetty.servlet.DefaultServlet;
import org.eclipse.jetty.servlet.FilterHolder;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import java.util.EventListener;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

@Singleton
public class JettyServer
{
    private final static Logger log = Logger.getLogger(JettyServer.class);

    private final CollectorConfig config;
    private boolean initialized = false;

    @Inject
    public JettyServer(CollectorConfig config)
    {
        this.config = config;
        Executor executor = new ScheduledThreadPoolExecutor(1, Executors.defaultThreadFactory());
        executor.execute(new Runnable()
        {
            @Override
            public void run()
            {
                try {
                    start();
                    // Will be shut down automatically, see below
                }
                catch (Exception e) {
                    log.warn("Unable to start the Jetty server", e);
                    Thread.currentThread().interrupt();
                }
            }
        });
    }

    private void start() throws Exception
    {
        final long startTime = System.currentTimeMillis();

        final Server server = new Server();

        Connector connector = new SelectChannelConnector();
        connector.setHost(config.getLocalIp());
        connector.setPort(config.getLocalPort());
        server.addConnector(connector);

        if (config.isSSLEnabled()) {
            SslConnector sslConnector = new SslSelectChannelConnector();
            sslConnector.setPort(config.getLocalSSLPort());
            sslConnector.setKeystore(config.getSSLkeystoreLocation());
            sslConnector.setKeyPassword(config.getSSLkeystorePassword());
            sslConnector.setPassword(config.getSSLkeystorePassword());
            server.addConnector(sslConnector);
        }

        server.setStopAtShutdown(true);

        ServletContextHandler context = new ServletContextHandler(server, "/", ServletContextHandler.SESSIONS);
        context.addEventListener(new JettyListener());

        // Jersey insists on using java.util.logging (JUL)
        EventListener listener = new SetupJULBridge();
        context.addEventListener(listener);

        // Make sure Guice filter all requests
        FilterHolder filterHolder = new FilterHolder(GuiceFilter.class);
        context.addFilter(filterHolder, "/*", ServletContextHandler.NO_SESSIONS);

        ServletHolder sh = new ServletHolder(DefaultServlet.class);
        sh.setInitParameter("com.sun.jersey.config.property.resourceConfigClass", "com.sun.jersey.api.core.PackagesResourceConfig");
        sh.setInitParameter("com.sun.jersey.config.property.packages", "com.ning.metrics.collector.endpoint");
        context.addServlet(sh, "/*");

        server.start();

        final long secondsToStart = (System.currentTimeMillis() - startTime) / 1000;
        log.info(String.format("Jetty server started in %d:%02d", secondsToStart / 60, secondsToStart % 60));

        initialized = true;
        server.join();
    }

    /**
     * Has Jetty finished its startup sequence?
     *
     * @return true iff Jetty has been setup
     */
    public boolean isInitialized()
    {
        return initialized;
    }
}
