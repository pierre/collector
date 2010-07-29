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
import org.joda.time.Hours;
import org.joda.time.Interval;
import org.joda.time.Minutes;
import org.joda.time.Months;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableDateTime;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePeriod;
import org.joda.time.Weeks;
import org.joda.time.Years;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum Granularity
{
    MINUTE(Minutes.ONE)
        {
            @Override
            public <T extends Throwable> void stepThroughInterval(ReadableInterval interval, Callback<T> callback) throws T
            {
                DateTime start = dateTimeUtil.truncateToMinute(interval.getStart());
                while (start.isBefore(interval.getEnd())) {
                    callback.step(new Interval(start, Minutes.ONE));

                    start = start.plus(Minutes.ONE);
                }
            }

            @Override
            public DateTime getNow()
            {
                return dateTimeUtil.truncateToMinute();
            }

            @Override
            public DateTime truncate(ReadableDateTime date)
            {
                return dateTimeUtil.truncateToMinute(date);
            }

            @Override
            public String getRelativePathFor(ReadableDateTime date)
            {
                return String.format("%s/%02d/%02d/%02d/%02d", date.getYear(), date.getMonthOfYear(), date.getDayOfMonth(), date.getHourOfDay(), date.getMinuteOfHour());
            }
        },
    HOURLY(Hours.ONE)
        {
            @Override
            public <T extends Throwable> void stepThroughInterval(ReadableInterval interval, Callback<T> callback) throws T
            {
                DateTime start = dateTimeUtil.truncateToHour(interval.getStart());
                while (start.isBefore(interval.getEnd())) {
                    callback.step(new Interval(start, Hours.ONE));

                    start = start.plus(Hours.ONE);
                }
            }

            @Override
            public DateTime getNow()
            {
                return dateTimeUtil.truncateToHour();
            }

            @Override
            public DateTime truncate(ReadableDateTime date)
            {
                return dateTimeUtil.truncateToHour(date);
            }

            @Override
            public String getRelativePathFor(ReadableDateTime date)
            {
                return String.format("%s/%02d/%02d/%02d", date.getYear(), date.getMonthOfYear(), date.getDayOfMonth(), date.getHourOfDay());
            }
        },
    DAILY(Days.ONE)
        {
            @Override
            public <T extends Throwable> void stepThroughInterval(ReadableInterval interval, Callback<T> callback) throws T
            {
                DateTime start = dateTimeUtil.truncateToDay(interval.getStart());
                while (start.isBefore(interval.getEnd())) {
                    callback.step(new Interval(start, Days.ONE));

                    start = start.plus(Days.ONE);
                }
            }

            @Override
            public DateTime getNow()
            {
                return dateTimeUtil.truncateToDay();
            }

            @Override
            public DateTime truncate(ReadableDateTime date)
            {
                return dateTimeUtil.truncateToDay(date);
            }

            @Override
            public String getRelativePathFor(ReadableDateTime date)
            {
                return String.format("%s/%02d/%02d", date.getYear(), date.getMonthOfYear(), date.getDayOfMonth());
            }
        },

    WEEKLY(Weeks.ONE)
        {
            @Override
            public <T extends Throwable> void stepThroughInterval(ReadableInterval interval, Callback<T> callback) throws T
            {
                DateTime start = dateTimeUtil.truncateToWeek(interval.getStart());
                while (start.isBefore(interval.getEnd())) {
                    DateTime end = start.plusWeeks(1);
                    callback.step(new Interval(start, end));

                    start = end;
                }
            }

            @Override
            public DateTime getNow()
            {
                return dateTimeUtil.truncateToWeek();
            }

            @Override
            public DateTime truncate(ReadableDateTime date)
            {
                return dateTimeUtil.truncateToWeek(date);
            }

            @Override
            public String getRelativePathFor(ReadableDateTime date)
            {
                return String.format("%s/%02d/%02d", date.getYear(), date.getMonthOfYear(), date.getDayOfMonth());
            }
        },

    MONTHLY(Months.ONE)
        {
            @Override
            public <T extends Throwable> void stepThroughInterval(ReadableInterval interval, Callback<T> callback) throws T
            {
                ReadableDateTime start = dateTimeUtil.truncateToMonth(interval.getStart());
                while (start.isBefore(interval.getEnd())) {
                    MutableDateTime end = new MutableDateTime(start);

                    int month = start.getMonthOfYear() + 1;

                    if (month > 12) {
                        month -= 12;
                        end.setYear(end.getYear() + 1);
                    }
                    end.setMonthOfYear(month);

                    callback.step(new Interval(start, end));

                    start = end;
                }
            }

            @Override
            public DateTime getNow()
            {
                return dateTimeUtil.truncateToMonth();
            }

            @Override
            public DateTime truncate(ReadableDateTime date)
            {
                return dateTimeUtil.truncateToMonth(date);
            }

            @Override
            public String getRelativePathFor(ReadableDateTime date)
            {
                return String.format("%s/%02d", date.getYear(), date.getMonthOfYear());
            }
        },

    YEARLY(Years.ONE)
        {
            @Override
            public <T extends Throwable> void stepThroughInterval(ReadableInterval interval, Callback<T> callback) throws T
            {
                ReadableDateTime start = dateTimeUtil.truncateToYear(interval.getStart());
                while (start.isBefore(interval.getEnd())) {
                    MutableDateTime end = new MutableDateTime(start);

                    end.setYear(start.getYear() + 1);
                    callback.step(new Interval(start, end));

                    start = end;
                }
            }

            @Override
            public DateTime getNow()
            {
                return dateTimeUtil.truncateToYear();
            }

            @Override
            public DateTime truncate(ReadableDateTime date)
            {
                return dateTimeUtil.truncateToYear(date);
            }

            @Override
            public String getRelativePathFor(ReadableDateTime date)
            {
                return String.format("%s", date.getYear());
            }
        },;

    public static final String GRANULARITY_QUERY_PARAM = "gr";
    private static final DateTimeUtil dateTimeUtil = new DateTimeUtil();

    public static interface Callback<T extends Throwable>
    {
        public void step(ReadableInterval stepInterval) throws T;
    }

    private final ReadablePeriod period;

    Granularity(ReadablePeriod period)
    {
        this.period = period;
    }

    public ReadablePeriod getPeriod()
    {
        return period;
    }

    public List<ReadableDateTime> forwardSteps(ReadableInterval interval)
    {
        final List<ReadableDateTime> result = new ArrayList<ReadableDateTime>();

        stepThroughInterval(interval, new Callback<RuntimeException>()
        {
            @Override
            public void step(ReadableInterval stepInterval)
            {
                result.add(stepInterval.getStart());
            }
        });

        return result;
    }

    public List<ReadableDateTime> reverseSteps(ReadableInterval interval)
    {
        final List<ReadableDateTime> result = forwardSteps(interval);

        Collections.reverse(result);

        return result;
    }

    abstract public <T extends Throwable> void stepThroughInterval(ReadableInterval interval, Callback<T> callback) throws T;

    abstract public DateTime getNow();

    abstract public DateTime truncate(ReadableDateTime date);

    abstract public String getRelativePathFor(ReadableDateTime date);
}

