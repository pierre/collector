/**
 * ManagementOCSPResponderPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementOCSPResponderPortType extends java.rmi.Remote {

    /**
     * Creates the specified OCSP responders.
     */
    public void create(iControl.ManagementOCSPResponderResponderDefinition[] responders) throws java.rmi.RemoteException;

    /**
     * Deletes all OCSP responders.
     */
    public void delete_all_responders() throws java.rmi.RemoteException;

    /**
     * Deletes the specified OCSP responders.
     */
    public void delete_responder(java.lang.String[] responders) throws java.rmi.RemoteException;

    /**
     * Gets the states that that indicate whether to allow the addition
     * of certificates to the OCSP request.  
     *  This option should normally only be used for testing purposes.
     */
    public iControl.CommonEnabledState[] get_allow_additional_certificate_state(java.lang.String[] responders) throws java.rmi.RemoteException;

    /**
     * Gets the names of the trusted CA certificates used by the responders
     * 
     *  to verify the signature on the OCSP response.
     */
    public java.lang.String[] get_ca_file(java.lang.String[] responders) throws java.rmi.RemoteException;

    /**
     * Gets the paths of the trusted CA certificates used by the responders
     * 
     *  to verify the signature on the OCSP response.
     */
    public java.lang.String[] get_ca_path(java.lang.String[] responders) throws java.rmi.RemoteException;

    /**
     * Gets the states that indicate whether to perform any additional
     * checks on the OCSP response signers 
     *  certificate. If false, do not make any checks to see if the signers
     * certificate is authorized to 
     *  provide the necessary status information: as a result this option
     * should only be used for testing 
     *  purposes.
     */
    public iControl.CommonEnabledState[] get_certificate_check_state(java.lang.String[] responders) throws java.rmi.RemoteException;

    /**
     * Gets the digest algorithm for hashing the certificate information
     * used to 
     *  create the certificate ID that is sent to the responder.
     */
    public iControl.ManagementOCSPDigestMethod[] get_certificate_id_digest_method(java.lang.String[] responders) throws java.rmi.RemoteException;

    /**
     * Gets the states that indicate whether to check the certificates
     * in the OCSP responses.
     */
    public iControl.CommonEnabledState[] get_certificate_verification_state(java.lang.String[] responders) throws java.rmi.RemoteException;

    /**
     * Gets the states that indicate whether to use certificates in
     * the response as additional untrusted CA 
     *  certificates.
     */
    public iControl.CommonEnabledState[] get_chain_state(java.lang.String[] responders) throws java.rmi.RemoteException;

    /**
     * Gets the states that indicate whether to explicitly trust the
     * OCSP response signers certificate as 
     *  authorized for OCSP response signing.  Specifying this option causes
     * a response to be untrusted if 
     *  the signers certificate does not contain the "OCSPSigning" extension.
     */
    public iControl.CommonEnabledState[] get_explicit_state(java.lang.String[] responders) throws java.rmi.RemoteException;

    /**
     * Gets the states that if true, then always use the URL specified
     * in the configuration file, and ignore 
     *  any URL contained in the client certificates' authorityInfoAccess
     * OCSP field. If this option is not 
     *  set (the default) AND the client certificate has a valid AIA OCSP
     * field set, then first attempt to 
     *  connect to the responder in the client's AIA OCSP field, and fall
     * back to the URL in the responder 
     *  definition if that server is not available. See RFC2560 for more
     * detail of the authorityInfoAccess 
     *  x509 extension and its intended usage.
     */
    public iControl.CommonEnabledState[] get_ignore_aia_state(java.lang.String[] responders) throws java.rmi.RemoteException;

    /**
     * Gets the states that that indicate whether to ignore certificates
     * contained in the OCSP response when searching
     *  for the signers certificate. With this option the signers certificate
     * must be specified with either 
     *  the -verify_certs or -VAfile options.
     */
    public iControl.CommonEnabledState[] get_intern_state(java.lang.String[] responders) throws java.rmi.RemoteException;

    /**
     * Gets a list of all OCSP responders.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the state that indicates whether to send a nonce in the
     * OCSP request.
     */
    public iControl.CommonEnabledState[] get_nonce_state(java.lang.String[] responders) throws java.rmi.RemoteException;

    /**
     * Gets the files containing additional certificates to search
     * when attempting to locate 
     *  the OCSP response signing certificate. Some responders omit the actual
     * signer's 
     *  certificates from the response: this option can be used to supply
     * the necessary 
     *  certificates in such cases.
     */
    public java.lang.String[] get_other_certificate_file(java.lang.String[] responders) throws java.rmi.RemoteException;

    /**
     * Gets the states that indicate whether to check the signature
     * on the OCSP response. Since this option 
     *  tolerates invalid signatures on OCSP responses it will normally only
     * be used for testing purposes.
     */
    public iControl.CommonEnabledState[] get_signature_verification_state(java.lang.String[] responders) throws java.rmi.RemoteException;

    /**
     * Gets the signing information necessary to sign the OCSP requests.
     */
    public iControl.ManagementOCSPResponderSignInformation[] get_signing_information(java.lang.String[] responders) throws java.rmi.RemoteException;

    /**
     * Gets the status ages (sec) for the OCSP response. If the notAfter
     * time is omitted from a response then 
     *  this means that new status information is immediately available.
     * In this case the age of the 
     *  notBefore field is checked to see it is not older than age seconds
     * old. By default this additional 
     *  check is not performed when -status_age is not specified.
     */
    public long[] get_status_age(java.lang.String[] responders) throws java.rmi.RemoteException;

    /**
     * Gets the states indicating whether to be explicitly trust the
     * other certificates specified 
     *  via set_other_certificate_file and no additional checks will be performed
     * on them. 
     *  This is useful when the complete responder certificate chain is not
     * available or 
     *  trusting a root CA is not appropriate.
     */
    public iControl.CommonEnabledState[] get_trust_other_certificate_state(java.lang.String[] responders) throws java.rmi.RemoteException;

    /**
     * Gets the URL or hostnames of the responders.
     */
    public java.lang.String[] get_url(java.lang.String[] responders) throws java.rmi.RemoteException;

    /**
     * Gets the files containing explicitly trusted responder certificates.
     * This functionality  
     *  is equivalent to having the other certificates specified via set_other_certificate_file,
     * and setting the state via set_trust_other_certificate_state.
     */
    public java.lang.String[] get_va_file(java.lang.String[] responders) throws java.rmi.RemoteException;

    /**
     * Gets the range of times, in seconds, which will be tolerated
     * in an OCSP response. Each certificate 
     *  status response includes a notBefore time and an optional notAfter
     * time. The current time should fall 
     *  between these two values, but the interval between the two times
     * may be only a few seconds. In practice
     *  the OCSP responder and clients clocks may not be precisely synchronized
     * and so such a check may fail.
     *  To avoid this the -validity_period option can be used to specify
     * an acceptable error range in seconds, 
     *  the default value is 300 seconds.
     */
    public long[] get_validity_period(java.lang.String[] responders) throws java.rmi.RemoteException;

    /**
     * Gets the states that indicate whether to attempt to verify
     * the OCSP response signature or the nonce 
     *  values. This option will normally only be used for debugging since
     * it disables all verification of 
     *  the responders certificate.
     */
    public iControl.CommonEnabledState[] get_verification_state(java.lang.String[] responders) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Sets the states that indicate whether to allow the addition
     * of certificates to the OCSP request.  
     *  This option should normally only be used for testing purposes.
     */
    public void set_allow_additional_certificate_state(java.lang.String[] responders, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the names of the trusted CA certificates used by the responders
     * 
     *  to verify the signature on the OCSP response.
     */
    public void set_ca_file(java.lang.String[] responders, java.lang.String[] ca_files) throws java.rmi.RemoteException;

    /**
     * Sets the paths of the trusted CA certificates used by the responders
     * 
     *  to verify the signature on the OCSP response.
     */
    public void set_ca_path(java.lang.String[] responders, java.lang.String[] ca_paths) throws java.rmi.RemoteException;

    /**
     * Sets the states that indicate whether to perform any additional
     * checks on the OCSP response signers 
     *  certificate. If false, do not make any checks to see if the signers
     * certificate is authorized to 
     *  provide the necessary status information: as a result this option
     * should only be used for testing 
     *  purposes.
     */
    public void set_certificate_check_state(java.lang.String[] responders, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the digest algorithm for hashing the certificate information
     * used to 
     *  create the certificate ID that is sent to the responder.
     */
    public void set_certificate_id_digest_method(java.lang.String[] responders, iControl.ManagementOCSPDigestMethod[] digest_methods) throws java.rmi.RemoteException;

    /**
     * Sets the states that indicate whether to check the certificates
     * in the OCSP responses.
     */
    public void set_certificate_verification_state(java.lang.String[] responders, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the states that indicate whether to use certificates in
     * the response as additional untrusted CA 
     *  certificates.
     */
    public void set_chain_state(java.lang.String[] responders, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the states that indicate whether to explicitly trust the
     * OCSP response signers certificate as 
     *  authorized for OCSP response signing.  Specifying this option causes
     * a response to be untrusted if 
     *  the signers certificate does not contain the "OCSPSigning" extension.
     */
    public void set_explicit_state(java.lang.String[] responders, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the states that if true, then always use the URL specified
     * in the configuration file, and ignore 
     *  any URL contained in the client certificates' authorityInfoAccess
     * OCSP field. If this option is not 
     *  set (the default) AND the client certificate has a valid AIA OCSP
     * field set, then first attempt to 
     *  connect to the responder in the client's AIA OCSP field, and fall
     * back to the URL in the responder 
     *  definition if that server is not available. See RFC2560 for more
     * detail of the authorityInfoAccess 
     *  x509 extension and its intended usage.
     */
    public void set_ignore_aia_state(java.lang.String[] responders, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the states that indicate whether to ignore certificates
     * contained in the OCSP response when searching
     *  for the signers certificate. With this option the signers certificate
     * must be specified with either 
     *  the -verify_certs or -VAfile options.
     */
    public void set_intern_state(java.lang.String[] responders, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the state that indicates whether to send a nonce in the
     * OCSP request.
     */
    public void set_nonce_state(java.lang.String[] responders, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the files containing additional certificates to search
     * when attempting to locate 
     *  the OCSP response signing certificate. Some responders omit the actual
     * signer's 
     *  certificates from the response: this option can be used to supply
     * the necessary 
     *  certificates in such cases.
     */
    public void set_other_certificate_file(java.lang.String[] responders, java.lang.String[] other_files) throws java.rmi.RemoteException;

    /**
     * Sets the states that indicate whether to check the signature
     * on the OCSP response. Since this option 
     *  tolerates invalid signatures on OCSP responses it will normally only
     * be used for testing purposes.
     */
    public void set_signature_verification_state(java.lang.String[] responders, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the signing information necessary to sign the OCSP requests.
     */
    public void set_signing_information(java.lang.String[] responders, iControl.ManagementOCSPResponderSignInformation[] signers) throws java.rmi.RemoteException;

    /**
     * Sets the status ages (sec) for the OCSP response. If the notAfter
     * time is omitted from a response then 
     *  this means that new status information is immediately available.
     * In this case the age of the 
     *  notBefore field is checked to see it is not older than age seconds
     * old. By default this additional 
     *  check is not performed when -status_age is not specified.
     */
    public void set_status_age(java.lang.String[] responders, long[] ages) throws java.rmi.RemoteException;

    /**
     * Sets the states indicating whether to be explicitly trust the
     * other certificates specified 
     *  via set_other_certificate_file and no additional checks will be performed
     * on them. 
     *  This is useful when the complete responder certificate chain is not
     * available or 
     *  trusting a root CA is not appropriate.
     */
    public void set_trust_other_certificate_state(java.lang.String[] responders, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the URLs of the responders.
     */
    public void set_url(java.lang.String[] responders, java.lang.String[] urls) throws java.rmi.RemoteException;

    /**
     * Sets the files containing explicitly trusted responder certificates.
     * This functionality  
     *  is equivalent to having the other certificates specified via set_other_certificate_file,
     * and setting the state via set_trust_other_certificate_state.
     */
    public void set_va_file(java.lang.String[] responders, java.lang.String[] va_files) throws java.rmi.RemoteException;

    /**
     * Sets the range of times, in seconds, which will be tolerated
     * in an OCSP response. Each certificate 
     *  status response includes a notBefore time and an optional notAfter
     * time. The current time should fall 
     *  between these two values, but the interval between the two times
     * may be only a few seconds. In practice
     *  the OCSP responder and clients clocks may not be precisely synchronized
     * and so such a check may fail.
     *  To avoid this the -validity_period option can be used to specify
     * an acceptable error range in seconds, 
     *  the default value is 300 seconds.
     */
    public void set_validity_period(java.lang.String[] responders, long[] ranges) throws java.rmi.RemoteException;

    /**
     * Sets the states that indicate whether to attempt to verify
     * the OCSP response signature or the nonce 
     *  values. This option will normally only be used for debugging since
     * it disables all verification of 
     *  the responders certificate.
     */
    public void set_verification_state(java.lang.String[] responders, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;
}
