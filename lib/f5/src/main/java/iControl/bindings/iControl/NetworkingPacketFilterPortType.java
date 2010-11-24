/**
 * NetworkingPacketFilterPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingPacketFilterPortType extends java.rmi.Remote {

    /**
     * Creates the specified packet filter rules.
     */
    public void create(java.lang.String[] filters, long[] sort_orders, iControl.NetworkingFilterAction[] actions, java.lang.String[] expressions) throws java.rmi.RemoteException;

    /**
     * Deletes all packet filters.
     */
    public void delete_all_packet_filters() throws java.rmi.RemoteException;

    /**
     * Deletes the specified packet filter rules.
     */
    public void delete_packet_filter(java.lang.String[] filters) throws java.rmi.RemoteException;

    /**
     * Gets the actions of what to do if the ingress traffic matches
     * the filter rules.
     */
    public iControl.NetworkingFilterAction[] get_action(java.lang.String[] filters) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for all the packet filter rules.
     */
    public iControl.NetworkingPacketFilterPacketFilterStatistics get_all_statistics() throws java.rmi.RemoteException;

    /**
     * Gets the expressions used to match ingress traffic. Each expression
     * is defined by the pcap library, which is 
     *  used to implement tcpdump, and is compiled into a Berkeley Packet
     * Filter program.  The man page for tcpdump 
     *  describes the format and valid syntax of the filter rule expression.
     */
    public java.lang.String[] get_expression(java.lang.String[] filters) throws java.rmi.RemoteException;

    /**
     * Gets a list of all packet filter rules.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the states that specify whether an entry will be created
     * in the system log 
     *  each time the rule is matched.
     */
    public iControl.CommonEnabledState[] get_log_state(java.lang.String[] filters) throws java.rmi.RemoteException;

    /**
     * Gets the rate classes that will be used to rate limit the traffic.
     * If the rule has an associated Rate Class name, 
     *  then any traffic allowed by the rule will also be rate limited according
     * to the behavior of the specified rate class. 
     *  It is meaningless to associate a rate class with a rule that has
     * a discard or reject action. Likewise, the rate class 
     *  will only take effect when the traffic actually leaves the system.
     * If the traffic does not leave the system, the rate 
     *  class has no effect.
     */
    public java.lang.String[] get_rate_class(java.lang.String[] filters) throws java.rmi.RemoteException;

    /**
     * Gets the sort orders of the specified filter rules.
     */
    public long[] get_sort_order(java.lang.String[] filters) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for the specified packet filters.
     */
    public iControl.NetworkingPacketFilterPacketFilterStatistics get_statistics(java.lang.String[] filters) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Gets the optional ingress VLANs to match on.
     */
    public java.lang.String[] get_vlan(java.lang.String[] filters) throws java.rmi.RemoteException;

    /**
     * Resets the statistics for the specified packet filters.
     */
    public void reset_statistics(java.lang.String[] filters) throws java.rmi.RemoteException;

    /**
     * Sets the actions of what to do if the ingress traffic matches
     * the filter rules.
     */
    public void set_action(java.lang.String[] filters, iControl.NetworkingFilterAction[] actions) throws java.rmi.RemoteException;

    /**
     * Sets the expressions used to match ingress traffic. Each expression
     * is defined by the pcap library, which is 
     *  used to implement tcpdump, and is compiled into a Berkeley Packet
     * Filter program.  The man page for tcpdump 
     *  describes the format and valid syntax of the filter rule expression.
     */
    public void set_expression(java.lang.String[] filters, java.lang.String[] expressions) throws java.rmi.RemoteException;

    /**
     * Sets the states that specify whether an entry will be created
     * in the system log 
     *  each time the rule is matched.
     */
    public void set_log_state(java.lang.String[] filters, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the rate classes that will be used to rate limit the traffic.
     * If the rule has an associated Rate Class name, 
     *  then any traffic allowed by the rule will also be rate limited according
     * to the behavior of the specified rate class. 
     *  It is meaningless to associate a rate class with a rule that has
     * a discard or reject action. Likewise, the rate class 
     *  will only take effect when the traffic actually leaves the system.
     * If the traffic does not leave the system, the rate 
     *  class has no effect.
     */
    public void set_rate_class(java.lang.String[] filters, java.lang.String[] rate_classes) throws java.rmi.RemoteException;

    /**
     * Sets the sort orders of the specified filter rules.
     */
    public void set_sort_order(java.lang.String[] filters, long[] orders) throws java.rmi.RemoteException;

    /**
     * Sets the optional ingress VLANs to match on.
     */
    public void set_vlan(java.lang.String[] filters, java.lang.String[] vlan_names) throws java.rmi.RemoteException;
}
