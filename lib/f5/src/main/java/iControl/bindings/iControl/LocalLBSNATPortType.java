/**
 * LocalLBSNATPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBSNATPortType extends java.rmi.Remote {

    /**
     * Adds original client addresses to the filters used to match
     * incoming traffic.
     */
    public void add_original_address(java.lang.String[] snats, iControl.LocalLBSNATSNATOriginalAddress[][] addresses) throws java.rmi.RemoteException;

    /**
     * Creates the specified top-level SNAT objects.
     */
    public void create(iControl.LocalLBSNATSNATDefinition[] snats, iControl.LocalLBSNATSNATOriginalAddress[][] original_addresses, iControl.CommonVLANFilterList[] vlans) throws java.rmi.RemoteException;

    /**
     * Deletes all SNATs.
     */
    public void delete_all_snats() throws java.rmi.RemoteException;

    /**
     * Deletes a specified list of SNATs.
     */
    public void delete_snat(java.lang.String[] snats) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for all top-level SNATs.
     */
    public iControl.LocalLBSNATSNATStatistics get_all_statistics() throws java.rmi.RemoteException;

    /**
     * Gets the connection mirror states for a specified SNATs.
     */
    public iControl.CommonEnabledState[] get_connection_mirror_state(java.lang.String[] snats) throws java.rmi.RemoteException;

    /**
     * Gets a list of all top-level SNAT configuration objects.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the list of original client addresses used to filter the
     * traffic to the SNATs.
     */
    public iControl.LocalLBSNATSNATOriginalAddress[][] get_original_address(java.lang.String[] snats) throws java.rmi.RemoteException;

    /**
     * Gets the source port behavior for the specified SNATs.
     */
    public iControl.CommonSourcePortBehavior[] get_source_port_behavior(java.lang.String[] snats) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for a list of top-level SNATs.
     */
    public iControl.LocalLBSNATSNATStatistics get_statistics(java.lang.String[] snats) throws java.rmi.RemoteException;

    /**
     * Gets the translation targets for the specified SNATs. If the
     * target type is SNAT_TYPE_AUTOMAP,
     *  then the translation object should be empty.
     */
    public iControl.LocalLBSNATTranslation[] get_translation_target(java.lang.String[] snats) throws java.rmi.RemoteException;

    /**
     * Get the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Gets the list of VLANs on which access to the specified SNATs
     * is disabled/enabled.
     */
    public iControl.CommonVLANFilterList[] get_vlan(java.lang.String[] snats) throws java.rmi.RemoteException;

    /**
     * Removes all original client addresses in the filters.
     */
    public void remove_all_original_addresses(java.lang.String[] snats) throws java.rmi.RemoteException;

    /**
     * Removes original client addresses from the filters used to
     * match incoming traffic.
     */
    public void remove_original_address(java.lang.String[] snats, iControl.LocalLBSNATSNATOriginalAddress[][] addresses) throws java.rmi.RemoteException;

    /**
     * Resets the statistics for a list of top-level SNATs.
     */
    public void reset_statistics(java.lang.String[] snats) throws java.rmi.RemoteException;

    /**
     * Sets the connection mirror state for the specified SNATs.
     */
    public void set_connection_mirror_state(java.lang.String[] snats, iControl.CommonEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the source port behavior for the specified SNATs.
     */
    public void set_source_port_behavior(java.lang.String[] snats, iControl.CommonSourcePortBehavior[] source_port_behaviors) throws java.rmi.RemoteException;

    /**
     * Sets the translation targets for the specified SNATs. If the
     * target type is SNAT_TYPE_AUTOMAP,
     *  then the translation object should be empty.
     */
    public void set_translation_target(java.lang.String[] snats, iControl.LocalLBSNATTranslation[] targets) throws java.rmi.RemoteException;

    /**
     * Sets the VLANSs on which access to the specified SNATs is disabled/enabled.
     */
    public void set_vlan(java.lang.String[] snats, iControl.CommonVLANFilterList[] vlans) throws java.rmi.RemoteException;
}
