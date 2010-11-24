/**
 * LocalLBNodeAddressPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBNodeAddressPortType extends java.rmi.Remote {

    /**
     * Creates the specified node addresses.
     */
    public void create(java.lang.String[] node_addresses, long[] limits) throws java.rmi.RemoteException;

    /**
     * Deletes all node addresses.
     */
    public void delete_all_node_addresses() throws java.rmi.RemoteException;

    /**
     * Deletes the specified node addresses.
     */
    public void delete_node_address(java.lang.String[] node_addresses) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for all the node addresses.
     */
    public iControl.LocalLBNodeAddressNodeAddressStatistics get_all_statistics() throws java.rmi.RemoteException;

    /**
     * Gets the connection limits for the specified node addresses.
     */
    public iControl.CommonULong64[] get_connection_limit(java.lang.String[] node_addresses) throws java.rmi.RemoteException;

    /**
     * Gets the dynamic ratios of a node addresses.
     */
    public int[] get_dynamic_ratio(java.lang.String[] node_addresses) throws java.rmi.RemoteException;

    /**
     * Gets a list of all node addresses.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the monitor associations used by the specified node addresses,
     * i.e. the monitor rules used by the node addresses.
     */
    public iControl.LocalLBNodeAddressMonitorAssociation[] get_monitor_association(iControl.LocalLBMonitorIP[] addresses) throws java.rmi.RemoteException;

    /**
     * Gets the monitor instance information for the specified node
     * addresses.
     */
    public iControl.LocalLBMonitorInstanceState[][] get_monitor_instance(iControl.LocalLBMonitorIP[] addresses) throws java.rmi.RemoteException;

    /**
     * Gets the current availability status of the specified node
     * addresses.
     */
    public iControl.LocalLBMonitorStatus[] get_monitor_status(java.lang.String[] node_addresses) throws java.rmi.RemoteException;

    /**
     * Gets the statuses of the specified node addresses.
     */
    public iControl.LocalLBObjectStatus[] get_object_status(java.lang.String[] node_addresses) throws java.rmi.RemoteException;

    /**
     * Gets the ratios for the specified node addresses.
     */
    public long[] get_ratio(java.lang.String[] node_addresses) throws java.rmi.RemoteException;

    /**
     * Gets the screen names for the specified node addresses.
     */
    public java.lang.String[] get_screen_name(java.lang.String[] node_addresses) throws java.rmi.RemoteException;

    /**
     * Note: This function has been deprecated. Please use get_session_status.
     * 
     *  Gets the states that allows new sessions to be established for the
     * specified node addresses.
     */
    public iControl.CommonEnabledState[] get_session_enabled_state(java.lang.String[] node_addresses) throws java.rmi.RemoteException;

    /**
     * Gets the current session statuses of the specified node addresses.
     */
    public iControl.LocalLBSessionStatus[] get_session_status(java.lang.String[] node_addresses) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for the specified node.
     */
    public iControl.LocalLBNodeAddressNodeAddressStatistics get_statistics(java.lang.String[] node_addresses) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Removes the monitor associations for the specified node addresses.
     * This basically deletes the 
     *  monitor associations between a node address and a monitor rule, i.e.
     * the specified node address 
     *  will no longer be monitored.
     */
    public void remove_monitor_association(iControl.LocalLBNodeAddressMonitorAssociationRemoval[] monitor_associations) throws java.rmi.RemoteException;

    /**
     * Resets the statistics for the specified node addresses.
     */
    public void reset_statistics(java.lang.String[] node_addresses) throws java.rmi.RemoteException;

    /**
     * Sets the connection limits for a sequence of node addresses.
     */
    public void set_connection_limit(java.lang.String[] node_addresses, iControl.CommonULong64[] limits) throws java.rmi.RemoteException;

    /**
     * Sets the dynamic ratios for the specified node addresses
     */
    public void set_dynamic_ratio(java.lang.String[] node_addresses, int[] dynamic_ratios) throws java.rmi.RemoteException;

    /**
     * Sets/creates the monitor associations for the specified node
     * addresses. This basically creates the monitor 
     *  associations between a node address and a monitor rule.
     */
    public void set_monitor_association(iControl.LocalLBNodeAddressMonitorAssociation[] monitor_associations) throws java.rmi.RemoteException;

    /**
     * Sets the availability states for a sequence of node addresses,
     * 
     *  either enabled/disabled or up/down.
     */
    public void set_monitor_state(java.lang.String[] node_addresses, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the ratios for the specified node addresses.
     */
    public void set_ratio(java.lang.String[] node_addresses, long[] ratios) throws java.rmi.RemoteException;

    /**
     * Sets the screen names for the specified node addresses.
     */
    public void set_screen_name(java.lang.String[] node_addresses, java.lang.String[] names) throws java.rmi.RemoteException;

    /**
     * Sets the states that allows new sessions to be established
     * for the specified node addresses.
     */
    public void set_session_enabled_state(java.lang.String[] node_addresses, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;
}
