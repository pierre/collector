/**
 * LocalLBProfileHttp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBProfileHttp extends javax.xml.rpc.Service {

/**
 * The ProfileHttp interface enables you to manipulate a local load
 * balancer's HTTP profile.
 */
    public java.lang.String getLocalLBProfileHttpPortAddress();

    public iControl.LocalLBProfileHttpPortType getLocalLBProfileHttpPort() throws javax.xml.rpc.ServiceException;

    public iControl.LocalLBProfileHttpPortType getLocalLBProfileHttpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
