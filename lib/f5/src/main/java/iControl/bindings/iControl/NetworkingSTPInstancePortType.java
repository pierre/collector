/**
 * NetworkingSTPInstancePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingSTPInstancePortType extends java.rmi.Remote {

    /**
     * Adds/associates VLANs to the specified spanning tree instances.
     * This method may be used only in MSTP mode.  In STP or RSTP mode, all
     * VLANs 
     *  automatically belong to spanning tree instance 0.
     */
    public void add_vlan(long[] stp_instances, java.lang.String[][] vlan_names) throws java.rmi.RemoteException;

    /**
     * Creates the specified spanning tree instances.
     */
    public void create(long[] stp_instances, long[] priorities, java.lang.String[][] vlan_names) throws java.rmi.RemoteException;

    /**
     * Deletes all spanning tree instances.
     */
    public void delete_all_instances() throws java.rmi.RemoteException;

    /**
     * Deletes the specified spanning tree instances.
     */
    public void delete_instance(long[] stp_instances) throws java.rmi.RemoteException;

    /**
     * Gets the bridge priorities of the specified spanning tree instances.
     * Each bridge in a
     *  spanning tree instance has a priority value, which controls the topoloty
     * of the spanning
     *  tree chosen by the protocol.  The bridge with the lowest priority
     * value will become the
     *  root of the spanning tree. Priority values range from 0-61440 in
     * steps of 4096. Hence,
     *  the supported priorities are:
     *       0       16384       32768       49152
     *    4096       20480       36864       53248
     *    8192       24576       40960       57344
     *   12288       28672       45056       61440
     * 
     *  The default bridge priority is 61440, which will prevent BIGIP from
     * being chosen as the root
     *  bridge.  If the specified bridge priority is not one of the allowed
     * values listed above, it is 
     *  rounded down to the next lower value in the list.
     *  In STP or RSTP mode, only STP intance 0 is valid.
     */
    public long[] get_bridge_priority(long[] stp_instances) throws java.rmi.RemoteException;

    /**
     * Gets the STP active states for the specified STP port objects.
     */
    public iControl.NetworkingSTPInstanceInterfaceSTPState[][] get_interface_active_state(long[] stp_instances, java.lang.String[][] interfaces) throws java.rmi.RemoteException;

    /**
     * Gets the path costs for the specified network interfaces in
     * the specified spanning tree instances. 
     *  An interface path cost represents the relative cost of sending network
     * traffic through that interface.
     *  In calculating the spanning tree, the algorithm tries to minimize
     * the total path cost between each point
     *  and the root bridge.  By manipulating the path costs of different
     * interfaces, it's possible to steer
     *  traffic toward paths that are faster, more reliable, and/or more
     * economical.  Path costs have a range of
     *  1-200,000,000, and the default path cost for an interface is based
     * on the interface's maximum speed (not
     *  the actual speed).
     *       Max interface speed         Default path cost
     *           10 Gb/s                 2,000
     *            1 Gb/s                 20,000
     *          100 Mb/s                 200,000
     *           10 MB/s                 2,000,000
     * 
     *  The default path cost is a function of the interface's maximum speed,
     * not its actual speed, so the default
     *  path cost of a 10/100/1000 Mb/s interface will be 20,000 even if
     * the interface is running at 10 Mb/s.
     *  Changes in link speed don't cause path costs to change.
     *  Link aggregation doesn't affect the default path cost, i.e. a trunk
     * of four 1 Gb/s interfaces will still
     *  have a default path cost of 20,000.
     *  In STP or RSTP mode, only STP intance 0 is valid.
     */
    public iControl.NetworkingSTPInstanceInterfacePathCost[][] get_interface_path_cost(long[] stp_instances, java.lang.String[][] interfaces, iControl.NetworkingSTPInstancePathCostType[][] path_cost_types) throws java.rmi.RemoteException;

    /**
     * Gets the priorities for the specified network interfaces in
     * the specified spanning tree instances. 
     *  These priority values influence which interfaces are chosen to carry
     * network traffic. Interfaces with
     *  numerically lower values are favored to carry traffic. Interface
     * priorities have values in the range 
     *  from 0-240 in steps of 16. Hence, the supported priorities are:
     *       0        64       128       192
     *      16        80       144       208
     *      32        96       160       224
     *      48       112       176       240
     * 
     *  The default interface priority is 128.  If the specified interface
     * priority is not one of the allowed
     *  values listed above, it is rounded down to the next lower value in
     * the list.
     *  In STP or RSTP mode, only STP intance 0 is valid.
     */
    public iControl.NetworkingSTPInstanceInterfacePriority[][] get_interface_priority(long[] stp_instances, java.lang.String[][] interfaces) throws java.rmi.RemoteException;

    /**
     * Gets the STP requested/configured states for the specified
     * STP port objects.
     */
    public iControl.NetworkingSTPInstanceInterfaceSTPState[][] get_interface_requested_state(long[] stp_instances, java.lang.String[][] interfaces) throws java.rmi.RemoteException;

    /**
     * Gets the STP roles for the specified STP port objects.
     */
    public iControl.NetworkingSTPInstanceInterfaceSTPRole[][] get_interface_role(long[] stp_instances, java.lang.String[][] interfaces) throws java.rmi.RemoteException;

    /**
     * Gets a list of all spanning tree instances.
     */
    public long[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the MAC addresses of the regional root bridges.
     */
    public java.lang.String[] get_regional_root_bridge_mac_address(long[] stp_instances) throws java.rmi.RemoteException;

    /**
     * Gets the MAC addresses of the root bridges.
     */
    public java.lang.String[] get_root_bridge_mac_address(long[] stp_instances) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Gets the lists of VLANs the specified spanning tree instances
     * are associated with.
     *  This method may be used only in MSTP mode.  In STP or RSTP mode,
     * all VLANs automatically
     *  belong to spanning tree instance 0.
     */
    public java.lang.String[][] get_vlan(long[] stp_instances) throws java.rmi.RemoteException;

    /**
     * Removes all VLANs from the specified spanning tree instances.
     * This method may be used only in MSTP mode.  In STP or RSTP mode, all
     * VLANs 
     *  automatically belong to spanning tree instance 0, and they can not
     * be deleted
     *  from it.
     */
    public void remove_all_vlans(long[] stp_instances) throws java.rmi.RemoteException;

    /**
     * Removes VLANs from the specified spanning tree instances.
     *  This method may be used only in MSTP mode.  In STP or RSTP mode,
     * all VLANs 
     *  automatically belong to spanning tree instance 0, and they can not
     * be deleted
     *  from it.
     */
    public void remove_vlan(long[] stp_instances, java.lang.String[][] vlan_names) throws java.rmi.RemoteException;

    /**
     * Sets the bridge priorities of the specified spanning tree instances.
     * Each bridge in a
     *  spanning tree instance has a priority value, which controls the topoloty
     * of the spanning
     *  tree chosen by the protocol.  The bridge with the lowest priority
     * value will become the
     *  root of the spanning tree. Priority values range from 0-61440 in
     * steps of 4096. Hence,
     *  the supported priorities are:
     *       0       16384       32768       49152
     *    4096       20480       36864       53248
     *    8192       24576       40960       57344
     *   12288       28672       45056       61440
     * 
     *  The default bridge priority is 61440, which will prevent BIGIP from
     * being chosen as the root
     *  bridge.  If the specified bridge priority is not one of the allowed
     * values listed above, it is 
     *  rounded down to the next lower value in the list.
     *  In STP or RSTP mode, only STP intance 0 is valid.
     */
    public void set_bridge_priority(long[] stp_instances, long[] priorities) throws java.rmi.RemoteException;

    /**
     * Sets the path costs for the specified network interfaces in
     * the specified spanning tree instances. 
     *  An interface path cost represents the relative cost of sending network
     * traffic through that interface.
     *  In calculating the spanning tree, the algorithm tries to minimize
     * the total path cost between each point
     *  and the root bridge.  By manipulating the path costs of different
     * interfaces, it's possible to steer
     *  traffic toward paths that are faster, more reliable, and/or more
     * economical.  Path costs have a range of
     *  1-200,000,000, and the default path cost for an interface is based
     * on the interface's maximum speed (not
     *  the actual speed).
     *       Max interface speed         Default path cost
     *           10 Gb/s                 2,000
     *            1 Gb/s                 20,000
     *          100 Mb/s                 200,000
     *           10 MB/s                 2,000,000
     * 
     *  The default path cost is a function of the interface's maximum speed,
     * not its actual speed, so the default
     *  path cost of a 10/100/1000 Mb/s interface will be 20,000 even if
     * the interface is running at 10 Mb/s.
     *  Changes in link speed don't cause path costs to change.
     *  Link aggregation doesn't affect the default path cost, i.e. a trunk
     * of four 1 Gb/s interfaces will still
     *  have a default path cost of 20,000.
     *  In STP or RSTP mode, only STP intance 0 is valid.
     */
    public void set_interface_path_cost(long[] stp_instances, iControl.NetworkingSTPInstanceInterfacePathCost[][] path_costs) throws java.rmi.RemoteException;

    /**
     * Sets the priorities for the specified network interfaces in
     * the specified spanning tree instances. 
     *  These priority values influence which interfaces are chosen to carry
     * network traffic. Interfaces with
     *  numerically lower values are favored to carry traffic. Interface
     * priorities have values in the range 
     *  from 0-240 in steps of 16. Hence, the supported priorities are:
     *       0        64       128       192
     *      16        80       144       208
     *      32        96       160       224
     *      48       112       176       240
     * 
     *  The default interface priority is 128.  If the specified interface
     * priority is not one of the allowed
     *  values listed above, it is rounded down to the next lower value in
     * the list.
     *  In STP or RSTP mode, only STP intance 0 is valid.
     */
    public void set_interface_priority(long[] stp_instances, iControl.NetworkingSTPInstanceInterfacePriority[][] priorities) throws java.rmi.RemoteException;
}
