/**
 * ManagementResourceRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementResourceRecord extends javax.xml.rpc.Service {

/**
 * The ResourceRecord interface contains all the calls necessary for
 * manipulating 
 *  Resource Records: adding/deleting/updating
 */
    public java.lang.String getManagementResourceRecordPortAddress();

    public iControl.ManagementResourceRecordPortType getManagementResourceRecordPort() throws javax.xml.rpc.ServiceException;

    public iControl.ManagementResourceRecordPortType getManagementResourceRecordPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
