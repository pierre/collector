/**
 * NetworkingRouteDomainPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingRouteDomainPortType extends java.rmi.Remote {

    /**
     * Adds the specified VLANs to the specified route domains.
     */
    public void add_vlan(long[] route_domains, java.lang.String[][] vlans) throws java.rmi.RemoteException;

    /**
     * Creates a route domain.
     */
    public void create(long[] route_domains, java.lang.String[][] vlans) throws java.rmi.RemoteException;

    /**
     * Deletes all route domains.
     */
    public void delete_all_route_domains() throws java.rmi.RemoteException;

    /**
     * Deletes the specified route domains.
     */
    public void delete_route_domain(long[] route_domains) throws java.rmi.RemoteException;

    /**
     * Gets the descriptions for the the specified route domains.
     */
    public java.lang.String[] get_description(long[] route_domains) throws java.rmi.RemoteException;

    /**
     * Gets a list of all route domains on this device.
     */
    public long[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the parent ids for the specified route domains.
     */
    public long[] get_parent_id(long[] route_domains) throws java.rmi.RemoteException;

    /**
     * Gets the state to enforce cross-domain routing restrictions
     * for a
     *  set of route domains.
     */
    public iControl.CommonEnabledState[] get_strict_state(long[] route_domains) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Gets the lists of VLANs for the specified route domains.
     */
    public java.lang.String[][] get_vlan(long[] route_domains) throws java.rmi.RemoteException;

    /**
     * Removes all VLANs from the specified route domains.
     */
    public void remove_all_vlans(long[] route_domains) throws java.rmi.RemoteException;

    /**
     * Removes the specified VLANs from the specified route domains.
     */
    public void remove_vlan(long[] route_domains, java.lang.String[][] vlans) throws java.rmi.RemoteException;

    /**
     * Sets the descriptions for the the specified route domains.
     */
    public void set_description(long[] route_domains, java.lang.String[] descriptions) throws java.rmi.RemoteException;

    /**
     * Sets the parent ids for the specified route domains.
     */
    public void set_parent_id(long[] route_domains, long[] parent_ids) throws java.rmi.RemoteException;

    /**
     * Sets the state to enforce cross-domain routing restrictions
     * for a
     *  set of route domains.
     * 
     *  NOTES
     *  = If set, packets cannot cross route domain boundaries, i.e., they
     * are strictly isolated to the current route domain.
     *  = For example, if not set, you can add a route to the routing table
     * where the destination is 10.0.0.0%20 (route domain 20) and the
     *    gateway is 172.27.84.29%32 (route domain 32).
     *  = If set, the system may find invalid iRules that passed
     *    validation.
     */
    public void set_strict_state(long[] route_domains, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;
}
