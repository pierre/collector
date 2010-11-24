/**
 * ManagementEventNotificationLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementEventNotificationLocator extends org.apache.axis.client.Service implements iControl.ManagementEventNotification {

/**
 * The EventNotification interface is used for system configuration
 * change events that are configured with the EventSubscriptions interface.
 */

    public ManagementEventNotificationLocator() {
    }


    public ManagementEventNotificationLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ManagementEventNotificationLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ManagementEventNotificationPort
    private java.lang.String ManagementEventNotificationPort_address = "https://url_to_service";

    public java.lang.String getManagementEventNotificationPortAddress() {
        return ManagementEventNotificationPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ManagementEventNotificationPortWSDDServiceName = "Management.EventNotificationPort";

    public java.lang.String getManagementEventNotificationPortWSDDServiceName() {
        return ManagementEventNotificationPortWSDDServiceName;
    }

    public void setManagementEventNotificationPortWSDDServiceName(java.lang.String name) {
        ManagementEventNotificationPortWSDDServiceName = name;
    }

    public iControl.ManagementEventNotificationPortType getManagementEventNotificationPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ManagementEventNotificationPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getManagementEventNotificationPort(endpoint);
    }

    public iControl.ManagementEventNotificationPortType getManagementEventNotificationPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.ManagementEventNotificationBindingStub _stub = new iControl.ManagementEventNotificationBindingStub(portAddress, this);
            _stub.setPortName(getManagementEventNotificationPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setManagementEventNotificationPortEndpointAddress(java.lang.String address) {
        ManagementEventNotificationPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.ManagementEventNotificationPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.ManagementEventNotificationBindingStub _stub = new iControl.ManagementEventNotificationBindingStub(new java.net.URL(ManagementEventNotificationPort_address), this);
                _stub.setPortName(getManagementEventNotificationPortWSDDServiceName());
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
        if ("Management.EventNotificationPort".equals(inputPortName)) {
            return getManagementEventNotificationPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "Management.EventNotification");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "Management.EventNotificationPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ManagementEventNotificationPort".equals(portName)) {
            setManagementEventNotificationPortEndpointAddress(address);
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
