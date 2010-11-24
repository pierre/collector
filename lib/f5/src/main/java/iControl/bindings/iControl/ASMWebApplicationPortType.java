/**
 * ASMWebApplicationPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ASMWebApplicationPortType extends java.rmi.Remote {

    /**
     * Deletes all disabled web applications.
     */
    public void delete_all_disabled_webapps() throws java.rmi.RemoteException;

    /**
     * Deletes all non-actice policies for web applications. The active
     * policy will not be deleted.
     */
    public void delete_all_non_active_policies(java.lang.String[] webapp_names) throws java.rmi.RemoteException;

    /**
     * Deletes the specified web applications.  Only disabled web
     * applications can be deleted.
     */
    public void delete_webapp(java.lang.String[] webapp_names) throws java.rmi.RemoteException;

    /**
     * Get the active policy for the specified web applications.
     */
    public java.lang.String[] get_active_policy(java.lang.String[] webapp_names) throws java.rmi.RemoteException;

    /**
     * Get the "apply learning" for the specified web applications.
     */
    public iControl.ASMApplyLearning[] get_apply_learning(java.lang.String[] webapp_names) throws java.rmi.RemoteException;

    /**
     * Returns the enabled flag of specified web application.
     */
    public boolean[] get_enabled_state(java.lang.String[] webapp_names) throws java.rmi.RemoteException;

    /**
     * Gets the language for the specified web applications.
     */
    public iControl.ASMWebApplicationLanguage[] get_language(java.lang.String[] webapp_names) throws java.rmi.RemoteException;

    /**
     * Gets a list of all web applications.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Get the logging profile for the specified web applications.
     */
    public java.lang.String[] get_logging_profile(java.lang.String[] webapp_names) throws java.rmi.RemoteException;

    /**
     * Returns a list of the policies associated with the specified
     * web application.
     */
    public java.lang.String[][] get_policy_list(java.lang.String[] webapp_names) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Reconfigures the specified web applications.  This resets all
     * of the web application properties.
     */
    public void reconfigure(java.lang.String[] webapp_names) throws java.rmi.RemoteException;

    /**
     * Set the active policy for the specified web applications.
     *  This applies the specified policy to the enforcer.
     */
    public void set_active_policy(java.lang.String[] webapp_names, java.lang.String[] policy_names) throws java.rmi.RemoteException;

    /**
     * Set the "apply learning" for the specified web applications.
     */
    public void set_apply_learning(java.lang.String[] webapp_names, iControl.ASMApplyLearning[] settings) throws java.rmi.RemoteException;

    /**
     * Set the language for the specified web applications.
     *  Note that the language can only be set once for a web application.
     */
    public void set_language(java.lang.String[] webapp_names, iControl.ASMWebApplicationLanguage[] languages) throws java.rmi.RemoteException;

    /**
     * Confugures the specified web applications in one-step.  
     *  For each web application:
     *  sets the language 
     *  adds a policy created from the specified template
     *  sets the policy active
     *  removes the original default policy
     */
    public void set_language_extended(java.lang.String[] webapp_names, iControl.ASMWebApplicationLanguage[] languages, java.lang.String[] policy_names, iControl.ASMPolicyTemplate[] policy_template_names, long timeout) throws java.rmi.RemoteException;

    /**
     * Set the logging profile for the specified web applications.
     */
    public void set_logging_profile(java.lang.String[] webapp_names, java.lang.String[] logprof_names) throws java.rmi.RemoteException;
}
