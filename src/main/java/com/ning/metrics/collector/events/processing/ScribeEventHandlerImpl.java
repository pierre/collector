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

package com.ning.metrics.collector.events.processing;

import com.google.inject.Inject;
import com.ning.metrics.serialization.util.Managed;
import com.ning.metrics.collector.binder.annotations.ScribeStats;
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.endpoint.EventEndPointStats;
import com.ning.metrics.collector.endpoint.EventStats;
import com.ning.metrics.serialization.event.Event;
import org.apache.log4j.Logger;
import scribe.thrift.LogEntry;

public class ScribeEventHandlerImpl implements ScribeEventHandler
{
    private static final Logger logger = Logger.getLogger(ScribeEventHandlerImpl.class);

    private final EventCollector collector;
    private volatile boolean scribeCollectionEnabled;
    private final EventEndPointStats stats;

    @Inject
    public ScribeEventHandlerImpl(
        EventCollector collector,
        CollectorConfig config,
        @ScribeStats EventEndPointStats endPointStats
    )
    {
        this(collector, config.isScribeCollectionEnabled(), endPointStats);
    }

    public ScribeEventHandlerImpl(
        EventCollector collector,
        boolean enabled,
        EventEndPointStats stats)
    {
        this.collector = collector;
        this.scribeCollectionEnabled = enabled;
        this.stats = stats;
    }

    @Override
    public boolean processEvent(Event event, EventStats eventStats)
    {
        assert event != null;
        boolean success;

        stats.updateTotalEvents();

        if (scribeCollectionEnabled) {
            logger.debug(String.format("Processing event of type [%s], collection enabled", event.getName()));

            success = collector.collectEvent(event, eventStats);
            if (success) {
                stats.updateSuccesfulEventCounters(event);
                logger.debug(String.format("Event accepted: %s", event.getData()));
            }
            else {
                stats.updateRejectedEvents();
                logger.warn(String.format("Event rejected: %s", event.getData()));
            }
        }
        else {
            stats.updateRejectedEvents();
            logger.debug(String.format("Rejecting event [%s], collection disabled", event));
            success = true;
        }
        return success;
    }

    @Override
    public void handleFailure(LogEntry l, EventStats eventStats)
    {
        logger.warn(String.format("Error parsing request type: %s", l));
        stats.updateTotalEvents();
        stats.updateFailedEvents();
    }

    @Managed(description = "enable/disable collection of events")
    public void setScribeCollectionEnabled(boolean value)
    {
        scribeCollectionEnabled = value;
    }

    @Managed(description = "event collection enabled?")
    public boolean getScribeCollectionEnabled()
    {
        return scribeCollectionEnabled;
    }
}
