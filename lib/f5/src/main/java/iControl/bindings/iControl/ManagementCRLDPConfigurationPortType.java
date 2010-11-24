/**
 * ManagementCRLDPConfigurationPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementCRLDPConfigurationPortType extends java.rmi.Remote {

    /**
     * Adds/associates servers to the specified CRLDP configurations.
     */
    public void add_server(java.lang.String[] config_names, java.lang.String[][] servers) throws java.rmi.RemoteException;

    /**
     * Creates the specified CRLDP configurations.
     */
    public void create(java.lang.String[] config_names, java.lang.String[][] servers) throws java.rmi.RemoteException;

    /**
     * Deletes all CRLDP configurations.
     */
    public void delete_all_configurations() throws java.rmi.RemoteException;

    /**
     * Deletes the specified CRLDP configurations.
     */
    public void delete_configuration(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the number of seconds before a CRL entry expires and
     *  is deleted from the CRL cache.
     */
    public long[] get_cache_timeout(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the number of seconds to wait for server's response before
     * concluding that
     *  the server is down.
     */
    public long[] get_connection_timeout(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets a list of all CRLDP configurations.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the lists of servers the specified CRLDP configurations
     * are associated with.
     */
    public java.lang.String[][] get_server(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the number of seconds to wait between updates.
     */
    public long[] get_update_interval(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the states indicating whether reuse the issuer.
     */
    public iControl.CommonEnabledState[] get_use_issuer_state(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Removes all servers from the specified CRLDP configurations.
     */
    public void remove_all_servers(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Removes servers from the specified CRLDP configurations.
     */
    public void remove_server(java.lang.String[] config_names, java.lang.String[][] servers) throws java.rmi.RemoteException;

    /**
     * Sets the number of seconds before a CRL entry expires and
     *  is deleted from the CRL cache.
     */
    public void set_cache_timeout(java.lang.String[] config_names, long[] timeouts) throws java.rmi.RemoteException;

    /**
     * Sets the number of seconds to wait for server's response before
     * concluding that
     *  the server is down.
     */
    public void set_connection_timeout(java.lang.String[] config_names, long[] timeouts) throws java.rmi.RemoteException;

    /**
     * Sets the number of seconds to wait between updates.
     */
    public void set_update_interval(java.lang.String[] config_names, long[] intervals) throws java.rmi.RemoteException;

    /**
     * Sets the states indicating whether to reuse the issuer.
     */
    public void set_use_issuer_state(java.lang.String[] config_names, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;
}
