/**
 * LocalLBProfileStream.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBProfileStream extends javax.xml.rpc.Service {

/**
 * The ProfileStream interface enables you to manipulate a local load
 * balancer's stream profile.
 */
    public java.lang.String getLocalLBProfileStreamPortAddress();

    public iControl.LocalLBProfileStreamPortType getLocalLBProfileStreamPort() throws javax.xml.rpc.ServiceException;

    public iControl.LocalLBProfileStreamPortType getLocalLBProfileStreamPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
