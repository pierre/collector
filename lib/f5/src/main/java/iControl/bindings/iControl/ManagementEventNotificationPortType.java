/**
 * ManagementEventNotificationPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementEventNotificationPortType extends java.rmi.Remote {

    /**
     * The notification mechanism used to send event notification
     * messages.
     * Clients must implement this interface to act as an endpoint of event
     * notifications.
     */
    public void events_occurred(iControl.ManagementEventNotificationEventSource event_source, java.lang.String subscription_id, iControl.ManagementEventNotificationEventData[] event_data_list, iControl.CommonTimeStamp time_stamp) throws java.rmi.RemoteException;
}
