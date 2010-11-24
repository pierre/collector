/**
 * LTConfigClass.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LTConfigClass extends javax.xml.rpc.Service {

/**
 * The Class interface enables you to manage classes and class
 *  instances in the Loosely-Typed Configuration system.
 */
    public java.lang.String getLTConfigClassPortAddress();

    public iControl.LTConfigClassPortType getLTConfigClassPort() throws javax.xml.rpc.ServiceException;

    public iControl.LTConfigClassPortType getLTConfigClassPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
