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

package com.ning.metrics.collector.endpoint.resources;

import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.processing.EventCollector;
import com.ning.metrics.serialization.event.Event;

import com.google.inject.Inject;
import com.yammer.metrics.Metrics;
import com.yammer.metrics.core.Meter;
import com.yammer.metrics.core.MetricName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.weakref.jmx.Managed;
import scribe.thrift.LogEntry;

import java.util.concurrent.TimeUnit;

public class ScribeEventHandler
{
    private static final Logger log = LoggerFactory.getLogger(ScribeEventHandler.class);

    private final EventCollector collector;

    private volatile boolean scribeCollectionEnabled;

    private final Meter receivedMeter = Metrics.newMeter(new MetricName(ScribeEventHandler.class.getPackage().getName(), "ScribeStats", "Received"), "events", TimeUnit.SECONDS);
    private final Meter succeededMeter = Metrics.newMeter(new MetricName(ScribeEventHandler.class.getPackage().getName(), "ScribeStats", "Succeeded"), "events", TimeUnit.SECONDS);
    private final Meter rejectedMeter = Metrics.newMeter(new MetricName(ScribeEventHandler.class.getPackage().getName(), "ScribeStats", "Rejected"), "events", TimeUnit.SECONDS);
    private final Meter corruptedMeter = Metrics.newMeter(new MetricName(ScribeEventHandler.class.getPackage().getName(), "ScribeStats", "Corrupted"), "events", TimeUnit.SECONDS);

    @Inject
    public ScribeEventHandler(final EventCollector collector, final CollectorConfig config)
    {
        this(collector, config.isScribeCollectionEnabled());
    }

    //@VisibleForTesting
    ScribeEventHandler(final EventCollector collector, final boolean enabled)
    {
        this.collector = collector;
        this.scribeCollectionEnabled = enabled;
    }

    public boolean processEvent(final Event event)
    {
        receivedMeter.mark();

        final boolean success;
        if (scribeCollectionEnabled) {
            log.debug(String.format("Processing event of type [%s], collection enabled", event.getName()));

            success = collector.collectEvent(event);
            if (success) {
                succeededMeter.mark();
                log.debug(String.format("Event accepted: %s", event.getData()));
            }
            else {
                rejectedMeter.mark();
                log.warn(String.format("Event rejected: %s", event.getData()));
            }
        }
        else {
            rejectedMeter.mark();
            log.debug(String.format("Rejecting event [%s], collection disabled", event));
            success = true;
        }

        return success;
    }

    public void handleFailure(final LogEntry l)
    {
        corruptedMeter.mark();
        log.warn(String.format("Error parsing request type: %s", l));
    }

    @Managed(description = "enable/disable collection of events")
    public void setScribeCollectionEnabled(final boolean value)
    {
        scribeCollectionEnabled = value;
    }

    @Managed(description = "event collection enabled?")
    public boolean getScribeCollectionEnabled()
    {
        return scribeCollectionEnabled;
    }
}
