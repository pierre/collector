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
import org.codehaus.jackson.map.util.JSONPObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class NewEventListener
{
    private static final Logger log = LoggerFactory.getLogger(NewEventListener.class);

    private final Broadcaster broadcaster;
    private final String callback;
    private final EventFormatter eventFormatter;

    public NewEventListener(final CollectorConfig config, final Broadcaster broadcaster, final String callback)
    {
        this.broadcaster = broadcaster;
        this.callback = callback;
        eventFormatter = new EventFormatter(config);
    }

    public void onNewEvent(final Event event)
    {
        String eventString = (String) eventFormatter.getFormattedEvent(event);
        // Prepend the event name for json (it's already there for Thrift without a schema)
        if (!eventString.startsWith(event.getName())) {
            eventString = String.format("%s: %s", event.getName(), eventString);
        }

        final Response response = prepareResponse(eventString);
        log.debug("Broadcasting event: " + eventString);
        // This is asynchronous
        broadcaster.broadcast(response);
    }

    private Response prepareResponse(final String formattedEvent)
    {
        // See issue https://jersey.dev.java.net/issues/show_bug.cgi?id=461 that explain
        // why we need to manually set the content-type.
        return Response.ok(new JSONPObject(callback, formattedEvent))
            .header("Content-Type", MediaType.APPLICATION_JSON_TYPE)
            .build();
    }
}
