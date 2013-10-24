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

package com.ning.metrics.collector.util;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import com.ning.metrics.serialization.event.SmileEnvelopeEvent;
import com.ning.metrics.serialization.smile.SmileEnvelopeEventDeserializer;

import com.fasterxml.jackson.databind.JsonNode;

public class LocalFileReader {

    public static void main(String[] args) throws IOException {
        InputStream stream = null;
        try {
            stream = new BufferedInputStream(new FileInputStream(args[0]));
            final SmileEnvelopeEventDeserializer deserializer = new SmileEnvelopeEventDeserializer(stream, false);
            while (deserializer.hasNextEvent()) {
                final SmileEnvelopeEvent event = deserializer.getNextEvent();
                final JsonNode node = (JsonNode) event.getData();

                final Iterator<JsonNode> elements = node.elements();
                boolean first = true;
                while (elements.hasNext()) {
                    final JsonNode jsonNode = elements.next();
                    if (!first) {
                        System.out.print(",");
                    }
                    System.out.print(jsonNode.toString());
                    first = false;
                }
                System.out.print("\n");
            }
        } finally {
            if (stream != null) {
                stream.close();
            }
            System.out.flush();
        }
    }
}
