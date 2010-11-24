/**
 * SystemSoftwareManagementLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class SystemSoftwareManagementLocator extends org.apache.axis.client.Service implements iControl.SystemSoftwareManagement {

/**
 * The SoftwareManagement interface enables you to manage the software
 * installed on the system.
 */

    public SystemSoftwareManagementLocator() {
    }


    public SystemSoftwareManagementLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SystemSoftwareManagementLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SystemSoftwareManagementPort
    private java.lang.String SystemSoftwareManagementPort_address = "https://url_to_service";

    public java.lang.String getSystemSoftwareManagementPortAddress() {
        return SystemSoftwareManagementPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SystemSoftwareManagementPortWSDDServiceName = "System.SoftwareManagementPort";

    public java.lang.String getSystemSoftwareManagementPortWSDDServiceName() {
        return SystemSoftwareManagementPortWSDDServiceName;
    }

    public void setSystemSoftwareManagementPortWSDDServiceName(java.lang.String name) {
        SystemSoftwareManagementPortWSDDServiceName = name;
    }

    public iControl.SystemSoftwareManagementPortType getSystemSoftwareManagementPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SystemSoftwareManagementPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSystemSoftwareManagementPort(endpoint);
    }

    public iControl.SystemSoftwareManagementPortType getSystemSoftwareManagementPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.SystemSoftwareManagementBindingStub _stub = new iControl.SystemSoftwareManagementBindingStub(portAddress, this);
            _stub.setPortName(getSystemSoftwareManagementPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSystemSoftwareManagementPortEndpointAddress(java.lang.String address) {
        SystemSoftwareManagementPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.SystemSoftwareManagementPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.SystemSoftwareManagementBindingStub _stub = new iControl.SystemSoftwareManagementBindingStub(new java.net.URL(SystemSoftwareManagementPort_address), this);
                _stub.setPortName(getSystemSoftwareManagementPortWSDDServiceName());
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
        if ("System.SoftwareManagementPort".equals(inputPortName)) {
            return getSystemSoftwareManagementPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "System.SoftwareManagement");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "System.SoftwareManagementPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SystemSoftwareManagementPort".equals(portName)) {
            setSystemSoftwareManagementPortEndpointAddress(address);
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
