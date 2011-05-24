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

package com.ning.metrics.collector.endpoint;

import com.sun.jersey.core.header.InBoundHeaders;

import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class MockHttpHeaders implements HttpHeaders
{
    private final MultivaluedMap<String, String> headers = new InBoundHeaders();

    public MockHttpHeaders()
    {
    }

    public MockHttpHeaders(
        final String referer,
        final String userAgent,
        final String ip
    )
    {
        this(referer, userAgent, ip, null);
    }

    public MockHttpHeaders(
        final String referer,
        final String userAgent,
        final String ip,
        final Integer contentLength
    )
    {
        if (referer != null) {
            headers.putSingle("Referer", referer);
        }

        if (userAgent != null) {
            headers.putSingle("User-Agent", userAgent);
        }

        if (ip != null) {
            headers.putSingle("X-Forwarded-For", ip);
        }

        if (contentLength != null) {
            headers.putSingle("Content-Length", contentLength.toString());
        }
    }

    public void addHeader(final String key, final String value)
    {
        headers.putSingle(key, value);
    }

    /**
     * Get the values of a HTTP request header. The returned List is read-only.
     * This is a shortcut for <code>getRequestHeaders().get(name)</code>.
     *
     * @param name the header name, case insensitive
     * @return a read-only list of header values.
     * @throws IllegalStateException if called outside the scope of a request
     */
    @Override
    public List<String> getRequestHeader(final String name)
    {
        return headers.get(name);
    }

    /**
     * Get the values of HTTP request headers. The returned Map is case-insensitive
     * wrt keys and is read-only.
     *
     * @return a read-only headers of header names and values.
     * @throws IllegalStateException if called outside the scope of a request
     */
    @Override
    public MultivaluedMap<String, String> getRequestHeaders()
    {
        return headers;
    }

    /**
     * Get a list of media types that are acceptable for the response.
     *
     * @return a read-only list of requested response media types sorted according
     *         to their q-value, with highest preference first.
     * @throws IllegalStateException if called outside the scope of a request
     */
    @Override
    public List<MediaType> getAcceptableMediaTypes()
    {
        return null;
    }

    /**
     * Get a list of languages that are acceptable for the response.
     *
     * @return a read-only list of acceptable languages sorted according
     *         to their q-value, with highest preference first.
     * @throws IllegalStateException if called outside the scope of a request
     */
    @Override
    public List<Locale> getAcceptableLanguages()
    {
        return null;
    }

    /**
     * Get the media type of the request entity
     *
     * @return the media type or null if there is no request entity.
     * @throws IllegalStateException if called outside the scope of a request
     */
    @Override
    public MediaType getMediaType()
    {
        return null;
    }

    /**
     * Get the language of the request entity
     *
     * @return the language of the entity or null if not specified
     * @throws IllegalStateException if called outside the scope of a request
     */
    @Override
    public Locale getLanguage()
    {
        return null;
    }

    /**
     * Get any cookies that accompanied the request.
     *
     * @return a read-only headers of cookie name (String) to Cookie.
     * @throws IllegalStateException if called outside the scope of a request
     */
    @Override
    public Map<String, Cookie> getCookies()
    {
        return null;
    }
}
