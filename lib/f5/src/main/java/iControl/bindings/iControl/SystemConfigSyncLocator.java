/**
 * SystemConfigSyncLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class SystemConfigSyncLocator extends org.apache.axis.client.Service implements iControl.SystemConfigSync {

/**
 * The ConfigSync interface enables you to work with configuration
 * files.  For example, use the 
 *  ConfigSync interface to retrieve a configuration file list, roll
 * up and save a specified configuration, 
 *  install a configuration on a device, synchronize configuration setups,
 * roll back a configuration, and 
 *  upload or download a configuration.
 */

    public SystemConfigSyncLocator() {
    }


    public SystemConfigSyncLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SystemConfigSyncLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SystemConfigSyncPort
    private java.lang.String SystemConfigSyncPort_address = "https://url_to_service";

    public java.lang.String getSystemConfigSyncPortAddress() {
        return SystemConfigSyncPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SystemConfigSyncPortWSDDServiceName = "System.ConfigSyncPort";

    public java.lang.String getSystemConfigSyncPortWSDDServiceName() {
        return SystemConfigSyncPortWSDDServiceName;
    }

    public void setSystemConfigSyncPortWSDDServiceName(java.lang.String name) {
        SystemConfigSyncPortWSDDServiceName = name;
    }

    public iControl.SystemConfigSyncPortType getSystemConfigSyncPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SystemConfigSyncPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSystemConfigSyncPort(endpoint);
    }

    public iControl.SystemConfigSyncPortType getSystemConfigSyncPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.SystemConfigSyncBindingStub _stub = new iControl.SystemConfigSyncBindingStub(portAddress, this);
            _stub.setPortName(getSystemConfigSyncPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSystemConfigSyncPortEndpointAddress(java.lang.String address) {
        SystemConfigSyncPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.SystemConfigSyncPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.SystemConfigSyncBindingStub _stub = new iControl.SystemConfigSyncBindingStub(new java.net.URL(SystemConfigSyncPort_address), this);
                _stub.setPortName(getSystemConfigSyncPortWSDDServiceName());
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
        if ("System.ConfigSyncPort".equals(inputPortName)) {
            return getSystemConfigSyncPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "System.ConfigSync");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "System.ConfigSyncPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SystemConfigSyncPort".equals(portName)) {
            setSystemConfigSyncPortEndpointAddress(address);
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
