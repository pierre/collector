/**
 * LocalLBNodeAddressLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBNodeAddressLocator extends org.apache.axis.client.Service implements iControl.LocalLBNodeAddress {

/**
 * The NodeAddress interface enables you to work with the states,
 * statistics, limits, availability, ratios, application response deltas,
 * and monitors of a local load balancer's node address.
 */

    public LocalLBNodeAddressLocator() {
    }


    public LocalLBNodeAddressLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LocalLBNodeAddressLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LocalLBNodeAddressPort
    private java.lang.String LocalLBNodeAddressPort_address = "https://url_to_service";

    public java.lang.String getLocalLBNodeAddressPortAddress() {
        return LocalLBNodeAddressPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LocalLBNodeAddressPortWSDDServiceName = "LocalLB.NodeAddressPort";

    public java.lang.String getLocalLBNodeAddressPortWSDDServiceName() {
        return LocalLBNodeAddressPortWSDDServiceName;
    }

    public void setLocalLBNodeAddressPortWSDDServiceName(java.lang.String name) {
        LocalLBNodeAddressPortWSDDServiceName = name;
    }

    public iControl.LocalLBNodeAddressPortType getLocalLBNodeAddressPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LocalLBNodeAddressPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLocalLBNodeAddressPort(endpoint);
    }

    public iControl.LocalLBNodeAddressPortType getLocalLBNodeAddressPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.LocalLBNodeAddressBindingStub _stub = new iControl.LocalLBNodeAddressBindingStub(portAddress, this);
            _stub.setPortName(getLocalLBNodeAddressPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLocalLBNodeAddressPortEndpointAddress(java.lang.String address) {
        LocalLBNodeAddressPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.LocalLBNodeAddressPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.LocalLBNodeAddressBindingStub _stub = new iControl.LocalLBNodeAddressBindingStub(new java.net.URL(LocalLBNodeAddressPort_address), this);
                _stub.setPortName(getLocalLBNodeAddressPortWSDDServiceName());
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
        if ("LocalLB.NodeAddressPort".equals(inputPortName)) {
            return getLocalLBNodeAddressPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "LocalLB.NodeAddress");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "LocalLB.NodeAddressPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LocalLBNodeAddressPort".equals(portName)) {
            setLocalLBNodeAddressPortEndpointAddress(address);
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
