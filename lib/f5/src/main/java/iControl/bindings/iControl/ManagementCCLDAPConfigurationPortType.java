/**
 * ManagementCCLDAPConfigurationPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementCCLDAPConfigurationPortType extends java.rmi.Remote {

    /**
     * Adds/associates servers to the specified Client Certificate
     * LDAP configurations.
     */
    public void add_server(java.lang.String[] config_names, java.lang.String[][] servers) throws java.rmi.RemoteException;

    /**
     * Adds/associates lists of valid groups in which the clients
     * must belong in order to be authorized 
     *  (matches against the group key in the group subtree). A client only
     * needs to be a member of 
     *  a single specified group in order to be authorized.
     */
    public void add_valid_group(java.lang.String[] config_names, java.lang.String[][] groups) throws java.rmi.RemoteException;

    /**
     * Adds/associates lists of valid roles that the client must possess
     * in order to be authorized.  
     *  A client only needs to match of a single specified role in order
     * to be authorized.
     */
    public void add_valid_role(java.lang.String[] config_names, java.lang.String[][] roles) throws java.rmi.RemoteException;

    /**
     * Creates the specified Client Certificate LDAP configurations.
     */
    public void create(java.lang.String[] config_names, iControl.ManagementCCLDAPConfigurationLDAPSearchOption[] search_options, java.lang.String[][] servers) throws java.rmi.RemoteException;

    /**
     * Deletes all Client Certificate LDAP configurations.
     */
    public void delete_all_configurations() throws java.rmi.RemoteException;

    /**
     * Deletes the specified Client Certificate LDAP configurations.
     */
    public void delete_configuration(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the admin DNs for the specified Client Certificate LDAP
     * configurations.
     */
    public java.lang.String[] get_admin_distinguished_name(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the admin passwords for the specified Client Certificate
     * LDAP configurations.
     */
    public java.lang.String[] get_admin_password(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the maximum LDAP response cache sizes in bytes. If zero
     * is specified, the cache is not activated.
     */
    public long[] get_cache_size(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the LDAP response cache timeout in seconds. If zero is
     * specified, the cache is not activated.
     */
    public long[] get_cache_timeout(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the search bases for the subtrees used by group searches.
     */
    public java.lang.String[] get_group_base(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the names of the attributes in the LDAP database that
     * identify the group names in the 
     *  group subtrees.
     */
    public java.lang.String[] get_group_key(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the names of the attributes in the LDAP database that
     * identify members (DNs) of a group.  
     *  A typical key would be "member".
     */
    public java.lang.String[] get_group_member_key(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets a list of all Client Certificate LDAP configurations.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the names of the attributes in the LDAP database that
     * identify a user's authorization roles.
     */
    public java.lang.String[] get_role_key(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the search options used by the Client Certificate LDAP
     * configurations.
     */
    public iControl.ManagementCCLDAPConfigurationLDAPSearchOption[] get_search_option(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the lists of servers the specified Client Certificate
     * LDAP configurations are associated with.
     */
    public java.lang.String[][] get_server(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the states indicating whether to use the client certificate's
     * serial number instead of its 
     *  subject (one or the other is always used in conjunction with the
     * certificate issuer) when trying 
     *  to match an entry in the certificate map subtree.
     */
    public iControl.CommonEnabledState[] get_use_certificate_serial_state(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the states indicating whether SSL/TLS should be used when
     * connecting to the LDAP server.
     */
    public iControl.CommonEnabledState[] get_use_security_state(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the user classes (only in certficate search method) for
     * the specified Client Certificate LDAP configurations.
     */
    public java.lang.String[] get_user_class(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the lists of valid groups in which the clients must belong
     * in order to be authorized 
     *  (matches against the group key in the group subtree). A client only
     * needs to be a member of 
     *  a single specified group in order to be authorized.
     */
    public java.lang.String[][] get_valid_group(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the lists of valid roles that the client must possess
     * in order to be authorized.  
     *  A client only needs to match of a single specified role in order
     * to be authorized.
     */
    public java.lang.String[][] get_valid_role(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Removes all lists of valid groups in which the clients must
     * belong in order to be authorized 
     *  (matches against the group key in the group subtree). A client only
     * needs to be a member of 
     *  a single specified group in order to be authorized.
     */
    public void remove_all_valid_groups(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Removes all lists of valid roles that the client must possess
     * in order to be authorized.  
     *  A client only needs to match of a single specified role in order
     * to be authorized.
     */
    public void remove_all_valid_roles(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Removes servers from the specified Client Certificate LDAP
     * configurations.
     */
    public void remove_server(java.lang.String[] config_names, java.lang.String[][] servers) throws java.rmi.RemoteException;

    /**
     * Removes lists of valid groups in which the clients must belong
     * in order to be authorized 
     *  (matches against the group key in the group subtree). A client only
     * needs to be a member of 
     *  a single specified group in order to be authorized.
     */
    public void remove_valid_group(java.lang.String[] config_names, java.lang.String[][] groups) throws java.rmi.RemoteException;

    /**
     * Removes lists of valid roles that the client must possess in
     * order to be authorized.  
     *  A client only needs to match of a single specified role in order
     * to be authorized.
     */
    public void remove_valid_role(java.lang.String[] config_names, java.lang.String[][] roles) throws java.rmi.RemoteException;

    /**
     * Sets the admin DNs for the specified Client Certificate LDAP
     * configurations.
     */
    public void set_admin_distinguished_name(java.lang.String[] config_names, java.lang.String[] admin_dns) throws java.rmi.RemoteException;

    /**
     * Sets the admin passwords for the specified Client Certificate
     * LDAP configurations.
     */
    public void set_admin_password(java.lang.String[] config_names, java.lang.String[] admin_passwords) throws java.rmi.RemoteException;

    /**
     * Sets the maximum LDAP response cache sizes in bytes. If zero
     * is specified, the cache is not activated.
     */
    public void set_cache_size(java.lang.String[] config_names, long[] sizes) throws java.rmi.RemoteException;

    /**
     * Sets the LDAP response cache timeout in seconds. If zero is
     * specified, the cache is not activated.
     */
    public void set_cache_timeout(java.lang.String[] config_names, long[] timeouts) throws java.rmi.RemoteException;

    /**
     * Sets the search bases for the subtrees used by group searches.
     */
    public void set_group_base(java.lang.String[] config_names, java.lang.String[] bases) throws java.rmi.RemoteException;

    /**
     * Sets the names of the attributes in the LDAP database that
     * identify the group names in the 
     *  group subtrees.
     */
    public void set_group_key(java.lang.String[] config_names, java.lang.String[] keys) throws java.rmi.RemoteException;

    /**
     * Sets the names of the attributes in the LDAP database that
     * identify members (DNs) of a group.  
     *  A typical key would be "member".
     */
    public void set_group_member_key(java.lang.String[] config_names, java.lang.String[] keys) throws java.rmi.RemoteException;

    /**
     * Sets the names of the attributes in the LDAP database that
     * identify a user's authorization roles.
     */
    public void set_role_key(java.lang.String[] config_names, java.lang.String[] keys) throws java.rmi.RemoteException;

    /**
     * Sets the search options used by the Client Certificate LDAP
     * configurations.
     */
    public void set_search_option(java.lang.String[] config_names, iControl.ManagementCCLDAPConfigurationLDAPSearchOption[] options) throws java.rmi.RemoteException;

    /**
     * Sets the states indicating whether to use the client certificate's
     * serial number instead of its 
     *  subject (one or the other is always used in conjunction with the
     * certificate issuer) when trying 
     *  to match an entry in the certificate map subtree.
     */
    public void set_use_certificate_serial_state(java.lang.String[] config_names, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the states indicating whether SSL/TLS should be used when
     * connecting to the LDAP server.
     */
    public void set_use_security_state(java.lang.String[] config_names, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the user classes (only in certficate search method) for
     * the specified Client Certificate LDAP configurations.
     */
    public void set_user_class(java.lang.String[] config_names, java.lang.String[] user_classes) throws java.rmi.RemoteException;
}
