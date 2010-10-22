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

package com.ning.metrics.collector.endpoint.servers;

import com.google.inject.Inject;
import org.apache.log4j.Logger;
import org.apache.thrift.server.THsHaServer;
import org.apache.thrift.server.TNonblockingServer;
import org.apache.thrift.transport.TNonblockingServerSocket;
import org.apache.thrift.transport.TNonblockingServerTransport;
import org.apache.thrift.transport.TTransportException;
import scribe.thrift.scribe.Iface;
import scribe.thrift.scribe.Processor;

import com.ning.metrics.collector.binder.config.CollectorConfig;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * Thrift service. Contacted usually by Scribe client.
 */
public class ScribeServer
{
    private final Iface eventRequestHandler;
    private final int port;
    private TNonblockingServer server = null;

    private static final Logger log = Logger.getLogger(ScribeServer.class);

    @SuppressWarnings("unused")
    @Inject
    public ScribeServer(
        Iface eventRequestHandler,
        CollectorConfig config
    ) throws TTransportException
    {
        this(eventRequestHandler, config.getScribePort());
    }

    public ScribeServer(
        Iface eventRequestHandler,
        int port
    ) throws TTransportException
    {
        this.eventRequestHandler = eventRequestHandler;
        this.port = port;

        ScheduledExecutorService executor = new ScheduledThreadPoolExecutor(1, Executors.defaultThreadFactory());
        executor.execute(new Runnable()
        {
            @Override
            public void run()
            {
                try {
                    start();
                }
                catch (TTransportException e) {
                    log.warn("Unable to start the Scribe server", e);
                    Thread.currentThread().interrupt();
                }
            }
        });
    }

    /**
     * Start the terminal Scribe server
     *
     * @throws TTransportException if the TNonblockingServerSocket cannot be instantiated
     */
    private void start() throws TTransportException
    {
        TNonblockingServerTransport socket = new TNonblockingServerSocket(port);
        Processor processor = new Processor(eventRequestHandler);

        server = new THsHaServer(processor, socket);
        log.info(String.format("Starting terminal Scribe server on port %d", port));
        server.serve();

        /*
         * Add in a shutdown hook
         */
        Runtime.getRuntime().addShutdownHook(new Thread()
        {
            @Override
            public void run()
            {
                shutdown();
            }
        });
    }

    /**
     * Stop the terminal Scribe server
     */
    private void shutdown()
    {
        if (server != null) {
            server.stop();
        }
    }
}

