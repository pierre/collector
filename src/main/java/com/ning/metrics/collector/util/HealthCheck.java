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

package com.ning.metrics.collector.util;

import com.google.inject.Inject;

import java.util.ArrayList;
import java.util.List;

public class HealthCheck
{
    private final List<ComponentHealthCheck> checks;

    @Inject
    public HealthCheck(final List<ComponentHealthCheck> checks)
    {
        this.checks = checks;
    }

    /**
     * Run each check and return the status list.
     *
     * @return the status list
     */
    public List<HealthCheckStatus> check()
    {
        final List<HealthCheckStatus> statusChecks = new ArrayList<HealthCheckStatus>();
        for (final ComponentHealthCheck check : checks) {
            statusChecks.add(check.check());
        }
        return statusChecks;
    }
}
