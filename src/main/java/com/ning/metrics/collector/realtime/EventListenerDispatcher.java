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

import java.util.concurrent.ConcurrentLinkedQueue;

public class EventListenerDispatcher
{
    private final ConcurrentLinkedQueue<NewEventListener> listeners = new ConcurrentLinkedQueue<NewEventListener>();
    private final EventQueueProcessor activeMQController;

    @Inject
    public EventListenerDispatcher(final EventQueueProcessor activeMQController)
    {
        this.activeMQController = activeMQController;
    }

    public void addListener(final NewEventListener listener)
    {
        listeners.add(listener);
    }

    public void removeListener(final NewEventListener listener)
    {
        listeners.remove(listener);
    }

    public void stop()
    {
        activeMQController.stop();
    }

    public void offer(final Event event)
    {
        if (event == null) {
            return;
        }

        if (activeMQController != null) {
            activeMQController.send(event);
        }

        for (final NewEventListener listener : listeners) {
            listener.onNewEvent(event);
        }
    }
}
