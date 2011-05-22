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

import java.util.regex.Pattern;

public class Ip
{
    private static final Pattern DOT = Pattern.compile("\\.");

    public static int ipToInt(final String ip)
    {
        if (ip == null) {
            return 0;
        }

        final String[] parts = DOT.split(ip);
        if (parts.length == 4) {
            try {
                return (Integer.parseInt(parts[0]) << 24) | (Integer.parseInt(parts[1]) << 16)
                    | (Integer.parseInt(parts[2])) << 8 | (Integer.parseInt(parts[3]));
            }
            catch (NumberFormatException ignored) {
            }
        }
        return 0;
    }

    public static String intToIp(final int ip)
    {
        final StringBuilder sb = new StringBuilder(15);
        sb.append(ip >>> 24);
        sb.append('.');
        sb.append((ip >> 16) & 0xFF);
        sb.append('.');
        sb.append((ip >> 8) & 0xFF);
        sb.append('.');
        sb.append(ip & 0xFF);
        return sb.toString();
    }
}
