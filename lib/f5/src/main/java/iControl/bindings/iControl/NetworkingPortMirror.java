/**
 * NetworkingPortMirror.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingPortMirror extends javax.xml.rpc.Service {

/**
 * The PortMirror interface enables you to work with the definitions
 * and attributes of port mirroring.
 */
    public java.lang.String getNetworkingPortMirrorPortAddress();

    public iControl.NetworkingPortMirrorPortType getNetworkingPortMirrorPort() throws javax.xml.rpc.ServiceException;

    public iControl.NetworkingPortMirrorPortType getNetworkingPortMirrorPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
