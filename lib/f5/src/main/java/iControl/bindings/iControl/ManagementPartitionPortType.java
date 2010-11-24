/**
 * ManagementPartitionPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementPartitionPortType extends java.rmi.Remote {

    /**
     * Creates the specified AuthZ partitions.
     */
    public void create_partition(iControl.ManagementPartitionAuthZPartition[] partitions) throws java.rmi.RemoteException;

    /**
     * Deletes all AuthZ partitions, except for the "Common" partition.
     */
    public void delete_all_partitions() throws java.rmi.RemoteException;

    /**
     * Deletes the specified AuthZ partitions.
     *  It's recommended that if a partition to be deleted is also the current
     * active partition, the user should change the active partition to something
     * else first (using set_active_partition).  Otherwise, in the event
     * that the 
     *  partition to be deleted is the current active partition, iControl
     * will 
     *  automatically default the new active partition to the "Common" partition.
     */
    public void delete_partition(java.lang.String[] partition_names) throws java.rmi.RemoteException;

    /**
     * Gets the active partition for the current user. The active
     * partition
     *  is the administrative partition where all configuration will take
     * place
     *  until a new active partition is selected. Each user can only be in
     * one
     *  active partition at any given time. By default, if not explicitly
     * set,
     *  the active partition for a user will be "Common".
     */
    public java.lang.String get_active_partition() throws java.rmi.RemoteException;

    /**
     * Gets a list of all AuthZ partitions.
     */
    public iControl.ManagementPartitionAuthZPartition[] get_partition_list() throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Sets the active partition for the current user. The active
     * partition
     *  is the administrative partition where all configuration will take
     * place
     *  until a new active partition is selected. Each user can only be in
     * one
     *  active partition at any given time. By default, if not explicitly
     * set,
     *  the active partition for a user will be "Common".
     */
    public void set_active_partition(java.lang.String active_partition) throws java.rmi.RemoteException;
}
