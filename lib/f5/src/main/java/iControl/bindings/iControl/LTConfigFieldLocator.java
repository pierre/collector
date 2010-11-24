/**
 * LTConfigFieldLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LTConfigFieldLocator extends org.apache.axis.client.Service implements iControl.LTConfigField {

/**
 * The Field interface enables you to manage fields and field
 *  instances in the Loosely-Typed Configuration system.
 */

    public LTConfigFieldLocator() {
    }


    public LTConfigFieldLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LTConfigFieldLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LTConfigFieldPort
    private java.lang.String LTConfigFieldPort_address = "https://url_to_service";

    public java.lang.String getLTConfigFieldPortAddress() {
        return LTConfigFieldPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LTConfigFieldPortWSDDServiceName = "LTConfig.FieldPort";

    public java.lang.String getLTConfigFieldPortWSDDServiceName() {
        return LTConfigFieldPortWSDDServiceName;
    }

    public void setLTConfigFieldPortWSDDServiceName(java.lang.String name) {
        LTConfigFieldPortWSDDServiceName = name;
    }

    public iControl.LTConfigFieldPortType getLTConfigFieldPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LTConfigFieldPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLTConfigFieldPort(endpoint);
    }

    public iControl.LTConfigFieldPortType getLTConfigFieldPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.LTConfigFieldBindingStub _stub = new iControl.LTConfigFieldBindingStub(portAddress, this);
            _stub.setPortName(getLTConfigFieldPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLTConfigFieldPortEndpointAddress(java.lang.String address) {
        LTConfigFieldPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.LTConfigFieldPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.LTConfigFieldBindingStub _stub = new iControl.LTConfigFieldBindingStub(new java.net.URL(LTConfigFieldPort_address), this);
                _stub.setPortName(getLTConfigFieldPortWSDDServiceName());
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
        if ("LTConfig.FieldPort".equals(inputPortName)) {
            return getLTConfigFieldPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "LTConfig.Field");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "LTConfig.FieldPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LTConfigFieldPort".equals(portName)) {
            setLTConfigFieldPortEndpointAddress(address);
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
