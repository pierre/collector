/**
 * ASMWebApplication.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ASMWebApplication extends javax.xml.rpc.Service {

/**
 * The WebApplication interface enables you to manipulate 
 *  ASM Web Applications.
 */
    public java.lang.String getASMWebApplicationPortAddress();

    public iControl.ASMWebApplicationPortType getASMWebApplicationPort() throws javax.xml.rpc.ServiceException;

    public iControl.ASMWebApplicationPortType getASMWebApplicationPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
