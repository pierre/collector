/**
 * LocalLBProfilePersistencePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBProfilePersistencePortType extends java.rmi.Remote {

    /**
     * Creates the specified Persistence profiles.
     */
    public void create(java.lang.String[] profile_names, iControl.LocalLBPersistenceMode[] modes) throws java.rmi.RemoteException;

    /**
     * Deletes all Persistence profiles.
     */
    public void delete_all_profiles() throws java.rmi.RemoteException;

    /**
     * Deletes the specified Persistence profiles.
     */
    public void delete_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the states to indicate whether persistence entries added
     * under this profile are
     *  available across pools.
     */
    public iControl.LocalLBProfileEnabledState[] get_across_pool_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the states to indicate whether persistence entries added
     * under this profile are
     *  available across services.
     */
    public iControl.LocalLBProfileEnabledState[] get_across_service_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the states to indicate whether persistence entries added
     * under this profile are
     *  available across virtuals.
     */
    public iControl.LocalLBProfileEnabledState[] get_across_virtual_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the cookie expiration in seconds for the specified Persistence
     * profiles.
     *  Applicable when peristence mode is PERSISTENCE_MODE_COOKIE.
     */
    public iControl.LocalLBProfileULong[] get_cookie_expiration(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the cookie hash lengths for the specified profiles.
     *  Applicable when peristence mode is PERSISTENCE_MODE_COOKIE, and
     *  cookie persistence method is COOKIE_PERSISTENCE_METHOD_HASH.
     */
    public iControl.LocalLBProfileULong[] get_cookie_hash_length(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the cookie hash offsets for the specified profiles.
     *  Applicable when peristence mode is PERSISTENCE_MODE_COOKIE, and
     *  cookie persistence method is COOKIE_PERSISTENCE_METHOD_HASH.
     */
    public iControl.LocalLBProfileULong[] get_cookie_hash_offset(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the cookie names for the specified Persistence profiles.
     * Applicable when peristence mode is PERSISTENCE_MODE_COOKIE.
     */
    public iControl.LocalLBProfileString[] get_cookie_name(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the cookie persistence methods to be used when in cookie
     * persistence mode.
     *  Applicable when peristence mode is PERSISTENCE_MODE_COOKIE.
     */
    public iControl.LocalLBProfileCookiePersistenceMethod[] get_cookie_persistence_method(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public java.lang.String[] get_default_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the pattern marking the end of the section of payload
     * data
     *  whose hashed value is used for the persistence value for a set of
     * persistence profiles.
     * 
     *  This only returns useful values if the persistence mode is
     *  PERSISTENCE_MODE_HASH and the hash method is PERSISTENCE_HASH_CARP.
     */
    public iControl.LocalLBProfileString[] get_ending_hash_pattern(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the length of payload data whose hashed value is used
     * for the
     *  persistence value for a set of persistence profiles.
     * 
     *  This only returns useful values if the persistence mode is
     *  PERSISTENCE_MODE_HASH and the hash method is PERSISTENCE_HASH_CARP.
     */
    public iControl.LocalLBProfileULong[] get_hash_length(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the hash method used to generate the persistence values
     * for a
     *  set of persistence profiles.
     * 
     *  This only returns useful values if the persistence mode is
     *  PERSISTENCE_MODE_HASH.
     */
    public iControl.LocalLBProfilePersistenceProfilePersistenceHashMethod[] get_hash_method(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the enabled state whether to perform another hash operation
     * after the current hash operation completes for a set of persistence
     * profiles.
     * 
     *  This only returns useful values if the persistence mode is
     *  PERSISTENCE_MODE_HASH and the hash method is PERSISTENCE_HASH_CARP.
     */
    public iControl.LocalLBProfileEnabledState[] get_hash_more_data_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the offset to the start of the payload data whose hashed
     * value
     *  is used as the persistence value for a set of persistence profiles.
     * 
     *  This only returns useful values if the persistence mode is
     *  PERSISTENCE_MODE_HASH and the hash method is PERSISTENCE_HASH_CARP.
     */
    public iControl.LocalLBProfileULong[] get_hash_offset(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets a list of all Persistence profiles.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the states to indicate whether to map known proxies when
     * the persistence mode
     *  is source address affinity.
     */
    public iControl.LocalLBProfileEnabledState[] get_map_proxy_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the masks used in either simple or sticky persistence
     * mode.
     */
    public iControl.LocalLBProfileIPAddress[] get_mask(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the maximum size of the buffer used to hold the section
     * of the
     *  payload data whose hashed value is used for the persistence value
     * for a set of persistence values.
     * 
     *  This only returns useful values if the persistence mode is
     *  PERSISTENCE_MODE_HASH and the hash method is PERSISTENCE_HASH_CARP.
     */
    public iControl.LocalLBProfileULong[] get_maximum_hash_buffer_size(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the mirror states for the specified Persistence profiles.
     */
    public iControl.LocalLBProfileEnabledState[] get_mirror_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the states to indicate whether MS terminal services have
     * been configured without
     *  a session directory for the specified Persistence profiles.
     */
    public iControl.LocalLBProfileEnabledState[] get_msrdp_without_session_directory_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the persistence modes for the specified Persistence profiles.
     */
    public iControl.LocalLBProfilePersistenceMode[] get_persistence_mode(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the UIE rules for the specified Persistence profiles.
     *  Applicable when peristence mode is PERSISTENCE_MODE_UIE.
     */
    public iControl.LocalLBProfileString[] get_rule(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the sip_info headers for the specified Persistence profiles.
     * Applicable when peristence mode is PERSISTENCE_MODE_SIP.
     */
    public iControl.LocalLBProfileString[] get_sip_info(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the pattern marking the start of the section of payload
     * data
     *  whose hashed value is used for the persistence value for a set of
     * persistence profiles.
     * 
     *  This only returns useful values if the persistence mode is
     *  PERSISTENCE_MODE_HASH and the hash method is PERSISTENCE_HASH_CARP.
     */
    public iControl.LocalLBProfileString[] get_starting_hash_pattern(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the timeout for the specified Persistence profiles.
     *  The number of seconds to timeout a persistence entry.
     */
    public iControl.LocalLBProfileULong[] get_timeout(java.lang.String[] profile_names) throws java.rmi.RemoteException;

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
     * Sets the states to indicate whether persistence entries added
     * under this profile are
     *  available across pools.
     */
    public void set_across_pool_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the states to indicate whether persistence entries added
     * under this profile are
     *  available across services.
     */
    public void set_across_service_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the states to indicate whether persistence entries added
     * under this profile are
     *  available across virtuals.
     */
    public void set_across_virtual_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the cookie expiration in seconds for the specified Persistence
     * profiles.
     *  Applicable when peristence mode is PERSISTENCE_MODE_COOKIE.
     */
    public void set_cookie_expiration(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] expirations) throws java.rmi.RemoteException;

    /**
     * Sets the cookie hash lengths for the specified profiles.
     *  Applicable when peristence mode is PERSISTENCE_MODE_COOKIE, and
     *  cookie persistence method is COOKIE_PERSISTENCE_METHOD_HASH.
     */
    public void set_cookie_hash_length(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] lengths) throws java.rmi.RemoteException;

    /**
     * Sets the cookie hash offsets for the specified profiles.
     *  Applicable when peristence mode is PERSISTENCE_MODE_COOKIE, and
     *  cookie persistence method is COOKIE_PERSISTENCE_METHOD_HASH.
     */
    public void set_cookie_hash_offset(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] offsets) throws java.rmi.RemoteException;

    /**
     * Sets the cookie names for the specified Persistence profiles.
     * Applicable when peristence mode is PERSISTENCE_MODE_COOKIE.
     */
    public void set_cookie_name(java.lang.String[] profile_names, iControl.LocalLBProfileString[] cookie_names) throws java.rmi.RemoteException;

    /**
     * Sets the cookie persistence methods to be used when in cookie
     * persistence mode.
     *  Applicable when peristence mode is PERSISTENCE_MODE_COOKIE.
     */
    public void set_cookie_persistence_method(java.lang.String[] profile_names, iControl.LocalLBProfileCookiePersistenceMethod[] methods) throws java.rmi.RemoteException;

    /**
     * Sets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public void set_default_profile(java.lang.String[] profile_names, java.lang.String[] defaults) throws java.rmi.RemoteException;

    /**
     * Sets the pattern marking the end of the section of payload
     * data
     *  whose hashed value is used for the persistence value for a set of
     * persistence profiles.
     * 
     *  The hash payload data is either delimited by this starting and
     *  ending string pattern or the offset and length, not both.
     * 
     *  This is only applicable when the persistence mode is
     *  PERSISTENCE_MODE_HASH and the hash method is PERSISTENCE_HASH_CARP.
     */
    public void set_ending_hash_pattern(java.lang.String[] profile_names, iControl.LocalLBProfileString[] patterns) throws java.rmi.RemoteException;

    /**
     * Sets the length of payload data whose hashed value is used
     * for the
     *  persistence value for a set of persistence profiles.
     * 
     *  The start of the data is specified via set_hash_offset.
     * 
     *  The hash payload data is either delimited by this offset and length
     * or the starting and ending string pattern, not both.
     * 
     *  This is only applicable when the persistence mode is
     *  PERSISTENCE_MODE_HASH and the hash method is PERSISTENCE_HASH_CARP.
     */
    public void set_hash_length(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] lengths) throws java.rmi.RemoteException;

    /**
     * Sets the hash method used to generate the persistence values
     * for a
     *  set of persistence profiles.
     * 
     *  See PersistenceHashMethod for details.
     * 
     *  This is only applicable when the persistence mode is
     *  PERSISTENCE_MODE_HASH.
     */
    public void set_hash_method(java.lang.String[] profile_names, iControl.LocalLBProfilePersistenceProfilePersistenceHashMethod[] methods) throws java.rmi.RemoteException;

    /**
     * Sets the enabled state whether to perform another hash operation
     * after the current hash operation completes for a set of persistence
     * profiles.
     * 
     *  This is only applicable when the persistence mode is
     *  PERSISTENCE_MODE_HASH and the hash method is PERSISTENCE_HASH_CARP.
     */
    public void set_hash_more_data_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the offset to the start of the payload data whose hashed
     * value
     *  is used as the persistence value for a set of persistence profiles.
     * 
     *  This is only applicable when the persistence mode is
     *  PERSISTENCE_MODE_HASH and the hash method is PERSISTENCE_HASH_CARP.
     * 
     *  The hashed payload data length is specified via set_hash_length.
     */
    public void set_hash_offset(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] offsets) throws java.rmi.RemoteException;

    /**
     * Sets the states to indicate whether to map known proxies when
     * the persistence mode
     *  is source address affinity.
     */
    public void set_map_proxy_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the masks used in either simple or sticky persistence
     * mode.
     */
    public void set_mask(java.lang.String[] profile_names, iControl.LocalLBProfileIPAddress[] masks) throws java.rmi.RemoteException;

    /**
     * Sets the maximum size of the buffer used to hold the section
     * of the
     *  payload data whose hashed value is used for the persistence value
     * for a set of persistence values.
     * 
     *  This is only applicable when the persistence mode is
     *  PERSISTENCE_MODE_HASH and the hash method is PERSISTENCE_HASH_CARP.
     */
    public void set_maximum_hash_buffer_size(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] sizes) throws java.rmi.RemoteException;

    /**
     * Sets the mirror states for the specified Persistence profiles.
     */
    public void set_mirror_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the states to indicate whether MS terminal services have
     * been configured without
     *  a session directory for the specified Persistence profiles.
     */
    public void set_msrdp_without_session_directory_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the persistence modes for the specified Persistence profiles.
     */
    public void set_persistence_mode(java.lang.String[] profile_names, iControl.LocalLBProfilePersistenceMode[] modes) throws java.rmi.RemoteException;

    /**
     * Sets the UIE rules for the specified Persistence profiles.
     *  Applicable when peristence mode is PERSISTENCE_MODE_UIE.
     */
    public void set_rule(java.lang.String[] profile_names, iControl.LocalLBProfileString[] rules) throws java.rmi.RemoteException;

    /**
     * Sets the sip_info header for the specified Persistence profiles.
     * Applicable when peristence mode is PERSISTENCE_MODE_SIP.
     */
    public void set_sip_info(java.lang.String[] profile_names, iControl.LocalLBProfileString[] sip_info_headers) throws java.rmi.RemoteException;

    /**
     * Sets the pattern marking the start of the section of payload
     * data
     *  whose hashed value is used for the persistence value for a set of
     * persistence profiles.
     * 
     *  This is only applicable when the persistence mode is
     *  PERSISTENCE_MODE_HASH and the hash method is PERSISTENCE_HASH_CARP.
     */
    public void set_starting_hash_pattern(java.lang.String[] profile_names, iControl.LocalLBProfileString[] patterns) throws java.rmi.RemoteException;

    /**
     * Sets the timeout for the specified Persistence profiles.
     *  The number of seconds to timeout a persistence entry.
     */
    public void set_timeout(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] timeouts) throws java.rmi.RemoteException;
}
