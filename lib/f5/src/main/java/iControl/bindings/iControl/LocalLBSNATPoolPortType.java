/**
 * LocalLBSNATPoolPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBSNATPoolPortType extends java.rmi.Remote {

    /**
     * Adds members to the specified SNAT pools.
     */
    public void add_member(java.lang.String[] snat_pools, java.lang.String[][] members) throws java.rmi.RemoteException;

    /**
     * Creates the specified SNAT pools.
     */
    public void create(java.lang.String[] snat_pools, java.lang.String[][] translation_addresses) throws java.rmi.RemoteException;

    /**
     * Deletes all SNAT pools.
     */
    public void delete_all_snat_pools() throws java.rmi.RemoteException;

    /**
     * Deletes a specified list of SNAT pools.
     */
    public void delete_snat_pool(java.lang.String[] snat_pools) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for all SNAT pools.
     */
    public iControl.LocalLBSNATPoolSNATPoolStatistics get_all_statistics() throws java.rmi.RemoteException;

    /**
     * Gets a list of all SNAT pools.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the list of members belonging to the specified SNAT pools.
     */
    public java.lang.String[][] get_member(java.lang.String[] snat_pools) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for a list of SNAT pools.
     */
    public iControl.LocalLBSNATPoolSNATPoolStatistics get_statistics(java.lang.String[] snat_pools) throws java.rmi.RemoteException;

    /**
     * Get the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Removes all members from the specified SNAT pools.
     */
    public void remove_all_members(java.lang.String[] snat_pools) throws java.rmi.RemoteException;

    /**
     * Removes members from the specified SNAT pools.
     */
    public void remove_member(java.lang.String[] snat_pools, java.lang.String[][] members) throws java.rmi.RemoteException;

    /**
     * Resets the statistics for a list of SNAT pools.
     */
    public void reset_statistics(java.lang.String[] snat_pools) throws java.rmi.RemoteException;
}
