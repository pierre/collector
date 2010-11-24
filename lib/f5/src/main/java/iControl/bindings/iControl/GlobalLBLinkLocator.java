/**
 * GlobalLBLinkLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBLinkLocator extends org.apache.axis.client.Service implements iControl.GlobalLBLink {

/**
 * The Link interface enables you to work with links within a data
 * center.
 */

    public GlobalLBLinkLocator() {
    }


    public GlobalLBLinkLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GlobalLBLinkLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GlobalLBLinkPort
    private java.lang.String GlobalLBLinkPort_address = "https://url_to_service";

    public java.lang.String getGlobalLBLinkPortAddress() {
        return GlobalLBLinkPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GlobalLBLinkPortWSDDServiceName = "GlobalLB.LinkPort";

    public java.lang.String getGlobalLBLinkPortWSDDServiceName() {
        return GlobalLBLinkPortWSDDServiceName;
    }

    public void setGlobalLBLinkPortWSDDServiceName(java.lang.String name) {
        GlobalLBLinkPortWSDDServiceName = name;
    }

    public iControl.GlobalLBLinkPortType getGlobalLBLinkPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GlobalLBLinkPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGlobalLBLinkPort(endpoint);
    }

    public iControl.GlobalLBLinkPortType getGlobalLBLinkPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.GlobalLBLinkBindingStub _stub = new iControl.GlobalLBLinkBindingStub(portAddress, this);
            _stub.setPortName(getGlobalLBLinkPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGlobalLBLinkPortEndpointAddress(java.lang.String address) {
        GlobalLBLinkPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.GlobalLBLinkPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.GlobalLBLinkBindingStub _stub = new iControl.GlobalLBLinkBindingStub(new java.net.URL(GlobalLBLinkPort_address), this);
                _stub.setPortName(getGlobalLBLinkPortWSDDServiceName());
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
        if ("GlobalLB.LinkPort".equals(inputPortName)) {
            return getGlobalLBLinkPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "GlobalLB.Link");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.LinkPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GlobalLBLinkPort".equals(portName)) {
            setGlobalLBLinkPortEndpointAddress(address);
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
