/**
 * ManagementDBVariable.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementDBVariable extends javax.xml.rpc.Service {

/**
 * The DBVariable interface exposes methods that enable you to work
 * directly with our internal 
 *  database that contains configuration variables using name/value pairs.
 */
    public java.lang.String getManagementDBVariablePortAddress();

    public iControl.ManagementDBVariablePortType getManagementDBVariablePort() throws javax.xml.rpc.ServiceException;

    public iControl.ManagementDBVariablePortType getManagementDBVariablePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
