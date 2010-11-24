/*
 * Copyright 2010 Ning, Inc.
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

import com.ning.metrics.serialization.util.Managed;
import iControl.CommonEnabledState;
import iControl.CommonIPPortDefinition;
import iControl.CommonStatistic;
import iControl.CommonStatisticType;
import iControl.CommonULong64;
import iControl.Interfaces;
import iControl.LocalLBObjectStatus;
import iControl.LocalLBPoolMemberMemberMonitorState;
import iControl.LocalLBPoolMemberMemberObjectStatus;
import iControl.LocalLBPoolMemberMemberSessionState;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import java.util.ArrayList;

/**
 * Inspired by http://devcentral.f5.com/wiki/default.aspx/iControl/JavaPoolMemberControl.html
 */
public class F5PoolMemberControl
{
    private static final Logger log = Logger.getLogger(F5PoolMemberControl.class);

    private static Interfaces getInterface(String hostname, String username, String password)
    {
        Interfaces m_interfaces = new Interfaces();
        m_interfaces.initialize(hostname, username, password);

        return m_interfaces;
    }

    /**
     * Return a list of all pools
     *
     * @param hostname SLB VIP hostname
     * @param username SLB VIP username
     * @param password SLB VIP password
     * @return a list of pool names
     * @throws Exception generic exception if something goes wrong
     */
    @Managed(description = "Get the list of available pools")
    @SuppressWarnings("unused")
    public String[] getPoolList(String hostname, String username, String password) throws Exception
    {
        return getInterface(hostname, username, password).getLocalLBPool().get_list();
    }

    /**
     * Given a pool name, retrieve the pool members definitions
     *
     * @param poolName pool name to lookup
     * @param hostname SLB VIP hostname
     * @param username SLB VIP username
     * @param password SLB VIP password
     * @return list of CommonIPPortDefinition for all members
     * @throws Exception generic exception if something goes wrong
     */
    @Managed(description = "Get the list of amembers in a pool")
    @SuppressWarnings("unused")
    public iControl.CommonIPPortDefinition[][] getPoolMembers(String poolName, String hostname, String username, String password) throws Exception
    {
        String[] poolNames = {poolName};
        return getInterface(hostname, username, password).getLocalLBPool().get_member(poolNames);
    }

    /**
     * Find the status of a member
     *
     * @param poolName      pool name to lookup
     * @param memberAddress server IP to lookup
     * @param hostname      SLB VIP hostname
     * @param username      SLB VIP username
     * @param password      SLB VIP password
     * @return list of CommonIPPortDefinition for all members
     * @throws Exception generic exception if something goes wrong
     */
    @Managed(description = "Get the list of members in a pool")
    @SuppressWarnings("unused")
    public String getPoolMemberStatuses(String poolName, String memberAddress, String hostname, String username, String password) throws Exception
    {
        String[] poolNames = {poolName};
        ArrayList<LocalLBPoolMemberMemberObjectStatus> memberStatuses = new ArrayList<LocalLBPoolMemberMemberObjectStatus>();

        iControl.LocalLBPoolMemberMemberObjectStatus[][] members = getInterface(hostname, username, password).getLocalLBPoolMember().get_object_status(poolNames);
        for (LocalLBPoolMemberMemberObjectStatus[] statuses : members) {
            for (LocalLBPoolMemberMemberObjectStatus status : statuses) {
                if (status.getMember().getAddress().equals(memberAddress)) {
                    memberStatuses.add(status);
                }
            }
        }

        return toString((LocalLBPoolMemberMemberObjectStatus[]) memberStatuses.toArray());
    }

    /**
     * Add a server to a pool
     *
     * @param poolName   pool name
     * @param memberAddr server IP to add
     * @param memberPort server port
     * @param hostname   SLB VIP hostname
     * @param username   SLB VIP username
     * @param password   SLB VIP password
     * @return the new status of the server
     * @throws Exception generic exception if something goes wrong
     */
    @Managed(description = "Add a member to a pool")
    @SuppressWarnings("unused")
    public String addPoolMember(String poolName, String memberAddr, int memberPort, String hostname, String username, String password) throws Exception
    {
        final Interfaces m_interfaces = getInterface(hostname, username, password);
        final CommonIPPortDefinition definition = new CommonIPPortDefinition(memberAddr, memberPort);

        setMonitorState(m_interfaces, definition, poolName, CommonEnabledState.STATE_ENABLED);
        setSessionState(m_interfaces, definition, poolName, CommonEnabledState.STATE_ENABLED);

        return getPoolMemberStatuses(poolName, memberAddr, hostname, username, password);
    }

    /**
     * Remove a server from a pool
     *
     * @param poolName   pool name
     * @param memberAddr server IP to remove
     * @param memberPort server port
     * @param hostname   SLB VIP hostname
     * @param username   SLB VIP username
     * @param password   SLB VIP password
     * @return the new status of the server
     * @throws Exception generic exception if something goes wrong
     */
    @Managed(description = "Remove a member from a pool")
    @SuppressWarnings("unused")
    public String removePoolMember(String poolName, String memberAddr, int memberPort, String hostname, String username, String password) throws Exception
    {
        final Interfaces m_interfaces = getInterface(hostname, username, password);
        final CommonIPPortDefinition definition = new CommonIPPortDefinition(memberAddr, memberPort);

        setSessionState(m_interfaces, definition, poolName, CommonEnabledState.STATE_DISABLED);

        log.info("Waiting for current connections to drop to zero...");
        iControl.CommonIPPortDefinition[] memberDefinitions = {definition};
        iControl.CommonIPPortDefinition[][] membersDefinitions = {memberDefinitions};

        long cur_connections = 1;
        final String[] poolNames = {poolName};
        while (cur_connections > 0) {
            iControl.LocalLBPoolMemberMemberStatistics[] memberStatistics = m_interfaces.getLocalLBPoolMember().get_statistics(poolNames, membersDefinitions);
            iControl.LocalLBPoolMemberMemberStatistics memberStats = memberStatistics[0];

            iControl.LocalLBPoolMemberMemberStatisticEntry[] statisticEntries = memberStats.getStatistics();
            iControl.LocalLBPoolMemberMemberStatisticEntry statisticEntry = statisticEntries[0];

            iControl.CommonStatistic[] statistics = statisticEntry.getStatistics();

            for (CommonStatistic stats : statistics) {
                CommonStatisticType type = stats.getType();
                CommonULong64 value64 = stats.getValue();

                if (type == CommonStatisticType.STATISTIC_SERVER_SIDE_CURRENT_CONNECTIONS) {
                    cur_connections = value64.getLow();
                    log.info("Current Connections: " + cur_connections);
                }
            }
            Thread.currentThread();
            Thread.sleep(1000);
        }

        setMonitorState(m_interfaces, definition, poolName, CommonEnabledState.STATE_DISABLED);

        return getPoolMemberStatuses(poolName, memberAddr, hostname, username, password);
    }

    private static void setSessionState(Interfaces m_interfaces, CommonIPPortDefinition definition, String poolName, CommonEnabledState state) throws Exception
    {
        final String[] poolNames = {poolName};

        LocalLBPoolMemberMemberSessionState memberSessionState = new LocalLBPoolMemberMemberSessionState(definition, state);

        LocalLBPoolMemberMemberSessionState[] memberSessionStates = {memberSessionState};
        LocalLBPoolMemberMemberSessionState[][] membersSessionStates = {memberSessionStates};

        log.info(String.format("Updating SLB VIP session state: %s", toString(memberSessionState)));
        m_interfaces.getLocalLBPoolMember().set_session_enabled_state(poolNames, membersSessionStates);
    }

    private static void setMonitorState(Interfaces m_interfaces, CommonIPPortDefinition definition, String poolName, CommonEnabledState state) throws Exception
    {
        final String[] poolNames = {poolName};

        LocalLBPoolMemberMemberMonitorState memberMonitorState = new LocalLBPoolMemberMemberMonitorState(definition, state);

        LocalLBPoolMemberMemberMonitorState[] memberMonitorStates = {memberMonitorState};
        LocalLBPoolMemberMemberMonitorState[][] membersMonitorStates = {memberMonitorStates};

        log.info(String.format("Updating SLB VIP monitor state: %s", toString(memberMonitorState)));
        m_interfaces.getLocalLBPoolMember().set_monitor_state(poolNames, membersMonitorStates);
    }

    private static String toString(LocalLBPoolMemberMemberMonitorState state)
    {
        return String.format("LocalLBPoolMemberMemberMonitorState{member=%s, monitor_state=%s}", toString(state.getMember()), toString(state.getMonitor_state()));
    }

    private static String toString(CommonEnabledState monitor_state)
    {
        return String.format("CommonEnabledState{value=%s}", monitor_state.getValue());
    }

    private static String toString(CommonIPPortDefinition member)
    {
        return String.format("CommonIPPortDefinition{address=%s, port=%d}", member.getAddress(), member.getPort());
    }

    private static String toString(LocalLBPoolMemberMemberSessionState memberSessionState)
    {
        return String.format("LocalLBPoolMemberMemberSessionState{member=%s, session_state=%s}", toString(memberSessionState.getMember()), toString(memberSessionState.getSession_state()));
    }

    private String toString(LocalLBPoolMemberMemberObjectStatus[] poolMemberStatuses)
    {
        String res = "";
        for (LocalLBPoolMemberMemberObjectStatus status : poolMemberStatuses) {
            res = String.format("%s,", toString(status.getObject_status()));
        }
        return StringUtils.chomp(res, ",");
    }

    private String toString(LocalLBObjectStatus object_status)
    {
        return String.format("LocalLBObjectStatus{availability=%s, enabled=%s, description=%s}",
            object_status.getAvailability_status(), object_status.getEnabled_status(), object_status.getStatus_description());
    }
}

