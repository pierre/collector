/**
 * LocalLBProfileDiameterPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBProfileDiameterPortType extends java.rmi.Remote {

    /**
     * Creates the specified Diameter profiles.
     */
    public void create(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Deletes all Diameter profiles.
     */
    public void delete_all_profiles() throws java.rmi.RemoteException;

    /**
     * Deletes the specified Diameter profiles.
     */
    public void delete_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for all the Diameter profiles.
     */
    public iControl.LocalLBProfileDiameterProfileDiameterStatistics get_all_statistics() throws java.rmi.RemoteException;

    /**
     * Gets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public java.lang.String[] get_default_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the realm to which a Diameter message is to be routed,
     * overriding a destination realm present in the message.
     * 
     *  See set_destination_realm for more information.
     */
    public iControl.LocalLBProfileString[] get_destination_realm(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets a list of all Diameter profiles.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the states to indicate whether overwrite destination
     *  host is enabled.
     * 
     *  See set_overwrite_destination_host_state for more information.
     */
    public iControl.LocalLBProfileEnabledState[] get_overwrite_destination_host_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the Diameter Attribute Value Pair (AVP) used to
     *  indicate the parent AVP when the persist AVP is embedded in
     *  a grouped AVP.
     * 
     *  See set_persist_avp for more information on the AVP
     *  specification.
     */
    public iControl.LocalLBProfileString[] get_parent_avp(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the the Diameter Attribute Value Pair (AVP) on which
     *  to persist for each of the profiles given.
     * 
     *  See set_persist_avp for more information on the AVP
     *  specification.
     */
    public iControl.LocalLBProfileString[] get_persist_avp(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for the specified Diameter profiles.
     */
    public iControl.LocalLBProfileDiameterProfileDiameterStatistics get_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException;

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
     * Resets the statistics for the specified Diameter profiles.
     */
    public void reset_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Sets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public void set_default_profile(java.lang.String[] profile_names, java.lang.String[] defaults) throws java.rmi.RemoteException;

    /**
     * Sets the realm to which a Diameter message is to be routed,
     * overriding a destination realm present in the message.
     * 
     *  If a message does not have a destination realm, then this
     *  setting has no effect.
     */
    public void set_destination_realm(java.lang.String[] profile_names, iControl.LocalLBProfileString[] realms) throws java.rmi.RemoteException;

    /**
     * Sets the states to indicate whether overwrite destination
     *  host is enabled.
     * 
     *  If it is enabled, the system will overwrite the
     *  Destination-Host AVP (in a request) with the pool member's
     *  address.
     */
    public void set_overwrite_destination_host_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the Diameter Attribute Value Pair (AVP) used to
     *  indicate the parent AVP when the persist AVP is embedded in
     *  a grouped AVP.
     * 
     *  See set_persist_avp for more information on the AVP
     *  specification.
     */
    public void set_parent_avp(java.lang.String[] profile_names, iControl.LocalLBProfileString[] avps) throws java.rmi.RemoteException;

    /**
     * Sets the Diameter Attribute Value Pair (AVP) on which to
     *  persist for each of the profiles given.
     * 
     *  The AVP specification can be a string or a numeric code
     *  (1-4294967295), encoded as string.  If the string is empty,
     *  or the code does not exist in the traffic coming to the
     *  system, then persist is disabled (if the name is not
     *  recognized, this method will produce an error).  See RFC
     *  3588, section 4.5, for valid base numeric codes.
     * 
     *  Valid names are as follows, in any mix of upper and lower
     *  case: "auth-application-id", "destination-host",
     *  "destination-realm", "origin-host", "origin-realm",
     *  "session-id", "subscription-id", "subscription-id-data".
     */
    public void set_persist_avp(java.lang.String[] profile_names, iControl.LocalLBProfileString[] avps) throws java.rmi.RemoteException;
}
