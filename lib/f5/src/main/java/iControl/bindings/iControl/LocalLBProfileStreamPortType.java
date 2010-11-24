/**
 * LocalLBProfileStreamPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBProfileStreamPortType extends java.rmi.Remote {

    /**
     * Creates the specified stream profiles.
     */
    public void create(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Deletes all stream profiles.
     */
    public void delete_all_profiles() throws java.rmi.RemoteException;

    /**
     * Deletes the specified stream profiles.
     */
    public void delete_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for all the stream profiles.
     */
    public iControl.LocalLBProfileStreamProfileStreamStatistics get_all_statistics() throws java.rmi.RemoteException;

    /**
     * Gets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public java.lang.String[] get_default_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets a list of all stream profiles.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the source strings to search for in the specified profiles.
     */
    public iControl.LocalLBProfileString[] get_source_string(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for the specified stream profiles.
     */
    public iControl.LocalLBProfileStreamProfileStreamStatistics get_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the target strings to replace with in the specified profiles.
     */
    public iControl.LocalLBProfileString[] get_target_string(java.lang.String[] profile_names) throws java.rmi.RemoteException;

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
     * Resets the statistics for the specified stream profiles.
     */
    public void reset_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Sets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public void set_default_profile(java.lang.String[] profile_names, java.lang.String[] defaults) throws java.rmi.RemoteException;

    /**
     * Sets the source strings to search for in the specified profiles.
     */
    public void set_source_string(java.lang.String[] profile_names, iControl.LocalLBProfileString[] sources) throws java.rmi.RemoteException;

    /**
     * Sets the target strings to replace with in the specified profiles.
     */
    public void set_target_string(java.lang.String[] profile_names, iControl.LocalLBProfileString[] targets) throws java.rmi.RemoteException;
}
