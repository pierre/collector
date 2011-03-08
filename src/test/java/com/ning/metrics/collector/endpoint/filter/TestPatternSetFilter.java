/*
 * Copyright 2010 Ning, Inc.
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

package com.ning.metrics.collector.endpoint.filter;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ning.metrics.collector.endpoint.filters.FieldExtractor;
import com.ning.metrics.collector.endpoint.filters.PatternSetFilter;
import com.ning.metrics.collector.events.parsing.ExtractedAnnotation;
import com.ning.metrics.collector.util.Filter;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

@SuppressWarnings("unchecked")
public class TestPatternSetFilter
{
    @Test(groups = "fast")
    public void testNullValue() throws Exception
    {
        Filter filter = new PatternSetFilter(createFieldExtractor(null), createPatternSet("pattern1", "pattern2"));
        Assert.assertEquals(filter.passesFilter(null, null), false);
    }

    @Test(groups = "fast")
    public void testEmptySetPatternEventRESTRequestFilter() throws Exception
    {
        Filter filter = new PatternSetFilter(createFieldExtractor("test-host"), Collections.<Pattern>emptySet());
        Assert.assertEquals(filter.passesFilter(null, null), false);
    }

    @Test(groups = "fast")
    public void testSinglePatternEventRESTRequestFilter() throws Exception
    {
        Filter filterShouldMatch = new PatternSetFilter(createFieldExtractor("test-host"), createPatternSet("test-host"));
        Assert.assertEquals(filterShouldMatch.passesFilter(null, null), true);

        Filter filterDoesNotMatch = new PatternSetFilter(createFieldExtractor("test-host"), createPatternSet("mugen"));
        Assert.assertEquals(filterDoesNotMatch.passesFilter(null, null), false);
    }

    @Test(groups = "fast")
    public void testMultiplePatternEventRESTRequestFilter() throws Exception
    {
        Filter trueFilter = new PatternSetFilter(createFieldExtractor("test-host"), createPatternSet("test-host", "nothing"));
        Assert.assertTrue(trueFilter.passesFilter(null, null));

        Filter falseFilter = new PatternSetFilter(createFieldExtractor("test-host"), createPatternSet("mugen", "nothing"));
        Assert.assertFalse(falseFilter.passesFilter(null, null));
    }

    private Set<Pattern> createPatternSet(String... patterns)
    {
        Set<Pattern> patternSet = new HashSet<Pattern>();

        for (String str : patterns) {
            patternSet.add(Pattern.compile(str));
        }

        return patternSet;
    }

    private FieldExtractor createFieldExtractor(final String value)
    {
        return new FieldExtractor()
        {
            @Override
            public String getField(String eventName, ExtractedAnnotation annotation)
            {
                return value;
            }
        };
    }
}