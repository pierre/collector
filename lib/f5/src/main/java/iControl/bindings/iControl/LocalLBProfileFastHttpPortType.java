/**
 * LocalLBProfileFastHttpPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBProfileFastHttpPortType extends java.rmi.Remote {

    /**
     * Creates the specified Fast HTTP profiles.
     */
    public void create(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Deletes all Fast HTTP profiles.
     */
    public void delete_all_profiles() throws java.rmi.RemoteException;

    /**
     * Deletes the specified Fast HTTP profiles.
     */
    public void delete_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for all the Fast HTTP profiles.
     */
    public iControl.LocalLBProfileFastHttpProfileFastHttpStatistics get_all_statistics() throws java.rmi.RemoteException;

    /**
     * Gets the idle timeout override when waiting for the client
     * to close.
     *  This occurs after a client FIN is received or after a FIN is sent.
     */
    public iControl.LocalLBProfileULong[] get_client_close_timeout(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the idle timeout override for unspliced serverside flows
     * in the reuse pool. 
     *  0 is disabled, i.e. use the default idle timeout.
     */
    public iControl.LocalLBProfileULong[] get_connection_pool_idle_timeout(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the maximum number of times a serverside flow will be
     * reused.
     *  0 for unlimited.
     */
    public iControl.LocalLBProfileULong[] get_connection_pool_maximum_reuse(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the maximum number of connections to any given LB pool.
     * 0 for unlimited.
     */
    public iControl.LocalLBProfileULong[] get_connection_pool_maximum_size(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the minimum number of connections to any given LB pool.
     * 0 is an acceptable value.
     */
    public iControl.LocalLBProfileULong[] get_connection_pool_minimum_size(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the connection ramp-up increments for the specified Fast
     * HTTP profiles.
     *  Must be greater than 0.
     */
    public iControl.LocalLBProfileULong[] get_connection_pool_ramp_increment(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the state that specifies whether the connpool should be
     * replenished to
     *  its prior number of connections when a connection is closed by the
     * server. 
     *  If this is disabled, then we will only replenish a closed server
     * side connection
     *  residing in the connpool if there are less than connpool_min_size
     * connections 
     *  in the pool.
     */
    public iControl.LocalLBProfileEnabledState[] get_connection_pool_replenish_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public java.lang.String[] get_default_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the state that if true, rewrite server's HTTP version
     * to 1.0 in status line in
     *  order to dissuade the client from pipelining or chunking.
     */
    public iControl.LocalLBProfileEnabledState[] get_force_http10_response_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the strings to be inserted as headers for the specified
     * HTTP profiles.
     */
    public iControl.LocalLBProfileString[] get_header_insert(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the state that if true, work around problems with certain
     * brands of benchmarking
     *  software that cannot handle FIN-PUSH on HTTP/1.1 responses.
     */
    public iControl.LocalLBProfileEnabledState[] get_http11_close_workarounds_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the idle timeout for the specified Fast HTTP profiles.
     * The number of seconds without traffic before a connection is
     *  eligible for deletion.
     */
    public iControl.LocalLBProfileULong[] get_idle_timeout(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the mode to indicate whether to insert X-Forwarded-For
     * headers for the specified profiles.
     */
    public iControl.LocalLBProfileProfileMode[] get_insert_xforwarded_for_header_mode(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the state that if false, we will not parse the HTTP requests.
     * This is useful
     *  for providing SYN-proxy protection for L4 connections through a SNAT
     * where the 
     *  client sends data to the server before the server responds.
     */
    public iControl.LocalLBProfileEnabledState[] get_layer7_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets a list of all Fast HTTP profiles.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the maximum amount of data that will be buffered in
     *  order to make a content-switching decision.
     */
    public iControl.LocalLBProfileULong[] get_maximum_header_size(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the maximum number of requests on a clientside flow before
     * the flow is shutdown.
     */
    public iControl.LocalLBProfileULong[] get_maximum_requests(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the MSS override values for the specified profiles.
     *  If non-zero and less than the default value, this value overrides
     * the
     *  maximum segment size for serverside flows.
     */
    public iControl.LocalLBProfileULong[] get_mss_override(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the reset on timeout states for the specified Fast HTTP
     * profiles.
     *  If true and a TCP connection exceeds its idle timeout, send a reset
     * in addition
     *  to deleting the connection.
     */
    public iControl.LocalLBProfileEnabledState[] get_reset_on_timeout_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the idle timeout override when waiting for the server
     * to close.
     *  This occurs if the server flow is not suitable for reuse or after
     * a 
     *  FIN is received on an unspliced server connection.
     */
    public iControl.LocalLBProfileULong[] get_server_close_timeout(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for the specified Fast HTTP profiles.
     */
    public iControl.LocalLBProfileFastHttpProfileFastHttpStatistics get_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the mode to indicate whether to do unclean shutdown for
     * client connections.
     */
    public iControl.LocalLBProfileUncleanShutdownMode[] get_unclean_shutdown_mode(java.lang.String[] profile_names) throws java.rmi.RemoteException;

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
     * Resets the statistics for the specified Fast HTTP profiles.
     */
    public void reset_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Sets the idle timeout override when waiting for the client
     * to close.
     *  This occurs after a client FIN is received or after a FIN is sent.
     */
    public void set_client_close_timeout(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] timeouts) throws java.rmi.RemoteException;

    /**
     * Sets the idle timeout override for unspliced serverside flows
     * in the reuse pool. 
     *  0 is disabled, i.e. use the default idle timeout.
     */
    public void set_connection_pool_idle_timeout(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] timeouts) throws java.rmi.RemoteException;

    /**
     * Sets the maximum number of times a serverside flow will be
     * reused.
     *  0 for unlimited.
     */
    public void set_connection_pool_maximum_reuse(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] reuses) throws java.rmi.RemoteException;

    /**
     * Sets the maximum number of connections to any given LB pool.
     * 0 for unlimited.
     */
    public void set_connection_pool_maximum_size(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] sizes) throws java.rmi.RemoteException;

    /**
     * Sets the minimum number of connections to any given LB pool.
     * 0 is an acceptable value.
     */
    public void set_connection_pool_minimum_size(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] sizes) throws java.rmi.RemoteException;

    /**
     * Sets the connection ramp-up increments for the specified Fast
     * HTTP profiles.
     *  Must be greater than 0.
     */
    public void set_connection_pool_ramp_increment(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] increments) throws java.rmi.RemoteException;

    /**
     * Sets the state that specifies whether the connpool should be
     * replenished to
     *  its prior number of connections when a connection is closed by the
     * server. 
     *  If this is disabled, then we will only replenish a closed server
     * side connection
     *  residing in the connpool if there are less than connpool_min_size
     * connections 
     *  in the pool.
     */
    public void set_connection_pool_replenish_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public void set_default_profile(java.lang.String[] profile_names, java.lang.String[] defaults) throws java.rmi.RemoteException;

    /**
     * Sets the state that if true, rewrite server's HTTP version
     * to 1.0 in status line in
     *  order to dissuade the client from pipelining or chunking.
     */
    public void set_force_http10_response_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Insert the given string as a header. If the header already
     * exists, it is 
     *  not replaced. Unlike HTTP, this string does not support rule command
     * expansion.
     */
    public void set_header_insert(java.lang.String[] profile_names, iControl.LocalLBProfileString[] headers) throws java.rmi.RemoteException;

    /**
     * Sets the state that if true, work around problems with certain
     * brands of benchmarking
     *  software that cannot handle FIN-PUSH on HTTP/1.1 responses.
     */
    public void set_http11_close_workarounds_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the idle timeout for the specified Fast HTTP profiles.
     * The number of seconds without traffic before a connection is
     *  eligible for deletion.
     */
    public void set_idle_timeout(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] timeouts) throws java.rmi.RemoteException;

    /**
     * Sets the mode to indicate whether to insert X-Forwarded-For
     * headers for the specified profiles.
     */
    public void set_insert_xforwarded_for_header_mode(java.lang.String[] profile_names, iControl.LocalLBProfileProfileMode[] modes) throws java.rmi.RemoteException;

    /**
     * Sets the state that if false, we will not parse the HTTP requests.
     * This is useful
     *  for providing SYN-proxy protection for L4 connections through a SNAT
     * where the 
     *  client sends data to the server before the server responds.
     */
    public void set_layer7_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the maximum amount of data that will be buffered in
     *  order to make a content-switching decision.
     */
    public void set_maximum_header_size(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] sizes) throws java.rmi.RemoteException;

    /**
     * Sets the maximum number of requests on a clientside flow before
     * the flow is shutdown.
     */
    public void set_maximum_requests(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] maximum_requests) throws java.rmi.RemoteException;

    /**
     * Sets the MSS override values for the specified profiles.
     *  If non-zero and less than the default value, this value overrides
     * the
     *  maximum segment size for serverside flows.
     */
    public void set_mss_override(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] mss_overrides) throws java.rmi.RemoteException;

    /**
     * Sets the reset on timeout states for the specified Fast HTTP
     * profiles.
     *  If true and a TCP connection exceeds its idle timeout, send a reset
     * in addition
     *  to deleting the connection.
     */
    public void set_reset_on_timeout_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the idle timeout override when waiting for the server
     * to close.
     *  This occurs if the server flow is not suitable for reuse or after
     * a 
     *  FIN is received on an unspliced server connection.
     */
    public void set_server_close_timeout(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] timeouts) throws java.rmi.RemoteException;

    /**
     * Sets the mode to indicate whether to do unclean shutdown for
     * client connections.
     */
    public void set_unclean_shutdown_mode(java.lang.String[] profile_names, iControl.LocalLBProfileUncleanShutdownMode[] modes) throws java.rmi.RemoteException;
}
