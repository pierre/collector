/**
 * ManagementRADIUSConfigurationLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementRADIUSConfigurationLocator extends org.apache.axis.client.Service implements iControl.ManagementRADIUSConfiguration {

/**
 * The RADIUSConfiguration interface enables you to manage RADIUS
 * PAM configuration.
 */

    public ManagementRADIUSConfigurationLocator() {
    }


    public ManagementRADIUSConfigurationLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ManagementRADIUSConfigurationLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ManagementRADIUSConfigurationPort
    private java.lang.String ManagementRADIUSConfigurationPort_address = "https://url_to_service";

    public java.lang.String getManagementRADIUSConfigurationPortAddress() {
        return ManagementRADIUSConfigurationPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ManagementRADIUSConfigurationPortWSDDServiceName = "Management.RADIUSConfigurationPort";

    public java.lang.String getManagementRADIUSConfigurationPortWSDDServiceName() {
        return ManagementRADIUSConfigurationPortWSDDServiceName;
    }

    public void setManagementRADIUSConfigurationPortWSDDServiceName(java.lang.String name) {
        ManagementRADIUSConfigurationPortWSDDServiceName = name;
    }

    public iControl.ManagementRADIUSConfigurationPortType getManagementRADIUSConfigurationPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ManagementRADIUSConfigurationPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getManagementRADIUSConfigurationPort(endpoint);
    }

    public iControl.ManagementRADIUSConfigurationPortType getManagementRADIUSConfigurationPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.ManagementRADIUSConfigurationBindingStub _stub = new iControl.ManagementRADIUSConfigurationBindingStub(portAddress, this);
            _stub.setPortName(getManagementRADIUSConfigurationPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setManagementRADIUSConfigurationPortEndpointAddress(java.lang.String address) {
        ManagementRADIUSConfigurationPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.ManagementRADIUSConfigurationPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.ManagementRADIUSConfigurationBindingStub _stub = new iControl.ManagementRADIUSConfigurationBindingStub(new java.net.URL(ManagementRADIUSConfigurationPort_address), this);
                _stub.setPortName(getManagementRADIUSConfigurationPortWSDDServiceName());
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
        if ("Management.RADIUSConfigurationPort".equals(inputPortName)) {
            return getManagementRADIUSConfigurationPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "Management.RADIUSConfiguration");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "Management.RADIUSConfigurationPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ManagementRADIUSConfigurationPort".equals(portName)) {
            setManagementRADIUSConfigurationPortEndpointAddress(address);
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
