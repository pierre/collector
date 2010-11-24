/**
 * ManagementTMOSModule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementTMOSModule extends javax.xml.rpc.Service {

/**
 * The Module interface enables you to manage the system's TMOS
 *  modules (e.g. LTM, GTM, ASM).  The methods and types here focus
 *  on the modules themselves; some of the specific questions you
 *  might ask about modules are broken out in other places, such as
 *  the Provision or LicenseAdministration interface.
 */
    public java.lang.String getManagementTMOSModulePortAddress();

    public iControl.ManagementTMOSModulePortType getManagementTMOSModulePort() throws javax.xml.rpc.ServiceException;

    public iControl.ManagementTMOSModulePortType getManagementTMOSModulePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
