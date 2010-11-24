/**
 * SystemClusterLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class SystemClusterLocator extends org.apache.axis.client.Service implements iControl.SystemCluster {

/**
 * The Cluster interface enables you to work with the definitions
 * and attributes in a clustered device.
 */

    public SystemClusterLocator() {
    }


    public SystemClusterLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SystemClusterLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SystemClusterPort
    private java.lang.String SystemClusterPort_address = "https://url_to_service";

    public java.lang.String getSystemClusterPortAddress() {
        return SystemClusterPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SystemClusterPortWSDDServiceName = "System.ClusterPort";

    public java.lang.String getSystemClusterPortWSDDServiceName() {
        return SystemClusterPortWSDDServiceName;
    }

    public void setSystemClusterPortWSDDServiceName(java.lang.String name) {
        SystemClusterPortWSDDServiceName = name;
    }

    public iControl.SystemClusterPortType getSystemClusterPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SystemClusterPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSystemClusterPort(endpoint);
    }

    public iControl.SystemClusterPortType getSystemClusterPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.SystemClusterBindingStub _stub = new iControl.SystemClusterBindingStub(portAddress, this);
            _stub.setPortName(getSystemClusterPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSystemClusterPortEndpointAddress(java.lang.String address) {
        SystemClusterPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.SystemClusterPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.SystemClusterBindingStub _stub = new iControl.SystemClusterBindingStub(new java.net.URL(SystemClusterPort_address), this);
                _stub.setPortName(getSystemClusterPortWSDDServiceName());
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
        if ("System.ClusterPort".equals(inputPortName)) {
            return getSystemClusterPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "System.Cluster");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "System.ClusterPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SystemClusterPort".equals(portName)) {
            setSystemClusterPortEndpointAddress(address);
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
