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

import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.SequenceFile;

import java.io.IOException;

class HadoopOutputChunk
{
    private final Path sourcePath;
    private final Path desintationPath;
    private final SequenceFile.Writer writer;
    private boolean isClosed = false;

    HadoopOutputChunk(Path sourcePath, Path desintationPath, SequenceFile.Writer writer)
    {
        this.sourcePath = sourcePath;
        this.desintationPath = desintationPath;
        this.writer = writer;
    }

    public void close() throws IOException
    {
        if (!isClosed) {
            isClosed = true;
            writer.close();
        }
    }

    public void commit(FileSystem fileSystem) throws IOException
    {
        Path destinationDir = desintationPath.getParent();

        // parent directory has to exist for a hdfs rename to succeed
        if (!fileSystem.exists(destinationDir) && !fileSystem.mkdirs(desintationPath.getParent())) {
            throw new IOException(String.format("Unable to make destination directory %s (does the parent directory exist?)", destinationDir));
        }
        if (!fileSystem.rename(sourcePath, desintationPath)) {
            throw new IOException(String.format("Unable to rename %s to %s", sourcePath, desintationPath));
        }
    }

    public void rollback(FileSystem fileSystem) throws IOException
    {
        deleteIfExists(sourcePath, fileSystem);
        deleteIfExists(desintationPath, fileSystem);
    }

    private void deleteIfExists(Path path, FileSystem fileSystem) throws IOException
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
        return String.format("%s : %s -> %s", HadoopOutputChunk.class, sourcePath, desintationPath);
    }
}
