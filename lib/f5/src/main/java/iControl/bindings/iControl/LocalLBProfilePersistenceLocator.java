/**
 * LocalLBProfilePersistenceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBProfilePersistenceLocator extends org.apache.axis.client.Service implements iControl.LocalLBProfilePersistence {

/**
 * The ProfilePersistence interface enables you to manipulate a local
 * load balancer's Persistence profile.
 */

    public LocalLBProfilePersistenceLocator() {
    }


    public LocalLBProfilePersistenceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LocalLBProfilePersistenceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LocalLBProfilePersistencePort
    private java.lang.String LocalLBProfilePersistencePort_address = "https://url_to_service";

    public java.lang.String getLocalLBProfilePersistencePortAddress() {
        return LocalLBProfilePersistencePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LocalLBProfilePersistencePortWSDDServiceName = "LocalLB.ProfilePersistencePort";

    public java.lang.String getLocalLBProfilePersistencePortWSDDServiceName() {
        return LocalLBProfilePersistencePortWSDDServiceName;
    }

    public void setLocalLBProfilePersistencePortWSDDServiceName(java.lang.String name) {
        LocalLBProfilePersistencePortWSDDServiceName = name;
    }

    public iControl.LocalLBProfilePersistencePortType getLocalLBProfilePersistencePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LocalLBProfilePersistencePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLocalLBProfilePersistencePort(endpoint);
    }

    public iControl.LocalLBProfilePersistencePortType getLocalLBProfilePersistencePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.LocalLBProfilePersistenceBindingStub _stub = new iControl.LocalLBProfilePersistenceBindingStub(portAddress, this);
            _stub.setPortName(getLocalLBProfilePersistencePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLocalLBProfilePersistencePortEndpointAddress(java.lang.String address) {
        LocalLBProfilePersistencePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.LocalLBProfilePersistencePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.LocalLBProfilePersistenceBindingStub _stub = new iControl.LocalLBProfilePersistenceBindingStub(new java.net.URL(LocalLBProfilePersistencePort_address), this);
                _stub.setPortName(getLocalLBProfilePersistencePortWSDDServiceName());
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
        if ("LocalLB.ProfilePersistencePort".equals(inputPortName)) {
            return getLocalLBProfilePersistencePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfilePersistence");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfilePersistencePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LocalLBProfilePersistencePort".equals(portName)) {
            setLocalLBProfilePersistencePortEndpointAddress(address);
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
