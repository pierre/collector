/**
 * LocalLBProfileRADIUSPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBProfileRADIUSPortType extends java.rmi.Remote {

    /**
     * Adds to the lists of host and network addresses from which
     *  clients can connect.
     * 
     *  See get_client for more information on the client specification.
     */
    public void add_client(java.lang.String[] profile_names, java.lang.String[][] clients) throws java.rmi.RemoteException;

    /**
     * Creates the specified RADIUS profiles.
     */
    public void create(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Deletes all RADIUS profiles.
     */
    public void delete_all_profiles() throws java.rmi.RemoteException;

    /**
     * Deletes the specified RADIUS profiles.
     */
    public void delete_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for all the RADIUS profiles.
     */
    public iControl.LocalLBProfileRADIUSProfileRADIUSStatistics get_all_statistics() throws java.rmi.RemoteException;

    /**
     * Gets the list of host and network addresses from which
     *  clients can connect.
     * 
     *  An entry in the list can be a host or network address, for
     *  example: 10.10.10.0/24 or 10.10.10.10. An empty value
     *  indicates that any client can connect.
     */
    public iControl.LocalLBProfileStringArray[] get_client(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public java.lang.String[] get_default_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets a list of all RADIUS profiles.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the the RADIUS Attribute (Value Pair; AVP) on which to
     * persist for each of the profiles given.
     * 
     *  See set_persist_avp for more information on the AVP
     *  specification.
     */
    public iControl.LocalLBProfileString[] get_persist_avp(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for the specified RADIUS profiles.
     */
    public iControl.LocalLBProfileRADIUSProfileRADIUSStatistics get_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException;

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
     * Removes entries from the lists of host and network
     *  addresses from which clients can connect.
     * 
     *  See get_client for more information on the client specification.
     */
    public void remove_client(java.lang.String[] profile_names, java.lang.String[][] clients) throws java.rmi.RemoteException;

    /**
     * Resets the statistics for the specified RADIUS profiles.
     */
    public void reset_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Resets the client list to the parent defaults.
     */
    public void set_default_client(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Sets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public void set_default_profile(java.lang.String[] profile_names, java.lang.String[] defaults) throws java.rmi.RemoteException;

    /**
     * Sets the RADIUS Attribute (Value Pair; AVP) on which to
     *  persist for each of the profiles given.
     * 
     *  The attribute specification can be a string or a numeric
     *  code (1-255), encoded as string.  If the string is empty,
     *  or the code does not exist in the traffic coming to the
     *  system, then persist is disabled (if the name is not
     *  recognized, this method will produce an error).  See RFC
     *  2865, section 5, for valid base numeric codes.
     * 
     *  Valid names are as listed in section 5, in any mix of
     *  upper and lower case.
     */
    public void set_persist_avp(java.lang.String[] profile_names, iControl.LocalLBProfileString[] avps) throws java.rmi.RemoteException;
}
