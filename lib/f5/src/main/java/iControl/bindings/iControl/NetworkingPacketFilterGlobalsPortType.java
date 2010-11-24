/**
 * NetworkingPacketFilterGlobalsPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingPacketFilterGlobalsPortType extends java.rmi.Remote {

    /**
     * Adds the specified addresses to the list of trusted source
     * addresses.
     */
    public void add_trusted_address(java.lang.String[] addresses) throws java.rmi.RemoteException;

    /**
     * Adds the specified MAC addresses to the list of trusted MAC
     * addresses.
     */
    public void add_trusted_mac_address(java.lang.String[] mac_addresses) throws java.rmi.RemoteException;

    /**
     * Adds the specified ingress VLANs to the list of trusted VLANs.
     */
    public void add_trusted_vlan(java.lang.String[] vlans) throws java.rmi.RemoteException;

    /**
     * Gets a list of all trusted source addresses used in packet
     * filtering on this device.
     */
    public java.lang.String[] get_trusted_address() throws java.rmi.RemoteException;

    /**
     * Gets a list of all trusted MAC addresses used in packet filtering
     * on this device.
     */
    public java.lang.String[] get_trusted_mac_address() throws java.rmi.RemoteException;

    /**
     * Gets a list of all trusted ingress VLANs used in packet filtering
     * on this device.
     */
    public java.lang.String[] get_trusted_vlan() throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Removes the specified addresses from the list of trusted source
     * addresses.
     */
    public void remove_trusted_address(java.lang.String[] addresses) throws java.rmi.RemoteException;

    /**
     * Removes the specified MAC addresses from the list of trusted
     * MAC addresses.
     */
    public void remove_trusted_mac_address(java.lang.String[] mac_addresses) throws java.rmi.RemoteException;

    /**
     * Removes the specified ingress VLANs from the list of trusted
     * VLANs.
     */
    public void remove_trusted_vlan(java.lang.String[] vlans) throws java.rmi.RemoteException;
}
