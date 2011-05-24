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

import com.google.inject.Inject;
import com.ning.metrics.collector.util.HealthCheck;
import com.ning.metrics.collector.util.HealthCheckStatus;
import com.ning.metrics.collector.util.ResponseContainer;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.joda.time.DateTime;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import java.io.IOException;
import java.util.List;


@Resource
@Path("/1.0")
public class HealthCheckResource
{
    public static final String JSON_UTF8 = MediaType.APPLICATION_JSON + "; charset=UTF-8";

    private final ObjectMapper mapper = new ObjectMapper();
    private final ObjectMapper prettyMapper = new ObjectMapper().configure(SerializationConfig.Feature.INDENT_OUTPUT, true);
    private final HealthCheck healthChecker;

    @Inject
    public HealthCheckResource(final HealthCheck healthChecker)
    {
        this.healthChecker = healthChecker;
    }

    @GET
    @Path("/healthcheck")
    @Produces(JSON_UTF8)
    public Response healthcheck(@Context final HttpServletRequest request, @QueryParam("pretty") final boolean pretty)
    {
        final String location = String.format("http://%s:%d/1.0/healthcheck", request.getServerName(), request.getServerPort());
        final List<HealthCheckStatus> checks = healthChecker.check();
        final ResponseContainer responseContainer = new ResponseContainer();
        responseContainer.setItems(checks);
        responseContainer.setSize(checks.size());
        responseContainer.setGenerated(new DateTime());
        responseContainer.setLocation(location);
        for (final HealthCheckStatus status : checks) {
            if (status.getCode() != HealthCheckStatus.Code.OK) {
                throw new HealthcheckException(responseContainer);
            }
        }

        try {
            if (pretty) {
                return Response.ok(prettyMapper.writeValueAsString(responseContainer)).build();
            }
            else {
                return Response.ok(mapper.writeValueAsString(responseContainer)).build();
            }
        }
        catch (IOException e) {
            return Response.serverError().build();
        }
    }

    @SuppressWarnings("serial")
    public class HealthcheckException extends WebApplicationException
    {
        public HealthcheckException(final ResponseContainer container)
        {
            super(Response.status(Status.INTERNAL_SERVER_ERROR).entity(container).type(JSON_UTF8).build());
        }
    }
}