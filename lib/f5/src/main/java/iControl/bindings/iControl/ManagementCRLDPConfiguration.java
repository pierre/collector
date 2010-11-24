/**
 * ManagementCRLDPConfiguration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementCRLDPConfiguration extends javax.xml.rpc.Service {

/**
 * The CRLDPConfiguration interface enables you to manage CRLDP PAM
 * configuration.
 */
    public java.lang.String getManagementCRLDPConfigurationPortAddress();

    public iControl.ManagementCRLDPConfigurationPortType getManagementCRLDPConfigurationPort() throws javax.xml.rpc.ServiceException;

    public iControl.ManagementCRLDPConfigurationPortType getManagementCRLDPConfigurationPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
