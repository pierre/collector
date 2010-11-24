/**
 * NetworkingVLANGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingVLANGroup extends javax.xml.rpc.Service {

/**
 * The VLANGroup interface enables you to work with the definitions
 * and attributes contained in a device's VLAN group.
 */
    public java.lang.String getNetworkingVLANGroupPortAddress();

    public iControl.NetworkingVLANGroupPortType getNetworkingVLANGroupPort() throws javax.xml.rpc.ServiceException;

    public iControl.NetworkingVLANGroupPortType getNetworkingVLANGroupPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
