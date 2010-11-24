/**
 * ManagementViewPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementViewPortType extends java.rmi.Remote {

    /**
     * Adds the specified Views to the server.
     */
    public void add_view(iControl.ManagementViewInfo[] views) throws java.rmi.RemoteException;

    /**
     * Adds new options to the views.
     */
    public void add_view_option(iControl.ManagementViewInfo[] view_infos) throws java.rmi.RemoteException;

    /**
     * Delete the specified views (and all their zones) from a server.
     */
    public void delete_view(iControl.ManagementViewInfo[] views) throws java.rmi.RemoteException;

    /**
     * Deletes the options from the views.
     */
    public void delete_view_option(iControl.ManagementViewInfo[] view_infos) throws java.rmi.RemoteException;

    /**
     * Get a sequence of ViewInfo structs from the server
     */
    public iControl.ManagementViewInfo[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Get the ViewInfo structs from the server for the specified
     * views.
     */
    public iControl.ManagementViewInfo[] get_view(java.lang.String[] view_names) throws java.rmi.RemoteException;

    /**
     * Moves the specified Views to the spot indicated in the named.conf
     */
    public void move_view(iControl.ManagementViewInfo[] views) throws java.rmi.RemoteException;

    /**
     * Sets (changes) the values of existing options of the views
     * specified.
     */
    public void set_view_option(iControl.ManagementViewInfo[] view_infos) throws java.rmi.RemoteException;
}
