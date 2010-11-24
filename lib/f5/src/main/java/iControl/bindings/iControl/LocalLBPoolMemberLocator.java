/**
 * LocalLBPoolMemberLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBPoolMemberLocator extends org.apache.axis.client.Service implements iControl.LocalLBPoolMember {

/**
 * The PoolMember interface enables you to work with the pool members
 * and their settings, and statistics.
 */

    public LocalLBPoolMemberLocator() {
    }


    public LocalLBPoolMemberLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LocalLBPoolMemberLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LocalLBPoolMemberPort
    private java.lang.String LocalLBPoolMemberPort_address = "https://url_to_service";

    public java.lang.String getLocalLBPoolMemberPortAddress() {
        return LocalLBPoolMemberPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LocalLBPoolMemberPortWSDDServiceName = "LocalLB.PoolMemberPort";

    public java.lang.String getLocalLBPoolMemberPortWSDDServiceName() {
        return LocalLBPoolMemberPortWSDDServiceName;
    }

    public void setLocalLBPoolMemberPortWSDDServiceName(java.lang.String name) {
        LocalLBPoolMemberPortWSDDServiceName = name;
    }

    public iControl.LocalLBPoolMemberPortType getLocalLBPoolMemberPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LocalLBPoolMemberPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLocalLBPoolMemberPort(endpoint);
    }

    public iControl.LocalLBPoolMemberPortType getLocalLBPoolMemberPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.LocalLBPoolMemberBindingStub _stub = new iControl.LocalLBPoolMemberBindingStub(portAddress, this);
            _stub.setPortName(getLocalLBPoolMemberPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLocalLBPoolMemberPortEndpointAddress(java.lang.String address) {
        LocalLBPoolMemberPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.LocalLBPoolMemberPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.LocalLBPoolMemberBindingStub _stub = new iControl.LocalLBPoolMemberBindingStub(new java.net.URL(LocalLBPoolMemberPort_address), this);
                _stub.setPortName(getLocalLBPoolMemberPortWSDDServiceName());
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
        if ("LocalLB.PoolMemberPort".equals(inputPortName)) {
            return getLocalLBPoolMemberPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMember");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "LocalLB.PoolMemberPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LocalLBPoolMemberPort".equals(portName)) {
            setLocalLBPoolMemberPortEndpointAddress(address);
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
