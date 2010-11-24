/**
 * LocalLBProfileClientSSLPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBProfileClientSSLPortType extends java.rmi.Remote {

    /**
     * Creates the specified client SSL profiles.
     */
    public void create(java.lang.String[] profile_names, iControl.LocalLBProfileString[] keys, iControl.LocalLBProfileString[] certs) throws java.rmi.RemoteException;

    /**
     * Deletes all client SSL profiles.
     */
    public void delete_all_profiles() throws java.rmi.RemoteException;

    /**
     * Deletes the specified client SSL profiles.
     */
    public void delete_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the connection timeouts (in seconds) after sending an
     * alert for the specified client SSL profiles.
     */
    public iControl.LocalLBProfileULong[] get_alert_timeout(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for all the client SSL profiles.
     */
    public iControl.LocalLBProfileClientSSLProfileClientSSLStatistics get_all_statistics() throws java.rmi.RemoteException;

    /**
     * Gets the states to indicate whether to allow non-SSL connections
     * to pass through as cleartext.
     */
    public iControl.LocalLBProfileEnabledState[] get_allow_nonssl_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the client certificate chain maximum traversal depth for
     * the specified client SSL profiles.
     */
    public iControl.LocalLBProfileULong[] get_authenticate_depth(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the states to request the client certificate once for
     * the specified client SSL profiles.
     */
    public iControl.LocalLBProfileEnabledState[] get_authenticate_once_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the CA filenames for the specified client SSL profiles.
     */
    public iControl.LocalLBProfileString[] get_ca_file(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the SSL session cache sizes for the specified client SSL
     * profiles.
     */
    public iControl.LocalLBProfileULong[] get_cache_size(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the SSL session cache timeouts for the specified client
     * SSL profiles.
     */
    public iControl.LocalLBProfileULong[] get_cache_timeout(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the certificate filenames to be used by BIG-IP acting
     * as an SSL server.
     */
    public iControl.LocalLBProfileString[] get_certificate_file(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the certificate chain filenames for the specified client
     * SSL profiles.
     */
    public iControl.LocalLBProfileString[] get_chain_file(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the cipher lists for the specified client SSL profiles.
     */
    public iControl.LocalLBProfileStringArray[] get_cipher_list(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the client certificate CA filenames for the specified
     * client SSL profiles.
     */
    public iControl.LocalLBProfileString[] get_client_certificate_ca_file(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the CRL filenames for the specified client SSL profiles.
     */
    public iControl.LocalLBProfileString[] get_crl_file(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public java.lang.String[] get_default_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the connection timeouts (in seconds) during handshake
     * phase for the specified client SSL profiles.
     */
    public iControl.LocalLBProfileULong[] get_handshake_timeout(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the key filenames to be used by BIG-IP acting as an SSL
     * server.
     */
    public iControl.LocalLBProfileString[] get_key_file(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets a list of all client SSL profiles.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the states to emulate modSSL for the specified client
     * SSL profiles.
     */
    public iControl.LocalLBProfileEnabledState[] get_modssl_emulation_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the key passphrases (if any) for the specified client
     * SSL profiles.
     */
    public iControl.LocalLBProfileString[] get_passphrase(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the peer certification modes for the specified client
     * SSL profiles.
     */
    public iControl.LocalLBProfileClientSSLCertificateMode[] get_peer_certification_mode(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the modes for the specified client SSL profiles.
     */
    public iControl.LocalLBProfileProfileMode[] get_profile_mode(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the SSL renegotiation maximum record delay for the specified
     * client SSL profiles.
     */
    public iControl.LocalLBProfileULong[] get_renegotiation_maximum_record_delay(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the SSL renegotiation periods for the specified client
     * SSL profiles.
     */
    public iControl.LocalLBProfileULong[] get_renegotiation_period(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the states controlling whether mid-stream renegotiation
     * is allowed for the specified client SSL profiles.
     */
    public iControl.LocalLBProfileEnabledState[] get_renegotiation_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the SSL renegotiation throughputs for the specified client
     * SSL profiles.
     */
    public iControl.LocalLBProfileULong[] get_renegotiation_throughput(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the SSL options for the specified client SSL profiles.
     */
    public iControl.LocalLBProfileSSLOption[] get_ssl_option(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for the specified client SSL profiles.
     */
    public iControl.LocalLBProfileClientSSLProfileClientSSLStatistics get_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the states to enforce strict SSL session resumption per
     * RFC2246 for the specified client SSL profiles.
     */
    public iControl.LocalLBProfileEnabledState[] get_strict_resume_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the states to do an unclean shutdown for the specified
     * client SSL profiles.
     */
    public iControl.LocalLBProfileEnabledState[] get_unclean_shutdown_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

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
     * Resets the statistics for the specified client SSL profiles.
     */
    public void reset_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Sets the connection timeouts (in seconds) after sending an
     * alert for the specified client SSL profiles.
     */
    public void set_alert_timeout(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] timeouts) throws java.rmi.RemoteException;

    /**
     * Sets the states to indicate whether to allow non-SSL connections
     * to pass through as cleartext.
     */
    public void set_allow_nonssl_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the client certificate chain maximum traversal depth for
     * the specified client SSL profiles.
     */
    public void set_authenticate_depth(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] depths) throws java.rmi.RemoteException;

    /**
     * Sets the states to request the client certificate once for
     * the specified client SSL profiles.
     *  If the state is false/disabled, client certificate is requested for
     * each SSL session renegotiation.
     */
    public void set_authenticate_once_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the CA filenames for the specified client SSL profiles.
     */
    public void set_ca_file(java.lang.String[] profile_names, iControl.LocalLBProfileString[] cas) throws java.rmi.RemoteException;

    /**
     * Sets the SSL session cache sizes for the specified client SSL
     * profiles.
     */
    public void set_cache_size(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] cache_sizes) throws java.rmi.RemoteException;

    /**
     * Sets the SSL session cache timeouts for the specified client
     * SSL profiles.
     */
    public void set_cache_timeout(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] timeouts) throws java.rmi.RemoteException;

    /**
     * Sets the certificate filenames to be used by BIG-IP acting
     * as an SSL server.
     */
    public void set_certificate_file(java.lang.String[] profile_names, iControl.LocalLBProfileString[] certs) throws java.rmi.RemoteException;

    /**
     * Sets the certificate chain filenames for the specified client
     * SSL profiles.
     */
    public void set_chain_file(java.lang.String[] profile_names, iControl.LocalLBProfileString[] chains) throws java.rmi.RemoteException;

    /**
     * Sets the cipher lists for the specified client SSL profiles.
     */
    public void set_cipher_list(java.lang.String[] profile_names, iControl.LocalLBProfileStringArray[] ciphers) throws java.rmi.RemoteException;

    /**
     * Sets the client certificate CA filenames for the specified
     * client SSL profiles.
     */
    public void set_client_certificate_ca_file(java.lang.String[] profile_names, iControl.LocalLBProfileString[] client_cert_cas) throws java.rmi.RemoteException;

    /**
     * Sets the CRL filenames for the specified client SSL profiles.
     */
    public void set_crl_file(java.lang.String[] profile_names, iControl.LocalLBProfileString[] crls) throws java.rmi.RemoteException;

    /**
     * Sets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public void set_default_profile(java.lang.String[] profile_names, java.lang.String[] defaults) throws java.rmi.RemoteException;

    /**
     * Sets the connection timeouts (in seconds) during handshake
     * phase for the specified client SSL profiles.
     */
    public void set_handshake_timeout(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] timeouts) throws java.rmi.RemoteException;

    /**
     * Sets the key filenames to be used by BIG-IP acting as an SSL
     * server.
     */
    public void set_key_file(java.lang.String[] profile_names, iControl.LocalLBProfileString[] keys) throws java.rmi.RemoteException;

    /**
     * Sets the states to emulate modSSL for the specified client
     * SSL profiles.
     */
    public void set_modssl_emulation_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the key passphrases (if any) for the specified client
     * SSL profiles.
     */
    public void set_passphrase(java.lang.String[] profile_names, iControl.LocalLBProfileString[] passphrases) throws java.rmi.RemoteException;

    /**
     * Sets the peer certification modes for the specified client
     * SSL profiles.
     */
    public void set_peer_certificate_mode(java.lang.String[] profile_names, iControl.LocalLBProfileClientSSLCertificateMode[] modes) throws java.rmi.RemoteException;

    /**
     * Sets the modes for the specified client SSL profiles.
     */
    public void set_profile_mode(java.lang.String[] profile_names, iControl.LocalLBProfileProfileMode[] modes) throws java.rmi.RemoteException;

    /**
     * Sets the SSL renegotiation maximum record delay for the specified
     * client SSL profiles.
     */
    public void set_renegotiation_maximum_record_delay(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] delays) throws java.rmi.RemoteException;

    /**
     * Sets the SSL renegotiation periods for the specified client
     * SSL profiles.
     */
    public void set_renegotiation_period(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] periods) throws java.rmi.RemoteException;

    /**
     * Sets the states controlling whether mid-stream renegotiation
     * is allowed for the specified client SSL profiles.
     * 
     *  If renegotiations are enabled, the behavior is unchanged
     *  from previous releases, and mid-stream SSL renegotiations
     *  are allowed.  If renegotiations are disabled, and we are
     *  acting as an SSL server, we will abort the connection.
     * 
     *  For ClientSSL, renegotiations are disabled by default.
     */
    public void set_renegotiation_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the SSL renegotiation throughputs for the specified client
     * SSL profiles.
     */
    public void set_renegotiation_throughput(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] throughputs) throws java.rmi.RemoteException;

    /**
     * Sets the SSL options for the specified client SSL profiles.
     */
    public void set_ssl_option(java.lang.String[] profile_names, iControl.LocalLBProfileSSLOption[] options) throws java.rmi.RemoteException;

    /**
     * Sets the states to enforce strict SSL session resumption per
     * RFC2246 for the specified client SSL profiles.
     *  If the state is true/enabled, don't send a close notify alert when
     * closing connection.
     */
    public void set_strict_resume_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the states to do an unclean shutdown for the specified
     * client SSL profiles.
     *  If the state is true/enabled, don't send a close notify alert when
     * closing connection.
     */
    public void set_unclean_shutdown_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;
}
