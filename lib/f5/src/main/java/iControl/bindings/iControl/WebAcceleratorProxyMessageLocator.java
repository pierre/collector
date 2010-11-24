/**
 * WebAcceleratorProxyMessageLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class WebAcceleratorProxyMessageLocator extends org.apache.axis.client.Service implements iControl.WebAcceleratorProxyMessage {

/**
 * The ProxyMessage interface enables you to send Invalidations to
 * the WAM on the other Active BIG-IP to invalidate content.
 */

    public WebAcceleratorProxyMessageLocator() {
    }


    public WebAcceleratorProxyMessageLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebAcceleratorProxyMessageLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WebAcceleratorProxyMessagePort
    private java.lang.String WebAcceleratorProxyMessagePort_address = "https://theboss.dev.net:443/iControl/iControlPortal.cgi";

    public java.lang.String getWebAcceleratorProxyMessagePortAddress() {
        return WebAcceleratorProxyMessagePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WebAcceleratorProxyMessagePortWSDDServiceName = "WebAccelerator.ProxyMessagePort";

    public java.lang.String getWebAcceleratorProxyMessagePortWSDDServiceName() {
        return WebAcceleratorProxyMessagePortWSDDServiceName;
    }

    public void setWebAcceleratorProxyMessagePortWSDDServiceName(java.lang.String name) {
        WebAcceleratorProxyMessagePortWSDDServiceName = name;
    }

    public iControl.WebAcceleratorProxyMessagePortType getWebAcceleratorProxyMessagePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WebAcceleratorProxyMessagePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWebAcceleratorProxyMessagePort(endpoint);
    }

    public iControl.WebAcceleratorProxyMessagePortType getWebAcceleratorProxyMessagePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.WebAcceleratorProxyMessageBindingStub _stub = new iControl.WebAcceleratorProxyMessageBindingStub(portAddress, this);
            _stub.setPortName(getWebAcceleratorProxyMessagePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWebAcceleratorProxyMessagePortEndpointAddress(java.lang.String address) {
        WebAcceleratorProxyMessagePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.WebAcceleratorProxyMessagePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.WebAcceleratorProxyMessageBindingStub _stub = new iControl.WebAcceleratorProxyMessageBindingStub(new java.net.URL(WebAcceleratorProxyMessagePort_address), this);
                _stub.setPortName(getWebAcceleratorProxyMessagePortWSDDServiceName());
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
        if ("WebAccelerator.ProxyMessagePort".equals(inputPortName)) {
            return getWebAcceleratorProxyMessagePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "WebAccelerator.ProxyMessage");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "WebAccelerator.ProxyMessagePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WebAcceleratorProxyMessagePort".equals(portName)) {
            setWebAcceleratorProxyMessagePortEndpointAddress(address);
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
