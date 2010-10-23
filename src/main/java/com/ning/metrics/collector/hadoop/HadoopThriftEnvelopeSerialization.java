package com.ning.metrics.collector.hadoop;

import com.ning.serialization.ThriftEnvelope;
import com.ning.serialization.ThriftEnvelopeDeserializer;
import com.ning.serialization.ThriftEnvelopeSerializer;
import org.apache.hadoop.io.serializer.Deserializer;
import org.apache.hadoop.io.serializer.Serialization;
import org.apache.hadoop.io.serializer.Serializer;

public class HadoopThriftEnvelopeSerialization implements Serialization<ThriftEnvelope>
{
    @Override
    public boolean accept(Class<?> c)
    {
        return ThriftEnvelope.class.isAssignableFrom(c);
    }

    @Override
    public Deserializer<ThriftEnvelope> getDeserializer(Class<ThriftEnvelope> c)
    {
        return (Deserializer<ThriftEnvelope>) new ThriftEnvelopeDeserializer();
    }

    @Override
    public Serializer<ThriftEnvelope> getSerializer(Class<ThriftEnvelope> c)
    {
        return (Serializer<ThriftEnvelope>) new ThriftEnvelopeSerializer();
    }
}

