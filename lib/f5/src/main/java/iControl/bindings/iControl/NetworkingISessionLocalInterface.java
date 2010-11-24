/**
 * NetworkingISessionLocalInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingISessionLocalInterface extends javax.xml.rpc.Service {

/**
 * The iSession Local interface enables you to work with the definitions
 * and attributes contained 
 *  in a device's local endpoint object.
 */
    public java.lang.String getNetworkingISessionLocalInterfacePortAddress();

    public iControl.NetworkingISessionLocalInterfacePortType getNetworkingISessionLocalInterfacePort() throws javax.xml.rpc.ServiceException;

    public iControl.NetworkingISessionLocalInterfacePortType getNetworkingISessionLocalInterfacePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
