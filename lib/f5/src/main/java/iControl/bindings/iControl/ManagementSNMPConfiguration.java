/**
 * ManagementSNMPConfiguration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementSNMPConfiguration extends javax.xml.rpc.Service {

/**
 * The SNMPConfiguration interface allows users to manage the full
 * configurations 
 *  for UCD SNMP agent.
 *  Please read the manual pages for snmpd.conf for further information.
 * 
 * 
 * TODO:
 * Missing directives:
 * - override
 */
    public java.lang.String getManagementSNMPConfigurationPortAddress();

    public iControl.ManagementSNMPConfigurationPortType getManagementSNMPConfigurationPort() throws javax.xml.rpc.ServiceException;

    public iControl.ManagementSNMPConfigurationPortType getManagementSNMPConfigurationPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
