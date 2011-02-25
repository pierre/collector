/*
 * Copyright 2010 Ning, Inc.
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

package com.ning.metrics.collector.events.processing;

import com.google.inject.Inject;
import com.ning.metrics.serialization.util.Managed;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQTopic;
import org.apache.log4j.Logger;

import com.ning.metrics.collector.binder.config.CollectorConfig;

import javax.jms.Connection;
import javax.jms.DeliveryMode;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class ActiveMQSenderImpl implements ActiveMQSender
{
    private static final Logger logger = Logger.getLogger(ActiveMQSenderImpl.class);

    // Set by the user via JMX
    private final AtomicBoolean stopReconnecting = new AtomicBoolean(false);
    // Set by the sending code, if something goes wrong with the connection
    private final AtomicBoolean shouldReconnect = new AtomicBoolean(false);

    private volatile Session session = null;
    private final ActiveMQConnectionFactory connectionFactory;
    private volatile Connection connection = null;
    private final int messagesTTLMilliseconds;

    private volatile int connectionRetries = 0;
    private volatile int sessionRetries = 0;

    @Inject
    public ActiveMQSenderImpl(
        CollectorConfig config
    )
    {
        this(config.getActiveMQHost(), config.getActiveMQPort(), config.getMessagesTTLMilliseconds());
    }

    public ActiveMQSenderImpl(
        String host,
        int port,
        int messagesTTLMilliseconds
    )
    {
        this.connectionFactory = new ActiveMQConnectionFactory("tcp://" + host + ":" + port);
        this.messagesTTLMilliseconds = messagesTTLMilliseconds;

        // Create the connection
        requestReconnection();

        /*
         * Add in a shutdown hook
         */
        Runtime.getRuntime().addShutdownHook(new Thread()
        {
            @Override
            public void run()
            {
                try {
                    shutdown();
                }
                catch (JMSException e1) {
                    logger.error("Unable to shutdown the ActiveMQ connection");
                }
            }
        });

        /*
         * Create the reconnection thread
         */
        ScheduledExecutorService executor = new ScheduledThreadPoolExecutor(1, Executors.defaultThreadFactory());
        executor.scheduleWithFixedDelay(new Runnable()
        {
            private final Random random = new Random();

            @Override
            public void run()
            {
                if (shouldReconnect.get()) {
                    // Out of paranoia, sleep a bit to avoid a thundering heard of re-connections
                    try {
                        Thread.sleep(random.nextInt(2000));
                    }
                    catch (InterruptedException e) {
                        logger.debug("Interrupted sleeping on reconnect", e);
                        Thread.currentThread().interrupt();

                        return;
                    }

                    connection = null;
                    session = null;

                    // This will unset shouldReconnect on success
                    createConnectionAndSession();
                }
            }
        }, 0, 1, TimeUnit.SECONDS);
    }

    /**
     * Establish a connection and a session to the specified ActiveMQ endpoint.
     */
    private void createConnectionAndSession()
    {
        if (!stopReconnecting.get()) {
            try {
                // (Re)create a connection
                connectionRetries++;
                connection = connectionFactory.createConnection();
                connection.start();

                // (Re)create a Session
                sessionRetries++;
                session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

                shouldReconnect.set(false);
                logger.info("Connection to ActiveMQ established");
            }
            catch (JMSException e) {
                logger.warn("Unable to create a connection and/or a session with the ActiveMQ endpoint");
            }
        }
    }

    /**
     * Re-initialize the connection and session, and try to reconnect to the ActiveMQ endpoint.
     */
    private void requestReconnection()
    {
        shouldReconnect.set(true);
    }

    /**
     * Stop the connection to the ActiveMQ endpoint
     *
     * @throws JMSException if the connection cannot be cleanly shutdown
     */
    private void shutdown() throws JMSException
    {
        shouldReconnect.set(false);
        stopReconnecting.set(true);
        if (connection != null) {
            connection.stop();
        }
    }

    /**
     * Low level plumbing to actually send the message.
     *
     * @param producer producer of the established session
     * @param text     message to send
     * @throws JMSException if something bad happens while sending the message
     */
    private void send(MessageProducer producer, String text) throws JMSException
    {
        TextMessage message = session.createTextMessage(text);

        // Tell the producer to send the message
        producer.send(message);
        logger.debug("Sent message to ActiveMQ: " + message.hashCode());
    }

    @Override
    public boolean sendMessage(String category, String message)
    {
        if (session == null) {
            // The session has still not been established
            logger.info(String.format("Connection to ActiveMQ endpoint not established, dropping message: [%s] [%s] and retrying to connect", category, message));
            requestReconnection();
            return false;
        }

        // Create the destination (Topic or Queue)
        final ActiveMQTopic topic = new ActiveMQTopic(category);

        // Create a MessageProducer from the Session to the Topic or Queue
        MessageProducer producer;
        try {
            producer = session.createProducer(topic);
            producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
            producer.setTimeToLive(messagesTTLMilliseconds);
            send(producer, message);
            return true;
        }
        catch (JMSException e) {
            // Connection flacky, maybe got dropped? ActiveMQ enpoint died?
            logger.debug("Something went wrong while sending message to ActiveMQ", e);
            requestReconnection();
            return false;
        }
    }

    @Managed(description = "get the number of times we retried to connect to ActiveMQ")
    public int getConnectionRetries()
    {
        return connectionRetries;
    }

    @Managed(description = "get the number of times we retried to establish a session to ActiveMQ")
    public int getSessionRetries()
    {
        return sessionRetries;
    }

    @Managed(description = "don't keep trying to (re)connect to ActiveMQ")
    public void giveUpTryingToConnect()
    {
        stopReconnecting.set(true);
    }

    @Managed(description = "keep trying to (re)connect to ActiveMQ")
    public void keepTryingToConnect()
    {
        stopReconnecting.set(false);
    }
}
