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
package com.ning.metrics.collector.events.hadoop.writer;

import com.ning.metrics.serialization.hadoop.HadoopThriftEnvelopeSerialization;
import com.ning.metrics.serialization.hadoop.HadoopThriftWritableSerialization;
import com.ning.metrics.serialization.thrift.hadoop.TBooleanWritable;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.LocalFileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.RawLocalFileSystem;
import org.apache.hadoop.io.SequenceFile;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.net.URI;

public class LocalFileSystemAccess implements FileSystemAccess
{
    FileSystem fs = null;
    private static final Logger log = Logger.getLogger(TestHadoopFileEventWriter.class);

    public FileSystem getFileSystem() throws IOException
    {
        if (fs == null) {

            FileSystem hadoopIsStupid = new RawLocalFileSystem();
            Configuration conf = new Configuration();
            conf.setStrings("io.serializations", HadoopThriftWritableSerialization.class.getName(), HadoopThriftEnvelopeSerialization.class.getName(), "org.apache.hadoop.io.serializer.WritableSerialization");

            hadoopIsStupid.initialize(URI.create("testy://mctesterson"), conf);

            fs = new LocalFileSystem(hadoopIsStupid);
        }

        return fs;
    }

    @Override
    public SequenceFile.Writer getWriter(Path tmpOutputPath, Class writableClass, Class valueClass) throws IOException
    {
        FileSystem fsys = getFileSystem();
        return SequenceFile.createWriter(fsys, fsys.getConf(), tmpOutputPath, TBooleanWritable.class, valueClass, SequenceFile.CompressionType.BLOCK);
    }

    @Override
    public URI getUri()
    {
        try {
            return getFileSystem().getUri();
        }
        catch (IOException e) {
            log.warn("could not get URI",e);
            return URI.create("testy://mctesterson");
        }
    }

    @Override
    public boolean exists(Path path) throws IOException
    {
        return getFileSystem().exists(path);
    }

    @Override
    public boolean rename(Path sourcePath, Path destinationPath) throws IOException
    {
        return getFileSystem().rename(sourcePath, destinationPath);
    }

    @Override
    public boolean mkdirs(Path parent) throws IOException
    {
        return getFileSystem().mkdirs(parent);
    }

    @Override
    public boolean delete(Path path, boolean b) throws IOException
    {
        return getFileSystem().delete(path, b);
    }
}
