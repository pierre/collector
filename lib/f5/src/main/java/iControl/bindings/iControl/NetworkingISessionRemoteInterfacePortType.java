/**
 * NetworkingISessionRemoteInterfacePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingISessionRemoteInterfacePortType extends java.rmi.Remote {

    /**
     * Create a peer Remote Endpoint object.
     */
    public void create(java.lang.String[] peer_names, java.lang.String[] serverssls, java.lang.String[] peer_ips, iControl.CommonEnabledState[] enabled_states) throws java.rmi.RemoteException;

    /**
     * Deletes all peer remote endpoint objects.
     */
    public void delete_all_peers() throws java.rmi.RemoteException;

    /**
     * Delete the peer Remote Endpoint object.
     */
    public void delete_peer(java.lang.String[] peers) throws java.rmi.RemoteException;

    /**
     * Get UUID
     */
    public iControl.NetworkingUuid_128[] get_UUID(java.lang.String[] peers) throws java.rmi.RemoteException;

    /**
     * Get the nat attribute from the peer WOC object.
     */
    public iControl.CommonEnabledState[] get_behind_nat(java.lang.String[] peers) throws java.rmi.RemoteException;

    /**
     * Get dedup_cache
     */
    public long[] get_dedup_cache(java.lang.String[] peers) throws java.rmi.RemoteException;

    /**
     * Get a list of the current iSession peer objects.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Get Management address
     */
    public java.lang.String[] get_management_address(java.lang.String[] peers) throws java.rmi.RemoteException;

    /**
     * Get config_status
     */
    public java.lang.String[] get_nat_config_status(java.lang.String[] peers) throws java.rmi.RemoteException;

    /**
     * Get the nat address attribute in the peer WOC object.
     */
    public iControl.NetworkingISessionRemoteInterfaceNatSourceAddress[] get_nat_source_address(java.lang.String[] peers) throws java.rmi.RemoteException;

    /**
     * Get origin
     */
    public iControl.NetworkingISessionRemoteInterfaceOriginState[] get_origin(java.lang.String[] peers) throws java.rmi.RemoteException;

    /**
     * Get enable setting in the peer object.
     */
    public iControl.CommonEnabledState[] get_peer_enabled_state(java.lang.String[] peers) throws java.rmi.RemoteException;

    /**
     * Get a list of the current iSession peer object ips.
     */
    public java.lang.String[][] get_peer_ip_list(java.lang.String[] peers) throws java.rmi.RemoteException;

    /**
     * Get enabled flag in the peer routing attribute.
     */
    public iControl.CommonEnabledState[] get_peer_routing_state(java.lang.String[] peers) throws java.rmi.RemoteException;

    /**
     * Get serverssl
     */
    public java.lang.String[] get_profile_serverssl(java.lang.String[] peers) throws java.rmi.RemoteException;

    /**
     * Get tunnel_port
     */
    public int[] get_tunnel_port(java.lang.String[] peers) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Set the nat attribute in the peer WOC object.
     */
    public void set_behind_nat(java.lang.String[] peers, iControl.CommonEnabledState[] nat_states) throws java.rmi.RemoteException;

    /**
     * Set Management address
     */
    public void set_management_address(java.lang.String[] peers, java.lang.String[] ips) throws java.rmi.RemoteException;

    /**
     * Set config_status
     */
    public void set_nat_config_status(java.lang.String[] peers, java.lang.String[] nat_configs) throws java.rmi.RemoteException;

    /**
     * Set the nat address attribute in the peer WOC object.
     */
    public void set_nat_source_address(java.lang.String[] peers, iControl.NetworkingISessionRemoteInterfaceNatSourceAddress[] nat_states) throws java.rmi.RemoteException;

    /**
     * Set origin
     */
    public void set_origin(java.lang.String[] peers, iControl.NetworkingISessionRemoteInterfaceOriginState[] origins) throws java.rmi.RemoteException;

    /**
     * Set enable in the peer object.
     */
    public void set_peer_enabled_state(java.lang.String[] peers, iControl.CommonEnabledState[] enabled) throws java.rmi.RemoteException;

    /**
     * Set enabled flag in the peer routing attribute.
     */
    public void set_peer_routing_state(java.lang.String[] peers, iControl.CommonEnabledState[] routing) throws java.rmi.RemoteException;

    /**
     * Set serverssl
     */
    public void set_profile_serverssl(java.lang.String[] peers, java.lang.String[] serverssl) throws java.rmi.RemoteException;

    /**
     * Set tunnel_port
     */
    public void set_tunnel_port(java.lang.String[] peers, int[] tunnel_ports) throws java.rmi.RemoteException;
}
