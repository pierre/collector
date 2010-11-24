/**
 * GlobalLBApplicationPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface GlobalLBApplicationPortType extends java.rmi.Remote {

    /**
     * Creates the specified applications.
     */
    public void create(java.lang.String[] applications) throws java.rmi.RemoteException;

    /**
     * Deletes all applications.
     */
    public void delete_all_applications() throws java.rmi.RemoteException;

    /**
     * Deletes the specified applications.
     */
    public void delete_application(java.lang.String[] applications) throws java.rmi.RemoteException;

    /**
     * Disables the specified objects within the applications' context.
     */
    public void disable_application_context_object(iControl.GlobalLBApplicationApplicationContextObject[] application_objects) throws java.rmi.RemoteException;

    /**
     * Enables the specified objects within the applications' context.
     */
    public void enable_application_context_object(iControl.GlobalLBApplicationApplicationContextObject[] application_objects) throws java.rmi.RemoteException;

    /**
     * Gets the statuses of the specified application context objects.
     */
    public iControl.CommonObjectStatus[] get_application_context_status(iControl.GlobalLBApplicationApplicationContextObject[] application_objects) throws java.rmi.RemoteException;

    /**
     * Gets the availability dependency for the specified applications.
     */
    public iControl.GlobalLBAvailabilityDependency[] get_availability_dependency(java.lang.String[] applications) throws java.rmi.RemoteException;

    /**
     * Gets a list of applications.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the statuses of the specified applications.
     */
    public iControl.CommonObjectStatus[] get_object_status(java.lang.String[] applications) throws java.rmi.RemoteException;

    /**
     * Gets the persistence states for the specified applications.
     */
    public iControl.CommonEnabledState[] get_persistence_state(java.lang.String[] applications) throws java.rmi.RemoteException;

    /**
     * Gets the persistence TTL values of the specified applications.
     */
    public long[] get_persistence_ttl(java.lang.String[] applications) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Sets the availability dependency for the specified applications.
     */
    public void set_availability_dependency(java.lang.String[] applications, iControl.GlobalLBAvailabilityDependency[] values) throws java.rmi.RemoteException;

    /**
     * Sets the persistence states for the specified applications.
     */
    public void set_persistence_state(java.lang.String[] applications, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the persistence TTL values of the specified applications.
     */
    public void set_persistence_ttl(java.lang.String[] applications, long[] values) throws java.rmi.RemoteException;
}
