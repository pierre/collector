/**
 * LocalLBProfileTCP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBProfileTCP extends javax.xml.rpc.Service {

/**
 * The ProfileTCP interface enables you to manipulate a local load
 * balancer's TCP profile.
 */
    public java.lang.String getLocalLBProfileTCPPortAddress();

    public iControl.LocalLBProfileTCPPortType getLocalLBProfileTCPPort() throws javax.xml.rpc.ServiceException;

    public iControl.LocalLBProfileTCPPortType getLocalLBProfileTCPPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
