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

import com.ning.metrics.serialization.thrift.ThriftField;
import com.ning.metrics.serialization.thrift.ThriftFieldListParser;
import com.ning.metrics.serialization.thrift.ThriftFieldListSerializer;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestThriftFieldListParser
{
    private final ThriftFieldListParser parser = new ThriftFieldListParser();

    @Test(groups = "fast")
    public void testParse() throws Exception
    {
        final List<ThriftField> input = new ArrayList<ThriftField>();
        input.add(ThriftField.createThriftField("string", (short) 0));
        input.add(ThriftField.createThriftField(true, (short) 1));
        input.add(ThriftField.createThriftField((byte) 1, (short) 2));
        input.add(ThriftField.createThriftField((short) 2, (short) 2));
        input.add(ThriftField.createThriftField(4, (short) 3));
        input.add(ThriftField.createThriftField(8L, (short) 4));
        input.add(ThriftField.createThriftField(3.14, (short) 5));

        final ThriftFieldListSerializer serializer = new ThriftFieldListSerializer();
        final byte[] payload = serializer.createPayload(input);

        final Collection<ThriftField> result = parser.parse(payload.length, new ByteArrayInputStream(payload));

        Assert.assertFalse(result == input);
        Assert.assertEquals(result, input);
    }
}