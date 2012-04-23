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

import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.serialization.event.Event;
import org.atmosphere.cpr.Broadcaster;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.core.Response;

public class NewEventListener
{
    private static final Logger log = LoggerFactory.getLogger(NewEventListener.class);

    private final Broadcaster broadcaster;
    private final EventFormatter eventFormatter;

    public NewEventListener(final CollectorConfig config, final Broadcaster broadcaster)
    {
        this.broadcaster = broadcaster;
        eventFormatter = new EventFormatter(config);
    }

    public void onNewEvent(final Event event)
    {
        String eventString = (String) eventFormatter.getFormattedEvent(event);
        // Prepend the event name for json (it's already there for Thrift without a schema)
        if (!eventString.startsWith(event.getName())) {
            eventString = String.format("%s: %s", event.getName(), eventString);
        }

        final Response response = Response.ok(eventString).build();
        log.debug("Broadcasting event: " + eventString);
        // This is asynchronous
        broadcaster.broadcast(response);
    }
}
