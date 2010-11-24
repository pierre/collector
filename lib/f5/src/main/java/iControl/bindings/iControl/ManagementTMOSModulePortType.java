/**
 * ManagementTMOSModulePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementTMOSModulePortType extends java.rmi.Remote {

    /**
     * Gets a list of descriptive names for the modules given
     */
    public java.lang.String[] get_descriptive_name(iControl.CommonTMOSModule[] modules) throws java.rmi.RemoteException;

    /**
     * Gets a list of all known modules
     *  
     *  Caution!  The list returned gives all modules known, even if they
     * are not licensed or provisionable on this system.  You could use
     *  this to get a general picture of what modules are possible, but
     *  this list is not specific to the system you have.
     * 
     *  To determine the licensing status of the modules on your system,
     *  see the LicenseAdministration interface.  To determine which
     *  modules are supported (i.e., provisionable) under your system or
     *  currently provisioned to run on your system, see the Provision
     *  interface.
     */
    public iControl.CommonTMOSModule[] get_known_module_list() throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;
}
