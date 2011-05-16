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
    @Config("collector.dfs.block.size")
    @Default("134217728")
    long getHadoopBlockSize();

    @Config("collector.hadoop.ugi")
    @Default("nobody,nobody")
    String getHadoopUgi();

    // Whether to forward events to ActiveMQ

    @Config("collector.activemq.enabled")
    @Default("false")
    boolean isActiveMQEnabled();

    // ActiveMQ uri

    @Config("collector.activemq.uri")
    @DefaultNull
    String getActiveMQUri();

    // ActiveMQ messages TTL in milliseconds, default 10 minutes

    @Config("collector.activemq.messagesTTLmilliseconds")
    @Default("600000")
    int getMessagesTTLMilliseconds();

    // Events types to forward to ActiveMQ (comma delimited)

    @Config("collector.activemq.events")
    @DefaultNull
    String getActiveMQEventsToCollect();

    // Length of the internal buffer for passing events of a specific type to activemq

    @Config("collector.activemq.bufferLength")
    @Default("10000")
    int getActiveMQBufferLength();

    // Number of senders per category

    @Config("collector.activemq.numSendersPerCategory")
    @Default("1")
    int getActiveMQNumSendersPerCategory();

    // Whether to collect scribe events

    @Config("collector.scribe.enabled")
    @Default("true")
    boolean isScribeCollectionEnabled();

    // Scribe port

    @Config("collector.scribe.port")
    @Default("7911")
    int getScribePort();

    @Config("collector.max-event-queue-size")
    @Default("200000")
    long getMaxQueueSize();

    @Config("collector.event-routes.persistent")
    @Default("true")
    boolean isHdfsWriterEnabled();

    //------------------- Spooling -------------------//

    /**
     * Maximum number of events per file in the temporary spooling area. Past this threshold,
     * buffered events are promoted to the final spool queue.
     *
     * @return the maximum number of events per file
     */
    @Config("collector.diskspool.flush-event-queue-size")
    @Default("10000")
    long getFlushEventQueueSize();

    /**
     * Maxixum number of seconds before events are promoted from the temporary spooling area to the final spool queue.
     *
     * @return maxixmum age of events in seconds in the temporary spool queue
     */
    @Config("collector.diskspool.refresh-delay-seconds")
    @Default("60")
    int getRefreshDelayInSeconds();

    /**
     * Directory for the collector to buffer events before writing them to HDFS
     *
     * @return the directory path
     */
    @Config("collector.diskspool.path")
    @Default("/tmp/collector/diskspool")
    String getSpoolDirectoryName();

    /**
     * If false, events will not be periodically sent to HDFS
     *
     * @return whether to send events buffered locally
     */
    @Config("collector.diskspool.enabled")
    @Default("true")
    boolean isFlushEnabled();

    /**
     * Delay between flushes (in seconds)
     *
     * @return delay between flushes to HDFS
     */
    @Config("collector.diskspool.refresh-delay-seconds")
    @Default("30")
    long getFlushIntervalInSeconds();

    /**
     * Type of outputter to use when spooling: NONE, FLUSH, or SYNC
     *
     * @return the String representation of the SyncType
     */
    @Config("collector.diskspool.synctype")
    @Default("NONE")
    String getSyncType();

    /**
     * Size of the batch for the sync type parameter
     *
     * @return the number of events to buffer before calling flush or sync
     */
    @Config("collector.diskspool.sync-batch-size")
    @Default("50")
    int getSyncBatchSize();

    @Config("collector.event-end-point.rate-window-size-minutes")
    @Default("5")
    int getRateWindowSizeMinutes();

    @Config("collector.server.ip")
    @Default("127.0.0.1")
    String getLocalIp();

    @Config("collector.server.port")
    @Default("8080")
    int getLocalPort();

    @Config("collector.server.ssl.enabled")
    @Default("false")
    boolean isSSLEnabled();

    @Config("collector.server.ssl.port")
    @Default("443")
    int getLocalSSLPort();

    @Config("collector.jetty.ssl.keystore")
    @DefaultNull
    String getSSLkeystoreLocation();

    @Config("collector.jetty.ssl.keystore.password")
    @DefaultNull
    String getSSLkeystorePassword();

    @Config("collector.temporary-event-output-directory")
    @Default("/tmp/collector/hdfs/tmp")
    String getTemporaryEventOutputDirectory();

    @Config("collector.event-output-directory")
    @Default("/events")
    String getEventOutputDirectory();

    @Config("collector.hadoop-writer.max-writers")
    @Default("64")
    int getMaxHadoopWriters();

    @Config("collector.hadoop.host")
    @Default("file:///var/tmp/collector/hadoop")
    String getHfsHost();

    @Config("collector.event-end-point.enabled")
    @Default("true")
    boolean isEventEndpointEnabled();

    @Config("collector.filters.list-delimeter")
    @Default(",")
    String getFilters();

    @Config("collector.filters.host")
    @DefaultNull
    String getFiltersHost();

    @Config("collector.filters.ip")
    @DefaultNull
    String getFiltersIp();

    @Config("collector.filters.useragent")
    @DefaultNull
    String getFiltersUserAgent();

    @Config("collector.filters.path")
    @DefaultNull
    String getFiltersPath();

    @Config("collector.filters.event-type")
    @DefaultNull
    String getFiltersEventType();

    /**
     * Default hostname to use when connecting to the load balancer
     *
     * @return the hostname used to connect to the load balancer
     */
    @Config("collector.f5.hostname")
    @DefaultNull
    String getF5Hostname();

    /**
     * Default username to use when connecting to the load balancer
     *
     * @return the username used to connect to the load balancer
     */
    @Config("collector.f5.username")
    @DefaultNull
    String getF5Username();

    /**
     * Default password to use when connecting to the load balancer
     *
     * @return the password used to connect to the load balancer
     */
    @Config("collector.f5.password")
    @DefaultNull
    String getF5Password();

    /**
     * Default pool name to use when connecting to the load balancer
     *
     * @return the pool name used to connect to the load balancer
     */
    @Config("collector.f5.poolname")
    @DefaultNull
    String getF5PoolName();

    /**
     * Goodwill hostname. This is used for the ActiveMQ integration.
     *
     * @return Goodwill hostname
     */
    @Config("collector.goodwill.host")
    @Default("127.0.0.1")
    String getGoodwillHost();

    /**
     * Goodwill port. This is used for the ActiveMQ integration.
     *
     * @return Goodwill port
     */
    @Config("collector.goodwill.port")
    @Default("8080")
    int getGoodwillPort();

    /**
     * Whether the Goodwill integration is enabled. If so, events will be sent as Json to AMQ.
     *
     * @return true if Goodwill integration is enabled, false otherwise
     */
    @Config("collector.goodwill.enabled")
    @Default("false")
    boolean isGoodwillEnabled();

    /**
     * How often to refresh the cache from Goodwill, in seconds
     *
     * @return true if Goodwill integration is enabled, false otherwise
     */
    @Config("collector.goodwill.enabled")
    @Default("90")
    int getGoodwillCacheTimeout();
}
