/**
 * LocalLBProfileAuth.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBProfileAuth extends javax.xml.rpc.Service {

/**
 * The ProfileAuth interface enables you to manipulate a local load
 * balancer's authentication profile.
 */
    public java.lang.String getLocalLBProfileAuthPortAddress();

    public iControl.LocalLBProfileAuthPortType getLocalLBProfileAuthPort() throws javax.xml.rpc.ServiceException;

    public iControl.LocalLBProfileAuthPortType getLocalLBProfileAuthPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
