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

package com.ning.metrics.collector.realtime;

import com.google.inject.Inject;
import com.ning.metrics.serialization.event.Event;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.weakref.jmx.Managed;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class EventListenerDispatcher
{
    public static final String NO_FILTER_KEY = "__ALL__";

    private static final Logger log = LoggerFactory.getLogger(EventListenerDispatcher.class);

    private final Map<String, NewEventListener> listeners = new ConcurrentHashMap<String, NewEventListener>();
    private final EventQueueProcessor activeMQController;

    @Inject
    public EventListenerDispatcher(final EventQueueProcessor activeMQController)
    {
        this.activeMQController = activeMQController;
    }

    public void addListener(final String eventKey, final NewEventListener listener)
    {
        log.info("Adding listener for " + eventKey);
        listeners.put(eventKey, listener);
    }

    public void stop()
    {
        activeMQController.stop();
    }

    public synchronized void offer(final Event event)
    {
        if (event == null) {
            return;
        }

        // We are still in the request thread, make sure to stay async here!

        if (activeMQController != null) {
            activeMQController.send(event);
        }

        final NewEventListener listener = listeners.get(event.getName());
        if (listener != null) {
            listener.onNewEvent(event);
        }

        final NewEventListener allListener = listeners.get(NO_FILTER_KEY);
        if (allListener != null) {
            allListener.onNewEvent(event);
        }
    }

    @Managed
    public int getNbOfListeners()
    {
        return listeners.size();
    }
}
