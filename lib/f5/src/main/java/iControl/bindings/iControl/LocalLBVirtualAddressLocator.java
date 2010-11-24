/**
 * LocalLBVirtualAddressLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBVirtualAddressLocator extends org.apache.axis.client.Service implements iControl.LocalLBVirtualAddress {

/**
 * The VirtualAddress interface enables you to work with the states,
 * statistics, limits, availability, 
 *  and settings of a local load balancer's virtual address.
 */

    public LocalLBVirtualAddressLocator() {
    }


    public LocalLBVirtualAddressLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LocalLBVirtualAddressLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LocalLBVirtualAddressPort
    private java.lang.String LocalLBVirtualAddressPort_address = "https://url_to_service";

    public java.lang.String getLocalLBVirtualAddressPortAddress() {
        return LocalLBVirtualAddressPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LocalLBVirtualAddressPortWSDDServiceName = "LocalLB.VirtualAddressPort";

    public java.lang.String getLocalLBVirtualAddressPortWSDDServiceName() {
        return LocalLBVirtualAddressPortWSDDServiceName;
    }

    public void setLocalLBVirtualAddressPortWSDDServiceName(java.lang.String name) {
        LocalLBVirtualAddressPortWSDDServiceName = name;
    }

    public iControl.LocalLBVirtualAddressPortType getLocalLBVirtualAddressPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LocalLBVirtualAddressPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLocalLBVirtualAddressPort(endpoint);
    }

    public iControl.LocalLBVirtualAddressPortType getLocalLBVirtualAddressPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.LocalLBVirtualAddressBindingStub _stub = new iControl.LocalLBVirtualAddressBindingStub(portAddress, this);
            _stub.setPortName(getLocalLBVirtualAddressPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLocalLBVirtualAddressPortEndpointAddress(java.lang.String address) {
        LocalLBVirtualAddressPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.LocalLBVirtualAddressPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.LocalLBVirtualAddressBindingStub _stub = new iControl.LocalLBVirtualAddressBindingStub(new java.net.URL(LocalLBVirtualAddressPort_address), this);
                _stub.setPortName(getLocalLBVirtualAddressPortWSDDServiceName());
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
        if ("LocalLB.VirtualAddressPort".equals(inputPortName)) {
            return getLocalLBVirtualAddressPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "LocalLB.VirtualAddress");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "LocalLB.VirtualAddressPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LocalLBVirtualAddressPort".equals(portName)) {
            setLocalLBVirtualAddressPortEndpointAddress(address);
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
