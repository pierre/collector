/**
 * ManagementLDAPConfigurationPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementLDAPConfigurationPortType extends java.rmi.Remote {

    /**
     * Adds/associates servers to the specified LDAP configurations.
     */
    public void add_server(java.lang.String[] config_names, java.lang.String[][] servers) throws java.rmi.RemoteException;

    /**
     * Creates the specified LDAP configurations.
     */
    public void create(java.lang.String[] config_names, java.lang.String[] search_base_dns, java.lang.String[][] servers) throws java.rmi.RemoteException;

    /**
     * Creates the default authentication Active Directory configuration.
     */
    public void create_default_authentication_ad_configuration(java.lang.String search_base_dn, java.lang.String[] servers) throws java.rmi.RemoteException;

    /**
     * Creates the default authentication LDAP configuration.
     */
    public void create_default_authentication_ldap_configuration(java.lang.String search_base_dn, java.lang.String[] servers) throws java.rmi.RemoteException;

    /**
     * Deletes all LDAP configurations.
     */
    public void delete_all_configurations() throws java.rmi.RemoteException;

    /**
     * Deletes the specified LDAP configurations.
     */
    public void delete_configuration(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the distinguished names used to bind to the servers. Default
     * is to bind anonymously.
     */
    public java.lang.String[] get_bind_distinguished_name(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the credentials used to bind to the servers. Default is
     * to bind with no credentials.
     */
    public java.lang.String[] get_bind_password(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the bind time limits in seconds. This is the time to wait
     * for the bind to complete.
     */
    public long[] get_bind_time_limit(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the states indicating whether to check the 'host' attribute
     * for access control. Default is no; 
     *  if set to yes, and user has no value for the host attribute, and
     * pam_ldap is configured for account 
     *  management (authorization) then the user will not be allowed to login.
     */
    public iControl.CommonEnabledState[] get_check_host_attribute_state(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the states indicating whether syslog debugging is enabled/disabled.
     */
    public iControl.CommonEnabledState[] get_debug_state(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the filter strings used by the specified LDAP configurations.
     */
    public java.lang.String[] get_filter(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the group distinguished names used to enforce membership.
     */
    public java.lang.String[] get_group_distinguished_name(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the group member attributes for the specified LDAP configurations.
     */
    public java.lang.String[] get_group_member_attribute(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the idle time limits in seconds. This client will close
     * connections if the server has not 
     *  been contacted for the number of seconds specified by this value.
     */
    public long[] get_idle_time_limit(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the states indicating whether to ignore errors when authentication
     * information is unavailable.
     */
    public iControl.CommonEnabledState[] get_ignore_unavailable_authentication_information_state(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the LDAP SSL options used by the LDAP configurations.
     */
    public iControl.ManagementLDAPSSLOption[] get_ldap_ssl_option(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the LDAP versions to use by the LDAP configurations.
     */
    public long[] get_ldap_version(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets a list of all LDAP configurations.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the login attributes used by the specified LDAP configurations.
     */
    public java.lang.String[] get_login_attribute(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the ports used by the LDAP servers to listen for requests.
     */
    public long[] get_port(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the distinguished names of the search bases used by the
     * LDAP configurations.
     */
    public java.lang.String[] get_search_base_distinguished_name(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the search scopes used by the LDAP configurations.
     */
    public iControl.ManagementLDAPSearchScope[] get_search_scope(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the search time limits in seconds. This is the time to
     * wait for the search to complete.
     */
    public long[] get_search_time_limit(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the lists of servers the specified LDAP configurations
     * are associated with.
     */
    public java.lang.String[][] get_server(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the CA certificates used in server certificate verification.
     */
    public java.lang.String[] get_ssl_ca_certificate_file(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the states indicating whether to require and verify server
     * certificate.
     */
    public iControl.CommonEnabledState[] get_ssl_check_peer_state(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the SSL cipher suite used by the LDAP configurations.
     */
    public java.lang.String[][] get_ssl_cipher(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the client certificates used by the LDAP configurations.
     */
    public java.lang.String[] get_ssl_client_certificate(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the client keys used by the LDAP configurations.
     */
    public java.lang.String[] get_ssl_client_key(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the user templates used by the specified LDAP configurations.
     */
    public java.lang.String[] get_user_template(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Gets the states indicating whether to enabled/disable warning
     * messages.
     */
    public iControl.CommonEnabledState[] get_warning_state(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Removes servers from the specified LDAP configurations.
     */
    public void remove_server(java.lang.String[] config_names, java.lang.String[][] servers) throws java.rmi.RemoteException;

    /**
     * Sets the distinguished names used to bind to the servers. Default
     * is to bind anonymously.
     */
    public void set_bind_distinguished_name(java.lang.String[] config_names, java.lang.String[] bind_dns) throws java.rmi.RemoteException;

    /**
     * Sets the credentials used to bind to the servers. Default is
     * to bind with no credentials.
     */
    public void set_bind_password(java.lang.String[] config_names, java.lang.String[] bind_passwords) throws java.rmi.RemoteException;

    /**
     * Sets the bind time limits in seconds. This is the time to wait
     * for the bind to complete.
     */
    public void set_bind_time_limit(java.lang.String[] config_names, long[] time_limits) throws java.rmi.RemoteException;

    /**
     * Sets the states indicating whether to check the 'host' attribute
     * for access control. Default is no; 
     *  if set to yes, and user has no value for the host attribute, and
     * pam_ldap is configured for account 
     *  management (authorization) then the user will not be allowed to login.
     */
    public void set_check_host_attribute_state(java.lang.String[] config_names, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the states indicating whether syslog debugging is enabled/disabled.
     */
    public void set_debug_state(java.lang.String[] config_names, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the filter strings used by the specified LDAP configurations.
     */
    public void set_filter(java.lang.String[] config_names, java.lang.String[] filters) throws java.rmi.RemoteException;

    /**
     * Sets the group distinguished names used to enforce membership.
     */
    public void set_group_distinguished_name(java.lang.String[] config_names, java.lang.String[] group_dns) throws java.rmi.RemoteException;

    /**
     * Sets the group member attributes for the specified LDAP configurations.
     */
    public void set_group_member_attribute(java.lang.String[] config_names, java.lang.String[] member_attrs) throws java.rmi.RemoteException;

    /**
     * Sets the idle time limits in seconds. This client will close
     * connections if the server has not 
     *  been contacted for the number of seconds specified by this value.
     */
    public void set_idle_time_limit(java.lang.String[] config_names, long[] time_limits) throws java.rmi.RemoteException;

    /**
     * Sets the states indicating whether to ignore errors when authentication
     * information is unavailable.
     */
    public void set_ignore_unavailable_authentication_information_state(java.lang.String[] config_names, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the LDAP SSL options used by the LDAP configurations.
     */
    public void set_ldap_ssl_option(java.lang.String[] config_names, iControl.ManagementLDAPSSLOption[] options) throws java.rmi.RemoteException;

    /**
     * Sets the LDAP versions to use by the LDAP configurations.
     */
    public void set_ldap_version(java.lang.String[] config_names, long[] versions) throws java.rmi.RemoteException;

    /**
     * Sets the login attributes used by the specified LDAP configurations.
     */
    public void set_login_attribute(java.lang.String[] config_names, java.lang.String[] login_attributes) throws java.rmi.RemoteException;

    /**
     * Sets the ports used by the LDAP servers to listen for requests.
     */
    public void set_port(java.lang.String[] config_names, long[] ports) throws java.rmi.RemoteException;

    /**
     * Sets the distinguished names of the search bases used by the
     * LDAP configurations.
     */
    public void set_search_base_distinguished_name(java.lang.String[] config_names, java.lang.String[] search_base_dns) throws java.rmi.RemoteException;

    /**
     * Sets the search scopes used by the LDAP configurations.
     */
    public void set_search_scope(java.lang.String[] config_names, iControl.ManagementLDAPSearchScope[] search_scopes) throws java.rmi.RemoteException;

    /**
     * Sets the search time limits in seconds. This is the time to
     * wait for the search to complete.
     */
    public void set_search_time_limit(java.lang.String[] config_names, long[] time_limits) throws java.rmi.RemoteException;

    /**
     * Sets the CA certificates used in server certificate verification.
     */
    public void set_ssl_ca_certificate_file(java.lang.String[] config_names, java.lang.String[] ca_cert_files) throws java.rmi.RemoteException;

    /**
     * Sets the states indicating whether to require and verify server
     * certificate.
     */
    public void set_ssl_check_peer_state(java.lang.String[] config_names, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the SSL cipher suite used by the LDAP configurations.
     */
    public void set_ssl_cipher(java.lang.String[] config_names, java.lang.String[][] ciphers) throws java.rmi.RemoteException;

    /**
     * Sets the client certificates used by the LDAP configurations.
     */
    public void set_ssl_client_certificate(java.lang.String[] config_names, java.lang.String[] certificates) throws java.rmi.RemoteException;

    /**
     * Sets the client keys used by the LDAP configurations.
     */
    public void set_ssl_client_key(java.lang.String[] config_names, java.lang.String[] keys) throws java.rmi.RemoteException;

    /**
     * Sets the user templates used by the specified LDAP configurations.
     */
    public void set_user_template(java.lang.String[] config_names, java.lang.String[] templates) throws java.rmi.RemoteException;

    /**
     * Sets the states indicating whether to enabled/disable warning
     * messages.
     */
    public void set_warning_state(java.lang.String[] config_names, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;
}
