/**
 * NetworkingProfileGRE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingProfileGRE extends javax.xml.rpc.Service {

/**
 * The ProfileGRE interface allows you to manipulate a GRE tunnel
 * profile
 *  to configure the General Routing Encapsulation tunneling protocol.
 * The
 *  General Routing Encapsulation supports RFC2784, allowing the packets
 * of
 *  any L3 protocol to be carried inside encapsulating IP packets.
 */
    public java.lang.String getNetworkingProfileGREPortAddress();

    public iControl.NetworkingProfileGREPortType getNetworkingProfileGREPort() throws javax.xml.rpc.ServiceException;

    public iControl.NetworkingProfileGREPortType getNetworkingProfileGREPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
