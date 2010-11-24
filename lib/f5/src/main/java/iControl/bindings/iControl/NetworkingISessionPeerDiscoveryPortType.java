/**
 * NetworkingISessionPeerDiscoveryPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingISessionPeerDiscoveryPortType extends java.rmi.Remote {

    /**
     * Gets the setting allows other remote endpoints to discover
     * this local endpoint and advertises the 
     *  local ability to connect.
     */
    public iControl.CommonEnabledState[] get_discoverable_peer_enabled_state(long[] dynpeerlist) throws java.rmi.RemoteException;

    /**
     * Gets the current setting allows other remote endpoints to discover
     * this local endpoint 
     *  and enables and disables the logic that detects this condition.
     */
    public iControl.CommonEnabledState[] get_discovered_peer_enabled_state(long[] dynpeerlist) throws java.rmi.RemoteException;

    /**
     * Gets the modes that allows other remote endpoints to enable
     * automatic discovery of this local  
     *  iSession endpoint
     */
    public iControl.NetworkingISessionPeerDiscoveryDiscoveryMode[] get_discovery_mode(long[] dynpeerlist) throws java.rmi.RemoteException;

    /**
     * Gets the setting that allows other remote endpoints to enable
     * automatic discovery of this local  
     *  iSession endpoint
     */
    public iControl.NetworkingISessionPeerDiscoveryFilterMode[] get_discovery_mode_enabled_state(long[] dynpeerlist) throws java.rmi.RemoteException;

    /**
     * Gets the setting that controls the time we allow for ICMP retries
     * for other remote 
     *  endpoints to discover this local endpoint
     */
    public int[] get_icmp_backoff_time(long[] dynpeerlist) throws java.rmi.RemoteException;

    /**
     * Gets the setting that controls the number of ICMP requests
     * that we alow for other remote 
     *  endpoints to discover this local endpoint
     */
    public int[] get_icmp_max_requests(long[] dynpeerlist) throws java.rmi.RemoteException;

    /**
     * Gets the setting that controls the number of ICMP retries that
     * we allow for other remote 
     *  endpoints to discover this local endpoint
     */
    public int[] get_icmp_max_retries(long[] dynpeerlist) throws java.rmi.RemoteException;

    /**
     * Gets a list of all Dynamic Peer Discovery objects on this device.
     */
    public long[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the setting that controls the number of ICMP requests
     * that we alow for other remote 
     *  endpoints to discover this local endpoint
     */
    public int[] get_max_peer_count(long[] dynpeerlist) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Sets the setting allows other remote endpoints to discover
     * this local endpoint and advertises the 
     *  local ability to connect.
     */
    public void set_discoverable_peer_enabled_state(long[] dynpeerlist, iControl.CommonEnabledState[] discoverable_peer) throws java.rmi.RemoteException;

    /**
     * Resets the current setting that allows other remote endpoints
     * to discover this local endpoint 
     *  and enables and disables the logic that detects this condition.
     */
    public void set_discovered_peer_enabled_state(long[] dynpeerlist, iControl.CommonEnabledState[] discover_peer) throws java.rmi.RemoteException;

    /**
     * Sets the modes that allows other remote endpoints to enable
     * automatic discovery of this local  
     *  iSession endpoint
     */
    public void set_discovery_mode(long[] dynpeerlist, iControl.NetworkingISessionPeerDiscoveryDiscoveryMode[] discovery_modes) throws java.rmi.RemoteException;

    /**
     * Sets the setting that allows other remote endpoints to enable
     * automatic discovery of this local  
     *  iSession endpoint
     */
    public void set_discovery_mode_enabled_state(long[] dynpeerlist, iControl.NetworkingISessionPeerDiscoveryFilterMode[] discovery_mode) throws java.rmi.RemoteException;

    /**
     * Sets the setting that controls the time we allow for ICMP retries
     * for other remote 
     *  endpoints to discover this local endpoint
     */
    public void set_icmp_backoff_time(long[] dynpeerlist, int[] max_backoff_time) throws java.rmi.RemoteException;

    /**
     * Sets the setting that controls the number of ICMP requests
     * that we alow for other remote 
     *  endpoints to discover this local endpoint
     */
    public void set_icmp_max_requests(long[] dynpeerlist, int[] max_requests) throws java.rmi.RemoteException;

    /**
     * Sets the setting that controls the number of ICMP retries that
     * we allow for other remote 
     *  endpoints to discover this local endpoint
     */
    public void set_icmp_max_retries(long[] dynpeerlist, int[] max_retries) throws java.rmi.RemoteException;

    /**
     * Sets the setting that controls the number of ICMP requests
     * that we alow for other remote 
     *  endpoints to discover this local endpoint
     */
    public void set_max_peer_count(long[] dynpeerlist, int[] max_peers) throws java.rmi.RemoteException;
}
