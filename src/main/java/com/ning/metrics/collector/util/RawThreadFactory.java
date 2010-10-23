package com.ning.metrics.collector.util;

import java.util.concurrent.ThreadFactory;

public class RawThreadFactory implements ThreadFactory
{
    public Thread newThread(Runnable r)
    {
        return new Thread(r);
    }
}
