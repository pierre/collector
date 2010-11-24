/**
 * ManagementNamedLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementNamedLocator extends org.apache.axis.client.Service implements iControl.ManagementNamed {

/**
 * The Named interface provides the calls to manipulate the named.conf
 * and the named server
 */

    public ManagementNamedLocator() {
    }


    public ManagementNamedLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ManagementNamedLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ManagementNamedPort
    private java.lang.String ManagementNamedPort_address = "https://url_to_service";

    public java.lang.String getManagementNamedPortAddress() {
        return ManagementNamedPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ManagementNamedPortWSDDServiceName = "Management.NamedPort";

    public java.lang.String getManagementNamedPortWSDDServiceName() {
        return ManagementNamedPortWSDDServiceName;
    }

    public void setManagementNamedPortWSDDServiceName(java.lang.String name) {
        ManagementNamedPortWSDDServiceName = name;
    }

    public iControl.ManagementNamedPortType getManagementNamedPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ManagementNamedPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getManagementNamedPort(endpoint);
    }

    public iControl.ManagementNamedPortType getManagementNamedPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.ManagementNamedBindingStub _stub = new iControl.ManagementNamedBindingStub(portAddress, this);
            _stub.setPortName(getManagementNamedPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setManagementNamedPortEndpointAddress(java.lang.String address) {
        ManagementNamedPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.ManagementNamedPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.ManagementNamedBindingStub _stub = new iControl.ManagementNamedBindingStub(new java.net.URL(ManagementNamedPort_address), this);
                _stub.setPortName(getManagementNamedPortWSDDServiceName());
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
        if ("Management.NamedPort".equals(inputPortName)) {
            return getManagementNamedPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "Management.Named");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "Management.NamedPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ManagementNamedPort".equals(portName)) {
            setManagementNamedPortEndpointAddress(address);
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
