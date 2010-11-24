/**
 * LocalLBProfileAuthPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBProfileAuthPortType extends java.rmi.Remote {

    /**
     * Creates the specified auth profiles.
     */
    public void create(java.lang.String[] profile_names, iControl.LocalLBProfileString[] config_names, iControl.LocalLBProfileAuthenticationMethod[] auth_methods) throws java.rmi.RemoteException;

    /**
     * Deletes all auth profiles.
     */
    public void delete_all_profiles() throws java.rmi.RemoteException;

    /**
     * Deletes the specified auth profiles.
     */
    public void delete_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for all the Auth profiles.
     */
    public iControl.LocalLBProfileAuthProfileAuthStatistics get_all_statistics() throws java.rmi.RemoteException;

    /**
     * Gets the authentication methods that the specified profiles
     * will be using.
     */
    public iControl.LocalLBProfileAuthenticationMethod[] get_authentication_method(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the names of the authentication configurations that the
     * specified profiles will be using.
     */
    public iControl.LocalLBProfileString[] get_configuration_name(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the sources of the credentials that the specified profiles
     * will be using.
     */
    public iControl.LocalLBProfileCredentialSource[] get_credential_source(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public java.lang.String[] get_default_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the idle timeout for the specified auth profiles.
     */
    public iControl.LocalLBProfileULong[] get_idle_timeout(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets a list of all auth profiles.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the modes for the specified auth profiles.
     */
    public iControl.LocalLBProfileProfileMode[] get_profile_mode(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the names of rules that the specified profiles will be
     * using.
     */
    public iControl.LocalLBProfileString[] get_rule_name(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for the specified Auth profiles.
     */
    public iControl.LocalLBProfileAuthProfileAuthStatistics get_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException;

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
     * Resets the statistics for the specified Auth profiles.
     */
    public void reset_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Sets the authentication methods that the specified profiles
     * will be using.
     */
    public void set_authentication_method(java.lang.String[] profile_names, iControl.LocalLBProfileAuthenticationMethod[] auth_methods) throws java.rmi.RemoteException;

    /**
     * Sets the names of the authentication configurations that the
     * specified profiles will be using.
     */
    public void set_configuration_name(java.lang.String[] profile_names, iControl.LocalLBProfileString[] config_names) throws java.rmi.RemoteException;

    /**
     * Sets the sources of the credentials that the specified profiles
     * will be using.
     */
    public void set_credential_source(java.lang.String[] profile_names, iControl.LocalLBProfileCredentialSource[] sources) throws java.rmi.RemoteException;

    /**
     * Sets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public void set_default_profile(java.lang.String[] profile_names, java.lang.String[] defaults) throws java.rmi.RemoteException;

    /**
     * Sets the idle timeout for the specified auth profiles.
     */
    public void set_idle_timeout(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] timeouts) throws java.rmi.RemoteException;

    /**
     * Sets the modes for the specified auth profiles.
     */
    public void set_profile_mode(java.lang.String[] profile_names, iControl.LocalLBProfileProfileMode[] modes) throws java.rmi.RemoteException;

    /**
     * Sets the names of rules that the specified profiles will be
     * using.
     */
    public void set_rule_name(java.lang.String[] profile_names, iControl.LocalLBProfileString[] rule_names) throws java.rmi.RemoteException;
}
