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

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableDateTime;

public class DateTimeUtil
{
    public DateTime truncateToHour()
    {
        return truncateToHour(new DateTime());
    }

    public DateTime truncateToMinute()
    {
        return truncateToMinute(new DateTime());
    }

    public DateTime truncateToMinute(ReadableDateTime time)
    {
        MutableDateTime result = new MutableDateTime(time);
        result.setMillisOfSecond(0);
        result.setSecondOfMinute(0);
        return new DateTime(result);
    }

    public DateTime truncateToHour(ReadableDateTime time)
    {
        MutableDateTime result = new MutableDateTime(time);
        result.setMillisOfSecond(0);
        result.setSecondOfMinute(0);
        result.setMinuteOfHour(0);
        return new DateTime(result);
    }

    public DateTime truncateToDay()
    {
        return truncateToDay(new DateTime());
    }

    public DateTime truncateToDay(ReadableDateTime time)
    {
        MutableDateTime result = new MutableDateTime(time);
        result.setMillisOfSecond(0);
        result.setSecondOfMinute(0);
        result.setMinuteOfHour(0);
        result.setHourOfDay(0);
        return new DateTime(result);
    }

    public DateTime truncateToMonth()
    {
        return truncateToMonth(new DateTime());
    }

    public DateTime truncateToMonth(ReadableDateTime time)
    {
        MutableDateTime result = new MutableDateTime(time);
        result.setMillisOfSecond(0);
        result.setSecondOfMinute(0);
        result.setMinuteOfHour(0);
        result.setHourOfDay(0);
        result.setDayOfMonth(1);
        return new DateTime(result);
    }

    public DateTime truncateToWeek()
    {
        return truncateToWeek(new DateTime());
    }

    public DateTime truncateToWeek(ReadableDateTime time)
    {
        MutableDateTime result = new MutableDateTime(time);
        result.setMillisOfSecond(0);
        result.setSecondOfMinute(0);
        result.setMinuteOfHour(0);
        result.setHourOfDay(0);
        result.setHourOfDay(0);

        if (time.getDayOfWeek() != 7) {
            result.setDayOfWeek(1);
            result.add(Days.ONE.multipliedBy(-1));
        }

        return new DateTime(result);
    }

    public DateTime truncateToYear()
    {
        return truncateToYear(new DateTime());
    }

    public DateTime truncateToYear(ReadableDateTime time)
    {
        MutableDateTime result = new MutableDateTime(time);
        result.setMillisOfSecond(0);
        result.setSecondOfMinute(0);
        result.setMinuteOfHour(0);
        result.setHourOfDay(0);
        result.setDayOfMonth(1);
        result.setMonthOfYear(1);
        return new DateTime(result);
    }
}

