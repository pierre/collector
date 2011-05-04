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

package com.ning.metrics.collector.binder.config;

import org.skife.config.Config;
import org.skife.config.Default;
import org.skife.config.DefaultNull;

public interface CollectorConfig
{
    @Config(value = "collector.dfs.block.size")
    @Default(value = "134217728")
    public long getHadoopBlockSize();

    @Config(value = "collector.hadoop.ugi")
    @Default(value = "nobody,nobody")
    public String getHadoopUgi();

    // Whether to forward events to ActiveMQ

    @Config(value = "collector.activemq.enabled")
    @Default(value = "false")
    public boolean isActiveMQEnabled();

    // ActiveMQ uri

    @Config(value = "collector.activemq.uri")
    @DefaultNull
    public String getActiveMQUri();

    // ActiveMQ messages TTL in milliseconds, default 10 minutes

    @Config(value = "collector.activemq.messagesTTLmilliseconds")
    @Default(value = "600000")
    public int getMessagesTTLMilliseconds();

    // Events types to forward to ActiveMQ (comma delimited)

    @Config(value = "collector.activemq.events")
    @DefaultNull
    public String getActiveMQEventsToCollect();

    // Length of the internal buffer for passing events of a specific type to activemq

    @Config(value = "collector.activemq.bufferLength")
    @Default(value = "10000")
    public int getActiveMQBufferLength();

    // Number of senders per category

    @Config(value = "collector.activemq.numSendersPerCategory")
    @Default(value = "1")
    public int getActiveMQNumSendersPerCategory();

    // Whether to collect scribe events

    @Config(value = "collector.scribe.enabled")
    @Default(value = "true")
    public boolean isScribeCollectionEnabled();

    // Scribe port

    @Config(value = "collector.scribe.port")
    @Default(value = "7911")
    public int getScribePort();

    @Config(value = "collector.max-event-queue-size")
    @Default(value = "200000")
    public long getMaxQueueSize();

    @Config(value = "collector.event-routes.persistent")
    @Default(value = "true")
    public boolean isHdfsWriterEnabled();

    //------------------- Spooling -------------------//

    /**
     * Maximum number of events per file in the temporary spooling area. Past this threshold,
     * buffered events are promoted to the final spool queue.
     *
     * @return the maximum number of events per file
     */
    @Config(value = "collector.diskspool.flush-event-queue-size")
    @Default(value = "10000")
    public long getFlushEventQueueSize();

    /**
     * Maxixum number of seconds before events are promoted from the temporary spooling area to the final spool queue.
     *
     * @return maxixmum age of events in seconds in the temporary spool queue
     */
    @Config(value = "collector.diskspool.refresh-delay-seconds")
    @Default(value = "60")
    public int getRefreshDelayInSeconds();

    /**
     * Directory for the collector to buffer events before writing them to HDFS
     *
     * @return the directory path
     */
    @Config(value = "collector.diskspool.path")
    @Default(value = "/tmp/collector/diskspool")
    public String getSpoolDirectoryName();

    /**
     * If false, events will not be periodically sent to HDFS
     *
     * @return whether to send events buffered locally
     */
    @Config(value = "collector.diskspool.enabled")
    @Default(value = "true")
    public boolean isFlushEnabled();

    /**
     * Delay between flushes (in seconds)
     *
     * @return delay between flushes to HDFS
     */
    @Config(value = "collector.diskspool.refresh-delay-seconds")
    @Default(value = "30")
    public long getFlushIntervalInSeconds();

    /**
     * Type of outputter to use when spooling: NONE, FLUSH, or SYNC
     *
     * @return the String representation of the SyncType
     */
    @Config(value = "collector.diskspool.synctype")
    @Default(value = "NONE")
    public String getSyncType();

    /**
     * Size of the batch for the sync type parameter
     *
     * @return the number of events to buffer before calling flush or sync
     */
    @Config(value = "collector.diskspool.sync-batch-size")
    @Default(value = "50")
    public int getSyncBatchSize();

    @Config(value = "collector.event-end-point.rate-window-size-minutes")
    @Default(value = "5")
    public int getRateWindowSizeMinutes();

    @Config(value = "collector.server.ip")
    @Default(value = "127.0.0.1")
    public String getLocalIp();

    @Config(value = "collector.server.port")
    @Default(value = "8080")
    public int getLocalPort();

    @Config(value = "collector.server.ssl.enabled")
    @Default(value = "false")
    public boolean isSSLEnabled();

    @Config(value = "collector.server.ssl.port")
    @Default(value = "443")
    public int getLocalSSLPort();

    @Config(value = "collector.jetty.ssl.keystore")
    @DefaultNull
    public String getSSLkeystoreLocation();

    @Config(value = "collector.jetty.ssl.keystore.password")
    @DefaultNull
    public String getSSLkeystorePassword();

    @Config(value = "collector.temporary-event-output-directory")
    @Default(value = "/tmp/collector/hdfs/tmp")
    public String getTemporaryEventOutputDirectory();

    @Config(value = "collector.event-output-directory")
    @Default(value = "/events")
    public String getEventOutputDirectory();

    @Config(value = "collector.hadoop-writer.max-writers")
    @Default(value = "64")
    public int getMaxHadoopWriters();

    @Config(value = "collector.hadoop.host")
    @DefaultNull
    public String getHfsHost();

    @Config(value = "collector.event-end-point.enabled")
    @Default(value = "true")
    public boolean isEventEndpointEnabled();

    @Config(value = "collector.filters.list-delimeter")
    @Default(value = ",")
    public String getFilters();

    @Config(value = "collector.filters.host")
    @DefaultNull
    public String getFiltersHost();

    @Config(value = "collector.filters.ip")
    @DefaultNull
    public String getFiltersIp();

    @Config(value = "collector.filters.useragent")
    @DefaultNull
    public String getFiltersUserAgent();

    @Config(value = "collector.filters.path")
    @DefaultNull
    public String getFiltersPath();

    @Config(value = "collector.filters.event-type")
    @DefaultNull
    public String getFiltersEventType();

    /**
     * Default hostname to use when connecting to the load balancer
     *
     * @return the hostname used to connect to the load balancer
     */
    @Config(value = "collector.f5.hostname")
    @DefaultNull
    public String getF5Hostname();

    /**
     * Default username to use when connecting to the load balancer
     *
     * @return the username used to connect to the load balancer
     */
    @Config(value = "collector.f5.username")
    @DefaultNull
    public String getF5Username();

    /**
     * Default password to use when connecting to the load balancer
     *
     * @return the password used to connect to the load balancer
     */
    @Config(value = "collector.f5.password")
    @DefaultNull
    public String getF5Password();

    /**
     * Default pool name to use when connecting to the load balancer
     *
     * @return the pool name used to connect to the load balancer
     */
    @Config(value = "collector.f5.poolname")
    @DefaultNull
    public String getF5PoolName();
}
