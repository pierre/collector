/**
 * ManagementLicenseAdministrationPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementLicenseAdministrationPortType extends java.rmi.Remote {

    /**
     * Checks to see if the specified registration keys will pass
     * the CRC validation.
     */
    public boolean[] check_registration_key_crc(java.lang.String[] registration_keys) throws java.rmi.RemoteException;

    /**
     * Retrieves the copyright file.
     */
    public byte[] get_copyright_file() throws java.rmi.RemoteException;

    /**
     * Retrieves the EULA agreement file.
     */
    public byte[] get_eula_file() throws java.rmi.RemoteException;

    /**
     * Gets information on when the evaluation license will expire.
     */
    public iControl.ManagementLicenseAdministrationEvaluationExpiration get_evaluation_license_expiration() throws java.rmi.RemoteException;

    /**
     * Checks to see whether the device has been licensed.
     */
    public iControl.CommonEnabledState get_license_activation_status() throws java.rmi.RemoteException;

    /**
     * Retrieves the active license file.
     */
    public byte[] get_license_file() throws java.rmi.RemoteException;

    /**
     * Gets information indicating whether the given modules are enabled
     * in the license.
     *  
     *  Caution!  This enabled state is what is specified in the license
     *  for the modules without regard for whether the module is
     *  provisionable or provisioned under this hardware and configuration.
     * See the Provision interface.
     */
    public iControl.CommonEnabledState[] get_module_enabled_state(iControl.CommonTMOSModule[] modules) throws java.rmi.RemoteException;

    /**
     * Gets information about expiry of the given modules.
     *  
     *  Caution!  The expiry information does not indicate whether a module
     * is provisionable or provisioned.  See the Provision interface.
     * 
     *  Note:  This returns the enabled state as well.  When getting the
     *  module expiry information, we suggest making use of the enabled
     *  state returned here rather than getting enabled state separately.
     */
    public iControl.ManagementLicenseAdministrationModuleExpiry[] get_module_expiry(iControl.CommonTMOSModule[] modules) throws java.rmi.RemoteException;

    /**
     * Gets the module keys used to license the device, including
     *  descriptive information about them.  You will get active
     *  and inactive keys (and the record has a field describing
     *  whether it is active).  See also get_time_limited_module_keys.
     */
    public iControl.ManagementLicenseAdministrationModuleKey[] get_module_keys() throws java.rmi.RemoteException;

    /**
     * Gets the list of registration keys used to license the device.
     * 
     *  This returns the base key first, then add-on keys.  As of
     *  v10.0.0, there are new add-on keys that are time limited;
     *  with this method you can tell they are there but not when
     *  they expire.  If that matters, you should use the newer
     *  method get_time_limited_module_keys.  All of the keys
     *  returned are active keys.
     */
    public java.lang.String[] get_registration_keys() throws java.rmi.RemoteException;

    /**
     * Gets the kernel dossier based on the specified registration
     * keys.
     */
    public java.lang.String get_system_dossier(java.lang.String[] registration_keys) throws java.rmi.RemoteException;

    /**
     * Gets the time limited module keys used to license the
     *  device, including descriptive information about them.  You
     *  will get active and inactive keys (and the record has a
     *  field describing whether it is active).
     */
    public iControl.ManagementLicenseAdministrationTimeLimitedModuleKey[] get_time_limited_module_keys() throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Installs and authorizes the device using the specified stream
     * of license file data.
     */
    public void install_license(byte[] license_file_data) throws java.rmi.RemoteException;

    /**
     * Installs and authorizes the device using the specified license
     * file somewhere on the device.
     */
    public void install_license_from_file(java.lang.String license_file) throws java.rmi.RemoteException;

    /**
     * Checks to see whether the device is running with an evaluation
     * license.
     */
    public boolean is_evaluation_license() throws java.rmi.RemoteException;
}
