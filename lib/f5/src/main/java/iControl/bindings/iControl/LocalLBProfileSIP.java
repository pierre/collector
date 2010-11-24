/**
 * LocalLBProfileSIP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBProfileSIP extends javax.xml.rpc.Service {

/**
 * The ProfileSIP interface enables you to manipulate a local load
 * balancer's SIP profile.
 */
    public java.lang.String getLocalLBProfileSIPPortAddress();

    public iControl.LocalLBProfileSIPPortType getLocalLBProfileSIPPort() throws javax.xml.rpc.ServiceException;

    public iControl.LocalLBProfileSIPPortType getLocalLBProfileSIPPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
