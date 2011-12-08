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
import com.mogwee.executors.FailsafeScheduledExecutor;
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.serialization.event.Event;
import org.apache.log4j.Logger;
import org.weakref.jmx.Managed;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class EventQueueProcessorImpl implements EventQueueProcessor
{
    private final Logger log = Logger.getLogger(EventQueueProcessorImpl.class);
    private final CollectorConfig config;
    private final EventQueueConnection connection;
    private final AtomicBoolean enabled = new AtomicBoolean(false);
    private final AtomicBoolean isRunning = new AtomicBoolean(false);
    private final Map<String, LocalQueueAndWorkers> queuesPerCategory = new HashMap<String, LocalQueueAndWorkers>();
    private final Object queueMapMonitor = new Object();
    private final AtomicReference<Set<String>> typesToCollect = new AtomicReference<Set<String>>();
    private final GlobalEventQueueStats stats;
    private final EventFormatter eventFormatter;

    @Inject
    public EventQueueProcessorImpl(final CollectorConfig config, final EventQueueConnectionFactory factory, final GlobalEventQueueStats stats)
    {
        this.config = config;
        this.stats = stats;
        this.enabled.set(config.isActiveMQEnabled());

        final String typesStr = config.getActiveMQEventsToCollect();
        final Set<String> types = typesStr == null ? new HashSet<String>() : new HashSet<String>(Arrays.asList(typesStr.split("\\s*,\\s*")));

        this.typesToCollect.set(types);
        eventFormatter = new EventFormatter(config);

        this.connection = factory.createConnection();
        final Executor executor = new FailsafeScheduledExecutor(1, "EventQueueProcessorImpl");
        executor.execute(new Runnable()
        {
            @Override
            public void run()
            {
                start();
            }
        });
    }

    void start()
    {
        if (enabled.get() && connection != null) {
            connection.reconnect();
            isRunning.set(true);
        }
    }

    @Override
    public boolean isRunning()
    {
        return isRunning.get();
    }

    @Override
    public void stop()
    {
        if (isRunning.getAndSet(false)) {
            for (final LocalQueueAndWorkers queue : queuesPerCategory.values()) {
                queue.close();
            }
            queuesPerCategory.clear();
            connection.close();
        }
    }

    @Override
    public void send(final Event event)
    {
        if (event != null && isRunning.get() && typesToCollect.get().contains(event.getName())) {
            final String type = event.getName();
            LocalQueueAndWorkers queue = queuesPerCategory.get(type);

            if (queue == null) {
                synchronized (queueMapMonitor) {
                    queue = queuesPerCategory.get(type);
                    if (queue == null) {
                        queue = new LocalQueueAndWorkers(config, type, connection.getSessionFor(type), stats);
                        queuesPerCategory.put(type, queue);
                    }
                }
            }
            queue.offer(eventFormatter.getFormattedEvent(event));
        }
        else {
            stats.registerEventIgnored();
        }
    }

    @Managed(description = "whether forwarding events to the queue is enabled")
    public boolean isEnabled()
    {
        return enabled.get();
    }

    @Managed(description = "forwards events to the queue")
    public void enable()
    {
        if (!enabled.getAndSet(true)) {
            start();
        }
    }

    @Managed(description = "disable forwarding of events to the queue")
    public void disable()
    {
        if (enabled.getAndSet(false)) {
            stop();
        }
    }

    @Managed(description = "Enables sending of events as ByteMessage (instead of TextMessage)")
    public void sendUsingBytesMessage()
    {
        connection.setUseBytesMessage(true);
    }

    @Managed(description = "Enables sending of events as TextMessage (instead of ByteMessage)")
    public void sendUsingTextMessage()
    {
        connection.setUseBytesMessage(false);
    }
    
    @Managed(description = "add event type to collect")
    public void addTypeToCollect(final String event)
    {
        final Set<String> events = typesToCollect.get();

        if (events.add(event)) {
            typesToCollect.set(events);
            log.info(String.format("Added event type '%s' to list of events to send to the queue", event));
        }
    }

    @Managed(description = "remove event type to collect")
    public void removeTypeToCollect(final String event)
    {
        final Set<String> events = typesToCollect.get();

        if (events.remove(event)) {
            typesToCollect.set(events);
            log.info(String.format("Removed event type '%s' from list of events to send to the queue", event));
        }
    }

    @Managed(description = "list event types allowed to collect")
    public String getTypesToCollect()
    {
        return typesToCollect.get().toString();
    }
}
