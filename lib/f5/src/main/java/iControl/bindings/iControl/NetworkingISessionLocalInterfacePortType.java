/**
 * NetworkingISessionLocalInterfacePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingISessionLocalInterfacePortType extends java.rmi.Remote {

    /**
     * Create a local WOC object.
     */
    public void create(long woc_instance, java.lang.String[] local_ips, iControl.CommonEnabledState enabled, java.lang.String serverssl) throws java.rmi.RemoteException;

    /**
     * Delete the local WOC object.
     */
    public void delete_local(long[] wocs) throws java.rmi.RemoteException;

    /**
     * Get UUID
     */
    public iControl.NetworkingUuid_128[] get_UUID(long[] wocs) throws java.rmi.RemoteException;

    /**
     * Get the allow_nat attribute in the local WOC object.
     */
    public iControl.CommonEnabledState[] get_allow_nat(long[] wocs) throws java.rmi.RemoteException;

    /**
     * Get enable setting in the local WOC object.
     */
    public iControl.CommonEnabledState[] get_enabled_state(long[] wocs) throws java.rmi.RemoteException;

    /**
     * Get a list of the current WOC object names.
     */
    public java.lang.String[][] get_ip_list(long[] wocs) throws java.rmi.RemoteException;

    /**
     * Get a list of the current local endpoint object ids.
     */
    public long[] get_list() throws java.rmi.RemoteException;

    /**
     * Get Management address
     */
    public java.lang.String[] get_management_address(long[] wocs) throws java.rmi.RemoteException;

    /**
     * Gets the nat source address in the local WOC object.
     */
    public iControl.NetworkingISessionLocalInterfaceNatSourceAddress[] get_nat_source_address(long[] wocs) throws java.rmi.RemoteException;

    /**
     * Get serverssl name strings in the local WOC object(s).
     */
    public java.lang.String[] get_serverssl(long[] wocs) throws java.rmi.RemoteException;

    /**
     * Get local port number in the local WOC object.
     */
    public long[] get_tunnel_port(long[] wocs) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Set the allow_nat attribute in the local WOC object.
     */
    public void set_allow_nat(long[] wocs, iControl.CommonEnabledState[] nat_states) throws java.rmi.RemoteException;

    /**
     * Set enable in the local WOC object.
     */
    public void set_enabled_state(long[] wocs, iControl.CommonEnabledState[] enabled_states) throws java.rmi.RemoteException;

    /**
     * Set Management address
     */
    public void set_management_address(long[] wocs, java.lang.String[] ips) throws java.rmi.RemoteException;

    /**
     * Sets the nat source address in the local WOC object.
     */
    public void set_nat_source_address(long[] wocs, iControl.NetworkingISessionLocalInterfaceNatSourceAddress[] nat_states) throws java.rmi.RemoteException;

    /**
     * Set serverssl string in the local WOC object.
     */
    public void set_serverssl(long[] wocs, java.lang.String[] serverssls) throws java.rmi.RemoteException;

    /**
     * Set local port number in the local WOC object.
     */
    public void set_tunnel_port(long[] wocs, long[] ports) throws java.rmi.RemoteException;
}
