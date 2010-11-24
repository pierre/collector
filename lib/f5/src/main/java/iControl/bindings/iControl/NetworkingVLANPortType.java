/**
 * NetworkingVLANPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingVLANPortType extends java.rmi.Remote {

    /**
     * Adds the specified member interfaces/trunks to the specified
     * VLANs.
     */
    public void add_member(java.lang.String[] vlans, iControl.NetworkingVLANMemberEntry[][] members) throws java.rmi.RemoteException;

    /**
     * Adds the static forwarding entries for the specified VLANs.
     */
    public void add_static_forwarding(java.lang.String[] vlans, iControl.NetworkingVLANForwardingTableEntry[][] forwarding_entries) throws java.rmi.RemoteException;

    /**
     * Creates the specified VLANs with extended attributes.
     */
    public void create(java.lang.String[] vlans, long[] vlan_ids, iControl.NetworkingVLANMemberEntry[][] members, iControl.CommonEnabledState[] failsafe_states, long[] timeouts, java.lang.String[] mac_masquerade_addresses) throws java.rmi.RemoteException;

    /**
     * Deletes all VLANs.
     */
    public void delete_all_vlans() throws java.rmi.RemoteException;

    /**
     * Deletes the specified VLANs.
     */
    public void delete_vlan(java.lang.String[] vlans) throws java.rmi.RemoteException;

    /**
     * Retrieves the dynamic forwarding entries for the specified
     * VLANs.
     */
    public iControl.NetworkingVLANForwardingTableEntry[][] get_dynamic_forwarding(java.lang.String[] vlans) throws java.rmi.RemoteException;

    /**
     * Gets the failsafe actions for the specified VLANs.
     */
    public iControl.CommonHAAction[] get_failsafe_action(java.lang.String[] vlans) throws java.rmi.RemoteException;

    /**
     * Gets the failsafe states for the specified VLANs.
     */
    public iControl.CommonEnabledState[] get_failsafe_state(java.lang.String[] vlans) throws java.rmi.RemoteException;

    /**
     * Gets the failsafe timeouts for the specified VLANs.
     */
    public long[] get_failsafe_timeout(java.lang.String[] vlans) throws java.rmi.RemoteException;

    /**
     * Gets the configured learning modes of the specified VLANs.
     */
    public iControl.NetworkingLearningMode[] get_learning_mode(java.lang.String[] vlans) throws java.rmi.RemoteException;

    /**
     * Gets a list of all VLANs on this device.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the MAC masquerade addresses for the specified VLANs.
     */
    public java.lang.String[] get_mac_masquerade_address(java.lang.String[] vlans) throws java.rmi.RemoteException;

    /**
     * Gets the members of the specified VLANs.
     */
    public iControl.NetworkingVLANMemberEntry[][] get_member(java.lang.String[] vlans) throws java.rmi.RemoteException;

    /**
     * Gets the MTUs for the specified VLANs.
     */
    public long[] get_mtu(java.lang.String[] vlans) throws java.rmi.RemoteException;

    /**
     * Gets the source checking states for the specified VLANs. If
     * enabled and auto lasthop is disabled, 
     *  check that the source of the first packet of a connection is correct
     * (correct VLAN, router, node). 
     *  This is equivalent to BSD's net.inet.sourcecheck sysctl variable.
     */
    public iControl.CommonEnabledState[] get_source_check_state(java.lang.String[] vlans) throws java.rmi.RemoteException;

    /**
     * Retrieves the static forwarding entries for the specified VLANs.
     */
    public iControl.NetworkingVLANForwardingTableEntry[][] get_static_forwarding(java.lang.String[] vlans) throws java.rmi.RemoteException;

    /**
     * Gets the true MAC addresses used by the specified VLANs.
     */
    public java.lang.String[] get_true_mac_address(java.lang.String[] vlans) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Gets the ids for the specified VLANs.
     */
    public long[] get_vlan_id(java.lang.String[] vlans) throws java.rmi.RemoteException;

    /**
     * Removes all dynamic forwarding entries from the specified VLANs.
     */
    public void remove_all_dynamic_forwardings(java.lang.String[] vlans) throws java.rmi.RemoteException;

    /**
     * Removes all member interfaces/trunks from the specified VLANs.
     */
    public void remove_all_members(java.lang.String[] vlans) throws java.rmi.RemoteException;

    /**
     * Removes all static forwarding entries from the specified VLANs.
     */
    public void remove_all_static_forwardings(java.lang.String[] vlans) throws java.rmi.RemoteException;

    /**
     * Removes the specified member interfaces/trunks from the specified
     * VLANs.
     */
    public void remove_member(java.lang.String[] vlans, iControl.NetworkingVLANMemberEntry[][] members) throws java.rmi.RemoteException;

    /**
     * Removes the static forwarding entries from the specified VLANs.
     */
    public void remove_static_forwarding(java.lang.String[] vlans, iControl.NetworkingVLANForwardingTableEntry[][] forwarding_entries) throws java.rmi.RemoteException;

    /**
     * Sets the failsafe actions for the specified VLANs.
     */
    public void set_failsafe_action(java.lang.String[] vlans, iControl.CommonHAAction[] actions) throws java.rmi.RemoteException;

    /**
     * Sets the failsafe states for the specified VLANs.
     */
    public void set_failsafe_state(java.lang.String[] vlans, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the failsafe timeouts for the specified VLANs.
     */
    public void set_failsafe_timeout(java.lang.String[] vlans, long[] timeouts) throws java.rmi.RemoteException;

    /**
     * Sets the learning modes for the specified VLANs.
     */
    public void set_learning_mode(java.lang.String[] vlans, iControl.NetworkingLearningMode[] modes) throws java.rmi.RemoteException;

    /**
     * Sets the MAC masquerade addresses for the specified VLANs.
     */
    public void set_mac_masquerade_address(java.lang.String[] vlans, java.lang.String[] mac_masquerade_addresses) throws java.rmi.RemoteException;

    /**
     * Sets the MTUs for the specified VLANs.
     */
    public void set_mtu(java.lang.String[] vlans, long[] mtus) throws java.rmi.RemoteException;

    /**
     * Sets the the source checking states for the specified VLANs.
     * If enabled and auto lasthop is disabled, 
     *  check that the source of the first packet of a connection is correct
     * (correct VLAN, router, node). 
     *  This is equivalent to BSD's net.inet.sourcecheck sysctl variable.
     */
    public void set_source_check_state(java.lang.String[] vlans, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the tag ids for the specified VLANs.
     *  
     *  Note: In some releases (9.4.0+), this method is not supported;
     *  delete and re-create the VLAN instead. In versions 10.0.0+,
     *  this method is supported.
     */
    public void set_vlan_id(java.lang.String[] vlans, long[] vlan_ids) throws java.rmi.RemoteException;
}
