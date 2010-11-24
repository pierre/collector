/**
 * ManagementRADIUSConfigurationPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementRADIUSConfigurationPortType extends java.rmi.Remote {

    /**
     * Adds/associates servers to the specified RADIUS configurations.
     */
    public void add_server(java.lang.String[] config_names, java.lang.String[][] servers) throws java.rmi.RemoteException;

    /**
     * Creates the specified RADIUS configurations.
     */
    public void create(java.lang.String[] config_names, java.lang.String[][] servers) throws java.rmi.RemoteException;

    /**
     * Creates the default authentication RADIUS configuration.
     */
    public void create_default_authentication_radius_configuration(java.lang.String[] servers) throws java.rmi.RemoteException;

    /**
     * Deletes all RADIUS configurations.
     */
    public void delete_all_configurations() throws java.rmi.RemoteException;

    /**
     * Deletes the specified RADIUS configurations.
     */
    public void delete_configuration(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the states indicating whether to enable/disable validation
     * of the accounting response vector.
     *  This option should only be set necessary for older servers, i.e.
     * Livingston 1.16.
     */
    public iControl.CommonEnabledState[] get_accounting_validation_state(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the the NAS-Identifier RADIUS attribute with client_ids.
     * If the client_id option is not specified, 
     *  the PAM service type is used instead.  This feature may be disabled
     * by using empty strings for client_ids.
     */
    public java.lang.String[] get_client_id(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the states indicating whether syslog debugging is enabled/disabled.
     */
    public iControl.CommonEnabledState[] get_debug_state(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets a list of all RADIUS configurations.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the number of attempts to communicate with the server
     * before concluding that
     *  the server has failed.
     */
    public long[] get_retry(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the lists of servers the specified RADIUS configurations
     * are associated with.
     */
    public java.lang.String[][] get_server(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Removes all servers from the specified RADIUS configurations.
     */
    public void remove_all_servers(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Removes servers from the specified RADIUS configurations.
     */
    public void remove_server(java.lang.String[] config_names, java.lang.String[][] servers) throws java.rmi.RemoteException;

    /**
     * Sets the states indicating whether to enable/disable validation
     * of the accounting response vector.
     *  This option should only be set necessary for older servers, i.e.
     * Livingston 1.16.
     */
    public void set_accounting_validation_state(java.lang.String[] config_names, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the NAS-Identifier RADIUS attribute with client_ids. 
     * If the client_id option is not specified, 
     *  the PAM service type is used instead.  This feature may be disabled
     * by using empty strings for client_ids.
     */
    public void set_client_id(java.lang.String[] config_names, java.lang.String[] client_ids) throws java.rmi.RemoteException;

    /**
     * Sets the states indicating whether syslog debugging is enabled/disabled.
     */
    public void set_debug_state(java.lang.String[] config_names, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the number of attempts to communicate with the server
     * before concluding that
     *  the server has failed.
     */
    public void set_retry(java.lang.String[] config_names, long[] retries) throws java.rmi.RemoteException;
}
