/**
 * GlobalLBDataCenterPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface GlobalLBDataCenterPortType extends java.rmi.Remote {

    /**
     * Creates the specified data centers.
     */
    public void create(iControl.GlobalLBDataCenterDataCenterAttribute[] data_centers) throws java.rmi.RemoteException;

    /**
     * Deletes all data centers.
     */
    public void delete_all_data_centers() throws java.rmi.RemoteException;

    /**
     * Deletes the specified data centers.
     */
    public void delete_data_center(java.lang.String[] data_centers) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for all the data centers.
     */
    public iControl.GlobalLBDataCenterDataCenterStatistics get_all_statistics() throws java.rmi.RemoteException;

    /**
     * Gets contact information for the specified data centers.
     */
    public java.lang.String[] get_contact_information(java.lang.String[] data_centers) throws java.rmi.RemoteException;

    /**
     * Gets the enabled state of the specified data centers.
     */
    public iControl.CommonEnabledState[] get_enabled_state(java.lang.String[] data_centers) throws java.rmi.RemoteException;

    /**
     * Gets a list of links of the specified data centers.
     */
    public iControl.GlobalLBDataCenterDataCenterLinkDefinition[] get_link(java.lang.String[] data_centers) throws java.rmi.RemoteException;

    /**
     * Gets a list of data centers.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets location information for the specified data centers.
     */
    public java.lang.String[] get_location_information(java.lang.String[] data_centers) throws java.rmi.RemoteException;

    /**
     * Gets the statuses of the specified data centers.
     */
    public iControl.CommonObjectStatus[] get_object_status(java.lang.String[] data_centers) throws java.rmi.RemoteException;

    /**
     * Gets a list of servers of the specified data centers.
     */
    public iControl.GlobalLBDataCenterDataCenterServerDefinition[] get_server(java.lang.String[] data_centers) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for the specified data centers.
     */
    public iControl.GlobalLBDataCenterDataCenterStatistics get_statistics(java.lang.String[] data_centers) throws java.rmi.RemoteException;

    /**
     * Get the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Resets the statistics for the specified data centers.
     */
    public void reset_statistics(java.lang.String[] data_centers) throws java.rmi.RemoteException;

    /**
     * Sets contact information for the specified data centers.
     */
    public void set_contact_information(java.lang.String[] data_centers, java.lang.String[] contacts) throws java.rmi.RemoteException;

    /**
     * Sets the enabled state of the specified data centers.
     */
    public void set_enabled_state(java.lang.String[] data_centers, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets location information for the specified data centers.
     */
    public void set_location_information(java.lang.String[] data_centers, java.lang.String[] locations) throws java.rmi.RemoteException;
}
