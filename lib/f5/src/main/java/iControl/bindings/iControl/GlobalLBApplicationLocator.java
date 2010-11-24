/**
 * GlobalLBApplicationLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBApplicationLocator extends org.apache.axis.client.Service implements iControl.GlobalLBApplication {

/**
 * The Application interface enables you to work with applications
 * running within Wide IPs.
 */

    public GlobalLBApplicationLocator() {
    }


    public GlobalLBApplicationLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GlobalLBApplicationLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GlobalLBApplicationPort
    private java.lang.String GlobalLBApplicationPort_address = "https://url_to_service";

    public java.lang.String getGlobalLBApplicationPortAddress() {
        return GlobalLBApplicationPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GlobalLBApplicationPortWSDDServiceName = "GlobalLB.ApplicationPort";

    public java.lang.String getGlobalLBApplicationPortWSDDServiceName() {
        return GlobalLBApplicationPortWSDDServiceName;
    }

    public void setGlobalLBApplicationPortWSDDServiceName(java.lang.String name) {
        GlobalLBApplicationPortWSDDServiceName = name;
    }

    public iControl.GlobalLBApplicationPortType getGlobalLBApplicationPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GlobalLBApplicationPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGlobalLBApplicationPort(endpoint);
    }

    public iControl.GlobalLBApplicationPortType getGlobalLBApplicationPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.GlobalLBApplicationBindingStub _stub = new iControl.GlobalLBApplicationBindingStub(portAddress, this);
            _stub.setPortName(getGlobalLBApplicationPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGlobalLBApplicationPortEndpointAddress(java.lang.String address) {
        GlobalLBApplicationPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.GlobalLBApplicationPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.GlobalLBApplicationBindingStub _stub = new iControl.GlobalLBApplicationBindingStub(new java.net.URL(GlobalLBApplicationPort_address), this);
                _stub.setPortName(getGlobalLBApplicationPortWSDDServiceName());
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
        if ("GlobalLB.ApplicationPort".equals(inputPortName)) {
            return getGlobalLBApplicationPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "GlobalLB.Application");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.ApplicationPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GlobalLBApplicationPort".equals(portName)) {
            setGlobalLBApplicationPortEndpointAddress(address);
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
