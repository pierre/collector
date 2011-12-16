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

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestGlobalEventQueueStats
{
    private GlobalEventQueueStats stats;
    private EventQueueStats localStats1;
    private EventQueueStats localStats2;
    private EventQueueStats localStats3;

    @BeforeTest(alwaysRun = true)
    public void setup() throws Exception
    {
        stats = new GlobalEventQueueStats();
        localStats1 = stats.createLocalStats("MyType1", new ArrayList<Object>(), 10);
        localStats2 = stats.createLocalStats("MyType2", new ArrayList<Object>(), 10);
        localStats3 = stats.createLocalStats("MyType3", new ArrayList<Object>(), 10);
    }

    @Test(groups = "fast")
    public void testGetEventEnqueued() throws Exception
    {
        localStats1.registerEventEnqueued();
        Assert.assertEquals(stats.getEnqueuedEvents(), 1);
        localStats2.registerEventEnqueued();
        Assert.assertEquals(stats.getEnqueuedEvents(), 2);
        localStats3.registerEventEnqueued();
        Assert.assertEquals(stats.getEnqueuedEvents(), 3);
        localStats1.registerEventEnqueued();
        Assert.assertEquals(stats.getEnqueuedEvents(), 4);
    }

    @Test(groups = "fast")
    public void testGetEventDropped() throws Exception
    {
        localStats1.registerEventDropped();
        Assert.assertEquals(stats.getDroppedEvents(), 1);
        localStats2.registerEventDropped();
        Assert.assertEquals(stats.getDroppedEvents(), 2);
        localStats3.registerEventDropped();
        Assert.assertEquals(stats.getDroppedEvents(), 3);
        localStats1.registerEventDropped();
        Assert.assertEquals(stats.getDroppedEvents(), 4);
    }

    @Test(groups = "fast")
    public void testGetEventSent() throws Exception
    {
        localStats1.registerEventSent();
        Assert.assertEquals(stats.getSentEvents(), 1);
        localStats2.registerEventSent();
        Assert.assertEquals(stats.getSentEvents(), 2);
        localStats3.registerEventSent();
        Assert.assertEquals(stats.getSentEvents(), 3);
        localStats1.registerEventSent();
        Assert.assertEquals(stats.getSentEvents(), 4);
    }

    @Test(groups = "fast")
    public void testGetEventErrored() throws Exception
    {
        localStats1.registerEventSendingErrored();
        Assert.assertEquals(stats.getErroredEvents(), 1);
        localStats2.registerEventSendingErrored();
        Assert.assertEquals(stats.getErroredEvents(), 2);
        localStats3.registerEventSendingErrored();
        Assert.assertEquals(stats.getErroredEvents(), 3);
        localStats1.registerEventSendingErrored();
        Assert.assertEquals(stats.getErroredEvents(), 4);
    }

    @Test(groups = "fast")
    public void testRegisterEventIgnored() throws Exception
    {
        stats.registerEventIgnored();
        Assert.assertEquals(stats.getIgnoredEvents(), 1);
        stats.registerEventIgnored();
        Assert.assertEquals(stats.getIgnoredEvents(), 2);
    }

    @Test(groups = "fast")
    public void testClear() throws Exception
    {
        localStats1.registerEventEnqueued();
        Assert.assertEquals(stats.getEnqueuedEvents(), 1);
        localStats2.registerEventDropped();
        Assert.assertEquals(stats.getDroppedEvents(), 1);
        localStats3.registerEventSent();
        Assert.assertEquals(stats.getSentEvents(), 1);
        localStats1.registerEventSendingErrored();
        Assert.assertEquals(stats.getErroredEvents(), 1);
        stats.registerEventIgnored();

        stats.clear();

        Assert.assertEquals(stats.getEnqueuedEvents(), 0);
        Assert.assertEquals(stats.getDroppedEvents(), 0);
        Assert.assertEquals(stats.getSentEvents(), 0);
        Assert.assertEquals(stats.getErroredEvents(), 0);
        Assert.assertEquals(stats.getIgnoredEvents(), 0);
    }
}
