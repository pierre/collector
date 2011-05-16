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

package com.ning.metrics.collector.events.parsing;

import com.ning.metrics.serialization.event.Granularity;
import org.joda.time.DateTime;

import java.io.InputStream;

public interface ExtractedAnnotation
{
    public DateTime getDateTime();

    public String getReferrerHost();

    public String getReferrerPath();

    public String getIpAddress();

    public String getUserAgent();

    public Granularity getBucketGranularity();

    public int getContentLength();

    public InputStream getInputStream();

    public String getContentType();
}