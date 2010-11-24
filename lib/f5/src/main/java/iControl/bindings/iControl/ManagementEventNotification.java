/**
 * ManagementEventNotification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementEventNotification extends javax.xml.rpc.Service {

/**
 * The EventNotification interface is used for system configuration
 * change events that are configured with the EventSubscriptions interface.
 */
    public java.lang.String getManagementEventNotificationPortAddress();

    public iControl.ManagementEventNotificationPortType getManagementEventNotificationPort() throws javax.xml.rpc.ServiceException;

    public iControl.ManagementEventNotificationPortType getManagementEventNotificationPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
