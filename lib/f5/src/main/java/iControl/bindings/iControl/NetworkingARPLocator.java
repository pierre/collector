/**
 * NetworkingARPLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingARPLocator extends org.apache.axis.client.Service implements iControl.NetworkingARP {

/**
 * The ARP interface enables you to work with the ARP table and entries.
 */

    public NetworkingARPLocator() {
    }


    public NetworkingARPLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NetworkingARPLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for NetworkingARPPort
    private java.lang.String NetworkingARPPort_address = "https://url_to_service";

    public java.lang.String getNetworkingARPPortAddress() {
        return NetworkingARPPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NetworkingARPPortWSDDServiceName = "Networking.ARPPort";

    public java.lang.String getNetworkingARPPortWSDDServiceName() {
        return NetworkingARPPortWSDDServiceName;
    }

    public void setNetworkingARPPortWSDDServiceName(java.lang.String name) {
        NetworkingARPPortWSDDServiceName = name;
    }

    public iControl.NetworkingARPPortType getNetworkingARPPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(NetworkingARPPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNetworkingARPPort(endpoint);
    }

    public iControl.NetworkingARPPortType getNetworkingARPPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.NetworkingARPBindingStub _stub = new iControl.NetworkingARPBindingStub(portAddress, this);
            _stub.setPortName(getNetworkingARPPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNetworkingARPPortEndpointAddress(java.lang.String address) {
        NetworkingARPPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.NetworkingARPPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.NetworkingARPBindingStub _stub = new iControl.NetworkingARPBindingStub(new java.net.URL(NetworkingARPPort_address), this);
                _stub.setPortName(getNetworkingARPPortWSDDServiceName());
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
        if ("Networking.ARPPort".equals(inputPortName)) {
            return getNetworkingARPPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "Networking.ARP");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "Networking.ARPPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("NetworkingARPPort".equals(portName)) {
            setNetworkingARPPortEndpointAddress(address);
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
