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

package com.ning.metrics.collector.hadoop.writer;

import com.google.inject.Inject;
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.serialization.event.Event;
import com.ning.metrics.serialization.thrift.hadoop.TBooleanWritable;
import com.ning.metrics.serialization.writer.EventWriter;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.SequenceFile;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.joda.time.ReadableInstant;
import org.perf4j.aop.Profiled;
import org.weakref.jmx.Managed;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * HDFS EventWriter for the serialization-writer library
 */
@SuppressWarnings("serial")
public class HadoopFileEventWriter implements EventWriter
{
    private static final Logger log = Logger.getLogger(HadoopFileEventWriter.class);

    private final String sessionId;
    private final String baseDirectory;
    private final String tmpDirectory;
    private final FileSystemAccess fsAccess;
    private int maxOutputStreams = 64;
    private final Collection<FileError> fileErrorList = new ArrayDeque<FileError>();
    private volatile DateTime lastFlushed = new DateTime();
    private final Collection<HadoopOutputChunk> closedChunkList = new ArrayList<HadoopOutputChunk>();
    private final Map<String, HadoopOutputChunk> outputChunks = new LinkedHashMap<String, HadoopOutputChunk>()
    {
        protected boolean removeEldestEntry(final Map.Entry<String, HadoopOutputChunk> eldest)
        {
            if (size() > maxOutputStreams) {
                final HadoopOutputChunk output = eldest.getValue();
                try {
                    output.close();
                    closedChunkList.add(output);
                }
                catch (IOException e) {
                    fileErrorList.add(new FileError(eldest.getKey(), e));
                }

                return true;
            }

            return false;
        }
    };
    private static final TBooleanWritable BOOL_WRITABLE = new TBooleanWritable(true);
    private AtomicLong eventsWritten = new AtomicLong(0);

    @Inject
    public HadoopFileEventWriter(
        final FileSystemAccess fsAccess,
        final CollectorConfig config
    )
    {
        this(config.getEventOutputDirectory(), config.getTemporaryEventOutputDirectory(), fsAccess, config.getMaxHadoopWriters(), config.getLocalIp(), config.getLocalPort());
    }

    public HadoopFileEventWriter(
        final String baseDirectory,
        final String tmpBase,
        final FileSystemAccess fsAccess,
        final int maxOutputStreams,
        final String ip,
        final int port
    )
    {
        this.baseDirectory = baseDirectory;
        this.tmpDirectory = String.format("%s%s%s", tmpBase, baseDirectory.startsWith("/") ? "" : "/", baseDirectory);
        this.fsAccess = fsAccess;
        this.maxOutputStreams = maxOutputStreams;
        this.sessionId = String.format("%s-%d", ip, port);
    }

    /**
     * Write a given event in Hadoop. The location is determined by the event getOutputDir method.
     * Note! In case of Smile and SmileBucketEvents, we assume that events in the buckets share the same granularity
     * and output path.
     * <p/>
     * If no exception is thrown, one is guaranteed that the write succeeded (to the extend of Hadoop guarantees...).
     *
     * @param event Event to write (contains HDFS path information and payload to write)
     * @throws IOException if the write is not successful
     * @see com.ning.metrics.serialization.smile.SmileEnvelopeEventsToSmileBucketEvents to bundle properly Smile events
     */
    @Profiled(tag = "jmx", message = "Write event to HDFS")
    public synchronized void write(final Event event) throws IOException
    {
        for (final FileError fileError : fileErrorList) {
            log.error(String.format("Error flushing & closing file %s", fileError.getFilename()), fileError.getException());
        }
        fileErrorList.clear();

        final String outputDir = event.getOutputDir(baseDirectory);
        final String tmpOutputDir = event.getOutputDir(tmpDirectory);
        writeEventToHDFS(event, outputDir, tmpOutputDir);

        eventsWritten.incrementAndGet();
    }

    private void writeEventToHDFS(final Event event, final String outputDir, final String tmpOutputDir) throws IOException
    {
        final Object value = event.getData();
        final HadoopOutputChunk chunk = getChunk(event, outputDir, tmpOutputDir, value, value.getClass());

        if (chunk != null) {
            final SequenceFile.Writer writer = chunk.getWriter();
            writer.append(BOOL_WRITABLE, value);
        }
    }

    private HadoopOutputChunk getChunk(final Event event, final String outputDir, final String tmpOutputDir, final Object value, final Class<?> clazz) throws IOException
    {
        if (value == null) {
            // Trying to write a null value triggers an NPE in SequenceFile$BlockCompressWriter.append.
            // Return here to avoid creating useless directories in HDFS.
            log.warn("Deserialized event contains no data: " + event);
            return null;
        }

        HadoopOutputChunk chunk = outputChunks.get(outputDir);
        if (chunk == null) {
            final DateTime now = new DateTime();
            final String filename = String.format("%s-%s", now, sessionId).replace(":", ".");
            Path outputPath = new Path(outputDir, filename);
            Path tmpOutputPath = new Path(tmpOutputDir, filename);

            for (int suffix = 0; fsAccess.get().exists(tmpOutputPath); suffix++) {
                outputPath = new Path(outputDir, String.format("%s-%d", filename, suffix));
                tmpOutputPath = new Path(tmpOutputDir, String.format("%s-%d", filename, suffix));
            }

            log.info(String.format("Creating new HDFS chunk [%s] -> [%s]", outputPath.toUri().getPath(), tmpOutputPath.toUri().getPath()));
            final SequenceFile.Writer writer = SequenceFile.createWriter(fsAccess.get(), fsAccess.get().getConf(), tmpOutputPath, TBooleanWritable.class, clazz, SequenceFile.CompressionType.BLOCK);
            chunk = new HadoopOutputChunk(tmpOutputPath, outputPath, writer);
            outputChunks.put(outputDir, chunk);
        }
        return chunk;
    }

    private List<HadoopOutputChunk> getAllChunks()
    {
        final List<HadoopOutputChunk> allChunks = new ArrayList<HadoopOutputChunk>(outputChunks.values());
        allChunks.addAll(closedChunkList);

        return allChunks;
    }

    private void clearAllChunks()
    {
        outputChunks.clear();
        closedChunkList.clear();
    }

    @Override
    public synchronized void commit() throws IOException
    {
        forceCommit();
    }

    @Override
    public synchronized void flush() throws IOException
    {
        commit();
    }

    @Override
    public synchronized void forceCommit() throws IOException
    {
        final List<HadoopOutputChunk> allChunks = getAllChunks();

        for (final HadoopOutputChunk chunk : allChunks) {
            chunk.close();
        }

        try {
            for (final HadoopOutputChunk chunk : allChunks) {
                chunk.commit(fsAccess.get());
            }
        }
        catch (RuntimeException e) {
            log.error(String.format("Unable to commit all chunks (serialization rename failed). Chunks: %s", allChunks), e);
            throw e;
        }
        catch (IOException e) {
            log.error(String.format("Unable to commit all chunks (serialization rename failed). Chunks: %s", allChunks), e);
            throw e;
        }

        clearAllChunks();
        lastFlushed = new DateTime();
    }

    @Override
    public synchronized void rollback() throws IOException
    {
        final List<HadoopOutputChunk> allChunks = getAllChunks();

        for (final HadoopOutputChunk chunk : allChunks) {
            chunk.close();
        }

        try {
            for (final HadoopOutputChunk chunk : allChunks) {
                chunk.rollback(fsAccess.get());
            }
        }
        catch (RuntimeException e) {
            log.error(String.format("Unable to rollback all chunks (serialization rename failed). Chunks: %s", allChunks), e);
            throw e;
        }
        catch (IOException e) {
            log.error(String.format("unable to rollback all chunks (serialization rename failed). Chunks: %s", allChunks), e);
            throw e;
        }
        clearAllChunks();
        lastFlushed = new DateTime();
    }

    @Managed(description = "seconds since last commit of events to hdfs")
    public long getSecondsSinceLastUpdate()
    {
        final ReadableInstant now = new DateTime();

        return (now.getMillis() - lastFlushed.getMillis()) / 1000;
    }

    @Managed(description = "total number of events written to hdfs")
    public long getEventsWritten()
    {
        return eventsWritten.get();
    }

    public String toString()
    {
        return String.format("HDFS File Writer [%s] [%s]", fsAccess.get().getUri(), baseDirectory);
    }
}
