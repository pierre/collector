/**
 * SystemInetPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface SystemInetPortType extends java.rmi.Remote {

    /**
     * Gets the IP addresses that the device is using as its DNS servers.
     */
    public java.lang.String[] get_dns_server_address() throws java.rmi.RemoteException;

    /**
     * Gets the host name of the device.
     */
    public java.lang.String get_hostname() throws java.rmi.RemoteException;

    /**
     * Gets the IP address/host name that the device is using for
     * its NTP service.
     */
    public java.lang.String[] get_ntp_server_address() throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Translate the specified hostnames to IP addresses.
     */
    public java.lang.String[] hostname_to_ip(java.lang.String[] hostnames) throws java.rmi.RemoteException;

    /**
     * Translate the specified IP addresses into hostnames.
     */
    public java.lang.String[] ip_to_hostname(java.lang.String[] ip_addresses) throws java.rmi.RemoteException;

    /**
     * Translate the specified service names to service numbers. 
     * If a service name can not be translated into
     *  an equivalent service number, a service number of 0 will be returned
     * for that service name.
     */
    public long[] service_name_to_service_number(java.lang.String[] service_names) throws java.rmi.RemoteException;

    /**
     * Translate the specified service numbers into service names.
     * If an service number can not be translated into
     *  an equivalent service name, the string format of the service number
     * will be returned.
     */
    public java.lang.String[] service_number_to_service_name(long[] services) throws java.rmi.RemoteException;

    /**
     * Sets the host name of the device.
     */
    public void set_hostname(java.lang.String hostname) throws java.rmi.RemoteException;

    /**
     * Configures the IP address/host name that the device uses for
     * its NTP service.
     */
    public void set_ntp_server_address(java.lang.String[] ntp_addresses) throws java.rmi.RemoteException;
}
