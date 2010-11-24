/**
 * NetworkingISessionAdvertisedRoutePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingISessionAdvertisedRoutePortType extends java.rmi.Remote {

    /**
     * Creates a specified subnet object with all its attributes.
     */
    public void create(iControl.NetworkingISessionAdvertisedRouteISessionAdvertisedRouteStruct subnet) throws java.rmi.RemoteException;

    /**
     * Deletes all exisiting subnet objects.
     */
    public void delete_all_subnets() throws java.rmi.RemoteException;

    /**
     * Deletes the specified subnet via its IP address and netmask.
     */
    public void delete_subnets(iControl.NetworkingISessionAdvertisedRouteSubnetOptKey[] subnets) throws java.rmi.RemoteException;

    /**
     * Gets the enabled flag on the target subnets.
     */
    public iControl.CommonEnabledState[] get_enabled_state(iControl.NetworkingISessionAdvertisedRouteSubnetOptKey[] subnets) throws java.rmi.RemoteException;

    /**
     * Gets the label string on the target subnets.
     */
    public java.lang.String[] get_label(iControl.NetworkingISessionAdvertisedRouteSubnetOptKey[] subnets) throws java.rmi.RemoteException;

    /**
     * Get a list of all subnet interfaces and their netmasks.
     */
    public iControl.NetworkingISessionAdvertisedRouteSubnetOptKey[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the metric with which the specified subnet IPs are associated.
     */
    public long[] get_metric(iControl.NetworkingISessionAdvertisedRouteSubnetOptKey[] subnets) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Sets/Resets the enabled flag on the target subnets.
     */
    public void set_enabled_state(iControl.NetworkingISessionAdvertisedRouteSubnetOptKey[] ip, iControl.CommonEnabledState[] included) throws java.rmi.RemoteException;

    /**
     * Sets/Resets the label string on the target subnets.
     */
    public void set_label(iControl.NetworkingISessionAdvertisedRouteSubnetOptKey[] ip, java.lang.String[] labels) throws java.rmi.RemoteException;

    /**
     * Sets the metric with which the specified subnet IPs are associated.
     */
    public void set_metric(iControl.NetworkingISessionAdvertisedRouteSubnetOptKey[] subnet, long[] metric) throws java.rmi.RemoteException;
}
