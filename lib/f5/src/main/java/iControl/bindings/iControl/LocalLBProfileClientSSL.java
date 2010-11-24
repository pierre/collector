/**
 * LocalLBProfileClientSSL.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBProfileClientSSL extends javax.xml.rpc.Service {

/**
 * The ProfileClientSSL interface enables you to manipulate a local
 * load balancer's client SSL profile.
 */
    public java.lang.String getLocalLBProfileClientSSLPortAddress();

    public iControl.LocalLBProfileClientSSLPortType getLocalLBProfileClientSSLPort() throws javax.xml.rpc.ServiceException;

    public iControl.LocalLBProfileClientSSLPortType getLocalLBProfileClientSSLPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
