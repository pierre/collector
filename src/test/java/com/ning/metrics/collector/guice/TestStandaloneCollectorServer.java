/*
 * Copyright 2010-2012 Ning, Inc.
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

package com.ning.metrics.collector.guice;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.regex.Pattern;

public class TestStandaloneCollectorServer
{
    @Test(groups = "fast")
    public void testResourcesRegex() throws Exception
    {
        final Pattern pattern = Pattern.compile(ServerModule.EVENTS_RESOURCES_PATTERN);
        Assert.assertFalse(pattern.matcher("/a").matches());
        Assert.assertFalse(pattern.matcher("/a/event").matches());
        Assert.assertTrue(pattern.matcher("/1?v=Hello,sWorld").matches());
        Assert.assertTrue(pattern.matcher("/2?v=TestEvent,1-,20,4z,810").matches());
        Assert.assertTrue(pattern.matcher("/rest/1.0/event?name=EventType").matches());
        Assert.assertTrue(pattern.matcher("/rest/1.0/event?name=EventType&date=2009-01-02T03:04:05.006Z").matches());
    }

    @Test(groups = "fast")
    public void testAsyncRegex() throws Exception
    {
        final Pattern pattern = Pattern.compile(ServerModule.ASYNC_RESOURCES_PATTERN);
        Assert.assertTrue(pattern.matcher("/a").matches());
        Assert.assertTrue(pattern.matcher("/a/event").matches());
        Assert.assertFalse(pattern.matcher("/1?v=Hello,sWorld").matches());
        Assert.assertFalse(pattern.matcher("/2?v=TestEvent,1-,20,4z,810").matches());
        Assert.assertFalse(pattern.matcher("/rest/1.0/event?name=EventType").matches());
        Assert.assertFalse(pattern.matcher("/rest/1.0/event?name=EventType&date=2009-01-02T03:04:05.006Z").matches());
    }
}
