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

package com.ning.metrics.collector.events.parsing;

import com.ning.metrics.collector.events.Event;
import com.ning.metrics.collector.events.data.ThriftEnvelopeEvent;
import com.ning.serialization.StringDataItem;
import com.ning.serialization.ThriftEnvelope;
import com.ning.serialization.ThriftField;
import com.ning.serialization.ThriftFieldImpl;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TField;
import org.apache.thrift.protocol.TType;
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

public class StringToThriftEnvelope
{
    public static Event extractEvent(String type, String payload) throws TException
    {
        return extractEvent(type, new DateTime(), payload);
    }

    public static Event extractEvent(String type, DateTime eventDateTime, String payload) throws TException
    {
        final List<ThriftField> list = new ArrayList<ThriftField>();
        list.add(new ThriftFieldImpl(new StringDataItem(payload), new TField("payload", TType.STRING, (short) 1)));
        final ThriftEnvelope envelope = new ThriftEnvelope(type, list);

        return new ThriftEnvelopeEvent(eventDateTime, envelope);
    }
}