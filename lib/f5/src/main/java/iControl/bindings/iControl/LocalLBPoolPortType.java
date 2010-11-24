/**
 * LocalLBPoolPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBPoolPortType extends java.rmi.Remote {

    /**
     * Adds members to the specified pools.
     */
    public void add_member(java.lang.String[] pool_names, iControl.CommonIPPortDefinition[][] members) throws java.rmi.RemoteException;

    /**
     * Creates a new pool.
     */
    public void create(java.lang.String[] pool_names, iControl.LocalLBLBMethod[] lb_methods, iControl.CommonIPPortDefinition[][] members) throws java.rmi.RemoteException;

    /**
     * Deletes all pools.
     */
    public void delete_all_pools() throws java.rmi.RemoteException;

    /**
     * Deletes the persistence records based on the specified persistent
     * modes for the specified pools.
     */
    public void delete_persistence_record(java.lang.String[] pool_names, iControl.LocalLBPersistenceMode[] persistence_modes) throws java.rmi.RemoteException;

    /**
     * Deletes the specified pools.
     */
    public void delete_pool(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the action to take when the node goes down for the specified
     * pools.
     */
    public iControl.LocalLBServiceDownAction[] get_action_on_service_down(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the current active member counts for the specified pools.
     */
    public long[] get_active_member_count(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the aggregate dynamic ratio values from all the members
     * of the pools.
     */
    public long[] get_aggregate_dynamic_ratio(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for all the pools.
     */
    public iControl.LocalLBPoolPoolStatistics get_all_statistics() throws java.rmi.RemoteException;

    /**
     * Gets the states indicating whether NATs are allowed for the
     * specified pools.
     */
    public iControl.CommonEnabledState[] get_allow_nat_state(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the states indicating whether SNATs are allowed for the
     * specified pools.
     */
    public iControl.CommonEnabledState[] get_allow_snat_state(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the IP ToS values for client traffic for the specified
     * pools.
     */
    public long[] get_client_ip_tos(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the link QoS values for client traffic for the specified
     * pools.
     */
    public long[] get_client_link_qos(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the gateway failsafe unit IDs for the specified pools.
     */
    public long[] get_gateway_failsafe_unit_id(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the load balancing methods for the specified pools.
     */
    public iControl.LocalLBLBMethod[] get_lb_method(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets a list of all pools.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets a list of pool members.
     */
    public iControl.CommonIPPortDefinition[][] get_member(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the minimum active member counts for the specified pools.
     */
    public long[] get_minimum_active_member(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the minimum member counts that are required to be UP for
     * the specified pools.
     */
    public long[] get_minimum_up_member(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the actions to be taken if the minimum number of members
     * required to be UP
     *  for the specified pools is not met.
     */
    public iControl.CommonHAAction[] get_minimum_up_member_action(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the states indicating that the feature that requires a
     * minimum number of 
     *  members to be UP is enabled/disabled for the specified pools.
     */
    public iControl.CommonEnabledState[] get_minimum_up_member_enabled_state(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the monitor associations for the specified pools, i.e.
     * the monitor rules used by the pools.
     */
    public iControl.LocalLBPoolMonitorAssociation[] get_monitor_association(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the monitor instance information for the specified pools,
     * i.e. the monitor instance
     *  information for the pool members of the specified pools.
     */
    public iControl.LocalLBMonitorInstanceState[][] get_monitor_instance(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the statuses of the specified pools.
     */
    public iControl.LocalLBObjectStatus[] get_object_status(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the persistence records based on the specified persistent
     * modes for the specified pools.
     */
    public iControl.LocalLBPersistenceRecord[][] get_persistence_record(java.lang.String[] pool_names, iControl.LocalLBPersistenceMode[] persistence_modes) throws java.rmi.RemoteException;

    /**
     * Gets the IP ToS values for server traffic for the specified
     * pools.
     */
    public long[] get_server_ip_tos(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the link QoS values for server traffic for the specified
     * pools.
     */
    public long[] get_server_link_qos(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the simple timeouts for the specified pools.
     */
    public long[] get_simple_timeout(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the ramp-up time (in seconds) to gradually ramp up the
     * load on newly added
     *  or freshly detected UP pool members.
     */
    public long[] get_slow_ramp_time(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for the specified pools.
     */
    public iControl.LocalLBPoolPoolStatistics get_statistics(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Removes members from the specified pools.
     */
    public void remove_member(java.lang.String[] pool_names, iControl.CommonIPPortDefinition[][] members) throws java.rmi.RemoteException;

    /**
     * Removes the monitor associations for the specified pools. 
     * This basically deletes the monitor
     *  associations between a pool and a monitor rule, i.e. the specified
     * pools will no longer
     *  be monitored.
     */
    public void remove_monitor_association(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Resets the statistics for the specified pools.
     */
    public void reset_statistics(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Sets the action to take when the node goes down for the specified
     * pools.
     */
    public void set_action_on_service_down(java.lang.String[] pool_names, iControl.LocalLBServiceDownAction[] actions) throws java.rmi.RemoteException;

    /**
     * Sets the states indicating whether NATs are allowed for the
     * specified pools.
     */
    public void set_allow_nat_state(java.lang.String[] pool_names, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the states indicating whether SNATs are allowed for the
     * specified pools.
     */
    public void set_allow_snat_state(java.lang.String[] pool_names, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the IP ToS values for client traffic for the specified
     * pools.
     */
    public void set_client_ip_tos(java.lang.String[] pool_names, long[] values) throws java.rmi.RemoteException;

    /**
     * Sets the link QoS values for client traffic for the specified
     * pools.
     */
    public void set_client_link_qos(java.lang.String[] pool_names, long[] values) throws java.rmi.RemoteException;

    /**
     * Sets the gateway failsafe unit IDs for the specified pools.
     */
    public void set_gateway_failsafe_unit_id(java.lang.String[] pool_names, long[] unit_ids) throws java.rmi.RemoteException;

    /**
     * Sets the load balancing methods for the specified pools.
     */
    public void set_lb_method(java.lang.String[] pool_names, iControl.LocalLBLBMethod[] lb_methods) throws java.rmi.RemoteException;

    /**
     * Sets the minimum active member counts for the specified pools.
     */
    public void set_minimum_active_member(java.lang.String[] pool_names, long[] values) throws java.rmi.RemoteException;

    /**
     * Sets the minimum member counts that are required to be UP for
     * the specified pools.
     */
    public void set_minimum_up_member(java.lang.String[] pool_names, long[] values) throws java.rmi.RemoteException;

    /**
     * Sets the actions to be taken if the minimum number of members
     * required to be UP
     *  for the specified pools is not met.
     */
    public void set_minimum_up_member_action(java.lang.String[] pool_names, iControl.CommonHAAction[] actions) throws java.rmi.RemoteException;

    /**
     * Sets the states indicating that the feature that requires a
     * minimum number of 
     *  members to be UP is enabled/disabled for the specified pools.
     */
    public void set_minimum_up_member_enabled_state(java.lang.String[] pool_names, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets/creates the monitor associations for the specified pools.
     * This basically creates the monitor associations
     *  between a pool and a monitor rule.
     */
    public void set_monitor_association(iControl.LocalLBPoolMonitorAssociation[] monitor_associations) throws java.rmi.RemoteException;

    /**
     * Sets the IP ToS values for server traffic for the specified
     * pools.
     */
    public void set_server_ip_tos(java.lang.String[] pool_names, long[] values) throws java.rmi.RemoteException;

    /**
     * Sets the link QoS values for server traffic for the specified
     * pools.
     */
    public void set_server_link_qos(java.lang.String[] pool_names, long[] values) throws java.rmi.RemoteException;

    /**
     * Sets the simple timeouts for the specified pools.
     */
    public void set_simple_timeout(java.lang.String[] pool_names, long[] simple_timeouts) throws java.rmi.RemoteException;

    /**
     * Sets the ramp-up time (in seconds) to gradually ramp up the
     * load on newly added
     *  or freshly detected UP pool members.
     */
    public void set_slow_ramp_time(java.lang.String[] pool_names, long[] values) throws java.rmi.RemoteException;
}
