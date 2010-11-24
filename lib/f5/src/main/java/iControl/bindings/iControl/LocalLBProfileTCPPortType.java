/**
 * LocalLBProfileTCPPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBProfileTCPPortType extends java.rmi.Remote {

    /**
     * Creates the specified TCP profiles.
     */
    public void create(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Deletes all TCP profiles.
     */
    public void delete_all_profiles() throws java.rmi.RemoteException;

    /**
     * Deletes the specified TCP profiles.
     */
    public void delete_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the states that if true, data-bearing in-order TCP segments
     * will
     *  elicit immediate ACKs from us if they have the PUSH flag set, regardless
     * 
     *  of the setting of the delayed-ack profile option.
     */
    public iControl.LocalLBProfileEnabledState[] get_ack_on_push_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for all the profiles.
     */
    public iControl.LocalLBProfileTCPProfileTCPStatistics get_all_statistics() throws java.rmi.RemoteException;

    /**
     * Gets the states that if true, count the number of bytes acked
     * rather than
     *  the number of returning ACKs from the peer when in the linear congestion-window
     * 
     *  expansion phase of a TCP connection. This algorithm and its benefits
     * are
     *  described in RFC3465 (Appropriate Byte Counting).
     */
    public iControl.LocalLBProfileEnabledState[] get_appropriate_byte_counting_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the states that if true, attempt to calculate the optimal
     * bandwidth
     *  to use to the peer based on throughput and round-trip time, and don't
     * exceed it.
     */
    public iControl.LocalLBProfileEnabledState[] get_bandwidth_delay_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the time (in seconds) to remain in LAST-ACK state before
     * giving up.  Zero is forever (or until max retransmission of FIN).
     */
    public iControl.LocalLBProfileULong[] get_close_wait_timeout(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the states that if true, use the route-metrics cache
     *  in order to jump-start congestion-control parameters.  When this
     *  parameter is disabled, the system slow-starts to the peer every time
     * (assuming, of course, that slow-start is enabled), resulting in a
     * much
     *  more conservative ramp-up in bandwidth utilization. This may be
     *  required in cases where an intermediate device is NATing multiple
     * distinct clients to the same IP address, yet each of these hosts has
     * distinctly different bandwidth and jitter parameters. It may also
     * be
     *  required when the link is heavily oversubscribed and dropping packets
     * due to overdriving.
     */
    public iControl.LocalLBProfileEnabledState[] get_cmetrics_cache_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the TCP congestion control modes for the specified TCP
     * profiles.
     */
    public iControl.LocalLBProfileTCPCongestionControlMode[] get_congestion_control_mode(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public java.lang.String[] get_default_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the states that if true, defer allocation of connection
     * chain context until
     *  payload from the client has been seen.
     */
    public iControl.LocalLBProfileEnabledState[] get_deferred_accept_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the states that if true, enabled delayed ACK to allow
     * coalescing of
     *  multiple ACK responses.
     */
    public iControl.LocalLBProfileEnabledState[] get_delayed_ack_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the states that if true, enable support for RFC2883 Duplicate
     * Selective Acknowledgement.
     */
    public iControl.LocalLBProfileEnabledState[] get_duplicate_selective_ack_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the states that if true, enable support for RFC3168 Extended
     * Congestion Notification (ECN).
     */
    public iControl.LocalLBProfileEnabledState[] get_ecn_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the time (in seconds) to remain in FIN-WAIT or CLOSING
     * state before
     *  giving up.  Zero is forever (or until max retransmission of FIN).
     */
    public iControl.LocalLBProfileULong[] get_fin_wait_timeout(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the states that if true, enable support for RFC1323 timestamps
     * and
     *  window scaling (high performance TCP extensions).
     */
    public iControl.LocalLBProfileEnabledState[] get_high_performance_tcp_extension_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the idle timeout for the specified TCP profiles.
     *  The number of seconds without traffic before a connection is
     *  eligible for deletion.
     */
    public iControl.LocalLBProfileULong[] get_idle_timeout(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the client-side IP TOS values for the specified TCP profiles.
     */
    public iControl.LocalLBProfileULong[] get_ip_tos_to_client(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the keep-alive intervals (in seconds) for the specified
     * profiles.
     */
    public iControl.LocalLBProfileULong[] get_keep_alive_interval(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the states that if true, enable support for RFC3042 Limited
     * Transmit Recovery.
     */
    public iControl.LocalLBProfileEnabledState[] get_limited_transmit_recovery_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the client-side link QoS values for the specified TCP
     * profiles.
     */
    public iControl.LocalLBProfileULong[] get_link_qos_to_client(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets a list of all TCP profiles.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the maximum number of retransmission of data segments
     * for the specified profiles.
     */
    public iControl.LocalLBProfileULong[] get_maximum_data_retransmission(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the maximum number of retransmission of SYN segments for
     * the specified profiles.
     */
    public iControl.LocalLBProfileULong[] get_maximum_syn_retransmission(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the plaintext passphrase which may be between 1 and 80
     * characters in length, 
     *  and is used in a shared-secret scheme to implement the spoof-prevention
     * parts of RFC2385.
     */
    public iControl.LocalLBProfileString[] get_md5_signature_passphrase(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the states that if true, use RFC2385 TCP-MD5 signatures
     * to protect
     *  tcp traffic against intermediate tampering.
     */
    public iControl.LocalLBProfileEnabledState[] get_md5_signature_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets values indicating the likelihood of performing
     *  congestion control when multiple packets in a row are lost
     *  even if the loss threshold has not been exceeded. Valid
     *  values from 0 to 32. Higher values decrease the likelihood
     *  of performing congestion control.
     */
    public iControl.LocalLBProfileULong[] get_packet_loss_ignore_burst(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the threshold of packets lost per million at which the
     * system should perform congestion control. Measured in
     *  packets per million. Valid values are from 0 to 1000000.
     */
    public iControl.LocalLBProfileULong[] get_packet_loss_ignore_rate(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the proxy buffer level at which the receive window is
     * closed, i.e. not advanced.
     */
    public iControl.LocalLBProfileULong[] get_proxy_buffer_high(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the proxy buffer level at which the receive window is
     * opened.
     */
    public iControl.LocalLBProfileULong[] get_proxy_buffer_low(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the states that if true, enable proxying of maximum segment
     * size.
     */
    public iControl.LocalLBProfileEnabledState[] get_proxy_mss_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the states that if true, enable proxying of an option
     * (e.g. time-stamps)
     *  to the server only if it was negotiated with the client.
     */
    public iControl.LocalLBProfileEnabledState[] get_proxy_option_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the receive window sizes (in bytes) for the specified
     * profiles.
     */
    public iControl.LocalLBProfileULong[] get_receive_window_size(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the reset on timeout states for the specified TCP profiles.
     * If true and a TCP connection exceeds its idle timeout, send a reset
     * in addition
     *  to deleting the connection.
     */
    public iControl.LocalLBProfileEnabledState[] get_reset_on_timeout_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the states that if true, enable support for RFC2018 Selective
     * Acknowledgement.
     */
    public iControl.LocalLBProfileEnabledState[] get_selective_ack_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the send buffer sizes (in bytes) for the specified profiles.
     */
    public iControl.LocalLBProfileULong[] get_send_buffer_size(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the states that if true, enable support for RFC3390 TCP
     * slow-start. 
     *  BIG-IP uses RFC3390 TCP slow-start rather than traditional congestion
     * avoidance mechanisms.
     */
    public iControl.LocalLBProfileEnabledState[] get_slow_start_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for the specified profiles.
     */
    public iControl.LocalLBProfileTCPProfileTCPStatistics get_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the states that if true, recycle the connection when SYN
     * is received
     *  in TIME-WAIT state.
     */
    public iControl.LocalLBProfileEnabledState[] get_time_wait_recycle_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the time (in milliseconds) in TIME-WAIT state before entering
     * CLOSED state.
     */
    public iControl.LocalLBProfileULong[] get_time_wait_timeout(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the states that if true, delay sending data that is less
     * than MSS in size unless 
     *  all prior data has been ACKed. This leads to less in-flight small-data,
     * and less chance 
     *  for drops, but can have poor effects for interactive protocols such
     * as telnet 
     *  over high latency links.
     */
    public iControl.LocalLBProfileEnabledState[] get_use_nagle_algorithm_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the states that if true, the system must not respond
     *  to the client's SYN with a SYN-ACK until it receives a
     *  SYN-ACK from the server, indicating that the port is open.
     */
    public iControl.LocalLBProfileEnabledState[] get_verified_accept_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

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
     * Resets the statistics for the specified profiles.
     */
    public void reset_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Sets the states that if true, data-bearing in-order TCP segments
     * will
     *  elicit immediate ACKs from us if they have the PUSH flag set, regardless
     * 
     *  of the setting of the delayed-ack profile option.
     */
    public void set_ack_on_push_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the states that if true, count the number of bytes acked
     * rather than
     *  the number of returning ACKs from the peer when in the linear congestion-window
     * 
     *  expansion phase of a TCP connection. This algorithm and its benefits
     * are
     *  described in RFC3465 (Appropriate Byte Counting).
     */
    public void set_appropriate_byte_counting_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the states that if true, attempt to calculate the optimal
     * bandwidth
     *  to use to the peer based on throughput and round-trip time, and don't
     * exceed it.
     */
    public void set_bandwidth_delay_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the time (in seconds) to remain in LAST-ACK state before
     * giving up.  Zero is forever (or until max retransmission of FIN).
     */
    public void set_close_wait_timeout(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] timeouts) throws java.rmi.RemoteException;

    /**
     * Sets the states that if true, use the route-metrics cache
     *  in order to jump-start congestion-control parameters.  When this
     *  parameter is disabled, the system slow-starts to the peer every time
     * (assuming, of course, that slow-start is enabled), resulting in a
     * much
     *  more conservative ramp-up in bandwidth utilization. This may be
     *  required in cases where an intermediate device is NATing multiple
     * distinct clients to the same IP address, yet each of these hosts has
     * distinctly different bandwidth and jitter parameters. It may also
     * be
     *  required when the link is heavily oversubscribed and dropping packets
     * due to overdriving.
     */
    public void set_cmetrics_cache_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the TCP congestion control modes for the specified TCP
     * profiles.
     */
    public void set_congestion_control_mode(java.lang.String[] profile_names, iControl.LocalLBProfileTCPCongestionControlMode[] values) throws java.rmi.RemoteException;

    /**
     * Sets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public void set_default_profile(java.lang.String[] profile_names, java.lang.String[] defaults) throws java.rmi.RemoteException;

    /**
     * Sets the states that if true, defer allocation of connection
     * chain context until
     *  payload from the client has been seen.
     */
    public void set_deferred_accept_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the states that if true, enabled delayed ACK to allow
     * coalescing of
     *  multiple ACK responses.
     */
    public void set_delayed_ack_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the states that if true, enable support for RFC2883 Duplicate
     * Selective Acknowledgement.
     */
    public void set_duplicate_selective_ack_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the states that if true, enable support for RFC3168 Extended
     * Congestion Notification (ECN).
     */
    public void set_ecn_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the time (in seconds) to remain in FIN-WAIT or CLOSING
     * state before
     *  giving up.  Zero is forever (or until max retransmission of FIN).
     */
    public void set_fin_wait_timeout(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] timeouts) throws java.rmi.RemoteException;

    /**
     * Sets the states that if true, enable support for RFC1323 timestamps
     * and
     *  window scaling (high performance TCP extensions).
     */
    public void set_high_performance_tcp_extension_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the idle timeout for the specified TCP profiles.
     *  The number of seconds without traffic before a connection is
     *  eligible for deletion.
     */
    public void set_idle_timeout(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] timeouts) throws java.rmi.RemoteException;

    /**
     * Sets the client-side IP TOS values for the specified TCP profiles.
     */
    public void set_ip_tos_to_client(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] values) throws java.rmi.RemoteException;

    /**
     * Sets the keep-alive intervals (in seconds) for the specified
     * profiles.
     */
    public void set_keep_alive_interval(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] intervals) throws java.rmi.RemoteException;

    /**
     * Sets the states that if true, enable support for RFC3042 Limited
     * Transmit Recovery.
     */
    public void set_limited_transmit_recovery_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the client-side link QoS values for the specified TCP
     * profiles.
     */
    public void set_link_qos_to_client(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] values) throws java.rmi.RemoteException;

    /**
     * Sets the maximum number of retransmission of data segments
     * for the specified profiles.
     */
    public void set_maximum_data_retransmission(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] retries) throws java.rmi.RemoteException;

    /**
     * Sets the maximum number of retransmission of SYN segments for
     * the specified profiles.
     */
    public void set_maximum_syn_retransmission(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] retries) throws java.rmi.RemoteException;

    /**
     * Sets the plaintext passphrase which may be between 1 and 80
     * characters in length, 
     *  and is used in a shared-secret scheme to implement the spoof-prevention
     * parts of RFC2385.
     */
    public void set_md5_signature_passphrase(java.lang.String[] profile_names, iControl.LocalLBProfileString[] passphrases) throws java.rmi.RemoteException;

    /**
     * Sets the states that if true, use RFC2385 TCP-MD5 signatures
     * to protect
     *  tcp traffic against intermediate tampering.
     */
    public void set_md5_signature_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets values indicating the likelihood of performing
     *  congestion control when multiple packets in a row are lost
     *  even if the loss threshold has not been exceeded. Valid
     *  values from 0 to 32. Higher values decrease the likelihood
     *  of performing congestion control.
     */
    public void set_packet_loss_ignore_burst(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] values) throws java.rmi.RemoteException;

    /**
     * Sets the threshold of packets lost per million at which the
     * system should perform congestion control. Measured in
     *  packets per million. Valid values are from 0 to 1000000.
     */
    public void set_packet_loss_ignore_rate(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] thresholds) throws java.rmi.RemoteException;

    /**
     * Sets the proxy buffer level at which the receive window is
     * closed, i.e. not advanced.
     */
    public void set_proxy_buffer_high(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] levels) throws java.rmi.RemoteException;

    /**
     * Sets the proxy buffer level at which the receive window is
     * opened.
     */
    public void set_proxy_buffer_low(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] levels) throws java.rmi.RemoteException;

    /**
     * Sets the states that if true, enable proxying of maximum segment
     * size.
     */
    public void set_proxy_mss_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the states that if true, enable proxying of an option
     * (e.g. time-stamps)
     *  to the server only if it was negotiated with the client.
     */
    public void set_proxy_option_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the receive window sizes (in bytes) for the specified
     * profiles.
     */
    public void set_receive_window_size(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] sizes) throws java.rmi.RemoteException;

    /**
     * Sets the reset on timeout states for the specified TCP profiles.
     * If true and a TCP connection exceeds its idle timeout, send a reset
     * in addition
     *  to deleting the connection.
     */
    public void set_reset_on_timeout_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the states that if true, enable support for RFC2018 Selective
     * Acknowledgement.
     */
    public void set_selective_ack_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the send buffer sizes (in bytes) for the specified profiles.
     */
    public void set_send_buffer_size(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] sizes) throws java.rmi.RemoteException;

    /**
     * Sets the states that if true, enable support for RFC3390 TCP
     * slow-start. 
     *  BIG-IP uses RFC3390 TCP slow-start rather than traditional congestion
     * avoidance mechanisms.
     */
    public void set_slow_start_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the states that if true, recycle the connection when SYN
     * is received
     *  in TIME-WAIT state.
     */
    public void set_time_wait_recycle_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the time (in milliseconds) in TIME-WAIT state before entering
     * CLOSED state.
     */
    public void set_time_wait_timeout(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] timeouts) throws java.rmi.RemoteException;

    /**
     * Sets the states that if true, delay sending data that is less
     * than MSS in size unless 
     *  all prior data has been ACKed. This leads to less in-flight small-data,
     * and less chance 
     *  for drops, but can have poor effects for interactive protocols such
     * as telnet 
     *  over high latency links.
     */
    public void set_use_nagle_algorithm_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the states that if true, the system must not respond
     *  to the client's SYN with a SYN-ACK until it receives a
     *  SYN-ACK from the server, indicating that the port is open.
     */
    public void set_verified_accept_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;
}
