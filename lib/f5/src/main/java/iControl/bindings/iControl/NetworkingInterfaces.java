/**
 * NetworkingInterfaces.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingInterfaces extends javax.xml.rpc.Service {

/**
 * The Interface interface enables you to work with the definitions
 * and attributes contained in a device's interface.
 */
    public java.lang.String getNetworkingInterfacesPortAddress();

    public iControl.NetworkingInterfacesPortType getNetworkingInterfacesPort() throws javax.xml.rpc.ServiceException;

    public iControl.NetworkingInterfacesPortType getNetworkingInterfacesPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
