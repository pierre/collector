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
import com.ning.metrics.goodwill.access.CachingGoodwillAccessor;
import com.ning.metrics.goodwill.access.GoodwillSchema;
import com.ning.metrics.goodwill.access.GoodwillSchemaField;
import com.ning.metrics.serialization.event.Event;
import com.ning.metrics.serialization.thrift.ThriftEnvelope;
import com.ning.metrics.serialization.thrift.ThriftField;
import com.ning.metrics.serialization.thrift.item.DataItem;
import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.JsonNodeFactory;
import org.codehaus.jackson.node.ObjectNode;
import org.weakref.jmx.Managed;

import java.io.IOException;
import java.io.OutputStream;
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
    private final ObjectMapper jsonMapper = new ObjectMapper();
    private final Logger log = Logger.getLogger(EventQueueProcessorImpl.class);
    private final CollectorConfig config;
    private final EventQueueConnection connection;
    private final AtomicBoolean enabled = new AtomicBoolean(false);
    private final AtomicBoolean isRunning = new AtomicBoolean(false);
    private final Map<String, LocalQueueAndWorkers> queuesPerCategory = new HashMap<String, LocalQueueAndWorkers>();
    private final Object queueMapMonitor = new Object();
    private final AtomicReference<Set<String>> typesToCollect = new AtomicReference<Set<String>>();
    private final EventQueueStats stats;
    private CachingGoodwillAccessor goodwillAccessor = null;

    @Inject
    public EventQueueProcessorImpl(CollectorConfig config, EventQueueConnectionFactory factory, EventQueueStats stats)
    {
        this.config = config;
        this.stats = stats;
        this.enabled.set(config.isActiveMQEnabled());

        String typesStr = config.getActiveMQEventsToCollect();
        Set<String> types = (typesStr == null ? new HashSet<String>() : new HashSet<String>(Arrays.asList(typesStr.split("\\s*,\\s*"))));

        this.typesToCollect.set(types);

        if (config.isGoodwillEnabled()) {
            goodwillAccessor = new CachingGoodwillAccessor(config.getGoodwillHost(), config.getGoodwillPort(), config.getGoodwillCacheTimeout());
        }

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
    public void send(Event event)
    {
        if (event != null && isRunning.get() && typesToCollect.get().contains(event.getName())) {
            String type = event.getName();
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
            queue.offer(getMessageForActiveMQ(event));
        }
        else {
            stats.registerEventIgnored();
        }
    }

    /**
     * Given en Event, create a message for ActiveMQ. This will generate JSON if Goodwill integration is enabled and
     * it knows about the event.
     *
     * @param event event to format
     * @return Object suited for AMQ
     */
    private Object getMessageForActiveMQ(Event event)
    {
        String amqMessage = null;

        if (goodwillAccessor != null) {
            GoodwillSchema schema = goodwillAccessor.getSchema(event.getName());
            if (schema != null) {
                amqMessage = eventToJson(event, schema);
            }
        }

        if (amqMessage == null) {
            amqMessage = event.getData().toString();
        }

        return amqMessage;
    }

    /**
     * Transform an Event to a Json String. We could have extracted this into the Event interface, but it requires
     * a dependency on Goodwill-access for Thrift. Suboptimal.
     *
     * @param event  Event to transform
     * @param schema Goodwill schema
     * @return String (Json) representation of the event
     */
    private String eventToJson(Event event, GoodwillSchema schema)
    {
        if (event.getData() instanceof JsonNode) {
            // Probably a Smile event, nothing to do
            try {
                return jsonMapper.writeValueAsString(event.getData());
            }
            catch (IOException e) {
                // Ignore, see default catch-all below
                log.debug("Got IOException trying to serialize JsonNode", e);
            }
        }
        else if (event.getData() instanceof OutputStream) {
            // SmileBucketEvent maybe?
            try {
                return jsonMapper.writeValueAsString(event.getData());
            }
            catch (IOException e) {
                // Ignore, see default catch-all below
                log.debug("Got IOException trying to serialize stream", e);
            }
        }
        else if (event.getData() instanceof ThriftEnvelope) {
            // Thrift!
            try {
                ThriftEnvelope envelope = (ThriftEnvelope) event.getData();
                short i = 1;
                ObjectNode root = JsonNodeFactory.instance.objectNode();

                for (ThriftField field : envelope.getPayload()) {
                    GoodwillSchemaField goodwillSchemaField = schema.getFieldByPosition(i);
                    if (goodwillSchemaField == null) {
                        throw new IOException(String.format("Unable to find schema field for %s", field));
                    }
                    addToRoot(root, field.getDataItem(), goodwillSchemaField);
                    i++;
                }

                return jsonMapper.writeValueAsString(root);
            }
            catch (IOException e) {
                // Ignore, see default catch-all below
                log.debug("Got IOException trying to serialize Thrift envelope", e);
            }
        }

        // Default to toString
        return event.getData().toString();
    }

    private void addToRoot(ObjectNode root, DataItem dataItem, GoodwillSchemaField goodwillSchemaField)
    {
        switch (goodwillSchemaField.getType()) {
            case BOOLEAN:
                root.put(goodwillSchemaField.getName(), dataItem.getBoolean());
                break;
            case BYTE:
                root.put(goodwillSchemaField.getName(), dataItem.getByte());
                break;
            case SHORT:
            case INTEGER:
                root.put(goodwillSchemaField.getName(), dataItem.getInteger());
                break;
            case LONG:
                root.put(goodwillSchemaField.getName(), dataItem.getLong());
                break;
            case DOUBLE:
                root.put(goodwillSchemaField.getName(), dataItem.getDouble());
                break;
            case DATE:
            case IP:
            case STRING:
            default:
                root.put(goodwillSchemaField.getName(), dataItem.getString());
                break;
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
