/**
 * ManagementResourceRecordPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementResourceRecordPortType extends java.rmi.Remote {

    /**
     * Adds DNS "A" Records.
     */
    public void add_a(iControl.ManagementViewZone[] view_zones, iControl.ManagementARecord[][] a_records, boolean[] sync_ptrs) throws java.rmi.RemoteException;

    /**
     * Adds DNS "AAAA" Records.
     */
    public void add_aaaa(iControl.ManagementViewZone[] view_zones, iControl.ManagementAAAARecord[][] aaaa_records, boolean[] sync_ptrs) throws java.rmi.RemoteException;

    /**
     * Adds DNS "CNAME" Records.
     */
    public void add_cname(iControl.ManagementViewZone[] view_zones, iControl.ManagementCNAMERecord[][] cname_records) throws java.rmi.RemoteException;

    /**
     * Adds DNS "DNAME" Records.
     */
    public void add_dname(iControl.ManagementViewZone[] view_zones, iControl.ManagementDNAMERecord[][] dname_records) throws java.rmi.RemoteException;

    /**
     * Adds  DNS "HINFO" Records.
     */
    public void add_hinfo(iControl.ManagementViewZone[] view_zones, iControl.ManagementHINFORecord[][] hinfo_records) throws java.rmi.RemoteException;

    /**
     * Adds DNS "MX" Records.
     */
    public void add_mx(iControl.ManagementViewZone[] view_zones, iControl.ManagementMXRecord[][] mx_records) throws java.rmi.RemoteException;

    /**
     * Adds DNS "NS" Records.
     */
    public void add_ns(iControl.ManagementViewZone[] view_zones, iControl.ManagementNSRecord[][] ns_records) throws java.rmi.RemoteException;

    /**
     * Adds DNS "PTR" Records.
     */
    public void add_ptr(iControl.ManagementViewZone[] view_zones, iControl.ManagementPTRRecord[][] ptr_records) throws java.rmi.RemoteException;

    /**
     * Adds a list of RRS to a view/zone
     */
    public void add_rrs(iControl.ManagementViewZone[] view_zones, iControl.ManagementRRList[] rr_lists, boolean[] sync_ptrs) throws java.rmi.RemoteException;

    /**
     * Adds DNS "SOA" Records.
     */
    public void add_soa(iControl.ManagementViewZone[] view_zones, iControl.ManagementSOARecord[][] soa_records) throws java.rmi.RemoteException;

    /**
     * Adds DNS "SRV" Records.
     */
    public void add_srv(iControl.ManagementViewZone[] view_zones, iControl.ManagementSRVRecord[][] srv_records) throws java.rmi.RemoteException;

    /**
     * Adds DNS "TXT" Records.
     */
    public void add_txt(iControl.ManagementViewZone[] view_zones, iControl.ManagementTXTRecord[][] txt_records) throws java.rmi.RemoteException;

    /**
     * Deletes DNS "A" Records.
     */
    public void delete_a(iControl.ManagementViewZone[] view_zones, iControl.ManagementARecord[][] a_records, boolean[] sync_ptrs) throws java.rmi.RemoteException;

    /**
     * deletes DNS "A6" Records.
     */
    public void delete_a6(iControl.ManagementViewZone[] view_zones, iControl.ManagementA6Record[][] a6_records, boolean[] sync_ptrs) throws java.rmi.RemoteException;

    /**
     * Deletes DNS "AAAA" Records.
     */
    public void delete_aaaa(iControl.ManagementViewZone[] view_zones, iControl.ManagementAAAARecord[][] aaaa_records, boolean[] sync_ptrs) throws java.rmi.RemoteException;

    /**
     * Deletes DNS "CNAME" Records.
     */
    public void delete_cname(iControl.ManagementViewZone[] view_zones, iControl.ManagementCNAMERecord[][] cname_records) throws java.rmi.RemoteException;

    /**
     * Deletes DNS "DNAME" Records.
     */
    public void delete_dname(iControl.ManagementViewZone[] view_zones, iControl.ManagementDNAMERecord[][] dname_records) throws java.rmi.RemoteException;

    /**
     * Deletes DNS "HINFO" Records.
     */
    public void delete_hinfo(iControl.ManagementViewZone[] view_zones, iControl.ManagementHINFORecord[][] hinfo_records) throws java.rmi.RemoteException;

    /**
     * Deletes DNS "KEY" Records.
     */
    public void delete_key(iControl.ManagementViewZone[] view_zones, iControl.ManagementKEYRecord[][] key_records) throws java.rmi.RemoteException;

    /**
     * Deletes DNS "MX" Records.
     */
    public void delete_mx(iControl.ManagementViewZone[] view_zones, iControl.ManagementMXRecord[][] mx_records) throws java.rmi.RemoteException;

    /**
     * Deletes DNS "NS" Records.
     */
    public void delete_ns(iControl.ManagementViewZone[] view_zones, iControl.ManagementNSRecord[][] ns_records) throws java.rmi.RemoteException;

    /**
     * deletes DNS "NXT" Records.
     */
    public void delete_nxt(iControl.ManagementViewZone[] view_zones, iControl.ManagementNXTRecord[][] nxt_records) throws java.rmi.RemoteException;

    /**
     * Deletes DNS "PTR" Records.
     */
    public void delete_ptr(iControl.ManagementViewZone[] view_zones, iControl.ManagementPTRRecord[][] ptr_records) throws java.rmi.RemoteException;

    /**
     * deletes DNS "SIG" Records.
     */
    public void delete_sig(iControl.ManagementViewZone[] view_zones, iControl.ManagementSIGRecord[][] sig_records) throws java.rmi.RemoteException;

    /**
     * Deletes DNS "SOA" Records.
     */
    public void delete_soa(iControl.ManagementViewZone[] view_zones, iControl.ManagementSOARecord[][] soa_records) throws java.rmi.RemoteException;

    /**
     * Deletes DNS "SRV" Records.
     */
    public void delete_srv(iControl.ManagementViewZone[] view_zones, iControl.ManagementSRVRecord[][] srv_records) throws java.rmi.RemoteException;

    /**
     * Deletes DNS "TXT" Records.
     */
    public void delete_txt(iControl.ManagementViewZone[] view_zones, iControl.ManagementTXTRecord[][] txt_records) throws java.rmi.RemoteException;

    /**
     * Gets a list of resource records for a specified view/zone
     */
    public java.lang.String[][] get_rrs(iControl.ManagementViewZone[] view_zones) throws java.rmi.RemoteException;

    /**
     * Gets a list of resource records for the specified view/zone
     * information.
     */
    public iControl.ManagementRRList[] get_rrs_detailed(iControl.ManagementViewZone[] view_zones) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Updates or changes DNS "A" Records.
     */
    public void update_a(iControl.ManagementViewZone[] view_zones, iControl.ManagementARecord[][] old_records, iControl.ManagementARecord[][] new_records, boolean[] sync_ptrs) throws java.rmi.RemoteException;

    /**
     * Updates or changes DNS "AAAA" Records.
     */
    public void update_aaaa(iControl.ManagementViewZone[] view_zones, iControl.ManagementAAAARecord[][] old_records, iControl.ManagementAAAARecord[][] new_records, boolean[] sync_ptrs) throws java.rmi.RemoteException;

    /**
     * Updates or changes DNS "CNAME" Records.
     */
    public void update_cname(iControl.ManagementViewZone[] view_zones, iControl.ManagementCNAMERecord[][] old_records, iControl.ManagementCNAMERecord[][] new_records) throws java.rmi.RemoteException;

    /**
     * Updates or changes DNS "DNAME" Records.
     */
    public void update_dname(iControl.ManagementViewZone[] view_zones, iControl.ManagementDNAMERecord[][] old_records, iControl.ManagementDNAMERecord[][] new_records) throws java.rmi.RemoteException;

    /**
     * Updates or changes DNS "HINFO" Records.
     */
    public void update_hinfo(iControl.ManagementViewZone[] view_zones, iControl.ManagementHINFORecord[][] old_records, iControl.ManagementHINFORecord[][] new_records) throws java.rmi.RemoteException;

    /**
     * Updates or changes DNS "MX" Records.
     */
    public void update_mx(iControl.ManagementViewZone[] view_zones, iControl.ManagementMXRecord[][] old_records, iControl.ManagementMXRecord[][] new_records) throws java.rmi.RemoteException;

    /**
     * Updates or changes DNS "NS" Records.
     */
    public void update_ns(iControl.ManagementViewZone[] view_zones, iControl.ManagementNSRecord[][] old_records, iControl.ManagementNSRecord[][] new_records) throws java.rmi.RemoteException;

    /**
     * Updates or changes DNS "PTR" Records.
     */
    public void update_ptr(iControl.ManagementViewZone[] view_zones, iControl.ManagementPTRRecord[][] old_records, iControl.ManagementPTRRecord[][] new_records) throws java.rmi.RemoteException;

    /**
     * Updates or changes DNS "SOA" Records.
     */
    public void update_soa(iControl.ManagementViewZone[] view_zones, iControl.ManagementSOARecord[][] old_records, iControl.ManagementSOARecord[][] new_records) throws java.rmi.RemoteException;

    /**
     * Updates or changes DNS "SRV" Records.
     */
    public void update_srv(iControl.ManagementViewZone[] view_zones, iControl.ManagementSRVRecord[][] old_records, iControl.ManagementSRVRecord[][] new_records) throws java.rmi.RemoteException;

    /**
     * Updates or changes DNS "TXT" Records.
     */
    public void update_txt(iControl.ManagementViewZone[] view_zones, iControl.ManagementTXTRecord[][] old_records, iControl.ManagementTXTRecord[][] new_records) throws java.rmi.RemoteException;
}
