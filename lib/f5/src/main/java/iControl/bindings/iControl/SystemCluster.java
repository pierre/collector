/**
 * SystemCluster.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface SystemCluster extends javax.xml.rpc.Service {

/**
 * The Cluster interface enables you to work with the definitions
 * and attributes in a clustered device.
 */
    public java.lang.String getSystemClusterPortAddress();

    public iControl.SystemClusterPortType getSystemClusterPort() throws javax.xml.rpc.ServiceException;

    public iControl.SystemClusterPortType getSystemClusterPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
