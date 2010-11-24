/**
 * LTConfigClassLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LTConfigClassLocator extends org.apache.axis.client.Service implements iControl.LTConfigClass {

/**
 * The Class interface enables you to manage classes and class
 *  instances in the Loosely-Typed Configuration system.
 */

    public LTConfigClassLocator() {
    }


    public LTConfigClassLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LTConfigClassLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LTConfigClassPort
    private java.lang.String LTConfigClassPort_address = "https://url_to_service";

    public java.lang.String getLTConfigClassPortAddress() {
        return LTConfigClassPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LTConfigClassPortWSDDServiceName = "LTConfig.ClassPort";

    public java.lang.String getLTConfigClassPortWSDDServiceName() {
        return LTConfigClassPortWSDDServiceName;
    }

    public void setLTConfigClassPortWSDDServiceName(java.lang.String name) {
        LTConfigClassPortWSDDServiceName = name;
    }

    public iControl.LTConfigClassPortType getLTConfigClassPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LTConfigClassPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLTConfigClassPort(endpoint);
    }

    public iControl.LTConfigClassPortType getLTConfigClassPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.LTConfigClassBindingStub _stub = new iControl.LTConfigClassBindingStub(portAddress, this);
            _stub.setPortName(getLTConfigClassPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLTConfigClassPortEndpointAddress(java.lang.String address) {
        LTConfigClassPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.LTConfigClassPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.LTConfigClassBindingStub _stub = new iControl.LTConfigClassBindingStub(new java.net.URL(LTConfigClassPort_address), this);
                _stub.setPortName(getLTConfigClassPortWSDDServiceName());
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
        if ("LTConfig.ClassPort".equals(inputPortName)) {
            return getLTConfigClassPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "LTConfig.Class");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "LTConfig.ClassPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LTConfigClassPort".equals(portName)) {
            setLTConfigClassPortEndpointAddress(address);
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
