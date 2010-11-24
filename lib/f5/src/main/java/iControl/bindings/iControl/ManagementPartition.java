/**
 * ManagementPartition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementPartition extends javax.xml.rpc.Service {

/**
 * The Partition interface enables you to manage AuthZ Administrative
 * Partitions, as well
 *  as relationship between users, roles, and their associated partitions.
 */
    public java.lang.String getManagementPartitionPortAddress();

    public iControl.ManagementPartitionPortType getManagementPartitionPort() throws javax.xml.rpc.ServiceException;

    public iControl.ManagementPartitionPortType getManagementPartitionPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
