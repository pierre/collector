/**
 * SystemConfigSync.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface SystemConfigSync extends javax.xml.rpc.Service {

/**
 * The ConfigSync interface enables you to work with configuration
 * files.  For example, use the 
 *  ConfigSync interface to retrieve a configuration file list, roll
 * up and save a specified configuration, 
 *  install a configuration on a device, synchronize configuration setups,
 * roll back a configuration, and 
 *  upload or download a configuration.
 */
    public java.lang.String getSystemConfigSyncPortAddress();

    public iControl.SystemConfigSyncPortType getSystemConfigSyncPort() throws javax.xml.rpc.ServiceException;

    public iControl.SystemConfigSyncPortType getSystemConfigSyncPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
