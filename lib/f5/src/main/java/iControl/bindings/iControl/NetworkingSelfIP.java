/**
 * NetworkingSelfIP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingSelfIP extends javax.xml.rpc.Service {

/**
 * The SelfIP interface enables you to work with the definitions and
 * attributes contained in a device's Self IP.
 */
    public java.lang.String getNetworkingSelfIPPortAddress();

    public iControl.NetworkingSelfIPPortType getNetworkingSelfIPPort() throws javax.xml.rpc.ServiceException;

    public iControl.NetworkingSelfIPPortType getNetworkingSelfIPPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
