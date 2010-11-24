/**
 * LocalLBVirtualAddressPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBVirtualAddressPortType extends java.rmi.Remote {

    /**
     * Deletes the specified virtual addresses.
     */
    public void delete_virtual_address(java.lang.String[] virtual_addresses) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for all the virtual addresses.
     */
    public iControl.LocalLBVirtualAddressVirtualAddressStatistics get_all_statistics() throws java.rmi.RemoteException;

    /**
     * Gets the ARP states for the specified virtual addresses.
     */
    public iControl.CommonEnabledState[] get_arp_state(java.lang.String[] virtual_addresses) throws java.rmi.RemoteException;

    /**
     * Gets the connection limits for the specified virtual addresses.
     */
    public iControl.CommonULong64[] get_connection_limit(java.lang.String[] virtual_addresses) throws java.rmi.RemoteException;

    /**
     * Gets the enabled states of the specified virtual addresses.
     */
    public iControl.CommonEnabledState[] get_enabled_state(java.lang.String[] virtual_addresses) throws java.rmi.RemoteException;

    /**
     * Gets the the states that indicate whether these virtual addresses
     * should be shared between
     *  the redundant pair. This is typically used in one-armed Combo pair,
     * where GTM is only
     *  licensed on one of the boxes. Default is TRUE.
     */
    public iControl.CommonEnabledState[] get_is_floating_state(java.lang.String[] virtual_addresses) throws java.rmi.RemoteException;

    /**
     * Gets a list of virtual addresses.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the status of each of the specified virtual addresses.
     */
    public iControl.LocalLBObjectStatus[] get_object_status(java.lang.String[] virtual_addresses) throws java.rmi.RemoteException;

    /**
     * Gets the route advertisement states for the specified virtual
     * addresses.
     */
    public iControl.CommonEnabledState[] get_route_advertisement_state(java.lang.String[] virtual_addresses) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for the specified virtual addresses.
     */
    public iControl.LocalLBVirtualAddressVirtualAddressStatistics get_statistics(java.lang.String[] virtual_addresses) throws java.rmi.RemoteException;

    /**
     * Gets the status dependency scopes that are used to calculate
     * the virtual addresses' status based
     *  on the related virtual servers' status.
     */
    public iControl.LocalLBVirtualAddressStatusDependency[] get_status_dependency_scope(java.lang.String[] virtual_addresses) throws java.rmi.RemoteException;

    /**
     * Gets the list of unit IDs used by the specified virtual addresses.
     */
    public long[] get_unit_id(java.lang.String[] virtual_addresses) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Resets the statistics for the specified virtual addresses.
     */
    public void reset_statistics(java.lang.String[] virtual_addresses) throws java.rmi.RemoteException;

    /**
     * Sets the ARP states for the specified virtual addresses.
     */
    public void set_arp_state(java.lang.String[] virtual_addresses, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the connection limits of the specified virtual addresses.
     */
    public void set_connection_limit(java.lang.String[] virtual_addresses, iControl.CommonULong64[] limits) throws java.rmi.RemoteException;

    /**
     * Sets the enabled states of the specified virtual addresses.
     */
    public void set_enabled_state(java.lang.String[] virtual_addresses, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the states that indicate whether these virtual addresses
     * should be shared between
     *  the redundant pair. This is typically used in one-armed Combo pair,
     * where GTM is only
     *  licensed on one of the boxes. Default is TRUE.
     */
    public void set_is_floating_state(java.lang.String[] virtual_addresses, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the route advertisement states for the specified virtual
     * addresses.
     */
    public void set_route_advertisement_state(java.lang.String[] virtual_addresses, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the status dependency scopes that are used to calculate
     * the virtual addresses' status based
     *  on the related virtual servers' status.
     */
    public void set_status_dependency_scope(java.lang.String[] virtual_addresses, iControl.LocalLBVirtualAddressStatusDependency[] scopes) throws java.rmi.RemoteException;

    /**
     * Sets the unit IDs for the specified virtual addresses.
     */
    public void set_unit_id(java.lang.String[] virtual_addresses, long[] unit_ids) throws java.rmi.RemoteException;
}
