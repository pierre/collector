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
import com.google.inject.internal.Nullable;
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.serialization.util.Managed;
import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class ActiveMQControllerImpl implements ActiveMQController
{
    private static final Logger logger = Logger.getLogger(ActiveMQControllerImpl.class);

    private int messagesSent = 0;
    private int messagesRejected = 0;
    private int messagesDisallowed = 0;
    private int messagesDropped = 0;

    private final AtomicBoolean collectionEnabled = new AtomicBoolean(true);
    private final Set<String> eventsToCollect = new HashSet<String>();

    private ActiveMQSender activeMQSender;

    @Inject
    public ActiveMQControllerImpl(
        CollectorConfig config,
        @Nullable ActiveMQSender activeMQSender
    )
    {
        this(config.getActiveMQEventsToCollect() == null ? null : Arrays.asList(config.getActiveMQEventsToCollect().split(",")), activeMQSender);
    }

    public ActiveMQControllerImpl(
        List<String> eventsToCollect,
        ActiveMQSender activeMQSender
    )
    {
        if (eventsToCollect != null && !eventsToCollect.isEmpty()) {
            this.eventsToCollect.addAll(eventsToCollect);
        }
        this.activeMQSender = activeMQSender;
    }

    /**
     * Given a category and a message, send the message to a topic queue
     *
     * @param category message category, mapped to an ActiveMQ topic
     * @param message  human readable message to be sent
     */
    @Override
    public void offerEvent(String category, String message)
    {
        // Check if ActiveMQ has been configured
        if (activeMQSender == null) {
            logger.debug("Ignoring message, no ActiveMQSender configured");
            return;
        }

        // Check if the firehose is open.
        if (!collectionEnabled.get()) {
            logger.debug(String.format("Ignoring message [%s] [%s], collection disabled", category, message));
            messagesRejected++;
            return;
        }

        // Check if we have been configured to send this type of message
        if (!eventsToCollect.contains(category)) {
            logger.debug(String.format("Ignoring message [%s] [%s], event type not in [%s]", category, message, eventsToCollect.toString()));
            messagesDisallowed++;
            return;
        }

        // All systems check, go!
        if (activeMQSender.sendMessage(category, message)) {
            logger.debug(String.format("Successfully sent message: [%s] [%s]", category, message));
            messagesSent++;
        }
        else {
            logger.warn(String.format("Unable to send message to ActiveMQ, dropping event: [%s] [%s] and retrying to connect", category, message));
            messagesDropped++;
        }
    }

    @Managed(description = "get the number of messages successfully sent to ActiveMQ")
    public int getMessagesSent()
    {
        return messagesSent;
    }

    @Managed(description = "get the number of messages rejected (collection disabled)")
    public int getMessagesRejected()
    {
        return messagesRejected;
    }

    @Managed(description = "get the number of messages disallowed (event type not in the list of events allowed)")
    public int getMessagesDisallowed()
    {
        return messagesDisallowed;
    }

    @Managed(description = "get the number of messages dropped (not connected to ActiveMQ)")
    public int getMessagesDropped()
    {
        return messagesDropped;
    }

    @Managed(description = "forwards events to ActiveMQ")
    public void enableCollection()
    {
        collectionEnabled.set(true);
    }

    @Managed(description = "disable forwarding of events to ActiveMQ")
    public void disableCollection()
    {
        collectionEnabled.set(false);
    }

    @Managed(description = "add event type to collect")
    public void addEventTypeToCollect(String event)
    {
        if (!eventsToCollect.contains(event)) {
            eventsToCollect.add(event);
        }
    }

    @Managed(description = "remove event type to collect")
    public void removeEventTypeToCollect(String event)
    {
        if (eventsToCollect.contains(event)) {
            eventsToCollect.remove(event);
        }
    }

    @Managed(description = "list event types allowed to collect")
    public String getEventTypeToCollect()
    {
        return eventsToCollect.toString();
    }
}
