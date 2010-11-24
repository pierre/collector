/**
 * NetworkingPacketFilterGlobalsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingPacketFilterGlobalsLocator extends org.apache.axis.client.Service implements iControl.NetworkingPacketFilterGlobals {

/**
 * The PacketFilterGlobals interface enables you to work with the
 * global lists of trusted source addresses and ingress VLANs used
 *  in packet filtering.
 */

    public NetworkingPacketFilterGlobalsLocator() {
    }


    public NetworkingPacketFilterGlobalsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NetworkingPacketFilterGlobalsLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for NetworkingPacketFilterGlobalsPort
    private java.lang.String NetworkingPacketFilterGlobalsPort_address = "https://url_to_service";

    public java.lang.String getNetworkingPacketFilterGlobalsPortAddress() {
        return NetworkingPacketFilterGlobalsPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NetworkingPacketFilterGlobalsPortWSDDServiceName = "Networking.PacketFilterGlobalsPort";

    public java.lang.String getNetworkingPacketFilterGlobalsPortWSDDServiceName() {
        return NetworkingPacketFilterGlobalsPortWSDDServiceName;
    }

    public void setNetworkingPacketFilterGlobalsPortWSDDServiceName(java.lang.String name) {
        NetworkingPacketFilterGlobalsPortWSDDServiceName = name;
    }

    public iControl.NetworkingPacketFilterGlobalsPortType getNetworkingPacketFilterGlobalsPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(NetworkingPacketFilterGlobalsPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNetworkingPacketFilterGlobalsPort(endpoint);
    }

    public iControl.NetworkingPacketFilterGlobalsPortType getNetworkingPacketFilterGlobalsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.NetworkingPacketFilterGlobalsBindingStub _stub = new iControl.NetworkingPacketFilterGlobalsBindingStub(portAddress, this);
            _stub.setPortName(getNetworkingPacketFilterGlobalsPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNetworkingPacketFilterGlobalsPortEndpointAddress(java.lang.String address) {
        NetworkingPacketFilterGlobalsPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.NetworkingPacketFilterGlobalsPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.NetworkingPacketFilterGlobalsBindingStub _stub = new iControl.NetworkingPacketFilterGlobalsBindingStub(new java.net.URL(NetworkingPacketFilterGlobalsPort_address), this);
                _stub.setPortName(getNetworkingPacketFilterGlobalsPortWSDDServiceName());
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
        if ("Networking.PacketFilterGlobalsPort".equals(inputPortName)) {
            return getNetworkingPacketFilterGlobalsPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "Networking.PacketFilterGlobals");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "Networking.PacketFilterGlobalsPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("NetworkingPacketFilterGlobalsPort".equals(portName)) {
            setNetworkingPacketFilterGlobalsPortEndpointAddress(address);
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
