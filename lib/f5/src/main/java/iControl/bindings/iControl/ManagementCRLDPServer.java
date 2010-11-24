/**
 * ManagementCRLDPServer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementCRLDPServer extends javax.xml.rpc.Service {

/**
 * The CRLDPServer interface enables you to manage CRLDP Server configuration.
 */
    public java.lang.String getManagementCRLDPServerPortAddress();

    public iControl.ManagementCRLDPServerPortType getManagementCRLDPServerPort() throws javax.xml.rpc.ServiceException;

    public iControl.ManagementCRLDPServerPortType getManagementCRLDPServerPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
