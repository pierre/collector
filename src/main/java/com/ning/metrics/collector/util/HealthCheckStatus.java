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

package com.ning.metrics.collector.util;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;

public class HealthCheckStatus
{
    public static enum Code
    {
        OK,
        ERROR
    }

    private final String type;
    private final Code code;
    private final String message;

    @JsonCreator
    public HealthCheckStatus(@JsonProperty("type") final String type, @JsonProperty("code") final Code code, @JsonProperty("message") final String message)
    {
        this.type = type;
        this.code = code;
        this.message = message;
    }

    public String getType()
    {
        return this.type;
    }

    public Code getCode()
    {
        return this.code;
    }

    public String getMessage()
    {
        return message;
    }
}