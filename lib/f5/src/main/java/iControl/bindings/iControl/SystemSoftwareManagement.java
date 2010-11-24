/**
 * SystemSoftwareManagement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface SystemSoftwareManagement extends javax.xml.rpc.Service {

/**
 * The SoftwareManagement interface enables you to manage the software
 * installed on the system.
 */
    public java.lang.String getSystemSoftwareManagementPortAddress();

    public iControl.SystemSoftwareManagementPortType getSystemSoftwareManagementPort() throws javax.xml.rpc.ServiceException;

    public iControl.SystemSoftwareManagementPortType getSystemSoftwareManagementPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
