/**
 * SystemFailover.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface SystemFailover extends javax.xml.rpc.Service {

/**
 * The Failover interface enables you to manipulate a device's fail-over
 * states.  For example, you can get the state, active or standby, 
 *  in which a device is running in a redundant configuration.  You can
 * also switch a device's state from active to standby.
 */
    public java.lang.String getSystemFailoverPortAddress();

    public iControl.SystemFailoverPortType getSystemFailoverPort() throws javax.xml.rpc.ServiceException;

    public iControl.SystemFailoverPortType getSystemFailoverPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
