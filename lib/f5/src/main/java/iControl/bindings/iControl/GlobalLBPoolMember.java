/**
 * GlobalLBPoolMember.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface GlobalLBPoolMember extends javax.xml.rpc.Service {

/**
 * The PoolMember interface enables you to work with the pool members
 * and their settings, and statistics.
 */
    public java.lang.String getGlobalLBPoolMemberPortAddress();

    public iControl.GlobalLBPoolMemberPortType getGlobalLBPoolMemberPort() throws javax.xml.rpc.ServiceException;

    public iControl.GlobalLBPoolMemberPortType getGlobalLBPoolMemberPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
