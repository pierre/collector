/**
 * GlobalLBServerPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface GlobalLBServerPortType extends java.rmi.Remote {

    /**
     * Adds the IP addresses to the specified servers.
     */
    public void add_ip(iControl.GlobalLBServerServerIPDefinition[] ips) throws java.rmi.RemoteException;

    /**
     * Creates the specified servers.
     */
    public void create(iControl.GlobalLBServerServerIPDefinition[] servers, iControl.GlobalLBServerType[] types, java.lang.String[] data_centers) throws java.rmi.RemoteException;

    /**
     * Deletes all servers.
     */
    public void delete_all_servers() throws java.rmi.RemoteException;

    /**
     * Deletes the specified servers.
     */
    public void delete_server(java.lang.String[] servers) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for all the servers.
     */
    public iControl.GlobalLBServerServerStatistics get_all_statistics() throws java.rmi.RemoteException;

    /**
     * Gets the states indicating whether path information gathering
     * is allowed for the specified servers.
     */
    public iControl.CommonEnabledState[] get_allow_path_state(java.lang.String[] servers) throws java.rmi.RemoteException;

    /**
     * Gets the states indicating whether service check is allowed
     * for the specified servers.
     */
    public iControl.CommonEnabledState[] get_allow_service_check_state(java.lang.String[] servers) throws java.rmi.RemoteException;

    /**
     * Gets the states indicating whether SNMP information gathering
     * is allowed for the specified servers.
     */
    public iControl.CommonEnabledState[] get_allow_snmp_state(java.lang.String[] servers) throws java.rmi.RemoteException;

    /**
     * Gets the states indicating whether autoconfig is enabled/disabled.
     * If enabled,
     *  GTM will attempt to gather all virtual servers based on the specified
     * servers.
     */
    public iControl.GlobalLBAutoConfigurationState[] get_auto_configuration_state(java.lang.String[] servers) throws java.rmi.RemoteException;

    /**
     * Gets the data centers that the specified servers belong to.
     */
    public java.lang.String[] get_data_center(java.lang.String[] servers) throws java.rmi.RemoteException;

    /**
     * Gets the enabled states for the specified servers.
     */
    public iControl.CommonEnabledState[] get_enabled_state(java.lang.String[] servers) throws java.rmi.RemoteException;

    /**
     * Gets the IP addresses that belong to the specified servers.
     */
    public iControl.GlobalLBServerServerIPDefinition[] get_ip(java.lang.String[] servers) throws java.rmi.RemoteException;

    /**
     * Gets all metrics limits for a sequence of servers.
     */
    public iControl.GlobalLBServerServerMetricLimit[] get_limit(java.lang.String[] servers) throws java.rmi.RemoteException;

    /**
     * Gets the states indicating whether autoconfig is enabled/disabled.
     * If enabled, GTM will attempt to look up the links's default gateways.
     */
    public iControl.GlobalLBAutoConfigurationState[] get_link_auto_configuration_state(java.lang.String[] servers) throws java.rmi.RemoteException;

    /**
     * Gets a list of servers.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the monitor associations for the specified servers, i.e.
     * the monitor rules used by the servers.
     */
    public iControl.GlobalLBServerMonitorAssociation[] get_monitor_association(java.lang.String[] server_names) throws java.rmi.RemoteException;

    /**
     * Gets the statuses of the specified servers.
     */
    public iControl.CommonObjectStatus[] get_object_status(java.lang.String[] servers) throws java.rmi.RemoteException;

    /**
     * Gets the prober addresses for the specified servers.
     */
    public java.lang.String[] get_prober_address(java.lang.String[] servers) throws java.rmi.RemoteException;

    /**
     * Gets the server types of the specified servers.
     */
    public iControl.GlobalLBServerType[] get_server_type(java.lang.String[] servers) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for the specified servers.
     */
    public iControl.GlobalLBServerServerStatistics get_statistics(java.lang.String[] server_names) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Removes the IP addresses from the specified servers.
     */
    public void remove_ip(iControl.GlobalLBServerServerIPDefinition[] ips) throws java.rmi.RemoteException;

    /**
     * Removes the monitor associations for the specified servers.
     * This basically deletes the monitor
     *  associations between a server and a monitor rule, i.e. the specified
     * servers will no longer
     *  be monitored.
     */
    public void remove_monitor_association(java.lang.String[] server_names) throws java.rmi.RemoteException;

    /**
     * Resets the statistics for the specified servers.
     */
    public void reset_statistics(java.lang.String[] server_names) throws java.rmi.RemoteException;

    /**
     * Sets the states indicating whether path information gathering
     * is allowed for the specified servers.
     */
    public void set_allow_path_state(java.lang.String[] servers, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the states indicating whether service check is allowed
     * for the specified servers.
     */
    public void set_allow_service_check_state(java.lang.String[] servers, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the states indicating whether SNMP information gathering
     * is allowed for the specified servers.
     */
    public void set_allow_snmp_state(java.lang.String[] servers, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the states indicating whether autoconfig is enabled/disabled.
     * If enabled,
     *  GTM will attempt to gather all virtual servers based on the specified
     * servers.
     */
    public void set_auto_configuration_state(java.lang.String[] servers, iControl.GlobalLBAutoConfigurationState[] states) throws java.rmi.RemoteException;

    /**
     * Moves the specified servers to the new data centers.
     */
    public void set_data_center(java.lang.String[] servers, java.lang.String[] data_centers) throws java.rmi.RemoteException;

    /**
     * Sets the enabled states for the specified servers.
     */
    public void set_enabled_state(java.lang.String[] servers, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the limits for server metrics.
     */
    public void set_limit(iControl.GlobalLBServerServerMetricLimit[] limits) throws java.rmi.RemoteException;

    /**
     * Sets the states indicating whether autoconfig is enabled/disabled
     * for the servers' links.
     *  If enabled, GTM will attempt to look up the links's default gateways.
     */
    public void set_link_auto_configuration_state(java.lang.String[] servers, iControl.GlobalLBAutoConfigurationState[] states) throws java.rmi.RemoteException;

    /**
     * Sets/creates the monitor associations for the specified servers.
     * This basically creates the monitor associations
     *  between a server and a monitor rule.
     */
    public void set_monitor_association(iControl.GlobalLBServerMonitorAssociation[] monitor_associations) throws java.rmi.RemoteException;

    /**
     * Sets the prober addresses for the specified servers.
     */
    public void set_prober_address(java.lang.String[] servers, java.lang.String[] addresses) throws java.rmi.RemoteException;

    /**
     * Sets the server types of the specified servers.
     */
    public void set_server_type(java.lang.String[] servers, iControl.GlobalLBServerType[] types) throws java.rmi.RemoteException;
}
