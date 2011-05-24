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

import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.realtime.EventQueueConnection;
import com.ning.metrics.collector.realtime.EventQueueSession;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.log4j.Logger;

import javax.jms.JMSException;
import javax.jms.Session;
import javax.jms.TopicConnection;
import javax.jms.TopicSession;

class ActiveMQConnection implements EventQueueConnection
{
    private static final Logger logger = Logger.getLogger(ActiveMQConnection.class);

    private final CollectorConfig config;
    private ActiveMQConnectionFactory connectionFactory = null;
    private final Object connectionMonitor = new Object();
    private TopicConnection connection = null;

    public ActiveMQConnection(final CollectorConfig config)
    {
        this.config = config;
        if (config.getActiveMQUri() != null) {
            this.connectionFactory = new ActiveMQConnectionFactory(config.getActiveMQUri());
            this.connectionFactory.setUseAsyncSend(true);
        }
    }

    @Override
    public void reconnect()
    {
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
    }

    @Override
    public EventQueueSession getSessionFor(final String type)
    {
        return new ActiveMQSession(config, this, type);
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
