/**
 * GlobalLBLinkPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface GlobalLBLinkPortType extends java.rmi.Remote {

    /**
     * Adds the cost segments for the specified links.
     */
    public void add_cost_segment(java.lang.String[] links, iControl.GlobalLBLinkLinkCostSegment[][] cost_segments) throws java.rmi.RemoteException;

    /**
     * Adds the IP addresses to the specified links.
     */
    public void add_ip(iControl.GlobalLBLinkLinkIPDefinition[] ips) throws java.rmi.RemoteException;

    /**
     * Creates the specified links.
     */
    public void create(iControl.GlobalLBLinkLinkIPDefinition[] links, java.lang.String[] data_centers) throws java.rmi.RemoteException;

    /**
     * Deletes all links.
     */
    public void delete_all_links() throws java.rmi.RemoteException;

    /**
     * Deletes the specified links.
     */
    public void delete_link(java.lang.String[] links) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for all the links.
     */
    public iControl.GlobalLBLinkLinkStatistics get_all_statistics() throws java.rmi.RemoteException;

    /**
     * Gets the list of cost segments for the specified links.
     */
    public iControl.GlobalLBLinkLinkCostSegment[][] get_cost_segment(java.lang.String[] links) throws java.rmi.RemoteException;

    /**
     * Gets the data centers that the specified links belong to.
     */
    public java.lang.String[] get_data_center(java.lang.String[] links) throws java.rmi.RemoteException;

    /**
     * Gets the states indicating whether the specified links use
     * duplex.
     */
    public iControl.CommonEnabledState[] get_duplex_state(java.lang.String[] links) throws java.rmi.RemoteException;

    /**
     * Gets the enabled state of the specified links.
     */
    public iControl.CommonEnabledState[] get_enabled_state(java.lang.String[] links) throws java.rmi.RemoteException;

    /**
     * Gets the inbound limits for link metrics.
     */
    public iControl.GlobalLBLinkLinkMetricLimit[] get_inbound_limit(java.lang.String[] links) throws java.rmi.RemoteException;

    /**
     * Gets the IP addresses that belong to the specified links.
     */
    public iControl.GlobalLBLinkLinkIPDefinition[] get_ip(java.lang.String[] links) throws java.rmi.RemoteException;

    /**
     * Gets the ISP names for the specified links.
     */
    public java.lang.String[] get_isp_name(java.lang.String[] links) throws java.rmi.RemoteException;

    /**
     * Gets a list of links.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the monitor associations for the specified links, i.e.
     * the monitor rules used by the links.
     */
    public iControl.GlobalLBLinkMonitorAssociation[] get_monitor_association(java.lang.String[] links) throws java.rmi.RemoteException;

    /**
     * Gets the statuses of the specified links.
     */
    public iControl.CommonObjectStatus[] get_object_status(java.lang.String[] links) throws java.rmi.RemoteException;

    /**
     * Gets the outbound limits for link metrics.
     */
    public iControl.GlobalLBLinkLinkMetricLimit[] get_outbound_limit(java.lang.String[] links) throws java.rmi.RemoteException;

    /**
     * Gets the prepaid traffic bandwidth values for the specified
     * links.
     */
    public iControl.CommonULong64[] get_prepaid_traffic(java.lang.String[] links) throws java.rmi.RemoteException;

    /**
     * Gets the ratios used to load-balance the traffic for the specified
     * links.
     */
    public long[] get_ratio(java.lang.String[] links) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for the specified links.
     */
    public iControl.GlobalLBLinkLinkStatistics get_statistics(java.lang.String[] links) throws java.rmi.RemoteException;

    /**
     * Gets the total limits for link metrics.
     */
    public iControl.GlobalLBLinkLinkMetricLimit[] get_total_limit(java.lang.String[] links) throws java.rmi.RemoteException;

    /**
     * Gets the IP addresses on the uplink side of the router, used
     * for SNMP probing only.
     */
    public java.lang.String[] get_uplink_address(java.lang.String[] links) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Gets the weight types for the specified links.
     */
    public iControl.GlobalLBLinkWeightType[] get_weight_type(java.lang.String[] links) throws java.rmi.RemoteException;

    /**
     * Removes any and all cost segment of the specified links.
     */
    public void remove_all_cost_segments(java.lang.String[] links) throws java.rmi.RemoteException;

    /**
     * Removes the cost segments for the specified links.
     */
    public void remove_cost_segment(java.lang.String[] links, iControl.GlobalLBLinkLinkCostSegment[][] cost_segments) throws java.rmi.RemoteException;

    /**
     * Removes the IP addresses from the specified links.
     */
    public void remove_ip(iControl.GlobalLBLinkLinkIPDefinition[] ips) throws java.rmi.RemoteException;

    /**
     * Removes the monitor associations for the specified links. 
     * This basically deletes the monitor
     *  associations between a link and a monitor rule, i.e. the specified
     * links will no longer
     *  be monitored.
     */
    public void remove_monitor_association(java.lang.String[] links) throws java.rmi.RemoteException;

    /**
     * Resets the statistics for the specified links.
     */
    public void reset_statistics(java.lang.String[] links) throws java.rmi.RemoteException;

    /**
     * Moves the specified links to the new data centers.
     */
    public void set_data_center(java.lang.String[] links, java.lang.String[] data_centers) throws java.rmi.RemoteException;

    /**
     * Sets the states indicating whether the specified links use
     * duplex.
     */
    public void set_duplex_state(java.lang.String[] links, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the enabled state of the specified links.
     */
    public void set_enabled_state(java.lang.String[] links, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the inbound limits for link metrics.
     */
    public void set_inbound_limit(iControl.GlobalLBLinkLinkMetricLimit[] limits) throws java.rmi.RemoteException;

    /**
     * Sets the ISP names for the specified links.
     */
    public void set_isp_name(java.lang.String[] links, java.lang.String[] isp_names) throws java.rmi.RemoteException;

    /**
     * Sets/creates the monitor associations for the specified links.
     * This basically creates the monitor associations
     *  between a link and a monitor rule.
     */
    public void set_monitor_association(iControl.GlobalLBLinkMonitorAssociation[] monitor_associations) throws java.rmi.RemoteException;

    /**
     * Sets the outbound limits for link metrics.
     */
    public void set_outbound_limit(iControl.GlobalLBLinkLinkMetricLimit[] limits) throws java.rmi.RemoteException;

    /**
     * Sets the prepaid traffic bandwidth values for the specified
     * links.
     */
    public void set_prepaid_traffic(java.lang.String[] links, iControl.CommonULong64[] prepaids) throws java.rmi.RemoteException;

    /**
     * Sets the ratios used to load-balance the traffic for the specified
     * links.
     */
    public void set_ratio(java.lang.String[] links, long[] ratios) throws java.rmi.RemoteException;

    /**
     * Sets the total limits for link metrics.
     */
    public void set_total_limit(iControl.GlobalLBLinkLinkMetricLimit[] limits) throws java.rmi.RemoteException;

    /**
     * Sets the IP addresses on the uplink side of the router, used
     * for SNMP probing only.
     */
    public void set_uplink_address(java.lang.String[] links, java.lang.String[] uplinks) throws java.rmi.RemoteException;

    /**
     * Sets the weight types for the specified links.
     */
    public void set_weight_type(java.lang.String[] links, iControl.GlobalLBLinkWeightType[] weight_types) throws java.rmi.RemoteException;
}
