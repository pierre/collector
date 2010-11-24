/**
 * SystemFailoverLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class SystemFailoverLocator extends org.apache.axis.client.Service implements iControl.SystemFailover {

/**
 * The Failover interface enables you to manipulate a device's fail-over
 * states.  For example, you can get the state, active or standby, 
 *  in which a device is running in a redundant configuration.  You can
 * also switch a device's state from active to standby.
 */

    public SystemFailoverLocator() {
    }


    public SystemFailoverLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SystemFailoverLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SystemFailoverPort
    private java.lang.String SystemFailoverPort_address = "https://url_to_service";

    public java.lang.String getSystemFailoverPortAddress() {
        return SystemFailoverPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SystemFailoverPortWSDDServiceName = "System.FailoverPort";

    public java.lang.String getSystemFailoverPortWSDDServiceName() {
        return SystemFailoverPortWSDDServiceName;
    }

    public void setSystemFailoverPortWSDDServiceName(java.lang.String name) {
        SystemFailoverPortWSDDServiceName = name;
    }

    public iControl.SystemFailoverPortType getSystemFailoverPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SystemFailoverPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSystemFailoverPort(endpoint);
    }

    public iControl.SystemFailoverPortType getSystemFailoverPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.SystemFailoverBindingStub _stub = new iControl.SystemFailoverBindingStub(portAddress, this);
            _stub.setPortName(getSystemFailoverPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSystemFailoverPortEndpointAddress(java.lang.String address) {
        SystemFailoverPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.SystemFailoverPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.SystemFailoverBindingStub _stub = new iControl.SystemFailoverBindingStub(new java.net.URL(SystemFailoverPort_address), this);
                _stub.setPortName(getSystemFailoverPortWSDDServiceName());
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
        if ("System.FailoverPort".equals(inputPortName)) {
            return getSystemFailoverPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "System.Failover");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "System.FailoverPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SystemFailoverPort".equals(portName)) {
            setSystemFailoverPortEndpointAddress(address);
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
