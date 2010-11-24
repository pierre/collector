/**
 * SystemConfigSyncPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface SystemConfigSyncPortType extends java.rmi.Remote {

    /**
     * Deletes the specified configuration from the archive directory.
     * If the specified file doesn't exist, an exception will be raised.
     *  The specified configuration should not contain any path information
     * since it is restricted to be in the archive directory.
     *  NOTE: File names containing the following characters will be 
     *  considered invalid: ` ~ / \ : ; * ? " < > | &
     */
    public void delete_configuration(java.lang.String filename) throws java.rmi.RemoteException;

    /**
     * Deletes the specified file from the device.  If the specified
     * file
     *  doesn't exist, an exception will be raised.
     *  NOTE: File names containing the following characters will be 
     *  considered invalid: ` ~ \ : ; * ? " < > | &
     */
    public void delete_file(java.lang.String filename) throws java.rmi.RemoteException;

    /**
     * Downloads the configurations from the device.
     */
    public iControl.SystemConfigSyncFileTransferContext download_configuration(java.lang.String config_name, long chunk_size, javax.xml.rpc.holders.LongHolder file_offset) throws java.rmi.RemoteException;

    /**
     * A generic file download mechanism to download a file from the
     * device.
     */
    public iControl.SystemConfigSyncFileTransferContext download_file(java.lang.String file_name, long chunk_size, javax.xml.rpc.holders.LongHolder file_offset) throws java.rmi.RemoteException;

    /**
     * Gets a list of all available configuration archives on the
     * system.
     */
    public iControl.SystemConfigSyncConfigFileEntry[] get_configuration_list() throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Installs the configurations contained in the specified archive
     * to 
     *  the local device using the 'all' flag.
     */
    public void install_all_configuration(java.lang.String filename) throws java.rmi.RemoteException;

    /**
     * Installs the encrypted configurations contained in the specified
     * archive to 
     *  the local device using the 'all' flag. If the specified archive is
     * not already encrypted, then 
     *  the passphrase is ignored, and installation will take place as normal.
     */
    public void install_all_encrypted_configuration(java.lang.String filename, java.lang.String passphrase) throws java.rmi.RemoteException;

    /**
     * Installs the configurations contained in the specified archive
     * to 
     *  the local device.
     */
    public void install_configuration(java.lang.String filename) throws java.rmi.RemoteException;

    /**
     * Installs the encrypted configurations contained in the specified
     * archive to 
     *  the local device. If the specified archive is not already encrypted,
     * then 
     *  the passphrase is ignored, and installation will take place as normal.
     */
    public void install_encrypted_configuration(java.lang.String filename, java.lang.String passphrase) throws java.rmi.RemoteException;

    /**
     * Load the specified configuration.  If the specified configuration
     * in "filename" is empty,
     *  then by default, /config/bigip.conf will be loaded if the "load_flag"
     * is LOAD_HIGH_LEVEL_CONFIG,
     *  and /config/bigip_base.conf will be loaded if the "load_flag" is
     * LOAD_BASE_LEVEL_CONFIG.
     */
    public void load_configuration(java.lang.String filename, iControl.SystemConfigSyncLoadMode load_flag) throws java.rmi.RemoteException;

    /**
     * A generic file move mechanism to move files on a device.
     *  This call does a rename of the file and will not work across
     *  filesystem boundaries.
     */
    public void move_file(java.lang.String from_path, java.lang.String to_path) throws java.rmi.RemoteException;

    /**
     * Rolls back to the previous configuration.
     */
    public void rollback_configuration() throws java.rmi.RemoteException;

    /**
     * Saves the current configurations to the specified archive.
     *  If the "save_flag" is either SAVE_HIGH_LEVEL_CONFIG or SAVE_BASE_LEVEL_CONFIG,
     * the
     *  specified filename will be ignored, since by default, configuration
     * will be saved into
     *  /config/bigip.conf or /config/bigip_base.conf respectively.
     */
    public void save_configuration(java.lang.String filename, iControl.SystemConfigSyncSaveMode save_flag) throws java.rmi.RemoteException;

    /**
     * Saves and encrypts the current configurations to the specified
     * archive.
     *  This method is used to save whole configuration archive, not just
     * what's
     *  in bigip.conf or bigip_base.conf.
     */
    public void save_encrypted_configuration(java.lang.String filename, java.lang.String passphrase) throws java.rmi.RemoteException;

    /**
     * Saves the current configurations to the specified archive.
     *  If the "save_flag" is either SAVE_HIGH_LEVEL_CONFIG or SAVE_BASE_LEVEL_CONFIG,
     * the
     *  specified filename will be ignored, since by default, configuration
     * will be saved into
     *  /config/bigip.conf or /config/bigip_base.conf respectively.
     *  If any "features_to_exclude" components are specified, those components
     * are excluded from the configuration.
     *  If any "features_to_include" components are specified, those components
     * are included from the configuration.
     *  Note that feature inclusion/exclusion will only work when the
     *  save flag is "SAVE_FULL".
     */
    public void save_partial_configuration(java.lang.String filename, iControl.SystemConfigSyncSaveMode save_flag, iControl.SystemConfigSyncConfigExcludeComponent[] features_to_exclude, iControl.SystemConfigSyncConfigIncludeComponent[] features_to_include) throws java.rmi.RemoteException;

    /**
     * Saves and encrypts the current configurations to the specified
     * archive.
     *  This method is used to save whole configuration archive, not just
     * what's
     *  in bigip.conf or bigip_base.conf.
     *  If any "features_to_exclude" components are specified, those components
     * are excluded from the configuration.
     *  If any "features_to_include" components are specified, those components
     * are included from the configuration.
     *  Note that feature inclusion/exclusion will only work when the
     *  save flag is "SAVE_FULL".
     */
    public void save_partial_encrypted_configuration(java.lang.String filename, java.lang.String passphrase, iControl.SystemConfigSyncConfigExcludeComponent[] features_to_exclude, iControl.SystemConfigSyncConfigIncludeComponent[] features_to_include) throws java.rmi.RemoteException;

    /**
     * Synchronizes the configurations between the two devices in
     * a redundant system.  
     *  In the case of cache devices, synchronizes the configurations across
     * the cluster.
     */
    public void synchronize_configuration(iControl.SystemConfigSyncSyncMode sync_flag) throws java.rmi.RemoteException;

    /**
     * Uploads the configurations to the device.
     */
    public void upload_configuration(java.lang.String config_name, iControl.SystemConfigSyncFileTransferContext file_context) throws java.rmi.RemoteException;

    /**
     * A generic file upload mechanism to transfer a file to the device.
     */
    public void upload_file(java.lang.String file_name, iControl.SystemConfigSyncFileTransferContext file_context) throws java.rmi.RemoteException;
}
