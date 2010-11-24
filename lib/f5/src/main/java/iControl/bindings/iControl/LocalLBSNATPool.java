/**
 * LocalLBSNATPool.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBSNATPool extends javax.xml.rpc.Service {

/**
 * The SNATPool interface enables you to work with the definitions
 * contained in a local load balancer's SNAT pool,
 *  which is a set of translation addresses.  Either a virtual server,
 * an iRule or a top-level SNAT object can 
 *  reference a SNAT pool.
 */
    public java.lang.String getLocalLBSNATPoolPortAddress();

    public iControl.LocalLBSNATPoolPortType getLocalLBSNATPoolPort() throws javax.xml.rpc.ServiceException;

    public iControl.LocalLBSNATPoolPortType getLocalLBSNATPoolPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
