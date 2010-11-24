/**
 * GlobalLBPoolPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface GlobalLBPoolPortType extends java.rmi.Remote {

    /**
     * Adds members to the specified pools.
     *  
     *  Note: as of v10.1.0, the members are reordered starting
     *  with 0, with no gaps, so the system maintains the relative
     *  order but not the absolute numbers originally specified for
     *  ordering.
     */
    public void add_member(java.lang.String[] pool_names, iControl.GlobalLBPoolPoolMemberDefinition[][] members) throws java.rmi.RemoteException;

    /**
     * Creates the specified pools.
     * 
     *  Note: as of v10.1.0, the members are reordered starting
     *  with 0, with no gaps, so the system maintains the relative
     *  order but not the absolute numbers originally specified for
     *  ordering.
     */
    public void create(java.lang.String[] pool_names, iControl.GlobalLBLBMethod[] lb_methods, iControl.GlobalLBPoolPoolMemberDefinition[][] members) throws java.rmi.RemoteException;

    /**
     * Deletes all pools.
     */
    public void delete_all_pools() throws java.rmi.RemoteException;

    /**
     * Deletes the specified pools.
     */
    public void delete_pool(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for all the pools.
     */
    public iControl.GlobalLBPoolPoolStatistics get_all_statistics() throws java.rmi.RemoteException;

    /**
     * Gets the alternate load balancing methods for the specified
     * pools.
     */
    public iControl.GlobalLBLBMethod[] get_alternate_lb_method(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the number of answers to return for the specified pools.
     */
    public long[] get_answers_to_return(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the CNAMEs for the specified pools.
     */
    public java.lang.String[] get_cname(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the states to indicate whether to use dynamic ratio to
     * modify the behavior of QOS.
     */
    public iControl.CommonEnabledState[] get_dynamic_ratio_state(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the enabled state of the specified pools.
     */
    public iControl.CommonEnabledState[] get_enabled_state(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the fallback/emergency failure IP for the specified pools.
     */
    public java.lang.String[] get_fallback_ip(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the fallback load balancing methods for the specified
     * pools.
     */
    public iControl.GlobalLBLBMethod[] get_fallback_lb_method(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets all metrics limits for a sequence of pools.
     */
    public iControl.GlobalLBPoolPoolMetricLimit[] get_limit(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets a list of pools.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the states indicating whether to disable pool members
     * when pool member status
     *  goes from Green to Red.
     */
    public iControl.CommonEnabledState[] get_manual_resume_state(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets a list of pool members.
     */
    public iControl.GlobalLBPoolPoolMemberDefinition[][] get_member(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the monitor associations for the specified pools, i.e.
     * the monitor rules used by the pools.
     */
    public iControl.GlobalLBPoolMonitorAssociation[] get_monitor_association(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the statuses of the specified pools.
     */
    public iControl.CommonObjectStatus[] get_object_status(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the preferred load balancing methods for the specified
     * pools.
     */
    public iControl.GlobalLBLBMethod[] get_preferred_lb_method(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the relative weight for bits per second when the load
     * balancing mode is set to LB_METHOD_QOS.
     */
    public long[] get_qos_coefficient_bps(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the relative weight for connection rate when the load
     * balancing mode is set to LB_METHOD_QOS.
     *  This function is deprecated and new applications should use vs_score.
     */
    public long[] get_qos_coefficient_connection_rate(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the relative weight for ping packet completion rate when
     * the load balancing mode is set to LB_METHOD_QOS.
     */
    public long[] get_qos_coefficient_hit_ratio(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the relative weight for hops when the load balancing mode
     * is set to LB_METHOD_QOS.
     */
    public long[] get_qos_coefficient_hops(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the relative weight for link capacity when the load balancing
     * mode is set to LB_METHOD_QOS.
     */
    public long[] get_qos_coefficient_lcs(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the relative weight for packet rate when the load balancing
     * mode is set to LB_METHOD_QOS.
     */
    public long[] get_qos_coefficient_packet_rate(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the relative weight for round-trip time when the load
     * balancing mode is set to LB_METHOD_QOS.
     */
    public long[] get_qos_coefficient_rtt(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the relative weight for topology when the load balancing
     * mode is set to LB_METHOD_QOS.
     */
    public long[] get_qos_coefficient_topology(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the relative weight for virtual server capacity when the
     * load balancing mode is set to LB_METHOD_QOS.
     */
    public long[] get_qos_coefficient_vs_capacity(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the relative weight for virtual server (VS) score when
     * the load balancing mode is set to LB_METHOD_QOS.
     */
    public long[] get_qos_coefficient_vs_score(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for the specified pools.
     */
    public iControl.GlobalLBPoolPoolStatistics get_statistics(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the TTL values for the specified pools.
     */
    public long[] get_ttl(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the states to indicate whether to check the availability
     * of pool member availability before using them.
     */
    public iControl.CommonEnabledState[] get_verify_member_availability_state(java.lang.String[] pool_names) throws java.rmi.RemoteException;

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
     * Sets the alternate load balancing methods for the specified
     * pools.
     */
    public void set_alternate_lb_method(java.lang.String[] pool_names, iControl.GlobalLBLBMethod[] lb_methods) throws java.rmi.RemoteException;

    /**
     * Sets the number of answers to return for the specified pools.
     */
    public void set_answers_to_return(java.lang.String[] pool_names, long[] answers) throws java.rmi.RemoteException;

    /**
     * Sets the CNAMEs for the specified pools.
     */
    public void set_cname(java.lang.String[] pool_names, java.lang.String[] cnames) throws java.rmi.RemoteException;

    /**
     * Sets the states to indicate whether to use dynamic ratio to
     * modify the behavior of QOS.
     */
    public void set_dynamic_ratio_state(java.lang.String[] pool_names, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the enabled state of the specified pools.
     */
    public void set_enabled_state(java.lang.String[] pool_names, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the fallback/emergency failure IP for the specified pools.
     */
    public void set_fallback_ip(java.lang.String[] pool_names, java.lang.String[] ips) throws java.rmi.RemoteException;

    /**
     * Sets the fallback load balancing methods for the specified
     * pools.
     */
    public void set_fallback_lb_method(java.lang.String[] pool_names, iControl.GlobalLBLBMethod[] lb_methods) throws java.rmi.RemoteException;

    /**
     * Sets the limits for pool metrics.
     */
    public void set_limit(iControl.GlobalLBPoolPoolMetricLimit[] limits) throws java.rmi.RemoteException;

    /**
     * Sets the states indicating whether to disable pool members
     * when pool member status
     *  goes from Green to Red.
     */
    public void set_manual_resume_state(java.lang.String[] pool_names, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets/creates the monitor associations for the specified pools.
     * This basically creates the monitor associations
     *  between a pool and a monitor rule.
     */
    public void set_monitor_association(iControl.GlobalLBPoolMonitorAssociation[] monitor_associations) throws java.rmi.RemoteException;

    /**
     * Sets the preferred load balancing methods for the specified
     * pools.
     */
    public void set_preferred_lb_method(java.lang.String[] pool_names, iControl.GlobalLBLBMethod[] lb_methods) throws java.rmi.RemoteException;

    /**
     * Sets the relative weight for bits per second when the load
     * balancing mode is set to LB_METHOD_QOS.
     */
    public void set_qos_coefficient_bps(java.lang.String[] pool_names, long[] values) throws java.rmi.RemoteException;

    /**
     * Sets the relative weight for connection rate when the load
     * balancing mode is set to LB_METHOD_QOS.
     *  This function is deprecated and new applications should use vs_score.
     */
    public void set_qos_coefficient_connection_rate(java.lang.String[] pool_names, long[] values) throws java.rmi.RemoteException;

    /**
     * Sets the relative weight for ping packet completion rate when
     * the load balancing mode is set to LB_METHOD_QOS.
     */
    public void set_qos_coefficient_hit_ratio(java.lang.String[] pool_names, long[] values) throws java.rmi.RemoteException;

    /**
     * Sets the relative weight for hops when the load balancing mode
     * is set to LB_METHOD_QOS.
     */
    public void set_qos_coefficient_hops(java.lang.String[] pool_names, long[] values) throws java.rmi.RemoteException;

    /**
     * Sets the relative weight for link capacity when the load balancing
     * mode is set to LB_METHOD_QOS.
     */
    public void set_qos_coefficient_lcs(java.lang.String[] pool_names, long[] values) throws java.rmi.RemoteException;

    /**
     * Sets the relative weight for packet rate when the load balancing
     * mode is set to LB_METHOD_QOS.
     */
    public void set_qos_coefficient_packet_rate(java.lang.String[] pool_names, long[] values) throws java.rmi.RemoteException;

    /**
     * Sets the relative weight for round-trip time when the load
     * balancing mode is set to LB_METHOD_QOS.
     */
    public void set_qos_coefficient_rtt(java.lang.String[] pool_names, long[] values) throws java.rmi.RemoteException;

    /**
     * Sets the relative weight for topology when the load balancing
     * mode is set to LB_METHOD_QOS.
     */
    public void set_qos_coefficient_topology(java.lang.String[] pool_names, long[] values) throws java.rmi.RemoteException;

    /**
     * Sets the relative weight for virtual server capacity when the
     * load balancing mode is set to LB_METHOD_QOS.
     */
    public void set_qos_coefficient_vs_capacity(java.lang.String[] pool_names, long[] values) throws java.rmi.RemoteException;

    /**
     * Sets the relative weight for virtual server (VS) score when
     * the load balancing mode is set to LB_METHOD_QOS.
     */
    public void set_qos_coefficient_vs_score(java.lang.String[] pool_names, long[] values) throws java.rmi.RemoteException;

    /**
     * Sets the TTL values for the specified pools.
     */
    public void set_ttl(java.lang.String[] pool_names, long[] values) throws java.rmi.RemoteException;

    /**
     * Sets the states to indicate whether to check the availability
     * of pool member availability before using them.
     */
    public void set_verify_member_availability_state(java.lang.String[] pool_names, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;
}
