/**
 * GlobalLBPool.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface GlobalLBPool extends javax.xml.rpc.Service {

/**
 * The Pool interface enables you to work with pools and their attributes.
 */
    public java.lang.String getGlobalLBPoolPortAddress();

    public iControl.GlobalLBPoolPortType getGlobalLBPoolPort() throws javax.xml.rpc.ServiceException;

    public iControl.GlobalLBPoolPortType getGlobalLBPoolPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
