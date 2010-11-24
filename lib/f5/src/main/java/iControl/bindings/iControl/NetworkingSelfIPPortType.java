/**
 * NetworkingSelfIPPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingSelfIPPortType extends java.rmi.Remote {

    /**
     * Creates the specified self IP addresses with extended attributes.
     */
    public void create(java.lang.String[] self_ips, java.lang.String[] vlan_names, java.lang.String[] netmasks, long[] unit_ids, iControl.CommonEnabledState[] floating_states) throws java.rmi.RemoteException;

    /**
     * Deletes all self IP addresses.
     */
    public void delete_all_self_ips() throws java.rmi.RemoteException;

    /**
     * Deletes the specified self IP addresses.
     */
    public void delete_self_ip(java.lang.String[] self_ips) throws java.rmi.RemoteException;

    /**
     * Gets the floating states of the specified self IPs.
     */
    public iControl.CommonEnabledState[] get_floating_state(java.lang.String[] self_ips) throws java.rmi.RemoteException;

    /**
     * Gets a list of all self IPs on this device.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the netmasks of the specified self IPs.
     */
    public java.lang.String[] get_netmask(java.lang.String[] self_ips) throws java.rmi.RemoteException;

    /**
     * Gets the unit ids of the specified self IPs.
     */
    public long[] get_unit_id(java.lang.String[] self_ips) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Gets the VLANs with which the specified self IPs are associated.
     */
    public java.lang.String[] get_vlan(java.lang.String[] self_ips) throws java.rmi.RemoteException;

    /**
     * Sets the floating states of the specified self IPs.
     *  Note: If floating state is being set to enabled, then unit ID will
     * be set to 1 by default.
     *        If floating state is being set to disabled, then unit ID will
     * be set to 0.
     */
    public void set_floating_state(java.lang.String[] self_ips, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the netmasks of the specified self IPs.
     */
    public void set_netmask(java.lang.String[] self_ips, java.lang.String[] netmasks) throws java.rmi.RemoteException;

    /**
     * Sets the unit ids of the specified self IPs.
     *  Note: If unit ID is being set to 0, then floating state will be set
     * to disabled by default.
     *        If unit ID is being set to 1 or 2, then floating state will
     * be set to enabled.
     */
    public void set_unit_id(java.lang.String[] self_ips, long[] unit_ids) throws java.rmi.RemoteException;

    /**
     * Sets the VLANs with which the specified self IPs are associated.
     */
    public void set_vlan(java.lang.String[] self_ips, java.lang.String[] vlan_names) throws java.rmi.RemoteException;
}
