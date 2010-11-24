/**
 * NetworkingARP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingARP extends javax.xml.rpc.Service {

/**
 * The ARP interface enables you to work with the ARP table and entries.
 */
    public java.lang.String getNetworkingARPPortAddress();

    public iControl.NetworkingARPPortType getNetworkingARPPort() throws javax.xml.rpc.ServiceException;

    public iControl.NetworkingARPPortType getNetworkingARPPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
