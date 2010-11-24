/**
 * NetworkingProfileWCCPGREPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingProfileWCCPGREPortType extends java.rmi.Remote {

    /**
     * Creates a set of WCCP-GRE tunnel profiles.
     */
    public void create(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Deletes all non-system WCCP-GRE tunnel profiles.
     */
    public void delete_all_profiles() throws java.rmi.RemoteException;

    /**
     * Deletes a set of WCCP-GRE tunnel profiles.
     */
    public void delete_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the existing WCCP-GRE tunnel profile from which this set
     * of
     *  WCCP-GRE profiles inherits its unspecified attribute values.
     */
    public java.lang.String[] get_default_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the forwarding specification for packets leaving a WCCP-GRE
     * tunnel for a set of WCCP-GRE tunnel profiles.
     */
    public iControl.NetworkingProfileWCCPGREProfileWCCPGREForwarding[] get_egress_forwarding(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets whether the checksum should be included in the transmitted
     * packets for a set of WCCP-GRE tunnel profiles.
     */
    public iControl.CommonProfileEnabledState[] get_include_checksum_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the names for all WCCP-GRE tunnel profiles.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets whether the checksum should be validated on the received
     * packets for a set of WCCP-GRE tunnel profiles.
     */
    public iControl.CommonProfileEnabledState[] get_validate_checksum_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Gets the WCCP version currently in use for a set of WCCP-GRE
     * tunnel
     *  profiles.
     */
    public iControl.CommonProfileULong[] get_wccp_version(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Determines whether a set of WCCP-GRE tunnel profiles are
     *  base/pre-configured (vs user-defined) profiles.
     */
    public boolean[] is_base_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Sets the existing WCCP-GRE tunnel profile from which this set
     * of
     *  WCCP-GRE tunnel profiles inherits their unspecified attribute
     *  values.
     */
    public void set_default_profile(java.lang.String[] profile_names, java.lang.String[] defaults) throws java.rmi.RemoteException;

    /**
     * Sets the forwarding specification for packets leaving a WCCP-GRE
     * tunnel for a set of WCCP-GRE tunnel profiles.
     */
    public void set_egress_forwarding(java.lang.String[] profile_names, iControl.NetworkingProfileWCCPGREProfileWCCPGREForwarding[] modes) throws java.rmi.RemoteException;

    /**
     * Sets whether the checksum should be included in the transmitted
     * packets for a set of WCCP-GRE tunnel profiles.
     */
    public void set_include_checksum_state(java.lang.String[] profile_names, iControl.CommonProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets whether the checksum should be validated on the received
     * packets for a set of WCCP-GRE tunnel profiles.
     */
    public void set_validate_checksum_state(java.lang.String[] profile_names, iControl.CommonProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the WCCP version currently in use for a set of WCCP-GRE
     * tunnel
     *  profiles.
     */
    public void set_wccp_version(java.lang.String[] profile_names, iControl.CommonProfileULong[] versions) throws java.rmi.RemoteException;
}
