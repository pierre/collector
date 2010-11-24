/**
 * GlobalLBDNSSECZonePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface GlobalLBDNSSECZonePortType extends java.rmi.Remote {

    /**
     * Adds DNSSEC keys to a set of DNSSEC zones.
     */
    public void add_key(java.lang.String[] zones, java.lang.String[][] keys) throws java.rmi.RemoteException;

    /**
     * Creates a set of DNSSEC zones.
     */
    public void create(java.lang.String[] zones, java.lang.String[][] keys) throws java.rmi.RemoteException;

    /**
     * Deletes all DNSSEC zones.
     */
    public void delete_all_zones() throws java.rmi.RemoteException;

    /**
     * Deletes a set of DNSSEC zones.
     */
    public void delete_zone(java.lang.String[] zones) throws java.rmi.RemoteException;

    /**
     * Gets the enabled state for a set of DNSSEC zones.
     */
    public iControl.CommonEnabledState[] get_enabled_state(java.lang.String[] zones) throws java.rmi.RemoteException;

    /**
     * Gets the DNSSEC keys for a set of DNSSEC zones.
     */
    public java.lang.String[][] get_key(java.lang.String[] zones) throws java.rmi.RemoteException;

    /**
     * Gets the names of all DNSSEC zones.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the status of a set of DNSSEC zones.
     */
    public iControl.CommonObjectStatus[] get_object_status(java.lang.String[] zones) throws java.rmi.RemoteException;

    /**
     * Get the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Removes all DNSSEC keys from a set of DNSSEC zones.
     */
    public void remove_all_keys(java.lang.String[] zones) throws java.rmi.RemoteException;

    /**
     * Removes DNSSEC keys from a set of DNSSEC zones.
     */
    public void remove_key(java.lang.String[] zones, java.lang.String[][] keys) throws java.rmi.RemoteException;

    /**
     * Sets the enabled state for a set of DNSSEC zones.
     * 
     *  Note that individual keys can also be enabled and disabled.  See
     *  the DNSSECKey interface for details.
     */
    public void set_enabled_state(java.lang.String[] zones, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;
}
