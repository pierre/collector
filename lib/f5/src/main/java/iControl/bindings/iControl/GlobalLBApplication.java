/**
 * GlobalLBApplication.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface GlobalLBApplication extends javax.xml.rpc.Service {

/**
 * The Application interface enables you to work with applications
 * running within Wide IPs.
 */
    public java.lang.String getGlobalLBApplicationPortAddress();

    public iControl.GlobalLBApplicationPortType getGlobalLBApplicationPort() throws javax.xml.rpc.ServiceException;

    public iControl.GlobalLBApplicationPortType getGlobalLBApplicationPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
