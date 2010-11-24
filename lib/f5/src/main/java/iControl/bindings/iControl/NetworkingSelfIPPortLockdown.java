/**
 * NetworkingSelfIPPortLockdown.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingSelfIPPortLockdown extends javax.xml.rpc.Service {

/**
 * The SelfIPPortLockdown interface enables you to lock down protocols
 * and ports on self IP addresses.
 */
    public java.lang.String getNetworkingSelfIPPortLockdownPortAddress();

    public iControl.NetworkingSelfIPPortLockdownPortType getNetworkingSelfIPPortLockdownPort() throws javax.xml.rpc.ServiceException;

    public iControl.NetworkingSelfIPPortLockdownPortType getNetworkingSelfIPPortLockdownPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
