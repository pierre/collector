/**
 * NetworkingProfileIPIP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingProfileIPIP extends javax.xml.rpc.Service {

/**
 * The ProfileIPIP interface enables you to manipulate an IP-IP tunnel
 * profile to configure the IP-within-IP tunneling protocol.  The
 *  IP-within-IP protocol (RFC2003) specifies how to encapsulate an IP
 * packet within another IP packet.
 */
    public java.lang.String getNetworkingProfileIPIPPortAddress();

    public iControl.NetworkingProfileIPIPPortType getNetworkingProfileIPIPPort() throws javax.xml.rpc.ServiceException;

    public iControl.NetworkingProfileIPIPPortType getNetworkingProfileIPIPPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
