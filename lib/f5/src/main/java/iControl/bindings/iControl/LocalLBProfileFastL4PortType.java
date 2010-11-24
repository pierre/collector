/**
 * LocalLBProfileFastL4PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBProfileFastL4PortType extends java.rmi.Remote {

    /**
     * Creates the specified profiles.
     */
    public void create(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Deletes all profiles.
     */
    public void delete_all_profiles() throws java.rmi.RemoteException;

    /**
     * Deletes the specified profiles.
     */
    public void delete_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for all the profiles.
     */
    public iControl.LocalLBProfileFastL4ProfileFastL4Statistics get_all_statistics() throws java.rmi.RemoteException;

    /**
     * Gets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public java.lang.String[] get_default_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the preferred hardware acceleration modes for the specified
     * profiles.
     */
    public iControl.LocalLBProfileHardwareAccelerationMode[] get_hardware_acceleration_mode(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the state to enable/disable support for hardware SYN cookie.
     */
    public iControl.LocalLBProfileEnabledState[] get_hardware_syn_cookie_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the idle timeout for the specified profiles.
     *  The number of seconds without traffic before a connection is
     *  eligible for deletion.
     */
    public iControl.LocalLBProfileULong[] get_idle_timeout(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the IP fragment reassembly states for the specified profiles.
     * If true, reassemble the IP fragments.
     */
    public iControl.LocalLBProfileEnabledState[] get_ip_fragment_reassemble_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the IP type of service set in packets sent to the clients.
     */
    public iControl.LocalLBProfileULong[] get_ip_tos_to_client(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the IP type of service set in packets sent to the servers.
     */
    public iControl.LocalLBProfileULong[] get_ip_tos_to_server(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the keep-alive probe interval for a set of FastL4 profiles.
     */
    public iControl.LocalLBProfileULong[] get_keep_alive_interval(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the link quality of service set in packets sent to the
     * clients.
     */
    public iControl.LocalLBProfileULong[] get_link_qos_to_client(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the link quality of service set in packets sent to the
     * servers.
     */
    public iControl.LocalLBProfileULong[] get_link_qos_to_server(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets a list of all profiles.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the state to aggressively close out a connection by allowing
     * TMM to switch the idle_timeout to tcp_close_timeout once the first
     * 
     *  FIN packet has been seen.
     */
    public iControl.LocalLBProfileEnabledState[] get_loose_close_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the state to allow any TCP packet to initiate a connection
     * 
     *  (rather than requiring a SYN).
     */
    public iControl.LocalLBProfileEnabledState[] get_loose_initiation_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the MSS override values for the specified profiles.
     *  If non-zero and less than the default value, this value overrides
     * the
     *  maximum segment size.
     */
    public iControl.LocalLBProfileULong[] get_mss_override(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the reset on timeout states for the specified profiles.
     * If true and a TCP connection exceeds its idle timeout, send a reset
     * in addition
     *  to deleting the connection.
     */
    public iControl.LocalLBProfileEnabledState[] get_reset_on_timeout_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the state to use TCP timestamp options to measure the
     * round trip time to the client.
     */
    public iControl.LocalLBProfileEnabledState[] get_rtt_from_client_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the state to use TCP timestamp options to measure the
     * round trip time to the server.
     */
    public iControl.LocalLBProfileEnabledState[] get_rtt_from_server_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the state to enable/disable support for software SYN cookie.
     */
    public iControl.LocalLBProfileEnabledState[] get_software_syn_cookie_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for the specified profiles.
     */
    public iControl.LocalLBProfileFastL4ProfileFastL4Statistics get_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the TCP close timeout for the specified profiles.
     *  Only used when "loose_initiation" or "loose_close" is enabled.
     *  This is used to rapidly close out a loosely initiated connection
     * after 
     *  the first FIN packet has been seen (either client or server side).
     */
    public iControl.LocalLBProfileULong[] get_tcp_close_timeout(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the options to generate our own sequence numbers on all
     * SYNs.
     */
    public iControl.LocalLBProfileEnabledState[] get_tcp_generate_isn_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the TCP handshake timeout for the specified profiles.
     *  The number of seconds without traffic before a connection in the
     * 
     *  SYN received state is eligible for deletion.
     */
    public iControl.LocalLBProfileULong[] get_tcp_handshake_timeout(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the options to block TCP SackOK option from passing
     *  to server on an initiating SYN.
     */
    public iControl.LocalLBProfileEnabledState[] get_tcp_strip_sackok_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the TCP timestamp options for the specified profiles.
     */
    public iControl.LocalLBProfileTCPOptionMode[] get_tcp_timestamp_mode(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the TCP window scale options for the specified profiles.
     */
    public iControl.LocalLBProfileTCPOptionMode[] get_tcp_window_scale_mode(java.lang.String[] profile_names) throws java.rmi.RemoteException;

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
     * Sets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public void set_default_profile(java.lang.String[] profile_names, java.lang.String[] defaults) throws java.rmi.RemoteException;

    /**
     * Sets the preferred hardware acceleration modes for the specified
     * profiles.
     */
    public void set_hardware_acceleration_mode(java.lang.String[] profile_names, iControl.LocalLBProfileHardwareAccelerationMode[] acceleration_modes) throws java.rmi.RemoteException;

    /**
     * Sets the state to enable/disable support for hardware SYN cookie.
     */
    public void set_hardware_syn_cookie_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the idle timeout for the specified profiles.
     *  The number of seconds without traffic before a connection is
     *  eligible for deletion.
     */
    public void set_idle_timeout(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] timeouts) throws java.rmi.RemoteException;

    /**
     * Sets the IP fragment reassembly states for the specified profiles.
     * If true, reassemble the IP fragments.
     */
    public void set_ip_fragment_reassemble_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the IP type of service set in packets sent to the clients.
     */
    public void set_ip_tos_to_client(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] ip_tos_values) throws java.rmi.RemoteException;

    /**
     * Sets the IP type of service set in packets sent to the servers.
     */
    public void set_ip_tos_to_server(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] ip_tos_values) throws java.rmi.RemoteException;

    /**
     * Sets the keep-alive probe interval for a set of FastL4 profiles.
     * 
     *  This interval is the elapsed time between sending data over an idle
     * TCP connection to keep the connection open and to determine whether
     * the connection is still valid.  If zero, the keep-alive probe is
     *  disabled.
     */
    public void set_keep_alive_interval(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] intervals) throws java.rmi.RemoteException;

    /**
     * Sets the link quality of service set in packets sent to the
     * clients.
     */
    public void set_link_qos_to_client(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] link_qos_values) throws java.rmi.RemoteException;

    /**
     * Sets the link quality of service set in packets sent to the
     * servers.
     */
    public void set_link_qos_to_server(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] link_qos_values) throws java.rmi.RemoteException;

    /**
     * Sets the state to aggressively close out a connection by allowing
     * TMM to switch the idle_timeout to tcp_close_timeout once the first
     * 
     *  FIN packet has been seen.
     */
    public void set_loose_close_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the state to allow any TCP packet to initiate a connection
     * 
     *  (rather than requiring a SYN).
     */
    public void set_loose_initiation_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the MSS override values for the specified profiles.
     *  If non-zero and less than the default value, this value overrides
     * the
     *  maximum segment size.
     */
    public void set_mss_override(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] mss_overrides) throws java.rmi.RemoteException;

    /**
     * Sets the reset on timeout states for the specified profiles.
     * If true and a TCP connection exceeds its idle timeout, send a reset
     * in addition
     *  to deleting the connection.
     */
    public void set_reset_on_timeout_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the state to use TCP timestamp options to measure the
     * round trip time to the client.
     */
    public void set_rtt_from_client_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the state to use TCP timestamp options to measure the
     * round trip time to the server.
     */
    public void set_rtt_from_server_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the state to enable/disable support for software SYN cookie.
     */
    public void set_software_syn_cookie_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the TCP close timeout for the specified profiles.
     *  Only used when "loose_initiation" or "loose_close" is enabled.
     *  This is used to rapidly close out a loosely initiated connection
     * after 
     *  the first FIN packet has been seen (either client or server side).
     */
    public void set_tcp_close_timeout(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] timeouts) throws java.rmi.RemoteException;

    /**
     * Sets the options to generate our own sequence numbers on all
     * SYNs.
     */
    public void set_tcp_generate_isn_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the TCP handshake timeout for the specified profiles.
     *  The number of seconds without traffic before a connection in the
     * 
     *  SYN received state is eligible for deletion.
     */
    public void set_tcp_handshake_timeout(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] timeouts) throws java.rmi.RemoteException;

    /**
     * Sets the options to block TCP SackOK option from passing
     *  to server on an initiating SYN.
     */
    public void set_tcp_strip_sackok_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the TCP timestamp options for the specified profiles.
     */
    public void set_tcp_timestamp_mode(java.lang.String[] profile_names, iControl.LocalLBProfileTCPOptionMode[] modes) throws java.rmi.RemoteException;

    /**
     * Sets the TCP window scale options for the specified profiles.
     */
    public void set_tcp_window_scale_mode(java.lang.String[] profile_names, iControl.LocalLBProfileTCPOptionMode[] modes) throws java.rmi.RemoteException;
}
