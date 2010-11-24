/**
 * GlobalLBGlobalsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBGlobalsLocator extends org.apache.axis.client.Service implements iControl.GlobalLBGlobals {

/**
 * The Globals interface enables you to set and get global variables.
 */

    public GlobalLBGlobalsLocator() {
    }


    public GlobalLBGlobalsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GlobalLBGlobalsLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GlobalLBGlobalsPort
    private java.lang.String GlobalLBGlobalsPort_address = "https://url_to_service";

    public java.lang.String getGlobalLBGlobalsPortAddress() {
        return GlobalLBGlobalsPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GlobalLBGlobalsPortWSDDServiceName = "GlobalLB.GlobalsPort";

    public java.lang.String getGlobalLBGlobalsPortWSDDServiceName() {
        return GlobalLBGlobalsPortWSDDServiceName;
    }

    public void setGlobalLBGlobalsPortWSDDServiceName(java.lang.String name) {
        GlobalLBGlobalsPortWSDDServiceName = name;
    }

    public iControl.GlobalLBGlobalsPortType getGlobalLBGlobalsPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GlobalLBGlobalsPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGlobalLBGlobalsPort(endpoint);
    }

    public iControl.GlobalLBGlobalsPortType getGlobalLBGlobalsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.GlobalLBGlobalsBindingStub _stub = new iControl.GlobalLBGlobalsBindingStub(portAddress, this);
            _stub.setPortName(getGlobalLBGlobalsPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGlobalLBGlobalsPortEndpointAddress(java.lang.String address) {
        GlobalLBGlobalsPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.GlobalLBGlobalsPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.GlobalLBGlobalsBindingStub _stub = new iControl.GlobalLBGlobalsBindingStub(new java.net.URL(GlobalLBGlobalsPort_address), this);
                _stub.setPortName(getGlobalLBGlobalsPortWSDDServiceName());
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
        if ("GlobalLB.GlobalsPort".equals(inputPortName)) {
            return getGlobalLBGlobalsPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "GlobalLB.Globals");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.GlobalsPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GlobalLBGlobalsPort".equals(portName)) {
            setGlobalLBGlobalsPortEndpointAddress(address);
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
