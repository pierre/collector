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
import org.joda.time.DateTime;

import javax.ws.rs.core.HttpHeaders;

public interface EventExtractorUtil
{
    public Granularity granularityFromString(String granularityString);

    public DateTime dateFromDateTime(DateTime eventDateTime);

    public int contentLengthFromHeaders(HttpHeaders httpHeaders);

    public String ipAddressFromHeaders(HttpHeaders httpHeaders);

    public String getUserAgentFromHeaders(HttpHeaders httpHeaders);

    public String getReferrerHostFromHeaders(HttpHeaders httpHeaders);

    public String getReferrerPathFromHeaders(HttpHeaders httpHeaders);
}
