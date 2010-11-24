/**
 * SystemInetLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class SystemInetLocator extends org.apache.axis.client.Service implements iControl.SystemInet {

/**
 * The Inet interface exposes the internal API functionality that
 * you can use to manipulate the rc.conf and resolv.conf files.  The
 * ntp.conf file includes the functionality that you can use to set and
 * get the following settings:  host name, IP address (get only), router,
 * NTP server and DNS server.
 */

    public SystemInetLocator() {
    }


    public SystemInetLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SystemInetLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SystemInetPort
    private java.lang.String SystemInetPort_address = "https://url_to_service";

    public java.lang.String getSystemInetPortAddress() {
        return SystemInetPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SystemInetPortWSDDServiceName = "System.InetPort";

    public java.lang.String getSystemInetPortWSDDServiceName() {
        return SystemInetPortWSDDServiceName;
    }

    public void setSystemInetPortWSDDServiceName(java.lang.String name) {
        SystemInetPortWSDDServiceName = name;
    }

    public iControl.SystemInetPortType getSystemInetPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SystemInetPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSystemInetPort(endpoint);
    }

    public iControl.SystemInetPortType getSystemInetPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.SystemInetBindingStub _stub = new iControl.SystemInetBindingStub(portAddress, this);
            _stub.setPortName(getSystemInetPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSystemInetPortEndpointAddress(java.lang.String address) {
        SystemInetPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.SystemInetPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.SystemInetBindingStub _stub = new iControl.SystemInetBindingStub(new java.net.URL(SystemInetPort_address), this);
                _stub.setPortName(getSystemInetPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("System.InetPort".equals(inputPortName)) {
            return getSystemInetPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "System.Inet");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "System.InetPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SystemInetPort".equals(portName)) {
            setSystemInetPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
