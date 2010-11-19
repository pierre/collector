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

package com.ning.metrics.collector.util;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class NamedThreadFactory implements ThreadFactory
{
    private final AtomicInteger count = new AtomicInteger(0);
    private final String name;

    private final ThreadFactory delegate;

    public NamedThreadFactory(String name)
    {
        this(name, new LoggingThreadFactory());
    }

    public NamedThreadFactory(String name, ThreadFactory delegate)
    {
        this.delegate = delegate;
        this.name = name;
    }

    public Thread newThread(final Runnable runnable)
    {
        Thread thread = delegate.newThread(runnable);
        thread.setName(name + "-" + count.incrementAndGet());

        return thread;
    }
}