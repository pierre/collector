/**
 * NetworkingProfileWCCPGRE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingProfileWCCPGRE extends javax.xml.rpc.Service {

/**
 * The ProfileWCCPGRE interface allows you to manipulate a WCCP-GRE
 * tunnel
 *  profile to configure the General Routing Encapsulation (GRE - RFC2784)
 * tunnel protocol in conjunction with the Web-Cache Communication
 *  Protocol (WCCP).  See the Networking/ProfileGRE interface for
 *  additional information.
 */
    public java.lang.String getNetworkingProfileWCCPGREPortAddress();

    public iControl.NetworkingProfileWCCPGREPortType getNetworkingProfileWCCPGREPort() throws javax.xml.rpc.ServiceException;

    public iControl.NetworkingProfileWCCPGREPortType getNetworkingProfileWCCPGREPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
