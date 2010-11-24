/**
 * LocalLBProfileFastHttp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBProfileFastHttp extends javax.xml.rpc.Service {

/**
 * The ProfileFastHttp interface enables you to manipulate a local
 * load balancer's Fast HTTP profile.
 */
    public java.lang.String getLocalLBProfileFastHttpPortAddress();

    public iControl.LocalLBProfileFastHttpPortType getLocalLBProfileFastHttpPort() throws javax.xml.rpc.ServiceException;

    public iControl.LocalLBProfileFastHttpPortType getLocalLBProfileFastHttpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
