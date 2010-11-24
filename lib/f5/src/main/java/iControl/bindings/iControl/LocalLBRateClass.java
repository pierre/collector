/**
 * LocalLBRateClass.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBRateClass extends javax.xml.rpc.Service {

/**
 * The RateClass interface enables you to work with the definitions
 * and attributes of a rate class class. 
 *  Rate filtering refers to the ability to enforce configurable bandwidth
 * consumption limitations upon 
 *  user-defined traffic classes. The purpose of a Rate class is to allow
 * the network administrator to 
 *  effectively divide a single bandwidth resource through a gateway
 * among preferred applications or traffic 
 *  classes. Rate filtering is somewhat related to packet filtering.
 * The key difference between the two is 
 *  that packet filters seek to enforce an access policy on traffic,
 * and Rate Filter classes seek to enforce a 
 *  throughput policy on traffic.
 */
    public java.lang.String getLocalLBRateClassPortAddress();

    public iControl.LocalLBRateClassPortType getLocalLBRateClassPort() throws javax.xml.rpc.ServiceException;

    public iControl.LocalLBRateClassPortType getLocalLBRateClassPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
