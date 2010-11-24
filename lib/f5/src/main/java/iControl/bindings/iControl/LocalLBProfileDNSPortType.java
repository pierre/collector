/**
 * LocalLBProfileDNSPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBProfileDNSPortType extends java.rmi.Remote {

    /**
     * Creates the specified DNS profiles.
     */
    public void create(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Deletes all DNS profiles.
     */
    public void delete_all_profiles() throws java.rmi.RemoteException;

    /**
     * Deletes the specified DNS profiles.
     */
    public void delete_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for all the DNS profiles.
     */
    public iControl.LocalLBProfileDNSProfileDNSStatistics get_all_statistics() throws java.rmi.RemoteException;

    /**
     * Gets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public java.lang.String[] get_default_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the state that if true, allows GTM to handle DNS resolution
     * for DNS queries
     *  and responses that contain wide IP names.
     */
    public iControl.LocalLBProfileEnabledState[] get_gtm_enabled_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets a list of all DNS profiles.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the statistics for the specified DNS profiles.
     */
    public iControl.LocalLBProfileDNSProfileDNSStatistics get_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException;

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
     * Resets the statistics for the specified DNS profiles.
     */
    public void reset_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Sets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public void set_default_profile(java.lang.String[] profile_names, java.lang.String[] defaults) throws java.rmi.RemoteException;

    /**
     * Sets the state that if true, allows GTM to handle DNS resolution
     * for DNS queries
     *  and responses that contain wide IP names.
     */
    public void set_gtm_enabled_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;
}
