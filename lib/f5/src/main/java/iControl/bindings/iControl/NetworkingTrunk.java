/**
 * NetworkingTrunk.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingTrunk extends javax.xml.rpc.Service {

/**
 * The Trunk interface enables you to work with the definitions and
 * attributes contained in a device's trunk.
 */
    public java.lang.String getNetworkingTrunkPortAddress();

    public iControl.NetworkingTrunkPortType getNetworkingTrunkPort() throws javax.xml.rpc.ServiceException;

    public iControl.NetworkingTrunkPortType getNetworkingTrunkPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
