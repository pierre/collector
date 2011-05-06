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

import com.google.inject.Inject;
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.util.NamedThreadFactory;
import org.apache.log4j.Logger;
import org.weakref.jmx.Managed;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
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
    private final EventQueueStats stats;

    @Inject
    public EventQueueProcessorImpl(CollectorConfig config, EventQueueConnectionFactory factory, EventQueueStats stats)
    {
        this.config = config;
        this.stats = stats;
        this.enabled.set(config.isActiveMQEnabled());

        String typesStr = config.getActiveMQEventsToCollect();
        Set<String> types = (typesStr == null ? new HashSet<String>() : new HashSet<String>(Arrays.asList(typesStr.split("\\s*,\\s*"))));

        this.typesToCollect.set(types);
        this.connection = factory.createConnection();
        ScheduledExecutorService executor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("EventQueueProcessorImpl"));
        executor.execute(new Runnable()
        {
            @Override
            public void run()
            {
                start();
            }
        });
    }

    public void start()
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
            for (LocalQueueAndWorkers queue : queuesPerCategory.values()) {
                queue.close();
            }
            queuesPerCategory.clear();
            connection.close();
        }
    }

    @Override
    public void send(String type, Object event)
    {
        if (event != null && isRunning.get() && typesToCollect.get().contains(type)) {
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
            queue.offer(event);
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

    @Managed(description = "add event type to collect")
    public void addTypeToCollect(String event)
    {
        Set<String> events = typesToCollect.get();

        if (events.add(event)) {
            typesToCollect.set(events);
            log.info(String.format("Added event type '%s' to list of events to send to the queue", event));
        }
    }

    @Managed(description = "remove event type to collect")
    public void removeTypeToCollect(String event)
    {
        Set<String> events = typesToCollect.get();

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
