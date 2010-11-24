/**
 * NetworkingProfileIPIPLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingProfileIPIPLocator extends org.apache.axis.client.Service implements iControl.NetworkingProfileIPIP {

/**
 * The ProfileIPIP interface enables you to manipulate an IP-IP tunnel
 * profile to configure the IP-within-IP tunneling protocol.  The
 *  IP-within-IP protocol (RFC2003) specifies how to encapsulate an IP
 * packet within another IP packet.
 */

    public NetworkingProfileIPIPLocator() {
    }


    public NetworkingProfileIPIPLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NetworkingProfileIPIPLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for NetworkingProfileIPIPPort
    private java.lang.String NetworkingProfileIPIPPort_address = "https://url_to_service";

    public java.lang.String getNetworkingProfileIPIPPortAddress() {
        return NetworkingProfileIPIPPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NetworkingProfileIPIPPortWSDDServiceName = "Networking.ProfileIPIPPort";

    public java.lang.String getNetworkingProfileIPIPPortWSDDServiceName() {
        return NetworkingProfileIPIPPortWSDDServiceName;
    }

    public void setNetworkingProfileIPIPPortWSDDServiceName(java.lang.String name) {
        NetworkingProfileIPIPPortWSDDServiceName = name;
    }

    public iControl.NetworkingProfileIPIPPortType getNetworkingProfileIPIPPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(NetworkingProfileIPIPPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNetworkingProfileIPIPPort(endpoint);
    }

    public iControl.NetworkingProfileIPIPPortType getNetworkingProfileIPIPPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.NetworkingProfileIPIPBindingStub _stub = new iControl.NetworkingProfileIPIPBindingStub(portAddress, this);
            _stub.setPortName(getNetworkingProfileIPIPPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNetworkingProfileIPIPPortEndpointAddress(java.lang.String address) {
        NetworkingProfileIPIPPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.NetworkingProfileIPIPPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.NetworkingProfileIPIPBindingStub _stub = new iControl.NetworkingProfileIPIPBindingStub(new java.net.URL(NetworkingProfileIPIPPort_address), this);
                _stub.setPortName(getNetworkingProfileIPIPPortWSDDServiceName());
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
        if ("Networking.ProfileIPIPPort".equals(inputPortName)) {
            return getNetworkingProfileIPIPPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "Networking.ProfileIPIP");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "Networking.ProfileIPIPPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("NetworkingProfileIPIPPort".equals(portName)) {
            setNetworkingProfileIPIPPortEndpointAddress(address);
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
