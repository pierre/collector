/**
 * LocalLBProfileRADIUS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBProfileRADIUS extends javax.xml.rpc.Service {

/**
 * The ProfileRADIUS interface enables you to manipulate a local
 *  load balancer's RADIUS profile.
 */
    public java.lang.String getLocalLBProfileRADIUSPortAddress();

    public iControl.LocalLBProfileRADIUSPortType getLocalLBProfileRADIUSPort() throws javax.xml.rpc.ServiceException;

    public iControl.LocalLBProfileRADIUSPortType getLocalLBProfileRADIUSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
