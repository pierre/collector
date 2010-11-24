/**
 * ManagementOCSPConfiguration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementOCSPConfiguration extends javax.xml.rpc.Service {

/**
 * The OCSPConfiguration interface enables you to manage OCSP PAM
 * configuration.
 */
    public java.lang.String getManagementOCSPConfigurationPortAddress();

    public iControl.ManagementOCSPConfigurationPortType getManagementOCSPConfigurationPort() throws javax.xml.rpc.ServiceException;

    public iControl.ManagementOCSPConfigurationPortType getManagementOCSPConfigurationPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
