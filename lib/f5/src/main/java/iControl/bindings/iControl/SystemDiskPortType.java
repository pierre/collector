/**
 * SystemDiskPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface SystemDiskPortType extends java.rmi.Remote {

    /**
     * Adds physical disks to a set of logical disk arrays.
     * 
     *  For a clustered system, this must be run on the chassis slot
     *  holding the disk array.
     * 
     *  This only works for logical disks which represent disk arrays.
     */
    public void add_array_member(iControl.SystemDiskLogicalDisk[] disks, java.lang.String[][] serial_numbers) throws java.rmi.RemoteException;

    /**
     * Adds physical disks to a set of logical disk arrays.
     * 
     *  For a clustered system, this must be run on the chassis slot
     *  holding the disk array.
     * 
     *  This only works for logical disks which represent disk arrays.
     * 
     *  This method does exactly the same thing as "add_array_member",
     *  except that the added physical disks are specified by their
     *  LogicalDisk identifiers, more convenient for user input than the
     *  serial numbers used in "remove_array_member".  It is supplied for
     * convenience purposes only.
     */
    public void add_array_member_by_logical_id(iControl.SystemDiskLogicalDisk[] disks, iControl.SystemDiskLogicalDisk[][] names) throws java.rmi.RemoteException;

    /**
     * Gets a list of physical disks that are members of a logical
     * disk.
     * 
     *  Note that this can be used for any type of logical disk -- single
     * disk drives or disk arrays.  However, it may not work for all
     *  physical disk logical identifiers.
     */
    public java.lang.String[][] get_array_member(iControl.SystemDiskLogicalDisk[] disks) throws java.rmi.RemoteException;

    /**
     * Gets RAID disk array statuses for a set of physical disks.
     * 
     *  Note: RAID status will be RAID_STATUS_UNDEFINED if the disk
     *  is not a member of a RAID disk array (see
     *  get_physical_disk_is_array_member).
     */
    public iControl.SystemDiskRAIDStatus[] get_array_status(java.lang.String[] serial_numbers) throws java.rmi.RemoteException;

    /**
     * Gets a list of serial numbers of disks installed for a set
     *  of disk bays.
     */
    public java.lang.String[] get_bay_disk_serial_number(long[] ids) throws java.rmi.RemoteException;

    /**
     * Gets a list of physical disks in the system, identified by
     *  serial number.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets a list of disk bays in the system.
     */
    public long[] get_list_of_bays() throws java.rmi.RemoteException;

    /**
     * Gets a list of logical disks in the system.
     */
    public iControl.SystemDiskLogicalDisk[] get_list_of_logical_disks() throws java.rmi.RemoteException;

    /**
     * Gets device names for a set of logical disks.
     *  These are names like hda, hdb, etc.
     *  (Note: Currently, the strings are for descriptive
     *  purposes and are subject to change).
     */
    public java.lang.String[] get_logical_disk_device_name(iControl.SystemDiskLogicalDisk[] disks) throws java.rmi.RemoteException;

    /**
     * Gets the formats for a set of logical disks.
     *  These are strings like multiboot, lvm, etc.
     *  (Note: Currently, the strings are for descriptive
     *  purposes and are subject to change).
     */
    public java.lang.String[] get_logical_disk_format(iControl.SystemDiskLogicalDisk[] disks) throws java.rmi.RemoteException;

    /**
     * Gets media types for a set of logical disks.
     *  These are strings like hd, cf, cft, etc.
     *  (Note: Currently, the strings are for descriptive
     *  purposes and are subject to change).
     */
    public java.lang.String[] get_logical_disk_media(iControl.SystemDiskLogicalDisk[] disks) throws java.rmi.RemoteException;

    /**
     * Gets sizes (in MiB) for a set of logical disks.
     */
    public long[] get_logical_disk_size(iControl.SystemDiskLogicalDisk[] disks) throws java.rmi.RemoteException;

    /**
     * Gets names for a set of physical disks.  This name is part
     * of the
     *  physical disk's LogicalDisk identifier.
     */
    public java.lang.String[] get_name(java.lang.String[] serial_numbers) throws java.rmi.RemoteException;

    /**
     * Gets slot identifiers for a set of physical disks.  The slot
     * identifier is part of the physical disk's LogicalDisk identifer.
     */
    public long[] get_slot_id(java.lang.String[] serial_numbers) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Gets states indicating whether a disk is a member of a RAID
     * disk
     *  array for a set of physical disks.
     */
    public boolean[] is_array_member(java.lang.String[] serial_numbers) throws java.rmi.RemoteException;

    /**
     * Gets an indication of whether the system is capable of
     *  RAID operations.
     */
    public boolean is_raid_capable() throws java.rmi.RemoteException;

    /**
     * Removes phyiscal disks from a set of logical disk arrays.
     * 
     *  For a clustered system, this must be run on the chassis slot
     *  holding the disk array.
     * 
     *  This only works for logical disks which represent disk arrays.
     */
    public void remove_array_member(iControl.SystemDiskLogicalDisk[] disks, java.lang.String[][] serial_numbers) throws java.rmi.RemoteException;

    /**
     * Removes physical disks from a set of logical disk arrays.
     * 
     *  For a clustered system, this must be run on the chassis slot
     *  holding the disk array.
     * 
     *  This only works for logical disks which represent disk arrays.
     * 
     *  This method does exactly the same thing as "remove_array_member",
     * except that the removed physical disks are specified by their
     *  LogicalDisk identifiers, more convenient for user input than the
     *  serial numbers used in "remove_array_member".  It is supplied for
     * convenience purposes only.
     */
    public void remove_array_member_by_logical_id(iControl.SystemDiskLogicalDisk[] disks, iControl.SystemDiskLogicalDisk[][] names) throws java.rmi.RemoteException;
}
