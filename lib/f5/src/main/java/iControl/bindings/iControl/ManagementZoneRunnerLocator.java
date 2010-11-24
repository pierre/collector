/**
 * ManagementZoneRunnerLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementZoneRunnerLocator extends org.apache.axis.client.Service implements iControl.ManagementZoneRunner {

/**
 * The ZoneRunner interface handles all the top level calls
 */

    public ManagementZoneRunnerLocator() {
    }


    public ManagementZoneRunnerLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ManagementZoneRunnerLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ManagementZoneRunnerPort
    private java.lang.String ManagementZoneRunnerPort_address = "https://url_to_service";

    public java.lang.String getManagementZoneRunnerPortAddress() {
        return ManagementZoneRunnerPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ManagementZoneRunnerPortWSDDServiceName = "Management.ZoneRunnerPort";

    public java.lang.String getManagementZoneRunnerPortWSDDServiceName() {
        return ManagementZoneRunnerPortWSDDServiceName;
    }

    public void setManagementZoneRunnerPortWSDDServiceName(java.lang.String name) {
        ManagementZoneRunnerPortWSDDServiceName = name;
    }

    public iControl.ManagementZoneRunnerPortType getManagementZoneRunnerPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ManagementZoneRunnerPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getManagementZoneRunnerPort(endpoint);
    }

    public iControl.ManagementZoneRunnerPortType getManagementZoneRunnerPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.ManagementZoneRunnerBindingStub _stub = new iControl.ManagementZoneRunnerBindingStub(portAddress, this);
            _stub.setPortName(getManagementZoneRunnerPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setManagementZoneRunnerPortEndpointAddress(java.lang.String address) {
        ManagementZoneRunnerPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.ManagementZoneRunnerPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.ManagementZoneRunnerBindingStub _stub = new iControl.ManagementZoneRunnerBindingStub(new java.net.URL(ManagementZoneRunnerPort_address), this);
                _stub.setPortName(getManagementZoneRunnerPortWSDDServiceName());
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
        if ("Management.ZoneRunnerPort".equals(inputPortName)) {
            return getManagementZoneRunnerPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "Management.ZoneRunner");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "Management.ZoneRunnerPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ManagementZoneRunnerPort".equals(portName)) {
            setManagementZoneRunnerPortEndpointAddress(address);
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
