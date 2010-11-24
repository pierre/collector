/**
 * SystemSystemInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface SystemSystemInfo extends javax.xml.rpc.Service {

/**
 * The SystemInfo interface enables you to query identifying attributes
 * of the system.
 */
    public java.lang.String getSystemSystemInfoPortAddress();

    public iControl.SystemSystemInfoPortType getSystemSystemInfoPort() throws javax.xml.rpc.ServiceException;

    public iControl.SystemSystemInfoPortType getSystemSystemInfoPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
