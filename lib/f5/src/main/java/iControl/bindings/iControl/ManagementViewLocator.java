/**
 * ManagementViewLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementViewLocator extends org.apache.axis.client.Service implements iControl.ManagementView {

/**
 * The View interface contains all calls necessary to manipulate views
 */

    public ManagementViewLocator() {
    }


    public ManagementViewLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ManagementViewLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ManagementViewPort
    private java.lang.String ManagementViewPort_address = "https://url_to_service";

    public java.lang.String getManagementViewPortAddress() {
        return ManagementViewPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ManagementViewPortWSDDServiceName = "Management.ViewPort";

    public java.lang.String getManagementViewPortWSDDServiceName() {
        return ManagementViewPortWSDDServiceName;
    }

    public void setManagementViewPortWSDDServiceName(java.lang.String name) {
        ManagementViewPortWSDDServiceName = name;
    }

    public iControl.ManagementViewPortType getManagementViewPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ManagementViewPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getManagementViewPort(endpoint);
    }

    public iControl.ManagementViewPortType getManagementViewPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.ManagementViewBindingStub _stub = new iControl.ManagementViewBindingStub(portAddress, this);
            _stub.setPortName(getManagementViewPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setManagementViewPortEndpointAddress(java.lang.String address) {
        ManagementViewPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.ManagementViewPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.ManagementViewBindingStub _stub = new iControl.ManagementViewBindingStub(new java.net.URL(ManagementViewPort_address), this);
                _stub.setPortName(getManagementViewPortWSDDServiceName());
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
        if ("Management.ViewPort".equals(inputPortName)) {
            return getManagementViewPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "Management.View");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "Management.ViewPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ManagementViewPort".equals(portName)) {
            setManagementViewPortEndpointAddress(address);
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
