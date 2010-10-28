package com.ning.metrics.collector.binder.modules;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;
import com.ning.metrics.collector.binder.annotations.DiskSpoolFlushExecutor;
import com.ning.metrics.collector.binder.annotations.HdfsEventWriter;
import com.ning.metrics.collector.binder.config.CollectorConfig;
import com.ning.metrics.serialization.writer.EventWriter;
import com.ning.metrics.serialization.writer.SyncType;
import com.ning.metrics.serialization.writer.DiskSpoolEventWriter;

import java.util.concurrent.ScheduledExecutorService;

public class DiskSpoolEventWriterProvider implements Provider<DiskSpoolEventWriter>
{
    private final Injector injector;
    private final EventWriter hadoopFileEventWriter;
    private final ScheduledExecutorService executor;

    @Inject
    public DiskSpoolEventWriterProvider(
        Injector injector,
        @HdfsEventWriter EventWriter hadoopFileEventWriter,
        @DiskSpoolFlushExecutor ScheduledExecutorService executor
    )
    {
        this.injector = injector;
        this.hadoopFileEventWriter = hadoopFileEventWriter;
        this.executor = executor;
    }

    /**
     * Provides an instance of {@code T}. Must never return {@code null}.
     *
     * @throws com.google.inject.OutOfScopeException
     *          when an attempt is made to access a scoped object while the scope
     *          in question is not currently active
     * @throws com.google.inject.ProvisionException
     *          if an instance cannot be provided. Such exceptions include messages
     *          and throwables to describe why provision failed.
     */
    @Override
    public DiskSpoolEventWriter get()
    {
        CollectorConfig config = injector.getInstance(CollectorConfig.class);
        return new DiskSpoolEventWriter(hadoopFileEventWriter, config.getSpoolDirectoryName(), config.isFlushEnabled(), config.getFlushIntervalInSeconds(), executor, SyncType.valueOf(config.getSyncType()), config.getRateWindowSizeMinutes());
    }
}
