/**
 * NetworkingProfileWCCPGRELocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingProfileWCCPGRELocator extends org.apache.axis.client.Service implements iControl.NetworkingProfileWCCPGRE {

/**
 * The ProfileWCCPGRE interface allows you to manipulate a WCCP-GRE
 * tunnel
 *  profile to configure the General Routing Encapsulation (GRE - RFC2784)
 * tunnel protocol in conjunction with the Web-Cache Communication
 *  Protocol (WCCP).  See the Networking/ProfileGRE interface for
 *  additional information.
 */

    public NetworkingProfileWCCPGRELocator() {
    }


    public NetworkingProfileWCCPGRELocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NetworkingProfileWCCPGRELocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for NetworkingProfileWCCPGREPort
    private java.lang.String NetworkingProfileWCCPGREPort_address = "https://url_to_service";

    public java.lang.String getNetworkingProfileWCCPGREPortAddress() {
        return NetworkingProfileWCCPGREPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NetworkingProfileWCCPGREPortWSDDServiceName = "Networking.ProfileWCCPGREPort";

    public java.lang.String getNetworkingProfileWCCPGREPortWSDDServiceName() {
        return NetworkingProfileWCCPGREPortWSDDServiceName;
    }

    public void setNetworkingProfileWCCPGREPortWSDDServiceName(java.lang.String name) {
        NetworkingProfileWCCPGREPortWSDDServiceName = name;
    }

    public iControl.NetworkingProfileWCCPGREPortType getNetworkingProfileWCCPGREPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(NetworkingProfileWCCPGREPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNetworkingProfileWCCPGREPort(endpoint);
    }

    public iControl.NetworkingProfileWCCPGREPortType getNetworkingProfileWCCPGREPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.NetworkingProfileWCCPGREBindingStub _stub = new iControl.NetworkingProfileWCCPGREBindingStub(portAddress, this);
            _stub.setPortName(getNetworkingProfileWCCPGREPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNetworkingProfileWCCPGREPortEndpointAddress(java.lang.String address) {
        NetworkingProfileWCCPGREPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.NetworkingProfileWCCPGREPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.NetworkingProfileWCCPGREBindingStub _stub = new iControl.NetworkingProfileWCCPGREBindingStub(new java.net.URL(NetworkingProfileWCCPGREPort_address), this);
                _stub.setPortName(getNetworkingProfileWCCPGREPortWSDDServiceName());
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
        if ("Networking.ProfileWCCPGREPort".equals(inputPortName)) {
            return getNetworkingProfileWCCPGREPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "Networking.ProfileWCCPGRE");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "Networking.ProfileWCCPGREPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("NetworkingProfileWCCPGREPort".equals(portName)) {
            setNetworkingProfileWCCPGREPortEndpointAddress(address);
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
