/**
 * GlobalLBWideIP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface GlobalLBWideIP extends javax.xml.rpc.Service {

/**
 * The WideIP interface enables you to work with wide IPs, as well
 * as with the pools and the virtual servers 
 *  that make them up.  For example, use the WideIP interface to get
 * a list of wide IPs, to add a wide IP, or 
 *  to remove a wide IP.
 */
    public java.lang.String getGlobalLBWideIPPortAddress();

    public iControl.GlobalLBWideIPPortType getGlobalLBWideIPPort() throws javax.xml.rpc.ServiceException;

    public iControl.GlobalLBWideIPPortType getGlobalLBWideIPPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
