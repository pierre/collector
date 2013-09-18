/*
 * Copyright 2010-2012 Ning, Inc.
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

package com.ning.metrics.collector.guice.providers;

import com.ning.metrics.collector.filtering.EventInclusionFilter;
import com.ning.metrics.collector.filtering.FieldExtractor;
import com.ning.metrics.collector.filtering.PatternSetFilter;
import com.google.inject.Inject;
import com.google.inject.Provider;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class EventFilterProvider implements Provider<PatternSetFilter>
{
    private final FieldExtractor fieldExtractor;
    private final Set<Pattern> patternSet = new HashSet<Pattern>();
    private final boolean isEventInclusionFilter;

    @Inject
    public EventFilterProvider(final FieldExtractor fieldExtractor, final String patternListString, final String delimiter, final boolean isEventInclusionFilter)
    {
        this.fieldExtractor = fieldExtractor;
        this.isEventInclusionFilter = isEventInclusionFilter;

        if (patternListString != null && !patternListString.isEmpty()) {
            for (final String str : patternListString.split(delimiter)) {
                patternSet.add(Pattern.compile(str));
            }
        }
    }

    @Override
    public PatternSetFilter get()
    {   
        return isEventInclusionFilter ? new EventInclusionFilter(fieldExtractor, patternSet) : new PatternSetFilter(fieldExtractor, patternSet);
    }
}
