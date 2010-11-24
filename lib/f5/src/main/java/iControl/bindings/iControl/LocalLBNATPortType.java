/**
 * LocalLBNATPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBNATPortType extends java.rmi.Remote {

    /**
     * Creates the specified NATs.
     */
    public void create(iControl.LocalLBNATNATDefinition[] nat_definitions, long[] unit_ids, iControl.CommonVLANFilterList[] vlans) throws java.rmi.RemoteException;

    /**
     * Deletes all NATs.
     */
    public void delete_all_nats() throws java.rmi.RemoteException;

    /**
     * Deletes the specified NATs.
     */
    public void delete_nat(iControl.LocalLBNATNATDefinition[] nat_definitions) throws java.rmi.RemoteException;

    /**
     * Gets statistics for all NATs.
     */
    public iControl.LocalLBNATNATStatistics get_all_statistics() throws java.rmi.RemoteException;

    /**
     * Gets the ARP states for the specified NATs.
     */
    public iControl.CommonEnabledState[] get_arp_state(iControl.LocalLBNATNATDefinition[] nat_definitions) throws java.rmi.RemoteException;

    /**
     * Gets the states of the specified NAT addresses.
     */
    public iControl.CommonEnabledState[] get_enabled_state(iControl.LocalLBNATNATDefinition[] nat_definitions) throws java.rmi.RemoteException;

    /**
     * Gets a sequence of all NAT definitions.
     */
    public iControl.LocalLBNATNATDefinition[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets statistics for a sequence of NATs.
     */
    public iControl.LocalLBNATNATStatistics get_statistics(iControl.LocalLBNATNATDefinition[] nat_definitions) throws java.rmi.RemoteException;

    /**
     * Gets the controller to which the specified NATs apply in an
     * active-active, redundant 
     *  load balancer configuration.
     */
    public long[] get_unit_id(iControl.LocalLBNATNATDefinition[] nat_definitions) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Gets the lists of VLANs on which access to the specified NATs
     * is disabled.
     */
    public iControl.CommonVLANFilterList[] get_vlan(iControl.LocalLBNATNATDefinition[] nat_definitions) throws java.rmi.RemoteException;

    /**
     * Resets statistics for a NAT.
     */
    public void reset_statistics(iControl.LocalLBNATNATDefinition[] nat_definitions) throws java.rmi.RemoteException;

    /**
     * Sets the ARP states for the specified NATs.
     */
    public void set_arp_state(iControl.LocalLBNATNATDefinition[] nat_definitions, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the state for a list of NAT addresses.
     */
    public void set_enabled_state(iControl.LocalLBNATNATDefinition[] nat_definitions, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the Unit IDs for the specified NATs.
     */
    public void set_unit_id(iControl.LocalLBNATNATDefinition[] nat_definitions, long[] unit_ids) throws java.rmi.RemoteException;

    /**
     * Adds VLANSs to the list of VLANs on which access to the specified
     * NATs is disabled.
     */
    public void set_vlan(iControl.LocalLBNATNATDefinition[] nat_definitions, iControl.CommonVLANFilterList[] vlans) throws java.rmi.RemoteException;
}
