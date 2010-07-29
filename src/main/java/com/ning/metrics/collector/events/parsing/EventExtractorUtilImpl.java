/*
 * Copyright 2010 Ning, Inc.
 *
 * Ning licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.ning.metrics.collector.events.parsing;

import com.ning.metrics.collector.util.Granularity;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;

import javax.ws.rs.core.HttpHeaders;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EventExtractorUtilImpl implements EventExtractorUtil
{
    private static final Pattern REFERRER_PATTERN = Pattern.compile("^https?://([^/]+)(.*?)");

    private static final Logger log = Logger.getLogger(EventExtractorUtilImpl.class);

    @Override
    public Granularity granularityFromString(String granularityString)
    {
        if (StringUtils.isBlank(granularityString)) {
            return Granularity.HOURLY;
        }

        return Granularity.valueOf(granularityString.toUpperCase());
    }

    @Override
    public DateTime dateFromDateTime(DateTime eventDateTime)
    {
        if (eventDateTime != null) {
            return eventDateTime;
        }
        else {
            return new DateTime();
        }
    }

    @Override
    public int contentLengthFromHeaders(HttpHeaders httpHeaders) throws NumberFormatException
    {
        if (httpHeaders == null) {
            return 0;
        }

        final List<String> contentLengths = httpHeaders.getRequestHeader("Content-Length");
        if (contentLengths != null) {
            for (String contentLengthHeader : contentLengths) {
                if (contentLengthHeader != null) {
                    return Integer.parseInt(contentLengthHeader);
                }
            }
        }

        return 0;
    }

    @Override
    public String ipAddressFromHeaders(HttpHeaders httpHeaders)
    {
        if (httpHeaders == null) {
            return null;
        }

        List<String> headerValues = httpHeaders.getRequestHeader("X-Forwarded-For");

        if (headerValues != null) {
            for (String value : headerValues) {
                if (!StringUtils.isEmpty(value)) {
                    for (String requestor : value.split(",")) {
                        if (!StringUtils.isEmpty(requestor)) {
                            return requestor.trim();
                        }
                    }
                }
            }
        }

        return null;
    }

    @Override
    public String getUserAgentFromHeaders(HttpHeaders httpHeaders)
    {
        if (httpHeaders == null) {
            return null;
        }

        final List<String> userAgents = httpHeaders.getRequestHeader("User-Agent");

        if (userAgents != null) {
            for (String userAgenTmp : userAgents) {
                if (!userAgenTmp.equals("")) {
                    return userAgenTmp;
                }
            }
        }

        return null;
    }

    @Override
    public String getReferrerHostFromHeaders(HttpHeaders httpHeaders)
    {
        Matcher matcher = extractReferrer(httpHeaders);
        if (matcher == null) {
            return null;
        }
        else {
            return matcher.group(1);
        }
    }

    @Override
    public String getReferrerPathFromHeaders(HttpHeaders httpHeaders)
    {
        Matcher matcher = extractReferrer(httpHeaders);
        if (matcher == null) {
            return null;
        }
        else {
            return matcher.group(2);
        }
    }

    private Matcher extractReferrer(HttpHeaders httpHeaders)
    {
        if (httpHeaders == null) {
            return null;
        }

        final List<String> referrers = httpHeaders.getRequestHeader("Referer");

        if (referrers != null) {
            for (int i = 0, referrersSize = referrers.size(); i < referrersSize; i++) {
                String referrer = referrers.get(i);
                if (referrer != null) {
                    Matcher matcher = REFERRER_PATTERN.matcher(referrer);
                    if (matcher.matches()) {
                        return matcher;
                    }
                }
            }
        }

        return null;
    }
}
