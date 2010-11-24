/**
 * NetworkingRouteTablePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingRouteTablePortType extends java.rmi.Remote {

    /**
     * Adds the specified management route entries to the route table.
     */
    public void add_management_route(iControl.NetworkingRouteTableRouteDefinition[] routes, iControl.NetworkingRouteTableRouteAttribute[] attributes) throws java.rmi.RemoteException;

    /**
     * Adds the specified static route entries to the route table.
     */
    public void add_static_route(iControl.NetworkingRouteTableRouteDefinition[] routes, iControl.NetworkingRouteTableRouteAttribute[] attributes) throws java.rmi.RemoteException;

    /**
     * Deletes all management route entries from the route table.
     */
    public void delete_all_management_routes() throws java.rmi.RemoteException;

    /**
     * Deletes all static route entries from the route table.
     */
    public void delete_all_static_routes() throws java.rmi.RemoteException;

    /**
     * Deletes the specified management route entries from the route
     * table.
     */
    public void delete_management_route(iControl.NetworkingRouteTableRouteDefinition[] routes) throws java.rmi.RemoteException;

    /**
     * Deletes the specified static route entries from the route table.
     */
    public void delete_static_route(iControl.NetworkingRouteTableRouteDefinition[] routes) throws java.rmi.RemoteException;

    /**
     * Gets the dynamic routes for the specified destination IP addresses.
     */
    public iControl.NetworkingRouteTableDynamicRouteStatistics[] get_dynamic_route(java.lang.String[] destinations) throws java.rmi.RemoteException;

    /**
     * Gets a list of all management route entries.
     */
    public iControl.NetworkingRouteTableRouteDefinition[] get_management_route() throws java.rmi.RemoteException;

    /**
     * Gets the gateways for the specified management routes.
     */
    public java.lang.String[] get_management_route_gateway(iControl.NetworkingRouteTableRouteDefinition[] routes) throws java.rmi.RemoteException;

    /**
     * Gets the MTUs for the specified management routes.
     */
    public long[] get_management_route_mtu(iControl.NetworkingRouteTableRouteDefinition[] routes) throws java.rmi.RemoteException;

    /**
     * Gets the route type for the specified management routes.
     */
    public iControl.NetworkingRouteEntryType[] get_management_route_type(iControl.NetworkingRouteTableRouteDefinition[] routes) throws java.rmi.RemoteException;

    /**
     * Gets the route metric statistics for the specified destination
     * IP addresses.
     */
    public iControl.NetworkingRouteTableRouteTableMetricStatistics[] get_route_table_metric_statistics_for_destination(java.lang.String[] destinations) throws java.rmi.RemoteException;

    /**
     * Gets the route metric statistics for the specified MAC addresses
     * of the gateways.
     */
    public iControl.NetworkingRouteTableRouteTableMetricStatistics[] get_route_table_metric_statistics_for_mac(java.lang.String[] mac_addresses) throws java.rmi.RemoteException;

    /**
     * Gets a list of all static route entries.
     */
    public iControl.NetworkingRouteTableRouteDefinition[] get_static_route() throws java.rmi.RemoteException;

    /**
     * Gets the gateways for the specified static routes.
     */
    public java.lang.String[] get_static_route_gateway(iControl.NetworkingRouteTableRouteDefinition[] routes) throws java.rmi.RemoteException;

    /**
     * Gets the MTUs for the specified static routes.
     */
    public long[] get_static_route_mtu(iControl.NetworkingRouteTableRouteDefinition[] routes) throws java.rmi.RemoteException;

    /**
     * Gets the pool names for the specified static routes. The pool
     * name allow the destination
     *  to select the nexthop router from a pool.
     */
    public java.lang.String[] get_static_route_pool(iControl.NetworkingRouteTableRouteDefinition[] routes) throws java.rmi.RemoteException;

    /**
     * Gets the route type for the specified static routes.
     */
    public iControl.NetworkingRouteEntryType[] get_static_route_type(iControl.NetworkingRouteTableRouteDefinition[] routes) throws java.rmi.RemoteException;

    /**
     * Gets the VLAN names for the specified static routes.
     */
    public java.lang.String[] get_static_route_vlan(iControl.NetworkingRouteTableRouteDefinition[] routes) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Resets or flushes all route metric statistics.
     */
    public void reset_all_route_table_metric_statistics() throws java.rmi.RemoteException;

    /**
     * Sets the gateways for the specified management routes.
     */
    public void set_management_route_gateway(iControl.NetworkingRouteTableRouteDefinition[] routes, java.lang.String[] gateways) throws java.rmi.RemoteException;

    /**
     * Sets the MTUs for the specified management routes.
     */
    public void set_management_route_mtu(iControl.NetworkingRouteTableRouteDefinition[] routes, long[] mtus) throws java.rmi.RemoteException;

    /**
     * Sets the state that rejects all requests for the specified
     * management routes.
     */
    public void set_management_route_reject(iControl.NetworkingRouteTableRouteDefinition[] routes) throws java.rmi.RemoteException;

    /**
     * Sets the gateways for the specified static routes.
     */
    public void set_static_route_gateway(iControl.NetworkingRouteTableRouteDefinition[] routes, java.lang.String[] gateways) throws java.rmi.RemoteException;

    /**
     * Sets the MTUs for the specified static routes.
     */
    public void set_static_route_mtu(iControl.NetworkingRouteTableRouteDefinition[] routes, long[] mtus) throws java.rmi.RemoteException;

    /**
     * Sets the pool names for the specified static routes. The pool
     * name allow the destination
     *  to select the nexthop router from a pool.
     */
    public void set_static_route_pool(iControl.NetworkingRouteTableRouteDefinition[] routes, java.lang.String[] pools) throws java.rmi.RemoteException;

    /**
     * Sets the state that rejects all requests for the specified
     * static routes.
     */
    public void set_static_route_reject(iControl.NetworkingRouteTableRouteDefinition[] routes) throws java.rmi.RemoteException;

    /**
     * Sets the VLAN names for the specified static routes.
     */
    public void set_static_route_vlan(iControl.NetworkingRouteTableRouteDefinition[] routes, java.lang.String[] vlans) throws java.rmi.RemoteException;
}
