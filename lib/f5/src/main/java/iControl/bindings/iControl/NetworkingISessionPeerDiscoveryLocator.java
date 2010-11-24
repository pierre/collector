/**
 * NetworkingISessionPeerDiscoveryLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingISessionPeerDiscoveryLocator extends org.apache.axis.client.Service implements iControl.NetworkingISessionPeerDiscovery {

/**
 * The Dynamic Peer Discovery interface enables you to work with the
 * definitions and 
 *  attributes contained in a device's peer discovery objects.
 */

    public NetworkingISessionPeerDiscoveryLocator() {
    }


    public NetworkingISessionPeerDiscoveryLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NetworkingISessionPeerDiscoveryLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for NetworkingISessionPeerDiscoveryPort
    private java.lang.String NetworkingISessionPeerDiscoveryPort_address = "https://url_to_service";

    public java.lang.String getNetworkingISessionPeerDiscoveryPortAddress() {
        return NetworkingISessionPeerDiscoveryPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NetworkingISessionPeerDiscoveryPortWSDDServiceName = "Networking.iSessionPeerDiscoveryPort";

    public java.lang.String getNetworkingISessionPeerDiscoveryPortWSDDServiceName() {
        return NetworkingISessionPeerDiscoveryPortWSDDServiceName;
    }

    public void setNetworkingISessionPeerDiscoveryPortWSDDServiceName(java.lang.String name) {
        NetworkingISessionPeerDiscoveryPortWSDDServiceName = name;
    }

    public iControl.NetworkingISessionPeerDiscoveryPortType getNetworkingISessionPeerDiscoveryPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(NetworkingISessionPeerDiscoveryPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNetworkingISessionPeerDiscoveryPort(endpoint);
    }

    public iControl.NetworkingISessionPeerDiscoveryPortType getNetworkingISessionPeerDiscoveryPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.NetworkingISessionPeerDiscoveryBindingStub _stub = new iControl.NetworkingISessionPeerDiscoveryBindingStub(portAddress, this);
            _stub.setPortName(getNetworkingISessionPeerDiscoveryPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNetworkingISessionPeerDiscoveryPortEndpointAddress(java.lang.String address) {
        NetworkingISessionPeerDiscoveryPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.NetworkingISessionPeerDiscoveryPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.NetworkingISessionPeerDiscoveryBindingStub _stub = new iControl.NetworkingISessionPeerDiscoveryBindingStub(new java.net.URL(NetworkingISessionPeerDiscoveryPort_address), this);
                _stub.setPortName(getNetworkingISessionPeerDiscoveryPortWSDDServiceName());
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
        if ("Networking.iSessionPeerDiscoveryPort".equals(inputPortName)) {
            return getNetworkingISessionPeerDiscoveryPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "Networking.iSessionPeerDiscovery");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "Networking.iSessionPeerDiscoveryPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("NetworkingISessionPeerDiscoveryPort".equals(portName)) {
            setNetworkingISessionPeerDiscoveryPortEndpointAddress(address);
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
