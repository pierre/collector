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

import com.ning.metrics.collector.endpoint.resources.ScribeEventRequestHandler;
import org.joda.time.DateTime;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import scribe.thrift.LogEntry;
import scribe.thrift.ResultCode;

import java.util.ArrayList;
import java.util.List;

public class TestScribeEventRequestHandler
{
    private EventEndPointStats stats = null;
    private MockScribeEventHandler eventHandler = null;
    private ScribeEventRequestHandler eventRequestHandler = null;
    private final String MSG = String.format("%s:msg", new DateTime().getMillis());

    @BeforeMethod(alwaysRun = true)
    void setup()
    {
        stats = new EventEndPointStats(5);
        eventHandler = new MockScribeEventHandler(stats);
        eventRequestHandler = new ScribeEventRequestHandler(eventHandler);
    }

    @Test(groups = "fast")
    public void testSuccess() throws Exception
    {
        List<LogEntry> logEntries = new ArrayList<LogEntry>();
        logEntries.add(new LogEntry("RequestLogEvent", MSG));
        Assert.assertEquals(eventRequestHandler.Log(logEntries), ResultCode.OK);

        Assert.assertEquals(eventHandler.getProcessedEventList().size(), 1);
        Assert.assertEquals(eventHandler.getProcessedEventList().get(0).getName(), "RequestLogEvent");
        Assert.assertEquals(stats.getTotalEvents(), 1);
        Assert.assertEquals(stats.getSuccessfulParseEvents(), 1);
        Assert.assertEquals(stats.getFailedToParseEvents(), 0);
    }

    @Test(groups = "fast")
    public void testUnsupportedEvent() throws Exception
    {
        List<LogEntry> logEntries = new ArrayList<LogEntry>();
        logEntries.add(new LogEntry("MalEncodedMessage", "msg"));
        Assert.assertEquals(eventRequestHandler.Log(logEntries), ResultCode.OK);

        Assert.assertEquals(eventHandler.getProcessedEventList().size(), 0);
        Assert.assertEquals(stats.getTotalEvents(), 1);
        Assert.assertEquals(stats.getSuccessfulParseEvents(), 0);
        Assert.assertEquals(stats.getFailedToParseEvents(), 1);
    }

    @Test(groups = "fast")
    public void testCollectorFailure() throws Exception
    {
        eventHandler.setFakeCollectorFailure(true);
        List<LogEntry> logEntries = new ArrayList<LogEntry>();
        logEntries.add(new LogEntry("RequestLogEvent", null));
        Assert.assertEquals(eventRequestHandler.Log(logEntries), ResultCode.OK);

        Assert.assertEquals(eventHandler.isHandleFailureCalled(), true);
        Assert.assertEquals(eventHandler.getProcessedEventList().size(), 0);
        Assert.assertEquals(stats.getTotalEvents(), 1);
        Assert.assertEquals(stats.getSuccessfulParseEvents(), 0);
        Assert.assertEquals(stats.getFailedToParseEvents(), 1);
        Assert.assertEquals(stats.getRejectedEvents(), 0);
    }
}
