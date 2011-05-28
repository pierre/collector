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

package com.ning.metrics.collector;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.ning.metrics.collector.util.FailsafeScheduledExecutor;
import com.ning.metrics.collector.util.NamedThreadFactory;
import com.ning.metrics.eventtracker.CollectorController;
import com.ning.metrics.eventtracker.CollectorControllerModule;
import com.ning.metrics.serialization.event.Event;
import com.ning.metrics.serialization.event.SmileEnvelopeEvent;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class TestHTTPPerformance
{
    private static final Logger log = Logger.getLogger(TestHTTPPerformance.class);

    private static final int NB_EVENTS = 1000;
    private static final int NB_RUNS = 10;
    private static final HashMap<String, Object> payload = new HashMap<String, Object>();
    private static final BlockingQueue<Event> eventQueue = new ArrayBlockingQueue<Event>(NB_EVENTS);
    private static CollectorController controller;
    private static FailsafeScheduledExecutor executor;

    private static class SenderWorker implements Runnable
    {
        private final CollectorController controller;

        public SenderWorker(final CollectorController controller)
        {
            this.controller = controller;
        }

        @Override
        public void run()
        {
            while (true) {
                try {
                    controller.offerEvent(eventQueue.take());
                }
                catch (InterruptedException ignored) {
                }
                catch (IOException e) {
                    log.warn(e);
                }
            }
        }
    }

    public static void main(final String[] args) throws Exception
    {
        System.setProperty("eventtracker.type", "COLLECTOR");
        System.setProperty("eventtracker.collector.host", "127.0.0.1");
        System.setProperty("eventtracker.collector.port", "8080");
        System.setProperty("eventtracker.event-type", "JSON");
        System.setProperty("eventtracker.collector.max-wait-time-millis", "80000");

        final Injector injector = Guice.createInjector(new CollectorControllerModule());
        controller = injector.getInstance(CollectorController.class);

        executor = new FailsafeScheduledExecutor(1, new NamedThreadFactory("sender"));
        executor.submit(new SenderWorker(controller));

        payload.put("message", "World");
        payload.put("method", "GET");
        payload.put("uri", "/foo/bar?uri=1242");

        int runs = NB_RUNS;
        while (runs-- > 0) {
            doOneRun();
        }

        System.exit(0);
    }

    private static void doOneRun() throws IOException, InterruptedException
    {
        for (int i = 0; i < NB_EVENTS; i++) {
            eventQueue.offer(new SmileEnvelopeEvent("TestCollectorScalability", new DateTime(), payload));
        }

        while (eventQueue.size() > 0) {
            log.info(String.format("Queue size is %d, sleeping 1 second", eventQueue.size()));
            Thread.sleep(1000);
        }

        controller.commit();
        controller.flush();
        executor.shutdownNow();
    }
}
