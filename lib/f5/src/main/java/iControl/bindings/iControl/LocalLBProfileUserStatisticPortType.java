/**
 * LocalLBProfileUserStatisticPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBProfileUserStatisticPortType extends java.rmi.Remote {

    /**
     * Creates the specified user-defined statistic profiles.
     */
    public void create(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Deletes all user-defined statistic profiles.
     */
    public void delete_all_profiles() throws java.rmi.RemoteException;

    /**
     * Deletes the specified user-defined statistic profiles.
     */
    public void delete_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for all the user-defined statistic profiles.
     * Only the statistic values of the user-defined statistics will be returned,
     * i.e. even though there are up to 32 custom statistics in any given
     * profile,
     *  but if only 3 of those custom statistics have been defined by the
     * user,
     *  then only the values of those 3 statistics will be returned.
     */
    public iControl.LocalLBProfileUserStatisticProfileUserStatisticStatistics get_all_statistics() throws java.rmi.RemoteException;

    /**
     * Gets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public java.lang.String[] get_default_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets a list of all user-defined statistic profiles.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the user-defined statistic names in the specified profiles.
     */
    public iControl.LocalLBProfileUserStatisticUserStatisticName[][] get_statistic_name(java.lang.String[] profile_names, iControl.LocalLBProfileUserStatisticUserStatisticKey[][] statistic_keys) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for the specified user-defined statistic
     * profiles.
     *  Only the statistic values of the user-defined statistics will be
     * returned,
     *  i.e. even though there are up to 32 custom statistics in any given
     * profile,
     *  but if only 3 of those custom statistics have been defined by the
     * user,
     *  then only the values of those 3 statistics will be returned.
     */
    public iControl.LocalLBProfileUserStatisticProfileUserStatisticStatistics get_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException;

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
     * Resets the statistics for the specified user-defined statistic
     * profiles.
     */
    public void reset_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Sets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public void set_default_profile(java.lang.String[] profile_names, java.lang.String[] defaults) throws java.rmi.RemoteException;

    /**
     * Sets the user-defined statistic names in the specified profiles.
     */
    public void set_statistic_name(java.lang.String[] profile_names, iControl.LocalLBProfileUserStatisticUserStatisticName[][] statistic_names) throws java.rmi.RemoteException;
}
