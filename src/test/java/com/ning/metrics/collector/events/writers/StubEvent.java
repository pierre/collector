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

import org.joda.time.DateTime;

import com.ning.metrics.collector.events.Event;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class StubEvent implements Event
{
	@Override
	public Object getData()
	{
		return "foo";
	}

	@Override
	public String getName()
	{
		return "bar";
	}

	@Override
	public DateTime getEventDateTime()
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public String getOutputDir(String prefix)
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public String getVersion()
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public void toBytes() throws IOException
	{
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException
	{
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException
	{
	}

}
