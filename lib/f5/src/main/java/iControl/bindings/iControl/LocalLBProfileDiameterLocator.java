/**
 * LocalLBProfileDiameterLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBProfileDiameterLocator extends org.apache.axis.client.Service implements iControl.LocalLBProfileDiameter {

/**
 * The ProfileDiameter interface enables you to manipulate a local
 * load balancer's Diameter profile.
 */

    public LocalLBProfileDiameterLocator() {
    }


    public LocalLBProfileDiameterLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LocalLBProfileDiameterLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LocalLBProfileDiameterPort
    private java.lang.String LocalLBProfileDiameterPort_address = "https://url_to_service";

    public java.lang.String getLocalLBProfileDiameterPortAddress() {
        return LocalLBProfileDiameterPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LocalLBProfileDiameterPortWSDDServiceName = "LocalLB.ProfileDiameterPort";

    public java.lang.String getLocalLBProfileDiameterPortWSDDServiceName() {
        return LocalLBProfileDiameterPortWSDDServiceName;
    }

    public void setLocalLBProfileDiameterPortWSDDServiceName(java.lang.String name) {
        LocalLBProfileDiameterPortWSDDServiceName = name;
    }

    public iControl.LocalLBProfileDiameterPortType getLocalLBProfileDiameterPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LocalLBProfileDiameterPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLocalLBProfileDiameterPort(endpoint);
    }

    public iControl.LocalLBProfileDiameterPortType getLocalLBProfileDiameterPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.LocalLBProfileDiameterBindingStub _stub = new iControl.LocalLBProfileDiameterBindingStub(portAddress, this);
            _stub.setPortName(getLocalLBProfileDiameterPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLocalLBProfileDiameterPortEndpointAddress(java.lang.String address) {
        LocalLBProfileDiameterPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.LocalLBProfileDiameterPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.LocalLBProfileDiameterBindingStub _stub = new iControl.LocalLBProfileDiameterBindingStub(new java.net.URL(LocalLBProfileDiameterPort_address), this);
                _stub.setPortName(getLocalLBProfileDiameterPortWSDDServiceName());
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
        if ("LocalLB.ProfileDiameterPort".equals(inputPortName)) {
            return getLocalLBProfileDiameterPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileDiameter");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileDiameterPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LocalLBProfileDiameterPort".equals(portName)) {
            setLocalLBProfileDiameterPortEndpointAddress(address);
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
