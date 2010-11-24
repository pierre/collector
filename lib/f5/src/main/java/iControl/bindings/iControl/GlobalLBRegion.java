/**
 * GlobalLBRegion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface GlobalLBRegion extends javax.xml.rpc.Service {

/**
 * The Region interface enables you to work with user-defined region
 * definitions.
 */
    public java.lang.String getGlobalLBRegionPortAddress();

    public iControl.GlobalLBRegionPortType getGlobalLBRegionPort() throws javax.xml.rpc.ServiceException;

    public iControl.GlobalLBRegionPortType getGlobalLBRegionPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
