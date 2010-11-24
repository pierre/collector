/**
 * GlobalLBDataCenter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface GlobalLBDataCenter extends javax.xml.rpc.Service {

/**
 * The DataCenter interface enables you to manipulate the data center
 * attributes for a Global TM.  
 *  For example, use the DataCenter interface to add or remove a data
 * center, transfer server assignments 
 *  from one data center to another, get and set data center attributes,
 * remove a server from a data center, 
 *  and so on.
 */
    public java.lang.String getGlobalLBDataCenterPortAddress();

    public iControl.GlobalLBDataCenterPortType getGlobalLBDataCenterPort() throws javax.xml.rpc.ServiceException;

    public iControl.GlobalLBDataCenterPortType getGlobalLBDataCenterPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
