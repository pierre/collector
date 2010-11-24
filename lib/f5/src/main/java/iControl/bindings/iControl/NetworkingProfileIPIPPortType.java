/**
 * NetworkingProfileIPIPPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingProfileIPIPPortType extends java.rmi.Remote {

    /**
     * Creates a set of IP-IP tunnel profiles.
     */
    public void create(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Deletes all non-system IP-IP tunnel profiles.
     */
    public void delete_all_profiles() throws java.rmi.RemoteException;

    /**
     * Deletes a set of IP-IP tunnel profiles.
     */
    public void delete_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the existing IP-IP tunnel profile from which this set
     * of IP-IP
     *  profiles inherits its unspecified attribute values.
     */
    public java.lang.String[] get_default_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the names for all IP-IP tunnel profiles.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Determines whether a set of IP-IP tunnel profiles are
     *  base/pre-configured (vs user-defined) profiles.
     */
    public boolean[] is_base_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Sets the existing IP-IP tunnel profile from which this set
     * of IP-IP
     *  tunnel profiles inherits their unspecified attribute values.
     */
    public void set_default_profile(java.lang.String[] profile_names, java.lang.String[] defaults) throws java.rmi.RemoteException;
}
