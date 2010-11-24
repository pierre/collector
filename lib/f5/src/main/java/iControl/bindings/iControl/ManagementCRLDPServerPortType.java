/**
 * ManagementCRLDPServerPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementCRLDPServerPortType extends java.rmi.Remote {

    /**
     * Creates the specified CRLDP servers.
     */
    public void create(iControl.ManagementCRLDPServerCRLDPServerDefinition[] servers) throws java.rmi.RemoteException;

    /**
     * Deletes all CRLDP servers.
     */
    public void delete_all_servers() throws java.rmi.RemoteException;

    /**
     * Deletes the specified CRLDP servers.
     */
    public void delete_server(java.lang.String[] servers) throws java.rmi.RemoteException;

    /**
     * Gets the base DNs of the CRLDP servers.
     */
    public java.lang.String[] get_base_dn(java.lang.String[] servers) throws java.rmi.RemoteException;

    /**
     * Gets the hostnames of the CRLDP servers.
     */
    public java.lang.String[] get_hostname(java.lang.String[] servers) throws java.rmi.RemoteException;

    /**
     * Gets a list of all CRLDP servers.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the ports of the CRLDP servers.
     */
    public long[] get_port(java.lang.String[] servers) throws java.rmi.RemoteException;

    /**
     * Gets the states indicating whether to match from head to tail
     * in the case
     *  where the DNs are in reversed order.
     */
    public iControl.CommonEnabledState[] get_reverse_dn_state(java.lang.String[] servers) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Sets the base DNs of the CRLDP servers.
     */
    public void set_base_dn(java.lang.String[] servers, java.lang.String[] base_dns) throws java.rmi.RemoteException;

    /**
     * Sets the hostnames of the CRLDP servers.
     */
    public void set_hostname(java.lang.String[] servers, java.lang.String[] hostnames) throws java.rmi.RemoteException;

    /**
     * Sets the ports of the CRLDP servers.
     */
    public void set_port(java.lang.String[] servers, long[] ports) throws java.rmi.RemoteException;

    /**
     * Sets the states indicating whether to match from head to tail
     * in the case
     *  where the DNs are in reversed order.
     */
    public void set_reverse_dn_state(java.lang.String[] servers, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;
}
