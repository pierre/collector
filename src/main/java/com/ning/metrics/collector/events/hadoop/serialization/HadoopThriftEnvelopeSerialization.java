/*
 * Copyright 2010 Ning, Inc.
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

package com.ning.metrics.collector.events.hadoop.serialization;

import com.ning.metrics.serialization.thrift.ThriftEnvelope;
import com.ning.metrics.serialization.thrift.ThriftEnvelopeDeserializer;
import com.ning.metrics.serialization.thrift.ThriftEnvelopeSerializer;
import org.apache.hadoop.io.serializer.Deserializer;
import org.apache.hadoop.io.serializer.Serialization;
import org.apache.hadoop.io.serializer.Serializer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class HadoopThriftEnvelopeSerialization implements Serialization<ThriftEnvelope>
{
    @Override
    public boolean accept(Class<?> c)
    {
        return ThriftEnvelope.class.isAssignableFrom(c);
    }

    private static class HadoopThriftEnvelopeDeserializer implements Deserializer<ThriftEnvelope>
    {
        private final ThriftEnvelopeDeserializer delegate;

        private HadoopThriftEnvelopeDeserializer()
        {
            delegate = new ThriftEnvelopeDeserializer();
        }

        /**
         * <p>Prepare the deserializer for reading.</p>
         */
        @Override
        public void open(InputStream in) throws IOException
        {
            delegate.open(in);
        }

        /**
         * <p>
         * Deserialize the next object from the underlying input stream.
         * If the object <code>t</code> is non-null then this deserializer
         * <i>may</i> set its internal state to the next object read from the input
         * stream. Otherwise, if the object <code>t</code> is null a new
         * deserialized object will be created.
         * </p>
         *
         * @return the deserialized object
         */
        @Override
        public ThriftEnvelope deserialize(ThriftEnvelope thriftEnvelope) throws IOException
        {
            return delegate.deserialize(thriftEnvelope);
        }

        /**
         * <p>Close the underlying input stream and clear up any resources.</p>
         */
        @Override
        public void close() throws IOException
        {
            delegate.close();
        }
    }

    private static class HadoopThriftEnvelopeSerializer implements Serializer<ThriftEnvelope>
    {
        private final ThriftEnvelopeSerializer delegate;

        private HadoopThriftEnvelopeSerializer()
        {
            delegate = new ThriftEnvelopeSerializer();
        }

        /**
         * <p>Prepare the serializer for writing.</p>
         */
        @Override
        public void open(OutputStream out) throws IOException
        {
            delegate.open(out);
        }

        /**
         * <p>Serialize <code>t</code> to the underlying output stream.</p>
         */
        @Override
        public void serialize(ThriftEnvelope thriftEnvelope) throws IOException
        {
            delegate.serialize(thriftEnvelope);
        }

        /**
         * <p>Close the underlying output stream and clear up any resources.</p>
         */
        @Override
        public void close() throws IOException
        {
            delegate.close();
        }
    }

    @Override
    public Deserializer<ThriftEnvelope> getDeserializer(Class<ThriftEnvelope> c)
    {
        return new HadoopThriftEnvelopeDeserializer();
    }

    @Override
    public Serializer<ThriftEnvelope> getSerializer(Class<ThriftEnvelope> c)
    {
        return new HadoopThriftEnvelopeSerializer();
    }
}

