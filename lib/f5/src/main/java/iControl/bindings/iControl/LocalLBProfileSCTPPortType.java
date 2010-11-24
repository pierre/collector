/**
 * LocalLBProfileSCTPPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBProfileSCTPPortType extends java.rmi.Remote {

    /**
     * Creates the specified SCTP profiles.
     */
    public void create(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Deletes all SCTP profiles.
     */
    public void delete_all_profiles() throws java.rmi.RemoteException;

    /**
     * Deletes the specified SCTP profiles.
     */
    public void delete_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for all the SCTP profiles.
     */
    public iControl.LocalLBProfileSCTPProfileSCTPStatistics get_all_statistics() throws java.rmi.RemoteException;

    /**
     * Gets the maximum number of retries to establish the connection
     * for 
     *  the specified SCTP profiles.
     */
    public iControl.LocalLBProfileULong[] get_connect_maximum_retry(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the valid duration of cookies for the specified SCTP profiles.
     */
    public iControl.LocalLBProfileULong[] get_cookie_expiration(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public java.lang.String[] get_default_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the state that if true, SCTP will emulate TCP closing.
     */
    public iControl.LocalLBProfileEnabledState[] get_emulate_tcp_shutdown_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the intervals (in seconds) between heartbeats.
     */
    public iControl.LocalLBProfileULong[] get_heartbeat_interval(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the number of seconds without traffic before the connection
     * is
     *  eligible for deletion.
     */
    public iControl.LocalLBProfileULong[] get_idle_timeout(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the number of inbound streams used by the specified SCTP
     * profiles.
     */
    public iControl.LocalLBProfileULong[] get_inbound_stream(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the IP ToS values in packets sent to peer.
     */
    public iControl.LocalLBProfileULong[] get_ip_tos_to_peer(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the link QoS values in packets sent to peer.
     */
    public iControl.LocalLBProfileULong[] get_link_qos_to_peer(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets a list of all SCTP profiles.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the state that if true, SCPT will order the received messages
     * 
     *  before delivering them to upper layer.
     */
    public iControl.LocalLBProfileEnabledState[] get_order_receive_message_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the number of outbound streams used by the specified SCTP
     * profiles.
     */
    public iControl.LocalLBProfileULong[] get_outbound_stream(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the proxy buffer level at which the receive window is
     * closed 
     *  (not advanced) for the specified SCTP profiles.
     */
    public iControl.LocalLBProfileULong[] get_proxy_buffer_high(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the proxy buffer level at which the receive window is
     * opened 
     *  for the specified SCTP profiles.
     */
    public iControl.LocalLBProfileULong[] get_proxy_buffer_low(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the number of RX chunk buffers used by the specified SCTP
     * profiles.
     */
    public iControl.LocalLBProfileULong[] get_receive_chunk_buffer(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the receive window sizes used by the specified SCTP profiles.
     */
    public iControl.LocalLBProfileULong[] get_receive_window_size(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the state that if true, SCTP will reset the connection
     * when a timeout occurs.
     */
    public iControl.LocalLBProfileEnabledState[] get_reset_on_timeout_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the internal secret strings used to HMAC cookies.
     */
    public iControl.LocalLBProfileString[] get_secret(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the send buffer sizes (in bytes) used by the specified
     * SCTP profiles.
     */
    public iControl.LocalLBProfileULong[] get_send_buffer_size(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the maximum number of retries to send data for 
     *  the specified SCTP profiles.
     */
    public iControl.LocalLBProfileULong[] get_send_maximum_retry(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the state that indicates whether SCTP will accept and
     * send partial 
     *  application data.
     */
    public iControl.LocalLBProfileEnabledState[] get_send_partial_data_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for the specified SCTP profiles.
     */
    public iControl.LocalLBProfileSCTPProfileSCTPStatistics get_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the number of TX chunk buffers used by the specified SCTP
     * profiles.
     */
    public iControl.LocalLBProfileULong[] get_transmit_chunk_buffer(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Determines whether the specified profiles are base/pre-configured
     * profiles, or user-defined profiles.
     */
    public boolean[] is_base_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Resets the statistics for the specified SCTP profiles.
     */
    public void reset_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Sets the maximum number of retries to establish the connection
     * for 
     *  the specified SCTP profiles.
     */
    public void set_connect_maximum_retry(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] retries) throws java.rmi.RemoteException;

    /**
     * Sets the valid duration of cookies for the specified SCTP profiles.
     */
    public void set_cookie_expiration(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] durations) throws java.rmi.RemoteException;

    /**
     * Sets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public void set_default_profile(java.lang.String[] profile_names, java.lang.String[] defaults) throws java.rmi.RemoteException;

    /**
     * Sets the state that if true, SCTP will emulate TCP closing.
     */
    public void set_emulate_tcp_shutdown_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the intervals (in seconds) between heartbeats.
     */
    public void set_heartbeat_interval(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] intervals) throws java.rmi.RemoteException;

    /**
     * Sets the number of seconds without traffic before the connection
     * is
     *  eligible for deletion.
     */
    public void set_idle_timeout(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] timeouts) throws java.rmi.RemoteException;

    /**
     * Sets the number of inbound streams used by the specified SCTP
     * profiles.
     */
    public void set_inbound_stream(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] streams) throws java.rmi.RemoteException;

    /**
     * Sets the IP ToS values in packets sent to peer.
     */
    public void set_ip_tos_to_peer(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] values) throws java.rmi.RemoteException;

    /**
     * Sets the link QoS values in packets sent to peer.
     */
    public void set_link_qos_to_peer(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] values) throws java.rmi.RemoteException;

    /**
     * Sets the state that if true, SCPT will order the received messages
     * 
     *  before delivering them to upper layer.
     */
    public void set_order_receive_message_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the number of outbound streams used by the specified SCTP
     * profiles.
     */
    public void set_outbound_stream(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] streams) throws java.rmi.RemoteException;

    /**
     * Sets the proxy buffer level at which the receive window is
     * closed 
     *  (not advanced) for the specified SCTP profiles.
     */
    public void set_proxy_buffer_high(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] levels) throws java.rmi.RemoteException;

    /**
     * Sets the proxy buffer level at which the receive window is
     * opened 
     *  for the specified SCTP profiles.
     */
    public void set_proxy_buffer_low(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] levels) throws java.rmi.RemoteException;

    /**
     * Sets the number of RX chunk buffers used by the specified SCTP
     * profiles.
     */
    public void set_receive_chunk_buffer(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] buffers) throws java.rmi.RemoteException;

    /**
     * Sets the receive window sizes used by the specified SCTP profiles.
     */
    public void set_receive_window_size(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] sizes) throws java.rmi.RemoteException;

    /**
     * Sets the state that if true, SCTP will reset the connection
     * when a timeout occurs.
     */
    public void set_reset_on_timeout_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the internal secret strings used to HMAC cookies.
     */
    public void set_secret(java.lang.String[] profile_names, iControl.LocalLBProfileString[] secrets) throws java.rmi.RemoteException;

    /**
     * Sets the send buffer sizes (in bytes) used by the specified
     * SCTP profiles.
     */
    public void set_send_buffer_size(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] sizes) throws java.rmi.RemoteException;

    /**
     * Sets the maximum number of retries to send data for 
     *  the specified SCTP profiles.
     */
    public void set_send_maximum_retry(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] retries) throws java.rmi.RemoteException;

    /**
     * Sets the state that indicates whether SCTP will accept and
     * send partial 
     *  application data.
     */
    public void set_send_partial_data_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the number of TX chunk buffers used by the specified SCTP
     * profiles.
     */
    public void set_transmit_chunk_buffer(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] buffers) throws java.rmi.RemoteException;
}
