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

package com.ning.metrics.collector.endpoint;

import com.ning.metrics.collector.endpoint.extractors.DeserializationType;
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
    private static final EventExtractorUtil eventExtractorUtil = new EventExtractorUtil();

    private final String eventName;
    private final DateTime eventDateTime;
    private String ipAddress;
    private String referrerHost = null;
    private String referrerPath = null;
    private String userAgent = null;
    private final Granularity granularity;
    private int contentLength = 0;
    private DeserializationType contentType;
    private InputStream inputStream;

    /**
     * Constructor used by the external API (GET only)
     *
     * @param eventName         name of the event parsed
     * @param httpHeaders       HTTP headers of the incoming request
     * @param eventDateTime     query value parameter (optional)
     * @param granularityString query value parameter (optional)
     * @param peerIpAddress     requestor (peer) IP address (optional)
     * @param contentType       deserialization type (BASE_64_QUERY or DECIMAL_QUERY)
     */
    public ParsedRequest(
        final String eventName,
        final HttpHeaders httpHeaders,
        final DateTime eventDateTime,
        final String granularityString,
        final String peerIpAddress,
        final DeserializationType contentType
    )
    {
        this(eventName, httpHeaders, null, eventDateTime, granularityString, peerIpAddress, contentType);
    }

    /**
     * Constructor used by the internal API (POST only)
     *
     * @param eventName         name of the event parsed
     * @param httpHeaders       HTTP headers of the incoming request
     * @param inputStream       content of the POST request
     * @param eventDateTime     query value parameter (optional)
     * @param granularityString query value parameter (optional)
     * @param peerIpAddress     requestor (peer) IP address (optional)
     * @param contentType       Content-Type of the POST request (optional)
     */
    public ParsedRequest(
        final String eventName,
        final HttpHeaders httpHeaders,
        final InputStream inputStream,
        final DateTime eventDateTime,
        final String granularityString,
        final String peerIpAddress,
        final DeserializationType contentType
    )
    {
        this.eventName = eventName;

        this.eventDateTime = eventExtractorUtil.dateFromDateTime(eventDateTime);

        granularity = eventExtractorUtil.granularityFromString(granularityString);

        referrerHost = eventExtractorUtil.getReferrerHostFromHeaders(httpHeaders);
        referrerPath = eventExtractorUtil.getReferrerPathFromHeaders(httpHeaders);

        ipAddress = eventExtractorUtil.ipAddressFromHeaders(httpHeaders);
        if (ipAddress == null) {
            ipAddress = peerIpAddress;
        }

        try {
            contentLength = eventExtractorUtil.contentLengthFromHeaders(httpHeaders);
        }
        catch (NumberFormatException e) {
            log.warn(String.format("Illegal Content-Length header"), e);
            throw new WebApplicationException(e, Response.Status.INTERNAL_SERVER_ERROR);
        }

        this.contentType = contentType;
        this.inputStream = inputStream;

        userAgent = eventExtractorUtil.getUserAgentFromHeaders(httpHeaders);
    }

    @Override
    public String getEventName()
    {
        return eventName;
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
    public DeserializationType getContentType()
    {
        return contentType;
    }

    @Override
    public InputStream getInputStream()
    {
        return inputStream;
    }

    @Override
    public String toString()
    {
        final StringBuilder builder = new StringBuilder();
        builder.append(String.format("name: %s, ", eventName == null ? "NULL" : eventName));
        builder.append(String.format("date: %s, ", eventDateTime == null ? "NULL" : eventDateTime));
        builder.append(String.format("referrerHost: %s, ", referrerHost == null ? "NULL" : referrerHost));
        builder.append(String.format("referrerPath: %s, ", referrerPath == null ? "NULL" : referrerPath));
        builder.append(String.format("ip: %s, ", ipAddress == null ? "NULL" : ipAddress));
        builder.append(String.format("ua: %s, ", userAgent == null ? "NULL" : userAgent));
        builder.append(String.format("granularity: %s, ", granularity == null ? "NULL" : granularity));
        builder.append(String.format("contentLength: %d, ", contentLength));
        builder.append(String.format("contentType: %s", contentType == null ? "NULL" :  contentType));
        return builder.toString();
    }
}
