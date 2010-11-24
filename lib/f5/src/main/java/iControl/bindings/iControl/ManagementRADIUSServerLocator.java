/**
 * ManagementRADIUSServerLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementRADIUSServerLocator extends org.apache.axis.client.Service implements iControl.ManagementRADIUSServer {

/**
 * The RADIUSServer interface enables you to manage RADIUS Server
 * configuration.
 */

    public ManagementRADIUSServerLocator() {
    }


    public ManagementRADIUSServerLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ManagementRADIUSServerLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ManagementRADIUSServerPort
    private java.lang.String ManagementRADIUSServerPort_address = "https://url_to_service";

    public java.lang.String getManagementRADIUSServerPortAddress() {
        return ManagementRADIUSServerPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ManagementRADIUSServerPortWSDDServiceName = "Management.RADIUSServerPort";

    public java.lang.String getManagementRADIUSServerPortWSDDServiceName() {
        return ManagementRADIUSServerPortWSDDServiceName;
    }

    public void setManagementRADIUSServerPortWSDDServiceName(java.lang.String name) {
        ManagementRADIUSServerPortWSDDServiceName = name;
    }

    public iControl.ManagementRADIUSServerPortType getManagementRADIUSServerPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ManagementRADIUSServerPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getManagementRADIUSServerPort(endpoint);
    }

    public iControl.ManagementRADIUSServerPortType getManagementRADIUSServerPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.ManagementRADIUSServerBindingStub _stub = new iControl.ManagementRADIUSServerBindingStub(portAddress, this);
            _stub.setPortName(getManagementRADIUSServerPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setManagementRADIUSServerPortEndpointAddress(java.lang.String address) {
        ManagementRADIUSServerPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.ManagementRADIUSServerPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.ManagementRADIUSServerBindingStub _stub = new iControl.ManagementRADIUSServerBindingStub(new java.net.URL(ManagementRADIUSServerPort_address), this);
                _stub.setPortName(getManagementRADIUSServerPortWSDDServiceName());
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
        if ("Management.RADIUSServerPort".equals(inputPortName)) {
            return getManagementRADIUSServerPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "Management.RADIUSServer");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "Management.RADIUSServerPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ManagementRADIUSServerPort".equals(portName)) {
            setManagementRADIUSServerPortEndpointAddress(address);
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
