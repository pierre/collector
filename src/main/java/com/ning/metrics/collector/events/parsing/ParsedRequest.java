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

package com.ning.metrics.collector.events.parsing;

import com.ning.metrics.serialization.event.Granularity;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import java.io.InputStream;

public class ParsedRequest implements ExtractedAnnotation
{
    private static final Logger log = Logger.getLogger(ParsedRequest.class);

    private DateTime eventDateTime;
    private String ipAddress;
    private String referrerHost = null;
    private String referrerPath = null;
    private String userAgent = null;
    private Granularity granularity;
    private int contentLength = 0;
    private InputStream inputStream;

    /**
     * Constructor used by the external API (GET only)
     *
     * @param httpHeaders       HTTP headers of the incoming request
     * @param eventDateTime     query value parameter (optional)
     * @param granularityString query value parameter (optional)
     * @param extractorUtil     implementation of EventExtractorUtil
     */
    public ParsedRequest(
        HttpHeaders httpHeaders,
        DateTime eventDateTime,
        String granularityString,
        EventExtractorUtil extractorUtil
    )
    {
        this(httpHeaders, null, eventDateTime, granularityString, extractorUtil);
    }

    /**
     * Constructor used by the internal API (POST only)
     *
     * @param httpHeaders       HTTP headers of the incoming request
     * @param inputStream       content of the POST request
     * @param eventDateTime     query value parameter (optional)
     * @param granularityString query value parameter (optional)
     * @param extractorUtil     implementation of EventExtractorUtil
     */
    public ParsedRequest(
        HttpHeaders httpHeaders,
        InputStream inputStream,
        DateTime eventDateTime,
        String granularityString,
        EventExtractorUtil extractorUtil
    )
    {
        this.eventDateTime = extractorUtil.dateFromDateTime(eventDateTime);

        granularity = extractorUtil.granularityFromString(granularityString);

        referrerHost = extractorUtil.getReferrerHostFromHeaders(httpHeaders);
        referrerPath = extractorUtil.getReferrerPathFromHeaders(httpHeaders);

        ipAddress = extractorUtil.ipAddressFromHeaders(httpHeaders);

        try {
            contentLength = extractorUtil.contentLengthFromHeaders(httpHeaders);
        }
        catch (NumberFormatException e) {
            log.warn(String.format("Illegal Content-Length header"), e);
            throw new WebApplicationException(e, Response.Status.INTERNAL_SERVER_ERROR);
        }

        this.inputStream = inputStream;

        userAgent = extractorUtil.getUserAgentFromHeaders(httpHeaders);
    }

    @Override
    public DateTime getDateTime()
    {
        return eventDateTime;
    }

    @Override
    public String getReferrerHost()
    {
        return referrerHost;
    }

    @Override
    public String getReferrerPath()
    {
        return referrerPath;
    }

    @Override
    public String getIpAddress()
    {
        return ipAddress;
    }

    @Override
    public String getUserAgent()
    {
        return userAgent;
    }

    @Override
    public Granularity getBucketGranularity()
    {
        return granularity;
    }

    @Override
    public int getContentLength()
    {
        return contentLength;
    }

    @Override
    public InputStream getInputStream()
    {
        return inputStream;
    }
}
