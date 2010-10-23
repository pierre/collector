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

package com.ning.metrics.collector.binder;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.hadoop.HadoopThriftEnvelopeSerialization;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;

import java.io.IOException;

public class FileSystemProvider implements Provider<FileSystem>
{
    private final FileSystem fileSystem;

    @Inject
    public FileSystemProvider(CollectorConfig collectorConfig) throws IOException
    {
        String hfsHost = collectorConfig.getHfsHost();
        Configuration hadoopConfig = new Configuration();

        if (hfsHost.isEmpty()) {
            // Local filesystem, for testing
            hadoopConfig.set("fs.default.name", "file:///");
        }
        else {
            hadoopConfig.set("fs.default.name", hfsHost);
        }

        hadoopConfig.setLong("dfs.block.size", collectorConfig.getHadoopBlockSize());
        hadoopConfig.set("hadoop.job.ugi", collectorConfig.getHadoopUgi());
        hadoopConfig.setStrings("io.serializations", HadoopThriftEnvelopeSerialization.class.getName(), "org.apache.hadoop.io.serializer.WritableSerialization");

        fileSystem = FileSystem.get(hadoopConfig);
    }

    public FileSystem get()
    {
        return fileSystem;
    }
}
