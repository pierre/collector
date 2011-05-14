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
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.util.NamedThreadFactory;
import org.apache.log4j.Logger;
import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TNonblockingServer;
import org.apache.thrift.transport.TNonblockingServerSocket;
import org.apache.thrift.transport.TNonblockingServerTransport;
import org.apache.thrift.transport.TTransportException;
import scribe.thrift.scribe.Iface;
import scribe.thrift.scribe.Processor;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * Thrift service. Contacted usually by Scribe client.
 */
public class ScribeServer
{
    private static final Logger log = Logger.getLogger(ScribeServer.class);

    private final Iface eventRequestHandler;
    private final CollectorConfig config;

    private TNonblockingServer server = null;

    @Inject
    public ScribeServer(Iface eventRequestHandler, CollectorConfig config) throws TTransportException
    {
        this.eventRequestHandler = eventRequestHandler;
        this.config = config;

        Executor executor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("ScribeServer"));
        executor.execute(new Runnable()
        {
            @Override
            public void run()
            {
                try {
                    start();

                    Runtime.getRuntime().addShutdownHook(new Thread()
                    {
                        @Override
                        public void run()
                        {
                            shutdown();
                        }
                    });
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
        TNonblockingServerTransport socket = new TNonblockingServerSocket(config.getScribePort());
        TProcessor processor = new Processor(eventRequestHandler);

        server = new TNonblockingServer(new TNonblockingServer.Args(socket).processor(processor).protocolFactory(new TBinaryProtocol.Factory()));
        log.info(String.format("Starting terminal Scribe server on port %d", config.getScribePort()));
        server.serve();
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

