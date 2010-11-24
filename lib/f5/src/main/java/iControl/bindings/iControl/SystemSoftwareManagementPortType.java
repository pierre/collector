/**
 * SystemSoftwareManagementPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface SystemSoftwareManagementPortType extends java.rmi.Remote {

    /**
     * Cleanup the ramfs mounted at HF_MNT_LOCATION
     */
    public void cleanup_ramfs() throws java.rmi.RemoteException;

    /**
     * Create a RAM disk and return its path to the caller.
     */
    public java.lang.String create_ramfs() throws java.rmi.RemoteException;

    /**
     * Deletes software images from the repository.
     */
    public void delete_software_image(java.lang.String[] image_filenames) throws java.rmi.RemoteException;

    /**
     * Gets the software status for all installation ids.
     * 
     *  This provides a complete picture of software status, for all ids.
     */
    public iControl.SystemSoftwareManagementSoftwareStatus[] get_all_software_status() throws java.rmi.RemoteException;

    /**
     * Gets text which contains boot image information, in the
     *  form of "name=value" pairs.  The text includes information
     *  about what's installed in each of the boot locations in the
     *  device. While this method is not officially deprecated, it
     *  is preferred to use get_software_status, as that method is
     *  a newer method which yields much the same information in
     *  a more rigorous and controlled manner.
     */
    public byte[] get_boot_image_information(boolean save_active_config) throws java.rmi.RemoteException;

    /**
     * Gets the configured default boot location, which will be the
     * location that boots after the system reboots.
     */
    public java.lang.String get_boot_location() throws java.rmi.RemoteException;

    /**
     * Gets the cluster boot location, which will be the location
     * set in the software desired table.
     */
    public java.lang.String get_cluster_boot_location() throws java.rmi.RemoteException;

    /**
     * Gets information on any hotfixes applied to the system.  There
     * may not be
     *  any hotfix installed, in which case the returned sequence is empty.
     */
    public iControl.SystemSoftwareManagementHotFixInformation[] get_hotfix_information() throws java.rmi.RemoteException;

    /**
     * Gets the percent complete of the current live install processes.
     * 
     *  Note: You may wish to use get_software_status instead of
     *  this method as it returns more information, such as the
     *  product, version, and build, along with the "percent
     *  complete"/status field.
     */
    public java.lang.String[] get_live_install_completion(iControl.SystemSoftwareManagementInstallationID[] installation_ids) throws java.rmi.RemoteException;

    /**
     * Gets the RPM packages installed on the device.
     */
    public java.lang.String[] get_rpm_package_information() throws java.rmi.RemoteException;

    /**
     * Gets a list of hotfix information about specific hotfix image
     * in the reporitory.
     */
    public iControl.SystemSoftwareManagementSoftwareRepositoryHotfix[] get_software_hotfix(iControl.SystemSoftwareManagementRepositoryImageID[] imageIDs) throws java.rmi.RemoteException;

    /**
     * Gets a list of hotfix images available in the repository.
     */
    public iControl.SystemSoftwareManagementRepositoryImageID[] get_software_hotfix_list() throws java.rmi.RemoteException;

    /**
     * Gets a list of image information about specific image in the
     * reporitory.
     */
    public iControl.SystemSoftwareManagementSoftwareRepositoryImage[] get_software_image(iControl.SystemSoftwareManagementRepositoryImageID[] imageIDs) throws java.rmi.RemoteException;

    /**
     * Gets a list of software images available in the repository.
     */
    public iControl.SystemSoftwareManagementRepositoryImageID[] get_software_image_list() throws java.rmi.RemoteException;

    /**
     * Gets the software status for given installation ids.
     * 
     *  This provides a complete picture of software status, per id.
     */
    public iControl.SystemSoftwareManagementSoftwareStatus[] get_software_status(iControl.SystemSoftwareManagementInstallationID[] installation_ids) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Checks to see whether the system disks are managed with logical
     * volumes.
     */
    public boolean has_logical_volume_management() throws java.rmi.RemoteException;

    /**
     * Installs the specified hotfixes.
     */
    public void install_hotfix(java.lang.String[] hotfix_files, boolean reboot_system) throws java.rmi.RemoteException;

    /**
     * Calls bigstart stop and installs the specified hotfixes.  Upon
     * completion, if reboot_system
     *  is set to false, bigstart start is called to bring daemons back up.
     */
    public void install_hotfix_no_daemons(java.lang.String[] hotfix_files, boolean reboot_system) throws java.rmi.RemoteException;

    /**
     * Initiates an install of SW images on all blades installed on
     * one chassis.
     */
    public void install_software_image(java.lang.String install_volume, java.lang.String product, java.lang.String version, java.lang.String build) throws java.rmi.RemoteException;

    /**
     * Sets the boot image information and automatically initiates
     * installation based on the 
     *  boot image information.
     */
    public void set_boot_image_information(byte[] boot_image_information) throws java.rmi.RemoteException;

    /**
     * Sets the default boot location, which will be the boot location
     * that boots after the next system reboot.
     *  This version will not work on a clustered system.
     */
    public void set_boot_location(java.lang.String location) throws java.rmi.RemoteException;

    /**
     * Sets the cluster wide boot location, which will be the boot
     * location after the next system reboot.
     *  Starting with BIG-IP version 9.6.0, clustered systems will reboot
     * immediately.
     */
    public void set_cluster_boot_location(java.lang.String location) throws java.rmi.RemoteException;
}
