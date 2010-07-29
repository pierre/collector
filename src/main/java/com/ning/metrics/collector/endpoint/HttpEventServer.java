/*
 * Copyright 2010 Ning, Inc.
 *
 * Ning licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.ning.metrics.collector.endpoint;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.servlet.GuiceFilter;
import org.apache.log4j.Logger;
import org.mortbay.jetty.Connector;
import org.mortbay.jetty.Handler;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.bio.SocketConnector;
import org.mortbay.jetty.security.SslSocketConnector;
import org.mortbay.jetty.servlet.Context;
import org.mortbay.jetty.servlet.DefaultServlet;
import org.mortbay.jetty.servlet.FilterHolder;
import org.mortbay.jetty.servlet.ServletHolder;

import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.binder.modules.JettyListener;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

@Singleton
public class HttpEventServer
{
    private final static Logger log = Logger.getLogger(HttpEventServer.class);
    private final String ip;
    private final int port;
    private final int sslPort;
    private final boolean sslEnabled;
    private final String keystoreLocation;
    private final String keystorePassword;

    @Inject
    @SuppressWarnings("unused")
    public HttpEventServer(
        CollectorConfig config
    )
    {
        this(config.getLocalIp(), config.getLocalPort(), config.isSSLEnabled(), config.getLocalSSLPort(), config.getSSLkeystoreLocation(), config.getSSLkeystorePassword());
    }

    public HttpEventServer(
        String ip,
        int port,
        boolean sslEnabled,
        int sslPort,
        String keystoreLocation,
        String keystorePassword
    )
    {
        this.ip = ip;
        this.port = port;
        this.sslEnabled = sslEnabled;
        this.sslPort = sslPort;
        this.keystoreLocation = keystoreLocation;
        this.keystorePassword = keystorePassword;

        ScheduledExecutorService executor = new ScheduledThreadPoolExecutor(1, Executors.defaultThreadFactory());
        executor.execute(new Runnable()
        {
            @Override
            public void run()
            {
                try {
                    start();
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

        Connector connector = new SocketConnector();
        connector.setHost(ip);
        connector.setPort(port);
        server.addConnector(connector);

        if (sslEnabled) {
            SslSocketConnector sslConnector = new SslSocketConnector();
            sslConnector.setPort(sslPort);
            sslConnector.setKeystore(keystoreLocation);
            sslConnector.setKeyPassword(keystorePassword);
            sslConnector.setPassword(keystorePassword);
            server.addConnector(sslConnector);
        }

        server.setStopAtShutdown(true);

        Context context = new Context(server, "/", Context.SESSIONS);
        context.addEventListener(new JettyListener());

        /* Make sure Guice filter all requests */
        FilterHolder filterHolder = new FilterHolder(GuiceFilter.class);
        context.addFilter(filterHolder, "/*", Handler.DEFAULT);

        ServletHolder sh = new ServletHolder(DefaultServlet.class);
        sh.setInitParameter("com.sun.jersey.config.property.resourceConfigClass", "com.sun.jersey.api.core.PackagesResourceConfig");
        sh.setInitParameter("com.sun.jersey.config.property.packages", "com.ning.metrics.collector.endpoint");
        context.addServlet(sh, "/*");

        server.start();

        final long secondsToStart = (System.currentTimeMillis() - startTime) / 1000;
        log.info(String.format("Jetty server started in %d:%02d", secondsToStart / 60, secondsToStart % 60));
    }
}
