/**
 * ManagementCCLDAPConfiguration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementCCLDAPConfiguration extends javax.xml.rpc.Service {

/**
 * The CCLDAPConfiguration interface enables you to manage SSL Client
 * Certificate LDAP PAM configuration.
 */
    public java.lang.String getManagementCCLDAPConfigurationPortAddress();

    public iControl.ManagementCCLDAPConfigurationPortType getManagementCCLDAPConfigurationPort() throws javax.xml.rpc.ServiceException;

    public iControl.ManagementCCLDAPConfigurationPortType getManagementCCLDAPConfigurationPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
