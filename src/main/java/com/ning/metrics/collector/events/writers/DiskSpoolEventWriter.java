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

package com.ning.metrics.collector.events.writers;

import com.google.inject.Inject;
import com.ning.metrics.collector.binder.annotations.DiskSpoolFlushExecutor;
import com.ning.metrics.collector.binder.annotations.HdfsEventWriter;
import com.ning.metrics.collector.binder.annotations.Managed;
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.endpoint.EventRate;
import com.ning.metrics.collector.events.Event;
import org.apache.log4j.Logger;
import org.joda.time.Period;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

public class DiskSpoolEventWriter implements EventWriter
{
    private static final Logger log = Logger.getLogger(DiskSpoolEventWriter.class);

    private final AtomicLong fileId = new AtomicLong(System.currentTimeMillis() * 1000000);
    private final AtomicBoolean flushEnabled;
    private final AtomicLong flushIntervalInSeconds;
    private final EventWriter hadoopEventWriter;
    private final int rateWindowSizeMinutes;
    private final SyncType syncType;
    private final File spoolDirectory;
    private final ScheduledExecutorService executor;
    private final File tmpSpoolDirectory;
    private final File quarantineDirectory;
    private final AtomicBoolean flushingToHadoop = new AtomicBoolean(false);
    private final AtomicLong eventSerializationFailures = new AtomicLong(0);
    private final EventRate writeRate;

    private volatile ObjectOutputter currentOutputter;
    private volatile File currentOutputFile;

    @Inject
    public DiskSpoolEventWriter(
        @HdfsEventWriter EventWriter hadoopFileEventWriter,
        @DiskSpoolFlushExecutor ScheduledExecutorService executor,
        CollectorConfig config
    )
    {
        this(hadoopFileEventWriter, config.getSpoolDirectoryName(), config.isFlushEnabled(), config.getFlushIntervalInSeconds(), executor, config.getSyncType(), config.getRateWindowSizeMinutes());
    }

    public DiskSpoolEventWriter(EventWriter hadoopFileEventWriter, String spoolPath, boolean flushEnabled, long flushIntervalInSeconds, ScheduledExecutorService executor, SyncType syncType, int rateWindowSizeMinutes)
    {
        this.hadoopEventWriter = hadoopFileEventWriter;
        this.rateWindowSizeMinutes = rateWindowSizeMinutes;
        this.syncType = syncType;
        this.spoolDirectory = new File(spoolPath);
        this.executor = executor;
        this.tmpSpoolDirectory = new File(spoolDirectory, "_tmp");
        this.quarantineDirectory = new File(spoolDirectory, "_quarantine");
        this.flushEnabled = new AtomicBoolean(flushEnabled);
        this.flushIntervalInSeconds = new AtomicLong(flushIntervalInSeconds);

        writeRate = new EventRate(Period.minutes(rateWindowSizeMinutes));

        createSpoolDir(spoolDirectory);
        createSpoolDir(tmpSpoolDirectory);
        createSpoolDir(quarantineDirectory);
        scheduleFlush();
        recoverFiles();
    }

    private void createSpoolDir(File dir)
    {
        if (!dir.exists() && !dir.mkdirs()) {
            log.error(String.format("unable to create spool directory %s", dir));
        }
    }

    private void recoverFiles()
    {
        //only call on startup
        for (File file : tmpSpoolDirectory.listFiles()) {
            renameFile(file, spoolDirectory);
        }
    }

    private void scheduleFlush()
    {
        executor.schedule(new Runnable()
        {
            @Override
            public void run()
            {
                try {
                    flushToPersisentWriter();
                }
                catch (Exception e) {
                    log.error("failed performing commit to hdfs", e);
                }
                finally {
                    long sleepSeconds = getSpooledFileList().isEmpty() || !flushEnabled.get() ? flushIntervalInSeconds.get() : 0;

                    log.info(String.format("sleeping %d seconds", sleepSeconds));
                    executor.schedule(this, sleepSeconds, TimeUnit.SECONDS);
                }
            }
        }, flushIntervalInSeconds.get(), TimeUnit.SECONDS);
    }

    //protected for overriding during unit tests
    protected List<File> getSpooledFileList()
    {
        List<File> spooledFileList = new ArrayList<File>();

        for (File file : spoolDirectory.listFiles()) {
            if (file.isFile()) {
                spooledFileList.add(file);
            }
        }

        return spooledFileList;
    }

    @Override
    public synchronized void write(Event event) throws IOException
    {
        if (currentOutputter == null) {
            currentOutputFile = new File(tmpSpoolDirectory, String.format("%d.thrift", fileId.incrementAndGet()));

            currentOutputter = ObjectOutputterFactory.createObjectOutputter(new FileOutputStream(currentOutputFile), syncType);
        }

        try {
            event.toBytes();
        }
        catch (RuntimeException e) {
            eventSerializationFailures.incrementAndGet();
            //noinspection AccessToStaticFieldLockedOnInstance
            log.warn("unable to serialize event", e);

            return;
        }
        catch (IOException e) {
            eventSerializationFailures.incrementAndGet();
            //noinspection AccessToStaticFieldLockedOnInstance
            log.warn("unable to serialize event", e);

            return;
        }

        currentOutputter.writeObject(event);
        writeRate.increment();
    }

    @Override
    public synchronized void commit() throws IOException
    {
        forceCommit();
    }

    @Override
    public synchronized void forceCommit() throws IOException
    {
        if (currentOutputFile != null) {
            currentOutputter.close();

            renameFile(currentOutputFile, spoolDirectory);

            currentOutputFile = null;
            currentOutputter = null;
        }
    }

    @Override
    public synchronized void rollback() throws IOException
    {
        if (currentOutputFile != null) {
            currentOutputter.close();

            renameFile(currentOutputFile, quarantineDirectory);

            currentOutputFile = null;
            currentOutputter = null;
        }
    }

    @Managed(description = "commit events to hdfs")
    public void flushToPersisentWriter() throws IOException
    {
        if (!flushingToHadoop.compareAndSet(false, true)) {
            return;
        }

        try {
            for (File file : getSpooledFileList()) {
                if (flushEnabled.get()) {
                    boolean fileSucceeded = false;

                    //noinspection NestedTryStatement
                    try {
                        ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));

                        while (objectInputStream.read() != -1) {
                            Event event = (Event) objectInputStream.readObject();
                            hadoopEventWriter.write(event);
                        }

                        objectInputStream.close();
                        hadoopEventWriter.forceCommit();

                        if (!file.delete()) {
                            log.warn(String.format("unable to cleanup file %s", file));
                        }

                        fileSucceeded = true;
                    }
                    catch (ClassNotFoundException e) {
                        log.warn(String.format("unable to deserialize objects in file %s and write to hadoop (quarantining to %s)", file, quarantineDirectory), e);
                    }
                    catch (IOException e) {
                        log.warn(String.format("Error transferring events from local disk spool to hadoop. Quarantining local file %s to directory %s", file, quarantineDirectory), e);
                    }
                    catch (RuntimeException e) {
                        log.warn(String.format("Unknown error transferring events from local disk spool to hadoop. Quarantining local file %s to directory %s", file, quarantineDirectory), e);
                    }
                    finally {
                        if (!fileSucceeded) {
                            renameFile(file, quarantineDirectory);
                            hadoopEventWriter.rollback();
                        }
                    }
                }
            }
        }
        finally {
            flushingToHadoop.set(false);
        }
    }

    @Managed(description = "enable/disable flushing to hdfs")
    public void setFlushEnabled(boolean enabled)
    {
        log.info(String.format("setting flush enabled to %b", enabled));
        flushEnabled.set(enabled);
    }

    @Managed(description = "check if hdfs flushing is enabled")
    public boolean getFlushEnabled()
    {
        return flushEnabled.get();
    }

    @Managed(description = "set the commit interval for next scheduled commit to hdfs in seconds")
    public void setFlushIntervalInSeconds(long seconds)
    {
        log.info(String.format("setting persistent flushing to %d seconds", seconds));
        flushIntervalInSeconds.set(seconds);
    }

    @Managed(description = "get the current commit interval to hdfs in seconds")
    public long getFlushIntervalInSeconds()
    {
        return flushIntervalInSeconds.get();
    }

    @Managed(description = "size in kilobytes of disk spool queue not yet written to hdfs")
    public long getDiskSpoolSize()
    {
        long size = 0;

        for (File file : getSpooledFileList()) {
            size += file.length();
        }

        return size / 1024;
    }

    @Managed(description = "size in kilobytes of quarantined data that could not be written to hdfs")
    public long getQuarantineSize()
    {
        long size = 0;

        for (File file : quarantineDirectory.listFiles()) {
            size += file.length();
        }

        return size / 1024;
    }

    @Managed(description = "attempt to process quarantined files")
    public synchronized void processQuarantinedFiles()
    {
        for (File file : quarantineDirectory.listFiles()) {
            if (file.isFile()) {
                File dest = new File(spoolDirectory, file.getName());

                if (!file.renameTo(dest)) {
                    log.info(String.format("error moving quarantined file %s to %s", file, dest));
                }
            }
        }
    }

    @Managed(description = "rate at which write() calls are succeeding to local disk")
    public long getWriteRate()
    {
        return writeRate.getRate() / rateWindowSizeMinutes;
    }

    @Managed(description = "count of events that could not be serialized from memory to disk")
    public long getEventSeralizationFailureCount()
    {
        return eventSerializationFailures.get();
    }

    private void renameFile(File srcFile, File destDir)
    {
        File destinationOutputFile = new File(destDir, srcFile.getName());

        if (!srcFile.renameTo(destinationOutputFile)) {
            String msg = String.format("unable to rename spool file %s to %s", srcFile, destinationOutputFile);
            log.error(msg);
        }
    }
}
