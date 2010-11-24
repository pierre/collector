/**
 * NetworkingPacketFilterLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingPacketFilterLocator extends org.apache.axis.client.Service implements iControl.NetworkingPacketFilter {

/**
 * The PacketFilter interface enables you to work with the definitions
 * and attributes of packet filter rules.  
 *  The goal of the packet filter is to provide a flexible and integrated
 * perimeter security mechanism to 
 *  explicitly block as well as accept traffic using complex expressions
 * similar to those used by libpcap (e.g. tcpdump).
 */

    public NetworkingPacketFilterLocator() {
    }


    public NetworkingPacketFilterLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NetworkingPacketFilterLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for NetworkingPacketFilterPort
    private java.lang.String NetworkingPacketFilterPort_address = "https://url_to_service";

    public java.lang.String getNetworkingPacketFilterPortAddress() {
        return NetworkingPacketFilterPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NetworkingPacketFilterPortWSDDServiceName = "Networking.PacketFilterPort";

    public java.lang.String getNetworkingPacketFilterPortWSDDServiceName() {
        return NetworkingPacketFilterPortWSDDServiceName;
    }

    public void setNetworkingPacketFilterPortWSDDServiceName(java.lang.String name) {
        NetworkingPacketFilterPortWSDDServiceName = name;
    }

    public iControl.NetworkingPacketFilterPortType getNetworkingPacketFilterPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(NetworkingPacketFilterPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNetworkingPacketFilterPort(endpoint);
    }

    public iControl.NetworkingPacketFilterPortType getNetworkingPacketFilterPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.NetworkingPacketFilterBindingStub _stub = new iControl.NetworkingPacketFilterBindingStub(portAddress, this);
            _stub.setPortName(getNetworkingPacketFilterPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNetworkingPacketFilterPortEndpointAddress(java.lang.String address) {
        NetworkingPacketFilterPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.NetworkingPacketFilterPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.NetworkingPacketFilterBindingStub _stub = new iControl.NetworkingPacketFilterBindingStub(new java.net.URL(NetworkingPacketFilterPort_address), this);
                _stub.setPortName(getNetworkingPacketFilterPortWSDDServiceName());
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
        if ("Networking.PacketFilterPort".equals(inputPortName)) {
            return getNetworkingPacketFilterPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "Networking.PacketFilter");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "Networking.PacketFilterPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("NetworkingPacketFilterPort".equals(portName)) {
            setNetworkingPacketFilterPortEndpointAddress(address);
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
