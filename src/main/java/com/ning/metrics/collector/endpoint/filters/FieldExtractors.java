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

package com.ning.metrics.collector.endpoint.filters;

import com.ning.metrics.collector.events.parsing.ExtractedAnnotation;

public enum FieldExtractors implements FieldExtractor
{
    HOST
        {
            @Override
            public String getField(String eventName, ExtractedAnnotation annotation)
            {
                return annotation.getReferrerHost();
            }
        },
    IP
        {
            @Override
            public String getField(String eventName, ExtractedAnnotation annotation)
            {
                return annotation.getIpAddress();
            }
        },
    USERAGENT
        {
            @Override
            public String getField(String eventName, ExtractedAnnotation annotation)
            {
                return annotation.getUserAgent();
            }
        },
    PATH
        {
            @Override
            public String getField(String eventName, ExtractedAnnotation annotation)
            {
                return annotation.getReferrerPath();
            }
        },
    EVENT_TYPE
        {
            @Override
            public String getField(String eventName, ExtractedAnnotation annotation)
            {
                return eventName;
            }
        },
}
