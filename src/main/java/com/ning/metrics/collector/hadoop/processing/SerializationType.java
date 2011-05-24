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
package com.ning.metrics.collector.hadoop.processing;

import com.ning.metrics.serialization.event.Event;
import com.ning.metrics.serialization.event.EventSerializer;
import com.ning.metrics.serialization.event.SmileEnvelopeEvent;
import com.ning.metrics.serialization.event.ThriftEnvelopeEvent;
import com.ning.metrics.serialization.smile.SmileEnvelopeEventSerializer;
import com.ning.metrics.serialization.writer.ObjectOutputEventSerializer;

enum SerializationType
{
    SMILE
        {
            @Override
            public EventSerializer getSerializer()
            {
                return new SmileEnvelopeEventSerializer(false);
            }
        },
    JSON
        {
            @Override
            public EventSerializer getSerializer()
            {
                return new SmileEnvelopeEventSerializer(true);
            }
        },
    THRIFT,
    DEFAULT;

    public EventSerializer getSerializer()
    {
        return new ObjectOutputEventSerializer();
    }

    public static SerializationType get(Event event) {
        if (event instanceof SmileEnvelopeEvent) {
            if (((SmileEnvelopeEvent) event).isPlainJson()) {
                return JSON;
            }
            else {
                return SMILE;
            }
        }
        else if (event instanceof ThriftEnvelopeEvent) {
            return THRIFT;
        }
        else {
            return DEFAULT;
        }
    }
}
