/**
 * SystemServicesPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface SystemServicesPortType extends java.rmi.Remote {

    /**
     * Determines whether the specified services are enabled or disabled
     * on an ITCM appliance.
     */
    public iControl.SystemServicesServiceStatus[] get_all_service_statuses() throws java.rmi.RemoteException;

    /**
     * Gets a list of all services supported on this device.
     */
    public iControl.SystemServicesServiceType[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the statuses of the specified services
     */
    public iControl.SystemServicesServiceStatus[] get_service_status(iControl.SystemServicesServiceType[] services) throws java.rmi.RemoteException;

    /**
     * Note: This method is deprecated; please use get_ssh_access_v2
     * in new applications.
     * 
     *  Gets the ssl service state and allowed addresses.
     */
    public iControl.SystemServicesSSHAccess get_ssh_access() throws java.rmi.RemoteException;

    /**
     * Gets the ssl service state and allowed addresses.
     */
    public iControl.SystemServicesSSHAccess_v2 get_ssh_access_v2() throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Reboots the system.  This method will reboot the system within
     * specified number of seconds.
     *  Once this method has been called, no further operations or requests
     * should be sent to the 
     *  Portal, and make sure all pending operations are completed before
     * the reboot.
     */
    public void reboot_system(long seconds_to_reboot) throws java.rmi.RemoteException;

    /**
     * Sets the action for all services to take. This method is asynchronous,
     * meaning that
     *  the method may return before the requested action is completed.
     *  NOTE: For this method, the only valid values for service_action are:
     * SERVICE_ACTION_START
     *       SERVICE_ACTION_STOP
     *       SERVICE_ACTION_REINIT
     *       SERVICE_ACTION_RESTART
     */
    public void set_all_services(iControl.SystemServicesServiceAction service_action) throws java.rmi.RemoteException;

    /**
     * Sets the action for the specified services to take. This method
     * is asynchronous, meaning 
     *  that the method may return before the requested action is completed.
     */
    public void set_service(iControl.SystemServicesServiceType[] services, iControl.SystemServicesServiceAction service_action) throws java.rmi.RemoteException;

    /**
     * Note: This method is deprecated; please use get_ssh_access_v2
     * in new applications.
     * 
     *  Sets the ssl service state and allowed addresses.
     */
    public void set_ssh_access(iControl.SystemServicesSSHAccess access) throws java.rmi.RemoteException;

    /**
     * Sets the ssl service state and allowed addresses.
     */
    public void set_ssh_access_v2(iControl.SystemServicesSSHAccess_v2 access) throws java.rmi.RemoteException;
}
