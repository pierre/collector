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

package com.ning.metrics.collector.events.data;

import com.ning.metrics.serialization.event.ThriftEnvelopeEvent;
import com.ning.metrics.serialization.thrift.ThriftEnvelope;
import com.ning.metrics.serialization.thrift.ThriftField;
import org.joda.time.DateTime;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class TestThriftEnvelopeEvent
{
    @SuppressWarnings({"FieldMayBeStatic"})
    private final String eventType = "FuuEvent";

    @Test(groups = "fast")
    public void testGetOutputDir() throws Exception
    {
        ThriftEnvelope thriftEnvelope = new ThriftEnvelope(eventType);
        thriftEnvelope.getPayload().add(ThriftField.createThriftField("fuuness", (short) 0));
        thriftEnvelope.getPayload().add(ThriftField.createThriftField(100L, (short) 1));
        ThriftEnvelopeEvent event = new ThriftEnvelopeEvent(new DateTime("2009-01-01T02:03:04"), thriftEnvelope);

        Assert.assertEquals(event.getOutputDir("/events/ning"), String.format("/events/ning/%s/2009/01/01/02", eventType));
    }

    @Test(groups = "fast")
    public void testSerialization() throws Exception
    {
        ThriftEnvelope thriftEnvelope = new ThriftEnvelope(eventType);
        thriftEnvelope.getPayload().add(ThriftField.createThriftField("fuuness", (short) 0));
        thriftEnvelope.getPayload().add(ThriftField.createThriftField(100L, (short) 1));
        ThriftEnvelopeEvent event = new ThriftEnvelopeEvent(new DateTime("2009-01-01T02:03:04"), thriftEnvelope);

        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        ObjectOutput objectOut = new ObjectOutputStream(byteOut);

        event.writeExternal(objectOut);

        objectOut.close();

        ObjectInput objectInput = new ObjectInputStream(new ByteArrayInputStream(byteOut.toByteArray()));

        @SuppressWarnings({"deprecation"})
        ThriftEnvelopeEvent resultEvent = new ThriftEnvelopeEvent();
        resultEvent.readExternal(objectInput);

        Assert.assertEquals(resultEvent.getData(), event.getData());
    }

    @Test(groups = "fast")
    public void testVersion1() throws Exception
    {
        ThriftEnvelope thriftEnvelope = new ThriftEnvelope(eventType);
        thriftEnvelope.getPayload().add(ThriftField.createThriftField(100L, (short) 4));
        thriftEnvelope.getPayload().add(ThriftField.createThriftField("fuuness", (short) 1));
        ThriftEnvelopeEvent event = new ThriftEnvelopeEvent(new DateTime("2009-01-01T02:03:04"), thriftEnvelope);

        Assert.assertEquals(event.getVersion(), "1.4");

    }

    @Test(groups = "fast")
    public void testVersion2() throws Exception
    {
        ThriftEnvelope thriftEnvelope = new ThriftEnvelope(eventType);
        thriftEnvelope.getPayload().add(ThriftField.createThriftField("fuuness", (short) 1));
        thriftEnvelope.getPayload().add(ThriftField.createThriftField(100L, (short) 4));
        ThriftEnvelopeEvent event = new ThriftEnvelopeEvent(new DateTime("2009-01-01T02:03:04"), thriftEnvelope);

        Assert.assertEquals(event.getVersion(), "1.4");
    }
}