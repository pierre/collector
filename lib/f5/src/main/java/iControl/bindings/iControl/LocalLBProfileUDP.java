/**
 * LocalLBProfileUDP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBProfileUDP extends javax.xml.rpc.Service {

/**
 * The ProfileUDP interface enables you to manipulate a local load
 * balancer's UDP profile.
 */
    public java.lang.String getLocalLBProfileUDPPortAddress();

    public iControl.LocalLBProfileUDPPortType getLocalLBProfileUDPPort() throws javax.xml.rpc.ServiceException;

    public iControl.LocalLBProfileUDPPortType getLocalLBProfileUDPPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
