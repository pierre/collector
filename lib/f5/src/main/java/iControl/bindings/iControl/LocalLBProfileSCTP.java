/**
 * LocalLBProfileSCTP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBProfileSCTP extends javax.xml.rpc.Service {

/**
 * The ProfileSCTP interface enables you to manipulate a local load
 * balancer's SCTP profile.
 */
    public java.lang.String getLocalLBProfileSCTPPortAddress();

    public iControl.LocalLBProfileSCTPPortType getLocalLBProfileSCTPPort() throws javax.xml.rpc.ServiceException;

    public iControl.LocalLBProfileSCTPPortType getLocalLBProfileSCTPPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
