/**
 * NetworkingTunnel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingTunnel extends javax.xml.rpc.Service {

/**
 * The Tunnel interface manages a virtual network interface that allows
 * a
 *  network protocol to carry packets of another protocol between two
 * endpoints.  Once created, it can be used just like a VLAN in BIG-IP
 * configurations.
 */
    public java.lang.String getNetworkingTunnelPortAddress();

    public iControl.NetworkingTunnelPortType getNetworkingTunnelPort() throws javax.xml.rpc.ServiceException;

    public iControl.NetworkingTunnelPortType getNetworkingTunnelPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
