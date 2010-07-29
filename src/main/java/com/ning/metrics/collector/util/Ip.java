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

package com.ning.metrics.collector.util;

public class Ip
{
    public static int ipToInt(String ip)
    {
        String[] parts = ip.split("\\.");
        if (parts.length != 4) {
            return 0;
        }

        int value;

        try {
            value = new Integer(parts[0]) << 24 | new Integer(parts[1]) << 16 | new Integer(parts[2]) << 8 | new Integer(parts[3]);
        }
        catch (NumberFormatException e) {
            value = 0;
        }

        return value;
    }

    public static String intToIp(int ip)
    {
        StringBuffer sb = new StringBuffer(15);
        for (int shift = 24; shift > 0; shift -= 8) {
            sb.append(Integer.toString((ip >>> shift) & 0xff));
            sb.append('.');
        }
        sb.append(Integer.toString(ip & 0xff));
        return sb.toString();
    }


}
