/**
 * ManagementZone.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementZone extends javax.xml.rpc.Service {

/**
 * The Zone interface enables the user to perform "zone" operations
 * on a dns database
 */
    public java.lang.String getManagementZonePortAddress();

    public iControl.ManagementZonePortType getManagementZonePort() throws javax.xml.rpc.ServiceException;

    public iControl.ManagementZonePortType getManagementZonePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
