/**
 * GlobalLBTopologyPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface GlobalLBTopologyPortType extends java.rmi.Remote {

    /**
     * Adds or creates the specified topology records.
     */
    public void create(iControl.GlobalLBTopologyTopologyRecord[] records, long[] weights, long[] orders) throws java.rmi.RemoteException;

    /**
     * Deletes all topology records.
     */
    public void delete_all_topology_records() throws java.rmi.RemoteException;

    /**
     * Deletes the specified topology records.
     */
    public void delete_topology_record(iControl.GlobalLBTopologyTopologyRecord[] records) throws java.rmi.RemoteException;

    /**
     * Gets a list of of topology records.
     */
    public iControl.GlobalLBTopologyTopologyRecord[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the sort orders for the specified topology records.
     */
    public long[] get_order(iControl.GlobalLBTopologyTopologyRecord[] records) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Gets the weights for the specified links.
     */
    public long[] get_weight(iControl.GlobalLBTopologyTopologyRecord[] records) throws java.rmi.RemoteException;

    /**
     * Sets the sort orders used when longest match sorting is not
     * available for the specified topology records.
     */
    public void set_order(iControl.GlobalLBTopologyTopologyRecord[] records, long[] orders) throws java.rmi.RemoteException;

    /**
     * Sets the weights for the specified topology records.
     */
    public void set_weight(iControl.GlobalLBTopologyTopologyRecord[] records, long[] weights) throws java.rmi.RemoteException;
}
