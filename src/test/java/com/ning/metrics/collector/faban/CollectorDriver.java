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

package com.ning.metrics.collector.faban;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.ning.metrics.eventtracker.CollectorController;
import com.ning.metrics.eventtracker.CollectorControllerModule;
import com.ning.metrics.serialization.event.ThriftEnvelopeEvent;
import com.ning.metrics.serialization.thrift.ThriftEnvelope;
import com.ning.metrics.serialization.thrift.ThriftField;
import com.sun.faban.driver.BenchmarkDefinition;
import com.sun.faban.driver.BenchmarkDriver;
import com.sun.faban.driver.BenchmarkOperation;
import com.sun.faban.driver.CycleType;
import com.sun.faban.driver.DriverContext;
import com.sun.faban.driver.FixedTime;
import com.sun.faban.driver.FlatMix;
import com.sun.faban.driver.Timing;
import org.joda.time.DateTime;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;

@BenchmarkDefinition(
    name = "CollectorDriver",
    version = "1.0"
)
@BenchmarkDriver(
    name = "CollectorDriver",
    threadPerScale = 1
)
@FlatMix(
    operations = {"Post"},
    mix = {100.0d},
    deviation = 1
)
@FixedTime(
    cycleType = CycleType.THINKTIME,
    cycleTime = 0,
    cycleDeviation = 10
)

public class CollectorDriver
{
    private final CollectorController controller;
    private final Integer nbOfEventsToSend;
    private final ThriftEnvelopeEvent eventToSend;

    private final Logger logger;
    private final DriverContext ctx;

    public CollectorDriver()
    {
        ctx = DriverContext.getContext();
        logger = ctx.getLogger();

        final Injector injector = Guice.createInjector(new CollectorControllerModule());
        controller = injector.getInstance(CollectorController.class);
        nbOfEventsToSend = Integer.getInteger("collector.faban.events-batch-size", 50);

        final ArrayList<ThriftField> list = new ArrayList<ThriftField>();
        list.add(ThriftField.createThriftField(true, (short) 1));
        list.add(ThriftField.createThriftField((byte) 1, (short) 2));
        list.add(ThriftField.createThriftField((short) 2, (short) 3));
        list.add(ThriftField.createThriftField(3, (short) 4));
        list.add(ThriftField.createThriftField(1000000000L, (short) 5));
        list.add(ThriftField.createThriftField(4.14, (short) 6));
        list.add(ThriftField.createThriftField("My testing string", (short) 7));
        eventToSend = new ThriftEnvelopeEvent(new DateTime(), new ThriftEnvelope("CollectorTestEvent", list));
    }

    @BenchmarkOperation(
        name = "Post",
        max90th = 2,
        timing = Timing.MANUAL
    )
    public void doPost()
    {
        try {
            ctx.recordTime();
            for (int i = 0; i < nbOfEventsToSend; i++) {
                controller.offerEvent(eventToSend);

            }
            controller.commit();
            controller.flush();
        }
        catch (IOException e) {
            logger.warning(String.format("IOException while sending events: %s", e.getLocalizedMessage()));
        }
        finally {
            ctx.recordTime();
        }
    }
}
