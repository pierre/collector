/**
 * LocalLBProfileDNS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBProfileDNS extends javax.xml.rpc.Service {

/**
 * The ProfileDNS interface enables you to manipulate a local load
 * balancer's DNS profile.
 */
    public java.lang.String getLocalLBProfileDNSPortAddress();

    public iControl.LocalLBProfileDNSPortType getLocalLBProfileDNSPort() throws javax.xml.rpc.ServiceException;

    public iControl.LocalLBProfileDNSPortType getLocalLBProfileDNSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
