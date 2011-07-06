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

import com.google.inject.Inject;
import com.ning.metrics.serialization.writer.EventWriter;
import com.ning.metrics.serialization.writer.MockEventWriter;

import java.io.IOException;

public class MockPersistentWriterFactory implements PersistentWriterFactory
{
    private final boolean commitThrowsException;
    private final boolean rollbackThrowsException;
    private final boolean writeThrowsException;

    private EventWriter writer = null;

    @Inject
    public MockPersistentWriterFactory()
    {
        this(false, false, false);
    }

    public MockPersistentWriterFactory(final EventWriter writer)
    {
        this(false, false, false);
        this.writer = writer;
    }

    private MockPersistentWriterFactory(final boolean commitThrowsException, final boolean rollbackThrowsException, final boolean writeThrowsException)
    {
        this.commitThrowsException = commitThrowsException;
        this.rollbackThrowsException = rollbackThrowsException;
        this.writeThrowsException = writeThrowsException;
    }

    @Override
    public EventWriter createPersistentWriter(final WriterStats stats, final SerializationType serializationType, final String eventName, final String hdfsDir)
    {
        if (writer == null) {
            return new MockEventWriter(commitThrowsException, rollbackThrowsException, writeThrowsException);
        }
        else {
            return writer;
        }
    }

    @Override
    public void processLeftBelowFiles() throws IOException
    {
    }

    @Override
    public void close()
    {
    }
}
