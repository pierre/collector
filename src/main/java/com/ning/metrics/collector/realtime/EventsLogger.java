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
import org.atmosphere.cpr.AtmosphereResourceEvent;
import org.atmosphere.cpr.AtmosphereResourceEventListener;
import org.atmosphere.cpr.Broadcaster;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EventsLogger implements AtmosphereResourceEventListener
{
    private static final Logger log = LoggerFactory.getLogger(EventsLogger.class);

    private final EventListenerDispatcher dispatcher;
    private final String eventType;
    private final NewEventListener listener;

    public EventsLogger(final CollectorConfig config, final EventListenerDispatcher dispatcher, final Broadcaster broadcaster, final String callback, final String eventType)
    {
        this.dispatcher = dispatcher;
        this.eventType = eventType;
        listener = new NewEventListener(config, broadcaster, callback, eventType);
    }

    @Override
    public void onSuspend(final AtmosphereResourceEvent<HttpServletRequest, HttpServletResponse> httpServletRequestHttpServletResponseAtmosphereResourceEvent)
    {
        dispatcher.addListener(listener);
        log.info("Added listener for " + eventType);
    }

    @Override
    public void onResume(final AtmosphereResourceEvent<HttpServletRequest, HttpServletResponse> httpServletRequestHttpServletResponseAtmosphereResourceEvent)
    {
        dispatcher.removeListener(listener);
        log.info("Removed listener for " + eventType);
    }

    @Override
    public void onDisconnect(final AtmosphereResourceEvent<HttpServletRequest, HttpServletResponse> httpServletRequestHttpServletResponseAtmosphereResourceEvent)
    {
        dispatcher.removeListener(listener);
        log.info("Removed listener for " + eventType);
    }

    @Override
    public void onBroadcast(final AtmosphereResourceEvent<HttpServletRequest, HttpServletResponse> httpServletRequestHttpServletResponseAtmosphereResourceEvent)
    {
    }

    @Override
    public void onThrowable(final AtmosphereResourceEvent<HttpServletRequest, HttpServletResponse> httpServletRequestHttpServletResponseAtmosphereResourceEvent)
    {
        dispatcher.removeListener(listener);
        log.info("Removed listener for " + eventType);
    }
}
