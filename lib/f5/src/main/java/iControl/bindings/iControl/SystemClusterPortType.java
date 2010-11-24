/**
 * SystemClusterPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface SystemClusterPortType extends java.rmi.Remote {

    /**
     * Gets the cluster enabled states.
     */
    public iControl.CommonEnabledState[] get_cluster_enabled_state(java.lang.String[] cluster_names) throws java.rmi.RemoteException;

    /**
     * Gets the cluster high-availability states.
     */
    public iControl.CommonHAState[] get_cluster_ha_state(java.lang.String[] cluster_names) throws java.rmi.RemoteException;

    /**
     * Gets the primary slot numbers.
     */
    public long[] get_current_primary_slot(java.lang.String[] cluster_names) throws java.rmi.RemoteException;

    /**
     * Gets a list of the cluster names.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the cluster member enabled states.
     */
    public iControl.CommonEnabledState[][] get_member_enabled_state(java.lang.String[] cluster_names, long[][] slot_ids) throws java.rmi.RemoteException;

    /**
     * Gets the cluster member high-availability states.
     */
    public iControl.CommonHAState[][] get_member_ha_state(java.lang.String[] cluster_names, long[][] slot_ids) throws java.rmi.RemoteException;

    /**
     * Gets the cluster member licensed states.
     */
    public iControl.CommonEnabledState[][] get_member_licensed_state(java.lang.String[] cluster_names, long[][] slot_ids) throws java.rmi.RemoteException;

    /**
     * Gets the cluster member priming states.
     */
    public iControl.CommonEnabledState[][] get_member_priming_state(java.lang.String[] cluster_names, long[][] slot_ids) throws java.rmi.RemoteException;

    /**
     * Gets the minimum up members values.
     */
    public long[] get_min_up_members(java.lang.String[] cluster_names) throws java.rmi.RemoteException;

    /**
     * Gets the cluster minimum up members actions.
     */
    public iControl.CommonHAAction[] get_min_up_members_action(java.lang.String[] cluster_names) throws java.rmi.RemoteException;

    /**
     * Gets the cluster minimum up members enabled states.
     */
    public iControl.CommonEnabledState[] get_min_up_members_state(java.lang.String[] cluster_names) throws java.rmi.RemoteException;

    /**
     * Get a list of list of slot ids (the size of each list is the
     * number of slots).
     */
    public long[][] get_slot_id(java.lang.String[] cluster_names) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Checks to see whether the system is a clustered environment.
     */
    public boolean is_clustered_environment() throws java.rmi.RemoteException;

    /**
     * Sets the cluster enabled states.
     */
    public void set_cluster_enabled_state(java.lang.String[] cluster_names, iControl.CommonEnabledState[] cluster_states) throws java.rmi.RemoteException;

    /**
     * Currently this is not implemented.
     */
    public void set_current_primary_slot(java.lang.String[] cluster_names, long[] primary_slots) throws java.rmi.RemoteException;

    /**
     * Sets the cluster member enabled states.
     */
    public void set_member_enabled_state(java.lang.String[] cluster_names, long[][] slot_ids, iControl.CommonEnabledState[][] member_states) throws java.rmi.RemoteException;

    /**
     * Sets the cluster member priming states.
     */
    public void set_member_priming_state(java.lang.String[] cluster_names, long[][] slot_ids, iControl.CommonEnabledState[][] priming_states) throws java.rmi.RemoteException;

    /**
     * Sets the minimum up members values.
     */
    public void set_min_up_members(java.lang.String[] cluster_names, long[] min_up_members) throws java.rmi.RemoteException;

    /**
     * Sets the cluster minimum up members actions.
     */
    public void set_min_up_members_action(java.lang.String[] cluster_names, iControl.CommonHAAction[] min_up_actions) throws java.rmi.RemoteException;

    /**
     * Sets the cluster minimum up members enabled states.
     */
    public void set_min_up_members_state(java.lang.String[] cluster_names, iControl.CommonEnabledState[] min_up_states) throws java.rmi.RemoteException;
}
