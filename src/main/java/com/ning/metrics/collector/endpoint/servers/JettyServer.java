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

import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.binder.modules.JettyListener;
import com.ning.metrics.collector.endpoint.setup.SetupJULBridge;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.servlet.GuiceFilter;
import org.apache.shiro.web.servlet.IniShiroFilter;
import org.eclipse.jetty.jmx.MBeanContainer;
import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.nio.SelectChannelConnector;
import org.eclipse.jetty.server.ssl.SslConnector;
import org.eclipse.jetty.server.ssl.SslSelectChannelConnector;
import org.eclipse.jetty.servlet.DefaultServlet;
import org.eclipse.jetty.servlet.FilterHolder;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.thread.QueuedThreadPool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.management.MBeanServer;
import javax.servlet.DispatcherType;
import java.util.EnumSet;
import java.util.EventListener;

@Singleton
public class JettyServer
{
    private static final Logger log = LoggerFactory.getLogger(JettyServer.class);

    private final CollectorConfig config;
    private final MBeanServer mbeanServer;
    private boolean initialized = false;
    private Server server;

    @Inject
    public JettyServer(final CollectorConfig config, final MBeanServer mbeanServer)
    {
        this.config = config;
        this.mbeanServer = mbeanServer;
    }

    public void start() throws Exception
    {
        final long startTime = System.currentTimeMillis();

        server = new Server();

        // Setup JMX
        final MBeanContainer mbContainer = new MBeanContainer(mbeanServer);
        server.getContainer().addEventListener(mbContainer);
        server.addBean(mbContainer);
        mbContainer.addBean(Log.getLog());

        final Connector connector = new SelectChannelConnector();
        connector.setStatsOn(config.isJettyStatsOn());
        connector.setHost(config.getLocalIp());
        connector.setPort(config.getLocalPort());
        connector.setLowResourceMaxIdleTime((int) config.getJettyLowResourcesMaxIdleTime().getMillis());
        connector.setMaxIdleTime((int) config.getJettyMaxIdleTime().getMillis());
        server.addConnector(connector);

        if (config.isSSLEnabled()) {
            final SslConnector sslConnector = new SslSelectChannelConnector();
            sslConnector.setStatsOn(config.isJettyStatsOn());
            sslConnector.setPort(config.getLocalSSLPort());
            sslConnector.setKeystore(config.getSSLkeystoreLocation());
            sslConnector.setKeyPassword(config.getSSLkeystorePassword());
            sslConnector.setPassword(config.getSSLkeystorePassword());
            sslConnector.setLowResourceMaxIdleTime((int) config.getJettyLowResourcesMaxIdleTime().getMillis());
            sslConnector.setMaxIdleTime((int) config.getJettyMaxIdleTime().getMillis());
            server.addConnector(sslConnector);
        }

        server.setStopAtShutdown(true);

        final QueuedThreadPool threadPool = new QueuedThreadPool();
        threadPool.setName("jetty-threadPool");
        threadPool.setMinThreads(config.getJettyMinThreads());
        threadPool.setMaxThreads(config.getJettyMaxThreads());
        threadPool.setMaxIdleTimeMs((int) config.getJettyMaxIdleTime().getMillis());
        server.setThreadPool(threadPool);

        final ServletContextHandler context = new ServletContextHandler(server, "/", ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        // Required! See ContextHandler#getResource and http://docs.codehaus.org/display/JETTY/Embedding+Jetty
        final String webapp = this.getClass().getClassLoader().getResource("webapp").toExternalForm();
        context.setResourceBase(webapp);
        context.addEventListener(new JettyListener());

        // Jersey insists on using java.util.logging (JUL)
        final EventListener listener = new SetupJULBridge();
        context.addEventListener(listener);

        // Protect the resources using Shiro
        if (config.getShiroConfigPath() != null) {
            log.info(String.format("Using [%s] for Shiro configPath", config.getShiroConfigPath()));
            final FilterHolder authFilterHolder = new FilterHolder(IniShiroFilter.class);
            authFilterHolder.setInitParameter("configPath", config.getShiroConfigPath());
            context.addFilter(authFilterHolder, "/*", EnumSet.of(DispatcherType.REQUEST, DispatcherType.ASYNC));
        }
        else {
            log.info("Skipping Shiro configuration as no config path was specified");
        }

        // Make sure Guice filter all requests
        final FilterHolder filterHolder = new FilterHolder(GuiceFilter.class);
        context.addFilter(filterHolder, "/*", EnumSet.of(DispatcherType.REQUEST, DispatcherType.ASYNC));

        // Backend servlet for Guice - never used
        final ServletHolder sh = new ServletHolder(DefaultServlet.class);
        context.addServlet(sh, "/*");

        server.start();

        final long secondsToStart = (System.currentTimeMillis() - startTime) / 1000;
        log.info(String.format("Jetty server started in %d:%02d", secondsToStart / 60, secondsToStart % 60));

        initialized = true;
    }

    public void stop()
    {
        if (!initialized) {
            return;
        }

        try {
            server.stop();
        }
        catch (Exception e) {
            log.warn("Got exception trying to stop Jetty", e);
        }
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
