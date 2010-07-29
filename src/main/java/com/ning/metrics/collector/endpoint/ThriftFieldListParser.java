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

import com.ning.serialization.ThriftFieldListDeserializer;
import org.apache.thrift.TException;

import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.io.InputStream;

public class ThriftFieldListParser
{
    public static final MediaType NING_THRIFT_MEDIA_TYPE = new MediaType("ning", "thrift");


    private final ThriftFieldListDeserializer deserializer = new ThriftFieldListDeserializer();

    public boolean canParse(MediaType mediaType, Class<?> requestedClass)
    {
        return ThriftFieldList.class.isAssignableFrom(requestedClass) && mediaType.isCompatible(NING_THRIFT_MEDIA_TYPE);
    }

    public ThriftFieldList parse(Integer contentLength, InputStream input) throws IOException, IllegalArgumentException
    {
        if (contentLength == 0 || input == null) {
            throw new IllegalArgumentException("unable to parse ThriftFieldList from binary data");
        }

        byte[] buffer = new byte[contentLength];
        int totalBytesRead = 0;
        int bytesRead = 0;

        while (bytesRead != -1 && totalBytesRead < contentLength) {
            bytesRead = input.read(buffer, totalBytesRead, contentLength - totalBytesRead);
            totalBytesRead += bytesRead;
        }

        try {
            ThriftFieldList thriftFieldList = new ThriftFieldList();
            thriftFieldList.addAll(deserializer.readPayload(buffer));

            return thriftFieldList;
        }
        catch (TException e) {
            throw new IllegalArgumentException("unable to parse ThriftFieldList from binary data", e);
        }
    }
}
