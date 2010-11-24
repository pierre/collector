/**
 * SystemServices.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface SystemServices extends javax.xml.rpc.Service {

/**
 * The Services interface enables you to manage the various supported
 * services on the device, such as SSHD, HTTPD, NTPD, SOD....
 */
    public java.lang.String getSystemServicesPortAddress();

    public iControl.SystemServicesPortType getSystemServicesPort() throws javax.xml.rpc.ServiceException;

    public iControl.SystemServicesPortType getSystemServicesPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
