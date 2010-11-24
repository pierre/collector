/**
 * GlobalLBWideIPPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface GlobalLBWideIPPortType extends java.rmi.Remote {

    /**
     * Adds/associates aliases to the specified wide IPs.
     *  A given wide IP can have more than one alias.
     */
    public void add_alias(java.lang.String[] wide_ips, java.lang.String[][] aliases) throws java.rmi.RemoteException;

    /**
     * Adds/associates wide IP pools to the specified wide IPs.
     */
    public void add_wideip_pool(java.lang.String[] wide_ips, iControl.GlobalLBWideIPWideIPPool[][] wideip_pools) throws java.rmi.RemoteException;

    /**
     * Adds/associates wide IP rules to the specified wide IPs.
     */
    public void add_wideip_rule(java.lang.String[] wide_ips, iControl.GlobalLBWideIPWideIPRule[][] wideip_rules) throws java.rmi.RemoteException;

    /**
     * Creates the specified wide IPs with some basic attributes.
     */
    public void create(java.lang.String[] wide_ips, iControl.GlobalLBLBMethod[] lb_methods, iControl.GlobalLBWideIPWideIPPool[][] wideip_pools, iControl.GlobalLBWideIPWideIPRule[][] wideip_rules) throws java.rmi.RemoteException;

    /**
     * Deletes all wide IPs.
     */
    public void delete_all_wideips() throws java.rmi.RemoteException;

    /**
     * Deletes the specified wide IPs.
     */
    public void delete_wideip(java.lang.String[] wide_ips) throws java.rmi.RemoteException;

    /**
     * Gets the lists of aliases the specified wide IPs are associated
     * with.
     *  A given wide IP can have more than one alias.
     */
    public java.lang.String[][] get_alias(java.lang.String[] wide_ips) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for all the wide IPs.
     */
    public iControl.GlobalLBWideIPWideIPStatistics get_all_statistics() throws java.rmi.RemoteException;

    /**
     * Gets the names of the applications for the specified wide IPs.
     */
    public java.lang.String[] get_application(java.lang.String[] wide_ips) throws java.rmi.RemoteException;

    /**
     * Gets the enabled states for the specified wide IPs.
     */
    public iControl.CommonEnabledState[] get_enabled_state(java.lang.String[] wide_ips) throws java.rmi.RemoteException;

    /**
     * Gets the names of the last resort pools for the specified wide
     * IPs.
     */
    public java.lang.String[] get_last_resort_pool(java.lang.String[] wide_ips) throws java.rmi.RemoteException;

    /**
     * Gets the load balancing methods for the specified wide IPs.
     */
    public iControl.GlobalLBLBMethod[] get_lb_method(java.lang.String[] wide_ips) throws java.rmi.RemoteException;

    /**
     * Gets a list of wide IPs.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the statuses of the specified wide IPs.
     */
    public iControl.CommonObjectStatus[] get_object_status(java.lang.String[] wide_ips) throws java.rmi.RemoteException;

    /**
     * Gets the states indicating whether to maintain a connection
     * between an LDNS and
     *  a particular virtual server.
     */
    public iControl.CommonEnabledState[] get_persistence_state(java.lang.String[] wide_ips) throws java.rmi.RemoteException;

    /**
     * Gets the persistence TTL values of the specified wide IPs.
     * These values (in seconds) indicate 
     *  the time to maintain a connection between an LDNS and a particular
     * virtual server.
     */
    public long[] get_persistence_ttl(java.lang.String[] wide_ips) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for the specified wide IPs.
     */
    public iControl.GlobalLBWideIPWideIPStatistics get_statistics(java.lang.String[] wide_ips) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Gets the lists of wide IPs associated with the specified aliases.
     * Each alias maps to exactly one wide IP.
     */
    public java.lang.String[][] get_wideip(java.lang.String[] aliases) throws java.rmi.RemoteException;

    /**
     * Gets the lists of wide IP pools the specified wide IPs are
     * associated with.
     */
    public iControl.GlobalLBWideIPWideIPPool[][] get_wideip_pool(java.lang.String[] wide_ips) throws java.rmi.RemoteException;

    /**
     * Gets the lists of wide IP rules the specified wide IPs are
     * associated with.
     */
    public iControl.GlobalLBWideIPWideIPRule[][] get_wideip_rule(java.lang.String[] wide_ips) throws java.rmi.RemoteException;

    /**
     * Removes aliases from the specified wide IPs.
     *  A given wide IP can have more than one alias.
     */
    public void remove_alias(java.lang.String[] wide_ips, java.lang.String[][] aliases) throws java.rmi.RemoteException;

    /**
     * Removes all aliases from the specified wide IPs.
     */
    public void remove_all_aliases(java.lang.String[] wide_ips) throws java.rmi.RemoteException;

    /**
     * Removes all wide IP pools from the specified wide IPs.
     */
    public void remove_all_wideip_pools(java.lang.String[] wide_ips) throws java.rmi.RemoteException;

    /**
     * Removes all wide IP rules from the specified wide IPs.
     */
    public void remove_all_wideip_rules(java.lang.String[] wide_ips) throws java.rmi.RemoteException;

    /**
     * Removes wide IP pools from the specified wide IPs.
     */
    public void remove_wideip_pool(java.lang.String[] wide_ips, iControl.GlobalLBWideIPWideIPPool[][] wideip_pools) throws java.rmi.RemoteException;

    /**
     * Removes wide IP rules from the specified wide IPs.
     */
    public void remove_wideip_rule(java.lang.String[] wide_ips, iControl.GlobalLBWideIPWideIPRule[][] wideip_rules) throws java.rmi.RemoteException;

    /**
     * Resets the names of the applications for the specified wide
     * IPs (i.e., sets them to nothing).  This function
     *  disassociates each wide IP given from any application.
     */
    public void reset_application(java.lang.String[] wide_ips) throws java.rmi.RemoteException;

    /**
     * Resets the statistics for the specified wide IPs.
     */
    public void reset_statistics(java.lang.String[] wide_ips) throws java.rmi.RemoteException;

    /**
     * Sets the names of the applications for the specified wide IPs.
     */
    public void set_application(java.lang.String[] wide_ips, java.lang.String[] applications) throws java.rmi.RemoteException;

    /**
     * Sets the enabled states for the specified wide IPs.
     */
    public void set_enabled_state(java.lang.String[] wide_ips, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the names of the last resort pools for the specified wide
     * IPs.
     */
    public void set_last_resort_pool(java.lang.String[] wide_ips, java.lang.String[] pool_names) throws java.rmi.RemoteException;

    /**
     * Sets the load balancing methods for the specified wide IPs.
     * This is used by the 
     *  wide IPs when picking a pool to use when responding to a DNS request.
     */
    public void set_lb_method(java.lang.String[] wide_ips, iControl.GlobalLBLBMethod[] lb_methods) throws java.rmi.RemoteException;

    /**
     * Sets the states indicating whether to maintain a connection
     * between an LDNS and
     *  a particular virtual server.
     */
    public void set_persistence_state(java.lang.String[] wide_ips, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the persistence TTL values of the specified wide IPs.
     * These values (in seconds) indicate 
     *  the time to maintain a connection between an LDNS and a particular
     * virtual server.
     */
    public void set_persistence_ttl(java.lang.String[] wide_ips, long[] values) throws java.rmi.RemoteException;
}
