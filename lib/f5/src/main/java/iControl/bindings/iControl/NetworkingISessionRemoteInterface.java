/**
 * NetworkingISessionRemoteInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingISessionRemoteInterface extends javax.xml.rpc.Service {

/**
 * The iSession RemoteInterface interface enables you to work with
 * the definitions 
 *  and attributes contained in a device's peer iSession Remote Endpoint
 * objects.
 */
    public java.lang.String getNetworkingISessionRemoteInterfacePortAddress();

    public iControl.NetworkingISessionRemoteInterfacePortType getNetworkingISessionRemoteInterfacePort() throws javax.xml.rpc.ServiceException;

    public iControl.NetworkingISessionRemoteInterfacePortType getNetworkingISessionRemoteInterfacePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
