/**
 * LocalLBNAT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBNAT extends javax.xml.rpc.Service {

/**
 * The NAT interface enables you to work with the statistics and definitions
 * contained in a local load balancer's network address translations
 * (NAT).  For example, use the NAT interface to both get and set the
 * NAT statistics and attributes of a local load balancer.
 */
    public java.lang.String getLocalLBNATPortAddress();

    public iControl.LocalLBNATPortType getLocalLBNATPort() throws javax.xml.rpc.ServiceException;

    public iControl.LocalLBNATPortType getLocalLBNATPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
