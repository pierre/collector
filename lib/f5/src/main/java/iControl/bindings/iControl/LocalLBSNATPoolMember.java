/**
 * LocalLBSNATPoolMember.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBSNATPoolMember extends javax.xml.rpc.Service {

/**
 * The SNATPoolMember interface enables you to work with the SNATPool
 * members and their settings, and statistics.
 */
    public java.lang.String getLocalLBSNATPoolMemberPortAddress();

    public iControl.LocalLBSNATPoolMemberPortType getLocalLBSNATPoolMemberPort() throws javax.xml.rpc.ServiceException;

    public iControl.LocalLBSNATPoolMemberPortType getLocalLBSNATPoolMemberPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
