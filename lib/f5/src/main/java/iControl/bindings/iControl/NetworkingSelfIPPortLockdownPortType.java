/**
 * NetworkingSelfIPPortLockdownPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingSelfIPPortLockdownPortType extends java.rmi.Remote {

    /**
     * Adds the list of access methods, with optional protocols/ports,
     * for the specified self IPs.
     */
    public void add_allow_access_list(iControl.NetworkingSelfIPPortLockdownSelfIPAccess[] access_lists) throws java.rmi.RemoteException;

    /**
     * Adds to the default list of protocols/ports on which access
     * is allowed.
     */
    public void add_default_protocol_port_access_list(iControl.NetworkingSelfIPPortLockdownProtocolPort[] defaults) throws java.rmi.RemoteException;

    /**
     * Deletes protocols and ports from the allow access list for
     * the specified self IPs.
     */
    public void delete_allow_access_list(iControl.NetworkingSelfIPPortLockdownSelfIPAccess[] access_lists) throws java.rmi.RemoteException;

    /**
     * Gets the access lists for the specified self IPs.
     */
    public iControl.NetworkingSelfIPPortLockdownSelfIPAccess[] get_allow_access_list(java.lang.String[] self_ips) throws java.rmi.RemoteException;

    /**
     * Gets the default protocol/port access list on which access
     * is allowed.
     */
    public iControl.NetworkingSelfIPPortLockdownProtocolPort[] get_default_protocol_port_access_list() throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Remove protocols and ports from the default list of protocols/ports
     * on which access is allowed.
     */
    public void remove_default_protocol_port_access_list(iControl.NetworkingSelfIPPortLockdownProtocolPort[] defaults) throws java.rmi.RemoteException;
}
