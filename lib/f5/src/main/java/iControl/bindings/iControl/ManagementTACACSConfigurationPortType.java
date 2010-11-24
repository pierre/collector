/**
 * ManagementTACACSConfigurationPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementTACACSConfigurationPortType extends java.rmi.Remote {

    /**
     * Adds/associates servers to the specified TACACS configurations.
     */
    public void add_server(java.lang.String[] config_names, java.lang.String[][] servers) throws java.rmi.RemoteException;

    /**
     * Creates the specified TACACS configurations.
     */
    public void create(java.lang.String[] config_names, java.lang.String[] secrets, java.lang.String[] service_names, java.lang.String[] protocol_names, java.lang.String[][] servers) throws java.rmi.RemoteException;

    /**
     * Deletes all TACACS configurations.
     */
    public void delete_all_configurations() throws java.rmi.RemoteException;

    /**
     * Deletes the specified TACACS configurations.
     */
    public void delete_configuration(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the states such that if enabled and if multiple servers
     * are defined, send accounting 
     *  start/stop packets to all servers (if session accounting has been
     * enabled in the PAM service 
     *  configuration).
     */
    public iControl.CommonEnabledState[] get_accounting_to_all_state(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the states indicating whether syslog debugging is enabled/disabled.
     */
    public iControl.CommonEnabledState[] get_debug_state(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the states indicating whether encryption on TACACS+ packets
     * is enabled/disabled.
     */
    public iControl.CommonEnabledState[] get_encryption_state(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the states such that if enabled and if multiple servers
     * are defined, try to authenticate the 
     *  user on all servers until the first authentication succeeds, or until
     * all servers have been queried.  
     *  The first success response results in the auth succeeding.
     */
    public iControl.CommonEnabledState[] get_first_hit_state(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets a list of all TACACS configurations.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the names of the TACACS+ servers' listening protocols
     * used by the configurations.
     */
    public java.lang.String[] get_protocol_name(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the secret keys used to encrypt/decrypt packets sent/received
     * from the server.
     */
    public java.lang.String[] get_secret(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the lists of servers the specified TACACS configurations
     * are associated with.
     */
    public java.lang.String[][] get_server(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the names of the TACACS+ servers' listening services used
     * by the configurations.
     */
    public java.lang.String[] get_service_name(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Removes servers from the specified TACACS configurations.
     */
    public void remove_server(java.lang.String[] config_names, java.lang.String[][] servers) throws java.rmi.RemoteException;

    /**
     * Sets the states such that if enabled and if multiple servers
     * are defined, send accounting 
     *  start/stop packets to all servers (if session accounting has been
     * enabled in the PAM service 
     *  configuration).
     */
    public void set_accounting_to_all_state(java.lang.String[] config_names, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the states indicating whether syslog debugging is enabled/disabled.
     */
    public void set_debug_state(java.lang.String[] config_names, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the states indicating whether encryption on TACACS+ packets
     * is enabled/disabled.
     */
    public void set_encryption_state(java.lang.String[] config_names, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the states such that if enabled and if multiple servers
     * are defined, try to authenticate the 
     *  user on all servers until the first authentication succeeds, or until
     * all servers have been queried.  
     *  The first success response results in the auth succeeding.
     */
    public void set_first_hit_state(java.lang.String[] config_names, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the names of the TACACS+ servers' listening protocols
     * used by the configurations.
     */
    public void set_protocol_name(java.lang.String[] config_names, java.lang.String[] protocol_names) throws java.rmi.RemoteException;

    /**
     * Sets the secret keys used to encrypt/decrypt packets sent/received
     * from the server.
     */
    public void set_secret(java.lang.String[] config_names, java.lang.String[] secrets) throws java.rmi.RemoteException;

    /**
     * Sets the names of the TACACS+ servers' listening services used
     * by the configurations.
     */
    public void set_service_name(java.lang.String[] config_names, java.lang.String[] service_names) throws java.rmi.RemoteException;
}
