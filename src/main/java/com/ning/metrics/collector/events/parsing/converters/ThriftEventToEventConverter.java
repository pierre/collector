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

package com.ning.metrics.collector.events.parsing.converters;

import com.ning.serialization.DataItem;
import com.ning.serialization.DataItemFactory;
import com.ning.serialization.ThriftEnvelope;
import com.ning.serialization.ThriftField;
import com.ning.serialization.ThriftFieldImpl;
import org.apache.thrift.TBase;
import org.apache.thrift.TFieldIdEnum;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.protocol.TType;

import java.util.ArrayList;
import java.util.Map;

class ThriftEventToEventConverter
{
    /**
     * Convert a native Thrift to a ThriftEnvelope. ThriftEnvelope are used for serialization to/from disk before writing
     * to HDFS. It much easier to deal with the conversion now, rather than adding Thrift-specific code later in the
     * pipeline.
     * <p/>
     * Note that Thrift fields can be null. In such case, TBase#write() won't write them: it can afford it since it
     * knows the schema beforehands. ThriftEnvelope doesn't know about the fields. Hence, we need to make sure to add
     * these empty ThriftField in the generated ThriftEnvelope.
     *
     * @param eventType name of the native Thrift class
     * @param event     native Thrift to convert
     * @return ThriftEnvelope, each ThriftField being associated to one field in the native Thrift
     */
    public static ThriftEnvelope generateThriftEnvelope(String eventType, TBase<? extends TFieldIdEnum> event)
    {
        ArrayList<ThriftField> tFieldList = new ArrayList<ThriftField>();
        Map metaDataMap;

        try {
            // The metaDataMap is static
            metaDataMap = (Map) event.getClass().getField("metaDataMap").get(null);
        }
        catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Event is not a valid Thrift object, cannot access the metaDataMap: " + event);
        }
        catch (NoSuchFieldException e) {
            throw new IllegalArgumentException("Event is not a valid Thrift object, cannot find the metdaDataMap: " + event);
        }

        // Go through the internal Thrift fields and generate the equivalent ThriftField for the ThriftEnvelope
        for (TFieldIdEnum c : (TFieldIdEnum[]) getFields(event.getClass())) {
            Object value = event.getFieldValue(c.getThriftFieldId());
            FieldMetaData fieldMetaData = (FieldMetaData) metaDataMap.get(c);
            byte t = fieldMetaData.valueMetaData.type;
            DataItem item;
            if (t == TType.BOOL) {
                item = DataItemFactory.create((Boolean) value);
            }
            else if (t == TType.BYTE) {
                if (value == null) {
                    value = 0;
                }
                item = DataItemFactory.create((Byte) value);
            }
            else if (t == TType.I16) {
                if (value == null) {
                    value = 0;
                }
                item = DataItemFactory.create((Short) value);
            }
            else if (t == TType.I32) {
                if (value == null) {
                    value = 0;
                }
                item = DataItemFactory.create((Integer) value);
            }
            else if (t == TType.I64) {
                if (value == null) {
                    value = 0;
                }
                item = DataItemFactory.create((Long) value);
            }
            else if (t == TType.DOUBLE) {
                if (value == null) {
                    value = 0;
                }
                item = DataItemFactory.create((Double) value);
            }
            else if (t == TType.STRING) {
                if (value == null) {
                    value = "";
                }
                item = DataItemFactory.create((String) value);
            }
            else {
                throw new IllegalArgumentException("Thrift converter doesn't support: " + value + " but you can implement me!");
            }

            tFieldList.add(new ThriftFieldImpl(item, c.getThriftFieldId()));
        }
        return new ThriftEnvelope(eventType, tFieldList);
    }

    /**
     * Black magic to extract the list of field names from a native Thrift.
     *
     * @param type thrift class to inspect
     * @return the list of Thrift fields (_Fields)
     */
    private static Object[] getFields(Class type)
    {
        for (Class<?> inner : type.getDeclaredClasses()) {
            if (inner.getSimpleName().equals("_Fields") && inner.isEnum()) {
                return inner.getEnumConstants();
            }
        }
        throw new IllegalArgumentException(type.getName() + " is missing the _Fields enum class");
    }
}