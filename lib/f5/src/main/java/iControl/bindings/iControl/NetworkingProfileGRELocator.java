/**
 * NetworkingProfileGRELocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingProfileGRELocator extends org.apache.axis.client.Service implements iControl.NetworkingProfileGRE {

/**
 * The ProfileGRE interface allows you to manipulate a GRE tunnel
 * profile
 *  to configure the General Routing Encapsulation tunneling protocol.
 * The
 *  General Routing Encapsulation supports RFC2784, allowing the packets
 * of
 *  any L3 protocol to be carried inside encapsulating IP packets.
 */

    public NetworkingProfileGRELocator() {
    }


    public NetworkingProfileGRELocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NetworkingProfileGRELocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for NetworkingProfileGREPort
    private java.lang.String NetworkingProfileGREPort_address = "https://url_to_service";

    public java.lang.String getNetworkingProfileGREPortAddress() {
        return NetworkingProfileGREPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NetworkingProfileGREPortWSDDServiceName = "Networking.ProfileGREPort";

    public java.lang.String getNetworkingProfileGREPortWSDDServiceName() {
        return NetworkingProfileGREPortWSDDServiceName;
    }

    public void setNetworkingProfileGREPortWSDDServiceName(java.lang.String name) {
        NetworkingProfileGREPortWSDDServiceName = name;
    }

    public iControl.NetworkingProfileGREPortType getNetworkingProfileGREPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(NetworkingProfileGREPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNetworkingProfileGREPort(endpoint);
    }

    public iControl.NetworkingProfileGREPortType getNetworkingProfileGREPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.NetworkingProfileGREBindingStub _stub = new iControl.NetworkingProfileGREBindingStub(portAddress, this);
            _stub.setPortName(getNetworkingProfileGREPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNetworkingProfileGREPortEndpointAddress(java.lang.String address) {
        NetworkingProfileGREPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.NetworkingProfileGREPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.NetworkingProfileGREBindingStub _stub = new iControl.NetworkingProfileGREBindingStub(new java.net.URL(NetworkingProfileGREPort_address), this);
                _stub.setPortName(getNetworkingProfileGREPortWSDDServiceName());
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
        if ("Networking.ProfileGREPort".equals(inputPortName)) {
            return getNetworkingProfileGREPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "Networking.ProfileGRE");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "Networking.ProfileGREPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("NetworkingProfileGREPort".equals(portName)) {
            setNetworkingProfileGREPortEndpointAddress(address);
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
