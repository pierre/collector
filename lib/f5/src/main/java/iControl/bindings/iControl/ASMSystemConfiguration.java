/**
 * ASMSystemConfiguration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ASMSystemConfiguration extends javax.xml.rpc.Service {

/**
 * The SystemConfiguration interface enables you to manipulate system-wide
 * settings of ASM.
 */
    public java.lang.String getASMSystemConfigurationPortAddress();

    public iControl.ASMSystemConfigurationPortType getASMSystemConfigurationPort() throws javax.xml.rpc.ServiceException;

    public iControl.ASMSystemConfigurationPortType getASMSystemConfigurationPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
