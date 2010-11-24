/**
 * LocalLBProfileFTPPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBProfileFTPPortType extends java.rmi.Remote {

    /**
     * Creates the specified FTP profiles.
     */
    public void create(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Deletes all FTP profiles.
     */
    public void delete_all_profiles() throws java.rmi.RemoteException;

    /**
     * Deletes the specified FTP profiles.
     */
    public void delete_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for all the FTP profiles.
     */
    public iControl.LocalLBProfileFTPProfileFTPStatistics get_all_statistics() throws java.rmi.RemoteException;

    /**
     * Gets the data channel port for the specified FTP profiles.
     */
    public iControl.LocalLBProfilePortNumber[] get_data_channel_port(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public java.lang.String[] get_default_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets a list of all FTP profiles.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the state that if true, enable horizontal security for
     * the
     *  specified FTP profiles.
     */
    public iControl.LocalLBProfileEnabledState[] get_security_enabled_request_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for the specified FTP profiles.
     */
    public iControl.LocalLBProfileFTPProfileFTPStatistics get_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the state that if true, automatically translate RFC2428
     * extended requests
     *  EPSV and EPRT to PASV and PORT when talking to IPv4 servers.
     */
    public iControl.LocalLBProfileEnabledState[] get_translated_extended_request_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

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
     * Resets the statistics for the specified FTP profiles.
     */
    public void reset_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Sets the data channel port for the specified FTP profiles.
     */
    public void set_data_channel_port(java.lang.String[] profile_names, iControl.LocalLBProfilePortNumber[] ports) throws java.rmi.RemoteException;

    /**
     * Sets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public void set_default_profile(java.lang.String[] profile_names, java.lang.String[] defaults) throws java.rmi.RemoteException;

    /**
     * Sets the state that if true, enable horizontal security for
     * the
     *  specified FTP profiles.
     */
    public void set_security_enabled_request_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the state that if true, automatically translate RFC2428
     * extended requests
     *  EPSV and EPRT to PASV and PORT when talking to IPv4 servers.
     */
    public void set_translated_extended_request_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;
}
