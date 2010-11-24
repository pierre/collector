/**
 * SystemGeoIP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface SystemGeoIP extends javax.xml.rpc.Service {

/**
 * The GeoIP interface enables you to maintain the GeoIP location
 *  database.  The location database maps IP addresses to
 *  geographical locations.
 */
    public java.lang.String getSystemGeoIPPortAddress();

    public iControl.SystemGeoIPPortType getSystemGeoIPPort() throws javax.xml.rpc.ServiceException;

    public iControl.SystemGeoIPPortType getSystemGeoIPPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
