/**
 * LTConfigClassPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LTConfigClassPortType extends java.rmi.Remote {

    /**
     * Creates a loosely-typed configuration class instance.
     */
    public void create_instance(iControl.LTConfigClassInstanceKey[] class_instance_keys) throws java.rmi.RemoteException;

    /**
     * Deletes a loosely-typed configuration class instance.
     */
    public void delete_instance(iControl.LTConfigClassInstanceKey[] class_instance_keys) throws java.rmi.RemoteException;

    /**
     * Gets the category for the specified loosely-typed
     *  configuration classes.
     */
    public java.lang.String[] get_category(java.lang.String[] class_names) throws java.rmi.RemoteException;

    /**
     * Gets the clustered state for the specified loosely-typed
     *  configuration classes.
     */
    public iControl.CommonEnabledState[] get_clustered_state(java.lang.String[] class_names) throws java.rmi.RemoteException;

    /**
     * Gets the configsyncd state for the specified loosely-typed
     *  configuration classes.
     */
    public iControl.CommonEnabledState[] get_configsyncd_state(java.lang.String[] class_names) throws java.rmi.RemoteException;

    /**
     * Gets the constraints for the specified loosely-typed
     *  configuration classes.
     */
    public java.lang.String[][] get_constraints(java.lang.String[] class_names) throws java.rmi.RemoteException;

    /**
     * Gets the field count for the specified loosely-typed configuration
     * classes.
     */
    public long[] get_field_count(java.lang.String[] class_names) throws java.rmi.RemoteException;

    /**
     * Gets a list of loosely-typed configuration classes.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets a list of loosely-typed configuration class instances.
     */
    public iControl.LTConfigClassInstanceKey[][] get_list_of_instances(java.lang.String[] class_names) throws java.rmi.RemoteException;

    /**
     * Gets the nested classes for the specified loosely-typed
     *  configuration classes.
     */
    public java.lang.String[][] get_nested_classes(java.lang.String[] class_names) throws java.rmi.RemoteException;

    /**
     * Gets the partitioned state for the specified loosely-typed
     *  configuration classes.
     */
    public iControl.CommonEnabledState[] get_partitioned_state(java.lang.String[] class_names) throws java.rmi.RemoteException;

    /**
     * Gets the singleton state for the specified loosely-typed
     *  configuration classes.
     */
    public iControl.CommonEnabledState[] get_singleton_state(java.lang.String[] class_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for the specified loosely-typed
     *  configuration classes.
     */
    public java.lang.String[][] get_statistics(java.lang.String[] class_names) throws java.rmi.RemoteException;

    /**
     * Gets the toplevelcmd state for the specified loosely-typed
     *  configuration classes.
     */
    public iControl.CommonEnabledState[] get_toplevelcmd_state(java.lang.String[] class_names) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;
}
