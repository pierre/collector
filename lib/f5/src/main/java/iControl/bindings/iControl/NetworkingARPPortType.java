/**
 * NetworkingARPPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingARPPortType extends java.rmi.Remote {

    /**
     * Creates/adds the specified static ARP/NDP entries to the ARP/NDP
     * table.
     */
    public void add_static_entry(iControl.NetworkingARPStaticEntry[] entries) throws java.rmi.RemoteException;

    /**
     * Deletes all dynamic ARP entries from the ARP table.
     */
    public void delete_all_dynamic_arps() throws java.rmi.RemoteException;

    /**
     * Deletes all dynamic NDP entries from the NDP table.
     */
    public void delete_all_dynamic_ndps() throws java.rmi.RemoteException;

    /**
     * Deletes all static ARP/NDP entries from the ARP/NDP table.
     */
    public void delete_all_static_entries() throws java.rmi.RemoteException;

    /**
     * Deletes the specified static ARP/NDP entries from the ARP/NDP
     * table.
     */
    public void delete_static_entry(iControl.NetworkingARPStaticEntry[] entries) throws java.rmi.RemoteException;

    /**
     * Gets the dynamic ARP statistics for the specified ARP addresses.
     */
    public iControl.NetworkingARPARPStatistics get_dynamic_arp(java.lang.String[] arp_addresses) throws java.rmi.RemoteException;

    /**
     * Gets the dynamic NDP statistics for the specified NDP addresses.
     */
    public iControl.NetworkingARPNDPStatistics get_dynamic_ndp(java.lang.String[] ndp_addresses) throws java.rmi.RemoteException;

    /**
     * Gets a list of all static ARP/NDP entries.
     */
    public iControl.NetworkingARPStaticEntry[] get_static_entry() throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;
}
