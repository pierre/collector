/**
 * WebAcceleratorApplicationsPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface WebAcceleratorApplicationsPortType extends java.rmi.Remote {

    /**
     * Create a new Application. The strings that describe requested
     * hosts should be one-line and are of the form:
     * 
     *    requested_host(domain=>www.example.com,
     *                   destination_pool=>INTERNAL)
     *  or
     *    requested_host(domain=>www.example.com,
     *                   destination_pool=>INTERNAL,
     *                   http_subdomain_count=>5,
     *                   https_subdomain_count=>5,
     *                   subdomain_prefix=>wa)
     */
    public long create(java.lang.String name, java.lang.String description, java.lang.String local_policy, java.lang.String remote_policy, java.lang.String[] requested_hosts) throws java.rmi.RemoteException;

    /**
     * Delete a list of named Applications.
     */
    public void delete_application(java.lang.String[] applications) throws java.rmi.RemoteException;

    /**
     * Get a list of Applications present on this WebAccelerator.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;
}
