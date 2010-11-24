/**
 * ManagementLDAPConfiguration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementLDAPConfiguration extends javax.xml.rpc.Service {

/**
 * The LDAPConfiguration interface enables you to manage LDAP PAM
 * configuration.
 */
    public java.lang.String getManagementLDAPConfigurationPortAddress();

    public iControl.ManagementLDAPConfigurationPortType getManagementLDAPConfigurationPort() throws javax.xml.rpc.ServiceException;

    public iControl.ManagementLDAPConfigurationPortType getManagementLDAPConfigurationPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
