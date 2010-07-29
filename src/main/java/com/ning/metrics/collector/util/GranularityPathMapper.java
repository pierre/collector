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

package com.ning.metrics.collector.util;

import org.joda.time.ReadableDateTime;
import org.joda.time.ReadableInterval;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GranularityPathMapper implements PathMapper
{
    private final String prefix;
    private final Granularity granularity;

    public GranularityPathMapper(String prefix, Granularity granularity)
    {
        this.prefix = prefix;
        this.granularity = granularity;
    }

    public String getPrefix()
    {
        return prefix;
    }

    public String getRootPath()
    {
        return prefix;
    }

    public Granularity getGranularity()
    {
        return granularity;
    }

    public Collection<String> getPathsForInterval(ReadableInterval interval)
    {
        final List<String> paths = new ArrayList<String>();

        granularity.stepThroughInterval(interval, new Granularity.Callback<RuntimeException>()
        {
            public void step(ReadableInterval stepInterval) throws RuntimeException
            {
                paths.add(getPathForDateTime(stepInterval.getStart()));
            }
        });

        return paths;
    }

    public String getPathForDateTime(ReadableDateTime dateTime)
    {
        return String.format("%s/%s", prefix, granularity.getRelativePathFor(dateTime));
    }
}
