/**
 * NetworkingAdminIP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingAdminIP extends javax.xml.rpc.Service {

/**
 * The AdminIP interface enables you to work with the definitions
 * and attributes contained in a device's administrative IP.
 */
    public java.lang.String getNetworkingAdminIPPortAddress();

    public iControl.NetworkingAdminIPPortType getNetworkingAdminIPPort() throws javax.xml.rpc.ServiceException;

    public iControl.NetworkingAdminIPPortType getNetworkingAdminIPPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
