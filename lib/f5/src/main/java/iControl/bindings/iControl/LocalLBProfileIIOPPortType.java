/**
 * LocalLBProfileIIOPPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBProfileIIOPPortType extends java.rmi.Remote {

    /**
     * Creates the specified IIOP profiles.
     */
    public void create(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Deletes all IIOP profiles.
     */
    public void delete_all_profiles() throws java.rmi.RemoteException;

    /**
     * Deletes the specified IIOP profiles.
     */
    public void delete_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the state that if true, abort the connection when response
     * is timed out.
     */
    public iControl.LocalLBProfileEnabledState[] get_abort_on_timeout_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for all the IIOP profiles.
     */
    public iControl.LocalLBProfileIIOPProfileIIOPStatistics get_all_statistics() throws java.rmi.RemoteException;

    /**
     * Gets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public java.lang.String[] get_default_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets a list of all IIOP profiles.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the state that if true, persist the object key.
     */
    public iControl.LocalLBProfileEnabledState[] get_persist_object_key_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the state that if true, persist the request ID.
     */
    public iControl.LocalLBProfileEnabledState[] get_persist_request_id_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the response timeouts for the specified IIOP profiles.
     */
    public iControl.LocalLBProfileULong[] get_response_timeout(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for the specified IIOP profiles.
     */
    public iControl.LocalLBProfileIIOPProfileIIOPStatistics get_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException;

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
     * Resets the statistics for the specified IIOP profiles.
     */
    public void reset_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Sets the state that if true, abort the connection when response
     * is timed out.
     */
    public void set_abort_on_timeout_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public void set_default_profile(java.lang.String[] profile_names, java.lang.String[] defaults) throws java.rmi.RemoteException;

    /**
     * Sets the state that if true, persist the object key.
     */
    public void set_persist_object_key_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the state that if true, persist the request ID.
     */
    public void set_persist_request_id_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the response timeouts for the specified IIOP profiles.
     */
    public void set_response_timeout(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] timeouts) throws java.rmi.RemoteException;
}
