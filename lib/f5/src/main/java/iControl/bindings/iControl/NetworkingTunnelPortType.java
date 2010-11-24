/**
 * NetworkingTunnelPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingTunnelPortType extends java.rmi.Remote {

    /**
     * Creates a set of tunnels.
     */
    public void create(java.lang.String[] tunnels, java.lang.String[] local_addresses, java.lang.String[] remote_addresses, java.lang.String[] profiles) throws java.rmi.RemoteException;

    /**
     * Deletes all tunnels.
     */
    public void delete_all_tunnels() throws java.rmi.RemoteException;

    /**
     * Deletes a set of tunnels.
     */
    public void delete_tunnel(java.lang.String[] tunnels) throws java.rmi.RemoteException;

    /**
     * Gets the direction for traffic flow within a set of tunnels.
     */
    public iControl.NetworkingTunnelTunnelDirection[] get_direction(java.lang.String[] tunnels) throws java.rmi.RemoteException;

    /**
     * Gets the names of all tunnels.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the IP address for the local end of a set of tunnels.
     */
    public java.lang.String[] get_local_address(java.lang.String[] tunnels) throws java.rmi.RemoteException;

    /**
     * Gets the maximum transmission unit (MTU) for a set of tunnels.
     */
    public long[] get_mtu(java.lang.String[] tunnels) throws java.rmi.RemoteException;

    /**
     * Gets the profile specifying the tunneling protocol for a set
     * of
     *  tunnels.
     */
    public java.lang.String[] get_profile(java.lang.String[] tunnels) throws java.rmi.RemoteException;

    /**
     * Gets the IP address for the remote end for a set of tunnels.
     */
    public java.lang.String[] get_remote_address(java.lang.String[] tunnels) throws java.rmi.RemoteException;

    /**
     * Gets the Type of Service (ToS) value for the encapsulating
     * packet's
     *  IP header.
     */
    public long[] get_tos(java.lang.String[] tunnels) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Sets the direction for traffic flow within a set of tunnels.
     */
    public void set_direction(java.lang.String[] tunnels, iControl.NetworkingTunnelTunnelDirection[] directions) throws java.rmi.RemoteException;

    /**
     * Sets the IP address for the local end of the tunnel for a set
     * of
     *  tunnels
     */
    public void set_local_address(java.lang.String[] tunnels, java.lang.String[] addresses) throws java.rmi.RemoteException;

    /**
     * Sets the maximum transmission unit (MTU) for a set of tunnels.
     * 
     *  If zero, the tunnel's MTU is automatically set to the MTU of the
     *  tunnel's underlying interface minus the encapsulation overhead
     *  introduced by the tunneling protocol in use for the tunnel.
     */
    public void set_mtu(java.lang.String[] tunnels, long[] mtus) throws java.rmi.RemoteException;

    /**
     * Sets the profile specifying the tunneling protocol for a set
     * of
     *  tunnels.
     * 
     *  This profile may be an IPIP, GRE, or WCCP-GRE profile type.
     */
    public void set_profile(java.lang.String[] tunnels, java.lang.String[] profiles) throws java.rmi.RemoteException;

    /**
     * Sets the IP address for the remote end of a set of tunnels.
     */
    public void set_remote_address(java.lang.String[] tunnels, java.lang.String[] addresses) throws java.rmi.RemoteException;

    /**
     * Sets the Type of Service (ToS) value for the encapsulating
     * packet's
     *  IP header.  The valid range is zero to 254.  The special value
     *  65535 specifies that the encapsulating packet's IP header ToS value
     * is set to the encapsulated packet's IP header ToS value.
     */
    public void set_tos(java.lang.String[] tunnels, long[] values) throws java.rmi.RemoteException;
}
