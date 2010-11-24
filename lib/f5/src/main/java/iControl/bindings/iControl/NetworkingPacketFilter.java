/**
 * NetworkingPacketFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingPacketFilter extends javax.xml.rpc.Service {

/**
 * The PacketFilter interface enables you to work with the definitions
 * and attributes of packet filter rules.  
 *  The goal of the packet filter is to provide a flexible and integrated
 * perimeter security mechanism to 
 *  explicitly block as well as accept traffic using complex expressions
 * similar to those used by libpcap (e.g. tcpdump).
 */
    public java.lang.String getNetworkingPacketFilterPortAddress();

    public iControl.NetworkingPacketFilterPortType getNetworkingPacketFilterPort() throws javax.xml.rpc.ServiceException;

    public iControl.NetworkingPacketFilterPortType getNetworkingPacketFilterPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
