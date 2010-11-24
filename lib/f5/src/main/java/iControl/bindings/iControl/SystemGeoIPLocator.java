/**
 * SystemGeoIPLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class SystemGeoIPLocator extends org.apache.axis.client.Service implements iControl.SystemGeoIP {

/**
 * The GeoIP interface enables you to maintain the GeoIP location
 *  database.  The location database maps IP addresses to
 *  geographical locations.
 */

    public SystemGeoIPLocator() {
    }


    public SystemGeoIPLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SystemGeoIPLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SystemGeoIPPort
    private java.lang.String SystemGeoIPPort_address = "https://url_to_service";

    public java.lang.String getSystemGeoIPPortAddress() {
        return SystemGeoIPPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SystemGeoIPPortWSDDServiceName = "System.GeoIPPort";

    public java.lang.String getSystemGeoIPPortWSDDServiceName() {
        return SystemGeoIPPortWSDDServiceName;
    }

    public void setSystemGeoIPPortWSDDServiceName(java.lang.String name) {
        SystemGeoIPPortWSDDServiceName = name;
    }

    public iControl.SystemGeoIPPortType getSystemGeoIPPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SystemGeoIPPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSystemGeoIPPort(endpoint);
    }

    public iControl.SystemGeoIPPortType getSystemGeoIPPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.SystemGeoIPBindingStub _stub = new iControl.SystemGeoIPBindingStub(portAddress, this);
            _stub.setPortName(getSystemGeoIPPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSystemGeoIPPortEndpointAddress(java.lang.String address) {
        SystemGeoIPPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.SystemGeoIPPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.SystemGeoIPBindingStub _stub = new iControl.SystemGeoIPBindingStub(new java.net.URL(SystemGeoIPPort_address), this);
                _stub.setPortName(getSystemGeoIPPortWSDDServiceName());
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
        if ("System.GeoIPPort".equals(inputPortName)) {
            return getSystemGeoIPPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "System.GeoIP");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "System.GeoIPPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SystemGeoIPPort".equals(portName)) {
            setSystemGeoIPPortEndpointAddress(address);
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
