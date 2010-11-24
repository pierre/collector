/**
 * LocalLBPoolMemberPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBPoolMemberPortType extends java.rmi.Remote {

    /**
     * Gets the statistics for all pool members of the specified pools.
     */
    public iControl.LocalLBPoolMemberMemberStatistics[] get_all_statistics(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the connection limits for all members in the specified
     * pools.
     */
    public iControl.LocalLBPoolMemberMemberConnectionLimit[][] get_connection_limit(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the dynamic ratios for all members of the specified pools.
     */
    public iControl.LocalLBPoolMemberMemberDynamicRatio[][] get_dynamic_ratio(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the monitor associations used by the specified pool members,
     * i.e. the monitor rules used by the pool members.
     */
    public iControl.LocalLBPoolMemberMemberMonitorAssociation[][] get_monitor_association(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the monitor instance information for the pool members
     * in the specified pools.
     */
    public iControl.LocalLBPoolMemberMemberMonitorInstanceState[][] get_monitor_instance(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the monitor/availability status for all members of the
     * specified pools.
     */
    public iControl.LocalLBPoolMemberMemberMonitorStatus[][] get_monitor_status(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the object statuses for all members of the specified pools.
     */
    public iControl.LocalLBPoolMemberMemberObjectStatus[][] get_object_status(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the priorities for all members in the specified pools.
     */
    public iControl.LocalLBPoolMemberMemberPriority[][] get_priority(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the ratios for all members in the specified pools.
     */
    public iControl.LocalLBPoolMemberMemberRatio[][] get_ratio(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Note: This function has been deprecated. Please use get_session_status.
     * 
     *  Gets the session states for all members of the specified pools.
     */
    public iControl.LocalLBPoolMemberMemberSessionState[][] get_session_enabled_state(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the session status for all members of the specified pools.
     */
    public iControl.LocalLBPoolMemberMemberSessionStatus[][] get_session_status(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for the specified set of pool members.
     */
    public iControl.LocalLBPoolMemberMemberStatistics[] get_statistics(java.lang.String[] pool_names, iControl.CommonIPPortDefinition[][] members) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Removes the monitor associations for the specified pool members.
     * Depending on the monitor association removal rule
     *  specified, this basically deletes any explicit monitor associations
     * between a pool member and a monitor rule and thus
     *  causing the pool member to use the default monitor association of
     * its parent pool, or this will delete any monitor 
     *  association for the pool members altogether, i.e. the specified pool
     * members will no longer be monitored.
     */
    public void remove_monitor_association(java.lang.String[] pool_names, iControl.LocalLBPoolMemberMemberMonitorAssociationRemoval[][] monitor_associations) throws java.rmi.RemoteException;

    /**
     * Resets the statistics for the specified set of pool members.
     */
    public void reset_statistics(java.lang.String[] pool_names, iControl.CommonIPPortDefinition[][] members) throws java.rmi.RemoteException;

    /**
     * Sets the connection limits for the specified pool members.
     */
    public void set_connection_limit(java.lang.String[] pool_names, iControl.LocalLBPoolMemberMemberConnectionLimit[][] limits) throws java.rmi.RemoteException;

    /**
     * Sets the dynamic ratios for the specified pool members.
     */
    public void set_dynamic_ratio(java.lang.String[] pool_names, iControl.LocalLBPoolMemberMemberDynamicRatio[][] dynamic_ratios) throws java.rmi.RemoteException;

    /**
     * Sets/creates the monitor associations for the specified pool
     * members. This basically creates the monitor 
     *  associations between a pool member and a monitor rule.
     */
    public void set_monitor_association(java.lang.String[] pool_names, iControl.LocalLBPoolMemberMemberMonitorAssociation[][] monitor_associations) throws java.rmi.RemoteException;

    /**
     * Sets the monitor/availability states for the specified pool
     * members.
     */
    public void set_monitor_state(java.lang.String[] pool_names, iControl.LocalLBPoolMemberMemberMonitorState[][] monitor_states) throws java.rmi.RemoteException;

    /**
     * Sets the priorities for the specified pool members.
     */
    public void set_priority(java.lang.String[] pool_names, iControl.LocalLBPoolMemberMemberPriority[][] priorities) throws java.rmi.RemoteException;

    /**
     * Sets the ratios for the specified pool members.
     */
    public void set_ratio(java.lang.String[] pool_names, iControl.LocalLBPoolMemberMemberRatio[][] ratios) throws java.rmi.RemoteException;

    /**
     * Sets the session states for the specified pool members. If
     * session state is enabled or true,
     *  this means that new sessions will be allowed to be established with
     * the pool members.
     */
    public void set_session_enabled_state(java.lang.String[] pool_names, iControl.LocalLBPoolMemberMemberSessionState[][] session_states) throws java.rmi.RemoteException;
}
