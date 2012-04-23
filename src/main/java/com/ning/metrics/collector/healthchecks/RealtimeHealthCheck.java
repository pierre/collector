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

package com.ning.metrics.collector.healthchecks;

import com.ning.metrics.collector.realtime.EventQueueProcessor;
import com.ning.metrics.collector.realtime.EventQueueProcessorImpl;
import com.ning.metrics.collector.realtime.GlobalEventQueueStats;

import com.google.inject.Inject;
import com.yammer.metrics.core.HealthCheck;

public class RealtimeHealthCheck extends HealthCheck
{
    private final EventQueueProcessorImpl processor;
    private final GlobalEventQueueStats stats;

    @Inject
    public RealtimeHealthCheck(final EventQueueProcessor processor, final GlobalEventQueueStats stats)
    {
        super(RealtimeHealthCheck.class.getName());
        this.processor = (EventQueueProcessorImpl) processor;
        this.stats = stats;
    }

    @Override
    public Result check()
    {
        try {
            final StringBuilder builder = new StringBuilder();

            builder.append(String.format("enabled: %s, ", processor.isEnabled()));
            builder.append(String.format("running: %s, ", processor.isRunning()));
            builder.append(String.format("types: %s, ", processor.getTypesToCollect()));
            builder.append(String.format("queue sizes: {%s}, ", stats.toString()));
            builder.append(String.format("enqueued: %s, ", stats.getEnqueuedEvents()));
            builder.append(String.format("sent: %s, ", stats.getSentEvents()));
            builder.append(String.format("dropped: %s, ", stats.getDroppedEvents())); // queue full
            builder.append(String.format("errored: %s, ", stats.getErroredEvents())); // AMQ error
            builder.append(String.format("ignored: %s", stats.getIgnoredEvents())); // system disabled

            final String message = builder.toString();

            if (processor.isEnabled() && !processor.isRunning()) {
                return Result.unhealthy(message);
            }
            else {
                return Result.healthy(message);
            }
        }
        catch (Exception e) {
            return Result.unhealthy("Exception when trying to access realtime subsystem");
        }
    }
}
