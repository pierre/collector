/**
 * LocalLBClassLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBClassLocator extends org.apache.axis.client.Service implements iControl.LocalLBClass {

/**
 * The Class interface enables you to manipulate a local load balancer's
 * Class attributes. 
 *  There are 3 different Class types: Address, String, and Value.
 */

    public LocalLBClassLocator() {
    }


    public LocalLBClassLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LocalLBClassLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LocalLBClassPort
    private java.lang.String LocalLBClassPort_address = "https://url_to_service";

    public java.lang.String getLocalLBClassPortAddress() {
        return LocalLBClassPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LocalLBClassPortWSDDServiceName = "LocalLB.ClassPort";

    public java.lang.String getLocalLBClassPortWSDDServiceName() {
        return LocalLBClassPortWSDDServiceName;
    }

    public void setLocalLBClassPortWSDDServiceName(java.lang.String name) {
        LocalLBClassPortWSDDServiceName = name;
    }

    public iControl.LocalLBClassPortType getLocalLBClassPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LocalLBClassPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLocalLBClassPort(endpoint);
    }

    public iControl.LocalLBClassPortType getLocalLBClassPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.LocalLBClassBindingStub _stub = new iControl.LocalLBClassBindingStub(portAddress, this);
            _stub.setPortName(getLocalLBClassPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLocalLBClassPortEndpointAddress(java.lang.String address) {
        LocalLBClassPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.LocalLBClassPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.LocalLBClassBindingStub _stub = new iControl.LocalLBClassBindingStub(new java.net.URL(LocalLBClassPort_address), this);
                _stub.setPortName(getLocalLBClassPortWSDDServiceName());
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
        if ("LocalLB.ClassPort".equals(inputPortName)) {
            return getLocalLBClassPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "LocalLB.Class");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ClassPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LocalLBClassPort".equals(portName)) {
            setLocalLBClassPortEndpointAddress(address);
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
