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

package com.ning.metrics.collector.events.processing;

import com.ning.metrics.collector.binder.config.CollectorConfig;
import org.apache.activemq.AlreadyClosedException;
import org.apache.activemq.ConnectionFailedException;
import org.apache.log4j.Logger;

import javax.jms.DeliveryMode;
import javax.jms.JMSException;
import javax.jms.TopicPublisher;
import javax.jms.TopicSession;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

public class ActiveMQSession implements EventQueueSession
{
    private static final Logger logger = Logger.getLogger(ActiveMQSession.class);

    private final CollectorConfig config;
    private final ActiveMQConnection connection;
    private final String topic;
    private final AtomicBoolean isRunning = new AtomicBoolean(false);
    private final Object sessionMonitor = new Object();
    private TopicSession session = null;
    private TopicPublisher publisher;

    public ActiveMQSession(CollectorConfig config, ActiveMQConnection connection, String topic)
    {
        this.config = config;
        this.connection = connection;
        this.topic = topic;
        reinit();
    }

    @Override
    public void close()
    {
        if (isRunning.get()) {
            synchronized (sessionMonitor) {
                isRunning.set(false);
                if (publisher != null) {
                    try {
                        publisher.close();
                    }
                    catch (JMSException ex) {
                        logger.warn(String.format("Got error while trying to close a producer for topic %s", topic), ex);
                    }
                    publisher = null;
                }
                if (session != null) {
                    try {
                        session.close();
                    }
                    catch (JMSException ex) {
                        logger.warn(String.format("Got error while trying to close a session for topic %s", topic), ex);
                    }
                    session = null;
                }
            }
        }
    }

    private void reinit()
    {
        synchronized (sessionMonitor) {
            close();
            while (!isRunning.get()) {
                try {
                    session = connection.createTopicSession();
                    publisher = session.createPublisher(session.createTopic(topic));
                    publisher.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
                    publisher.setTimeToLive(config.getMessagesTTLMilliseconds());
                    isRunning.set(true);
                }
                catch (JMSException ex) {
                    logger.debug(String.format("Got error while trying to get a session for topic %s", topic));
                }
            }
        }
    }

    private boolean shouldReinit(JMSException ex)
    {
        return (ex instanceof AlreadyClosedException) ||
            (ex instanceof javax.jms.IllegalStateException) ||
            (ex instanceof ConnectionFailedException) ||
            (ex.getCause() instanceof IOException);
    }

    @Override
    public void send(Object event)
    {
        if (isRunning.get()) {
            try {
                publisher.send(session.createTextMessage(event.toString()));
            }
            catch (JMSException ex) {
                if (shouldReinit(ex)) {
                    reinit();
                }
                else {
                    logger.debug(String.format("Got error while trying to send a message to topic %s", topic));
                }
            }
        }
    }
}
