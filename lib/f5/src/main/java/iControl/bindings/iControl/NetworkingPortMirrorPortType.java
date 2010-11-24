/**
 * NetworkingPortMirrorPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingPortMirrorPortType extends java.rmi.Remote {

    /**
     * Adds the lists of mirrored-from interfaces to the specified
     * port mirrors (mirrored-to interfaces).
     */
    public void add_interface(java.lang.String[] pmirrors, java.lang.String[][] interfaces) throws java.rmi.RemoteException;

    /**
     * Creates the specified port mirrors (mirrored-to interfaces)
     * from the list of specified interfaces (mirrored-from interfaces).
     */
    public void create(java.lang.String[] pmirrors, java.lang.String[][] interfaces) throws java.rmi.RemoteException;

    /**
     * Deletes all port mirrors (mirrored-to interfaces).
     */
    public void delete_all_port_mirrors() throws java.rmi.RemoteException;

    /**
     * Deletes the specified port mirrors (mirrored-to interfaces).
     */
    public void delete_port_mirror(java.lang.String[] pmirrors) throws java.rmi.RemoteException;

    /**
     * Gets the lists of mirrored-from interfaces associated with
     * the specified port mirrors.
     */
    public java.lang.String[][] get_interface(java.lang.String[] pmirrors) throws java.rmi.RemoteException;

    /**
     * Gets a list of all port mirrors (mirrored-to interfaces) on
     * this device.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Removes all mirrored-from interfaces from the specified port
     * mirrors (mirrored-to interfaces).
     */
    public void remove_all_interfaces(java.lang.String[] pmirrors) throws java.rmi.RemoteException;

    /**
     * Removes the lists of mirrored-from interfaces from the specified
     * port mirrors (mirrored-to interfaces).
     */
    public void remove_interface(java.lang.String[] pmirrors, java.lang.String[][] interfaces) throws java.rmi.RemoteException;
}
