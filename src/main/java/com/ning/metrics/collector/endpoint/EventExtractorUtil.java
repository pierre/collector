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

import com.ning.metrics.serialization.event.Granularity;
import org.apache.commons.lang.StringUtils;
import org.joda.time.DateTime;

import javax.ws.rs.core.HttpHeaders;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Utility class to decode HTTP headers
 */
class EventExtractorUtil
{
    private static final Pattern REFERRER_PATTERN = Pattern.compile("^https?://([^/]+)(.*?)");

    public Granularity granularityFromString(final String granularityString)
    {
        if (StringUtils.isBlank(granularityString)) {
            return Granularity.HOURLY;
        }

        return Granularity.valueOf(granularityString.toUpperCase(Locale.US));
    }

    public DateTime dateFromDateTime(final DateTime eventDateTime)
    {
        if (eventDateTime != null) {
            return eventDateTime;
        }
        else {
            return new DateTime();
        }
    }

    public int contentLengthFromHeaders(final HttpHeaders httpHeaders) throws NumberFormatException
    {
        if (httpHeaders == null) {
            return 0;
        }

        final List<String> contentLengths = httpHeaders.getRequestHeader("Content-Length");
        if (contentLengths != null) {
            for (final String contentLengthHeader : contentLengths) {
                if (contentLengthHeader != null) {
                    return Integer.parseInt(contentLengthHeader);
                }
            }
        }

        return 0;
    }

    public String ipAddressFromHeaders(final HttpHeaders httpHeaders)
    {
        if (httpHeaders == null) {
            return null;
        }

        final List<String> headerValues = httpHeaders.getRequestHeader("X-Forwarded-For");

        if (headerValues != null) {
            for (final String value : headerValues) {
                if (!StringUtils.isEmpty(value)) {
                    for (final String requestor : value.split(",")) {
                        if (!StringUtils.isEmpty(requestor)) {
                            return requestor.trim();
                        }
                    }
                }
            }
        }

        return null;
    }

    public String getUserAgentFromHeaders(final HttpHeaders httpHeaders)
    {
        if (httpHeaders == null) {
            return null;
        }

        final List<String> userAgents = httpHeaders.getRequestHeader("User-Agent");

        if (userAgents != null) {
            for (final String userAgenTmp : userAgents) {
                if (!userAgenTmp.equals("")) {
                    return userAgenTmp;
                }
            }
        }

        return null;
    }

    public String getReferrerHostFromHeaders(final HttpHeaders httpHeaders)
    {
        final Matcher matcher = extractReferrer(httpHeaders);
        if (matcher == null) {
            return null;
        }
        else {
            return matcher.group(1);
        }
    }

    public String getReferrerPathFromHeaders(final HttpHeaders httpHeaders)
    {
        final Matcher matcher = extractReferrer(httpHeaders);
        if (matcher == null) {
            return null;
        }
        else {
            return matcher.group(2);
        }
    }

    private Matcher extractReferrer(final HttpHeaders httpHeaders)
    {
        if (httpHeaders == null) {
            return null;
        }

        final List<String> referrers = httpHeaders.getRequestHeader("Referer");

        if (referrers != null) {
            for (int i = 0, referrersSize = referrers.size(); i < referrersSize; i++) {
                final String referrer = referrers.get(i);
                if (referrer != null) {
                    final Matcher matcher = REFERRER_PATTERN.matcher(referrer);
                    if (matcher.matches()) {
                        return matcher;
                    }
                }
            }
        }

        return null;
    }
}
