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
import com.ning.metrics.collector.util.ComponentHealthCheck;
import com.ning.metrics.collector.util.HealthCheckStatus;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.FsStatus;

public class HadoopHealthCheck implements ComponentHealthCheck
{
    private static final String[] HADOOP_PROPERTIES = new String[]{"fs.default.name", "io.serializations", "io.compression.codecs"};
    private final FileSystemAccess fsAccess;

    @Inject
    public HadoopHealthCheck(final FileSystemAccess fsAccess)
    {
        this.fsAccess = fsAccess;
    }

    @Override
    public HealthCheckStatus check()
    {
        HealthCheckStatus.Code status = HealthCheckStatus.Code.OK;
        String message;

        try {
            final FileSystem fileSystem = fsAccess.get(0); // No exponential backoff, fail early
            final Configuration fileSystemConf = fileSystem.getConf();
            final FsStatus fsStatus = fileSystem.getStatus();
            final StringBuilder builder = new StringBuilder();

            for (final String prop : HADOOP_PROPERTIES) {
                builder.append(String.format("%s: %s, ", prop, fileSystemConf.get(prop)));

            }
            builder.append(String.format("capacity: %d, used: %d, remaining: %d", fsStatus.getCapacity(), fsStatus.getUsed(), fsStatus.getRemaining()));
            message = builder.toString();

        }
        catch (Exception e) {
            status = HealthCheckStatus.Code.ERROR;
            message = "Exception when trying to access Hadoop";
        }

        return new HealthCheckStatus("HadoopHealthCheck", status, message);
    }
}
