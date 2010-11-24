/**
 * LocalLBClass.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBClass extends javax.xml.rpc.Service {

/**
 * The Class interface enables you to manipulate a local load balancer's
 * Class attributes. 
 *  There are 3 different Class types: Address, String, and Value.
 */
    public java.lang.String getLocalLBClassPortAddress();

    public iControl.LocalLBClassPortType getLocalLBClassPort() throws javax.xml.rpc.ServiceException;

    public iControl.LocalLBClassPortType getLocalLBClassPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
