package com.ning.metrics.collector.events.hadoop.serialization;

import com.ning.metrics.serialization.thrift.hadoop.ThriftWritable;
import com.ning.metrics.serialization.thrift.hadoop.ThriftWritableDeserializer;
import com.ning.metrics.serialization.thrift.hadoop.ThriftWritableSerializer;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.io.serializer.Deserializer;
import org.apache.hadoop.io.serializer.Serialization;
import org.apache.hadoop.io.serializer.Serializer;
import org.apache.hadoop.util.ReflectionUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class HadoopThriftWritableSerialization implements Serialization<ThriftWritable>
{
    @Override
    public boolean accept(Class<?> c)
    {
        return ThriftWritable.class.isAssignableFrom(c);
    }

    static class HadoopThriftWritableDeserializer extends Configured implements Deserializer<ThriftWritable>
    {
        private Class<?> writableClass;
        private final ThriftWritableDeserializer delegate;

        private HadoopThriftWritableDeserializer(Class<?> c)
        {
            delegate = new ThriftWritableDeserializer();
            writableClass = c;
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
        public ThriftWritable deserialize(ThriftWritable writable) throws IOException
        {
            if (writable == null) {
                writable = (ThriftWritable) ReflectionUtils.newInstance(writableClass, getConf());
            }
            return delegate.deserialize(writable);
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

    static class HadoopThriftWritableSerializer implements Serializer<ThriftWritable>
    {
        private final ThriftWritableSerializer delegate;

        private HadoopThriftWritableSerializer()
        {
            delegate = new ThriftWritableSerializer();
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
        public void serialize(ThriftWritable thriftWritable) throws IOException
        {
            delegate.serialize(thriftWritable);
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
    public Deserializer<ThriftWritable> getDeserializer(Class<ThriftWritable> c)
    {
        return new HadoopThriftWritableDeserializer(c);
    }

    @Override
    public Serializer<ThriftWritable> getSerializer(Class<ThriftWritable> c)
    {
        return new HadoopThriftWritableSerializer();
    }
}

