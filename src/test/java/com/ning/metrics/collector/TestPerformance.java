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

package com.ning.metrics.collector;

import com.ning.metrics.collector.util.NamedThreadFactory;
import com.ning.metrics.serialization.event.SmileEnvelopeEvent;
import com.ning.metrics.serialization.thrift.ThriftField;
import com.ning.metrics.serialization.thrift.ThriftFieldListSerializer;
import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransportException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.smile.SmileFactory;
import org.joda.time.DateTime;
import scribe.thrift.LogEntry;
import scribe.thrift.ResultCode;
import scribe.thrift.scribe;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestPerformance
{
    private static final int THREADPOOL_SIZE = 5;
    private static final int NUMBER_OF_SCRIBE_CLIENTS = 5;
    private static final int NUMBER_OF_MESSAGES_PER_SCRIBE_PAYLOAD = 60;
    private static int NUMBER_OF_MESSAGES_PER_SCRIBE_CLIENT;

    private static List<LogEntry> messages;
    private static scribe.Client client;
    private static final Logger log = Logger.getLogger(TestPerformance.class);

    private static final Object lockObject = new Object();

    private static class ScribeClient implements Runnable
    {
        /**
         * When an object implementing interface <code>Runnable</code> is used
         * to create a thread, starting the thread causes the object's
         * <code>run</code> method to be called in that separately executing
         * thread.
         * <p/>
         * The general contract of the method <code>run</code> is that it may
         * take any action whatsoever.
         *
         * @see Thread#run()
         */
        @Override
        public void run()
        {
            ResultCode rescode = null;
            for (int i = 0; i < NUMBER_OF_MESSAGES_PER_SCRIBE_CLIENT; i++) {
                try {
                    synchronized (lockObject) {
                        // Not Thread-safe. Sigh. Really Facebook?
                        rescode = client.Log(messages);
                    }
                }
                catch (TException e) {
                    log.warn(e.getLocalizedMessage());
                }

                switch (rescode) {
                    case OK:
                        log.debug(String.format("%d messages sent successfully.", messages.size()));
                        break;
                    case TRY_LATER:
                        log.error("Falling over");
                        System.exit(1);
                        break;
                    default:
                        log.warn(String.format("Unknown error: %d", rescode.getValue()));
                }
            }
        }
    }

    public static void main(final String[] args) throws Exception
    {
        final TFramedTransport transport = createScribeClient();

        final String message = createThriftPayload();
        //String message = createSmilePayload();

        NUMBER_OF_MESSAGES_PER_SCRIBE_CLIENT = 2000;
        doOneRun(message);

        //NUMBER_OF_MESSAGES_PER_SCRIBE_CLIENT = 2500;
        //doOneRun(message);

        //NUMBER_OF_MESSAGES_PER_SCRIBE_CLIENT = 3000;
        //doOneRun(message);

        //NUMBER_OF_MESSAGES_PER_SCRIBE_CLIENT = 20000;
        //doOneRun(message);

        transport.close();

        System.exit(0);
    }

    private static void doOneRun(final String message)
        throws InterruptedException
    {
        messages = new ArrayList<LogEntry>(NUMBER_OF_MESSAGES_PER_SCRIBE_PAYLOAD);
        for (int i = 0; i < NUMBER_OF_MESSAGES_PER_SCRIBE_PAYLOAD; i++) {
            messages.add(i, new LogEntry("category", message));
        }
        log.debug("Scribe payload created");

        final int messageSize = message.length();

        final long startTime = scheduleScribeAgents();

        final long runTimeSeconds = (System.currentTimeMillis() - startTime) / 1000;
        //final double throughput = 8 / 1024. * messageSize * NUMBER_OF_SCRIBE_CLIENTS * NUMBER_OF_MESSAGES_PER_SCRIBE_PAYLOAD * NUMBER_OF_MESSAGES_PER_SCRIBE_CLIENT / runTimeSeconds;
        // TODO troughput meaningless in its current form (what payload?)
        //log.error(String.format("%d messages sent in %d:%02d, %s bytes per payload, %.4f Mb/sec throughput",
        log.error(String.format("%d messages sent in %d:%02d, %s bytes per payload",
            NUMBER_OF_SCRIBE_CLIENTS * NUMBER_OF_MESSAGES_PER_SCRIBE_PAYLOAD * NUMBER_OF_MESSAGES_PER_SCRIBE_CLIENT, runTimeSeconds / 60, runTimeSeconds % 60, messageSize));
    }

    private static long scheduleScribeAgents() throws InterruptedException
    {
        final ExecutorService e = Executors.newFixedThreadPool(THREADPOOL_SIZE, new NamedThreadFactory("Performance tests (Scribe client)"));

        final long startTime = System.currentTimeMillis();
        for (int i = 0; i < NUMBER_OF_SCRIBE_CLIENTS; i++) {
            e.execute(new ScribeClient());
            log.debug(String.format("Thread %d/%d submitted", i + 1, NUMBER_OF_SCRIBE_CLIENTS));
        }

        e.shutdown();
        e.awaitTermination(10, TimeUnit.MINUTES);
        return startTime;
    }

    private static TFramedTransport createScribeClient() throws TTransportException
    {
        final TSocket sock = new TSocket("127.0.0.1", 7911);
        final TFramedTransport transport = new TFramedTransport(sock);
        final TBinaryProtocol protocol = new TBinaryProtocol(transport, false, false);
        client = new scribe.Client(protocol, protocol);
        transport.open();
        return transport;
    }

    private static String createThriftPayload() throws TException
    {
        final List<ThriftField> data = new ArrayList<ThriftField>();
        data.add(ThriftField.createThriftField("Fuu", (short) 1));
        data.add(ThriftField.createThriftField(true, (short) 2));
        data.add(ThriftField.createThriftField(3.1459, (short) 3));
        return String.format("%s:%s", new DateTime().getMillis(), new Base64().encodeToString(new ThriftFieldListSerializer().createPayload(data)));
    }

    @SuppressWarnings("unused")
    private static String createSmilePayload() throws IOException
    {
        final ByteArrayOutputStream stream = new ByteArrayOutputStream();
        final SmileFactory f = new SmileFactory();
        final JsonGenerator g = f.createJsonGenerator(stream);

        g.writeStartObject();
        g.writeNumberField(SmileEnvelopeEvent.SMILE_EVENT_DATETIME_TOKEN_NAME, new DateTime().getMillis());
        g.writeStringField("FuuField", "fuu");
        g.writeBooleanField("TrueField", true);
        g.writeNumberField("Pi", 3.1459);
        g.writeNumberField("Long", 10001000000L);
        g.writeEndObject();
        g.close(); // important: will force flushing of output, close underlying output stream

        return stream.toString();
    }

//    private static int getPayloadSize() throws TException
//    {
//        TMemoryBuffer bufferTest = new TMemoryBuffer(32);
//        final TFramedTransport transportTest = new TFramedTransport(bufferTest);
//        TBinaryProtocol protocolTest = new TBinaryProtocol(transportTest, false, false);
//        messages.get(0).write(protocolTest);
//        transportTest.flush();
//        return bufferTest.length();
//    }
}
