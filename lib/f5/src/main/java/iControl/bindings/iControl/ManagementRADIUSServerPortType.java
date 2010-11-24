/**
 * ManagementRADIUSServerPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementRADIUSServerPortType extends java.rmi.Remote {

    /**
     * Creates the specified RADIUS servers.
     */
    public void create(iControl.ManagementRADIUSServerRADIUSServerDefinition[] servers) throws java.rmi.RemoteException;

    /**
     * Deletes all RADIUS servers.
     */
    public void delete_all_servers() throws java.rmi.RemoteException;

    /**
     * Deletes the specified RADIUS servers.
     */
    public void delete_server(java.lang.String[] servers) throws java.rmi.RemoteException;

    /**
     * Gets the IP addresses or hostnames of the RADIUS servers.
     */
    public java.lang.String[] get_ip_or_hostname(java.lang.String[] servers) throws java.rmi.RemoteException;

    /**
     * Gets a list of all RADIUS servers.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the ports of the RADIUS servers.
     */
    public long[] get_port(java.lang.String[] servers) throws java.rmi.RemoteException;

    /**
     * Gets the secrets of the RADIUS servers.
     */
    public java.lang.String[] get_secret(java.lang.String[] servers) throws java.rmi.RemoteException;

    /**
     * Gets the timeouts of the RADIUS servers.
     */
    public long[] get_timeout(java.lang.String[] servers) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Sets the IP addresses or hostnames of the RADIUS servers.
     */
    public void set_ip_or_hostname(java.lang.String[] servers, java.lang.String[] ip_or_hostnames) throws java.rmi.RemoteException;

    /**
     * Sets the ports of the RADIUS servers.
     */
    public void set_port(java.lang.String[] servers, long[] ports) throws java.rmi.RemoteException;

    /**
     * Sets the secrets of the RADIUS servers.
     */
    public void set_secret(java.lang.String[] servers, java.lang.String[] secrets) throws java.rmi.RemoteException;

    /**
     * Sets the timeouts of the RADIUS servers.
     */
    public void set_timeout(java.lang.String[] servers, long[] timeouts) throws java.rmi.RemoteException;
}
