/**
 * LocalLBProfileServerSSLLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBProfileServerSSLLocator extends org.apache.axis.client.Service implements iControl.LocalLBProfileServerSSL {

/**
 * The ProfileServerSSL interface enables you to manipulate a local
 * load balancer's server SSL profile.
 */

    public LocalLBProfileServerSSLLocator() {
    }


    public LocalLBProfileServerSSLLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LocalLBProfileServerSSLLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LocalLBProfileServerSSLPort
    private java.lang.String LocalLBProfileServerSSLPort_address = "https://url_to_service";

    public java.lang.String getLocalLBProfileServerSSLPortAddress() {
        return LocalLBProfileServerSSLPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LocalLBProfileServerSSLPortWSDDServiceName = "LocalLB.ProfileServerSSLPort";

    public java.lang.String getLocalLBProfileServerSSLPortWSDDServiceName() {
        return LocalLBProfileServerSSLPortWSDDServiceName;
    }

    public void setLocalLBProfileServerSSLPortWSDDServiceName(java.lang.String name) {
        LocalLBProfileServerSSLPortWSDDServiceName = name;
    }

    public iControl.LocalLBProfileServerSSLPortType getLocalLBProfileServerSSLPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LocalLBProfileServerSSLPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLocalLBProfileServerSSLPort(endpoint);
    }

    public iControl.LocalLBProfileServerSSLPortType getLocalLBProfileServerSSLPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.LocalLBProfileServerSSLBindingStub _stub = new iControl.LocalLBProfileServerSSLBindingStub(portAddress, this);
            _stub.setPortName(getLocalLBProfileServerSSLPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLocalLBProfileServerSSLPortEndpointAddress(java.lang.String address) {
        LocalLBProfileServerSSLPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.LocalLBProfileServerSSLPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.LocalLBProfileServerSSLBindingStub _stub = new iControl.LocalLBProfileServerSSLBindingStub(new java.net.URL(LocalLBProfileServerSSLPort_address), this);
                _stub.setPortName(getLocalLBProfileServerSSLPortWSDDServiceName());
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
        if ("LocalLB.ProfileServerSSLPort".equals(inputPortName)) {
            return getLocalLBProfileServerSSLPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileServerSSL");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileServerSSLPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LocalLBProfileServerSSLPort".equals(portName)) {
            setLocalLBProfileServerSSLPortEndpointAddress(address);
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
