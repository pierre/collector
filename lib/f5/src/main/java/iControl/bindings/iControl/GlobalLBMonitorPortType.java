/**
 * GlobalLBMonitorPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface GlobalLBMonitorPortType extends java.rmi.Remote {

    /**
     * Creates monitor templates with some basic attributes.  
     *  If the "parent_template" attribute in "template_attributes" is empty,
     * then the 
     *  new template is based on the template type field given in "templates".
     * If the "parent_template" attribute in "template_attributes" is specified,
     * then 
     *  the new template is derived from the "parent_template", and template
     * type field
     *  in "templates" is ignored. 
     *  If "parent_template" is empty, and the template type field in "templates"
     * is not
     *  specified, then the new template is a root template.
     */
    public void create_template(iControl.GlobalLBMonitorMonitorTemplate[] templates, iControl.GlobalLBMonitorCommonAttributes[] template_attributes) throws java.rmi.RemoteException;

    /**
     * Deletes all user-defined (non-root) monitor templates.
     */
    public void delete_all_templates() throws java.rmi.RemoteException;

    /**
     * Deletes the specified monitor templates.
     */
    public void delete_template(java.lang.String[] template_names) throws java.rmi.RemoteException;

    /**
     * Gets the monitor templates' ignore down response states.
     *  When enabled, the system will mark objects down only if the
     *  monitor timer expires without receiving an "up" response.
     */
    public iControl.CommonEnabledState[] get_ignore_down_response_state(java.lang.String[] template_names) throws java.rmi.RemoteException;

    /**
     * Gets the enabled/disabled states of the monitor instances.
     */
    public iControl.GlobalLBMonitorInstanceState[] get_instance_state(iControl.GlobalLBMonitorInstance[] instances) throws java.rmi.RemoteException;

    /**
     * Gets the monitor templates' manual resume states. When enabled
     * and a monitor has
     *  marked an object down, that object will not be marked up by the monitor,
     * i.e. the
     *  object will be manually marked up.
     */
    public iControl.CommonEnabledState[] get_manual_resume_state(java.lang.String[] template_names) throws java.rmi.RemoteException;

    /**
     * Gets the parent monitor templates from which the specified
     * monitor templates are derived.
     *  A user-defined monitor template will get its defaults from its parent
     * monitor template.
     */
    public java.lang.String[] get_parent_template(java.lang.String[] template_names) throws java.rmi.RemoteException;

    /**
     * Gets the destination address types of the monitor templates.
     * This allows the user to determine
     *  what node IP:port can be associated with this monitor when creating
     * a monitor instance.
     */
    public iControl.GlobalLBAddressType[] get_template_address_type(java.lang.String[] template_names) throws java.rmi.RemoteException;

    /**
     * Gets the destination IP:port values of the specified monitor
     * templates.
     */
    public iControl.GlobalLBMonitorIPPort[] get_template_destination(java.lang.String[] template_names) throws java.rmi.RemoteException;

    /**
     * Gets the integer property values of the specified monitor templates.
     */
    public iControl.GlobalLBMonitorIntegerValue[] get_template_integer_property(java.lang.String[] template_names, iControl.GlobalLBMonitorIntPropertyType[] property_types) throws java.rmi.RemoteException;

    /**
     * Gets the list of monitor templates.
     */
    public iControl.GlobalLBMonitorMonitorTemplate[] get_template_list() throws java.rmi.RemoteException;

    /**
     * Gets the reverse mode states of the specified monitor templates.
     */
    public boolean[] get_template_reverse_mode(java.lang.String[] template_names) throws java.rmi.RemoteException;

    /**
     * Gets the enabled/disabled states of the specified monitor templates.
     */
    public iControl.CommonEnabledState[] get_template_state(java.lang.String[] template_names) throws java.rmi.RemoteException;

    /**
     * Gets a string property values of the specified monitor templates.
     */
    public iControl.GlobalLBMonitorStringValue[] get_template_string_property(java.lang.String[] template_names, iControl.GlobalLBMonitorStrPropertyType[] property_types) throws java.rmi.RemoteException;

    /**
     * Gets the transparent mode states of the specified monitor templates.
     */
    public boolean[] get_template_transparent_mode(java.lang.String[] template_names) throws java.rmi.RemoteException;

    /**
     * Gets the template types of the specified monitor templates.
     */
    public iControl.GlobalLBMonitorTemplateType[] get_template_type(java.lang.String[] template_names) throws java.rmi.RemoteException;

    /**
     * Gets the user-defined string property values of the specified
     * monitor templates.
     */
    public iControl.GlobalLBMonitorUserDefinedStringValue[] get_template_user_defined_string_property(java.lang.String[] template_names, java.lang.String[] property_names) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Determines if the specified monitor templates can be used directly,
     * or a user-defined monitor based on each monitor must be created first
     * 
     *  before it can be used.
     */
    public boolean[] is_template_directly_usable(java.lang.String[] template_names) throws java.rmi.RemoteException;

    /**
     * Determines if the specified monitor templates are read-only.
     * The user can only modify properties for read/write monitor templates.
     */
    public boolean[] is_template_read_only(java.lang.String[] template_names) throws java.rmi.RemoteException;

    /**
     * Determines if the specified monitor templates are of the base
     * monitor templates.
     */
    public boolean[] is_template_root(java.lang.String[] template_names) throws java.rmi.RemoteException;

    /**
     * Sets the monitor templates' ignore down response states.
     *  When enabled, the system will mark objects down only if the
     *  monitor timer expires without receiving an "up" response.
     * 
     *  This is useful because probe_num_probes is not effective
     *  with ECV monitors.  To get similar functionality, enable
     *  ignore down response, and set timeout and probe timeout.
     */
    public void set_ignore_down_response_state(java.lang.String[] template_names, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the enabled/disabled states of the monitor instances.
     */
    public void set_instance_state(iControl.GlobalLBMonitorInstanceState[] instance_states) throws java.rmi.RemoteException;

    /**
     * Sets the monitor templates' manual resume states. When enabled
     * and a monitor has
     *  marked an object down, that object will not be marked up by the monitor,
     * i.e. the
     *  object will be manually marked up.
     */
    public void set_manual_resume_state(java.lang.String[] template_names, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the destination IP:port values for the specified templates.
     * NOTE: This should only be done when the monitor templates in "template_names"
     * have NOT been associated to any node addresses or pool members.
     */
    public void set_template_destination(java.lang.String[] template_names, iControl.GlobalLBMonitorIPPort[] destinations) throws java.rmi.RemoteException;

    /**
     * Sets an integer property values of the specified monitor templates.
     */
    public void set_template_integer_property(java.lang.String[] template_names, iControl.GlobalLBMonitorIntegerValue[] values) throws java.rmi.RemoteException;

    /**
     * Sets the reverse mode states of the specified monitor templates.
     * When in reverse mode, a successful test marks the node down instead
     * of up.
     */
    public void set_template_reverse_mode(java.lang.String[] template_names, boolean[] reverse_modes) throws java.rmi.RemoteException;

    /**
     * Sets the monitor templates' enabled/disabled states. 
     *  This will enable/disable all instances that use the specified templates.
     * This serves as a quick and convenient method to enable/disable all
     * instances,
     *  but if you want only to enable/disable a specific instance, use set_instance_enabled.
     */
    public void set_template_state(java.lang.String[] template_names, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets a string property values of the specified monitor templates.
     */
    public void set_template_string_property(java.lang.String[] template_names, iControl.GlobalLBMonitorStringValue[] values) throws java.rmi.RemoteException;

    /**
     * Sets the transparent mode states of the specified monitor templates.
     * Transparent mode is used when a user has to go through a firewall
     * to do monitoring.
     */
    public void set_template_transparent_mode(java.lang.String[] template_names, boolean[] transparent_modes) throws java.rmi.RemoteException;

    /**
     * Sets the user-defined string property values of the specified
     * monitor templates.  The user-defined string property is an
     *  arbitrary name/value pair used as configuration information for the
     * monitor.  Only certain monitors accept such user-defined properties
     * and the meaning of these name/value pairs is dependent on the
     *  specific monitor.
     */
    public void set_template_user_defined_string_property(java.lang.String[] template_names, iControl.GlobalLBMonitorUserDefinedStringValue[] values) throws java.rmi.RemoteException;
}
