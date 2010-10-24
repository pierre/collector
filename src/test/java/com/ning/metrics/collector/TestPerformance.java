package com.ning.metrics.collector;

import com.ning.metrics.collector.endpoint.ThriftFieldList;
import com.ning.metrics.collector.util.NamedThreadFactory;
import com.ning.serialization.DataItemFactory;
import com.ning.serialization.ThriftFieldImpl;
import com.ning.serialization.ThriftFieldListSerializer;
import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TMemoryBuffer;
import org.apache.thrift.transport.TSocket;
import org.joda.time.DateTime;
import scribe.thrift.LogEntry;
import scribe.thrift.ResultCode;
import scribe.thrift.scribe;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestPerformance
{
    private final static int THREADPOOL_SIZE = 5;
    private final static int NUMBER_OF_SCRIBE_CLIENTS = 5;
    private final static int NUMBER_OF_MESSAGES_PER_SCRIBE_PAYLOAD = 50;
    private final static int NUMBER_OF_MESSAGES_PER_SCRIBE_CLIENT = 500;

    private static final ArrayList<LogEntry> messages = new ArrayList<LogEntry>(NUMBER_OF_MESSAGES_PER_SCRIBE_PAYLOAD);
    private static scribe.Client client;
    private final static Logger log = Logger.getLogger(TestPerformance.class);

    static final private Object lockObject = new Object();

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
                        log.info(String.format("%d messages sent successfully.", messages.size()));
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

    public static void main(String[] args) throws Exception
    {
        final TSocket sock = new TSocket("127.0.0.1", 7911);
        final TFramedTransport transport = new TFramedTransport(sock);
        TBinaryProtocol protocol = new TBinaryProtocol(transport, false, false);
        client = new scribe.Client(protocol, protocol);
        transport.open();

        final ThriftFieldList data = new ThriftFieldList();
        data.add(new ThriftFieldImpl(DataItemFactory.create("fuu"), (short) 1));
        data.add(new ThriftFieldImpl(DataItemFactory.create(true), (short) 2));
        data.add(new ThriftFieldImpl(DataItemFactory.create(3.1459), (short) 2));
        data.add(new ThriftFieldImpl(DataItemFactory.create(10001000000L), (short) 3));

        String message = String.format("%s:%s", new DateTime().getMillis(), new Base64().encodeToString(new ThriftFieldListSerializer().createPayload(data)));
        for (int i = 0; i < NUMBER_OF_MESSAGES_PER_SCRIBE_PAYLOAD; i++) {
            messages.add(i, new LogEntry("category", message));
        }
        log.info("Scribe payload created");
        int messageSize = getPayloadSize();

        ExecutorService e = Executors.newFixedThreadPool(THREADPOOL_SIZE, new NamedThreadFactory("Performance tests (Scribe client)"));

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < NUMBER_OF_SCRIBE_CLIENTS; i++) {
            e.execute(new ScribeClient());
            log.info(String.format("Thread %d/%d submitted", i + 1, NUMBER_OF_SCRIBE_CLIENTS));
        }

        e.shutdown();
        e.awaitTermination(10, TimeUnit.MINUTES);
        transport.close();

        // TODO: what does that test really? up to the disk?
        final long runTimeSeconds = (System.currentTimeMillis() - startTime) / 1000;
        log.error(String.format("%d messages sent in %d:%02d, %s bytes per payload, %.4f Mb/sec throughput",
            NUMBER_OF_SCRIBE_CLIENTS * NUMBER_OF_MESSAGES_PER_SCRIBE_PAYLOAD * NUMBER_OF_MESSAGES_PER_SCRIBE_CLIENT, runTimeSeconds / 60, runTimeSeconds % 60, messageSize,
            8 / 1024. * messageSize * NUMBER_OF_SCRIBE_CLIENTS * NUMBER_OF_MESSAGES_PER_SCRIBE_PAYLOAD * NUMBER_OF_MESSAGES_PER_SCRIBE_CLIENT / runTimeSeconds));

        System.exit(0);
    }

    private static int getPayloadSize() throws TException
    {
        TMemoryBuffer bufferTest = new TMemoryBuffer(32);
        final TFramedTransport transportTest = new TFramedTransport(bufferTest);
        TBinaryProtocol protocolTest = new TBinaryProtocol(transportTest, false, false);
        messages.get(0).write(protocolTest);
        transportTest.flush();
        return bufferTest.length();
    }
}
