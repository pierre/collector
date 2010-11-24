/**
 * SystemInet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface SystemInet extends javax.xml.rpc.Service {

/**
 * The Inet interface exposes the internal API functionality that
 * you can use to manipulate the rc.conf and resolv.conf files.  The
 * ntp.conf file includes the functionality that you can use to set and
 * get the following settings:  host name, IP address (get only), router,
 * NTP server and DNS server.
 */
    public java.lang.String getSystemInetPortAddress();

    public iControl.SystemInetPortType getSystemInetPort() throws javax.xml.rpc.ServiceException;

    public iControl.SystemInetPortType getSystemInetPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
