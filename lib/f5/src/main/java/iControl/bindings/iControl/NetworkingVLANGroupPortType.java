/**
 * NetworkingVLANGroupPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingVLANGroupPortType extends java.rmi.Remote {

    /**
     * Adds the specified IP addresses to the global proxy ARP exclusion
     * list that applies to all VLAN groups.
     */
    public void add_global_proxy_exclusion(java.lang.String[] addresses) throws java.rmi.RemoteException;

    /**
     * Adds the specified children VLANs to the specified VLAN groups.
     */
    public void add_member(java.lang.String[] vlan_groups, java.lang.String[][] member_vlans) throws java.rmi.RemoteException;

    /**
     * Adds the specified IP addresses to the proxy ARP exclusion
     * lists of the specified VLAN groups.
     */
    public void add_proxy_exclusion(java.lang.String[] vlan_groups, java.lang.String[][] addresses) throws java.rmi.RemoteException;

    /**
     * This method has been deprecated; please use create_v2 instead.
     * 
     *  Creates a VLAN group.
     */
    public void create(java.lang.String[] vlan_groups, long[] vlan_ids, java.lang.String[][] member_vlans) throws java.rmi.RemoteException;

    /**
     * Creates a VLAN group.
     */
    public void create_v2(java.lang.String[] vlan_groups, java.lang.String[][] member_vlans) throws java.rmi.RemoteException;

    /**
     * Deletes all VLAN groups.
     */
    public void delete_all_vlan_groups() throws java.rmi.RemoteException;

    /**
     * Deletes the specified VLAN groups.
     */
    public void delete_vlan_group(java.lang.String[] vlan_groups) throws java.rmi.RemoteException;

    /**
     * Gets the states to indicate whether to bridge non-IP traffic
     * as well as IP traffic 
     *  for the specified VLAN groups.
     */
    public iControl.CommonEnabledState[] get_bridge_all_traffic_state(java.lang.String[] vlan_groups) throws java.rmi.RemoteException;

    /**
     * Gets the states to indicate whether to bridge while unit is
     * in standby mode 
     *  for the specified VLAN groups.
     */
    public iControl.CommonEnabledState[] get_bridge_in_standby_state(java.lang.String[] vlan_groups) throws java.rmi.RemoteException;

    /**
     * Gets the states to indicate whether to bridge multicast/broadcast
     * traffic 
     *  for the specified VLAN groups.
     */
    public iControl.CommonEnabledState[] get_bridge_multicast_state(java.lang.String[] vlan_groups) throws java.rmi.RemoteException;

    /**
     * Gets the global lists of IP addresses that proxy ARP will ignore
     * for all VLAN groups.
     */
    public java.lang.String[] get_global_proxy_exclusion() throws java.rmi.RemoteException;

    /**
     * Gets a list of all VLAN groups on this device.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the MAC masquerade addresses for the specified VLAN groups.
     */
    public java.lang.String[] get_mac_masquerade_address(java.lang.String[] vlan_groups) throws java.rmi.RemoteException;

    /**
     * Gets the lists of children VLANs of the specified VLAN groups.
     */
    public java.lang.String[][] get_member(java.lang.String[] vlan_groups) throws java.rmi.RemoteException;

    /**
     * Gets the lists of IP addresses that proxy ARP will ignore for
     * the specified VLAN groups.
     */
    public java.lang.String[][] get_proxy_exclusion(java.lang.String[] vlan_groups) throws java.rmi.RemoteException;

    /**
     * Gets the transparency modes for the specified VLAN groups.
     */
    public iControl.NetworkingVLANGroupVLANGroupTransparency[] get_transparency_mode(java.lang.String[] vlan_groups) throws java.rmi.RemoteException;

    /**
     * Gets the true MAC addresses used by the specified VLAN groups.
     */
    public java.lang.String[] get_true_mac_address(java.lang.String[] vlan_groups) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * This method has been deprecated; accessing VLAN id for a VLAN
     * group
     *  was unnecessary and misleading.  The method now returns 0s.
     *  Please don't use in the future.
     * 
     *  Gets the ids for the specified VLAN groups.
     */
    public long[] get_vlan_id(java.lang.String[] vlan_groups) throws java.rmi.RemoteException;

    /**
     * Removes all IP addresses from the global proxy ARP exclusion
     * list for all VLAN groups.
     */
    public void remove_all_global_proxy_exclusions() throws java.rmi.RemoteException;

    /**
     * Removes all children VLANs from the specified VLAN groups.
     */
    public void remove_all_members(java.lang.String[] vlan_groups) throws java.rmi.RemoteException;

    /**
     * Removes all IP addresses from the proxy ARP exclusion lists
     * of the specified VLAN groups.
     */
    public void remove_all_proxy_exclusions(java.lang.String[] vlan_groups) throws java.rmi.RemoteException;

    /**
     * Removes the specified IP addresses from the global proxy ARP
     * exclusion list that applies to all VLAN groups.
     */
    public void remove_global_proxy_exclusion(java.lang.String[] addresses) throws java.rmi.RemoteException;

    /**
     * Removes the specified children VLANs from the specified VLAN
     * groups.
     */
    public void remove_member(java.lang.String[] vlan_groups, java.lang.String[][] member_vlans) throws java.rmi.RemoteException;

    /**
     * Removes the specified IP addresses from the proxy ARP exclusion
     * lists of the specified VLAN groups.
     */
    public void remove_proxy_exclusion(java.lang.String[] vlan_groups, java.lang.String[][] addresses) throws java.rmi.RemoteException;

    /**
     * Sets the states to indicate whether to bridge non-IP traffic
     * as well as IP traffic 
     *  for the specified VLAN groups.
     */
    public void set_bridge_all_traffic_state(java.lang.String[] vlan_groups, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the states to indicate whether to bridge while unit is
     * in standby mode 
     *  for the specified VLAN groups.
     */
    public void set_bridge_in_standby_state(java.lang.String[] vlan_groups, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the states to indicate whether to bridge multicast/broadcast
     * traffic 
     *  for the specified VLAN groups.
     */
    public void set_bridge_multicast_state(java.lang.String[] vlan_groups, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the MAC masquerade addresses for the specified VLAN groups.
     */
    public void set_mac_masquerade_address(java.lang.String[] vlan_groups, java.lang.String[] mac_masquerade_addresses) throws java.rmi.RemoteException;

    /**
     * Sets the transparency modes for the specified VLAN groups.
     */
    public void set_transparency_mode(java.lang.String[] vlan_groups, iControl.NetworkingVLANGroupVLANGroupTransparency[] modes) throws java.rmi.RemoteException;

    /**
     * This method has been deprecated; setting VLAN id for a VLAN
     * group
     *  had and will have no effect.  Please don't use in the future.
     * 
     *  Sets the tag ids for the specified VLAN groups.
     */
    public void set_vlan_id(java.lang.String[] vlan_groups, long[] vlan_ids) throws java.rmi.RemoteException;
}
