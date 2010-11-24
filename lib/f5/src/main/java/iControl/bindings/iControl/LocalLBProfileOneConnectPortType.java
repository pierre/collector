/**
 * LocalLBProfileOneConnectPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBProfileOneConnectPortType extends java.rmi.Remote {

    /**
     * Creates the specified OneConnect profiles.
     */
    public void create(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Deletes all OneConnect profiles.
     */
    public void delete_all_profiles() throws java.rmi.RemoteException;

    /**
     * Deletes the specified OneConnect profiles.
     */
    public void delete_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for all the OneConnect profiles.
     */
    public iControl.LocalLBProfileOneConnectProfileOneConnectStatistics get_all_statistics() throws java.rmi.RemoteException;

    /**
     * Gets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public java.lang.String[] get_default_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the idle timeouts for connections in the specified connection
     * pools.
     */
    public iControl.LocalLBProfileULong[] get_idle_timeout(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets a list of all OneConnect profiles.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the maximum age (in seconds) after which a connection
     * should not be reused.
     */
    public iControl.LocalLBProfileULong[] get_maximum_age(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the maximum number of connections for the specified OneConnect
     * profiles.
     */
    public iControl.LocalLBProfileULong[] get_maximum_connection(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the maximum times the connections in the pool can be reused.
     */
    public iControl.LocalLBProfileULong[] get_maximum_reuse(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the masks applied to the source addresses to determine
     * eligibility for connection reuse.
     */
    public iControl.LocalLBProfileIPAddress[] get_source_mask(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for the specified OneConnect profiles.
     */
    public iControl.LocalLBProfileOneConnectProfileOneConnectStatistics get_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException;

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
     * Resets the statistics for the specified OneConnect profiles.
     */
    public void reset_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Sets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public void set_default_profile(java.lang.String[] profile_names, java.lang.String[] defaults) throws java.rmi.RemoteException;

    /**
     * Sets the idle timeouts for connections in the specified connection
     * pools.
     */
    public void set_idle_timeout(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] timeouts) throws java.rmi.RemoteException;

    /**
     * Sets the maximum age (in seconds) after which a connection
     * should not be reused.
     */
    public void set_maximum_age(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] maximum_ages) throws java.rmi.RemoteException;

    /**
     * Sets the maximum number of connections for the specified OneConnect
     * profiles.
     */
    public void set_maximum_connection(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] maximum_connections) throws java.rmi.RemoteException;

    /**
     * Sets the maximum times the connections in the pool can be reused.
     */
    public void set_maximum_reuse(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] maximum_reuses) throws java.rmi.RemoteException;

    /**
     * Sets the masks applied to the source addresses to determine
     * eligibility for connection reuse.
     */
    public void set_source_mask(java.lang.String[] profile_names, iControl.LocalLBProfileIPAddress[] source_masks) throws java.rmi.RemoteException;
}
