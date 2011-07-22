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

package com.ning.metrics.collector.hadoop.processing;

import com.google.inject.Inject;
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.serialization.hadoop.FileSystemAccess;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.testng.Assert;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Guice(modules = ConfigTestModule.class)
public class TestHadoopWriterFactory
{
    @Inject
    CollectorConfig config;

    File spoolDirectory;
    File tmpDirectory;
    File lockDirectory;
    File quarantineDirectory;

    private final Map<String, File> hdfs = new HashMap<String, File>();
    private static final long CUTOFF_TIME = 1000;

    class NoWriteHadoopWriterFactory extends HadoopWriterFactory
    {
        public NoWriteHadoopWriterFactory(final FileSystemAccess hdfsAccess, final CollectorConfig config)
        {
            super(hdfsAccess, config);
            setCutoffTime(CUTOFF_TIME);
        }

        @Override
        protected void pushFileToHadoop(final File file, final String outputPath) throws IOException
        {
            hdfs.put(outputPath, file);
        }
    }

    // Poor man's way of ensuring that tests are run serially (conflicts with tmp spool dir)
    @Test(groups = "slow")
    public void testProcessLeftBelow() throws Exception
    {
        createSpoolHierarchy();
        testProcessLeftBelowFilesAllClean();
        tearDown();

        createSpoolHierarchy();
        testProcessLeftBelowFilesTooSoon();
        tearDown();

        createSpoolHierarchy();
        testProcessLeftBelowFilesWithFilesRemaining();
        tearDown();
    }

    private void testProcessLeftBelowFilesAllClean() throws Exception
    {
        final HadoopWriterFactory factory = new NoWriteHadoopWriterFactory(null, config);

        FileUtils.touch(new File(lockDirectory.getPath() + "/some_file_which_should_be_sent_1"));
        FileUtils.touch(new File(lockDirectory.getPath() + "/some_file_which_should_be_sent_2"));
        FileUtils.touch(new File(quarantineDirectory.getPath() + "/some_other_file_which_should_be_sent"));

        Assert.assertEquals(FileUtils.listFiles(spoolDirectory, FileFilterUtils.trueFileFilter(), FileFilterUtils.trueFileFilter()).size(), 3);
        Assert.assertTrue(spoolDirectory.exists());
        Assert.assertTrue(tmpDirectory.exists());
        Assert.assertTrue(lockDirectory.exists());
        Assert.assertTrue(quarantineDirectory.exists());

        Thread.sleep(2 * CUTOFF_TIME);
        factory.processLeftBelowFiles();

        // All files should have been sent
        Assert.assertFalse(spoolDirectory.exists());
        Assert.assertFalse(tmpDirectory.exists());
        Assert.assertFalse(lockDirectory.exists());
        Assert.assertFalse(quarantineDirectory.exists());

        // We could even test the mapping in HDFS here (with the keys)
        Assert.assertEquals(hdfs.values().size(), 3);
    }

    private void testProcessLeftBelowFilesTooSoon() throws Exception
    {
        final HadoopWriterFactory factory = new NoWriteHadoopWriterFactory(null, config);

        FileUtils.touch(new File(lockDirectory.getPath() + "/some_file_which_should_be_sent_1"));
        FileUtils.touch(new File(lockDirectory.getPath() + "/some_file_which_should_be_sent_2"));
        FileUtils.touch(new File(quarantineDirectory.getPath() + "/some_other_file_which_should_be_sent"));

        Assert.assertEquals(FileUtils.listFiles(spoolDirectory, FileFilterUtils.trueFileFilter(), FileFilterUtils.trueFileFilter()).size(), 3);
        Assert.assertTrue(spoolDirectory.exists());
        Assert.assertTrue(tmpDirectory.exists());
        Assert.assertTrue(lockDirectory.exists());
        Assert.assertTrue(quarantineDirectory.exists());

        // No sleep!
        factory.processLeftBelowFiles();

        // No file should have been sent
        Assert.assertEquals(FileUtils.listFiles(spoolDirectory, FileFilterUtils.trueFileFilter(), FileFilterUtils.trueFileFilter()).size(), 3);
        Assert.assertTrue(spoolDirectory.exists());
        Assert.assertTrue(tmpDirectory.exists());
        Assert.assertTrue(lockDirectory.exists());
        Assert.assertTrue(quarantineDirectory.exists());

        // We could even test the mapping in HDFS here (with the keys)
        Assert.assertEquals(hdfs.values().size(), 0);
    }

    public void testProcessLeftBelowFilesWithFilesRemaining() throws Exception
    {
        final HadoopWriterFactory factory = new NoWriteHadoopWriterFactory(null, config);

        FileUtils.touch(new File(tmpDirectory.getPath() + "/dont_touch_me"));
        FileUtils.touch(new File(lockDirectory.getPath() + "/some_file_which_should_be_sent_1"));
        FileUtils.touch(new File(lockDirectory.getPath() + "/some_file_which_should_be_sent_2"));
        FileUtils.touch(new File(quarantineDirectory.getPath() + "/some_other_file_which_should_be_sent"));

        Assert.assertEquals(FileUtils.listFiles(spoolDirectory, FileFilterUtils.trueFileFilter(), FileFilterUtils.trueFileFilter()).size(), 4);
        Assert.assertTrue(spoolDirectory.exists());
        Assert.assertTrue(tmpDirectory.exists());
        Assert.assertTrue(lockDirectory.exists());
        Assert.assertTrue(quarantineDirectory.exists());

        Thread.sleep(2 * CUTOFF_TIME);
        factory.processLeftBelowFiles();

        // The file in /_tmp should no have been sent
        Assert.assertEquals(FileUtils.listFiles(spoolDirectory, FileFilterUtils.trueFileFilter(), FileFilterUtils.trueFileFilter()).size(), 1);
        Assert.assertTrue(spoolDirectory.exists());
        Assert.assertTrue(tmpDirectory.exists());
        Assert.assertFalse(lockDirectory.exists());
        Assert.assertFalse(quarantineDirectory.exists());

        // We could even test the mapping in HDFS here (with the keys)
        Assert.assertEquals(hdfs.values().size(), 3);
    }

    private void createSpoolHierarchy()
    {
        final LocalSpoolManager spoolManager = new LocalSpoolManager(config, "FuuEvent", SerializationType.DEFAULT, null);

        final String spoolDirectoryPath = spoolManager.getSpoolDirectoryPath();
        spoolDirectory = new File(spoolDirectoryPath);
        tmpDirectory = new File(spoolDirectoryPath + "/_tmp");
        lockDirectory = new File(spoolDirectoryPath + "/_lock");
        quarantineDirectory = new File(spoolDirectoryPath + "/_quarantine");

        spoolDirectory.mkdirs();
        tmpDirectory.mkdir();
        lockDirectory.mkdir();
        quarantineDirectory.mkdir();
    }

    private void tearDown()
    {
        hdfs.clear();
        FileUtils.deleteQuietly(spoolDirectory);
    }
}
