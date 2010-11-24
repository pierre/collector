/**
 * NetworkingSTPGlobalsPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingSTPGlobalsPortType extends java.rmi.Remote {

    /**
     * Gets the configuration identifier name in a spanning tree region,
     * used to identify a group 
     *  of adjacent bridges with identical configuration name, configuration
     * revision levels, and 
     *  assignments of VLANs to spanning tree instances.  This setting is
     * used only when the STP mode
     *  is MSTP, however the user may set it in any STP mode.
     */
    public java.lang.String get_configuration_identifier() throws java.rmi.RemoteException;

    /**
     * Gets the configuration revision level of the MSTP configuration.
     * It's used only when
     *  the STP mode is MSTP, however, the user may set it in any STP mode.
     */
    public long get_configuration_revision() throws java.rmi.RemoteException;

    /**
     * Gets the forward delay parameter, which controls how long an
     * interface was blocked from
     *  forwarding network traffic after a reconfiguration of the spanning
     * tree topology. The 
     *  default value is 15 seconds, and the valid range is 4-30 seconds.
     * Note that this parameter
     *  has no effect when the STP mode is RSPT or MSTP, as long as all bridges
     * in the spanning tree
     *  use the RSTP or MSTP protocol.
     */
    public long get_forward_delay() throws java.rmi.RemoteException;

    /**
     * Gets the hello time, which is the time interval in seconds
     * between the periodic 
     *  transmissions that communicate spanning tree information to the adjacent
     * bridges 
     *  in the network. The default value is 2 seconds, and the valid range
     * is 1-10 seconds.
     */
    public long get_hello_time() throws java.rmi.RemoteException;

    /**
     * Gets the maximum age parameter, which controls how long spanning
     * tree information 
     *  received from other bridges is considered valid.  The default value
     * is 20 seconds,
     *  and the valid range is 6-40 seconds.
     */
    public long get_maximum_age() throws java.rmi.RemoteException;

    /**
     * Gets the maximum hops an MSTP packet may travel before it is
     * discarded.  It's used only when
     *  the STP mode is MSTP, however, the user may set it in any STP mode.
     */
    public long get_maximum_hop() throws java.rmi.RemoteException;

    /**
     * Gets the STP mode.
     */
    public iControl.NetworkingSTPModeType get_mode() throws java.rmi.RemoteException;

    /**
     * Gets the transmit hold count parameter, which is an absolute
     * limit on the number of spanning 
     *  tree protocol packets the BIG-IP may transmit on a port in any hello
     * time interval.  This ensures
     *  that the spanning tree packets will not unduly load the network even
     * in unstable conditions.
     *  The default value is 6 packets, and the valid range is 1-10 packets.
     */
    public long get_transmit_hold() throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Sets the configuration identifier name in a spanning tree region,
     * used to identify a group 
     *  of adjacent bridges with identical configuration name, configuration
     * revision levels, and 
     *  assignments of VLANs to spanning tree instances.  This setting is
     * used only when the STP mode
     *  is MSTP, however the user may set it in any STP mode.
     */
    public void set_configuration_identifier(java.lang.String value) throws java.rmi.RemoteException;

    /**
     * Sets the configuration revision level of the MSTP configuration.
     * It's used only when
     *  the STP mode is MSTP, however, the user may set it in any STP mode.
     */
    public void set_configuration_revision(long value) throws java.rmi.RemoteException;

    /**
     * Sets the forward delay parameter, which controls how long an
     * interface was blocked from
     *  forwarding network traffic after a reconfiguration of the spanning
     * tree topology. The 
     *  default value is 15 seconds, and the valid range is 4-30 seconds.
     * Note that this parameter
     *  has no effect when the STP mode is RSPT or MSTP, as long as all bridges
     * in the spanning tree
     *  use the RSTP or MSTP protocol.
     */
    public void set_forward_delay(long value) throws java.rmi.RemoteException;

    /**
     * Sets the hello time, which is the time interval in seconds
     * between the periodic 
     *  transmissions that communicate spanning tree information to the adjacent
     * bridges 
     *  in the network. The default value is 2 seconds, and the valid range
     * is 1-10 seconds.
     */
    public void set_hello_time(long value) throws java.rmi.RemoteException;

    /**
     * Sets the maximum age parameter, which controls how long spanning
     * tree information 
     *  received from other bridges is considered valid.  The default value
     * is 20 seconds,
     *  and the valid range is 6-40 seconds.
     */
    public void set_maximum_age(long value) throws java.rmi.RemoteException;

    /**
     * Sets the maximum hops an MSTP packet may travel before it is
     * discarded.  It's used only when
     *  the STP mode is MSTP, however, the user may set it in any STP mode.
     */
    public void set_maximum_hop(long value) throws java.rmi.RemoteException;

    /**
     * Sets the STP mode.
     */
    public void set_mode(iControl.NetworkingSTPModeType value) throws java.rmi.RemoteException;

    /**
     * Sets the transmit hold count parameter, which is an absolute
     * limit on the number of spanning 
     *  tree protocol packets the BIG-IP may transmit on a port in any hello
     * time interval.  This ensures
     *  that the spanning tree packets will not unduly load the network even
     * in unstable conditions.
     *  The default value is 6 packets, and the valid range is 1-10 packets.
     */
    public void set_transmit_hold(long value) throws java.rmi.RemoteException;
}
