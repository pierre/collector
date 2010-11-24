/**
 * LTConfigField.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LTConfigField extends javax.xml.rpc.Service {

/**
 * The Field interface enables you to manage fields and field
 *  instances in the Loosely-Typed Configuration system.
 */
    public java.lang.String getLTConfigFieldPortAddress();

    public iControl.LTConfigFieldPortType getLTConfigFieldPort() throws javax.xml.rpc.ServiceException;

    public iControl.LTConfigFieldPortType getLTConfigFieldPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
