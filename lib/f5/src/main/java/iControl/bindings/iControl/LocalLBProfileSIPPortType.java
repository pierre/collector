/**
 * LocalLBProfileSIPPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBProfileSIPPortType extends java.rmi.Remote {

    /**
     * Creates the specified SIP profiles.
     */
    public void create(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Deletes all SIP profiles.
     */
    public void delete_all_profiles() throws java.rmi.RemoteException;

    /**
     * Deletes the specified SIP profiles.
     */
    public void delete_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for all the SIP profiles.
     */
    public iControl.LocalLBProfileSIPProfileSIPStatistics get_all_statistics() throws java.rmi.RemoteException;

    /**
     * Gets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public java.lang.String[] get_default_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets whether the specified SIP profiles are dialog aware.
     */
    public iControl.LocalLBProfileEnabledState[] get_dialog_aware_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the insert Record-Route states for the specified SIP
     *  profiles. If true, insert a Record-Route header field value
     *  into the SIP message.
     */
    public iControl.LocalLBProfileEnabledState[] get_insert_record_route_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the insert Via header states for the specified SIP profiles.
     * If true, insert a Via header into the SIP message.
     */
    public iControl.LocalLBProfileEnabledState[] get_insert_via_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets a list of all SIP profiles.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the maximum SIP message sizes for the specified SIP profiles.
     * This indicates the maximum SIP header size the BIG-IP will accept.
     */
    public iControl.LocalLBProfileULong[] get_max_message_size(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the secure Via states for the specified SIP profiles.
     *  If true, use "TLS" in the sent-protocol portion of an inserted
     *  Via header.
     */
    public iControl.LocalLBProfileEnabledState[] get_secure_via_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the community name for the specified SIP profiles.
     */
    public iControl.LocalLBProfileString[] get_sip_community(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for the specified SIP profiles.
     */
    public iControl.LocalLBProfileSIPProfileSIPStatistics get_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the terminate connection after bye states for the
     *  specified SIP profiles. If true, terminate a connection
     *  after a (200 BYE) message.
     */
    public iControl.LocalLBProfileEnabledState[] get_terminate_connection_after_bye_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Gets the via userdata for the specified SIP profiles.
     */
    public iControl.LocalLBProfileString[] get_via_userdata(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Determines whether the specified profiles are base/pre-configured
     * profiles, or user-defined profiles.
     */
    public boolean[] is_base_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Resets the statistics for the specified SIP profiles.
     */
    public void reset_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Sets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public void set_default_profile(java.lang.String[] profile_names, java.lang.String[] defaults) throws java.rmi.RemoteException;

    /**
     * Sets whether the specified SIP profiles should gather SIP dialog
     * information and automatically forward SIP messages belonging to
     *  known SIP dialogs.
     */
    public void set_dialog_aware_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the insert Record-Route states for the specified SIP
     *  profiles. If true, insert a Record-Route header field value
     *  into the SIP message.
     */
    public void set_insert_record_route_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the insert Via header states for the specified SIP profiles.
     * If true, insert a Via header into the SIP message.
     */
    public void set_insert_via_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the maximum SIP message sizes for the specified SIP profiles.
     * This indicates the maximum SIP header size the BIG-IP will accept.
     */
    public void set_max_message_size(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] max_message_sizes) throws java.rmi.RemoteException;

    /**
     * Sets the secure Via states for the specified SIP profiles.
     *  If true, use "TLS" in the sent-protocol portion of an inserted
     *  Via header.
     */
    public void set_secure_via_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets a community name for the specified SIP profiles.  For
     * "dialog
     *  aware" SIP profiles with multiple SIP virtual server/profile
     *  pairings, this name groups the SIP profiles in the same SIP proxy
     * functional group.
     */
    public void set_sip_community(java.lang.String[] profile_names, iControl.LocalLBProfileString[] community) throws java.rmi.RemoteException;

    /**
     * Sets the terminate connection after bye states for the
     *  specified SIP profiles. If true, terminate a connection
     *  after a (200 BYE) message.
     */
    public void set_terminate_connection_after_bye_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the via userdata for the specified SIP profiles.
     *  If insert via is enabled and this string is not empty, for
     *  a SIP request message the via header will be compiled using
     *  this string.
     */
    public void set_via_userdata(java.lang.String[] profile_names, iControl.LocalLBProfileString[] via_userdata) throws java.rmi.RemoteException;
}
