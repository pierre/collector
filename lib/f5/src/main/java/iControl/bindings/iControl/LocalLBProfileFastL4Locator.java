/**
 * LocalLBProfileFastL4Locator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBProfileFastL4Locator extends org.apache.axis.client.Service implements iControl.LocalLBProfileFastL4 {

/**
 * The ProfileFastL4 interface enables you to manipulate a local load
 * balancer's L4 profile.
 */

    public LocalLBProfileFastL4Locator() {
    }


    public LocalLBProfileFastL4Locator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LocalLBProfileFastL4Locator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LocalLBProfileFastL4Port
    private java.lang.String LocalLBProfileFastL4Port_address = "https://url_to_service";

    public java.lang.String getLocalLBProfileFastL4PortAddress() {
        return LocalLBProfileFastL4Port_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LocalLBProfileFastL4PortWSDDServiceName = "LocalLB.ProfileFastL4Port";

    public java.lang.String getLocalLBProfileFastL4PortWSDDServiceName() {
        return LocalLBProfileFastL4PortWSDDServiceName;
    }

    public void setLocalLBProfileFastL4PortWSDDServiceName(java.lang.String name) {
        LocalLBProfileFastL4PortWSDDServiceName = name;
    }

    public iControl.LocalLBProfileFastL4PortType getLocalLBProfileFastL4Port() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LocalLBProfileFastL4Port_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLocalLBProfileFastL4Port(endpoint);
    }

    public iControl.LocalLBProfileFastL4PortType getLocalLBProfileFastL4Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.LocalLBProfileFastL4BindingStub _stub = new iControl.LocalLBProfileFastL4BindingStub(portAddress, this);
            _stub.setPortName(getLocalLBProfileFastL4PortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLocalLBProfileFastL4PortEndpointAddress(java.lang.String address) {
        LocalLBProfileFastL4Port_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.LocalLBProfileFastL4PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.LocalLBProfileFastL4BindingStub _stub = new iControl.LocalLBProfileFastL4BindingStub(new java.net.URL(LocalLBProfileFastL4Port_address), this);
                _stub.setPortName(getLocalLBProfileFastL4PortWSDDServiceName());
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
        if ("LocalLB.ProfileFastL4Port".equals(inputPortName)) {
            return getLocalLBProfileFastL4Port();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileFastL4");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileFastL4Port"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LocalLBProfileFastL4Port".equals(portName)) {
            setLocalLBProfileFastL4PortEndpointAddress(address);
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
