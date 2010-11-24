/**
 * NetworkingTunnelLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingTunnelLocator extends org.apache.axis.client.Service implements iControl.NetworkingTunnel {

/**
 * The Tunnel interface manages a virtual network interface that allows
 * a
 *  network protocol to carry packets of another protocol between two
 * endpoints.  Once created, it can be used just like a VLAN in BIG-IP
 * configurations.
 */

    public NetworkingTunnelLocator() {
    }


    public NetworkingTunnelLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NetworkingTunnelLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for NetworkingTunnelPort
    private java.lang.String NetworkingTunnelPort_address = "https://url_to_service";

    public java.lang.String getNetworkingTunnelPortAddress() {
        return NetworkingTunnelPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NetworkingTunnelPortWSDDServiceName = "Networking.TunnelPort";

    public java.lang.String getNetworkingTunnelPortWSDDServiceName() {
        return NetworkingTunnelPortWSDDServiceName;
    }

    public void setNetworkingTunnelPortWSDDServiceName(java.lang.String name) {
        NetworkingTunnelPortWSDDServiceName = name;
    }

    public iControl.NetworkingTunnelPortType getNetworkingTunnelPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(NetworkingTunnelPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNetworkingTunnelPort(endpoint);
    }

    public iControl.NetworkingTunnelPortType getNetworkingTunnelPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.NetworkingTunnelBindingStub _stub = new iControl.NetworkingTunnelBindingStub(portAddress, this);
            _stub.setPortName(getNetworkingTunnelPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNetworkingTunnelPortEndpointAddress(java.lang.String address) {
        NetworkingTunnelPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.NetworkingTunnelPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.NetworkingTunnelBindingStub _stub = new iControl.NetworkingTunnelBindingStub(new java.net.URL(NetworkingTunnelPort_address), this);
                _stub.setPortName(getNetworkingTunnelPortWSDDServiceName());
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
        if ("Networking.TunnelPort".equals(inputPortName)) {
            return getNetworkingTunnelPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "Networking.Tunnel");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "Networking.TunnelPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("NetworkingTunnelPort".equals(portName)) {
            setNetworkingTunnelPortEndpointAddress(address);
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
