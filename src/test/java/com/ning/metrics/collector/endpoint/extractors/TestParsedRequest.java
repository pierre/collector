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

import com.ning.metrics.collector.endpoint.ExtractedAnnotation;
import com.ning.metrics.collector.endpoint.MockHttpHeaders;
import com.ning.metrics.collector.endpoint.ParsedRequest;
import org.joda.time.DateTime;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.ws.rs.core.HttpHeaders;

public class TestParsedRequest
{
    private String host = null;
    private String path = null;
    private String userAgent = null;
    private String referer = null;
    private String ip = null;

    @BeforeMethod(alwaysRun = true)
    void setup()
    {
        host = "appname.ning.com";
        path = "/bazel/path/here";
        userAgent = "the-user-agent";
        referer = String.format("http://%s%s", host, path);
        ip = "167.1.2.3";
    }

    @Test(groups = "fast")
    public void testParseHost() throws Exception
    {
        final ParsedRequest parsedRequest = createParsedRequestWithNoQueryParameter();
        Assert.assertEquals(parsedRequest.getReferrerHost(), host);

        referer = null;
        final ParsedRequest emptyFieldParsedRequest = createParsedRequestWithNoQueryParameter();
        Assert.assertNull(emptyFieldParsedRequest.getReferrerHost());
    }

    @Test(groups = "fast")
    public void testParsePath() throws Exception
    {
        final ParsedRequest parsedRequest = createParsedRequestWithNoQueryParameter();
        Assert.assertEquals(parsedRequest.getReferrerPath(), path);

        referer = null;
        final ParsedRequest emptyFieldParsedRequest = createParsedRequestWithNoQueryParameter();
        Assert.assertNull(emptyFieldParsedRequest.getReferrerPath());
    }

    @Test(groups = "fast")
    public void testParseUserAgent() throws Exception
    {
        final ParsedRequest parsedRequest = createParsedRequestWithNoQueryParameter();
        Assert.assertEquals(parsedRequest.getUserAgent(), userAgent);

        userAgent = null;
        final ParsedRequest emptyFieldParsedRequest = createParsedRequestWithNoQueryParameter();
        Assert.assertNull(emptyFieldParsedRequest.getUserAgent());
    }

    @Test(groups = "fast")
    public void testParseIP() throws Exception
    {
        final ParsedRequest parsedRequest = createParsedRequestWithNoQueryParameter();
        Assert.assertEquals(parsedRequest.getIpAddress(), ip);

        ip = null;
        final ParsedRequest emptyFieldParsedRequest = createParsedRequestWithNoQueryParameter();
        Assert.assertNull(emptyFieldParsedRequest.getIpAddress());
    }

    @Test(groups = "fast")
    public void testParseDateExplicit() throws Exception
    {
        final HttpHeaders httpHeaders = createDummyHeaders();
        final ExtractedAnnotation parsedRequest = new ParsedRequest("DummyEvent", httpHeaders, new DateTime("2001-02-03"), null, null, DeserializationType.DEFAULT);
        Assert.assertEquals(parsedRequest.getDateTime(), new DateTime("2001-02-03"));
    }

    @Test(groups = "fast")
    public void testParseDateDefault() throws Exception
    {
        final long currentTime = System.currentTimeMillis();
        final ParsedRequest parsedRequest = createParsedRequestWithNoQueryParameter();
        final long timeDiff = Math.abs(parsedRequest.getDateTime().getMillis() - currentTime);
        Assert.assertTrue(timeDiff < 300, String.format("took %d millis just to create the sample event", timeDiff));
    }

    private HttpHeaders createDummyHeaders()
    {
        return new MockHttpHeaders(referer, userAgent, ip);
    }

    private ParsedRequest createParsedRequestWithNoQueryParameter()
    {
        final HttpHeaders httpHeaders = createDummyHeaders();
        return new ParsedRequest("DummyEvent", httpHeaders, null, null, null, DeserializationType.DEFAULT);
    }
}
