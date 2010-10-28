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

package com.ning.metrics.collector.endpoint;

import com.ning.metrics.serialization.writer.EventRate;
import org.joda.time.DateTime;
import org.joda.time.MutableDateTime;
import org.joda.time.Period;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEventRate
{
	@Test(groups = "fast")
	public void testZeroEndRate() throws Exception
	{
		MutableDateTime theDate = new MutableDateTime("2009-01-01T00:00:00");
		EventRate rate = createRate(theDate, 5);

		rate.increment();
		rate.increment();
		theDate.addMinutes(4);
		Assert.assertEquals(rate.getRate(), 2);
		theDate.addMinutes(1);
		Assert.assertEquals(rate.getRate(), 0);
	}

	@Test(groups = "fast")
	public void testZeroInitRate() throws Exception
	{
		MutableDateTime theDate = new MutableDateTime("2009-01-01T00:00:00");
		EventRate rate = createRate(theDate, 5);

		Assert.assertEquals(rate.getRate(), 0);
	}

	@Test(groups = "fast")
	public void testNormalRateChange() throws Exception
	{
		MutableDateTime theDate = new MutableDateTime("2009-01-01T00:00:00");
		EventRate rate = createRate(theDate, 5);

		rate.increment();
		rate.increment();
		theDate.addMinutes(4);
		Assert.assertEquals(rate.getRate(), 2);
		rate.increment();
		Assert.assertEquals(rate.getRate(), 3);
		theDate.addMinutes(1);
		Assert.assertEquals(rate.getRate(), 1);
	}

	private EventRate createRate(final MutableDateTime theDate, int minutes)
	{
		EventRate rate = new EventRate(Period.minutes(minutes))
		{
			@Override
			protected DateTime getNow()
			{
				return theDate.toDateTime();
			}
		};
		return rate;
	}
}