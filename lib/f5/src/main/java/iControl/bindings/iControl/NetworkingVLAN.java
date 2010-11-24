/**
 * NetworkingVLAN.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingVLAN extends javax.xml.rpc.Service {

/**
 * The VLAN interface enables you to work with the definitions and
 * attributes contained in a device's VLAN.
 */
    public java.lang.String getNetworkingVLANPortAddress();

    public iControl.NetworkingVLANPortType getNetworkingVLANPort() throws javax.xml.rpc.ServiceException;

    public iControl.NetworkingVLANPortType getNetworkingVLANPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
