package com.ning.metrics.collector.events.data;

import com.ning.metrics.serialization.event.SmileEnvelopeEvent;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.smile.SmileFactory;
import org.joda.time.DateTime;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class TestSmileEnvelopeEvent
{
    private static final ByteArrayOutputStream stream = new ByteArrayOutputStream();
    private static final DateTime eventDateTime = new DateTime();
    private static final String SCHEMA_NAME = "mySmile";

    private SmileEnvelopeEvent event;

    @BeforeTest
    public void setUp() throws IOException
    {
        SmileFactory f = new SmileFactory();
        JsonGenerator g = f.createJsonGenerator(stream);

        g.writeStartObject();
        g.writeStringField(SmileEnvelopeEvent.SMILE_EVENT_GRANULARITY_TOKEN_NAME, "MONTHLY");
        g.writeObjectFieldStart("name");
        g.writeStringField("first", "Joe");
        g.writeStringField("last", "Sixpack");
        g.writeEndObject(); // for field 'name'
        g.writeStringField("gender", "MALE");
        g.writeNumberField(SmileEnvelopeEvent.SMILE_EVENT_DATETIME_TOKEN_NAME, eventDateTime.getMillis());
        g.writeBooleanField("verified", false);
        g.writeEndObject();
        g.close(); // important: will force flushing of output, close underlying output stream

        event = new SmileEnvelopeEvent(SCHEMA_NAME, stream.toString());
    }

    @Test
    public void testGetEventDateTime() throws Exception
    {
        Assert.assertEquals(event.getEventDateTime(), eventDateTime);
    }

    @Test
    public void testGetName() throws Exception
    {
        Assert.assertEquals(event.getName(), SCHEMA_NAME);
    }

    @Test
    public void testToBytes() throws Exception
    {
        Assert.assertEquals((byte[]) event.getData(), stream.toByteArray());
    }
}
