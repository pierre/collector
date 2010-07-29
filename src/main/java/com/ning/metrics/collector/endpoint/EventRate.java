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

import org.joda.time.DateTime;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableDateTime;
import org.joda.time.ReadablePeriod;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

public class EventRate
{
	private static final int MAX_EVENT_QUEUE_SIZE = 1000;

	private final BlockingDeque<Map.Entry<DateTime, AtomicInteger>> queue = new LinkedBlockingDeque<Map.Entry<DateTime, AtomicInteger>>();
	private int rate = 0;
	private final ReadablePeriod rateWindow;
	private final BlockingDeque<DateTime> dateTimeQueue = new LinkedBlockingDeque<DateTime>();

	public EventRate(ReadablePeriod rateWindow)
	{
		this.rateWindow = rateWindow;
	}

	public void increment()
	{
		dateTimeQueue.add(truncateToSecond(getNow()));

		if (dateTimeQueue.size() > MAX_EVENT_QUEUE_SIZE) {
			updateRate();
		}
	}

	public long getRate()
	{
		updateRate();

		return rate;
	}

	private synchronized void updateRate()
	{
		List<DateTime> eventList = new ArrayList<DateTime>();
		dateTimeQueue.drainTo(eventList);

		for (DateTime dateTime : eventList) {
			rate++;
			Map.Entry<DateTime, AtomicInteger> lastPair = queue.peekLast();

			if (lastPair != null && lastPair.getKey().equals(dateTime)) {
				lastPair.getValue().incrementAndGet();
			}
			else {
				queue.add(new AbstractMap.SimpleImmutableEntry<DateTime, AtomicInteger>(dateTime, new AtomicInteger(1)));
			}

		}

		DateTime now = getNow();

		while (!queue.isEmpty() && !queue.peekFirst().getKey().plus(rateWindow).isAfter(now)) {
			Map.Entry<DateTime, AtomicInteger> firstPair = queue.pollFirst();
			rate -= firstPair.getValue().get();
		}
	}

    public DateTime truncateToSecond(ReadableDateTime time)
    {
        MutableDateTime result = new MutableDateTime(time);
        result.setMillisOfSecond(0);
        return new DateTime(result);
    }

    //hook for unit testing
	protected DateTime getNow()
	{
		return new DateTime();
	}
}
