/**
 * NetworkingAdminIPPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingAdminIPPortType extends java.rmi.Remote {

    /**
     * Creates the specified admin IP addresses with extended attributes.
     */
    public void create(java.lang.String[] admin_ips, java.lang.String[] netmasks) throws java.rmi.RemoteException;

    /**
     * Creates the specified cluster name& IP addresses.
     */
    public void create_cluster(java.lang.String[] cluster_names, java.lang.String[][] cluster_ips, java.lang.String[][] netmasks) throws java.rmi.RemoteException;

    /**
     * Creates the specified admin IP addresses on the designated
     * slots.
     */
    public void create_slot_ip(java.lang.String cluster_name, long[] slot_ids, java.lang.String[][] slot_ips) throws java.rmi.RemoteException;

    /**
     * Deletes the specified admin IP addresses.
     */
    public void delete_administrative_ip(java.lang.String[] admin_ips) throws java.rmi.RemoteException;

    /**
     * Deletes all admin IP addresses.
     */
    public void delete_all_administrative_ips() throws java.rmi.RemoteException;

    /**
     * Deletes all cluster admin IP addresses.
     */
    public void delete_all_cluster_ips(java.lang.String[] cluster_names) throws java.rmi.RemoteException;

    /**
     * Deletes all admin IP addresses on the designated slots.
     */
    public void delete_all_slot_ips(java.lang.String[] cluster_names, long[][] slot_ids) throws java.rmi.RemoteException;

    /**
     * Deletes the specified cluster admin IP addresses.
     */
    public void delete_cluster_ip(java.lang.String[] cluster_names, java.lang.String[][] cluster_ips) throws java.rmi.RemoteException;

    /**
     * Deletes the specified admin IP addresses on the designated
     * slots.
     */
    public void delete_slot_ip(java.lang.String cluster_name, long[] slot_ids, java.lang.String[][] slot_ips) throws java.rmi.RemoteException;

    /**
     * Gets a list of all cluster admin IPs on this cluster.
     */
    public java.lang.String[][] get_cluster_list(java.lang.String[] cluster_names) throws java.rmi.RemoteException;

    /**
     * Gets the netmasks of the specified cluster admin IPs.
     */
    public java.lang.String[][] get_cluster_netmask(java.lang.String[] cluster_names, java.lang.String[][] cluster_ips) throws java.rmi.RemoteException;

    /**
     * Gets a list of all admin IPs on this device.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the netmasks of the specified admin IPs.
     */
    public java.lang.String[] get_netmask(java.lang.String[] admin_ips) throws java.rmi.RemoteException;

    /**
     * Gets a list of all admin IPs on the designated slots.
     */
    public java.lang.String[][] get_slot_ip(java.lang.String cluster_name, long[] slot_ids) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Replaces the specified admin IP addresses with extended attributes.
     */
    public void replace_administrative_ip(java.lang.String[] old_ips, java.lang.String[] new_ips, java.lang.String[] netmasks) throws java.rmi.RemoteException;

    /**
     * Replaces the specified cluster name with new admin IP addresses.
     */
    public void replace_cluster_ip(java.lang.String[] cluster_names, java.lang.String[][] old_ips, java.lang.String[][] new_ips, java.lang.String[][] netmasks) throws java.rmi.RemoteException;

    /**
     * Replaces the specified admin IP addresses on the designated
     * slots.
     */
    public void replace_slot_ip(java.lang.String cluster_name, long[] slot_ids, java.lang.String[][] old_ips, java.lang.String[][] new_ips) throws java.rmi.RemoteException;

    /**
     * Sets the netmasks of the specified cluster admin IPs.
     */
    public void set_cluster_netmask(java.lang.String[] cluster_names, java.lang.String[][] cluster_ips, java.lang.String[][] netmasks) throws java.rmi.RemoteException;

    /**
     * Sets the netmasks of the specified admin IPs.
     */
    public void set_netmask(java.lang.String[] admin_ips, java.lang.String[] netmasks) throws java.rmi.RemoteException;
}
