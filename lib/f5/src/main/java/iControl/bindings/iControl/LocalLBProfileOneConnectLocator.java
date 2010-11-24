/**
 * LocalLBProfileOneConnectLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBProfileOneConnectLocator extends org.apache.axis.client.Service implements iControl.LocalLBProfileOneConnect {

/**
 * The ProfileOneConnect interface enables you to manipulate a local
 * load balancer's OneConnect profile.
 */

    public LocalLBProfileOneConnectLocator() {
    }


    public LocalLBProfileOneConnectLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LocalLBProfileOneConnectLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LocalLBProfileOneConnectPort
    private java.lang.String LocalLBProfileOneConnectPort_address = "https://url_to_service";

    public java.lang.String getLocalLBProfileOneConnectPortAddress() {
        return LocalLBProfileOneConnectPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LocalLBProfileOneConnectPortWSDDServiceName = "LocalLB.ProfileOneConnectPort";

    public java.lang.String getLocalLBProfileOneConnectPortWSDDServiceName() {
        return LocalLBProfileOneConnectPortWSDDServiceName;
    }

    public void setLocalLBProfileOneConnectPortWSDDServiceName(java.lang.String name) {
        LocalLBProfileOneConnectPortWSDDServiceName = name;
    }

    public iControl.LocalLBProfileOneConnectPortType getLocalLBProfileOneConnectPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LocalLBProfileOneConnectPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLocalLBProfileOneConnectPort(endpoint);
    }

    public iControl.LocalLBProfileOneConnectPortType getLocalLBProfileOneConnectPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.LocalLBProfileOneConnectBindingStub _stub = new iControl.LocalLBProfileOneConnectBindingStub(portAddress, this);
            _stub.setPortName(getLocalLBProfileOneConnectPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLocalLBProfileOneConnectPortEndpointAddress(java.lang.String address) {
        LocalLBProfileOneConnectPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.LocalLBProfileOneConnectPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.LocalLBProfileOneConnectBindingStub _stub = new iControl.LocalLBProfileOneConnectBindingStub(new java.net.URL(LocalLBProfileOneConnectPort_address), this);
                _stub.setPortName(getLocalLBProfileOneConnectPortWSDDServiceName());
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
        if ("LocalLB.ProfileOneConnectPort".equals(inputPortName)) {
            return getLocalLBProfileOneConnectPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileOneConnect");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileOneConnectPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LocalLBProfileOneConnectPort".equals(portName)) {
            setLocalLBProfileOneConnectPortEndpointAddress(address);
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
