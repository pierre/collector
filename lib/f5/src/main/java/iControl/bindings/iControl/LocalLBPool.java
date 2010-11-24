/**
 * LocalLBPool.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBPool extends javax.xml.rpc.Service {

/**
 * The Pool interface enables you to work with attributes, and statistics
 * for pools.  
 *  You can also use this interface to create pools, add members to a
 * pool, delete members from a pool, 
 *  find out the load balancing mode for a pool, and set the load balancing
 * mode for a pool.
 */
    public java.lang.String getLocalLBPoolPortAddress();

    public iControl.LocalLBPoolPortType getLocalLBPoolPort() throws javax.xml.rpc.ServiceException;

    public iControl.LocalLBPoolPortType getLocalLBPoolPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
