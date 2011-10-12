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

import org.atmosphere.cpr.AtmosphereResourceEvent;
import org.atmosphere.cpr.AtmosphereResourceEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EventsLogger implements AtmosphereResourceEventListener
{
    private static final Logger log = LoggerFactory.getLogger(EventsLogger.class);

    @Override
    public void onSuspend(final AtmosphereResourceEvent<HttpServletRequest, HttpServletResponse> event)
    {
        log.debug("onSuspend(): {}:{}", event.getResource().getRequest().getRemoteAddr(), event.getResource().getRequest().getRemotePort());
    }

    @Override
    public void onResume(final AtmosphereResourceEvent<HttpServletRequest, HttpServletResponse> event)
    {
        log.debug("onResume(): {}:{}", event.getResource().getRequest().getRemoteAddr(),
            event.getResource().getRequest().getRemotePort());
    }

    @Override
    public void onDisconnect(final AtmosphereResourceEvent<HttpServletRequest, HttpServletResponse> event)
    {
        log.debug("onDisconnect(): {}:{}", event.getResource().getRequest().getRemoteAddr(),
            event.getResource().getRequest().getRemotePort());
    }

    @Override
    public void onBroadcast(final AtmosphereResourceEvent<HttpServletRequest, HttpServletResponse> event)
    {
        log.debug("onBroadcast(): {}:{}", event.getResource().getRequest().getRemoteAddr(),
            event.getResource().getRequest().getRemotePort());
    }

    @Override
    public void onThrowable(final AtmosphereResourceEvent<HttpServletRequest, HttpServletResponse> event)
    {
        log.debug("onThrowable(): {}:{}", event.getResource().getRequest().getRemoteAddr(),
            event.getResource().getRequest().getRemotePort());
    }
}
