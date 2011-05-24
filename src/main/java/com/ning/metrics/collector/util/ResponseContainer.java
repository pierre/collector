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

import org.codehaus.jackson.annotate.JsonIgnore;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

import java.util.List;

/**
 * Container that is then rendered as
 * {@code
 * &#123;
 * "formatVersion" : "1",
 * "location" : "/foo/bar",
 * "generated" : "2009-08-07T06:05:04.231Z",
 * "size" : "1",
 * "items" : [&#123; ... &#125;]
 * &#125;
 * }
 * Of these, formatVersion, location and items are required to be present.
 */
public class ResponseContainer
{
    public static final String VERSION = "1";

    private final DateTimeFormatter dateFormatter = ISODateTimeFormat.dateTime().withZone(DateTimeZone.UTC);
    private String formatVersion = VERSION;
    private String location;
    private Integer size;
    private String generated;
    private List<HealthCheckStatus> items;

    public String getFormatVersion()
    {
        return formatVersion;
    }

    public void setFormatVersion(final String formatVersion)
    {
        this.formatVersion = formatVersion;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(final String location)
    {
        this.location = location;
    }

    public Integer getSize()
    {
        return size;
    }

    public void setSize(final Integer size)
    {
        this.size = size;
    }

    public String getGenerated()
    {
        return generated;
    }

    public void setGenerated(final String generated)
    {
        this.generated = generated;
    }

    @JsonIgnore
    public void setGenerated(final DateTime dateTime)
    {
        setGenerated(dateFormatter.print(dateTime));
    }

    public List<HealthCheckStatus> getItems()
    {
        return items;
    }

    public void setItems(final List<HealthCheckStatus> items)
    {
        this.items = items;
    }
}
