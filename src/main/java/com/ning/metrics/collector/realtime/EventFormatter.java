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

import com.ning.metrics.collector.binder.config.CollectorConfig;
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

import java.io.IOException;
import java.io.OutputStream;

public class EventFormatter
{
    private final Logger log = Logger.getLogger(EventFormatter.class);

    private final ObjectMapper jsonMapper = new ObjectMapper();
    private final CachingGoodwillAccessor goodwillAccessor;

    public EventFormatter(final CollectorConfig config)
    {
        if (config.isGoodwillEnabled()) {
            goodwillAccessor = new CachingGoodwillAccessor(config.getGoodwillHost(), config.getGoodwillPort(), config.getGoodwillCacheTimeout());
        }
        else {
            goodwillAccessor = null;
        }
    }

    /**
     * Given en Event, create a message for realtime listeners/publishers. This will generate JSON if Goodwill integration is enabled and
     * it knows about the event.
     *
     * @param event event to format
     * @return Object suited for AMQ/Atmosphere
     */
    public Object getFormattedEvent(final Event event)
    {
        String message = null;

        if (goodwillAccessor != null) {
            final GoodwillSchema schema = goodwillAccessor.getSchema(event.getName());
            if (schema != null) {
                message = eventToJson(event, schema);
            }
        }

        if (message == null) {
            message = event.getData().toString();
        }

        return message;
    }

    /**
     * Transform an Event to a Json String. We could have extracted this into the Event interface, but it requires
     * a dependency on Goodwill-access for Thrift. Suboptimal.
     *
     * @param event  Event to transform
     * @param schema Goodwill schema
     * @return String (Json) representation of the event
     */
    private String eventToJson(final Event event, final GoodwillSchema schema)
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
                final ThriftEnvelope envelope = (ThriftEnvelope) event.getData();
                short i = 1;
                final ObjectNode root = JsonNodeFactory.instance.objectNode();

                for (final ThriftField field : envelope.getPayload()) {
                    final GoodwillSchemaField goodwillSchemaField = schema.getFieldByPosition(i);
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

    private void addToRoot(final ObjectNode root, final DataItem dataItem, final GoodwillSchemaField goodwillSchemaField)
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
}
