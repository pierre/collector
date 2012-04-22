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

package com.ning.metrics.collector.endpoint.resources;

import com.ning.metrics.serialization.event.Event;

import scribe.thrift.LogEntry;

import java.util.ArrayList;
import java.util.List;

public class MockScribeEventHandler extends ScribeEventHandler
{
    private boolean throwExceptionBeforeEvent = false;
    private boolean throwExceptionAfterEvent = false;
    private boolean handleFailureThrowsException = false;
    private final List<Event> processedEventList = new ArrayList<Event>();
    private boolean handleFailureCalled = false;
    private boolean fakeCollectorFailure = false;

    public MockScribeEventHandler()
    {
        super(null, true);
    }

    @Override
    public boolean processEvent(final Event event)
    {
        if (throwExceptionBeforeEvent) {
            throw new RuntimeException();
        }

        if (fakeCollectorFailure) {
            return false;
        }

        processedEventList.add(event);

        if (throwExceptionAfterEvent) {
            throw new RuntimeException();
        }

        return true;
    }

    @Override
    public void handleFailure(final LogEntry entry)
    {
        handleFailureCalled = true;

        if (handleFailureThrowsException) {
            throw new RuntimeException();
        }
    }

    public void setThrowExceptionAfterEvent(final boolean throwExceptionAfterEvent)
    {
        this.throwExceptionAfterEvent = throwExceptionAfterEvent;
    }

    public void setThrowExceptionBeforeEvent(final boolean throwExceptionBeforeEvent)
    {
        this.throwExceptionBeforeEvent = throwExceptionBeforeEvent;
    }

    public void setFakeCollectorFailure(final boolean fakeCollectorFailure)
    {
        this.fakeCollectorFailure = fakeCollectorFailure;
    }

    public List<Event> getProcessedEventList()
    {
        return processedEventList;
    }

    public boolean isHandleFailureCalled()
    {
        return handleFailureCalled;
    }

    public void setHandleFailureThrowsException(final boolean handleFailureThrowsException)
    {
        this.handleFailureThrowsException = handleFailureThrowsException;
    }
}
