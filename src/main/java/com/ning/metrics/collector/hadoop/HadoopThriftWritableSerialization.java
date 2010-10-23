package com.ning.metrics.collector.hadoop;

import com.ning.serialization.ThriftWritable;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.io.serializer.Deserializer;
import org.apache.hadoop.io.serializer.Serialization;
import org.apache.hadoop.io.serializer.Serializer;
import org.apache.hadoop.util.ReflectionUtils;

import java.io.DataInputStream;
import java.io.DataOutputStream;
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

    static class ThriftWritableDeserializer extends Configured implements Deserializer<ThriftWritable>
    {
        private Class<?> writableClass;
        private DataInputStream dataIn;

        public ThriftWritableDeserializer(Class<?> c)
        {
            this.writableClass = c;
        }

        public void open(InputStream in)
        {
            if (in instanceof DataInputStream) {
                dataIn = (DataInputStream) in;
            }
            else {
                dataIn = new DataInputStream(in);
            }
        }

        public ThriftWritable deserialize(ThriftWritable w) throws IOException
        {
            ThriftWritable writable;
            if (w == null) {
                writable = (ThriftWritable) ReflectionUtils.newInstance(writableClass, getConf());
            }
            else {
                writable = w;
            }
            writable.readFields(dataIn);
            return writable;
        }

        public void close() throws IOException
        {
            dataIn.close();
        }
    }

    static class ThriftWritableSerializer implements Serializer<ThriftWritable>
    {
        private DataOutputStream dataOut;

        public void open(OutputStream out)
        {
            if (out instanceof DataOutputStream) {
                dataOut = (DataOutputStream) out;
            }
            else {
                dataOut = new DataOutputStream(out);
            }
        }

        public void serialize(ThriftWritable w) throws IOException
        {
            w.write(dataOut);
        }

        public void close() throws IOException
        {
            dataOut.close();
        }
    }

    @Override
    public Deserializer<ThriftWritable> getDeserializer(Class<ThriftWritable> c)
    {
        return new ThriftWritableDeserializer(c);
    }

    @Override
    public Serializer<ThriftWritable> getSerializer(Class<ThriftWritable> c)
    {
        return new ThriftWritableSerializer();
    }
}

