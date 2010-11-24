/**
 * NetworkingInterfacesLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingInterfacesLocator extends org.apache.axis.client.Service implements iControl.NetworkingInterfaces {

/**
 * The Interface interface enables you to work with the definitions
 * and attributes contained in a device's interface.
 */

    public NetworkingInterfacesLocator() {
    }


    public NetworkingInterfacesLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NetworkingInterfacesLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for NetworkingInterfacesPort
    private java.lang.String NetworkingInterfacesPort_address = "https://url_to_service";

    public java.lang.String getNetworkingInterfacesPortAddress() {
        return NetworkingInterfacesPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NetworkingInterfacesPortWSDDServiceName = "Networking.InterfacesPort";

    public java.lang.String getNetworkingInterfacesPortWSDDServiceName() {
        return NetworkingInterfacesPortWSDDServiceName;
    }

    public void setNetworkingInterfacesPortWSDDServiceName(java.lang.String name) {
        NetworkingInterfacesPortWSDDServiceName = name;
    }

    public iControl.NetworkingInterfacesPortType getNetworkingInterfacesPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(NetworkingInterfacesPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNetworkingInterfacesPort(endpoint);
    }

    public iControl.NetworkingInterfacesPortType getNetworkingInterfacesPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.NetworkingInterfacesBindingStub _stub = new iControl.NetworkingInterfacesBindingStub(portAddress, this);
            _stub.setPortName(getNetworkingInterfacesPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNetworkingInterfacesPortEndpointAddress(java.lang.String address) {
        NetworkingInterfacesPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.NetworkingInterfacesPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.NetworkingInterfacesBindingStub _stub = new iControl.NetworkingInterfacesBindingStub(new java.net.URL(NetworkingInterfacesPort_address), this);
                _stub.setPortName(getNetworkingInterfacesPortWSDDServiceName());
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
        if ("Networking.InterfacesPort".equals(inputPortName)) {
            return getNetworkingInterfacesPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "Networking.Interfaces");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "Networking.InterfacesPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("NetworkingInterfacesPort".equals(portName)) {
            setNetworkingInterfacesPortEndpointAddress(address);
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
