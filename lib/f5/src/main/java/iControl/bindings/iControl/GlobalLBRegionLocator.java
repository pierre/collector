/**
 * GlobalLBRegionLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBRegionLocator extends org.apache.axis.client.Service implements iControl.GlobalLBRegion {

/**
 * The Region interface enables you to work with user-defined region
 * definitions.
 */

    public GlobalLBRegionLocator() {
    }


    public GlobalLBRegionLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GlobalLBRegionLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GlobalLBRegionPort
    private java.lang.String GlobalLBRegionPort_address = "https://url_to_service";

    public java.lang.String getGlobalLBRegionPortAddress() {
        return GlobalLBRegionPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GlobalLBRegionPortWSDDServiceName = "GlobalLB.RegionPort";

    public java.lang.String getGlobalLBRegionPortWSDDServiceName() {
        return GlobalLBRegionPortWSDDServiceName;
    }

    public void setGlobalLBRegionPortWSDDServiceName(java.lang.String name) {
        GlobalLBRegionPortWSDDServiceName = name;
    }

    public iControl.GlobalLBRegionPortType getGlobalLBRegionPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GlobalLBRegionPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGlobalLBRegionPort(endpoint);
    }

    public iControl.GlobalLBRegionPortType getGlobalLBRegionPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.GlobalLBRegionBindingStub _stub = new iControl.GlobalLBRegionBindingStub(portAddress, this);
            _stub.setPortName(getGlobalLBRegionPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGlobalLBRegionPortEndpointAddress(java.lang.String address) {
        GlobalLBRegionPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.GlobalLBRegionPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.GlobalLBRegionBindingStub _stub = new iControl.GlobalLBRegionBindingStub(new java.net.URL(GlobalLBRegionPort_address), this);
                _stub.setPortName(getGlobalLBRegionPortWSDDServiceName());
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
        if ("GlobalLB.RegionPort".equals(inputPortName)) {
            return getGlobalLBRegionPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "GlobalLB.Region");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.RegionPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GlobalLBRegionPort".equals(portName)) {
            setGlobalLBRegionPortEndpointAddress(address);
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
