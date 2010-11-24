/**
 * ManagementLicenseAdministration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementLicenseAdministration extends javax.xml.rpc.Service {

/**
 * The LicenseAdministration interface exposes methods that enable
 * you to authorize the system,
 *  either manually or in an automated fashion.  This interface allows
 * you to generate license
 *  files, install previously generated licenses, and view other licensing
 * characteristics.
 */
    public java.lang.String getManagementLicenseAdministrationPortAddress();

    public iControl.ManagementLicenseAdministrationPortType getManagementLicenseAdministrationPort() throws javax.xml.rpc.ServiceException;

    public iControl.ManagementLicenseAdministrationPortType getManagementLicenseAdministrationPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
