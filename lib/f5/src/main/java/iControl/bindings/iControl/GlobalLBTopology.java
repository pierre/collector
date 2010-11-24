/**
 * GlobalLBTopology.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface GlobalLBTopology extends javax.xml.rpc.Service {

/**
 * The Topology interface enables you to work with topology attributes.
 * For example, you can create and 
 *  delete a topology.  You can also use the Topology interface to add
 * virtual server entries to, 
 *  or remove virtual server entries from, a topology.
 */
    public java.lang.String getGlobalLBTopologyPortAddress();

    public iControl.GlobalLBTopologyPortType getGlobalLBTopologyPort() throws javax.xml.rpc.ServiceException;

    public iControl.GlobalLBTopologyPortType getGlobalLBTopologyPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
