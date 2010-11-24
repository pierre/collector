/**
 * ASMSystemConfigurationLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ASMSystemConfigurationLocator extends org.apache.axis.client.Service implements iControl.ASMSystemConfiguration {

/**
 * The SystemConfiguration interface enables you to manipulate system-wide
 * settings of ASM.
 */

    public ASMSystemConfigurationLocator() {
    }


    public ASMSystemConfigurationLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ASMSystemConfigurationLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ASMSystemConfigurationPort
    private java.lang.String ASMSystemConfigurationPort_address = "https://url_to_service";

    public java.lang.String getASMSystemConfigurationPortAddress() {
        return ASMSystemConfigurationPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ASMSystemConfigurationPortWSDDServiceName = "ASM.SystemConfigurationPort";

    public java.lang.String getASMSystemConfigurationPortWSDDServiceName() {
        return ASMSystemConfigurationPortWSDDServiceName;
    }

    public void setASMSystemConfigurationPortWSDDServiceName(java.lang.String name) {
        ASMSystemConfigurationPortWSDDServiceName = name;
    }

    public iControl.ASMSystemConfigurationPortType getASMSystemConfigurationPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ASMSystemConfigurationPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getASMSystemConfigurationPort(endpoint);
    }

    public iControl.ASMSystemConfigurationPortType getASMSystemConfigurationPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.ASMSystemConfigurationBindingStub _stub = new iControl.ASMSystemConfigurationBindingStub(portAddress, this);
            _stub.setPortName(getASMSystemConfigurationPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setASMSystemConfigurationPortEndpointAddress(java.lang.String address) {
        ASMSystemConfigurationPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.ASMSystemConfigurationPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.ASMSystemConfigurationBindingStub _stub = new iControl.ASMSystemConfigurationBindingStub(new java.net.URL(ASMSystemConfigurationPort_address), this);
                _stub.setPortName(getASMSystemConfigurationPortWSDDServiceName());
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
        if ("ASM.SystemConfigurationPort".equals(inputPortName)) {
            return getASMSystemConfigurationPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "ASM.SystemConfiguration");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "ASM.SystemConfigurationPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ASMSystemConfigurationPort".equals(portName)) {
            setASMSystemConfigurationPortEndpointAddress(address);
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
