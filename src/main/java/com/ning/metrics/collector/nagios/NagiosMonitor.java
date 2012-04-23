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
import com.googlecode.jsendnsca.NagiosPassiveCheckSender;
import com.googlecode.jsendnsca.PassiveCheckSender;
import com.googlecode.jsendnsca.builders.MessagePayloadBuilder;
import com.googlecode.jsendnsca.builders.NagiosSettingsBuilder;
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.nagios.JsendnscaService;
import com.ning.nagios.MonitoredService;
import com.ning.nagios.ServiceCheck;
import com.ning.nagios.ServiceMonitor;
import org.skife.config.TimeSpan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class NagiosMonitor implements ServiceMonitor
{
    private static final Logger log = LoggerFactory.getLogger(NagiosMonitor.class);

    private final ConcurrentMap<String, MonitoredService> services = new ConcurrentHashMap<String, MonitoredService>();
    private final PassiveCheckSender sender;
    private final MessagePayloadBuilder payloadBuilder;
    private final TimeSpan checkRate;

    @Inject
    public NagiosMonitor(final CollectorConfig config)
    {
        this.sender = new NagiosPassiveCheckSender(new NagiosSettingsBuilder()
            .withNagiosHost(config.getNagiosHost())
            .withPort(config.getNagiosPort())
            .withEncryption(config.getNagiosEncryption())
            .withPassword(config.getNagiosPassword())
            .withConnectionTimeout((int) config.getNagiosTimeout().getMillis())
            .withResponseTimeout((int) config.getNagiosTimeout().getMillis())
            .create());
        this.payloadBuilder = new MessagePayloadBuilder().withHostname(config.getNagiosReportedHostname());
        this.checkRate = config.getNagiosCheckRate();
    }

    @Override
    public MonitoredService registerServiceCheck(final String serviceName, final ServiceCheck check)
    {
        final MonitoredService service = new JsendnscaService(serviceName, checkRate, check, sender, payloadBuilder);
        final MonitoredService existingService = services.putIfAbsent(serviceName, service);

        if (existingService != null) {
            throw new IllegalStateException(String.format("Service check [%s] has already been registered", serviceName));
        }

        log.info(String.format("Added service [%s] with check rate of [%s]", service, checkRate));

        return service;
    }
}