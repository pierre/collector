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

package com.ning.metrics.collector.endpoint.extractors;

import com.ning.metrics.serialization.event.Event;

import java.util.Collection;
import java.util.LinkedList;

public class MockEventExtractor implements EventExtractor
{
    private boolean throwsEventParseException = false;
    private boolean throwsRuntimeException = false;
    private Event event = null;

    @Override
    public Collection<Event> extractEvent(final ExtractedAnnotation annotation) throws EventParsingException
    {
        if (throwsEventParseException) {
            throw new EventParsingException("IGNORE - Expected exception for tests");
        }

        if (throwsRuntimeException) {
            throw new RuntimeException("IGNORE - Expected exception for tests");
        }

        final Collection<Event> events = new LinkedList<Event>();
        events.add(event);
        return events;
    }

    public void setEvent(final Event event)
    {
        this.event = event;
    }

    public void setThrowsEventParseException(final boolean throwsEventParseException)
    {
        this.throwsEventParseException = throwsEventParseException;
    }

    public void setThrowsRuntimeException(final boolean throwsRuntimeException)
    {
        this.throwsRuntimeException = throwsRuntimeException;
    }
}
