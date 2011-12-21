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
import org.skife.config.ConfigurationObjectFactory;
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
    private final static Logger log = Logger.getLogger(EventQueueProcessorImpl.class);

    private final ConfigurationObjectFactory configFactory;
    private final EventQueueConnection connection;
    private final AtomicBoolean enabled = new AtomicBoolean(false);
    private final AtomicBoolean isRunning = new AtomicBoolean(false);
    private final Map<String, LocalQueueAndWorkers> queuesPerCategory = new HashMap<String, LocalQueueAndWorkers>();
    private final Object queueMapMonitor = new Object();
    private final AtomicReference<Set<String>> typesToCollect = new AtomicReference<Set<String>>();
    private final GlobalEventQueueStats stats;
    private final EventFormatter eventFormatter;

    @Inject
    public EventQueueProcessorImpl(final ConfigurationObjectFactory configFactory,
            final CollectorConfig baseConfig,
            final EventQueueConnectionFactory factory, final GlobalEventQueueStats stats)
    {
        this.configFactory = configFactory;
        this.stats = stats;
        this.enabled.set(baseConfig.isActiveMQEnabled());

        final String typesStr = baseConfig.getActiveMQEventsToCollect();
        final Set<String> types = (typesStr == null) ? new HashSet<String>() : new HashSet<String>(Arrays.asList(typesStr.split("\\s*,\\s*")));

        this.typesToCollect.set(types);
        eventFormatter = new EventFormatter(baseConfig);

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
                // should these be reused? For now, assume there is no need (not often re-created)
                Map<String,String> replacements = new HashMap<String,String>();
                replacements.put("category", type);
                CollectorConfig config = configFactory.buildWithReplacements(CollectorConfig.class, replacements);
                
                synchronized (queueMapMonitor) {
                    queue = queuesPerCategory.get(type);
                    if (queue == null) {
                        EventQueueSession session = connection.getSessionFor(type, config);
                        queue = new LocalQueueAndWorkers(type, session, stats);
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

    @Managed(description = "Enables sending of events as ByteMessage (instead of TextMessage) for all topics")
    public void sendUsingBytesMessage()
    {
        log.info("Enabling 'setUseBytesMessage' (send all events as BytesMessage)");
        connection.setUseBytesMessage(true);
    }

    @Managed(description = "Enables sending of events as TextMessage (instead of ByteMessage) for all topics")
    public void sendUsingTextMessage()
    {
        log.info("Disabling 'setUseBytesMessage' (send all events as TextMessage)");
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
