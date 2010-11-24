/**
 * LocalLBVirtualAddress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBVirtualAddress extends javax.xml.rpc.Service {

/**
 * The VirtualAddress interface enables you to work with the states,
 * statistics, limits, availability, 
 *  and settings of a local load balancer's virtual address.
 */
    public java.lang.String getLocalLBVirtualAddressPortAddress();

    public iControl.LocalLBVirtualAddressPortType getLocalLBVirtualAddressPort() throws javax.xml.rpc.ServiceException;

    public iControl.LocalLBVirtualAddressPortType getLocalLBVirtualAddressPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
