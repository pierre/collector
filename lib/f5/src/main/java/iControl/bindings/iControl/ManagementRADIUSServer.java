/**
 * ManagementRADIUSServer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementRADIUSServer extends javax.xml.rpc.Service {

/**
 * The RADIUSServer interface enables you to manage RADIUS Server
 * configuration.
 */
    public java.lang.String getManagementRADIUSServerPortAddress();

    public iControl.ManagementRADIUSServerPortType getManagementRADIUSServerPort() throws javax.xml.rpc.ServiceException;

    public iControl.ManagementRADIUSServerPortType getManagementRADIUSServerPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
