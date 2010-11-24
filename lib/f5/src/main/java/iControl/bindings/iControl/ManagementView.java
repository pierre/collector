/**
 * ManagementView.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementView extends javax.xml.rpc.Service {

/**
 * The View interface contains all calls necessary to manipulate views
 */
    public java.lang.String getManagementViewPortAddress();

    public iControl.ManagementViewPortType getManagementViewPort() throws javax.xml.rpc.ServiceException;

    public iControl.ManagementViewPortType getManagementViewPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
