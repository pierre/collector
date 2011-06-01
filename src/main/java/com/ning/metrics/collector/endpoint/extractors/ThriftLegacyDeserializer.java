/*
 * Copyright 2010-2011 Ning, Inc.
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
package com.ning.metrics.collector.endpoint.extractors;

import com.ning.metrics.collector.endpoint.ExtractedAnnotation;
import com.ning.metrics.serialization.event.EventDeserializer;
import com.ning.metrics.serialization.event.ThriftEnvelopeEvent;
import com.ning.metrics.serialization.thrift.ThriftEnvelope;
import com.ning.metrics.serialization.thrift.ThriftField;
import com.ning.metrics.serialization.thrift.ThriftFieldListParser;

import java.io.IOException;
import java.util.ArrayList;

// this class is one big hack to let the legacy endpoint continue to exist
public class ThriftLegacyDeserializer implements EventDeserializer<ThriftEnvelopeEvent>
{
    // hack. returns false after one event is extracted
    private boolean hasNextEvent = true;
    ExtractedAnnotation annotation;

    public ThriftLegacyDeserializer(ExtractedAnnotation annotation) {
        this.annotation = annotation;
    }

    @Override
    public boolean hasNextEvent()
    {
        return hasNextEvent;
    }

    @Override
    public ThriftEnvelopeEvent getNextEvent() throws IOException
    {
        if (!hasNextEvent) {
            throw new IOException("No more events left to deserialize");
        }

        final ArrayList<ThriftField> thriftFieldList;

        try {
            thriftFieldList = new ThriftFieldListParser().parse(annotation.getContentLength(), annotation.getInputStream());
        }
        catch (IllegalArgumentException e) {
            throw new IOException(String.format("Parse exception while trying to parse event from post body: %s [%s]", annotation.toString(), e.toString()));
        }

        // we have extracted the one and only thrift event
        hasNextEvent = false;

        return new ThriftEnvelopeEvent(
            annotation.getDateTime(),
            new ThriftEnvelope(annotation.getEventName(), thriftFieldList),
            annotation.getBucketGranularity()
        );
    }
}
