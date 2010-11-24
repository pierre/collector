/**
 * LTConfigFieldPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LTConfigFieldPortType extends java.rmi.Remote {

    /**
     * Gets application data for one or more loosely-typed
     *  configuration fields for the specified classes. This is the
     *  "back-end application hook".
     */
    public java.lang.String[][] get_application_data(java.lang.String[] class_names, java.lang.String[][] field_names) throws java.rmi.RemoteException;

    /**
     * Gets the clustered state for one or more specified
     *  loosely-typed configuration fields for the specified
     *  classes. If the field is clustered, that means don't use the
     *  default.
     */
    public iControl.CommonEnabledState[][] get_clustered_state(java.lang.String[] class_names, java.lang.String[][] field_names) throws java.rmi.RemoteException;

    /**
     * Gets the configsyncd state for one or more specified
     *  loosely-typed configuration fields for the specified
     *  classes. If the field is configsyncd, that means don't use the
     *  default.
     */
    public iControl.CommonEnabledState[][] get_configsyncd_state(java.lang.String[] class_names, java.lang.String[][] field_names) throws java.rmi.RemoteException;

    /**
     * Gets db variable mirror information for one or more
     *  loosely-typed configuration fields for the specified
     *  classes. This, if non-empty, indicates which db variable
     *  should have its value mirrored with this field.
     */
    public java.lang.String[][] get_db_variable_mirror_information(java.lang.String[] class_names, java.lang.String[][] field_names) throws java.rmi.RemoteException;

    /**
     * Gets default value information for one or more loosely-typed
     * configuration fields for the specified classes.
     */
    public java.lang.String[][] get_default(java.lang.String[] class_names, java.lang.String[][] field_names) throws java.rmi.RemoteException;

    /**
     * Gets display name information for one or more loosely-typed
     * configuration fields for the specified classes.
     */
    public java.lang.String[][] get_display_name(java.lang.String[] class_names, java.lang.String[][] field_names) throws java.rmi.RemoteException;

    /**
     * Gets a list of loosely-typed configuration fields for the
     *  specified classes.
     */
    public java.lang.String[][] get_list(java.lang.String[] class_names) throws java.rmi.RemoteException;

    /**
     * Gets the required state for one or more specified
     *  loosely-typed configuration fields for the specified
     *  classes. If the field is required, that means don't use the
     *  default.
     */
    public iControl.CommonEnabledState[][] get_required_state(java.lang.String[] class_names, java.lang.String[][] field_names) throws java.rmi.RemoteException;

    /**
     * Gets type information for one or more loosely-typed
     *  configuration fields for the specified classes.
     *  (This is not to be confused with type; type information
     *  gives information relevant to the processing of a basic
     *  type, for example, type int might have type information
     *  specifying min and max value).
     */
    public java.lang.String[][] get_type_information(java.lang.String[] class_names, java.lang.String[][] field_names) throws java.rmi.RemoteException;

    /**
     * Gets the value for one loosely-typed configuration
     *  field instance for the specified class instance.
     * 
     *  This is for convenience, when you want to get just one
     *  value in just one class instance. Use get_values instead
     *  for greater efficiency when getting multiple field values.
     */
    public java.lang.String get_value(iControl.LTConfigClassInstanceKey class_instance_key, java.lang.String field_instance_name) throws java.rmi.RemoteException;

    /**
     * Gets values for one or more loosely-typed configuration
     *  field instances for the specified class instances.
     */
    public java.lang.String[][] get_values(iControl.LTConfigClassInstanceKey[] class_instance_keys, java.lang.String[][] field_instance_names) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Sets the value for one loosely-typed configuration
     *  field instance for the specified class instance.
     * 
     *  This is for convenience, when you want to set just one
     *  value in just one class instance. Use set_values instead
     *  for greater efficiency when setting multiple field values.
     */
    public void set_value(boolean create_instances_if_needed, iControl.LTConfigClassInstanceKey class_instance_key, java.lang.String field_instance_name, java.lang.String value) throws java.rmi.RemoteException;

    /**
     * Sets values for one or more loosely-typed configuration
     *  field instances for the specified class instances.
     */
    public void set_values(boolean create_instances_if_needed, iControl.LTConfigClassInstanceKey[] class_instance_keys, java.lang.String[][] field_instance_names, java.lang.String[][] values) throws java.rmi.RemoteException;
}
