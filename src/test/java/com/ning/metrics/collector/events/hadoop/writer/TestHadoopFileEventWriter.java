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

package com.ning.metrics.collector.events.hadoop.writer;

import com.google.inject.internal.ImmutableList;
import com.ning.metrics.serialization.event.Event;
import com.ning.metrics.serialization.event.ThriftEnvelopeEvent;
import com.ning.metrics.serialization.hadoop.HadoopThriftEnvelopeSerialization;
import com.ning.metrics.serialization.hadoop.HadoopThriftWritableSerialization;
import com.ning.metrics.serialization.thrift.ThriftEnvelope;
import com.ning.metrics.serialization.thrift.ThriftField;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.LocalFileSystem;
import org.apache.hadoop.fs.RawLocalFileSystem;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.Arrays;
import java.util.List;

public class TestHadoopFileEventWriter
{
    private File tempDir;
    private File finalDir;
    private HadoopFileEventWriter eventWriter;

    private static final Logger log = Logger.getLogger(TestHadoopFileEventWriter.class);

    @BeforeMethod(alwaysRun = true)
    void setup() throws IOException
    {
        tempDir = File.createTempFile("HadoopFileEventWriter", "local-temp", new File("/var/tmp"));

        if (!tempDir.delete() && !tempDir.mkdirs()) {
            throw new IOException(String.format("unable to mkdir %s", tempDir));
        }

        finalDir = File.createTempFile("HadoopFileEventWriter", "hdfs-final", new File("/var/tmp"));
        if (!finalDir.delete() && !finalDir.mkdirs()) {
            throw new IOException(String.format("unable to mkdir %s", finalDir));
        }


        FileSystem hadoopIsStupid = new RawLocalFileSystem();
        Configuration conf = new Configuration();
        conf.setStrings("io.serializations", HadoopThriftWritableSerialization.class.getName(), HadoopThriftEnvelopeSerialization.class.getName(), "org.apache.serialization.io.serializer.WritableSerialization");

        hadoopIsStupid.initialize(URI.create("testy://mctesterson"), conf);

        FileSystem fileSystem = new LocalFileSystem(hadoopIsStupid);

        eventWriter = new HadoopFileEventWriter(
            finalDir.getAbsolutePath(),
            tempDir.getAbsolutePath(),
            fileSystem,
            2,
            "10.0.0.1",
            8080
        );
    }

    @AfterMethod(alwaysRun = true)
    void teardown()
    {
        deleteDirectory(tempDir);
        deleteDirectory(finalDir);
    }

    @Test(groups = "fast")
    public void testRollback() throws Exception
    {
        eventWriter.write(createEvent("fuu1", "2009/01/01"));
        Assert.assertTrue(Arrays.equals(listTempDir(), new String[]{"fuu1"}));
        eventWriter.write(createEvent("fuu2", "2009/01/01"));
        Assert.assertTrue(Arrays.equals(listTempDir(), new String[]{"fuu1", "fuu2"}));
        eventWriter.rollback();
        Assert.assertEquals(finalDir.exists(), false);
    }

    @Test(groups = "fast")
    public void testMaxOpenStreamsExceeded() throws Exception
    {
        eventWriter.write(createEvent("fuu1", "2009/01/01"));
        Assert.assertTrue(Arrays.equals(listTempDir(), new String[]{"fuu1"}));
        eventWriter.write(createEvent("fuu2", "2009/01/01"));
        Assert.assertTrue(Arrays.equals(listTempDir(), new String[]{"fuu1", "fuu2"}));
        eventWriter.write(createEvent("fuu3", "2009/01/01"));
        Assert.assertTrue(Arrays.equals(listTempDir(), new String[]{"fuu1", "fuu2", "fuu3"}));
        eventWriter.forceCommit();

        String[] files = finalDir.list();

        Arrays.sort(files);
        Assert.assertTrue(Arrays.equals(files, new String[]{"fuu1", "fuu2", "fuu3"}));
    }

    private String[] listTempDir()
    {
        File dir = new File(tempDir, finalDir.getAbsolutePath());
        String[] files = dir.list();

        Arrays.sort(files);

        return files;
    }

    private Event createEvent(final String eventName, final String suffix)
    {
        return new ThriftEnvelopeEvent()
        {
            @Override
            public String getOutputDir(String prefix)
            {
                return String.format("%s/%s/%s", prefix, eventName, suffix);
            }

            @Override
            public Object getData()
            {
                List<ThriftField> thriftFieldList = new ImmutableList.Builder<ThriftField>()
                    .add(ThriftField.createThriftField("value", (short) 1))
                    .build();

                return new ThriftEnvelope(eventName, thriftFieldList);
            }
        };
    }

    private boolean deleteDirectory(File path)
    {
        if (path.exists()) {
            File[] files = path.listFiles();


            for (File file : files) {
                if (file.isDirectory()) {
                    deleteDirectory(file);
                }
                else {
                    if (file.delete()) {
                        log.warn(String.format("unable to delete file %s", file));
                    }
                }
            }
        }

        return (path.delete());
    }
}