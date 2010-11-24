/**
 * ManagementNamed.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementNamed extends javax.xml.rpc.Service {

/**
 * The Named interface provides the calls to manipulate the named.conf
 * and the named server
 */
    public java.lang.String getManagementNamedPortAddress();

    public iControl.ManagementNamedPortType getManagementNamedPort() throws javax.xml.rpc.ServiceException;

    public iControl.ManagementNamedPortType getManagementNamedPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
