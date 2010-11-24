/**
 * NetworkingPacketFilterGlobals.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingPacketFilterGlobals extends javax.xml.rpc.Service {

/**
 * The PacketFilterGlobals interface enables you to work with the
 * global lists of trusted source addresses and ingress VLANs used
 *  in packet filtering.
 */
    public java.lang.String getNetworkingPacketFilterGlobalsPortAddress();

    public iControl.NetworkingPacketFilterGlobalsPortType getNetworkingPacketFilterGlobalsPort() throws javax.xml.rpc.ServiceException;

    public iControl.NetworkingPacketFilterGlobalsPortType getNetworkingPacketFilterGlobalsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
