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

import com.ning.metrics.collector.endpoint.filters.OrFilter;
import com.ning.metrics.collector.events.parsing.ExtractedAnnotation;
import com.ning.metrics.collector.util.Filter;

import java.util.Arrays;
import java.util.Collections;

@SuppressWarnings("unchecked")
public class TestOrFilter
{
    private static final Filter TRUE_FILTER = new Filter<ExtractedAnnotation>()
    {
        @Override
        public boolean passesFilter(String eventName, ExtractedAnnotation request)
        {
            return true;
        }
    };

    private static final Filter FALSE_FILTER = new Filter<ExtractedAnnotation>()
    {
        @Override
        public boolean passesFilter(String eventName, ExtractedAnnotation request)
        {
            return false;
        }
    };

    @Test(groups = "fast")
    public void testEmptySetFilterFilter() throws Exception
    {
        Filter filter = new OrFilter(Collections.<Filter>emptyList());
        Assert.assertEquals(filter.passesFilter(null, null), false);
    }

    @Test(groups = "fast")
    public void testSingleFilter() throws Exception
    {
        Filter trueFilter = new OrFilter(Arrays.asList(TRUE_FILTER));
        Assert.assertEquals(trueFilter.passesFilter(null, null), true);

        Filter falseFilter = new OrFilter(Arrays.asList(FALSE_FILTER));
        Assert.assertEquals(falseFilter.passesFilter(null, null), false);
    }

    @Test(groups = "fast")
    public void testMultipleFilters() throws Exception
    {
        Filter trueFilter = new OrFilter(Arrays.asList(TRUE_FILTER, FALSE_FILTER));
        Assert.assertEquals(trueFilter.passesFilter(null, null), true);

        Filter falseFilter = new OrFilter(Arrays.asList(FALSE_FILTER, FALSE_FILTER));
        Assert.assertEquals(falseFilter.passesFilter(null, null), false);
    }
}