/**
 * NetworkingSTPInstance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingSTPInstance extends javax.xml.rpc.Service {

/**
 * The STPInstance interface enables you to work with the definitions
 * and attributes associated with an STP instance.
 */
    public java.lang.String getNetworkingSTPInstancePortAddress();

    public iControl.NetworkingSTPInstancePortType getNetworkingSTPInstancePort() throws javax.xml.rpc.ServiceException;

    public iControl.NetworkingSTPInstancePortType getNetworkingSTPInstancePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
