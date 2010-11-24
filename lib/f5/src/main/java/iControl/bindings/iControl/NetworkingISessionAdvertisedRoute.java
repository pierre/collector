/**
 * NetworkingISessionAdvertisedRoute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingISessionAdvertisedRoute extends javax.xml.rpc.Service {

/**
 * The iSession AdvertisedRoute interface enables you to work with
 * the definitions and 
 *  attributes contained in a device's optimized endpoint subnets.
 */
    public java.lang.String getNetworkingISessionAdvertisedRoutePortAddress();

    public iControl.NetworkingISessionAdvertisedRoutePortType getNetworkingISessionAdvertisedRoutePort() throws javax.xml.rpc.ServiceException;

    public iControl.NetworkingISessionAdvertisedRoutePortType getNetworkingISessionAdvertisedRoutePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
