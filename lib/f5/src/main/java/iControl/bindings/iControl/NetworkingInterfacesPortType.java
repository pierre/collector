/**
 * NetworkingInterfacesPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingInterfacesPortType extends java.rmi.Remote {

    /**
     * Gets the active media types of the specified interface names.
     */
    public iControl.NetworkingInterfacesMediaType[] get_active_media(java.lang.String[] interfaces) throws java.rmi.RemoteException;

    /**
     * Gets the actual/effective flow control types for the specified
     * interfaces.
     */
    public iControl.NetworkingFlowControlType[] get_actual_flow_control(java.lang.String[] interfaces) throws java.rmi.RemoteException;

    /**
     * Gets the statistics of all interfaces.
     */
    public iControl.NetworkingInterfacesInterfaceStatistics get_all_statistics() throws java.rmi.RemoteException;

    /**
     * Gets the states indicating whether the interface is a dual
     * media
     *  port supporting both fixed copper and SFP.
     */
    public iControl.CommonEnabledState[] get_dual_media_state(java.lang.String[] interfaces) throws java.rmi.RemoteException;

    /**
     * Gets the states of the specified interface names.
     */
    public iControl.CommonEnabledState[] get_enabled_state(java.lang.String[] interfaces) throws java.rmi.RemoteException;

    /**
     * Gets the configured learning modes of the specified interfaces.
     */
    public iControl.NetworkingLearningMode[] get_learning_mode(java.lang.String[] interfaces) throws java.rmi.RemoteException;

    /**
     * Gets a list of all interfaces on this device.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the MAC addresses of the specified interface names.
     */
    public java.lang.String[] get_mac_address(java.lang.String[] interfaces) throws java.rmi.RemoteException;

    /**
     * Gets the configured media types of the specified interface
     * names
     *  (settings for fixed, non-pluggable interfaces).
     */
    public iControl.NetworkingInterfacesMediaType[] get_media(java.lang.String[] interfaces) throws java.rmi.RemoteException;

    /**
     * Gets the media options for the specified interfaces.
     */
    public iControl.NetworkingInterfacesInterfaceMediaOption[] get_media_option(java.lang.String[] interfaces) throws java.rmi.RemoteException;

    /**
     * Gets the SFP media options for the specified interfaces.
     */
    public iControl.NetworkingInterfacesInterfaceMediaOption[] get_media_option_sfp(java.lang.String[] interfaces) throws java.rmi.RemoteException;

    /**
     * Gets the configured SFP media types of the specified interface
     * names.
     */
    public iControl.NetworkingInterfacesMediaType[] get_media_sfp(java.lang.String[] interfaces) throws java.rmi.RemoteException;

    /**
     * Gets the media speeds of the specified interface names. Unit
     * = Mbps.
     */
    public long[] get_media_speed(java.lang.String[] interfaces) throws java.rmi.RemoteException;

    /**
     * Gets the media status of the specified interface names.
     */
    public iControl.NetworkingMediaStatus[] get_media_status(java.lang.String[] interfaces) throws java.rmi.RemoteException;

    /**
     * Gets the MTUs of the specified interface names.
     */
    public long[] get_mtu(java.lang.String[] interfaces) throws java.rmi.RemoteException;

    /**
     * Gets the configured SFP media types of the specified interface
     * names.
     */
    public iControl.NetworkingPhyMasterSlaveMode[] get_phy_master_slave_mode(java.lang.String[] interfaces) throws java.rmi.RemoteException;

    /**
     * Gets the states indicating that SFP is the preferred media.
     * Only used for dual media ports.
     */
    public iControl.CommonEnabledState[] get_prefer_sfp_state(java.lang.String[] interfaces) throws java.rmi.RemoteException;

    /**
     * Gets the configured/requested flow control types for the specified
     * interfaces.
     */
    public iControl.NetworkingFlowControlType[] get_requested_flow_control(java.lang.String[] interfaces) throws java.rmi.RemoteException;

    /**
     * Gets the states indicating whether the interface supports SFP
     * media.
     */
    public iControl.CommonEnabledState[] get_sfp_media_state(java.lang.String[] interfaces) throws java.rmi.RemoteException;

    /**
     * Gets the statistics of the specified interfaces.
     */
    public iControl.NetworkingInterfacesInterfaceStatistics get_statistics(java.lang.String[] interfaces) throws java.rmi.RemoteException;

    /**
     * Gets the active states indicating whether the specified interfaces
     * are edge ports or not. The 
     *  spanning tree algorithms include important optimizations that can
     * only be used on so-called 
     *  edge ports, i.e. interfaces that connect to end stations rather than
     * to other bridges. 
     *  Note: This active state is reported by STP daemon.
     */
    public iControl.CommonEnabledState[] get_stp_active_edge_port_state(java.lang.String[] interfaces) throws java.rmi.RemoteException;

    /**
     * Gets the states indicating whether automatic detection of edge
     * port status for the
     *  specified interfaces.  When automatic edge port detection is enabled
     * on an interface, 
     *  the BIG-IP monitors the interface for incoming STP, RSTP, or MSTP
     * packets.  If no such 
     *  packets are received for a sufficient period of time (about 3 seconds),
     * the interface 
     *  is automatically given edge port status.  When automatic edge port
     * detection is disabled 
     *  on an interface, the BIG-IP never gives the interface edge port status
     * automatically.
     *  By default, automatic edge port detection is enabled on all interfaces.
     */
    public iControl.CommonEnabledState[] get_stp_auto_edge_port_detection_state(java.lang.String[] interfaces) throws java.rmi.RemoteException;

    /**
     * Gets the states indicating whether the specified interfaces
     * are edge ports or not. The 
     *  spanning tree algorithms include important optimizations that can
     * only be used on so-called 
     *  edge ports, i.e. interfaces that connect to end stations rather than
     * to other bridges.
     */
    public iControl.CommonEnabledState[] get_stp_edge_port_state(java.lang.String[] interfaces) throws java.rmi.RemoteException;

    /**
     * Gets the states indicating whether the specified interfaces
     * will participate in the
     *  spanning tree protocol.  Disabling spanning tree protocol on an interface
     * enables 
     *  learning and forwarding on it.  The spanning tree algorithm then
     * behaves as if the 
     *  interface did not exist.  No STP, RSTP, or MSTP packets are transmitted
     * or received
     *  on the interface, and the spanning tree algorithm exerts no control
     * over forwarding 
     *  or learning on the port.
     * 
     *  NOTE: Disabling spanning tree protocol on an interface which is a
     * configured member of 
     *  a trunk disables spanning tree protocol on the trunk as a whole.
     * For a trunk to 
     *  participate in spanning tree protocol, the protocol must be enabled
     * on all of its 
     *  configured member interfaces.
     */
    public iControl.CommonEnabledState[] get_stp_enabled_state(java.lang.String[] interfaces) throws java.rmi.RemoteException;

    /**
     * Gets the STP link types for the specified interfaces.
     */
    public iControl.NetworkingSTPLinkType[] get_stp_link_type(java.lang.String[] interfaces) throws java.rmi.RemoteException;

    /**
     * Gets the states indicating whether RSTP or MSTP BPDUs (depending
     * on the current STP
     *  mode) to be sent on the specified interfaces, until such time  as
     * a legacy STP bridge
     *  is detected again on those interfaces.
     * 
     *  Note: This method is only applicable when the current STP mode is
     * RSTP or MSTP.
     */
    public iControl.CommonEnabledState[] get_stp_protocol_detection_reset_state(java.lang.String[] interfaces) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Resets the statistics of the specified interfaces.
     */
    public void reset_statistics(java.lang.String[] interfaces) throws java.rmi.RemoteException;

    /**
     * Sets the states of the specified interface names.
     */
    public void set_enabled_state(java.lang.String[] interfaces, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the learning modes for the specified interfaces.
     */
    public void set_learning_mode(java.lang.String[] interfaces, iControl.NetworkingLearningMode[] modes) throws java.rmi.RemoteException;

    /**
     * Sets the media types of the specified interface names.
     *  (settings for fixed, non-pluggable interfaces).
     * 
     *  See set_media_fixed_or_sfp for a method you can use to
     *  set media type and not have to choose whether to affect settings
     *  for fixed or sfp media.
     */
    public void set_media(java.lang.String[] interfaces, iControl.NetworkingInterfacesMediaType[] media_types) throws java.rmi.RemoteException;

    /**
     * Set the media types of the specified interface names,
     *  conveniently choosing fixed or SFP media automatically.
     *  When you set the media type using this method, the system
     *  automatically affects the correct media based on whether
     *  the interface is a small form factor pluggable (SFP)
     *  interface, or for combo ports (see get_dual_media_state
     *  method) whether SFP is the preferred port. (When you get
     *  the setting you'll still need to use the correct method,
     *  get_media or get_media_sfp.)  You may manually affect the
     *  interface settings more directly by using the set_media or
     *  set_media_sfp methods.
     */
    public void set_media_fixed_or_sfp(java.lang.String[] interfaces, iControl.NetworkingInterfacesMediaType[] media_types) throws java.rmi.RemoteException;

    /**
     * Sets the SFP media types of the specified interface names.
     */
    public void set_media_sfp(java.lang.String[] interfaces, iControl.NetworkingInterfacesMediaType[] media_types) throws java.rmi.RemoteException;

    /**
     * Sets the SFP media types of the specified interface names.
     */
    public void set_phy_master_slave_mode(java.lang.String[] interfaces, iControl.NetworkingPhyMasterSlaveMode[] modes) throws java.rmi.RemoteException;

    /**
     * Sets the states indicating that SFP is the preferred media.
     * Only used for dual media ports.
     */
    public void set_prefer_sfp_state(java.lang.String[] interfaces, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the configured/requested flow control types for the specified
     * interfaces.
     */
    public void set_requested_flow_control(java.lang.String[] interfaces, iControl.NetworkingFlowControlType[] flow_controls) throws java.rmi.RemoteException;

    /**
     * Sets the states indicating whether automatic detection of edge
     * port status for the
     *  specified interfaces.  When automatic edge port detection is enabled
     * on an interface, 
     *  the BIG-IP monitors the interface for incoming STP, RSTP, or MSTP
     * packets.  If no such 
     *  packets are received for a sufficient period of time (about 3 seconds),
     * the interface 
     *  is automatically given edge port status.  When automatic edge port
     * detection is disabled 
     *  on an interface, the BIG-IP never gives the interface edge port status
     * automatically.
     *  By default, automatic edge port detection is enabled on all interfaces.
     */
    public void set_stp_auto_edge_port_detection_state(java.lang.String[] interfaces, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the states indicating whether the specified interfaces
     * are edge ports or not. The 
     *  spanning tree algorithms include important optimizations that can
     * only be used on so-called 
     *  edge ports, i.e. interfaces that connect to end stations rather than
     * to other bridges.
     */
    public void set_stp_edge_port_state(java.lang.String[] interfaces, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the states indicating whether the specified interfaces
     * will participate in the
     *  spanning tree protocol.  Disabling spanning tree protocol on an interface
     * enables 
     *  learning and forwarding on it.  The spanning tree algorithm then
     * behaves as if the 
     *  interface did not exist.  No STP, RSTP, or MSTP packets are transmitted
     * or received
     *  on the interface, and the spanning tree algorithm exerts no control
     * over forwarding 
     *  or learning on the port.
     * 
     *  NOTE: Disabling spanning tree protocol on an interface which is a
     * configured member of 
     *  a trunk disables spanning tree protocol on the trunk as a whole.
     * For a trunk to 
     *  participate in spanning tree protocol, the protocol must be enabled
     * on all of its 
     *  configured member interfaces.
     */
    public void set_stp_enabled_state(java.lang.String[] interfaces, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the STP link types for the specified interfaces.
     */
    public void set_stp_link_type(java.lang.String[] interfaces, iControl.NetworkingSTPLinkType[] link_types) throws java.rmi.RemoteException;

    /**
     * Sets the states indicating whether RSTP or MSTP BPDUs (depending
     * on the current STP
     *  mode) to be sent on the specified interfaces, until such time  as
     * a legacy STP bridge
     *  is detected again on those interfaces.
     * 
     *  Note: This method is only applicable when the current STP mode is
     * RSTP or MSTP.
     */
    public void set_stp_protocol_detection_reset_state(java.lang.String[] interfaces, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;
}
