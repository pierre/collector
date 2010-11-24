/**
 * LocalLBProfileHttpClassLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBProfileHttpClassLocator extends org.apache.axis.client.Service implements iControl.LocalLBProfileHttpClass {

/**
 * The ProfileHttpClass interface enables you to manipulate a local
 * load balancer's
 *  ability to classify HTTP traffic.
 */

    public LocalLBProfileHttpClassLocator() {
    }


    public LocalLBProfileHttpClassLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LocalLBProfileHttpClassLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LocalLBProfileHttpClassPort
    private java.lang.String LocalLBProfileHttpClassPort_address = "https://url_to_service";

    public java.lang.String getLocalLBProfileHttpClassPortAddress() {
        return LocalLBProfileHttpClassPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LocalLBProfileHttpClassPortWSDDServiceName = "LocalLB.ProfileHttpClassPort";

    public java.lang.String getLocalLBProfileHttpClassPortWSDDServiceName() {
        return LocalLBProfileHttpClassPortWSDDServiceName;
    }

    public void setLocalLBProfileHttpClassPortWSDDServiceName(java.lang.String name) {
        LocalLBProfileHttpClassPortWSDDServiceName = name;
    }

    public iControl.LocalLBProfileHttpClassPortType getLocalLBProfileHttpClassPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LocalLBProfileHttpClassPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLocalLBProfileHttpClassPort(endpoint);
    }

    public iControl.LocalLBProfileHttpClassPortType getLocalLBProfileHttpClassPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.LocalLBProfileHttpClassBindingStub _stub = new iControl.LocalLBProfileHttpClassBindingStub(portAddress, this);
            _stub.setPortName(getLocalLBProfileHttpClassPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLocalLBProfileHttpClassPortEndpointAddress(java.lang.String address) {
        LocalLBProfileHttpClassPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.LocalLBProfileHttpClassPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.LocalLBProfileHttpClassBindingStub _stub = new iControl.LocalLBProfileHttpClassBindingStub(new java.net.URL(LocalLBProfileHttpClassPort_address), this);
                _stub.setPortName(getLocalLBProfileHttpClassPortWSDDServiceName());
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
        if ("LocalLB.ProfileHttpClassPort".equals(inputPortName)) {
            return getLocalLBProfileHttpClassPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileHttpClass");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileHttpClassPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LocalLBProfileHttpClassPort".equals(portName)) {
            setLocalLBProfileHttpClassPortEndpointAddress(address);
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
