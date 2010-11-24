/**
 * ManagementCRLDPServerLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementCRLDPServerLocator extends org.apache.axis.client.Service implements iControl.ManagementCRLDPServer {

/**
 * The CRLDPServer interface enables you to manage CRLDP Server configuration.
 */

    public ManagementCRLDPServerLocator() {
    }


    public ManagementCRLDPServerLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ManagementCRLDPServerLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ManagementCRLDPServerPort
    private java.lang.String ManagementCRLDPServerPort_address = "https://url_to_service";

    public java.lang.String getManagementCRLDPServerPortAddress() {
        return ManagementCRLDPServerPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ManagementCRLDPServerPortWSDDServiceName = "Management.CRLDPServerPort";

    public java.lang.String getManagementCRLDPServerPortWSDDServiceName() {
        return ManagementCRLDPServerPortWSDDServiceName;
    }

    public void setManagementCRLDPServerPortWSDDServiceName(java.lang.String name) {
        ManagementCRLDPServerPortWSDDServiceName = name;
    }

    public iControl.ManagementCRLDPServerPortType getManagementCRLDPServerPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ManagementCRLDPServerPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getManagementCRLDPServerPort(endpoint);
    }

    public iControl.ManagementCRLDPServerPortType getManagementCRLDPServerPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.ManagementCRLDPServerBindingStub _stub = new iControl.ManagementCRLDPServerBindingStub(portAddress, this);
            _stub.setPortName(getManagementCRLDPServerPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setManagementCRLDPServerPortEndpointAddress(java.lang.String address) {
        ManagementCRLDPServerPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.ManagementCRLDPServerPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.ManagementCRLDPServerBindingStub _stub = new iControl.ManagementCRLDPServerBindingStub(new java.net.URL(ManagementCRLDPServerPort_address), this);
                _stub.setPortName(getManagementCRLDPServerPortWSDDServiceName());
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
        if ("Management.CRLDPServerPort".equals(inputPortName)) {
            return getManagementCRLDPServerPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "Management.CRLDPServer");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "Management.CRLDPServerPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ManagementCRLDPServerPort".equals(portName)) {
            setManagementCRLDPServerPortEndpointAddress(address);
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
