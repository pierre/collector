/**
 * ManagementRADIUSConfiguration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementRADIUSConfiguration extends javax.xml.rpc.Service {

/**
 * The RADIUSConfiguration interface enables you to manage RADIUS
 * PAM configuration.
 */
    public java.lang.String getManagementRADIUSConfigurationPortAddress();

    public iControl.ManagementRADIUSConfigurationPortType getManagementRADIUSConfigurationPort() throws javax.xml.rpc.ServiceException;

    public iControl.ManagementRADIUSConfigurationPortType getManagementRADIUSConfigurationPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
