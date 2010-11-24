/**
 * LocalLBProfileHttpClass.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBProfileHttpClass extends javax.xml.rpc.Service {

/**
 * The ProfileHttpClass interface enables you to manipulate a local
 * load balancer's
 *  ability to classify HTTP traffic.
 */
    public java.lang.String getLocalLBProfileHttpClassPortAddress();

    public iControl.LocalLBProfileHttpClassPortType getLocalLBProfileHttpClassPort() throws javax.xml.rpc.ServiceException;

    public iControl.LocalLBProfileHttpClassPortType getLocalLBProfileHttpClassPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
