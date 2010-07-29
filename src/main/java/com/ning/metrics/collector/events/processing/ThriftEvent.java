/*
 * Copyright 2010 Ning, Inc.
 *
 * Ning licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.ning.metrics.collector.events.processing;

import com.ning.serialization.ThriftEnvelope;
import com.ning.serialization.ThriftFieldListDeserializer;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TIOStreamTransport;
import org.joda.time.DateTime;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.UUID;

public class ThriftEvent implements java.io.Serializable
{
    public static final ThriftFieldListDeserializer DESERIALIZER = new ThriftFieldListDeserializer();

    private final byte[] payload;
    private final long timestamp;
    private final String eventType;
    private final UUID sourceUUID;

    public ThriftEvent(DateTime eventDate, String eventType, UUID sourceUUID, TBase thriftObject) throws TException, IOException
    {
        this.timestamp = eventDate.getMillis();
        if (eventType == null || sourceUUID == null) {
            throw new IllegalArgumentException("eventType and sourceUUID cannot be null");
        }
        this.eventType = eventType;
        this.sourceUUID = sourceUUID;

        if (thriftObject != null) {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            TProtocol protocol = new TBinaryProtocol(new TIOStreamTransport(out));

            thriftObject.write(protocol);
            protocol.getTransport().close();
            out.close();
            payload = out.toByteArray();
        }
        else {
            payload = null;
        }
    }

    public ThriftEnvelope getThriftEnvelope() throws TException
    {
        if (payload == null) {
            return null;
        }

        return new ThriftEnvelope(getEventType(), DESERIALIZER.readPayload(payload));
    }

    public String getEventType()
    {
        return eventType;
    }

    public UUID getSourceUUID()
    {
        return sourceUUID;
    }

    public long getTimestamp()
    {
        return timestamp;
    }

}
