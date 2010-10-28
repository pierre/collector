/*
 * Copyright 2010 Ning, Inc.
 *
 * Ning licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.ning.metrics.collector.events.processing;

import com.ning.metrics.collector.endpoint.EventStats;
import com.ning.metrics.serialization.event.Event;

import java.util.ArrayList;
import java.util.List;

public class MockEventCollector implements EventCollector
{
    private final List<Event> eventList = new ArrayList<Event>();
    private boolean acceptsEvents;
    private boolean throwsException;

    public MockEventCollector(boolean acceptsEvents, boolean throwsException)
    {
        this.acceptsEvents = acceptsEvents;
        this.throwsException = throwsException;
    }

    @Override
    public boolean collectEvent(Event event, EventStats eventStats)
    {
        if (throwsException) {
            throw new RuntimeException();
        }

        if (acceptsEvents) {
            eventList.add(event);
        }

        return acceptsEvents;
    }

    public List<Event> getEventList()
    {
        return eventList;
    }

    public void setAcceptsEvents(boolean acceptsEvents)
    {
        this.acceptsEvents = acceptsEvents;
    }

    public void setThrowsException(boolean throwsException)
    {
        this.throwsException = throwsException;
    }
}
