/**
 * ManagementTACACSConfigurationLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementTACACSConfigurationLocator extends org.apache.axis.client.Service implements iControl.ManagementTACACSConfiguration {

/**
 * The TACACSConfiguration interface enables you to manage TACACS
 * PAM configuration.
 */

    public ManagementTACACSConfigurationLocator() {
    }


    public ManagementTACACSConfigurationLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ManagementTACACSConfigurationLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ManagementTACACSConfigurationPort
    private java.lang.String ManagementTACACSConfigurationPort_address = "https://url_to_service";

    public java.lang.String getManagementTACACSConfigurationPortAddress() {
        return ManagementTACACSConfigurationPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ManagementTACACSConfigurationPortWSDDServiceName = "Management.TACACSConfigurationPort";

    public java.lang.String getManagementTACACSConfigurationPortWSDDServiceName() {
        return ManagementTACACSConfigurationPortWSDDServiceName;
    }

    public void setManagementTACACSConfigurationPortWSDDServiceName(java.lang.String name) {
        ManagementTACACSConfigurationPortWSDDServiceName = name;
    }

    public iControl.ManagementTACACSConfigurationPortType getManagementTACACSConfigurationPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ManagementTACACSConfigurationPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getManagementTACACSConfigurationPort(endpoint);
    }

    public iControl.ManagementTACACSConfigurationPortType getManagementTACACSConfigurationPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.ManagementTACACSConfigurationBindingStub _stub = new iControl.ManagementTACACSConfigurationBindingStub(portAddress, this);
            _stub.setPortName(getManagementTACACSConfigurationPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setManagementTACACSConfigurationPortEndpointAddress(java.lang.String address) {
        ManagementTACACSConfigurationPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.ManagementTACACSConfigurationPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.ManagementTACACSConfigurationBindingStub _stub = new iControl.ManagementTACACSConfigurationBindingStub(new java.net.URL(ManagementTACACSConfigurationPort_address), this);
                _stub.setPortName(getManagementTACACSConfigurationPortWSDDServiceName());
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
        if ("Management.TACACSConfigurationPort".equals(inputPortName)) {
            return getManagementTACACSConfigurationPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "Management.TACACSConfiguration");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "Management.TACACSConfigurationPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ManagementTACACSConfigurationPort".equals(portName)) {
            setManagementTACACSConfigurationPortEndpointAddress(address);
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
