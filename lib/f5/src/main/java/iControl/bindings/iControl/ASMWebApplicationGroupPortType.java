/**
 * ASMWebApplicationGroupPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ASMWebApplicationGroupPortType extends java.rmi.Remote {

    /**
     * Adds web applications to the specified web application group.
     */
    public void add_webapp(java.lang.String[] group_names, java.lang.String[][] webapp_names) throws java.rmi.RemoteException;

    /**
     * Creates a new web application group.
     */
    public void create(java.lang.String[] group_names) throws java.rmi.RemoteException;

    /**
     * Deletes all web application groups.
     */
    public void delete_all_groups() throws java.rmi.RemoteException;

    /**
     * Deletes the specified web application group.
     */
    public void delete_group(java.lang.String[] group_names) throws java.rmi.RemoteException;

    /**
     * Gets a list of all web application groups.
     */
    public iControl.ASMWebApplicationGroupDefinition[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Returns a list of the web applications associated with the
     * specified web application group.
     */
    public java.lang.String[][] get_webapp_list(iControl.ASMWebApplicationGroupDefinition[] group_names) throws java.rmi.RemoteException;

    /**
     * Removes all web applications from the specified web application
     * group.
     */
    public void remove_all_webapps(java.lang.String[] group_names) throws java.rmi.RemoteException;

    /**
     * Removes web applications from the specified web application
     * group.
     */
    public void remove_webapp(java.lang.String[] group_names, java.lang.String[][] webapp_names) throws java.rmi.RemoteException;
}
