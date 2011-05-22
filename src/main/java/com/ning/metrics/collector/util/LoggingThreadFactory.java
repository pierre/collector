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

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.concurrent.ThreadFactory;

class LoggingThreadFactory implements ThreadFactory
{
    private static final Logger log = LogManager.getLogger(LoggingThreadFactory.class);

    private final ThreadFactory delegate;

    private LoggingThreadFactory(final ThreadFactory delegate)
    {
        this.delegate = delegate;
    }

    public LoggingThreadFactory()
    {
        this(new RawThreadFactory());
    }

    public Thread newThread(final Runnable runnable)
    {
        final Runnable wrapped = new LoggingRunnable(runnable);

        return delegate.newThread(wrapped);
    }

    private static class LoggingRunnable implements Runnable
    {
        private final Runnable runnable;

        public LoggingRunnable(final Runnable runnable)
        {
            this.runnable = runnable;
        }

        public void run()
        {
            try {
                runnable.run();
            }
            catch (RuntimeException e) {
                log.error(String.format("Thread %s ended abnormally with an exception", Thread.currentThread().getName()), e);
                throw e;
            }
            catch (Error e) {
                log.error(String.format("Thread %s ended abnormally with an exception", Thread.currentThread().getName()), e);
                throw e;
            }

            if (log.isDebugEnabled()) {
                final boolean interrupted = Thread.interrupted();
                log.debug(String.format("Thread %s finished executing", Thread.currentThread().getName()));
                if (interrupted) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
