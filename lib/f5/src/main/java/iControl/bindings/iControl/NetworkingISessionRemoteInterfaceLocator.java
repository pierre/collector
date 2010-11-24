/**
 * NetworkingISessionRemoteInterfaceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingISessionRemoteInterfaceLocator extends org.apache.axis.client.Service implements iControl.NetworkingISessionRemoteInterface {

/**
 * The iSession RemoteInterface interface enables you to work with
 * the definitions 
 *  and attributes contained in a device's peer iSession Remote Endpoint
 * objects.
 */

    public NetworkingISessionRemoteInterfaceLocator() {
    }


    public NetworkingISessionRemoteInterfaceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NetworkingISessionRemoteInterfaceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for NetworkingISessionRemoteInterfacePort
    private java.lang.String NetworkingISessionRemoteInterfacePort_address = "https://url_to_service";

    public java.lang.String getNetworkingISessionRemoteInterfacePortAddress() {
        return NetworkingISessionRemoteInterfacePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NetworkingISessionRemoteInterfacePortWSDDServiceName = "Networking.iSessionRemoteInterfacePort";

    public java.lang.String getNetworkingISessionRemoteInterfacePortWSDDServiceName() {
        return NetworkingISessionRemoteInterfacePortWSDDServiceName;
    }

    public void setNetworkingISessionRemoteInterfacePortWSDDServiceName(java.lang.String name) {
        NetworkingISessionRemoteInterfacePortWSDDServiceName = name;
    }

    public iControl.NetworkingISessionRemoteInterfacePortType getNetworkingISessionRemoteInterfacePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(NetworkingISessionRemoteInterfacePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNetworkingISessionRemoteInterfacePort(endpoint);
    }

    public iControl.NetworkingISessionRemoteInterfacePortType getNetworkingISessionRemoteInterfacePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.NetworkingISessionRemoteInterfaceBindingStub _stub = new iControl.NetworkingISessionRemoteInterfaceBindingStub(portAddress, this);
            _stub.setPortName(getNetworkingISessionRemoteInterfacePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNetworkingISessionRemoteInterfacePortEndpointAddress(java.lang.String address) {
        NetworkingISessionRemoteInterfacePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.NetworkingISessionRemoteInterfacePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.NetworkingISessionRemoteInterfaceBindingStub _stub = new iControl.NetworkingISessionRemoteInterfaceBindingStub(new java.net.URL(NetworkingISessionRemoteInterfacePort_address), this);
                _stub.setPortName(getNetworkingISessionRemoteInterfacePortWSDDServiceName());
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
        if ("Networking.iSessionRemoteInterfacePort".equals(inputPortName)) {
            return getNetworkingISessionRemoteInterfacePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "Networking.iSessionRemoteInterface");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "Networking.iSessionRemoteInterfacePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("NetworkingISessionRemoteInterfacePort".equals(portName)) {
            setNetworkingISessionRemoteInterfacePortEndpointAddress(address);
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
