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

import com.ning.metrics.serialization.writer.EventWriter;

import java.io.IOException;

public interface PersistentWriterFactory
{
    /**
     * Create an EventWriter specific to events sharing the same serialization format
     * and ending in the same directory in HDFS.
     * In practice, this means that all events of a certain type and serialization type share the same writer, i.e.
     * all ClickEvent Thrift events during an hour will use the same writer.
     *
     * @param stats             stats object to count flushes
     * @param serializationType serialization type to use
     * @param eventName         event name
     * @param hdfsDir           output directory
     * @return eventWriter specific to an event type and serialization type
     */
    EventWriter createPersistentWriter(final WriterStats stats, final SerializationType serializationType, final String eventName, final String hdfsDir);

    /**
     * In case the EventWriter responsible for a certain queue goes away (e.g. collector restarted),
     * we need to process manually all files left below.
     * This includes all files in all directories under the spool directory, but the ones in _tmp. _tmp are files being written,
     * since they may not have been be closed, we don't want to upload garbage.
     *
     * @throws java.io.IOException generic I/O exception
     * @see <a href="http://en.wikipedia.org/wiki/Thank_God,_It's_Doomsday">Left Below</a>
     */
    void processLeftBelowFiles() throws IOException;
}
