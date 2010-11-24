/**
 * ASMWebApplicationGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ASMWebApplicationGroup extends javax.xml.rpc.Service {

/**
 * The WebApplicationGroup interface enables you to manipulate a 
 *  group of ASM Web Applications.
 */
    public java.lang.String getASMWebApplicationGroupPortAddress();

    public iControl.ASMWebApplicationGroupPortType getASMWebApplicationGroupPort() throws javax.xml.rpc.ServiceException;

    public iControl.ASMWebApplicationGroupPortType getASMWebApplicationGroupPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
