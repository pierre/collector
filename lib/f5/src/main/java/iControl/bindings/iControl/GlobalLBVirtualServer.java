/**
 * GlobalLBVirtualServer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface GlobalLBVirtualServer extends javax.xml.rpc.Service {

/**
 * The VirtualServer interface enables you to work with virtual servers
 * associated with a server.
 */
    public java.lang.String getGlobalLBVirtualServerPortAddress();

    public iControl.GlobalLBVirtualServerPortType getGlobalLBVirtualServerPort() throws javax.xml.rpc.ServiceException;

    public iControl.GlobalLBVirtualServerPortType getGlobalLBVirtualServerPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
