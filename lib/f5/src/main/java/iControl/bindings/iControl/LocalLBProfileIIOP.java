/**
 * LocalLBProfileIIOP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBProfileIIOP extends javax.xml.rpc.Service {

/**
 * The ProfileIIOP interface enables you to manipulate a local load
 * balancer's IIOP profile.
 */
    public java.lang.String getLocalLBProfileIIOPPortAddress();

    public iControl.LocalLBProfileIIOPPortType getLocalLBProfileIIOPPort() throws javax.xml.rpc.ServiceException;

    public iControl.LocalLBProfileIIOPPortType getLocalLBProfileIIOPPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
