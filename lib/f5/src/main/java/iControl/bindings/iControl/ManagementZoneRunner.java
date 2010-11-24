/**
 * ManagementZoneRunner.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementZoneRunner extends javax.xml.rpc.Service {

/**
 * The ZoneRunner interface handles all the top level calls
 */
    public java.lang.String getManagementZoneRunnerPortAddress();

    public iControl.ManagementZoneRunnerPortType getManagementZoneRunnerPort() throws javax.xml.rpc.ServiceException;

    public iControl.ManagementZoneRunnerPortType getManagementZoneRunnerPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
