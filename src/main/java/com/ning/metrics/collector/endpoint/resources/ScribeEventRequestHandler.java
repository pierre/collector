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

package com.ning.metrics.collector.endpoint.resources;

import com.facebook.fb303.fb_status;
import com.google.inject.Inject;
import com.ning.metrics.collector.endpoint.EventStats;
import com.ning.metrics.collector.events.processing.ScribeEventHandler;
import com.ning.metrics.serialization.event.Event;
import com.ning.metrics.serialization.event.SmileBucketEvent;
import com.ning.metrics.serialization.event.StringToThriftEnvelopeEvent;
import com.ning.metrics.serialization.event.ThriftEnvelopeEvent;
import com.ning.metrics.serialization.event.ThriftToThriftEnvelopeEvent;
import com.ning.metrics.serialization.smile.JsonStreamToSmileBucketEvent;
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
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScribeEventRequestHandler implements Iface
{
    private static final Charset CHARSET = Charset.forName("ISO-8859-1");

    private static final String SERVICE_NAME = "Ning Scribed Service";
    private static final String VERSION = "0.1";
    private static final long startTime = System.currentTimeMillis();

    private final Map<String, String> options = new HashMap<String, String>();
    private final Map<String, Long> counters = new HashMap<String, Long>();

    private static final Logger log = Logger.getLogger(ScribeEventRequestHandler.class);

    private final ScribeEventHandler eventHandler;

    @Inject
    public ScribeEventRequestHandler(
        ScribeEventHandler eventHandler
    )
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
    public ResultCode Log(List<LogEntry> logEntries)
    {
        boolean success = false;

        for (LogEntry entry : logEntries) {
            EventStats eventStats = new EventStats();
            try {
                log.debug(String.format("Parsing log: %s", entry));

                // Return a collection here: in case of Smile, we may can a bucket of events that overlaps on multiple
                // output directories
                Collection<? extends Event> events = extractEvent(entry.getCategory(), entry.getMessage());

                // We only record failure when collectors are falling over (rejecting)
                success = true;
                for (Event event : events) {
                    if (event != null) {
                        eventStats.recordExtracted();
                        if (!eventHandler.processEvent(event, eventStats)) {
                            success = false;
                        }
                    }
                    else {
                        eventHandler.handleFailure(entry, eventStats);
                    }
                }
            }
            catch (RuntimeException e) {
                log.info(String.format("Ignoring malformed entry: %s", entry), e);
                eventHandler.handleFailure(entry, eventStats);
                // We don't want Scribe to try later if it sends messages we don't understand.
                success = true;
            }
            catch (TException e) {
                log.info(String.format("Ignoring malformed Thrift: %s", entry), e);
                eventHandler.handleFailure(entry, eventStats);
                // We don't want Scribe to try later if it sends messages we don't understand.
                success = true;
            }
            catch (IOException e) {
                log.info(String.format("Ignoring malformed Smile: %s", entry), e);
                eventHandler.handleFailure(entry, eventStats);
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
    private Collection<? extends Event> extractEvent(String category, String message) throws TException, IOException
    {
        Collection<SmileBucketEvent> smileEvents = extractSmileBucketEvents(category, message);

        if (smileEvents == null) {
            ArrayList<Event> thriftEnvelope = new ArrayList<Event>();
            thriftEnvelope.add(extractThriftEnvelopeEvent(category, message));
            return thriftEnvelope;
        }
        else {
            return smileEvents;
        }
    }

    private Collection<SmileBucketEvent> extractSmileBucketEvents(String category, String message) throws IOException
    {
        // See http://wiki.fasterxml.com/JacksonBinaryFormatSpec
        // We assume for now that we are sending Smile on the wire. This may change though (lzo compression?)
        if (message.charAt(0) == ':' && message.charAt(1) == ')' && message.charAt(2) == '\n') {
            return JsonStreamToSmileBucketEvent.extractEvent(category, new ByteArrayInputStream(message.getBytes(CHARSET)));
        }
        else {
            return null;
        }
    }

    private Event extractThriftEnvelopeEvent(String category, String message)
        throws TException
    {
        Event event;
        String[] payload = StringUtils.split(message, ":");

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
        byte[] thrift = new Base64().decode(payload[1].getBytes());

        // Assume a ThriftEnvelopeEvent from the eventtracker (uses Java serialization).
        // This is bigger on the wire, but the interface is portable. Serialize using TBinaryProtocol
        // if you care about size (see below).
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(new ByteArrayInputStream(thrift)));
            event = new ThriftEnvelopeEvent();
            event.readExternal(objectInputStream);

            if (event.getName().equals(category)) {
                return event;
            }
        }
        catch (Exception e) {
            log.debug(String.format("Payload is not a ThriftEvent: %s", e.getLocalizedMessage()));
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
        catch (Exception e) {
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
    public long getCounter(String s)
    {
        return counters.get(s);
    }

    @Override
    public void setOption(String s, String s1)
    {
        options.put(s, s1);
    }

    @Override
    public String getOption(String s)
    {
        return options.get(s);
    }

    @Override
    public Map<String, String> getOptions()
    {
        return options;
    }

    @Override
    public String getCpuProfile(int i)
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
