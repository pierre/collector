/**
 * LocalLBProfileServerSSL.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBProfileServerSSL extends javax.xml.rpc.Service {

/**
 * The ProfileServerSSL interface enables you to manipulate a local
 * load balancer's server SSL profile.
 */
    public java.lang.String getLocalLBProfileServerSSLPortAddress();

    public iControl.LocalLBProfileServerSSLPortType getLocalLBProfileServerSSLPort() throws javax.xml.rpc.ServiceException;

    public iControl.LocalLBProfileServerSSLPortType getLocalLBProfileServerSSLPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
