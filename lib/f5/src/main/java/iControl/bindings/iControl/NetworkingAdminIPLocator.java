/**
 * NetworkingAdminIPLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingAdminIPLocator extends org.apache.axis.client.Service implements iControl.NetworkingAdminIP {

/**
 * The AdminIP interface enables you to work with the definitions
 * and attributes contained in a device's administrative IP.
 */

    public NetworkingAdminIPLocator() {
    }


    public NetworkingAdminIPLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NetworkingAdminIPLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for NetworkingAdminIPPort
    private java.lang.String NetworkingAdminIPPort_address = "https://url_to_service";

    public java.lang.String getNetworkingAdminIPPortAddress() {
        return NetworkingAdminIPPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NetworkingAdminIPPortWSDDServiceName = "Networking.AdminIPPort";

    public java.lang.String getNetworkingAdminIPPortWSDDServiceName() {
        return NetworkingAdminIPPortWSDDServiceName;
    }

    public void setNetworkingAdminIPPortWSDDServiceName(java.lang.String name) {
        NetworkingAdminIPPortWSDDServiceName = name;
    }

    public iControl.NetworkingAdminIPPortType getNetworkingAdminIPPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(NetworkingAdminIPPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNetworkingAdminIPPort(endpoint);
    }

    public iControl.NetworkingAdminIPPortType getNetworkingAdminIPPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.NetworkingAdminIPBindingStub _stub = new iControl.NetworkingAdminIPBindingStub(portAddress, this);
            _stub.setPortName(getNetworkingAdminIPPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNetworkingAdminIPPortEndpointAddress(java.lang.String address) {
        NetworkingAdminIPPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.NetworkingAdminIPPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.NetworkingAdminIPBindingStub _stub = new iControl.NetworkingAdminIPBindingStub(new java.net.URL(NetworkingAdminIPPort_address), this);
                _stub.setPortName(getNetworkingAdminIPPortWSDDServiceName());
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
        if ("Networking.AdminIPPort".equals(inputPortName)) {
            return getNetworkingAdminIPPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "Networking.AdminIP");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "Networking.AdminIPPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("NetworkingAdminIPPort".equals(portName)) {
            setNetworkingAdminIPPortEndpointAddress(address);
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
