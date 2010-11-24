/**
 * ASMPolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ASMPolicy extends javax.xml.rpc.Service {

/**
 * The Policy interface enables you to manipulate a policy.
 */
    public java.lang.String getASMPolicyPortAddress();

    public iControl.ASMPolicyPortType getASMPolicyPort() throws javax.xml.rpc.ServiceException;

    public iControl.ASMPolicyPortType getASMPolicyPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
