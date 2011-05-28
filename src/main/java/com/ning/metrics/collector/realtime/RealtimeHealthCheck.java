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

package com.ning.metrics.collector.realtime;

import com.google.inject.Inject;
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.util.ComponentHealthCheck;
import com.ning.metrics.collector.util.HealthCheckStatus;

import java.util.Set;

public class RealtimeHealthCheck implements ComponentHealthCheck
{
    private final EventQueueProcessorImpl processor;
    private final GlobalEventQueueStats stats;
    private final CollectorConfig config;

    @Inject
    public RealtimeHealthCheck(final EventQueueProcessor processor, final GlobalEventQueueStats stats, final CollectorConfig config)
    {
        this.processor = (EventQueueProcessorImpl) processor;
        this.stats = stats;
        this.config = config;
    }

    @Override
    public HealthCheckStatus check()
    {
        HealthCheckStatus.Code status = HealthCheckStatus.Code.OK;
        String message;

        try {
            final StringBuilder builder = new StringBuilder();

            builder.append(String.format("enabled: %s, ", processor.isEnabled()));
            builder.append(String.format("running: %s, ", processor.isRunning()));
            builder.append(String.format("types: %s, ", processor.getTypesToCollect()));

            builder.append("queue sizes: {");
            int i = 1;
            final Set<String> eventTypes = stats.getAllStats().keySet();
            for (final String eventType : eventTypes) {
                final long queueSize = stats.getAllStats().get(eventType).getQueueSize();
                builder.append(String.format("%s: %d", eventType, queueSize));
                if (queueSize == config.getActiveMQBufferLength()) {
                    builder.append(" [FULL]");
                }

                if (i < eventTypes.size()) {
                    builder.append(", ");
                }
                i++;
            }
            builder.append("}, ");

            builder.append(String.format("enqueued: %s, ", stats.getEnqueuedEvents()));
            builder.append(String.format("sent: %s, ", stats.getSentEvents()));
            builder.append(String.format("dropped: %s, ", stats.getDroppedEvents())); // queue full
            builder.append(String.format("errored: %s, ", stats.getErroredEvents())); // AMQ error
            builder.append(String.format("ignored: %s", stats.getIgnoredEvents())); // system disabled

            message = builder.toString();

            if (processor.isEnabled() && !processor.isRunning()) {
                status = HealthCheckStatus.Code.ERROR;
            }
        }
        catch (Exception e) {
            status = HealthCheckStatus.Code.ERROR;
            message = "Exception when trying to access realtime subsystem";
        }

        return new HealthCheckStatus("RealtimeHealthCheck", status, message);
    }
}
