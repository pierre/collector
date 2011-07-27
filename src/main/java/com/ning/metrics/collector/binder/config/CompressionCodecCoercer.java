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

package com.ning.metrics.collector.binder.config;

import com.ning.metrics.serialization.writer.CompressionCodec;
import org.skife.config.Coercer;

public class CompressionCodecCoercer implements Coercer<CompressionCodec>
{
    @Override
    public CompressionCodec coerce(final String value)
    {
        try {
            final Class<?> someCodeClass = Class.forName(value);
            return (CompressionCodec) someCodeClass.newInstance();
        }
        catch (ClassNotFoundException e) {
            return null;
        }
        catch (InstantiationException e) {
            return null;
        }
        catch (IllegalAccessException e) {
            return null;
        }
    }
}
