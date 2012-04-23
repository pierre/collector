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

package com.ning.metrics.collector.realtime.amq;

import java.util.concurrent.atomic.AtomicBoolean;

import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.realtime.EventQueueConnection;
import com.ning.metrics.collector.realtime.EventQueueSession;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jms.JMSException;
import javax.jms.Session;
import javax.jms.TopicConnection;
import javax.jms.TopicSession;

class ActiveMQConnection implements EventQueueConnection
{
    private static final Logger logger = LoggerFactory.getLogger(ActiveMQConnection.class);

    private ActiveMQConnectionFactory connectionFactory = null;
    private final Object connectionMonitor = new Object();
    private TopicConnection connection = null;
    private final AtomicBoolean useBytesMessage;

    public ActiveMQConnection(final CollectorConfig baseConfig)
    {
        // NOTE: general config, NOT per-topic:
        useBytesMessage = new AtomicBoolean(baseConfig.getActiveMQUseBytesMessage());
        String uri = baseConfig.getActiveMQUri();
        if (uri != null) {
            this.connectionFactory = new ActiveMQConnectionFactory(uri);
            /* note: global setting, no per-category (topic) overrides; if we
             * need those, need to use multiple connection factories
             */
            this.connectionFactory.setUseAsyncSend(baseConfig.getActiveMQUseAsyncSend());
        }
    }

    @Override
    public void setUseBytesMessage(boolean state) {
        useBytesMessage.set(state);
    }
    
    @Override
    public void reconnect()
    {
        final long startTime = System.currentTimeMillis();

        if (connectionFactory == null) {
            logger.warn("Asked to reconnect to AMQ but no connectionFactory was configured!");
            return;
        }

        synchronized (connectionMonitor) {
            close();
            int numTries = 0;
            int pauseInMs = 100;
            boolean connected = false;
            while (!connected) {
                numTries++;
                try {
                    connection = connectionFactory.createTopicConnection();
                    connection.start();
                    connected = true;
                }
                catch (JMSException ex) {
                    logger.warn("Got error while trying to connect to activemq");
                    try {
                        Thread.sleep((long) pauseInMs);
                    }
                    catch (InterruptedException innerEx) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    if (numTries < 10) {
                        pauseInMs += pauseInMs;
                    }
                }
            }
        }

        final long secondsToReconnect = (System.currentTimeMillis() - startTime) / 1000;
        logger.info(String.format("Reconnected to AMQ in %d seconds", secondsToReconnect));
    }

    @Override
    public EventQueueSession getSessionFor(final String type, final CollectorConfig config)
    {
        return new ActiveMQSession(config, this, type, useBytesMessage);
    }

    TopicSession createTopicSession()
    {
        TopicSession result = null;

        while (result == null) {
            try {
                result = connection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
            }
            catch (JMSException ex) {
                reconnect();
            }
        }
        return result;
    }

    @Override
    public void close()
    {
        synchronized (connectionMonitor) {
            if (connection != null) {
                try {
                    connection.close();
                }
                catch (JMSException ex) {
                    logger.error("Error while closing the connection to ActiveMQ", ex);
                }
                connection = null;
            }
        }
    }
}
