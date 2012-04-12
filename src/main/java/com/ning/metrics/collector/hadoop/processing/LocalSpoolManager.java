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

import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.serialization.event.Granularity;
import com.ning.metrics.serialization.event.GranularityPathMapper;
import org.apache.axis.utils.StringUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.io.File;
import java.io.FileFilter;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Utility class to manage local spools
 */
class LocalSpoolManager
{
    private static final Logger log = Logger.getLogger(LocalSpoolManager.class);

    private static final Pattern filenamePattern = Pattern.compile("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}-\\d{1,5}-[a-zA-Z0-9]{4}-(\\d{4}-\\d{2}-\\d{2}T\\d{2}.\\d{2}.\\d{2}.\\d{3})\\.[a-zA-Z0-9]*\\.[a-zA-Z]*");

    // Can't use : in the pattern - Hadoop chokes on it when building the .crc Path
    protected static final DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH.mm.ss.SSS").withZone(DateTimeZone.UTC);

    private final CollectorConfig config;
    private String eventName;
    private SerializationType serializationType;
    private String hdfsDir;
    private ReadableDateTime timeStamp;

    public static Collection<File> findOldSpoolDirectories(final String basePath, final long cutoff)
    {
        final Collection<File> files = new java.util.LinkedList<File>();
        // Candidates ("old") directories are the ones last modified more than 2 hours ago
        final File[] found = new File(basePath).listFiles((FileFilter) FileFilterUtils.and(FileFilterUtils.directoryFileFilter(), FileFilterUtils.ageFileFilter(System.currentTimeMillis() - cutoff, true)));

        // Can't use FileUtils.listFiles as it doesn't yield directories
        if (found != null) {
            for (final File file : found) {
                if (file.isDirectory()) {
                    files.add(file);
                }
            }
        }

        return files;
    }

    public static Collection<File> findFilesInSpoolDirectory(final File spoolDirectory)
    {
        if (!spoolDirectory.isDirectory()) {
            log.warn("Asked to find files in spool directory but [" + spoolDirectory + "] is not a directory!");
            return null;
        }
        return FileUtils.listFiles(spoolDirectory, FileFilterUtils.trueFileFilter(), FileFilterUtils.notFileFilter(FileFilterUtils.nameFileFilter("_tmp")));
    }

    public static void cleanupOldSpoolDirectories(final Iterable<File> oldSpoolDirectories)
    {
        // Cleanup empty directories /_tmp, /_quarantine and /_lock first
        for (final File dir : oldSpoolDirectories) {
            for (final File subDir : dir.listFiles()) {
                if (subDir.isDirectory() && subDir.listFiles().length == 0) {
                    log.info(String.format("Deleting empty directory: %s", subDir.toString()));
                    FileUtils.deleteQuietly(subDir);
                }
            }
        }

        for (final File dir : oldSpoolDirectories) {
            if (dir.isDirectory() && dir.listFiles().length == 0) {
                log.info(String.format("Deleting empty directory: %s", dir.toString()));
                FileUtils.deleteQuietly(dir);
            }
        }
    }

    /**
     * Main constructor on the way in (to Hadoop)
     *
     * @param config            Configuration object
     * @param eventName         event name
     * @param serializationType event serialization type
     * @param hdfsDir           directory name in HDFS where the event will end up
     */
    public LocalSpoolManager(final CollectorConfig config, final String eventName, final SerializationType serializationType, final String hdfsDir)
    {
        this.config = config;
        this.eventName = eventName;
        this.serializationType = serializationType;
        this.hdfsDir = hdfsDir;
        this.timeStamp = new DateTime();
    }

    /**
     * Constructor for the Left Below usecase (restarts)
     *
     * @param config    Configuration object
     * @param directory Spool directory
     * @throws IllegalArgumentException if the directory is not valid
     */
    public LocalSpoolManager(final CollectorConfig config, final File directory) throws IllegalArgumentException
    {
        this.config = config;
        reverseEngineerFilename(directory.getName());
    }

    /**
     * Given a filename, find the timeStamp, eventName and serializationType
     *
     * @param directoryName directory candidate
     * @throws IllegalArgumentException if the directory is not valid
     */
    private void reverseEngineerFilename(final String directoryName) throws IllegalArgumentException
    {
        // directoryName is like 127.0.0.1-8080-pYb2-2011-05-27T15.42.03.586.FrontDoorVisit.smile
        final String[] directoryTokens = StringUtils.split(directoryName, '.');
        if (directoryTokens.length < 3) {
            throw new IllegalArgumentException();
        }
        final Matcher m = filenamePattern.matcher(directoryName);
        if (!m.matches()) {
            throw new IllegalArgumentException();
        }

        this.timeStamp = dateFormatter.parseDateTime(m.group(1));
        this.eventName = directoryTokens[directoryTokens.length - 2];
        this.serializationType = SerializationType.fromSuffix(directoryTokens[directoryTokens.length - 1]);
        // Build the final output directory in HDFS
        // TODO Use default granularity of HOURLY, we could have different granularity in the file though :(
        // This may be already broken in EventSpoolDispatcher
        final GranularityPathMapper pathMapper = new GranularityPathMapper(String.format("%s/%s", config.getEventOutputDirectory(), eventName), Granularity.HOURLY);
        this.hdfsDir = pathMapper.getPathForDateTime(timeStamp);
    }

    /**
     * @return the local spool directory name
     */
    public String getSpoolDirectoryName()
    {
        return String.format("%s-%d-%s-%s.%s.%s", config.getLocalIp(), config.getLocalPort(), RandomStringUtils.randomAlphanumeric(4), dateFormatter.print(timeStamp), eventName, serializationType.getFileSuffix());
    }

    /**
     * @return the full path to the local spool directory name
     */
    public String getSpoolDirectoryPath()
    {
        return String.format("%s/%s", config.getSpoolDirectoryName(), getSpoolDirectoryName());
    }

    /**
     * Get the full file path in HDFS
     * <p/>
     * The Hadoop fileName includes a number of things to avoid collisions:
     * ip  to avoid conflicts between machines
     * fileExtension  (serialization-type-specific) so multiple file extensions can be written to same directory
     * flushCount  so the same queue can write multiple times
     * queueCreationTimestamp  so if, for instance, we shut down and restart the collector within an hour, their writes won't conflict
     *
     * @param flushCount number of flushes for this queue
     * @return output path for the spool in HDFS
     */
    public String toHadoopPath(final int flushCount)
    {
        return String.format("%s/%s-%d-%s-%s-f%d.%s", hdfsDir, config.getLocalIp(), config.getLocalPort(), RandomStringUtils.randomAlphanumeric(4), dateFormatter.print(timeStamp), flushCount, serializationType.getFileSuffix());
    }

    public String getEventName()
    {
        return eventName;
    }

    public SerializationType getSerializationType()
    {
        return serializationType;
    }

    public ReadableInstant getTimeStamp()
    {
        return timeStamp;
    }
}
