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

import org.apache.log4j.Logger;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/**
 * Extension of {@link java.util.concurrent.ScheduledThreadPoolExecutor} that will continue to schedule a task even if the previous run had an exception.
 * Also ensures that uncaught exceptions are logged.
 */
public class FailsafeScheduledExecutor extends ScheduledThreadPoolExecutor
{
    private final Logger log = Logger.getLogger(FailsafeScheduledExecutor.class);

    /**
     * Creates a new single-threaded executor with a {@link NamedThreadFactory} of the given name.
     *
     * @param name thread name base
     */
    public FailsafeScheduledExecutor(String name)
    {
        this(1, name);
    }

    /**
     * Creates a new executor with a {@link NamedThreadFactory} of the given name.
     *
     * @param corePoolSize number of threads in the pool
     * @param name         thread name base
     */
    public FailsafeScheduledExecutor(int corePoolSize, String name)
    {
        this(corePoolSize, new NamedThreadFactory(name));
    }

    public FailsafeScheduledExecutor(int corePoolSize, ThreadFactory threadFactory)
    {
        super(corePoolSize, threadFactory);
    }

    public <T> Future<T> submit(Callable<T> task)
    {
        return super.submit(task);
    }

    public <T> Future<T> submit(Runnable task, T result)
    {
        return super.submit(wrapRunnable(task), result);
    }

    public Future<?> submit(Runnable task)
    {
        return super.submit(wrapRunnable(task));
    }

    public void execute(Runnable command)
    {
        super.execute(wrapRunnable(command));
    }

    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit)
    {
        return super.scheduleWithFixedDelay(wrapRunnable(command), initialDelay, delay, unit);
    }

    public ScheduledFuture<?> scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit)
    {
        return super.scheduleAtFixedRate(wrapRunnable(command), initialDelay, period, unit);
    }

    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long delay, TimeUnit unit)
    {
        return super.schedule(callable, delay, unit);
    }

    public ScheduledFuture<?> schedule(Runnable command, long delay, TimeUnit unit)
    {
        return super.schedule(wrapRunnable(command), delay, unit);
    }

    private Runnable wrapRunnable(final Runnable runnable)
    {
        return new Runnable()
        {
            public void run()
            {
                try {
                    runnable.run();
                }
                catch (Throwable e) {
                    log.error(String.format("Thread %s ended abnormally with an exception", Thread.currentThread().getName()), e);
                }

                boolean interrupted = Thread.interrupted();

                log.debug(String.format("Thread %s finished executing (%s interrupted)", Thread.currentThread().getName(), interrupted ? "was" : "was not"));

                if (interrupted) {
                    Thread.currentThread().interrupt();
                }
            }
        };
    }
}
