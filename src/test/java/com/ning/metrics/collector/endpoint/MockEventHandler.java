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

package com.ning.metrics.collector.endpoint;

import com.ning.metrics.collector.endpoint.resources.EventHandler;
import com.ning.metrics.serialization.event.Event;

import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

public class MockEventHandler implements EventHandler
{

    private boolean throwExceptionBeforeEvent = false;
    private boolean throwExceptionAfterEvent = false;
    private final List<Event> processedEventList = new ArrayList<Event>();
    private boolean handleFailureCalled = false;

    @Override
    public Response processEvent(final Event event, final ExtractedAnnotation annotation, final EventEndPointStats stats, final EventStats eventStats)
    {
        stats.updateTotalEvents();

        if (throwExceptionBeforeEvent) {
            throw new RuntimeException("IGNORE - Expected exception for tests");
        }

        processedEventList.add(event);

        if (throwExceptionAfterEvent) {
            throw new RuntimeException("IGNORE - Expected exception for tests");
        }

        stats.updateSuccessfulEvents();

        return Response.status(Response.Status.ACCEPTED).build();
    }

    @Override
    public Response handleFailure(final Response.Status s, final EventEndPointStats stats, final Exception e)
    {
        handleFailureCalled = true;

        stats.updateFailedEvents();

        return Response.status(s)
            .header("Warning", "199 " + e.toString())
            .build();
    }

    public void setThrowExceptionAfterEvent(final boolean throwExceptionAfterEvent)
    {
        this.throwExceptionAfterEvent = throwExceptionAfterEvent;
    }

    public void setThrowExceptionBeforeEvent(final boolean throwExceptionBeforeEvent)
    {
        this.throwExceptionBeforeEvent = throwExceptionBeforeEvent;
    }

    public List<Event> getProcessedEventList()
    {
        return processedEventList;
    }

    public boolean isHandleFailureCalled()
    {
        return handleFailureCalled;
    }
}
