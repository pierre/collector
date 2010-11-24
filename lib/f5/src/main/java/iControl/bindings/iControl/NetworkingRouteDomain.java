/**
 * NetworkingRouteDomain.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingRouteDomain extends javax.xml.rpc.Service {

/**
 * The RouteDomain interface enables you to work with the
 *  definitions and attributes contained in a device's route
 *  domains.  Route domains allow you to specify overlapping IP
 *  addresses for different objects in the system.  This allows a
 *  service provider, for example, to have two different pool
 *  members at 10.10.10.1 that represent completely different real
 *  servers.  The addresses for the two pool members might be
 *  10.10.10.1%1 and 10.10.10.1%2 where the numbers after the
 *  percent signs are numeric ids of route domains.
 */
    public java.lang.String getNetworkingRouteDomainPortAddress();

    public iControl.NetworkingRouteDomainPortType getNetworkingRouteDomainPort() throws javax.xml.rpc.ServiceException;

    public iControl.NetworkingRouteDomainPortType getNetworkingRouteDomainPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
