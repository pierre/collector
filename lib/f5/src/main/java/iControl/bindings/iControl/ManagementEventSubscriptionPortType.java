/**
 * ManagementEventSubscriptionPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementEventSubscriptionPortType extends java.rmi.Remote {

    /**
     * Create a new subscription.  This takes an an input a list of
     * subscription details, one for each subscription requested.
     */
    public iControl.ManagementEventSubscriptionSubscriptionStatus[] create(iControl.ManagementEventSubscriptionSubscriptionDetails[] sub_detail_list) throws java.rmi.RemoteException;

    /**
     * Retrieve a list of event types available on this system.
     */
    public iControl.ManagementEventSubscriptionEventType[] get_available_event_types() throws java.rmi.RemoteException;

    /**
     * Retrieve the list of configured subscription identifiers.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Get the maximum timeslice (in seconds) between event notifications
     * for the list of subscription identifiers.
     */
    public void get_max_timeslice(java.lang.String[] id_list, iControl.holders.ManagementEventSubscriptionSubscriptionStatusSequenceHolder _return, iControl.holders.CommonLongSequenceHolder max_timeslice_list) throws java.rmi.RemoteException;

    /**
     * Get the minimum number of events needed to trigger a notification
     * message.
     */
    public void get_min_events_per_timeslice(java.lang.String[] id_list, iControl.holders.ManagementEventSubscriptionSubscriptionStatusSequenceHolder _return, iControl.holders.CommonLongSequenceHolder min_events_list) throws java.rmi.RemoteException;

    /**
     * Get the enabled state of a list of subscription identifiers.
     */
    public void get_state(java.lang.String[] id_list, iControl.holders.ManagementEventSubscriptionSubscriptionStatusSequenceHolder _return, iControl.holders.CommonEnabledStateSequenceHolder state_list) throws java.rmi.RemoteException;

    /**
     * Get the statistics for the given list of subscription identifiers.
     */
    public void get_statistics(java.lang.String[] id_list, iControl.holders.ManagementEventSubscriptionSubscriptionStatusSequenceHolder _return, iControl.holders.ManagementEventSubscriptionSubscriptionStatisticsSequenceHolder statistics_list) throws java.rmi.RemoteException;

    /**
     * Get the time to live (ttl) in seconds for the list of subscription
     * identifiers.
     */
    public void get_ttl(java.lang.String[] id_list, iControl.holders.ManagementEventSubscriptionSubscriptionStatusSequenceHolder _return, iControl.holders.CommonLongSequenceHolder ttl_list) throws java.rmi.RemoteException;

    /**
     * Get the url endpoint that implements the EventNotification
     * interface.
     */
    public void get_url(java.lang.String[] id_list, iControl.holders.ManagementEventSubscriptionSubscriptionStatusSequenceHolder _return, iControl.holders.CommonStringSequenceHolder url_list) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Modify a list of subscriptions.  This takes a list of subscription
     * definitions representing the subscriptions that are
     * to be modified.
     */
    public iControl.ManagementEventSubscriptionSubscriptionStatus[] modify(iControl.ManagementEventSubscriptionSubscriptionDefinition[] sub_def_list) throws java.rmi.RemoteException;

    /**
     * A lightweight ping to determine the event notification service's
     * health.
     */
    public iControl.ManagementEventSubscriptionSubscriptionStatus ping() throws java.rmi.RemoteException;

    /**
     * Retrieve the subscription definitions for a list of subscription
     * identifiers.
     */
    public void query(java.lang.String[] id_list, iControl.holders.ManagementEventSubscriptionSubscriptionStatusSequenceHolder _return, iControl.holders.ManagementEventSubscriptionSubscriptionDefinitionSequenceHolder sub_def_list) throws java.rmi.RemoteException;

    /**
     * Remove a list of subscriptions.  This takes as input a list
     * of subscription id's and returns a list of status
     * structures with the associated status code for each item in the id_list.
     */
    public iControl.ManagementEventSubscriptionSubscriptionStatus[] remove(java.lang.String[] id_list) throws java.rmi.RemoteException;

    /**
     * Reset the statistics for the given list of subscription identifiers.
     */
    public iControl.ManagementEventSubscriptionSubscriptionStatus[] reset_statistics(java.lang.String[] id_list) throws java.rmi.RemoteException;

    /**
     * Set the credentials for the url's associated with the given
     * list of subscription identifiers.
     */
    public iControl.ManagementEventSubscriptionSubscriptionStatus[] set_authentication(java.lang.String[] id_list, iControl.ManagementEventSubscriptionUserCredential[] credential_list) throws java.rmi.RemoteException;

    /**
     * Set the maximum timeslice (in seconds) between event notifications.
     * This value is used
     * to ensure that notifications are sent despite the minimum event attribute
     * not reaching
     * its threashold.
     */
    public iControl.ManagementEventSubscriptionSubscriptionStatus[] set_max_timeslice(java.lang.String[] id_list, long[] max_timeslice_list) throws java.rmi.RemoteException;

    /**
     * Set the minimum number of events needed to trigger a notification
     * message.
     * This value is used to force a notification message to occur even if
     * the 
     * max timeslice attribute is not reached yet.
     */
    public iControl.ManagementEventSubscriptionSubscriptionStatus[] set_min_events_per_timeslice(java.lang.String[] id_list, long[] min_events_list) throws java.rmi.RemoteException;

    /**
     * Set the enabled state of a list of subscriptions identifiers
     */
    public iControl.ManagementEventSubscriptionSubscriptionStatus[] set_state(java.lang.String[] id_list, iControl.CommonEnabledState[] state_list) throws java.rmi.RemoteException;

    /**
     * Set the time to live (ttl) in seconds for the list of subscription
     * identifiers.
     */
    public iControl.ManagementEventSubscriptionSubscriptionStatus[] set_ttl(java.lang.String[] id_list, long[] ttl_list) throws java.rmi.RemoteException;

    /**
     * Set the url endpoint that implements the EventNotification
     * interface.
     */
    public iControl.ManagementEventSubscriptionSubscriptionStatus[] set_url(java.lang.String[] id_list, java.lang.String[] url_list) throws java.rmi.RemoteException;
}
