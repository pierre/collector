/**
 * ManagementDBVariableLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementDBVariableLocator extends org.apache.axis.client.Service implements iControl.ManagementDBVariable {

/**
 * The DBVariable interface exposes methods that enable you to work
 * directly with our internal 
 *  database that contains configuration variables using name/value pairs.
 */

    public ManagementDBVariableLocator() {
    }


    public ManagementDBVariableLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ManagementDBVariableLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ManagementDBVariablePort
    private java.lang.String ManagementDBVariablePort_address = "https://url_to_service";

    public java.lang.String getManagementDBVariablePortAddress() {
        return ManagementDBVariablePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ManagementDBVariablePortWSDDServiceName = "Management.DBVariablePort";

    public java.lang.String getManagementDBVariablePortWSDDServiceName() {
        return ManagementDBVariablePortWSDDServiceName;
    }

    public void setManagementDBVariablePortWSDDServiceName(java.lang.String name) {
        ManagementDBVariablePortWSDDServiceName = name;
    }

    public iControl.ManagementDBVariablePortType getManagementDBVariablePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ManagementDBVariablePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getManagementDBVariablePort(endpoint);
    }

    public iControl.ManagementDBVariablePortType getManagementDBVariablePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.ManagementDBVariableBindingStub _stub = new iControl.ManagementDBVariableBindingStub(portAddress, this);
            _stub.setPortName(getManagementDBVariablePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setManagementDBVariablePortEndpointAddress(java.lang.String address) {
        ManagementDBVariablePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.ManagementDBVariablePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.ManagementDBVariableBindingStub _stub = new iControl.ManagementDBVariableBindingStub(new java.net.URL(ManagementDBVariablePort_address), this);
                _stub.setPortName(getManagementDBVariablePortWSDDServiceName());
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
        if ("Management.DBVariablePort".equals(inputPortName)) {
            return getManagementDBVariablePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "Management.DBVariable");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "Management.DBVariablePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ManagementDBVariablePort".equals(portName)) {
            setManagementDBVariablePortEndpointAddress(address);
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
