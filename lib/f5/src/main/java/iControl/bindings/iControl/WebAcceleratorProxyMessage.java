/**
 * WebAcceleratorProxyMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface WebAcceleratorProxyMessage extends javax.xml.rpc.Service {

/**
 * The ProxyMessage interface enables you to send Invalidations to
 * the WAM on the other Active BIG-IP to invalidate content.
 */
    public java.lang.String getWebAcceleratorProxyMessagePortAddress();

    public iControl.WebAcceleratorProxyMessagePortType getWebAcceleratorProxyMessagePort() throws javax.xml.rpc.ServiceException;

    public iControl.WebAcceleratorProxyMessagePortType getWebAcceleratorProxyMessagePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
