/**
 * WebAcceleratorPoliciesLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class WebAcceleratorPoliciesLocator extends org.apache.axis.client.Service implements iControl.WebAcceleratorPolicies {

/**
 * Allows manipulation of Policies.
 */

    public WebAcceleratorPoliciesLocator() {
    }


    public WebAcceleratorPoliciesLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebAcceleratorPoliciesLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WebAcceleratorPoliciesPort
    private java.lang.String WebAcceleratorPoliciesPort_address = "https://url_to_service";

    public java.lang.String getWebAcceleratorPoliciesPortAddress() {
        return WebAcceleratorPoliciesPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WebAcceleratorPoliciesPortWSDDServiceName = "WebAccelerator.PoliciesPort";

    public java.lang.String getWebAcceleratorPoliciesPortWSDDServiceName() {
        return WebAcceleratorPoliciesPortWSDDServiceName;
    }

    public void setWebAcceleratorPoliciesPortWSDDServiceName(java.lang.String name) {
        WebAcceleratorPoliciesPortWSDDServiceName = name;
    }

    public iControl.WebAcceleratorPoliciesPortType getWebAcceleratorPoliciesPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WebAcceleratorPoliciesPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWebAcceleratorPoliciesPort(endpoint);
    }

    public iControl.WebAcceleratorPoliciesPortType getWebAcceleratorPoliciesPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.WebAcceleratorPoliciesBindingStub _stub = new iControl.WebAcceleratorPoliciesBindingStub(portAddress, this);
            _stub.setPortName(getWebAcceleratorPoliciesPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWebAcceleratorPoliciesPortEndpointAddress(java.lang.String address) {
        WebAcceleratorPoliciesPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.WebAcceleratorPoliciesPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.WebAcceleratorPoliciesBindingStub _stub = new iControl.WebAcceleratorPoliciesBindingStub(new java.net.URL(WebAcceleratorPoliciesPort_address), this);
                _stub.setPortName(getWebAcceleratorPoliciesPortWSDDServiceName());
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
        if ("WebAccelerator.PoliciesPort".equals(inputPortName)) {
            return getWebAcceleratorPoliciesPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "WebAccelerator.Policies");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "WebAccelerator.PoliciesPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WebAcceleratorPoliciesPort".equals(portName)) {
            setWebAcceleratorPoliciesPortEndpointAddress(address);
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
