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

package com.ning.metrics.collector.hadoop.processing;

import com.google.inject.Inject;
import com.ning.metrics.collector.binder.config.CollectorConfig;
import org.testng.Assert;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import java.io.File;

@Guice(modules = ConfigTestModule.class)
public class TestLocalSpoolManager
{
    @Inject
    CollectorConfig config;

    @Test(groups = "fast")
    public void testReverseEngineerFilename() throws Exception
    {
        LocalSpoolManager spoolManager;

        try {
            spoolManager = new LocalSpoolManager(config, new File(""));
            Assert.fail();
        }
        catch (IllegalArgumentException e) {
            Assert.assertTrue(true);
        }

        spoolManager = new LocalSpoolManager(config, new File("127.0.0.1-8080-pYb2-2011-05-27T15.42.03.124.FrontDoorVisit.smile"));
        Assert.assertEquals(spoolManager.getEventName(), "FrontDoorVisit");
        Assert.assertEquals(spoolManager.getSerializationType(), SerializationType.SMILE);
        Assert.assertEquals(spoolManager.getTimeStamp(), LocalSpoolManager.dateFormatter.parseDateTime("2011-05-27T15.42.03.124"));

        spoolManager = new LocalSpoolManager(config, new File("10.18.81.236-8080-pYb2-2011-06-24T17.29.18.143.FrontDoorVisit.thrift"));
        Assert.assertEquals(spoolManager.getEventName(), "FrontDoorVisit");
        Assert.assertEquals(spoolManager.getSerializationType(), SerializationType.THRIFT);
        Assert.assertEquals(spoolManager.getTimeStamp(), LocalSpoolManager.dateFormatter.parseDateTime("2011-06-24T17.29.18.143"));

        spoolManager = new LocalSpoolManager(config, new File("10.18.81.236-8080-pYb2-2011-06-23T19.57.36.124.Homepage.thrift"));
        Assert.assertEquals(spoolManager.getEventName(), "Homepage");
        Assert.assertEquals(spoolManager.getSerializationType(), SerializationType.THRIFT);
        Assert.assertEquals(spoolManager.getTimeStamp(), LocalSpoolManager.dateFormatter.parseDateTime("2011-06-23T19.57.36.124"));
    }
}
