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
import org.joda.time.DateTime;

import java.io.InputStream;

// TODO this needs some clean-up, because various fields are filled in at various times and it's unclear when, for instance,
// we can expect eventName to actually be filled in (if at all)
public interface ExtractedAnnotation
{
    String getEventName();

    DateTime getDateTime();

    String getReferrerHost();

    String getReferrerPath();

    String getIpAddress();

    String getUserAgent();

    Granularity getBucketGranularity();

    int getContentLength();

    InputStream getInputStream();

    DeserializationType getContentType();
}
