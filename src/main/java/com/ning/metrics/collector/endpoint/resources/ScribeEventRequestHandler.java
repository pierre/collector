/*
 * Copyright 2010 Ning, Inc.
 *
 * Ning licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
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
import com.ning.metrics.collector.events.Event;
import com.ning.metrics.collector.events.data.SmileEnvelopeEvent;
import com.ning.metrics.collector.events.parsing.StringToThriftEnvelope;
import com.ning.metrics.collector.events.parsing.ThriftToThriftEnvelope;
import com.ning.metrics.collector.events.processing.ScribeEventHandler;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.thrift.TException;
import org.joda.time.DateTime;
import scribe.thrift.LogEntry;
import scribe.thrift.ResultCode;
import scribe.thrift.scribe.Iface;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScribeEventRequestHandler implements Iface
{
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
        EventStats eventStats = new EventStats();
        boolean success = false;

        for (LogEntry entry : logEntries) {
            try {
                log.debug(String.format("Parsing log: %s", entry));

                Event event = extractEvent(entry.getCategory(), entry.getMessage());
                if (event != null) {
                    success = eventHandler.processEvent(event, eventStats);
                }
                else {
                    eventHandler.handleFailure(entry, eventStats);
                    // We don't want Scribe to try later if it sends messages we don't understand.
                    success = true;
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
    private Event extractEvent(String category, String message) throws TException, IOException
    {
        Event event = extractSmileEnvelopeEvent(category, message);

        if (event == null) {
            event = extractThriftEnvelopeEvent(category, message);
        }

        return event;
    }

    private Event extractSmileEnvelopeEvent(String category, String message) throws IOException
    {
        Event event = null;

        // See http://wiki.fasterxml.com/JacksonBinaryFormatSpec
        // We assume for now that we are sending Smile on the wire. This may change though (lzo compression?)
        if (message.charAt(0) == ':' && message.charAt(1) == ')' && message.charAt(2) == '\n') {
            event = new SmileEnvelopeEvent(category, message);
        }

        return event;
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

        byte[] thrift = new Base64().decode(payload[1].getBytes());
        try {
            if (eventDateTime == null) {
                event = ThriftToThriftEnvelope.extractEvent(category, thrift);
            }
            else {
                event = ThriftToThriftEnvelope.extractEvent(category, new DateTime(eventDateTime), thrift);
            }
        }
        catch (Exception e) {
            log.debug("Event doesn't look like a Thrift, assuming plain text");
            if (eventDateTime == null) {
                event = StringToThriftEnvelope.extractEvent(category, payload[1]);
            }
            else {
                event = StringToThriftEnvelope.extractEvent(category, new DateTime(eventDateTime), payload[1]);
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
