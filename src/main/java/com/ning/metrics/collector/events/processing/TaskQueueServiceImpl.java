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

package com.ning.metrics.collector.events.processing;

import java.util.concurrent.*;
import java.util.List;
import java.util.Collection;

public class TaskQueueServiceImpl implements TaskQueueService
{
	private final ExecutorService executor;
	private final BlockingQueue<Runnable> taskQueue = new LinkedBlockingDeque<Runnable>();

	public TaskQueueServiceImpl()
	{
        //TODO: single threaded?
		executor = new ThreadPoolExecutor(1, 1, Long.MAX_VALUE, TimeUnit.MILLISECONDS, taskQueue, new ThreadPoolExecutor.AbortPolicy());
	}

	@Override
	public int getQueueSize()
	{
		return taskQueue.size();
	}

	public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException
	{
		return executor.awaitTermination(timeout, unit);
	}

	public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException
	{
		return executor.invokeAll(tasks);
	}

	public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException
	{
		return executor.invokeAll(tasks, timeout, unit);
	}

	public <T> T invokeAny(Collection<? extends Callable<T>> tasks) throws InterruptedException, ExecutionException
	{
		return executor.invokeAny(tasks);
	}

	public <T> T invokeAny(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException
	{
		return executor.invokeAny(tasks, timeout, unit);
	}

	public boolean isShutdown()
	{
		return executor.isShutdown();
	}

	public boolean isTerminated()
	{
		return executor.isTerminated();
	}

	public void shutdown()
	{
		executor.shutdown();
	}

	public List<Runnable> shutdownNow()
	{
		return executor.shutdownNow();
	}

	public <T> Future<T> submit(Callable<T> task)
	{
		return executor.submit(task);
	}

	public Future<?> submit(Runnable task)
	{
		return executor.submit(task);
	}

	public <T> Future<T> submit(Runnable task, T result)
	{
		return executor.submit(task, result);
	}

	public void execute(Runnable command)
	{
		executor.execute(command);
	}
}
