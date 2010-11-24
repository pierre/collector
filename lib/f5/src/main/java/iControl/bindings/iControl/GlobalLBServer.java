/**
 * GlobalLBServer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface GlobalLBServer extends javax.xml.rpc.Service {

/**
 * The Server interface enables you to work with servers within a
 * data center.
 */
    public java.lang.String getGlobalLBServerPortAddress();

    public iControl.GlobalLBServerPortType getGlobalLBServerPort() throws javax.xml.rpc.ServiceException;

    public iControl.GlobalLBServerPortType getGlobalLBServerPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
