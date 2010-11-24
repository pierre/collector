/**
 * ManagementUserManagementLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementUserManagementLocator extends org.apache.axis.client.Service implements iControl.ManagementUserManagement {

/**
 * The UserManagement interface deals with adding/deleting and 
 *  modifying users and user permission.
 */

    public ManagementUserManagementLocator() {
    }


    public ManagementUserManagementLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ManagementUserManagementLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ManagementUserManagementPort
    private java.lang.String ManagementUserManagementPort_address = "https://url_to_service";

    public java.lang.String getManagementUserManagementPortAddress() {
        return ManagementUserManagementPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ManagementUserManagementPortWSDDServiceName = "Management.UserManagementPort";

    public java.lang.String getManagementUserManagementPortWSDDServiceName() {
        return ManagementUserManagementPortWSDDServiceName;
    }

    public void setManagementUserManagementPortWSDDServiceName(java.lang.String name) {
        ManagementUserManagementPortWSDDServiceName = name;
    }

    public iControl.ManagementUserManagementPortType getManagementUserManagementPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ManagementUserManagementPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getManagementUserManagementPort(endpoint);
    }

    public iControl.ManagementUserManagementPortType getManagementUserManagementPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.ManagementUserManagementBindingStub _stub = new iControl.ManagementUserManagementBindingStub(portAddress, this);
            _stub.setPortName(getManagementUserManagementPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setManagementUserManagementPortEndpointAddress(java.lang.String address) {
        ManagementUserManagementPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.ManagementUserManagementPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.ManagementUserManagementBindingStub _stub = new iControl.ManagementUserManagementBindingStub(new java.net.URL(ManagementUserManagementPort_address), this);
                _stub.setPortName(getManagementUserManagementPortWSDDServiceName());
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
        if ("Management.UserManagementPort".equals(inputPortName)) {
            return getManagementUserManagementPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "Management.UserManagement");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "Management.UserManagementPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ManagementUserManagementPort".equals(portName)) {
            setManagementUserManagementPortEndpointAddress(address);
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
