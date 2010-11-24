/**
 * NetworkingISessionPeerDiscovery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingISessionPeerDiscovery extends javax.xml.rpc.Service {

/**
 * The Dynamic Peer Discovery interface enables you to work with the
 * definitions and 
 *  attributes contained in a device's peer discovery objects.
 */
    public java.lang.String getNetworkingISessionPeerDiscoveryPortAddress();

    public iControl.NetworkingISessionPeerDiscoveryPortType getNetworkingISessionPeerDiscoveryPort() throws javax.xml.rpc.ServiceException;

    public iControl.NetworkingISessionPeerDiscoveryPortType getNetworkingISessionPeerDiscoveryPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
