/**
 * LocalLBNodeAddress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBNodeAddress extends javax.xml.rpc.Service {

/**
 * The NodeAddress interface enables you to work with the states,
 * statistics, limits, availability, ratios, application response deltas,
 * and monitors of a local load balancer's node address.
 */
    public java.lang.String getLocalLBNodeAddressPortAddress();

    public iControl.LocalLBNodeAddressPortType getLocalLBNodeAddressPort() throws javax.xml.rpc.ServiceException;

    public iControl.LocalLBNodeAddressPortType getLocalLBNodeAddressPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
