/**
 * GlobalLBPoolMemberPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface GlobalLBPoolMemberPortType extends java.rmi.Remote {

    /**
     * Adds the virtual servers to the dependency list that the specified
     * pool members depend on.
     */
    public void add_dependency(java.lang.String[] pool_names, iControl.GlobalLBPoolMemberMemberDependency[][] dependencies) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for all pool members of the specified pools.
     */
    public iControl.GlobalLBPoolMemberMemberStatistics[] get_all_statistics(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the list of virtual servers that the specified pool members
     * depend on.
     */
    public iControl.GlobalLBPoolMemberMemberDependency[][] get_dependency(java.lang.String[] pool_names, iControl.CommonIPPortDefinition[][] members) throws java.rmi.RemoteException;

    /**
     * Gets the enabled states for the specified members in the specified
     * pools.
     */
    public iControl.GlobalLBPoolMemberMemberEnabledState[][] get_enabled_state(java.lang.String[] pool_names, iControl.CommonIPPortDefinition[][] members) throws java.rmi.RemoteException;

    /**
     * Gets the metric limits for the specified members of the specified
     * pools.
     */
    public iControl.GlobalLBPoolMemberMemberMetricLimit[][] get_limit(java.lang.String[] pool_names, iControl.CommonIPPortDefinition[][] members) throws java.rmi.RemoteException;

    /**
     * Gets the monitor associations used by the specified pool members,
     * i.e. the monitor rules used by the pool members.
     */
    public iControl.GlobalLBPoolMemberMemberMonitorAssociation[][] get_monitor_association(java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Gets the statuses for the specified members in the specified
     * pools.
     */
    public iControl.GlobalLBPoolMemberMemberObjectStatus[][] get_object_status(java.lang.String[] pool_names, iControl.CommonIPPortDefinition[][] members) throws java.rmi.RemoteException;

    /**
     * Gets the orders for the specified members in the specified
     * pools.
     */
    public iControl.GlobalLBPoolMemberMemberOrder[][] get_order(java.lang.String[] pool_names, iControl.CommonIPPortDefinition[][] members) throws java.rmi.RemoteException;

    /**
     * Gets the ratios for the specified members in the specified
     * pools.
     */
    public iControl.GlobalLBPoolMemberMemberRatio[][] get_ratio(java.lang.String[] pool_names, iControl.CommonIPPortDefinition[][] members) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for the specified set of pool members.
     */
    public iControl.GlobalLBPoolMemberMemberStatistics[] get_statistics(java.lang.String[] pool_names, iControl.CommonIPPortDefinition[][] members) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Removes any and all dependencies of the specified pool members.
     */
    public void remove_all_dependencies(java.lang.String[] pool_names, iControl.CommonIPPortDefinition[][] members) throws java.rmi.RemoteException;

    /**
     * Removes the virtual servers from the dependency list that the
     * specified pool members depend on.
     */
    public void remove_dependency(java.lang.String[] pool_names, iControl.GlobalLBPoolMemberMemberDependency[][] dependencies) throws java.rmi.RemoteException;

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
    public void remove_monitor_association(java.lang.String[] pool_names, iControl.GlobalLBPoolMemberMemberMonitorAssociationRemoval[][] monitor_associations) throws java.rmi.RemoteException;

    /**
     * Resets the statistics for the specified set of pool members.
     */
    public void reset_statistics(java.lang.String[] pool_names, iControl.CommonIPPortDefinition[][] members) throws java.rmi.RemoteException;

    /**
     * Sets the enabled states for the specified pool members in the
     * specified pools.
     */
    public void set_enabled_state(java.lang.String[] pool_names, iControl.GlobalLBPoolMemberMemberEnabledState[][] states) throws java.rmi.RemoteException;

    /**
     * Sets the metric limits for the specified members of the specified
     * pools.
     */
    public void set_limit(java.lang.String[] pool_names, iControl.GlobalLBPoolMemberMemberMetricLimit[][] limits) throws java.rmi.RemoteException;

    /**
     * Sets/creates the monitor associations for the specified pool
     * members. This basically creates the monitor 
     *  associations between a pool member and a monitor rule.
     */
    public void set_monitor_association(java.lang.String[] pool_names, iControl.GlobalLBPoolMemberMemberMonitorAssociation[][] monitor_associations) throws java.rmi.RemoteException;

    /**
     * Sets the orders for the specified pool members.
     *  
     *  Note: as of v10.1.0, the members are reordered starting
     *  with 0, with no gaps, so the system maintains the relative
     *  order but not the absolute numbers originally specified for
     *  ordering.
     */
    public void set_order(java.lang.String[] pool_names, iControl.GlobalLBPoolMemberMemberOrder[][] orders) throws java.rmi.RemoteException;

    /**
     * Sets the ratios for the specified pool members.
     */
    public void set_ratio(java.lang.String[] pool_names, iControl.GlobalLBPoolMemberMemberRatio[][] ratios) throws java.rmi.RemoteException;
}
