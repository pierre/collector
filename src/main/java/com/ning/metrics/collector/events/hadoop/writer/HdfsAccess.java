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

import com.ning.metrics.serialization.thrift.hadoop.TBooleanWritable;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.SequenceFile;

import java.io.IOException;
import java.net.URI;
import java.util.concurrent.atomic.AtomicBoolean;

// the important parts are copypasta of ning.analytics.event.export.HdfsAccess from event-export

public class HdfsAccess implements FileSystemAccess
{
    private final Configuration hdfsConfig;
    private FileSystem fs = null;
    private final Object connectionLock = new Object();

    private final long minWaitTime = 1000; // 1 second
    private final long maxWaitTime = 600000; // 10 minutes

    public HdfsAccess(Configuration hdfsConfig)
    {
        this.hdfsConfig = hdfsConfig;
    }

    public SequenceFile.Writer getWriter(Path tmpOutputPath, Class writeableClass, Class valueClass) throws IOException
    {
        FileSystem fsys = getFileSystem();
        return SequenceFile.createWriter(fsys, fsys.getConf(), tmpOutputPath, TBooleanWritable.class, valueClass, SequenceFile.CompressionType.BLOCK);
    }

    public URI getUri()
    {
        return getFileSystem().getUri();
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


    private FileSystem getFileSystem()
    {
        try {
            return getFileSystemSafe();
        }
        catch (IOException e) {
            long waitTime = minWaitTime;

            synchronized (connectionLock) {
                while (true) {
                    try {
                        // try to set up the FileSystem
                        setFileSystem();
                        return getFileSystemSafe();
                    }
                    catch (IOException e1) {
                        // exp backoff
                        try {
                            Thread.sleep(waitTime);
                        }
                        catch (InterruptedException e2) {
                            e2.printStackTrace();
                        }

                        if (waitTime <= maxWaitTime / 2) {
                            waitTime *= 2;
                        }
                        else {
                            waitTime = maxWaitTime;
                        }
                    }
                }
            }
        }
    }

    // throws an IOException if the current FileSystem isn't working
    private FileSystem getFileSystemSafe() throws IOException
    {
        fs.getFileStatus(new Path("/"));
        return fs;
    }

    private void setFileSystem() throws IOException
    {
        fs = FileSystem.get(hdfsConfig);
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }
}
