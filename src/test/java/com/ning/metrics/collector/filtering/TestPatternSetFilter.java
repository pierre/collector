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

package com.ning.metrics.collector.filtering;

import com.ning.metrics.collector.endpoint.ParsedRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class TestPatternSetFilter
{
    @Test(groups = "fast")
    public void testNullValue() throws Exception
    {
        final Filter<ParsedRequest> filter = new PatternSetFilter(createFieldExtractor(null), createPatternSet("pattern1", "pattern2"));
        Assert.assertEquals(filter.passesFilter(null, null), false);
    }

    @Test(groups = "fast")
    public void testEmptySetPatternEventRESTRequestFilter() throws Exception
    {
        final Filter<ParsedRequest> filter = new PatternSetFilter(createFieldExtractor("test-host"), Collections.<Pattern>emptySet());
        Assert.assertEquals(filter.passesFilter(null, null), false);
    }

    @Test(groups = "fast")
    public void testSinglePatternEventRESTRequestFilter() throws Exception
    {
        final Filter<ParsedRequest> filterShouldMatch = new PatternSetFilter(createFieldExtractor("test-host"), createPatternSet("test-host"));
        Assert.assertEquals(filterShouldMatch.passesFilter(null, null), true);

        final Filter<ParsedRequest> filterDoesNotMatch = new PatternSetFilter(createFieldExtractor("test-host"), createPatternSet("mugen"));
        Assert.assertEquals(filterDoesNotMatch.passesFilter(null, null), false);
    }

    @Test(groups = "fast")
    public void testMultiplePatternEventRESTRequestFilter() throws Exception
    {
        final Filter<ParsedRequest> trueFilter = new PatternSetFilter(createFieldExtractor("test-host"), createPatternSet("test-host", "nothing"));
        Assert.assertTrue(trueFilter.passesFilter(null, null));

        final Filter<ParsedRequest> falseFilter = new PatternSetFilter(createFieldExtractor("test-host"), createPatternSet("mugen", "nothing"));
        Assert.assertFalse(falseFilter.passesFilter(null, null));
    }
    
    @Test(groups = "fast")
    public void testSinglePatternEventInclusionFilter() throws Exception
    {
        final Filter<ParsedRequest> filterShouldMatch = new EventInclusionFilter(createFieldExtractor("test-host"), createPatternSet("test-host"));
        Assert.assertEquals(filterShouldMatch.passesFilter(null, null), false);

        final Filter<ParsedRequest> filterDoesNotMatch = new EventInclusionFilter(createFieldExtractor("test-host"), createPatternSet("mugen"));
        Assert.assertEquals(filterDoesNotMatch.passesFilter(null, null), true);
    }

    private Set<Pattern> createPatternSet(final String... patterns)
    {
        final Set<Pattern> patternSet = new HashSet<Pattern>();

        for (final String str : patterns) {
            patternSet.add(Pattern.compile(str));
        }

        return patternSet;
    }

    private FieldExtractor createFieldExtractor(final String value)
    {
        return new FieldExtractor()
        {
            @Override
            public String getField(final String eventName, final ParsedRequest annotation)
            {
                return value;
            }
        };
    }
}