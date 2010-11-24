/**
 * SystemDisk.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface SystemDisk extends javax.xml.rpc.Service {

/**
 * The Disk interface enables you to manage the disks in the system.
 * 
 *  The disk objects come in two flavors.  "Physical disks" are the actual
 * hardware disk drives, which can be anything from a true hard disk
 * to a
 *  compact flash drive to a USB flash drive.  Physical disks are addressed
 * by their serial numbers.  "Logical disks" are the view of the disk
 * drives from the system's point of view, abstracting the disk itself,
 * making all disk drives look the same whether they are a true hard
 * disk,
 *  a flash drive, or a full disk array.  In other words, a logical disk
 * can hold one or more physical disks.  Logical disks are addressed
 * by
 *  the LogicalDisk identifier, which includes their logical name (e.g.,
 * "HD2", "CF1", "MD1") and their chassis slot identifier.
 * 
 *  It is important to note the potentially confusing relationship between
 * logical and physical disks and their identifiers.  All physical disks
 * can be addressed by a LogicalDisk identifier, though it is not
 *  guaranteed that all physical disks have an entry in the logical disk
 * table.  The logical disk
 *  identifier for a physical disk is dependent on the connection of
 * the
 *  disk drive to the system, so can change if the system's disk drive
 * configuration changes.  On the other hand, all logical disks hold
 * one
 *  or more physical disks, which can have a direct one-to-one mapping
 * for a
 *  single disk drive or a one-to-many mapping for a disk array.  To
 * avoid
 *  problems, physical disks should be ideally addressed only by their
 * serial numbers and logical disks only by their LogicalDisk identifiers.
 * Addressing physical disks by their LogicalDisk identifier is supported
 * as a convenience for any user-generated input.  Be careful with these
 * distinctions as you use this interface.
 */
    public java.lang.String getSystemDiskPortAddress();

    public iControl.SystemDiskPortType getSystemDiskPort() throws javax.xml.rpc.ServiceException;

    public iControl.SystemDiskPortType getSystemDiskPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
