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
import com.ning.metrics.serialization.event.Event;
import com.ning.metrics.serialization.event.SmileBucketEvent;
import com.ning.metrics.serialization.event.ThriftEnvelopeEvent;
import com.ning.metrics.serialization.smile.JsonStreamToSmileBucketEvent;
import com.ning.metrics.serialization.thrift.ThriftEnvelope;
import com.ning.metrics.serialization.thrift.ThriftField;
import com.ning.metrics.serialization.thrift.ThriftFieldListParser;
import org.apache.log4j.Logger;
import org.weakref.jmx.Managed;

import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Stream-based API (POST).
 * Serialization is done in the eventtracker library. The shared code for serialization/deserialization
 * is in the com.ning:metrics.serialization-* libraries.
 * <p/>
 * The class needs to be public for JMX.
 */
public class BodyEventExtractor implements EventExtractor
{
    private static final Logger log = Logger.getLogger(BodyEventExtractor.class);

    private final AtomicLong thriftSuccess = new AtomicLong(0);
    private final AtomicLong thriftFailure = new AtomicLong(0);
    private final AtomicLong smileSuccess = new AtomicLong(0);
    private final AtomicLong smileFailure = new AtomicLong(0);
    private final AtomicLong invalidEvents = new AtomicLong(0);

    @Override
    public Collection<? extends Event> extractEvent(final ExtractedAnnotation annotation) throws EventParsingException
    {
        final String eventType = annotation.getEventName();

        if (eventType != null) {
            if (annotation == null) {
                log.warn("Null annotation");
                throw new EventParsingException("Null annotation");
            }

            log.debug(String.format("receiving event of type %s, content-type %s", eventType, annotation.getContentType()));

            // contentType defaults to ning/thrift, for backwards compatibility
            if (annotation.getContentType() == null || annotation.getContentType().equals("ning/thrift")) {
                final ArrayList<ThriftField> thriftFieldList;

                try {
                    thriftFieldList = new ThriftFieldListParser().parse(annotation.getContentLength(), annotation.getInputStream());
                    thriftSuccess.incrementAndGet();
                }
                catch (IOException e) {
                    thriftFailure.incrementAndGet();
                    throw new EventParsingException(String.format("IOException while trying to parse event from post body: [%s]", e.toString()));
                }
                catch (IllegalArgumentException e) {
                    thriftFailure.incrementAndGet();
                    throw new EventParsingException(String.format("Parse exception while trying to parse event from post body: [%s]", annotation.toString(), e.toString()));
                }

                return Collections.singletonList(new ThriftEnvelopeEvent(
                    annotation.getDateTime(),
                    new ThriftEnvelope(eventType, thriftFieldList),
                    annotation.getBucketGranularity()
                ));
            }
            else if (annotation.getContentType().equals(MediaType.APPLICATION_JSON) || annotation.getContentType().equals("application/json+smile")) {
                final Collection<SmileBucketEvent> smileEvents;

                try {
                    // JsonStreamToSmileBucketEvent extracts Json or Smile
                    smileEvents = JsonStreamToSmileBucketEvent.extractEvent(eventType, annotation.getInputStream());
                    smileSuccess.addAndGet(smileEvents.size());
                }
                catch (IOException e) {
                    smileFailure.incrementAndGet();
                    throw new EventParsingException(String.format("IOException while trying to parse event from post body: %s", e.toString()));
                }

                return smileEvents;
            }
            else {
                invalidEvents.incrementAndGet();
                log.warn(String.format("Content-Type [%s] not supported", annotation.getContentType()));
            }
        }

        return null;
    }

    @Managed(description = "Number of Thrift events the collector successfully deserialized")
    public long getThriftSuccess()
    {
        return thriftSuccess.get();
    }

    @Managed(description = "Number of Thrift events the collector couldn't deserialize")
    public long getThriftFailure()
    {
        return thriftFailure.get();
    }

    @Managed(description = "Number of Smile events the collector successfully deserialized")
    public long getSmileSuccess()
    {
        return smileSuccess.get();
    }

    @Managed(description = "Number of Smile requests the collector couldn't deserialize")
    public long getSmileFailure()
    {
        return smileFailure.get();
    }

    @Managed(description = "Number of events the collector didn't understand")
    public long getInvalidEvents()
    {
        return invalidEvents.get();
    }
}
