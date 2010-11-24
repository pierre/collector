/**
 * GlobalLBLink.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface GlobalLBLink extends javax.xml.rpc.Service {

/**
 * The Link interface enables you to work with links within a data
 * center.
 */
    public java.lang.String getGlobalLBLinkPortAddress();

    public iControl.GlobalLBLinkPortType getGlobalLBLinkPort() throws javax.xml.rpc.ServiceException;

    public iControl.GlobalLBLinkPortType getGlobalLBLinkPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
