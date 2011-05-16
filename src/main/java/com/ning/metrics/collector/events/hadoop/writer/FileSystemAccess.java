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

import com.google.inject.Inject;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class FileSystemAccess
{
    private final Configuration hdfsConfig;
    private final Class<? extends FileSystem> fsClass;
    private FileSystem fs = null;
    private final Object connectionLock = new Object();

    private static final long MIN_WAIT_TIME = 1000; // 1 second
    private static final long MAX_WAIT_TIME = 600000; // 10 minutes

    @Inject
    public FileSystemAccess(Configuration hdfsConfig)
    {
        this(hdfsConfig, FileSystem.class);
    }

    public FileSystemAccess(Configuration hdfsConfig, Class<? extends FileSystem> fsClass)
    {
        this.hdfsConfig = hdfsConfig;
        this.fsClass = fsClass;
    }

    public FileSystem get()
    {
        try {
            return getFileSystemSafe();
        }
        catch (IOException e) {
            long waitTime = MIN_WAIT_TIME;

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

                        if (waitTime <= MAX_WAIT_TIME / 2) {
                            waitTime *= 2;
                        }
                        else {
                            waitTime = MAX_WAIT_TIME;
                        }
                    }
                }
            }
        }
    }

    // throws an IOException if the current FileSystem isn't working
    private FileSystem getFileSystemSafe() throws IOException
    {
        try {
            fs.getFileStatus(new Path("/"));
            return fs;
        }
        catch (NullPointerException e) {
            throw new IOException("file system not initialized");
        }
    }

    private void setFileSystem() throws IOException
    {
        try {
            Method getMethod = fsClass.getMethod("get", Configuration.class);
            fs = (FileSystem) getMethod.invoke(null, hdfsConfig);
        }
        catch (NoSuchMethodException e) {
            throw new IOException(String.format("Class %s doesn't have a get method", fsClass), e);
        }
        catch (InvocationTargetException e) {
            throw new IOException(String.format("Got exception while accessing get method for class %s ", fsClass), e);
        }
        catch (IllegalAccessException e) {
            throw new IOException(String.format("Got exception while accessing get method for class %s ", fsClass), e);
        }
        catch (RuntimeException e) {
            throw new IOException(String.format("Got exception while accessing get method for class %s ", fsClass), e);
        }
    }
}
