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

package com.ning.metrics.collector.nagios;

import com.ning.nagios.ServiceCheck;

import com.yammer.metrics.HealthChecks;
import com.yammer.metrics.core.HealthCheck;

import java.util.Map;

public class CollectorServiceCheck implements ServiceCheck
{
    @Override
    public Status checkServiceStatus()
    {
        for (final Map.Entry<String, HealthCheck.Result> entry : HealthChecks.defaultRegistry().runHealthChecks().entrySet()) {
            final HealthCheck.Result result = entry.getValue();
            if (!result.isHealthy()) {
                return Status.criticalf("[%s] %s: %s", entry.getKey(), result.getError(), result.getMessage());
            }
        }

        return Status.ok("Life is good");
    }
}
