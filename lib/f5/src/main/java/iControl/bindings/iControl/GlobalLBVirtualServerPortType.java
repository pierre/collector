/**
 * GlobalLBVirtualServerPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface GlobalLBVirtualServerPortType extends java.rmi.Remote {

    /**
     * Adds the virtual servers to the dependency list that the specified
     * virtual servers depend on.
     */
    public void add_dependency(iControl.GlobalLBVirtualServerDefinition[] virtual_servers, iControl.GlobalLBVirtualServerDefinition[][] dependencies) throws java.rmi.RemoteException;

    /**
     * Creates the specified virtual server.
     */
    public void create(iControl.GlobalLBVirtualServerDefinition[] virtual_servers, java.lang.String[] servers) throws java.rmi.RemoteException;

    /**
     * Deletes all virtual servers.
     */
    public void delete_all_virtual_servers() throws java.rmi.RemoteException;

    /**
     * Deletes the specified virtual servers.
     */
    public void delete_virtual_server(iControl.GlobalLBVirtualServerDefinition[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for all the virtual servers.
     */
    public iControl.GlobalLBVirtualServerVirtualServerStatistics get_all_statistics() throws java.rmi.RemoteException;

    /**
     * Gets the list of virtual servers that the specified virtual
     * servers depend on.
     */
    public iControl.GlobalLBVirtualServerDefinition[][] get_dependency(iControl.GlobalLBVirtualServerDefinition[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Gets the enabled states for the specified virtual servers.
     */
    public iControl.CommonEnabledState[] get_enabled_state(iControl.GlobalLBVirtualServerDefinition[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Gets all metrics limits for a sequence of virtual servers.
     */
    public iControl.GlobalLBVirtualServerVirtualServerMetricLimit[] get_limit(iControl.GlobalLBVirtualServerDefinition[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Gets a list of virtual servers.
     */
    public iControl.GlobalLBVirtualServerDefinition[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the monitor associations for the specified virtual servers,
     * i.e. the monitor rules used by the virtual servers.
     */
    public iControl.GlobalLBVirtualServerMonitorAssociation[] get_monitor_association(iControl.GlobalLBVirtualServerDefinition[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Gets the statuses of the specified virtual servers.
     */
    public iControl.CommonObjectStatus[] get_object_status(iControl.GlobalLBVirtualServerDefinition[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Gets a parent links the specified virtual servers belong to.
     */
    public java.lang.String[] get_parent_link(iControl.GlobalLBVirtualServerDefinition[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Gets a list of servers the specified virtual servers belong
     * to.
     */
    public java.lang.String[] get_server(iControl.GlobalLBVirtualServerDefinition[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for the specified virtual servers.
     */
    public iControl.GlobalLBVirtualServerVirtualServerStatistics get_statistics(iControl.GlobalLBVirtualServerDefinition[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Gets the translation IP addresses and ports for the specified
     * virtual servers.
     */
    public iControl.CommonIPPortDefinition[] get_translation(iControl.GlobalLBVirtualServerDefinition[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Removes any and all dependencies of the specified virtual servers.
     */
    public void remove_all_dependencies(iControl.GlobalLBVirtualServerDefinition[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Removes the virtual servers from the dependency list that the
     * specified virtual servers depend on.
     */
    public void remove_dependency(iControl.GlobalLBVirtualServerDefinition[] virtual_servers, iControl.GlobalLBVirtualServerDefinition[][] dependencies) throws java.rmi.RemoteException;

    /**
     * Removes the monitor associations for the specified virtual
     * servers.  This basically deletes the monitor
     *  associations between a virtual server and a monitor rule, i.e. the
     * specified virtual servers will no longer
     *  be monitored.
     */
    public void remove_monitor_association(iControl.GlobalLBVirtualServerDefinition[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Resets the statistics for the specified virtual servers.
     */
    public void reset_statistics(iControl.GlobalLBVirtualServerDefinition[] virtual_servers) throws java.rmi.RemoteException;

    /**
     * Sets the enabled states for the specified virtual servers.
     */
    public void set_enabled_state(iControl.GlobalLBVirtualServerDefinition[] virtual_servers, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the limits for virtual server metrics.
     */
    public void set_limit(iControl.GlobalLBVirtualServerVirtualServerMetricLimit[] limits) throws java.rmi.RemoteException;

    /**
     * Sets/creates the monitor associations for the specified virtual
     * servers. This basically creates the monitor associations
     *  between a virtual server and a monitor rule.
     */
    public void set_monitor_association(iControl.GlobalLBVirtualServerMonitorAssociation[] monitor_associations) throws java.rmi.RemoteException;

    /**
     * Sets the servers the specified virtual servers belong to.
     */
    public void set_server(iControl.GlobalLBVirtualServerDefinition[] virtual_servers, java.lang.String[] servers) throws java.rmi.RemoteException;

    /**
     * Sets the translation IP addresses and ports for the specified
     * virtual servers.
     */
    public void set_translation(iControl.GlobalLBVirtualServerDefinition[] virtual_servers, iControl.CommonIPPortDefinition[] translations) throws java.rmi.RemoteException;
}
