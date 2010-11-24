/**
 * SystemGeoIPPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface SystemGeoIPPortType extends java.rmi.Remote {

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Loads GeoIP data files into the running configuration. The
     *  directory /shared/GeoIP is used for user files (as opposed
     *  to the information shipped with the system).  The user
     *  files override the system files according to the
     *  preferences shown below.
     *  
     *  Note: You can use the upload_file method (ConfigSync
     *  interface) to get data files to the system.
     * 
     *  The system has the following order of preference when
     *  loading files.
     * 
     *  Order of precedence for IPv4 mapping:
     * 
     *  /shared/GeoIP/GeoIPCity.dat
     *  /shared/GeoIP/GeoIPRegion.dat
     *  /shared/GeoIP/GeoIP.dat
     *  /usr/share/GeoIP/F5GeoIP.dat
     * 
     *  Order of precedence for IPv6 mapping:
     * 
     *  /shared/GeoIP/GeoIPv6.dat
     *  /usr/share/GeoIP/F5GeoIPv6.dat
     * 
     *  ISP:
     * 
     *  /shared/GeoIP/GeoIPISP.dat
     * 
     *  Organization:
     * 
     *  /shared/GeoIP/GeoIPOrg.dat
     */
    public void load() throws java.rmi.RemoteException;
}
