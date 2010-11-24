/**
 * SystemSystemInfoLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class SystemSystemInfoLocator extends org.apache.axis.client.Service implements iControl.SystemSystemInfo {

/**
 * The SystemInfo interface enables you to query identifying attributes
 * of the system.
 */

    public SystemSystemInfoLocator() {
    }


    public SystemSystemInfoLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SystemSystemInfoLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SystemSystemInfoPort
    private java.lang.String SystemSystemInfoPort_address = "https://url_to_service";

    public java.lang.String getSystemSystemInfoPortAddress() {
        return SystemSystemInfoPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SystemSystemInfoPortWSDDServiceName = "System.SystemInfoPort";

    public java.lang.String getSystemSystemInfoPortWSDDServiceName() {
        return SystemSystemInfoPortWSDDServiceName;
    }

    public void setSystemSystemInfoPortWSDDServiceName(java.lang.String name) {
        SystemSystemInfoPortWSDDServiceName = name;
    }

    public iControl.SystemSystemInfoPortType getSystemSystemInfoPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SystemSystemInfoPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSystemSystemInfoPort(endpoint);
    }

    public iControl.SystemSystemInfoPortType getSystemSystemInfoPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.SystemSystemInfoBindingStub _stub = new iControl.SystemSystemInfoBindingStub(portAddress, this);
            _stub.setPortName(getSystemSystemInfoPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSystemSystemInfoPortEndpointAddress(java.lang.String address) {
        SystemSystemInfoPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.SystemSystemInfoPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.SystemSystemInfoBindingStub _stub = new iControl.SystemSystemInfoBindingStub(new java.net.URL(SystemSystemInfoPort_address), this);
                _stub.setPortName(getSystemSystemInfoPortWSDDServiceName());
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
        if ("System.SystemInfoPort".equals(inputPortName)) {
            return getSystemSystemInfoPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "System.SystemInfo");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "System.SystemInfoPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SystemSystemInfoPort".equals(portName)) {
            setSystemSystemInfoPortEndpointAddress(address);
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
