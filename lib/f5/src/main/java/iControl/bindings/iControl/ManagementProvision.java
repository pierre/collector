/**
 * ManagementProvision.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementProvision extends javax.xml.rpc.Service {

/**
 * The Provision interface manages the partitioning of system memory,
 * disk
 *  space, and CPU usage among the modules (e.g., LTM, GTM, WOM) licensed
 * to run on the system.  The modules and the "host" system (everything
 * not dedicated to network traffic processing) are first assigned a
 *  minimal set of resources, based on pre-determined values and the
 *  available system memory.  The remaining resources are distributed
 * among
 *  the modules, according to pre-determined rules, which can be modified
 * by values which can be set via this iControl interface.  The
 *  pre-defined module resource allocation handles a wide variety of
 *  circumstances, so this allocation should only need to be changed
 * for
 *  unusual circumstances, such as turning modules on or off and large
 * network traffic or configurations.
 */
    public java.lang.String getManagementProvisionPortAddress();

    public iControl.ManagementProvisionPortType getManagementProvisionPort() throws javax.xml.rpc.ServiceException;

    public iControl.ManagementProvisionPortType getManagementProvisionPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
