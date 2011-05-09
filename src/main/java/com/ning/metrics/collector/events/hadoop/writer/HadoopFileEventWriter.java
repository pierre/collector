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
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.serialization.event.Event;
import com.ning.metrics.serialization.thrift.hadoop.TBooleanWritable;
import com.ning.metrics.serialization.writer.EventWriter;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.SequenceFile;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.perf4j.aop.Profiled;
import org.weakref.jmx.Managed;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

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
    private final FileSystem fs;
    private int maxOutputStreams = 64;
    private final Queue<FileError> fileErrorList = new ArrayDeque<FileError>();
    private volatile DateTime lastFlushed = new DateTime();
    private final List<HadoopOutputChunk> closedChunkList = new ArrayList<HadoopOutputChunk>();
    private final Map<String, HadoopOutputChunk> outputChunks = new LinkedHashMap<String, HadoopOutputChunk>()
    {
        protected boolean removeEldestEntry(Map.Entry<String, HadoopOutputChunk> eldest)
        {
            if (size() > maxOutputStreams) {
                HadoopOutputChunk output = eldest.getValue();
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

    @Inject
    public HadoopFileEventWriter(
        FileSystem fs,
        CollectorConfig config
    )
    {
        this(config.getEventOutputDirectory(), config.getTemporaryEventOutputDirectory(), fs, config.getMaxHadoopWriters(), config.getLocalIp(), config.getLocalPort());
    }

    public HadoopFileEventWriter(
        String baseDirectory,
        String tmpBase,
        FileSystem fs,
        int maxOutputStreams,
        String ip,
        int port
    )
    {
        this.baseDirectory = baseDirectory;
        this.tmpDirectory = String.format("%s%s%s", tmpBase, baseDirectory.startsWith("/") ? "" : "/", baseDirectory);
        this.fs = fs;
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
    public synchronized void write(Event event) throws IOException
    {
        for (FileError fileError : fileErrorList) {
            log.error(String.format("Error flushing & closing file %s", fileError.getFilename()), fileError.getException());
        }
        fileErrorList.clear();

        String outputDir = event.getOutputDir(baseDirectory);
        String tmpOutputDir = event.getOutputDir(tmpDirectory);
        writeEventToHDFS(event, outputDir, tmpOutputDir);
    }

    private void writeEventToHDFS(Event event, String outputDir, String tmpOutputDir) throws IOException
    {
        Object value = event.getData();
        HadoopOutputChunk chunk = getChunk(event, outputDir, tmpOutputDir, value, value.getClass());

        if (chunk != null) {
            SequenceFile.Writer writer = chunk.getWriter();
            writer.append(BOOL_WRITABLE, value);
        }
    }

    private HadoopOutputChunk getChunk(Event event, String outputDir, String tmpOutputDir, Object value, Class<?> clazz) throws IOException
    {
        if (value == null) {
            // Trying to write a null value triggers an NPE in SequenceFile$BlockCompressWriter.append.
            // Return here to avoid creating useless directories in HDFS.
            log.warn("Deserialized event contains no data: " + event);
            return null;
        }

        HadoopOutputChunk chunk = outputChunks.get(outputDir);
        if (chunk == null) {
            DateTime now = new DateTime();
            String filename = String.format("%s-%s", now, sessionId).replace(":", ".");
            Path outputPath = new Path(outputDir, filename);
            Path tmpOutputPath = new Path(tmpOutputDir, filename);

            for (int suffix = 0; fs.exists(tmpOutputPath); suffix++) {
                outputPath = new Path(outputDir, String.format("%s-%d", filename, suffix));
                tmpOutputPath = new Path(tmpOutputDir, String.format("%s-%d", filename, suffix));
            }

            log.info(String.format("OutputPath (tmp): %s (%s)", outputPath.toUri().getPath(), tmpOutputPath.toUri().getPath()));
            SequenceFile.Writer writer = SequenceFile.createWriter(fs, fs.getConf(), tmpOutputPath, TBooleanWritable.class, clazz, SequenceFile.CompressionType.BLOCK);
            chunk = new HadoopOutputChunk(tmpOutputPath, outputPath, writer);
            outputChunks.put(outputDir, chunk);
        }
        return chunk;
    }

    private List<HadoopOutputChunk> getAllChunks()
    {
        List<HadoopOutputChunk> allChunks = new ArrayList<HadoopOutputChunk>(outputChunks.values());
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
        List<HadoopOutputChunk> allChunks = getAllChunks();

        for (HadoopOutputChunk chunk : allChunks) {
            chunk.close();
        }

        try {
            for (HadoopOutputChunk chunk : allChunks) {
                chunk.commit(fs);
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
        List<HadoopOutputChunk> allChunks = getAllChunks();

        for (HadoopOutputChunk chunk : allChunks) {
            chunk.close();
        }

        try {
            for (HadoopOutputChunk chunk : allChunks) {
                chunk.rollback(fs);
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
        DateTime now = new DateTime();

        return (now.getMillis() - lastFlushed.getMillis()) / 1000;
    }

    public String toString()
    {
        return String.format("HDFS File Writer [%s] [%s]", fs.getUri(), baseDirectory);
    }
}
