/**
 * LocalLBProfileHttpClassPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBProfileHttpClassPortType extends java.rmi.Remote {

    /**
     * Adds to the lists of patterns used to match the cookies.
     */
    public void add_cookie_match_pattern(java.lang.String[] profile_names, iControl.LocalLBMatchPatternString[][] patterns) throws java.rmi.RemoteException;

    /**
     * Adds to the lists of patterns used to match the headers.
     */
    public void add_header_match_pattern(java.lang.String[] profile_names, iControl.LocalLBMatchPatternString[][] patterns) throws java.rmi.RemoteException;

    /**
     * Adds to the lists of patterns used to match the hosts.
     */
    public void add_host_match_pattern(java.lang.String[] profile_names, iControl.LocalLBMatchPatternString[][] patterns) throws java.rmi.RemoteException;

    /**
     * Adds to the lists of patterns used to match the URI paths.
     */
    public void add_path_match_pattern(java.lang.String[] profile_names, iControl.LocalLBMatchPatternString[][] patterns) throws java.rmi.RemoteException;

    /**
     * Creates the specified HTTP class profiles.
     */
    public void create(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Deletes all HTTP class profiles.
     */
    public void delete_all_profiles() throws java.rmi.RemoteException;

    /**
     * Deletes the specified HTTP class profiles.
     */
    public void delete_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for all the profiles.
     */
    public iControl.LocalLBProfileHttpClassProfileHttpClassStatistics get_all_statistics() throws java.rmi.RemoteException;

    /**
     * Gets the states that specify whether specified classes are
     * Application Security Module classes.
     */
    public iControl.LocalLBProfileEnabledState[] get_application_security_module_enabled_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the lists of patterns used to match the cookies.
     */
    public iControl.LocalLBProfileMatchPatternStringArray[] get_cookie_match_pattern(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public java.lang.String[] get_default_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the lists of patterns used to match the headers.
     */
    public iControl.LocalLBProfileMatchPatternStringArray[] get_header_match_pattern(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the lists of patterns used to match the hosts.
     */
    public iControl.LocalLBProfileMatchPatternStringArray[] get_host_match_pattern(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets a list of all HTTP class profiles.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the lists of patterns used to match the URI paths.
     */
    public iControl.LocalLBProfileMatchPatternStringArray[] get_path_match_pattern(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the pool names to use when the specified classes match.
     */
    public iControl.LocalLBProfileString[] get_pool_name(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the string (which may include a TCL expression) to indicates
     * where to
     *  redirect the original HTTP request once a match occurs.  For example,
     * to redirect
     *  requests to https://myserver.com to http://myotherserver.com.
     */
    public iControl.LocalLBProfileString[] get_redirect_location(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the strings (which may include a TCL expression) with
     * which to rewrite the URLs.
     */
    public iControl.LocalLBProfileString[] get_rewrite_url(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for the specified profiles.
     */
    public iControl.LocalLBProfileHttpClassProfileHttpClassStatistics get_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Gets the states that specify whether specified classes are
     * Web Accelerator classes.
     */
    public iControl.LocalLBProfileEnabledState[] get_web_accelerator_module_enabled_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Determines whether the specified profiles are base/pre-configured
     * profiles, or user-defined profiles.
     */
    public boolean[] is_base_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Removes from the lists of patterns used to match the cookies.
     */
    public void remove_cookie_match_pattern(java.lang.String[] profile_names, iControl.LocalLBMatchPatternString[][] patterns) throws java.rmi.RemoteException;

    /**
     * Removes from the lists of patterns used to match the headers.
     */
    public void remove_header_match_pattern(java.lang.String[] profile_names, iControl.LocalLBMatchPatternString[][] patterns) throws java.rmi.RemoteException;

    /**
     * Removes from the lists of patterns used to match the hosts.
     */
    public void remove_host_match_pattern(java.lang.String[] profile_names, iControl.LocalLBMatchPatternString[][] patterns) throws java.rmi.RemoteException;

    /**
     * Removes from the lists of patterns used to match the URI paths.
     */
    public void remove_path_match_pattern(java.lang.String[] profile_names, iControl.LocalLBMatchPatternString[][] patterns) throws java.rmi.RemoteException;

    /**
     * Resets the statistics for the specified profiles.
     */
    public void reset_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Sets the states that specify whether specified classes are
     * Application Security Module classes.
     */
    public void set_application_security_module_enabled_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Resets the lists to parent defaults.
     */
    public void set_default_cookie_match_pattern(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Resets the lists to parent defaults.
     */
    public void set_default_header_match_pattern(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Resets the lists to parent defaults.
     */
    public void set_default_host_match_pattern(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Resets the lists to parent defaults.
     */
    public void set_default_path_match_pattern(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Sets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public void set_default_profile(java.lang.String[] profile_names, java.lang.String[] defaults) throws java.rmi.RemoteException;

    /**
     * Sets the pool names to use when the specified classes match.
     */
    public void set_pool_name(java.lang.String[] profile_names, iControl.LocalLBProfileString[] pool_names) throws java.rmi.RemoteException;

    /**
     * Sets the string (which may include a TCL expression) to indicates
     * where to
     *  redirect the original HTTP request once a match occurs.  For example,
     * to redirect
     *  requests to https://myserver.com to http://myotherserver.com.
     */
    public void set_redirect_location(java.lang.String[] profile_names, iControl.LocalLBProfileString[] redirect_locations) throws java.rmi.RemoteException;

    /**
     * Sets the strings (which may include a TCL expression) with
     * which to rewrite the URLs.
     */
    public void set_rewrite_url(java.lang.String[] profile_names, iControl.LocalLBProfileString[] urls) throws java.rmi.RemoteException;

    /**
     * Sets the states that specify whether specified classes are
     * Web Accelerator classes.
     */
    public void set_web_accelerator_module_enabled_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;
}
