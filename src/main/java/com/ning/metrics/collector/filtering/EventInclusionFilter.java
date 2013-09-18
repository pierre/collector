package com.ning.metrics.collector.filtering;

import java.util.regex.Pattern;

import com.ning.metrics.collector.endpoint.ParsedRequest;

public class EventInclusionFilter extends PatternSetFilter
{
    public EventInclusionFilter(FieldExtractor fieldExtractor, Iterable<Pattern> patterns)
    {
        super(fieldExtractor, patterns);
    }

    @Override
    public boolean passesFilter(String name, ParsedRequest parsedRequest)
    {
        return !super.passesFilter(name, parsedRequest);
    }
}
