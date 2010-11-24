/**
 * ManagementProvisionPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementProvisionPortType extends java.rmi.Remote {

    /**
     * Gets the ratios of CPU usage above the minimum which are allocated
     * to the requested modules.  This value is only meaningful for the
     *  "custom" provisioning level.
     */
    public long[] get_custom_cpu_ratio(iControl.CommonTMOSModule[] modules) throws java.rmi.RemoteException;

    /**
     * Gets the ratios of disk space above the minimum which are allocated
     * to the requested modules.  This value is only meaningful for the
     *  "custom" provisioning level.
     */
    public long[] get_custom_disk_ratio(iControl.CommonTMOSModule[] modules) throws java.rmi.RemoteException;

    /**
     * Gets the ratios of system memory which are allocated to the
     * requested modules.  This value is only meaningful for the "custom"
     * provisioning level.
     */
    public long[] get_custom_memory_ratio(iControl.CommonTMOSModule[] modules) throws java.rmi.RemoteException;

    /**
     * Gets the provisioning level for the requested modules.
     */
    public iControl.ManagementProvisionProvisionLevel[] get_level(iControl.CommonTMOSModule[] modules) throws java.rmi.RemoteException;

    /**
     * Gets all provisionable modules
     */
    public iControl.CommonTMOSModule[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets all provisioned modules, i.e., all modules which have
     *  resources to run on the system, i.e., whose provisioning level is
     * not "none".
     */
    public iControl.CommonTMOSModule[] get_provisioned_list() throws java.rmi.RemoteException;

    /**
     * Gets the version for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Sets the ratios of CPU usage above the minimum levels which
     * are
     *  allocated to the requested modules.  This value is only valid for
     * the "custom" provisioning level.
     */
    public void set_custom_cpu_ratio(iControl.CommonTMOSModule[] modules, long[] ratios) throws java.rmi.RemoteException;

    /**
     * Sets the ratios of disk space above the minimum which are allocated
     * to the requested modules.  This value is only used for the "custom"
     * provisioning level.
     */
    public void set_custom_disk_ratio(iControl.CommonTMOSModule[] modules, long[] ratios) throws java.rmi.RemoteException;

    /**
     * Sets the ratios of system memory above the minimum which are
     * allocated to the requested modules.  This value is only valid for
     *  the "custom" provisioning level.
     */
    public void set_custom_memory_ratio(iControl.CommonTMOSModule[] modules, long[] ratios) throws java.rmi.RemoteException;

    /**
     * Sets the provisioning level for the requested modules.  Changing
     * the level for one module may require modifying the level of another
     * module.  For example, changing one module to "dedicated" requires
     *  setting all others to "none", or setting one module to "custom"
     *  requires setting all other modules to "custom" or "none".  Setting
     * the level of a module to "none" means that the module is not run.
     */
    public void set_level(iControl.CommonTMOSModule[] modules, iControl.ManagementProvisionProvisionLevel[] levels) throws java.rmi.RemoteException;
}
