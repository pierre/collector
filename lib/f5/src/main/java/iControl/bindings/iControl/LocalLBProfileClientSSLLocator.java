/**
 * LocalLBProfileClientSSLLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBProfileClientSSLLocator extends org.apache.axis.client.Service implements iControl.LocalLBProfileClientSSL {

/**
 * The ProfileClientSSL interface enables you to manipulate a local
 * load balancer's client SSL profile.
 */

    public LocalLBProfileClientSSLLocator() {
    }


    public LocalLBProfileClientSSLLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LocalLBProfileClientSSLLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LocalLBProfileClientSSLPort
    private java.lang.String LocalLBProfileClientSSLPort_address = "https://url_to_service";

    public java.lang.String getLocalLBProfileClientSSLPortAddress() {
        return LocalLBProfileClientSSLPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LocalLBProfileClientSSLPortWSDDServiceName = "LocalLB.ProfileClientSSLPort";

    public java.lang.String getLocalLBProfileClientSSLPortWSDDServiceName() {
        return LocalLBProfileClientSSLPortWSDDServiceName;
    }

    public void setLocalLBProfileClientSSLPortWSDDServiceName(java.lang.String name) {
        LocalLBProfileClientSSLPortWSDDServiceName = name;
    }

    public iControl.LocalLBProfileClientSSLPortType getLocalLBProfileClientSSLPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LocalLBProfileClientSSLPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLocalLBProfileClientSSLPort(endpoint);
    }

    public iControl.LocalLBProfileClientSSLPortType getLocalLBProfileClientSSLPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.LocalLBProfileClientSSLBindingStub _stub = new iControl.LocalLBProfileClientSSLBindingStub(portAddress, this);
            _stub.setPortName(getLocalLBProfileClientSSLPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLocalLBProfileClientSSLPortEndpointAddress(java.lang.String address) {
        LocalLBProfileClientSSLPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.LocalLBProfileClientSSLPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.LocalLBProfileClientSSLBindingStub _stub = new iControl.LocalLBProfileClientSSLBindingStub(new java.net.URL(LocalLBProfileClientSSLPort_address), this);
                _stub.setPortName(getLocalLBProfileClientSSLPortWSDDServiceName());
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
        if ("LocalLB.ProfileClientSSLPort".equals(inputPortName)) {
            return getLocalLBProfileClientSSLPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileClientSSL");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileClientSSLPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LocalLBProfileClientSSLPort".equals(portName)) {
            setLocalLBProfileClientSSLPortEndpointAddress(address);
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
