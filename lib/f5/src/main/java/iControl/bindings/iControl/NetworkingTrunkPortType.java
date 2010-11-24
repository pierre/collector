/**
 * NetworkingTrunkPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingTrunkPortType extends java.rmi.Remote {

    /**
     * Adds the lists of interfaces to the specified trunks.
     */
    public void add_interface(java.lang.String[] trunks, java.lang.String[][] interfaces) throws java.rmi.RemoteException;

    /**
     * Creates the specified trunks.
     */
    public void create(java.lang.String[] trunks, boolean[] lacp_states, java.lang.String[][] interfaces) throws java.rmi.RemoteException;

    /**
     * Deletes all trunks.
     */
    public void delete_all_trunks() throws java.rmi.RemoteException;

    /**
     * Deletes the specified trunks.
     */
    public void delete_trunk(java.lang.String[] trunks) throws java.rmi.RemoteException;

    /**
     * Gets the states indicating whether LACP is operating in active
     * or passive mode.
     *  When operating in passive mode, LACP will not send LACP frames out
     * LACP-enabled 
     *  interfaces or LACP-enabled trunks unless an LACP frame is first received
     * on that 
     *  interface or trunk. When operating in active mode, LACP immediately
     * begins sending 
     *  LACP frames from LACP-enabled interfaces and trunks.
     */
    public iControl.CommonEnabledState[] get_active_lacp_state(java.lang.String[] trunks) throws java.rmi.RemoteException;

    /**
     * Gets the statistics of all trunks.
     */
    public iControl.NetworkingTrunkTrunkStatistics get_all_statistics() throws java.rmi.RemoteException;

    /**
     * Gets the number of configured links of the specified trunks.
     */
    public long[] get_configured_member_count(java.lang.String[] trunks) throws java.rmi.RemoteException;

    /**
     * Gets the frame distribution hashing option used by the specified
     * trunks.
     */
    public iControl.NetworkingTrunkDistributionHashOption[] get_distribution_hash_option(java.lang.String[] trunks) throws java.rmi.RemoteException;

    /**
     * Gets the list of interfaces associated with the specified trunks.
     */
    public java.lang.String[][] get_interface(java.lang.String[] trunks) throws java.rmi.RemoteException;

    /**
     * Gets the states indicating whether LACP is enabled/disabled
     * for the specified trunks.
     */
    public iControl.CommonEnabledState[] get_lacp_enabled_state(java.lang.String[] trunks) throws java.rmi.RemoteException;

    /**
     * Gets LACP timeout options for the specified trunks.
     */
    public iControl.NetworkingTrunkLACPTimeoutOption[] get_lacp_timeout_option(java.lang.String[] trunks) throws java.rmi.RemoteException;

    /**
     * Gets the link selection policies used by the specified trunks.
     */
    public iControl.NetworkingTrunkLinkSelectionPolicy[] get_link_selection_policy(java.lang.String[] trunks) throws java.rmi.RemoteException;

    /**
     * Gets a list of all trunks on this device.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the current operational media speeds of the specified
     * trunks. Unit = Mbps.
     *  This will be equivalent to the sum of the speeds of all operational
     * links in
     *  a particular trunk.
     */
    public long[] get_media_speed(java.lang.String[] trunks) throws java.rmi.RemoteException;

    /**
     * Gets the media status of the specified trunks.
     */
    public iControl.NetworkingMediaStatus[] get_media_status(java.lang.String[] trunks) throws java.rmi.RemoteException;

    /**
     * Gets the current number of operational links of the specified
     * trunks.
     */
    public long[] get_operational_member_count(java.lang.String[] trunks) throws java.rmi.RemoteException;

    /**
     * Gets the statistics of the specified trunks.
     */
    public iControl.NetworkingTrunkTrunkStatistics get_statistics(java.lang.String[] trunks) throws java.rmi.RemoteException;

    /**
     * Gets the states indicating whether the specified trunks will
     * participate in the
     *  spanning tree protocol.  Disabling spanning tree protocol on a trunk
     * enables 
     *  learning and forwarding on it.  The spanning tree algorithm then
     * behaves as if the 
     *  trunk did not exist.  No STP, RSTP, or MSTP packets are transmitted
     * or received
     *  on the trunk, and the spanning tree algorithm exerts no control over
     * forwarding 
     *  or learning on the port.
     * 
     *  NOTE: For a trunk to participate in spanning tree protocol, the protocol
     * must be 
     *  enabled on all of its configured member interfaces.
     */
    public iControl.CommonEnabledState[] get_stp_enabled_state(java.lang.String[] trunks) throws java.rmi.RemoteException;

    /**
     * Gets the states indicating whether RSTP or MSTP BPDUs (depending
     * on the current STP
     *  mode) to be sent on the specified trunks, until such time  as a legacy
     * STP bridge
     *  is detected again on those trunks.
     * 
     *  Note: This method is only applicable when the current STP mode is
     * RSTP or MSTP.
     */
    public iControl.CommonEnabledState[] get_stp_protocol_detection_reset_state(java.lang.String[] trunks) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Removes all interfaces from the specified trunks.
     */
    public void remove_all_interfaces(java.lang.String[] trunks) throws java.rmi.RemoteException;

    /**
     * Removes the lists of interfaces from the specified trunks.
     */
    public void remove_interface(java.lang.String[] trunks, java.lang.String[][] interfaces) throws java.rmi.RemoteException;

    /**
     * Resets the statistics of the specified trunks.
     */
    public void reset_statistics(java.lang.String[] trunks) throws java.rmi.RemoteException;

    /**
     * Gets the states indicating whether LACP is operating in active
     * or passive mode.
     *  When operating in passive mode, LACP will not send LACP frames out
     * LACP-enabled 
     *  interfaces or LACP-enabled trunks unless an LACP frame is first received
     * on that 
     *  interface or trunk. When operating in active mode, LACP immediately
     * begins sending 
     *  LACP frames from LACP-enabled interfaces and trunks.
     */
    public void set_active_lacp_state(java.lang.String[] trunks, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the frame distribution hashing option used by the specified
     * trunks.
     */
    public void set_distribution_hash_option(java.lang.String[] trunks, iControl.NetworkingTrunkDistributionHashOption[] hashing_options) throws java.rmi.RemoteException;

    /**
     * Sets the states indicating whether LACP is enabled/disabled
     * for the specified trunks.
     */
    public void set_lacp_enabled_state(java.lang.String[] trunks, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Gets LACP timeout options for the specified trunks.
     */
    public void set_lacp_timeout_option(java.lang.String[] trunks, iControl.NetworkingTrunkLACPTimeoutOption[] timeout_options) throws java.rmi.RemoteException;

    /**
     * Sets the link selection policies used by the specified trunks.
     */
    public void set_link_selection_policy(java.lang.String[] trunks, iControl.NetworkingTrunkLinkSelectionPolicy[] policies) throws java.rmi.RemoteException;

    /**
     * Sets the states indicating whether the specified trunks will
     * participate in the
     *  spanning tree protocol.  Disabling spanning tree protocol on a trunk
     * enables 
     *  learning and forwarding on it.  The spanning tree algorithm then
     * behaves as if the 
     *  trunk did not exist.  No STP, RSTP, or MSTP packets are transmitted
     * or received
     *  on the trunk, and the spanning tree algorithm exerts no control over
     * forwarding 
     *  or learning on the port.
     * 
     *  NOTE: For a trunk to participate in spanning tree protocol, the protocol
     * must be 
     *  enabled on all of its configured member interfaces.
     */
    public void set_stp_enabled_state(java.lang.String[] trunks, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the states indicating whether RSTP or MSTP BPDUs (depending
     * on the current STP
     *  mode) to be sent on the specified trunks, until such time  as a legacy
     * STP bridge
     *  is detected again on those trunks.
     * 
     *  Note: This method is only applicable when the current STP mode is
     * RSTP or MSTP.
     */
    public void set_stp_protocol_detection_reset_state(java.lang.String[] trunks, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;
}
