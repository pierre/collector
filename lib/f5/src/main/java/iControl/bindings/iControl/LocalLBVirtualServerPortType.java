/**
 * LocalLBVirtualServerPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBVirtualServerPortType extends java.rmi.Remote {

    /**
     * Adds/associates authentication profiles to the specified virtual
     * servers.
     */
    public void add_authentication_profile(java.lang.String[] virtual_servers, iControl.LocalLBVirtualServerVirtualServerAuthentication[][] profiles) throws java.rmi.RemoteException;

    /**
     * Adds/associates clone pools to the specified virtual servers.
     */
    public void add_clone_pool(java.lang.String[] virtual_servers, iControl.LocalLBVirtualServerVirtualServerClonePool[][] clone_pools) throws java.rmi.RemoteException;

    /**
     * Adds/associates HTTP class profiles to the specified virtual
     * servers.
     */
    public void add_httpclass_profile(java.lang.String[] virtual_servers, iControl.LocalLBVirtualServerVirtualServerHttpClass[][] profiles) throws java.rmi.RemoteException;

    /**
     * Adds/associates persistence profiles to the specified virtual
     * servers.
     */
    public void add_persistence_profile(java.lang.String[] virtual_servers, iControl.LocalLBVirtualServerVirtualServerPersistence[][] profiles) throws java.rmi.RemoteException;

    /**
     * Adds/associates profiles to the specified virtual servers.
     */
    public void add_profile(java.lang.String[] virtual_servers, iControl.LocalLBVirtualServerVirtualServerProfile[][] profiles) throws java.rmi.RemoteException;

    /**
     * Adds/associates rules to the specified virtual servers.
     */
    public void add_rule(java.lang.String[] virtual_servers, iControl.LocalLBVirtualServerVirtualServerRule[][] rules) throws java.rmi.RemoteException;

    /**
     * Creates or updates virtual servers from the specified resources.
     * Takes additional, optional parameters 
     *  that enable you to override the default optional values.
     */
    public void create(iControl.CommonVirtualServerDefinition[] definitions, java.lang.String[] wildmasks, iControl.LocalLBVirtualServerVirtualServerResource[] resources, iControl.LocalLBVirtualServerVirtualServerProfile[][] profiles) throws java.rmi.RemoteException;

    /**
     * Deletes all virtual servers.
     */
    public void delete_all_virtual_servers() throws java.rmi.RemoteException;

    /**
     * Deletes the persistence records based on the specified persistent
     * modes for the specified virtual servers.
     */
    public void delete_persistence_record(java.lang.String[] virtual_servers, iControl.LocalLBPersistenceMode[] persistence_modes) throws java.rmi.RemoteException;

    /**
     * Deletes the specified virtual servers.
     */
    public void delete_virtual_server(java.lang.String[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Gets the actual hardware acceleration modes for the specified
     * virtual servers.
     */
    public iControl.LocalLBHardwareAccelerationMode[] get_actual_hardware_acceleration(java.lang.String[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for all the virtual servers.
     */
    public iControl.LocalLBVirtualServerVirtualServerStatistics get_all_statistics() throws java.rmi.RemoteException;

    /**
     * Gets the lists of authentication profiles the specified virtual
     * servers are associated with.
     */
    public iControl.LocalLBVirtualServerVirtualServerAuthentication[][] get_authentication_profile(java.lang.String[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Gets the lists of clone pools the specified virtual servers
     * are associated with.
     */
    public iControl.LocalLBVirtualServerVirtualServerClonePool[][] get_clone_pool(java.lang.String[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Gets the CMP enable modes from the specified virtual servers.
     * This is read-only, as the modes are set according to the system and
     * configuration, and influenced by the desired CMP enabled state.
     */
    public iControl.LocalLBVirtualServerVirtualServerCMPEnableMode[] get_cmp_enable_mode(java.lang.String[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Gets the CMP enabled states for the specified virtual servers.
     * Enables or disables CMP.
     *  Note that this setting can influence the CMP enable mode set automatically
     * by the system
     *  and configuration. You can not always enable CMP, but you can always
     * disable it.
     */
    public iControl.CommonEnabledState[] get_cmp_enabled_state(java.lang.String[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Gets the connection limits for the specified virtual servers.
     */
    public iControl.CommonULong64[] get_connection_limit(java.lang.String[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Gets the mirror connection states for the specified virtual
     * servers.
     */
    public iControl.CommonEnabledState[] get_connection_mirror_state(java.lang.String[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Gets the default pool names for the specified virtual servers.
     */
    public java.lang.String[] get_default_pool_name(java.lang.String[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Gets the destination IP and port of the specified virtual servers.
     */
    public iControl.CommonIPPortDefinition[] get_destination(java.lang.String[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Gets the enabled state of the specified virtual server.
     */
    public iControl.CommonEnabledState[] get_enabled_state(java.lang.String[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Gets the persistence profiles to use for fallback persistence
     * for the specified virtual servers.
     */
    public java.lang.String[] get_fallback_persistence_profile(java.lang.String[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Returns the gtm scores for the specified virtual servers.
     */
    public iControl.CommonULong64[] get_gtm_score(java.lang.String[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Gets the lists of HTTP class profiles the specified virtual
     * servers are associated with.
     *  If a specified virtual server is not associated with any HTTP class
     * profile, then the list
     *  of HTTP class profiles for that virtual server will be empty.
     */
    public iControl.LocalLBVirtualServerVirtualServerHttpClass[][] get_httpclass_profile(java.lang.String[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Gets the last hop pools for the specified virtual servers.
     */
    public java.lang.String[] get_last_hop_pool(java.lang.String[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Gets a list of virtual servers.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Returns the module scores for the specified virtual servers.
     */
    public iControl.LocalLBVirtualServerVirtualServerModuleScore[][] get_module_score(java.lang.String[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Gets the status of each of the specified virtual servers.
     */
    public iControl.LocalLBObjectStatus[] get_object_status(java.lang.String[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Gets the lists of persistence profiles the specified virtual
     * servers are associated with.
     */
    public iControl.LocalLBVirtualServerVirtualServerPersistence[][] get_persistence_profile(java.lang.String[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Gets the persistence records based on the specified persistent
     * modes for the specified virtual servers.
     */
    public iControl.LocalLBPersistenceRecord[][] get_persistence_record(java.lang.String[] virtual_servers, iControl.LocalLBPersistenceMode[] persistence_modes) throws java.rmi.RemoteException;

    /**
     * Gets the lists of profiles the specified virtual servers are
     * associated with.
     */
    public iControl.LocalLBVirtualServerVirtualServerProfileAttribute[][] get_profile(java.lang.String[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Gets the protocols supported by the specified virtual servers.
     */
    public iControl.CommonProtocolType[] get_protocol(java.lang.String[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Gets the rate classes that will be used to rate limit the traffic.
     */
    public java.lang.String[] get_rate_class(java.lang.String[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Gets the lists of rules the specified virtual servers are associated
     * with.
     *  If a specified virtual server is not associated with any rule, then
     * the list
     *  of rules for that virtual server will be empty.
     */
    public iControl.LocalLBVirtualServerVirtualServerRule[][] get_rule(java.lang.String[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Gets the SNAT pools to be used in iSNAT configurations for
     * the specified virtual servers.
     */
    public java.lang.String[] get_snat_pool(java.lang.String[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Gets the SNAT type for the specified virtual servers.
     */
    public iControl.LocalLBSnatType[] get_snat_type(java.lang.String[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Gets the source port behavior for the specified virtual servers.
     */
    public iControl.CommonSourcePortBehavior[] get_source_port_behavior(java.lang.String[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for the specified virtual servers.
     */
    public iControl.LocalLBVirtualServerVirtualServerStatistics get_statistics(java.lang.String[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Gets the address translation states for the specified virtual
     * servers.  Enables or disables address translation.
     */
    public iControl.CommonEnabledState[] get_translate_address_state(java.lang.String[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Gets the port translation states for the specified virtual
     * servers.  Enables or disables port translation.
     */
    public iControl.CommonEnabledState[] get_translate_port_state(java.lang.String[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Gets the types of the specified virtual servers.
     */
    public iControl.LocalLBVirtualServerVirtualServerType[] get_type(java.lang.String[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Gets the lists of VLANs on which access to the specified Virtual
     * Servers are enabled/disabled.
     */
    public iControl.CommonVLANFilterList[] get_vlan(java.lang.String[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Gets the wildmasks for the specified virtual servers.
     */
    public java.lang.String[] get_wildmask(java.lang.String[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Removes all authentication profiles from the specified virtual
     * servers.
     */
    public void remove_all_authentication_profiles(java.lang.String[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Removes all clone pools from the specified virtual servers.
     */
    public void remove_all_clone_pools(java.lang.String[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Removes all HTTP class profiles from the specified virtual
     * servers.
     */
    public void remove_all_httpclass_profiles(java.lang.String[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Removes all persistence profiles from the specified virtual
     * servers.
     */
    public void remove_all_persistence_profiles(java.lang.String[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Removes all profiles from the specified virtual servers.
     */
    public void remove_all_profiles(java.lang.String[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Removes all rules from the specified virtual servers.
     */
    public void remove_all_rules(java.lang.String[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Removes authentication profiles from the specified virtual
     * servers.
     */
    public void remove_authentication_profile(java.lang.String[] virtual_servers, iControl.LocalLBVirtualServerVirtualServerAuthentication[][] profiles) throws java.rmi.RemoteException;

    /**
     * Removes clone pools from the specified virtual servers.
     */
    public void remove_clone_pool(java.lang.String[] virtual_servers, iControl.LocalLBVirtualServerVirtualServerClonePool[][] clone_pools) throws java.rmi.RemoteException;

    /**
     * Removes HTTP class profiles from the specified virtual servers.
     */
    public void remove_httpclass_profile(java.lang.String[] virtual_servers, iControl.LocalLBVirtualServerVirtualServerHttpClass[][] profiles) throws java.rmi.RemoteException;

    /**
     * Removes persistence profiles from the specified virtual servers.
     */
    public void remove_persistence_profile(java.lang.String[] virtual_servers, iControl.LocalLBVirtualServerVirtualServerPersistence[][] profiles) throws java.rmi.RemoteException;

    /**
     * Removes profiles from the specified virtual servers.
     */
    public void remove_profile(java.lang.String[] virtual_servers, iControl.LocalLBVirtualServerVirtualServerProfile[][] profiles) throws java.rmi.RemoteException;

    /**
     * Removes rules from the specified virtual servers.
     */
    public void remove_rule(java.lang.String[] virtual_servers, iControl.LocalLBVirtualServerVirtualServerRule[][] rules) throws java.rmi.RemoteException;

    /**
     * Resets the statistics for the specified virtual servers.
     */
    public void reset_statistics(java.lang.String[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Sets the CMP enabled states for the specified virtual servers.
     * Enables or disables CMP.
     *  Note that this setting can influence the CMP enable mode set automatically
     * by the system
     *  and configuration. You can not always enable CMP, but you can always
     * disable it.
     */
    public void set_cmp_enabled_state(java.lang.String[] virtual_servers, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the connection limits of the specified virtual servers.
     */
    public void set_connection_limit(java.lang.String[] virtual_servers, iControl.CommonULong64[] limits) throws java.rmi.RemoteException;

    /**
     * Sets the mirror connection states for the specified virtual
     * servers.
     */
    public void set_connection_mirror_state(java.lang.String[] virtual_servers, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the default pool names for the specified virtual servers.
     */
    public void set_default_pool_name(java.lang.String[] virtual_servers, java.lang.String[] default_pools) throws java.rmi.RemoteException;

    /**
     * Sets the destination IP and port for the specified virtual
     * servers.
     */
    public void set_destination(java.lang.String[] virtual_servers, iControl.CommonIPPortDefinition[] destinations) throws java.rmi.RemoteException;

    /**
     * Sets the enabled state of the specified virtual servers.
     */
    public void set_enabled_state(java.lang.String[] virtual_servers, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the persistence profiles to use for fallback persistence
     * for the specified virtual servers.
     */
    public void set_fallback_persistence_profile(java.lang.String[] virtual_servers, java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Sets the gtm score for the specified virtual servers.
     */
    public void set_gtm_score(java.lang.String[] virtual_servers, iControl.CommonULong64[] scores) throws java.rmi.RemoteException;

    /**
     * Sets the last hop pools for the specified virtual servers.
     */
    public void set_last_hop_pool(java.lang.String[] virtual_servers, java.lang.String[] last_hop_pools) throws java.rmi.RemoteException;

    /**
     * Sets the protocols supported by the specified virtual servers,
     * one of IP, TCP or UDP.
     */
    public void set_protocol(java.lang.String[] virtual_servers, iControl.CommonProtocolType[] protocols) throws java.rmi.RemoteException;

    /**
     * Sets the rate classes that will be used to rate limit the traffic.
     */
    public void set_rate_class(java.lang.String[] virtual_servers, java.lang.String[] rate_classes) throws java.rmi.RemoteException;

    /**
     * Sets the SNAT automap state for the specified virtual servers.
     */
    public void set_snat_automap(java.lang.String[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Sets the state to use no SNATs for the specified virtual servers.
     */
    public void set_snat_none(java.lang.String[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Sets the SNAT pools to be used in iSNAT configurations for
     * the specified virtual servers.
     */
    public void set_snat_pool(java.lang.String[] virtual_servers, java.lang.String[] snatpools) throws java.rmi.RemoteException;

    /**
     * Sets the source port behavior for the specified virtual servers.
     */
    public void set_source_port_behavior(java.lang.String[] virtual_servers, iControl.CommonSourcePortBehavior[] source_port_behaviors) throws java.rmi.RemoteException;

    /**
     * Sets the address translation states for the specified virtual
     * servers.  Enables or disables address translation.
     */
    public void set_translate_address_state(java.lang.String[] virtual_servers, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the port translation states for the specified virtual
     * servers.  Enables or disables port translation.
     */
    public void set_translate_port_state(java.lang.String[] virtual_servers, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the types for the specified virtual servers.
     */
    public void set_type(java.lang.String[] virtual_servers, iControl.LocalLBVirtualServerVirtualServerType[] types) throws java.rmi.RemoteException;

    /**
     * Sets VLANs to the list of VLANs on which access to the specified
     * Virtual Servers are enabled/disabled.
     */
    public void set_vlan(java.lang.String[] virtual_servers, iControl.CommonVLANFilterList[] vlans) throws java.rmi.RemoteException;

    /**
     * Sets the wildmasks for the specified virtual servers.
     */
    public void set_wildmask(java.lang.String[] virtual_servers, java.lang.String[] wildmasks) throws java.rmi.RemoteException;
}
