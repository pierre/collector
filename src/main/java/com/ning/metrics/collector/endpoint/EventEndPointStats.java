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

package com.ning.metrics.collector.endpoint;

import com.google.inject.Inject;
import com.ning.metrics.serialization.util.Managed;
import com.ning.metrics.serialization.writer.EventRate;
import org.apache.log4j.Logger;
import org.joda.time.Period;

import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.serialization.event.Event;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

public class EventEndPointStats
{
	private static final int MAX_EVENT_TYPES = 100000;
	private static final Logger log  = Logger.getLogger(EventEndPointStats.class);

	private final AtomicLong totalEvents = new AtomicLong(0);
	private final AtomicLong filteredEvents = new AtomicLong(0);
	private final AtomicLong succesfulEvents = new AtomicLong(0);
	private final AtomicLong failedEvents = new AtomicLong(0);
	private final AtomicLong rejectedEvents  = new AtomicLong(0);
	private final ConcurrentMap<String, AtomicLong> successfulEventsByType = new ConcurrentHashMap<String, AtomicLong>();
	private final EventRate eventParseRate;
	private final EventRate successfulEventParseRate;
	private final EventRate failedEventParseRate;
	private final EventRate filteredEventParseRate;
	private final EventRate rejectedEventRate;
	private final int rateWindowSizeMinutes;

	@Inject
    public EventEndPointStats(CollectorConfig config)
    {
        this(config.getRateWindowSizeMinutes());
    }

	public EventEndPointStats(int rateWindowSizeMinutes)
	{
		this.rateWindowSizeMinutes = rateWindowSizeMinutes;
		eventParseRate = new EventRate(Period.minutes(rateWindowSizeMinutes));
		successfulEventParseRate = new EventRate(Period.minutes(rateWindowSizeMinutes));
		failedEventParseRate = new EventRate(Period.minutes(rateWindowSizeMinutes));
		filteredEventParseRate = new EventRate(Period.minutes(rateWindowSizeMinutes));
		rejectedEventRate = new EventRate(Period.minutes(rateWindowSizeMinutes));
	}

	public void updateTotalEvents()
	{
		totalEvents.incrementAndGet();
		eventParseRate.increment();
	}

	public void updateSuccessfulEvents()
	{
		succesfulEvents.incrementAndGet();
		successfulEventParseRate.increment();
	}

	public void updateSuccesfulEventCounters(Event event)
	{
		String eventTypeString = String.format("%s(%s)", event.getName(), event.getVersion());

		updateSuccessfulEvents();
		updateSuccessfulEventsByType(eventTypeString);
	}

	public void updateSuccessfulEventsByType(String eventType)
	{
		AtomicLong zeroCounter = new AtomicLong(0);
		AtomicLong counter = successfulEventsByType.putIfAbsent(eventType, zeroCounter);

		if (counter == null) {
			zeroCounter.incrementAndGet();
		}
		else {
			counter.incrementAndGet();
		}

		if (successfulEventsByType.size() > MAX_EVENT_TYPES) {
			successfulEventsByType.clear();
			log.info(String.format("max number of distinct event types seen (%d),  clearing successful stats by event type", MAX_EVENT_TYPES));
		}
	}

	public void updateFailedEvents()
	{
		failedEvents.incrementAndGet();
		failedEventParseRate.increment();
	}

	public void updateFilteredEvents()
	{
		filteredEvents.incrementAndGet();
		filteredEventParseRate.increment();
	}

	public void updateRejectedEvents()
	{
		rejectedEvents.incrementAndGet();
		rejectedEventRate.increment();
	}

	@Managed(description = "total events received while collector enabled")
	public long getTotalEvents()
	{
		return totalEvents.get();
	}

	@Managed(description = "events received while collector enabled that do not pass any filters")
	public long getFilteredEvents()
	{
		return filteredEvents.get();
	}

	@Managed(description = "events rejected due to collector buffer piling up")
	public long getRejectedEvents()
	{
		return rejectedEvents.get();
	}

	@Managed(description = "events received while enabled that pass filters, but failed to parse")
	public long getFailedToParseEvents()
	{
		return failedEvents.get();
	}

	@Managed(description = "events received while enabled that pass filters and parse successfully")
	public long getSuccessfulParseEvents()
	{
		return succesfulEvents.get();
	}

	@Managed
	public List<String> getSuccessfulParseEventsByType()
	{
		List<String> resultStringList = new ArrayList<String>();
		
		for (Map.Entry<String, AtomicLong> entry : successfulEventsByType.entrySet()) {
			resultStringList.add(String.format("%s = %d", entry.getKey(), entry.getValue().get()));
		}

		return resultStringList;
	}

	@Managed(description = "succesful event parse rate per minute")
	public long getSuccessfulEventsPerMinute()
	{
		return successfulEventParseRate.getRate() / rateWindowSizeMinutes;
	}

	@Managed(description = "failed event parse rate per minute")
	public long getFailedEventsPerMinute()
	{
		return failedEventParseRate.getRate() / rateWindowSizeMinutes;
	}

	@Managed(description = "filtered event parse rate per minute")
	public long getFilteredEventsPerMinute()
	{
		return filteredEventParseRate.getRate() / rateWindowSizeMinutes;
	}

	@Managed(description = "rejected event parse rate per minute")
	public long getRejectedEventsPerMinute()
	{
		return rejectedEventRate.getRate() / rateWindowSizeMinutes;
	}

	@Managed(description = "total event parse rate per minute")
	public long getEventsPerMinute()
	{
		return eventParseRate.getRate() / rateWindowSizeMinutes;
	}
}
