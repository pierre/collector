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

import com.google.inject.Inject;
import com.ning.metrics.collector.util.HealthCheck;
import com.ning.metrics.collector.util.HealthCheckStatus;
import com.ning.nagios.ServiceCheck;

import java.util.List;

public class CollectorServiceCheck implements ServiceCheck
{
    private final HealthCheck healthChecker;

    @Inject
    public CollectorServiceCheck(final HealthCheck healthChecker)
    {
        this.healthChecker = healthChecker;
    }

    @Override
    public Status checkServiceStatus()
    {
        final List<HealthCheckStatus> checks = healthChecker.check();
        for (final HealthCheckStatus status : checks) {
            if (status.getCode() != HealthCheckStatus.Code.OK) {
                return Status.criticalf("[%s] %s: %s", status.getCode(), status.getType(), status.getMessage());
            }
        }

        return Status.ok("Life is good");
    }
}
