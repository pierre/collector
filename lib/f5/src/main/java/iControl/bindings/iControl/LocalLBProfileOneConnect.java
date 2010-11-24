/**
 * LocalLBProfileOneConnect.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBProfileOneConnect extends javax.xml.rpc.Service {

/**
 * The ProfileOneConnect interface enables you to manipulate a local
 * load balancer's OneConnect profile.
 */
    public java.lang.String getLocalLBProfileOneConnectPortAddress();

    public iControl.LocalLBProfileOneConnectPortType getLocalLBProfileOneConnectPort() throws javax.xml.rpc.ServiceException;

    public iControl.LocalLBProfileOneConnectPortType getLocalLBProfileOneConnectPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
