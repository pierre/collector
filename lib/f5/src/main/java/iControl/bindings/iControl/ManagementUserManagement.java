/**
 * ManagementUserManagement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementUserManagement extends javax.xml.rpc.Service {

/**
 * The UserManagement interface deals with adding/deleting and 
 *  modifying users and user permission.
 */
    public java.lang.String getManagementUserManagementPortAddress();

    public iControl.ManagementUserManagementPortType getManagementUserManagementPort() throws javax.xml.rpc.ServiceException;

    public iControl.ManagementUserManagementPortType getManagementUserManagementPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
