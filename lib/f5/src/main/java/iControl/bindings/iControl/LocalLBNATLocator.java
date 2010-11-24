/**
 * LocalLBNATLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBNATLocator extends org.apache.axis.client.Service implements iControl.LocalLBNAT {

/**
 * The NAT interface enables you to work with the statistics and definitions
 * contained in a local load balancer's network address translations
 * (NAT).  For example, use the NAT interface to both get and set the
 * NAT statistics and attributes of a local load balancer.
 */

    public LocalLBNATLocator() {
    }


    public LocalLBNATLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LocalLBNATLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LocalLBNATPort
    private java.lang.String LocalLBNATPort_address = "https://url_to_service";

    public java.lang.String getLocalLBNATPortAddress() {
        return LocalLBNATPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LocalLBNATPortWSDDServiceName = "LocalLB.NATPort";

    public java.lang.String getLocalLBNATPortWSDDServiceName() {
        return LocalLBNATPortWSDDServiceName;
    }

    public void setLocalLBNATPortWSDDServiceName(java.lang.String name) {
        LocalLBNATPortWSDDServiceName = name;
    }

    public iControl.LocalLBNATPortType getLocalLBNATPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LocalLBNATPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLocalLBNATPort(endpoint);
    }

    public iControl.LocalLBNATPortType getLocalLBNATPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.LocalLBNATBindingStub _stub = new iControl.LocalLBNATBindingStub(portAddress, this);
            _stub.setPortName(getLocalLBNATPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLocalLBNATPortEndpointAddress(java.lang.String address) {
        LocalLBNATPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.LocalLBNATPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.LocalLBNATBindingStub _stub = new iControl.LocalLBNATBindingStub(new java.net.URL(LocalLBNATPort_address), this);
                _stub.setPortName(getLocalLBNATPortWSDDServiceName());
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
        if ("LocalLB.NATPort".equals(inputPortName)) {
            return getLocalLBNATPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "LocalLB.NAT");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "LocalLB.NATPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LocalLBNATPort".equals(portName)) {
            setLocalLBNATPortEndpointAddress(address);
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
