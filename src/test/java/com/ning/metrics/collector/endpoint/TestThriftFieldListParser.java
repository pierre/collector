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

import com.ning.serialization.BooleanDataItem;
import com.ning.serialization.ByteDataItem;
import com.ning.serialization.DoubleDataItem;
import com.ning.serialization.IntegerDataItem;
import com.ning.serialization.LongDataItem;
import com.ning.serialization.ShortDataItem;
import com.ning.serialization.StringDataItem;
import com.ning.serialization.ThriftFieldImpl;
import com.ning.serialization.ThriftFieldListSerializer;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.ws.rs.core.MediaType;
import java.io.ByteArrayInputStream;

public class TestThriftFieldListParser
{
    private final ThriftFieldListParser parser = new ThriftFieldListParser();

    @Test(groups = "fast")
    public void testCanParse() throws Exception
    {
        MediaType invalidType = new MediaType("text", "html");

        Assert.assertEquals(parser.canParse(invalidType, ThriftFieldList.class), false);
        Assert.assertEquals(parser.canParse(invalidType, Object.class), false);
        Assert.assertEquals(parser.canParse(new MediaType("ning/thrift", "UTF -8"), Object.class), false);
        Assert.assertEquals(parser.canParse(ThriftFieldListParser.NING_THRIFT_MEDIA_TYPE, Object.class), false);
        Assert.assertEquals(parser.canParse(ThriftFieldListParser.NING_THRIFT_MEDIA_TYPE, Object.class), false);
        Assert.assertEquals(parser.canParse(ThriftFieldListParser.NING_THRIFT_MEDIA_TYPE, ThriftFieldList.class), true);
    }

    @Test(groups = "fast")
    public void testParse() throws Exception
    {
        ThriftFieldList input = new ThriftFieldList();
        input.add(new ThriftFieldImpl(new StringDataItem("string"), (short) 0));
        input.add(new ThriftFieldImpl(new BooleanDataItem(true), (short) 1));
        input.add(new ThriftFieldImpl(new ByteDataItem((byte) 1), (short) 2));
        input.add(new ThriftFieldImpl(new ShortDataItem((short) 2), (short) 2));
        input.add(new ThriftFieldImpl(new IntegerDataItem(4), (short) 3));
        input.add(new ThriftFieldImpl(new LongDataItem(8), (short) 4));
        input.add(new ThriftFieldImpl(new DoubleDataItem(3.14), (short) 5));

        ThriftFieldListSerializer serializer = new ThriftFieldListSerializer();
        byte[] payload = serializer.createPayload(input);

        ThriftFieldList result = parser.parse(payload.length, new ByteArrayInputStream(payload));

        Assert.assertFalse(result == input);
        Assert.assertEquals(result, input);
    }
}