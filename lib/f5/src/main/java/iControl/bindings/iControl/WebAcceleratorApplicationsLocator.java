/**
 * WebAcceleratorApplicationsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class WebAcceleratorApplicationsLocator extends org.apache.axis.client.Service implements iControl.WebAcceleratorApplications {

/**
 * Allows manipulation of Applications.
 */

    public WebAcceleratorApplicationsLocator() {
    }


    public WebAcceleratorApplicationsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebAcceleratorApplicationsLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WebAcceleratorApplicationsPort
    private java.lang.String WebAcceleratorApplicationsPort_address = "https://url_to_service";

    public java.lang.String getWebAcceleratorApplicationsPortAddress() {
        return WebAcceleratorApplicationsPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WebAcceleratorApplicationsPortWSDDServiceName = "WebAccelerator.ApplicationsPort";

    public java.lang.String getWebAcceleratorApplicationsPortWSDDServiceName() {
        return WebAcceleratorApplicationsPortWSDDServiceName;
    }

    public void setWebAcceleratorApplicationsPortWSDDServiceName(java.lang.String name) {
        WebAcceleratorApplicationsPortWSDDServiceName = name;
    }

    public iControl.WebAcceleratorApplicationsPortType getWebAcceleratorApplicationsPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WebAcceleratorApplicationsPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWebAcceleratorApplicationsPort(endpoint);
    }

    public iControl.WebAcceleratorApplicationsPortType getWebAcceleratorApplicationsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.WebAcceleratorApplicationsBindingStub _stub = new iControl.WebAcceleratorApplicationsBindingStub(portAddress, this);
            _stub.setPortName(getWebAcceleratorApplicationsPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWebAcceleratorApplicationsPortEndpointAddress(java.lang.String address) {
        WebAcceleratorApplicationsPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.WebAcceleratorApplicationsPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.WebAcceleratorApplicationsBindingStub _stub = new iControl.WebAcceleratorApplicationsBindingStub(new java.net.URL(WebAcceleratorApplicationsPort_address), this);
                _stub.setPortName(getWebAcceleratorApplicationsPortWSDDServiceName());
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
        if ("WebAccelerator.ApplicationsPort".equals(inputPortName)) {
            return getWebAcceleratorApplicationsPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "WebAccelerator.Applications");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "WebAccelerator.ApplicationsPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WebAcceleratorApplicationsPort".equals(portName)) {
            setWebAcceleratorApplicationsPortEndpointAddress(address);
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
