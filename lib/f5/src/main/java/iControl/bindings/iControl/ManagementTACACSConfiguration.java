/**
 * ManagementTACACSConfiguration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementTACACSConfiguration extends javax.xml.rpc.Service {

/**
 * The TACACSConfiguration interface enables you to manage TACACS
 * PAM configuration.
 */
    public java.lang.String getManagementTACACSConfigurationPortAddress();

    public iControl.ManagementTACACSConfigurationPortType getManagementTACACSConfigurationPort() throws javax.xml.rpc.ServiceException;

    public iControl.ManagementTACACSConfigurationPortType getManagementTACACSConfigurationPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
