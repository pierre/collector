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

package com.ning.metrics.collector.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Test class to make sure we are using the right version of log4j at runtime
 */
public class TestLog4J
{

    /**
     * Test the following error:
     * <p/>
     * Exception in thread "Thread-7" java.lang.NoSuchMethodError: org.apache.log4j.Logger.log(Ljava/lang/String;Lorg/apache/log4j/Level;Ljava/lang/Object;Ljava/lang/Throwable;)V
     * at org.slf4j.impl.Log4jLoggerAdapter.warn(Log4jLoggerAdapter.java:312)
     * at org.apache.thrift.server.TNonblockingServer$FrameBuffer.internalRead(TNonblockingServer.java:727)
     * at org.apache.thrift.server.TNonblockingServer$FrameBuffer.read(TNonblockingServer.java:508)
     * at org.apache.thrift.server.TNonblockingServer$SelectThread.handleRead(TNonblockingServer.java:412)
     * at org.apache.thrift.server.TNonblockingServer$SelectThread.select(TNonblockingServer.java:357)
     * at org.apache.thrift.server.TNonblockingServer$SelectThread.run(TNonblockingServer.java:301)
     *
     * @throws Exception test exception
     */
    @Test(groups = "fast")
    public void testAdapter() throws Exception
    {
        final Logger logger = LoggerFactory.getLogger(TestLog4J.class.getName());
        logger.warn("Got an IOException in internalRead!", new Exception("IGNORE - Expected exception for tests"));
        Assert.assertTrue(true);
    }
}
