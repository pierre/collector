/**
 * NetworkingRouteTable.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface NetworkingRouteTable extends javax.xml.rpc.Service {

/**
 * The RouteTable interface enables you to work with the Route table
 * and entries.
 */
    public java.lang.String getNetworkingRouteTablePortAddress();

    public iControl.NetworkingRouteTablePortType getNetworkingRouteTablePort() throws javax.xml.rpc.ServiceException;

    public iControl.NetworkingRouteTablePortType getNetworkingRouteTablePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
