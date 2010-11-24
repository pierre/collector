/**
 * ManagementOCSPResponder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementOCSPResponder extends javax.xml.rpc.Service {

/**
 * The OCSPResponder interface enables you to manage OCSP responder
 * configuration.
 */
    public java.lang.String getManagementOCSPResponderPortAddress();

    public iControl.ManagementOCSPResponderPortType getManagementOCSPResponderPort() throws javax.xml.rpc.ServiceException;

    public iControl.ManagementOCSPResponderPortType getManagementOCSPResponderPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
