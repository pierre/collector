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

package com.ning.metrics.collector.endpoint.resources;

import com.ning.metrics.serialization.event.Event;
import com.ning.metrics.serialization.event.StringToThriftEnvelopeEvent;
import com.ning.metrics.serialization.event.ThriftEnvelopeEvent;
import com.ning.metrics.serialization.event.ThriftToThriftEnvelopeEvent;

import com.facebook.fb303.fb_status;
import com.google.inject.Inject;
import com.yammer.metrics.annotation.Timed;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.thrift.TException;
import org.joda.time.DateTime;
import scribe.thrift.LogEntry;
import scribe.thrift.ResultCode;
import scribe.thrift.scribe.Iface;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ScribeEventRequestHandler implements Iface
{
    private static final String SERVICE_NAME = "Ning Scribed Service";
    private static final String VERSION = "0.1";
    private static final long startTime = System.currentTimeMillis();

    private final Map<String, String> options = new HashMap<String, String>();
    private final Map<String, Long> counters = new HashMap<String, Long>();

    private static final Logger log = Logger.getLogger(ScribeEventRequestHandler.class);

    private final ScribeEventHandler eventHandler;

    @Inject
    public ScribeEventRequestHandler(final ScribeEventHandler eventHandler)
    {
        this.eventHandler = eventHandler;
    }

    /**
     * Process an list of logs sent by the native Scribe Servers. This is the main interface with Scribe.
     *
     * @param logEntries list of logEntries to process
     * @return resultCode  OK if everything went well, TRY_LATER otherwise
     */
    @Override
    @Timed(name = "SCRIBE_API")
    public ResultCode Log(final List<LogEntry> logEntries)
    {
        boolean success = false;

        for (final LogEntry entry : logEntries) {
            if (entry.getCategory() == null) {
                log.info("Ignoring scribe entry with null category");
                eventHandler.handleFailure(entry);
                // We don't want Scribe to try later if it sends messages we don't understand.
                success = true;
                continue;
            }
            else if (entry.getMessage() == null) {
                log.info("Ignoring scribe entry with null message");
                eventHandler.handleFailure(entry);
                // We don't want Scribe to try later if it sends messages we don't understand.
                success = true;
                continue;
            }

            try {
                log.debug(String.format("Parsing log: %s", entry));

                // Return a collection here: in case of Smile, we may can a bucket of events that overlaps on multiple
                // output directories
                // TODO use EventDeserializer here!
                final Collection<? extends Event> events = extractEvent(entry.getCategory(), entry.getMessage());

                // We only record failure when collectors are falling over (rejecting)
                success = true;
                for (final Event event : events) {
                    if (event != null) {
                        if (!eventHandler.processEvent(event)) {
                            success = false;
                        }
                    }
                    else {
                        eventHandler.handleFailure(entry);
                    }
                }
            }
            catch (RuntimeException e) {
                log.info(String.format("Ignoring malformed entry [%s]: %s", entry, e.getLocalizedMessage()));
                eventHandler.handleFailure(entry);
                // We don't want Scribe to try later if it sends messages we don't understand.
                success = true;
            }
            catch (TException e) {
                log.info(String.format("Ignoring malformed Thrift [%s]: %s", entry, e.getLocalizedMessage()));
                eventHandler.handleFailure(entry);
                // We don't want Scribe to try later if it sends messages we don't understand.
                success = true;
            }
            catch (IOException e) {
                log.info(String.format("Ignoring malformed Smile [%s]: %s", entry, e.getLocalizedMessage()));
                eventHandler.handleFailure(entry);
                // We don't want Scribe to try later if it sends messages we don't understand.
                success = true;
            }
        }

        if (success) {
            return ResultCode.OK;
        }
        else {
            // We mainly come here if the collectors are falling over (rejected event)
            return ResultCode.TRY_LATER;
        }
    }

    /**
     * Extract a message from Scribe.
     * <p/>
     * Events are stored as ThriftEnvelope events in HDFS. A ThriftEnvelope event can be seen as a tuple
     * (Event TimeStamp, ThriftEnvelope). Messages sent to Scribe should be encoded as follow:
     * <p/>
     * M:B
     * <p/>
     * where M is the TimeStamp in milliseconds and B is a Thrift object Bae64 encoded.
     *
     * @param category Scribe category, maps to Thrift type
     * @param message  encoded ThriftEnvelope
     * @return parsed ThriftEnvelopeEvent
     * @throws TException          when the ThriftEnvelope cannot be generated
     * @throws java.io.IOException when the SmileEnvelopeEvent cannot be generated
     */
    private Collection<? extends Event> extractEvent(final String category, final String message) throws TException, IOException
    {
        return Collections.singleton(extractThriftEnvelopeEvent(category, message));
    }

    private Event extractThriftEnvelopeEvent(final String category, final String message) throws TException
    {
        final String[] payload = StringUtils.split(message, ":");

        if (payload == null || payload.length != 2) {
            // Invalid API
            throw new TException("Expected payload separator ':'");
        }

        Long eventDateTime = null;
        try {
            eventDateTime = Long.parseLong(payload[0]);
        }
        catch (RuntimeException e) {
            log.debug("Event DateTime not specified, defaulting to NOW()");
        }

        // The payload is Base64 encoded
        final byte[] thrift = new Base64().decode(payload[1].getBytes());

        // Assume a ThriftEnvelopeEvent from the eventtracker (uses Java serialization).
        // This is bigger on the wire, but the interface is portable. Serialize using TBinaryProtocol
        // if you care about size (see below).
        ObjectInputStream objectInputStream = null;
        Event event;
        try {
            objectInputStream = new ObjectInputStream(new BufferedInputStream(new ByteArrayInputStream(thrift)));
            event = new ThriftEnvelopeEvent();
            event.readExternal(objectInputStream);

            if (event.getName().equals(category)) {
                return event;
            }
        }
        catch (Exception e) {
            log.debug(String.format("Payload is not a ThriftEvent: %s", e.getLocalizedMessage()));
        }
        finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
            }
            catch (IOException e) {
                log.warn("Unable to close stream when deserializing thrift events", e);
            }
        }

        // Not a ThriftEvent, probably native Thrift serialization (TBinaryProtocol)
        try {
            if (eventDateTime == null) {
                event = ThriftToThriftEnvelopeEvent.extractEvent(category, thrift);
            }
            else {
                event = ThriftToThriftEnvelopeEvent.extractEvent(category, new DateTime(eventDateTime), thrift);
            }
        }
        catch (TException e) {
            log.debug("Event doesn't look like a Thrift, assuming plain text");
            if (eventDateTime == null) {
                event = StringToThriftEnvelopeEvent.extractEvent(category, payload[1]);
            }
            else {
                event = StringToThriftEnvelopeEvent.extractEvent(category, new DateTime(eventDateTime), payload[1]);
            }
        }
        return event;
    }

    @Override
    public String getName()
    {
        return SERVICE_NAME;
    }

    @Override
    public String getVersion()
    {
        return VERSION;
    }

    @Override
    public fb_status getStatus()
    {
        return fb_status.ALIVE;
    }

    @Override
    public String getStatusDetails()
    {
        return "No special status maintained. Returns Alive if the process is active";
    }

    @Override
    public Map<String, Long> getCounters()
    {
        return counters;
    }

    @Override
    public long getCounter(final String s)
    {
        return counters.get(s);
    }

    @Override
    public void setOption(final String s, final String s1)
    {
        options.put(s, s1);
    }

    @Override
    public String getOption(final String s)
    {
        return options.get(s);
    }

    @Override
    public Map<String, String> getOptions()
    {
        return options;
    }

    @Override
    public String getCpuProfile(final int i)
    {
        return null;
    }

    @Override
    public long aliveSince()
    {
        return System.currentTimeMillis() - startTime;
    }

    @Override
    public void reinitialize()
    {
        options.clear();
        counters.clear();
    }

    @Override
    public void shutdown()
    {
        // Don't do anything now.
    }
}
