/**
 * LocalLBVirtualServer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBVirtualServer extends javax.xml.rpc.Service {

/**
 * The VirtualServer interface enables you to work with the states,
 * statistics, limits, availability, and settings of a local load balancer's
 * virtual servers.  
 *  For example, you can use the Virtual Server interface to create a
 * virtual server from a specified pool or rule or to delete a virtual
 * server from a specified pool.
 */
    public java.lang.String getLocalLBVirtualServerPortAddress();

    public iControl.LocalLBVirtualServerPortType getLocalLBVirtualServerPort() throws javax.xml.rpc.ServiceException;

    public iControl.LocalLBVirtualServerPortType getLocalLBVirtualServerPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
