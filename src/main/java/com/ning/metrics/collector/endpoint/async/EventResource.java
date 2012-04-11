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

package com.ning.metrics.collector.endpoint.async;

import com.google.inject.Inject;
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.collector.realtime.EventListenerDispatcher;
import com.ning.metrics.collector.realtime.EventsLogger;
import com.ning.metrics.collector.realtime.NewEventListener;
import com.sun.jersey.api.view.Viewable;
import org.atmosphere.cpr.Broadcaster;
import org.atmosphere.cpr.BroadcasterFactory;
import org.atmosphere.jersey.SuspendResponse;
import org.atmosphere.jersey.util.JerseySimpleBroadcaster;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.MediaType.TEXT_HTML;

@Path("/a")
public class EventResource
{
    private static final String APPLICATION_JSONP = "application/x-javascript";

    private final CollectorConfig config;
    private final EventListenerDispatcher dispatcher;

    @Inject
    public EventResource(final CollectorConfig config, final EventListenerDispatcher dispatcher)
    {
        this.config = config;
        this.dispatcher = dispatcher;
    }

    @GET
    @Produces(TEXT_HTML)
    public Viewable welcome()
    {
        return new Viewable("index.html");
    }

    @Path("/event")
    @GET
    @Produces({APPLICATION_JSON, APPLICATION_JSONP})
    public SuspendResponse subscribe(@PathParam("type") @DefaultValue(EventListenerDispatcher.NO_FILTER_KEY) final Broadcaster feed,
                                     @QueryParam("type") @DefaultValue(EventListenerDispatcher.NO_FILTER_KEY) final String eventType,
                                     @DefaultValue("callback") @QueryParam("jsonp") final String callback)
    {
        // Use the original one, if it exists
        Broadcaster broadcaster = feed;
        if (feed == null || feed.getAtmosphereResources().size() == 0) {
            broadcaster = BroadcasterFactory.getDefault().lookup(JerseySimpleBroadcaster.class, eventType);
            if (broadcaster == null) {
                broadcaster = BroadcasterFactory.getDefault().lookup(JerseySimpleBroadcaster.class, eventType, true);
                final NewEventListener listener = new NewEventListener(config, broadcaster, callback);
                dispatcher.addListener(eventType, listener);
            }
        }

        return new SuspendResponse.SuspendResponseBuilder<String>()
            .broadcaster(broadcaster)
            .resumeOnBroadcast(false)
            .outputComments(true)
            .addListener(new EventsLogger())
            .build();
    }
}
