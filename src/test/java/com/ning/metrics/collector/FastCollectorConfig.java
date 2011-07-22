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

package com.ning.metrics.collector;

import com.ning.metrics.collector.binder.config.CollectorConfig;

import java.io.IOException;
import java.net.ServerSocket;

public abstract class FastCollectorConfig implements CollectorConfig
{
    private static final long START_TIME = System.currentTimeMillis();
    private int cachedPort = -1;

    /**
     * @return true - enable a Mock AMQ for tests by default
     * @see com.ning.metrics.collector.realtime.RealTimeQueueTestModule
     */
    @Override
    public boolean isActiveMQEnabled()
    {
        return true;
    }

    /**
     * Maximum number of events per file in the temporary spooling area. Past this threshold,
     * buffered events are promoted to the final spool queue.
     * This is used in the ThresholdEventWriter (size before commits)
     *
     * @return the maximum number of events per file
     * @see com.ning.metrics.serialization.writer.ThresholdEventWriter
     */
    @Override
    public long getMaxUncommittedWriteCount()
    {
        return 2;
    }

    /**
     * Maxixum number of seconds before events are promoted from the temporary spooling area to the final spool queue.
     * This is used in the ThresholdEventWriter (delay between commits).
     *
     * @return maxixmum age of events in seconds in the temporary spool queue
     * @see com.ning.metrics.serialization.writer.ThresholdEventWriter
     */
    @Override
    public int getMaxUncommittedPeriodInSeconds()
    {
        return 1;
    }

    /**
     * Delay between flushes (in seconds).
     * This is used in the DiskSpoolEventWriter (delay between flushes).
     *
     * @return delay between flushes to HDFS
     * @see com.ning.metrics.serialization.writer.DiskSpoolEventWriter
     */
    @Override
    public int getFlushIntervalInSeconds()
    {
        return 1;
    }

    /**
     * Directory for the collector to buffer events before writing them to HDFS
     *
     * @return the directory path
     */
    @Override
    public String getSpoolDirectoryName()
    {
        return System.getProperty("java.io.tmpdir") + "/collector-local-spool-" + START_TIME;
    }


    @Override
    public int getLocalPort()
    {
        if (cachedPort == -1) {
            cachedPort = findFreePort();
        }

        return cachedPort;
    }

    private int findFreePort()
    {
        // Find a free port -- this is needed for TestNG to run test classes in parallel
        ServerSocket socket = null;

        try {
            try {
                socket = new ServerSocket(0);
            }
            catch (IOException e) {
                return 8080;
            }

            return socket.getLocalPort();
        }
        finally {
            if (socket != null) {
                try {
                    socket.close();
                }
                catch (IOException ignored) {
                }
            }
        }
    }
}
