/**
 * ManagementEventSubscription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementEventSubscription extends javax.xml.rpc.Service {

/**
 * The EventSubscription interface is to be used to register for system
 * configuration change events.  Events are sent using the EventNotification
 * interface.
 */
    public java.lang.String getManagementEventSubscriptionPortAddress();

    public iControl.ManagementEventSubscriptionPortType getManagementEventSubscriptionPort() throws javax.xml.rpc.ServiceException;

    public iControl.ManagementEventSubscriptionPortType getManagementEventSubscriptionPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
