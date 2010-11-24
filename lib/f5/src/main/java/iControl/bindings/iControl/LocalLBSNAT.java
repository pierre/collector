/**
 * LocalLBSNAT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBSNAT extends javax.xml.rpc.Service {

/**
 * The SNAT interface enables you to work with the definitions contained
 * in a local load balancer's top-level secure network address 
 *  translations (SNAT) object. The top-level SNAT configuration object
 * is a named object in the definition of a standard or a selective
 *  SNAT.  Standard SNATs translate to a single address, while selective
 * SNATs translate to a pool of translation addresses, i.e. 
 *  SNAT pool.
 */
    public java.lang.String getLocalLBSNATPortAddress();

    public iControl.LocalLBSNATPortType getLocalLBSNATPort() throws javax.xml.rpc.ServiceException;

    public iControl.LocalLBSNATPortType getLocalLBSNATPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
