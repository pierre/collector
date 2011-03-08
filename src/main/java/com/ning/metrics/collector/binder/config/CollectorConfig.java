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

package com.ning.metrics.collector.binder.config;

import com.sun.security.auth.module.UnixSystem;
import org.skife.config.Config;

public class CollectorConfig
{
    @Config(value = "collector.dfs.block.size")
    public long getHadoopBlockSize()
    {
        return 134217728; // 128M
    }

    @Config(value = "collector.hadoop.ugi")
    public String getHadoopUgi()
    {
        UnixSystem unixSystem = new UnixSystem();
        String username = unixSystem.getUsername();
        return String.format("%s,supergroup", username);
    }

    // Whether to forward events to ActiveMQ

    @Config(value = "collector.activemq.enabled")
    public boolean isActiveMQEnabled()
    {
        return true;
    }

    // ActiveMQ host

    @Config(value = "collector.activemq.host")
    public String getActiveMQHost()
    {
        return null;
    }

    // ActiveMQ port

    @Config(value = "collector.activemq.port")
    public int getActiveMQPort()
    {
        return 61616;
    }

    // ActiveMQ messages TTL in milliseconds, default 10 minutes

    @Config(value = "collector.activemq.messagesTTLmilliseconds")
    public int getMessagesTTLMilliseconds()
    {
        return 600000;
    }

    // Events types to forward to ActiveMQ (comma delimited)

    @Config(value = "collector.activemq.events")
    public String getActiveMQEventsToCollect()
    {
        return null;
    }

    // Whether to collect scribe events

    @Config(value = "collector.scribe.enabled")
    public boolean isScribeCollectionEnabled()
    {
        return true;
    }

    // Scribe port

    @Config(value = "collector.scribe.port")
    public int getScribePort()
    {
        return 7911;
    }

    @Config(value = "collector.max-event-queue-size")
    public long getMaxQueueSize()
    {
        return 200000;
    }

    @Config(value = "collector.event-routes.persistent")
    public boolean isHdfsWriterEnabled()
    {
        return true;
    }

    //------------------- Spooling -------------------//

    /**
     * Maximum number of events per file in the temporary spooling area. Past this threshold,
     * buffered events are promoted to the final spool queue.
     *
     * @return the maximum number of events per file
     */
    @Config(value = "collector.diskspool.flush-event-queue-size")
    public long getFlushEventQueueSize()
    {
        return 10000;
    }

    /**
     * Maxixum number of seconds before events are promoted from the temporary spooling area to the final spool queue.
     *
     * @return maxixmum age of events in seconds in the temporary spool queue
     */
    @Config(value = "collector.diskspool.refresh-delay-seconds")
    public int getRefreshDelayInSeconds()
    {
        return 60;
    }

    /**
     * Directory for the collector to buffer events before writing them to HDFS
     *
     * @return the directory path
     */
    @Config(value = "collector.diskspool.path")
    public String getSpoolDirectoryName()
    {
        return "/tmp/collector/diskspool";
    }

    /**
     * If false, events will not be periodically sent to HDFS
     *
     * @return whether to send events buffered locally
     */
    @Config(value = "collector.diskspool.enabled")
    public boolean isFlushEnabled()
    {
        return true;
    }

    /**
     * Delay between flushes (in seconds)
     *
     * @return delay between flushes to HDFS
     */
    @Config(value = "collector.diskspool.refresh-delay-seconds")
    public long getFlushIntervalInSeconds()
    {
        return 30;
    }

    /**
     * Type of outputter to use when spooling: NONE, FLUSH, or SYNC
     *
     * @return the String representation of the SyncType
     */
    @Config(value = "collector.diskspool.synctype")
    public String getSyncType()
    {
        return "NONE";
    }

    /**
     * Size of the batch for the sync type parameter
     *
     * @return the number of events to buffer before calling flush or sync
     */
    @Config(value = "collector.diskspool.sync-batch-size")
    public int getSyncBatchSize()
    {
        return 50;
    }

    @Config(value = "collector.event-end-point.rate-window-size-minutes")
    public int getRateWindowSizeMinutes()
    {
        return 5;
    }

    @Config(value = "xn.server.ip")
    public String getLocalIp()
    {
        return "127.0.0.1";
    }

    @Config(value = "xn.server.port")
    public int getLocalPort()
    {
        return 8080;
    }

    @Config(value = "xn.server.ssl.enabled")
    public boolean isSSLEnabled()
    {
        return false;
    }

    @Config(value = "xn.server.ssl.port")
    public int getLocalSSLPort()
    {
        return 443;
    }

    @Config(value = "xn.jetty.ssl.keystore")
    public String getSSLkeystoreLocation()
    {
        return "";
    }

    @Config(value = "xn.jetty.ssl.keystore.password")
    public String getSSLkeystorePassword()
    {
        return "";
    }

    @Config(value = "collector.temporary-event-output-directory")
    public String getTemporaryEventOutputDirectory()
    {
        return "/tmp/collector/hdfs/tmp";
    }

    @Config(value = "collector.event-output-directory")
    public String getEventOutputDirectory()
    {
        return "/events";
    }

    @Config(value = "collector.hadoop-writer.max-writers")
    public int getMaxHadoopWriters()
    {
        return 64;
    }

    @Config(value = "collector.hadoop.host")
    public String getHfsHost()
    {
        return "";
    }

    @Config(value = "collector.event-end-point.enabled")
    public boolean isEventEndpointEnabled()
    {
        return true;
    }

    @Config(value = "collector.filters.list-delimeter")
    public String getFilters()
    {
        return ",";
    }

    @Config(value = "collector.filters.host")
    public String getFiltersHost()
    {
        return "";
    }

    @Config(value = "collector.filters.ip")
    public String getFiltersIp()
    {
        return "";
    }

    @Config(value = "collector.filters.useragent")
    public String getFiltersUserAgent()
    {
        return "";
    }

    @Config(value = "collector.filters.path")
    public String getFiltersPath()
    {
        return "";
    }

    @Config(value = "collector.filters.event-type")
    public String getFiltersEventType()
    {
        return "";
    }

    /**
     * Default hostname to use when connecting to the load balancer
     *
     * @return the hostname used to connect to the load balancer
     */
    @Config(value = "collector.f5.hostname")
    public String getF5Hostname()
    {
        return "";
    }

    /**
     * Default username to use when connecting to the load balancer
     *
     * @return the username used to connect to the load balancer
     */
    @Config(value = "collector.f5.username")
    public String getF5Username()
    {
        return "";
    }

    /**
     * Default password to use when connecting to the load balancer
     *
     * @return the password used to connect to the load balancer
     */
    @Config(value = "collector.f5.password")
    public String getF5Password()
    {
        return "";
    }

    /**
     * Default pool name to use when connecting to the load balancer
     *
     * @return the pool name used to connect to the load balancer
     */
    @Config(value = "collector.f5.poolname")
    public String getF5PoolName()
    {
        return "";
    }
}
