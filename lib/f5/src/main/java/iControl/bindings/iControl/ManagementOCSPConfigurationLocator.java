/**
 * ManagementOCSPConfigurationLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementOCSPConfigurationLocator extends org.apache.axis.client.Service implements iControl.ManagementOCSPConfiguration {

/**
 * The OCSPConfiguration interface enables you to manage OCSP PAM
 * configuration.
 */

    public ManagementOCSPConfigurationLocator() {
    }


    public ManagementOCSPConfigurationLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ManagementOCSPConfigurationLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ManagementOCSPConfigurationPort
    private java.lang.String ManagementOCSPConfigurationPort_address = "https://url_to_service";

    public java.lang.String getManagementOCSPConfigurationPortAddress() {
        return ManagementOCSPConfigurationPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ManagementOCSPConfigurationPortWSDDServiceName = "Management.OCSPConfigurationPort";

    public java.lang.String getManagementOCSPConfigurationPortWSDDServiceName() {
        return ManagementOCSPConfigurationPortWSDDServiceName;
    }

    public void setManagementOCSPConfigurationPortWSDDServiceName(java.lang.String name) {
        ManagementOCSPConfigurationPortWSDDServiceName = name;
    }

    public iControl.ManagementOCSPConfigurationPortType getManagementOCSPConfigurationPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ManagementOCSPConfigurationPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getManagementOCSPConfigurationPort(endpoint);
    }

    public iControl.ManagementOCSPConfigurationPortType getManagementOCSPConfigurationPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.ManagementOCSPConfigurationBindingStub _stub = new iControl.ManagementOCSPConfigurationBindingStub(portAddress, this);
            _stub.setPortName(getManagementOCSPConfigurationPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setManagementOCSPConfigurationPortEndpointAddress(java.lang.String address) {
        ManagementOCSPConfigurationPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.ManagementOCSPConfigurationPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.ManagementOCSPConfigurationBindingStub _stub = new iControl.ManagementOCSPConfigurationBindingStub(new java.net.URL(ManagementOCSPConfigurationPort_address), this);
                _stub.setPortName(getManagementOCSPConfigurationPortWSDDServiceName());
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
        if ("Management.OCSPConfigurationPort".equals(inputPortName)) {
            return getManagementOCSPConfigurationPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "Management.OCSPConfiguration");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "Management.OCSPConfigurationPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ManagementOCSPConfigurationPort".equals(portName)) {
            setManagementOCSPConfigurationPortEndpointAddress(address);
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
