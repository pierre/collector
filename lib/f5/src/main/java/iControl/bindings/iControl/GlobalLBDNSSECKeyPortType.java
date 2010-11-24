/**
 * GlobalLBDNSSECKeyPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface GlobalLBDNSSECKeyPortType extends java.rmi.Remote {

    /**
     * Creates a set of DNSSEC keys.
     * 
     *  Note that the attributes specified in this method cannot be changed
     * afterwards.
     */
    public void create(java.lang.String[] keys, long[] sizes, iControl.GlobalLBDNSSECKeyKeyType[] types, iControl.GlobalLBDNSSECKeyKeyAlgorithm[] algorithms, iControl.CommonEnabledState[] fips) throws java.rmi.RemoteException;

    /**
     * Deletes all DNSSEC keys.
     */
    public void delete_all_keys() throws java.rmi.RemoteException;

    /**
     * Deletes a set of DNSSEC keys.
     */
    public void delete_key(java.lang.String[] keys) throws java.rmi.RemoteException;

    /**
     * Gets the algorithms used to digitally sign DNS record groups
     * and
     *  keys for a set of DNSSEC keys.
     */
    public iControl.GlobalLBDNSSECKeyKeyAlgorithm[] get_algorithm(java.lang.String[] keys) throws java.rmi.RemoteException;

    /**
     * Gets the enabled state for a set of DNSSEC keys.
     */
    public iControl.CommonEnabledState[] get_enabled_state(java.lang.String[] keys) throws java.rmi.RemoteException;

    /**
     * Gets the expiration period for a set of DNSSEC keys.
     */
    public long[] get_expiration_period(java.lang.String[] keys) throws java.rmi.RemoteException;

    /**
     * Gets the enabled state for using the FIPS device to store and
     * retrieve keys for a set of DNSSEC keys.
     */
    public iControl.CommonEnabledState[] get_fips_state(java.lang.String[] keys) throws java.rmi.RemoteException;

    /**
     * Gets the existing DNSSEC key generation identifiers for a set
     * of
     *  DNSSEC keys.
     * 
     *  The key generation identifier is a simple generation count, unique
     * within a single DNSSEC key.
     */
    public iControl.CommonULong64[][] get_generation(java.lang.String[] keys) throws java.rmi.RemoteException;

    /**
     * Gets the expiration date and time for a set of DNSSEC key
     *  generations.
     */
    public iControl.CommonTimeStamp[][] get_generation_expiration_time(java.lang.String[] keys, iControl.CommonULong64[][] generations) throws java.rmi.RemoteException;

    /**
     * Gets the public text for a set of DNSSEC key generations.
     */
    public java.lang.String[][] get_generation_public_text(java.lang.String[] keys, iControl.CommonULong64[][] generations) throws java.rmi.RemoteException;

    /**
     * Gets the rollover date and time for a set of DNSSEC key
     *  generations.
     */
    public iControl.CommonTimeStamp[][] get_generation_rollover_time(java.lang.String[] keys, iControl.CommonULong64[][] generations) throws java.rmi.RemoteException;

    /**
     * Gets the names of all DNSSEC keys.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the rollover period for a set of DNSSEC keys.
     */
    public long[] get_rollover_period(java.lang.String[] keys) throws java.rmi.RemoteException;

    /**
     * Gets the RRSIG record signature publication period for a set
     * of
     *  DNSSEC keys.
     */
    public long[] get_signature_publication_period(java.lang.String[] keys) throws java.rmi.RemoteException;

    /**
     * Gets the RRSIG record signature validity period for a set of
     * DNSSEC
     *  keys.
     */
    public long[] get_signature_validity_period(java.lang.String[] keys) throws java.rmi.RemoteException;

    /**
     * Gets the digital signature sizes for a set of DNSSEC keys.
     */
    public long[] get_size(java.lang.String[] keys) throws java.rmi.RemoteException;

    /**
     * Gets the Time To Live (TTL) for the DNSKEY record types.
     */
    public long[] get_time_to_live(java.lang.String[] keys) throws java.rmi.RemoteException;

    /**
     * Gets the types for a set of DNSSEC keys.
     */
    public iControl.GlobalLBDNSSECKeyKeyType[] get_type(java.lang.String[] keys) throws java.rmi.RemoteException;

    /**
     * Get the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Sets the enabled state for a set of DNSSEC keys.
     * 
     *  If a DNSSEC key is disabled, the key is still published, but it is
     * not used to sign DNS record groups or keys.
     */
    public void set_enabled_state(java.lang.String[] keys, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the expiration period for a set of DNSSEC keys.
     * 
     *  The expiration period is the time between the activation of a
     *  DNSSEC key generation and its expiration.  It must be longer than
     * the rollover period.
     */
    public void set_expiration_period(java.lang.String[] keys, long[] times) throws java.rmi.RemoteException;

    /**
     * Sets the expiration date and time for a set of DNSSEC key
     *  generations.
     * 
     *  This method can be used for any reason, but most likely used to
     *  invalidate a possibly compromised key.
     */
    public void set_generation_expiration_time(java.lang.String[] keys, iControl.CommonULong64[][] generations, iControl.CommonTimeStamp[][] times) throws java.rmi.RemoteException;

    /**
     * Sets the rollover date and time for a set of DNSSEC key
     *  generations.
     * 
     *  This method can be used for any reason, but most likely used to
     *  invalidate a possibly compromised key by forcing the creation of
     * a
     *  new key generation.
     */
    public void set_generation_rollover_time(java.lang.String[] keys, iControl.CommonULong64[][] generations, iControl.CommonTimeStamp[][] times) throws java.rmi.RemoteException;

    /**
     * Sets the rollover period for a set of DNSSEC keys.
     * 
     *  The rollover period is the time between the activation of one
     *  DNSSEC key generation and the activation of the next DNSSEC key
     *  generation.
     */
    public void set_rollover_period(java.lang.String[] keys, long[] times) throws java.rmi.RemoteException;

    /**
     * Sets the RRSIG record signature publication period for a set
     * of
     *  DNSSEC keys.
     * 
     *  The signature publication period is the period in which the digital
     * signature is published, is stored in the RRSIG record, and should
     *  be significantly shorter than the Time To Live period and must be
     * shorter than the signature validity period.
     */
    public void set_signature_publication_period(java.lang.String[] keys, long[] times) throws java.rmi.RemoteException;

    /**
     * Sets the RRSIG record signature validity period for a set of
     * DNSSEC
     *  keys.
     * 
     *  This value is the period for which the digital signature is valid
     * and is stored in the RRSIG record and should be significantly
     *  smaller than the Time To Live period.
     */
    public void set_signature_validity_period(java.lang.String[] keys, long[] times) throws java.rmi.RemoteException;

    /**
     * Sets the Time To Live (TTL) for the DNSKEY record types.
     */
    public void set_time_to_live(java.lang.String[] keys, long[] times) throws java.rmi.RemoteException;
}
