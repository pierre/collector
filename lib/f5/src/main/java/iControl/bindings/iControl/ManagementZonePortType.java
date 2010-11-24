/**
 * ManagementZonePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementZonePortType extends java.rmi.Remote {

    /**
     * Adds the Zones in the specified views, using the file names
     * specified as 
     *  the contents of the zone files. Files must be local to target machine.
     */
    public void add_zone_file(iControl.ManagementZoneInfo[] zone_records, java.lang.String[] src_file_names, boolean[] sync_ptrs) throws java.rmi.RemoteException;

    /**
     * Adds new options to the specified zones.
     */
    public void add_zone_option(iControl.ManagementZoneInfo[] zones) throws java.rmi.RemoteException;

    /**
     * Adds the Zones in the specified views, using the texts specified
     * as 
     *  the contents of the zone files.
     */
    public void add_zone_text(iControl.ManagementZoneInfo[] zone_records, java.lang.String[][] text, boolean[] sync_ptrs) throws java.rmi.RemoteException;

    /**
     * Deletes the specified Zones in the specified views.
     */
    public void delete_zone(iControl.ManagementViewZone[] view_zones) throws java.rmi.RemoteException;

    /**
     * Deletes existing options of the specified zones
     */
    public void delete_zone_option(iControl.ManagementZoneInfo[] zones) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Gets the ZoneInfo structs for the specified zones in the specified
     * views.
     */
    public iControl.ManagementZoneInfo[] get_zone(iControl.ManagementViewZone[] view_zones) throws java.rmi.RemoteException;

    /**
     * Gets the list of zone names for the specified views.
     */
    public iControl.ManagementViewZone[] get_zone_name(java.lang.String[] view_names) throws java.rmi.RemoteException;

    /**
     * Sets existing options of the specified zones to new values.
     */
    public void set_zone_option(iControl.ManagementZoneInfo[] zones) throws java.rmi.RemoteException;

    /**
     * Transfers the Zones from the specified remote named servers,
     * creating them on the local zrd server, using the specified views and
     * zone info
     *  (type, file name, etc )
     */
    public void transfer_zone(java.lang.String[] server_names, java.lang.String[] src_zone_names, java.lang.String[] dst_view_names, iControl.ManagementZoneInfo[] zone_records) throws java.rmi.RemoteException;

    /**
     * Tests whether the specified zone exists
     */
    public boolean[] zone_exist(iControl.ManagementViewZone[] view_zones) throws java.rmi.RemoteException;
}
