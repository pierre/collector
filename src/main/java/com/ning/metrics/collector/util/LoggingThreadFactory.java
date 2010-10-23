package com.ning.metrics.collector.util;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.concurrent.ThreadFactory;

public class LoggingThreadFactory implements ThreadFactory
{
    private final static Logger log = LogManager.getLogger(LoggingThreadFactory.class);

    private final ThreadFactory delegate;

    public LoggingThreadFactory(ThreadFactory delegate)
    {
        this.delegate = delegate;
    }

    public LoggingThreadFactory()
    {
        this(new RawThreadFactory());
    }

    public Thread newThread(final Runnable runnable)
    {
        Runnable wrapped = new Runnable()
        {
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
                    boolean interrupted = Thread.interrupted();
                    log.debug(String.format("Thread %s finished executing", Thread.currentThread().getName()));
                    if (interrupted) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        };

        Thread thread = delegate.newThread(wrapped);

//		thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler()
//		{
//			public void uncaughtException(Thread thread, Throwable e)
//			{
//				log.error(String.format("Thread %s ended abnormally with an exception", thread.getName()), e);
//			}
//		});

        return thread;
    }
}
