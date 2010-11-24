/**
 * LocalLBPoolMember.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBPoolMember extends javax.xml.rpc.Service {

/**
 * The PoolMember interface enables you to work with the pool members
 * and their settings, and statistics.
 */
    public java.lang.String getLocalLBPoolMemberPortAddress();

    public iControl.LocalLBPoolMemberPortType getLocalLBPoolMemberPort() throws javax.xml.rpc.ServiceException;

    public iControl.LocalLBPoolMemberPortType getLocalLBPoolMemberPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
