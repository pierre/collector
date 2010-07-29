/*
 * Copyright 2010 Ning, Inc.
 *
 * Ning licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.ning.metrics.collector.events.writers;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.joda.time.DateTime;
import com.ning.metrics.collector.events.Event;

import java.io.IOException;

public class TestThresholdEventWriter
{
	private Event event;
	private MockEventWriter delegateWriter;
	private ThresholdEventWriter eventWriter;
	private DateTime now;


	@BeforeMethod(alwaysRun = true)
	void setup()
	{
		event = new StubEvent();
		now = new DateTime("2009-02-01T00:00:00");
		delegateWriter = new MockEventWriter();
		eventWriter = new ThresholdEventWriter(delegateWriter, 2, 300)
		{
			@Override
			protected DateTime getNow()
			{
				return now;
			}
		};
	}

	@Test(groups = "fast")
	public void testCommitOnCount() throws Exception
	{
		//3 writes => commit
		writeAndTestCounts(1, 0);
		writeAndTestCounts(2, 0);
		writeAndTestCounts(0, 3);
		//3 more writes => commit
		writeAndTestCounts(1, 3);
		writeAndTestCounts(2, 3);
		writeAndTestCounts(0, 6);
	}

	@Test(groups = "fast")
	public void testCommitOnTime() throws Exception
	{
		writeAndTestCounts(1, 0);
		now = now.plusSeconds(301);
		writeAndTestCounts(0, 2);
	}

	@Test(groups = "fast")
	public void testTimeThenCount() throws Exception
	{
		writeAndTestCounts(1, 0);
		now = now.plusSeconds(301);
		//time commit
		writeAndTestCounts(0, 2);
		//size commit
		writeAndTestCounts(1, 2);
		writeAndTestCounts(2, 2);
		writeAndTestCounts(0, 5);
	}

	@Test(groups = "fast")
	public void testCountThenTime() throws Exception
	{
		writeAndTestCounts(1, 0);
		writeAndTestCounts(2, 0);
		now = now.plusSeconds(300);
		writeAndTestCounts(0, 3);
		now = now.plusSeconds(300);
		writeAndTestCounts(1, 3);
		now = now.plusSeconds(1);
		writeAndTestCounts(0, 5);
	}

	@Test(groups = "fast")
	public void testForceCommit() throws Exception
	{
		writeAndTestCounts(1, 0);
		writeAndTestCounts(2, 0);
		eventWriter.forceCommit();
		assertTestCounts(0, 2);
	}

	@Test(groups = "fast")
	public void testCommit() throws Exception
	{
		writeAndTestCounts(1, 0);
		writeAndTestCounts(2, 0);
		eventWriter.commit();
		assertTestCounts(2, 0);
		now = now.plusSeconds(301);
		eventWriter.commit();
		assertTestCounts(0, 2);
	}

	@Test(groups = "fast")
	public void testWriteException() throws Exception
	{
		//make sure exceptions aren't swallowed
		try {
			delegateWriter.setWriteThrowsException(true);
			eventWriter.write(event);
			Assert.fail("expected exception");
		}
		catch (IOException e) {
			Assert.assertEquals(e.getClass(), IOException.class);
		}
	}

	@Test(groups = "fast")
	public void testCommitException() throws Exception
	{
		//make sure exceptions aren't swallowed
		try {
			delegateWriter.setCommitThrowsException(true);
			now = now.plusSeconds(301);
			eventWriter.write(event);
			Assert.fail("expected exception");
		}
		catch (IOException e) {
			Assert.assertEquals(e.getClass(), IOException.class);
		}
	}

	@Test(groups = "fast")
	public void testRollbackException() throws Exception
	{
		//make sure exceptions aren't swallowed
		try {
			delegateWriter.setRollbackThrowsException(true);
			eventWriter.rollback();
			Assert.fail("expected exception");
		}
		catch (IOException e) {
			Assert.assertEquals(e.getClass(), IOException.class);
		}
	}

	private void writeAndTestCounts(int written, int committed) throws IOException
	{
		eventWriter.write(event);
		assertTestCounts(written, committed);
	}

	private void assertTestCounts(int written, int committed)
	{
		Assert.assertEquals(delegateWriter.getWrittenEventList().size(), written);
		Assert.assertEquals(delegateWriter.getCommittedEventList().size(), committed);
	}

}