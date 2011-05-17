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

import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.SequenceFile;
import org.apache.log4j.Logger;

import java.io.IOException;

/**
 * This class takes care of renaming files in HDFS
 */
class HadoopOutputChunk
{
    private static final Logger log = Logger.getLogger(HadoopOutputChunk.class);

    private final Path sourcePath;
    private final Path destinationPath;
    private final SequenceFile.Writer writer;
    private boolean isClosed = false;

    HadoopOutputChunk(final Path sourcePath, final Path destinationPath, final SequenceFile.Writer writer)
    {
        this.sourcePath = sourcePath;
        this.destinationPath = destinationPath;
        this.writer = writer;
    }

    /**
     * Close the underlying writer
     *
     * @throws IOException generic IOException
     */
    public void close() throws IOException
    {
        if (!isClosed) {
            isClosed = true;
            writer.close();
        }
    }

    /**
     * Rename sourcePath to destinationPath. Parents don't have to exist (they will be created if they don't).
     *
     * @param fileSystem Filesystem object to operate on
     * @throws IOException generic IOException
     */
    public void commit(final FileSystem fileSystem) throws IOException
    {
        final Path destinationDir = destinationPath.getParent();

        log.info(String.format("Renaming [%s] to [%s]", sourcePath, destinationPath));

        // parent directory has to exist for a hdfs rename to succeed
        if (!fileSystem.exists(destinationDir) && !fileSystem.mkdirs(destinationPath.getParent())) {
            throw new IOException(String.format("Unable to make destination directory %s (does the parent directory exist?)", destinationDir));
        }
        if (!fileSystem.rename(sourcePath, destinationPath)) {
            throw new IOException(String.format("Unable to rename %s to %s", sourcePath, destinationPath));
        }
    }

    /**
     * Delete both sourcePath and destinationPath
     *
     * @param fileSystem FileSystem object to operate on
     * @throws IOException generic IOException
     */
    public void rollback(final FileSystem fileSystem) throws IOException
    {
        deleteIfExists(sourcePath, fileSystem);
        deleteIfExists(destinationPath, fileSystem);
    }

    private void deleteIfExists(final Path path, final FileSystem fileSystem) throws IOException
    {
        if (fileSystem.exists(path) && !fileSystem.delete(path, false)) {
            throw new IOException(String.format("unable to delete %s", path));
        }
    }

    public SequenceFile.Writer getWriter()
    {
        return writer;
    }

    @Override
    public String toString()
    {
        return String.format("%s : %s -> %s", HadoopOutputChunk.class, sourcePath, destinationPath);
    }
}
