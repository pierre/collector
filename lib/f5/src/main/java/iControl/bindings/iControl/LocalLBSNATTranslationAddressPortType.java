/**
 * LocalLBSNATTranslationAddressPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBSNATTranslationAddressPortType extends java.rmi.Remote {

    /**
     * Creates the specified SNAT translation addresses.
     */
    public void create(java.lang.String[] translation_addresses, long[] unit_ids) throws java.rmi.RemoteException;

    /**
     * Deletes all SNAT translation addresses.
     */
    public void delete_all_translation_addresses() throws java.rmi.RemoteException;

    /**
     * Deletes a specified list of SNAT translation addresses.
     */
    public void delete_translation_address(java.lang.String[] translation_addresses) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for all SNAT translation addresses..
     */
    public iControl.LocalLBSNATTranslationAddressSNATTranslationAddressStatistics get_all_statistics() throws java.rmi.RemoteException;

    /**
     * Gets the ARP states for the specified translation SNAT addresses.
     */
    public iControl.CommonEnabledState[] get_arp_state(java.lang.String[] translation_addresses) throws java.rmi.RemoteException;

    /**
     * Gets the connection limits of the specified original SNAT translation
     * addresses.
     */
    public iControl.CommonULong64[] get_connection_limit(java.lang.String[] translation_addresses) throws java.rmi.RemoteException;

    /**
     * Gets the states of the specified  SNAT translation addresses.
     */
    public iControl.CommonEnabledState[] get_enabled_state(java.lang.String[] translation_addresses) throws java.rmi.RemoteException;

    /**
     * Gets the IP idle timeouts of the specified SNAT translation
     * addresses.
     */
    public long[] get_ip_timeout(java.lang.String[] translation_addresses) throws java.rmi.RemoteException;

    /**
     * Gets a list of all SNAT translation addresses.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the statistics for a list of SNAT translation addresses.
     */
    public iControl.LocalLBSNATTranslationAddressSNATTranslationAddressStatistics get_statistics(java.lang.String[] translation_addresses) throws java.rmi.RemoteException;

    /**
     * Gets the TCP idle timeouts of the specified SNAT translation
     * addresses.
     */
    public long[] get_tcp_timeout(java.lang.String[] translation_addresses) throws java.rmi.RemoteException;

    /**
     * Gets the UDP idle timeouts of the specified SNAT translation
     * addresses.
     */
    public long[] get_udp_timeout(java.lang.String[] translation_addresses) throws java.rmi.RemoteException;

    /**
     * Gets the unit IDs for a specified SNAT translation addresses.
     */
    public long[] get_unit_id(java.lang.String[] translation_addresses) throws java.rmi.RemoteException;

    /**
     * Get the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Resets the statistics for a list of SNAT translation addresses.
     */
    public void reset_statistics(java.lang.String[] translation_addresses) throws java.rmi.RemoteException;

    /**
     * Sets the ARP states for the specified tranlation SNAT addresses.
     */
    public void set_arp_state(java.lang.String[] translation_addresses, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the connection limits of the specified original SNAT translation
     * addresses.
     */
    public void set_connection_limit(java.lang.String[] translation_addresses, iControl.CommonULong64[] limits) throws java.rmi.RemoteException;

    /**
     * Sets the state for a list of SNAT translation addresses.
     */
    public void set_enabled_state(java.lang.String[] translation_addresses, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the IP idle timeouts of the specified SNAT translation
     * addresses.
     */
    public void set_ip_timeout(java.lang.String[] translation_addresses, long[] timeouts) throws java.rmi.RemoteException;

    /**
     * Sets the TCP idle timeouts of the specified SNAT translation
     * addresses.
     */
    public void set_tcp_timeout(java.lang.String[] translation_addresses, long[] timeouts) throws java.rmi.RemoteException;

    /**
     * Sets the UDP idle timeouts of the specified SNAT translation
     * addresses.
     */
    public void set_udp_timeout(java.lang.String[] translation_addresses, long[] timeouts) throws java.rmi.RemoteException;

    /**
     * Sets the unit IDs for the specified tranlation SNAT addresses.
     */
    public void set_unit_id(java.lang.String[] translation_addresses, long[] unit_ids) throws java.rmi.RemoteException;
}
