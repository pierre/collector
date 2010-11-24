/**
 * LocalLBProfileRTSPPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBProfileRTSPPortType extends java.rmi.Remote {

    /**
     * Creates the specified RTSP profiles.
     */
    public void create(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Deletes all RTSP profiles.
     */
    public void delete_all_profiles() throws java.rmi.RemoteException;

    /**
     * Deletes the specified RTSP profiles.
     */
    public void delete_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for all the RTSP profiles.
     */
    public iControl.LocalLBProfileRTSPProfileRTSPStatistics get_all_statistics() throws java.rmi.RemoteException;

    /**
     * Gets the states to indicate how the RTSP filter handles the
     * source attribute in the transport header.  If true, the
     *  system will use the source attribute in the transport
     *  header to establish the target address of the RTP stream,
     *  and will update the value of the source attribute to be the
     *  virtual address (VIP) before the response is forwarded to
     *  the client. If false, the system leaves the source
     *  attribute alone.
     */
    public iControl.LocalLBProfileEnabledState[] get_check_source_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public java.lang.String[] get_default_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the idle timeouts (seconds) for the specified RTSP profiles.
     * This is the number of seconds that the UDP data connections are allowed
     * 
     *  to idle before they are closed.
     */
    public iControl.LocalLBProfileULong[] get_idle_timeout(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets a list of all RTSP profiles.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the maximum header sizes for the specified RTSP profiles.
     * This is the largest RTSP request or response header that the RTSP
     * filter 
     *  (control channel) will allow before aborting the connection.
     */
    public iControl.LocalLBProfileULong[] get_maximum_header_size(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the maximum queued data sizes for the specified RTSP profiles.
     * This is the maximum amount of data that the RTSP filter (control channel)
     * will buffer before 
     *  assuming the connection is dead and subsequently aborting the connection.
     */
    public iControl.LocalLBProfileULong[] get_maximum_queued_data_size(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the states to indicate whether to allow redirection of
     * multicasts for the specified RTSP profiles.
     *  If enabled, the client is allowed to select the destination where
     * data will be streamed.
     */
    public iControl.LocalLBProfileEnabledState[] get_multicast_redirect_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the names of the headers that are passed from the client
     * side VIP to the server side VIP 
     *  in an RTSP proxy configuration. The name of the header should begin
     * with "X-".
     */
    public iControl.LocalLBProfileString[] get_proxy_header(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the proxy types that the specified RTSP filters are associated
     * with.
     */
    public iControl.LocalLBProfileRtspProxyType[] get_proxy_type(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the RTCP port for the specified RTSP profiles.
     */
    public iControl.LocalLBProfilePortNumber[] get_rtcp_port(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the RTP port for the specified RTSP profiles.
     */
    public iControl.LocalLBProfilePortNumber[] get_rtp_port(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the states to indicate whether the RTSP filter will automatically
     * handle persisting 
     *  Real Networks tunneled RTSP over HTTP, over the RTSP port. The default
     * value is enabled. 
     *  Disabling this value allows the user to override the default behavior
     * with a rule.
     */
    public iControl.LocalLBProfileEnabledState[] get_rtsp_over_http_persistence_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * The RTSP specification allows a control connection to be resumed
     * after it has become disconnected.
     *  Gets the states to indicate whether the RTSP filter will persist
     * the control connection that is 
     *  being resumed to the correct server.
     */
    public iControl.LocalLBProfileEnabledState[] get_session_reconnect_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for the specified RTSP profiles.
     */
    public iControl.LocalLBProfileRTSPProfileRTSPStatistics get_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the states to indicate whether to allow redirection of
     * unicasts for the specified RTSP profiles.
     *  If enabled, the client is allowed to select the destination where
     * data will be streamed.
     */
    public iControl.LocalLBProfileEnabledState[] get_unicast_redirect_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

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
     * Resets the statistics for the specified RTSP profiles.
     */
    public void reset_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Sets the states to indicate how the RTSP filter handles the
     * source attribute in the transport header.  If true, the
     *  system will use the source attribute in the transport
     *  header to establish the target address of the RTP stream,
     *  and will update the value of the source attribute to be the
     *  virtual address (VIP) before the response is forwarded to
     *  the client. If false, the system leaves the source
     *  attribute alone.
     */
    public void set_check_source_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public void set_default_profile(java.lang.String[] profile_names, java.lang.String[] defaults) throws java.rmi.RemoteException;

    /**
     * Sets the idle timeouts (seconds) for the specified RTSP profiles.
     * This is the number of seconds that the UDP data connections are allowed
     * 
     *  to idle before they are closed.
     */
    public void set_idle_timeout(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] timeouts) throws java.rmi.RemoteException;

    /**
     * Sets the maximum header sizes for the specified RTSP profiles.
     * This is the largest RTSP request or response header that the RTSP
     * filter 
     *  (control channel) will allow before aborting the connection.
     */
    public void set_maximum_header_size(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] sizes) throws java.rmi.RemoteException;

    /**
     * Sets the maximum queued data sizes for the specified RTSP profiles.
     * This is the maximum amount of data that the RTSP filter (control channel)
     * will buffer before 
     *  assuming the connection is dead and subsequently aborting the connection.
     */
    public void set_maximum_queued_data_size(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] sizes) throws java.rmi.RemoteException;

    /**
     * Sets the states to indicate whether to allow redirection of
     * multicasts for the specified RTSP profiles.
     *  If enabled, the client is allowed to select the destination where
     * data will be streamed.
     */
    public void set_multicast_redirect_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the names of the headers that are passed from the client
     * side VIP to the server side VIP 
     *  in an RTSP proxy configuration. The name of the header should begin
     * with "X-".
     */
    public void set_proxy_header(java.lang.String[] profile_names, iControl.LocalLBProfileString[] headers) throws java.rmi.RemoteException;

    /**
     * Sets the proxy types that the specified RTSP filters are associated
     * with.
     */
    public void set_proxy_type(java.lang.String[] profile_names, iControl.LocalLBProfileRtspProxyType[] types) throws java.rmi.RemoteException;

    /**
     * Sets the RTCP port for the specified RTSP profiles.
     */
    public void set_rtcp_port(java.lang.String[] profile_names, iControl.LocalLBProfilePortNumber[] ports) throws java.rmi.RemoteException;

    /**
     * Sets the RTP port for the specified RTSP profiles.
     */
    public void set_rtp_port(java.lang.String[] profile_names, iControl.LocalLBProfilePortNumber[] ports) throws java.rmi.RemoteException;

    /**
     * Sets the states to indicate whether the RTSP filter will automatically
     * handle persisting 
     *  Real Networks tunneled RTSP over HTTP, over the RTSP port. The default
     * value is enabled. 
     *  Disabling this value allows the user to override the default behavior
     * with a rule.
     */
    public void set_rtsp_over_http_persistence_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * The RTSP specification allows a control connection to be resumed
     * after it has become disconnected.
     *  This sets the states to indicate whether the RTSP filter will persist
     * the control connection that is 
     *  being resumed to the correct server.
     */
    public void set_session_reconnect_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the states to indicate whether to allow redirection of
     * unicasts for the specified RTSP profiles.
     *  If enabled, the client is allowed to select the destination where
     * data will be streamed.
     */
    public void set_unicast_redirect_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;
}
