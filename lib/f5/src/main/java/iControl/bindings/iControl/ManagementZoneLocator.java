/**
 * ManagementZoneLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementZoneLocator extends org.apache.axis.client.Service implements iControl.ManagementZone {

/**
 * The Zone interface enables the user to perform "zone" operations
 * on a dns database
 */

    public ManagementZoneLocator() {
    }


    public ManagementZoneLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ManagementZoneLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ManagementZonePort
    private java.lang.String ManagementZonePort_address = "https://url_to_service";

    public java.lang.String getManagementZonePortAddress() {
        return ManagementZonePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ManagementZonePortWSDDServiceName = "Management.ZonePort";

    public java.lang.String getManagementZonePortWSDDServiceName() {
        return ManagementZonePortWSDDServiceName;
    }

    public void setManagementZonePortWSDDServiceName(java.lang.String name) {
        ManagementZonePortWSDDServiceName = name;
    }

    public iControl.ManagementZonePortType getManagementZonePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ManagementZonePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getManagementZonePort(endpoint);
    }

    public iControl.ManagementZonePortType getManagementZonePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.ManagementZoneBindingStub _stub = new iControl.ManagementZoneBindingStub(portAddress, this);
            _stub.setPortName(getManagementZonePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setManagementZonePortEndpointAddress(java.lang.String address) {
        ManagementZonePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.ManagementZonePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.ManagementZoneBindingStub _stub = new iControl.ManagementZoneBindingStub(new java.net.URL(ManagementZonePort_address), this);
                _stub.setPortName(getManagementZonePortWSDDServiceName());
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
        if ("Management.ZonePort".equals(inputPortName)) {
            return getManagementZonePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "Management.Zone");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "Management.ZonePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ManagementZonePort".equals(portName)) {
            setManagementZonePortEndpointAddress(address);
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
