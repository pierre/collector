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

package com.ning.metrics.collector.events.data;

import com.ning.metrics.collector.events.Event;
import com.ning.metrics.collector.util.Granularity;
import com.ning.metrics.collector.util.GranularityPathMapper;
import com.ning.serialization.ThriftEnvelope;
import com.ning.serialization.ThriftEnvelopeDeserializer;
import com.ning.serialization.ThriftEnvelopeSerializer;
import org.joda.time.DateTime;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.nio.ByteBuffer;

public class ThriftEnvelopeEvent implements Event
{
    private DateTime eventDateTime;
    private ThriftEnvelope thriftEnvelope;
    private Granularity granularity;
    private transient byte[] serializedBytes;
    private transient ThriftEnvelopeSerializer serializer = new ThriftEnvelopeSerializer();
    private transient ThriftEnvelopeDeserializer deserializer = new ThriftEnvelopeDeserializer();

    //required for deserialization
    @Deprecated
    public ThriftEnvelopeEvent()
    {
        eventDateTime = null;
        thriftEnvelope = null;
        granularity = null;
    }

    public ThriftEnvelopeEvent(DateTime eventDateTime, ThriftEnvelope thriftEnvelope, Granularity granularity)
    {
        this.eventDateTime = eventDateTime;
        this.thriftEnvelope = thriftEnvelope;
        this.granularity = granularity;
    }

    public ThriftEnvelopeEvent(DateTime eventDateTime, ThriftEnvelope thriftEnvelope)
    {
        this(eventDateTime, thriftEnvelope, Granularity.HOURLY);
    }

    @Override
    public DateTime getEventDateTime()
    {
        return eventDateTime;
    }

    @Override
    public String getName()
    {
        return thriftEnvelope.getTypeName();
    }

    @Override
    public String getVersion()
    {
        return thriftEnvelope.getVersion();
    }

    @Override
    public String getOutputDir(String prefix)
    {
        GranularityPathMapper pathMapper = new GranularityPathMapper(String.format("%s/%s", prefix, thriftEnvelope.getTypeName()), granularity);
        String outputPath = pathMapper.getPathForDateTime(getEventDateTime());

        return outputPath;
    }

    @Override
    public Object getData()
    {
        return thriftEnvelope;
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException
    {
        int numBytes = in.readInt();
        byte[] bytes = new byte[numBytes];

        in.readFully(bytes);

        eventDateTime = new DateTime(ByteBuffer.wrap(bytes).getLong(0));

        ByteArrayInputStream inputBuffer = new ByteArrayInputStream(bytes, 8, bytes.length - 8);

        deserializer.open(inputBuffer);
        thriftEnvelope = deserializer.deserialize(null);
        deserializer.close();
        granularity = (Granularity) in.readObject();
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException
    {
        toBytes();
        out.writeInt(serializedBytes.length);
        out.write(serializedBytes);
        out.writeObject(granularity);
    }

    @Override
    public void toBytes() throws IOException
    {
        if (serializedBytes == null) {
            ByteArrayOutputStream outputBuffer = new ByteArrayOutputStream();

            outputBuffer.write(ByteBuffer.allocate(8).putLong(eventDateTime.getMillis()).array());

            serializer.open(outputBuffer);
            serializer.serialize(thriftEnvelope);
            serializer.close();

            serializedBytes = outputBuffer.toByteArray();
        }
    }

}
