/**
 * LocalLBProfileSCTPLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBProfileSCTPLocator extends org.apache.axis.client.Service implements iControl.LocalLBProfileSCTP {

/**
 * The ProfileSCTP interface enables you to manipulate a local load
 * balancer's SCTP profile.
 */

    public LocalLBProfileSCTPLocator() {
    }


    public LocalLBProfileSCTPLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LocalLBProfileSCTPLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LocalLBProfileSCTPPort
    private java.lang.String LocalLBProfileSCTPPort_address = "https://url_to_service";

    public java.lang.String getLocalLBProfileSCTPPortAddress() {
        return LocalLBProfileSCTPPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LocalLBProfileSCTPPortWSDDServiceName = "LocalLB.ProfileSCTPPort";

    public java.lang.String getLocalLBProfileSCTPPortWSDDServiceName() {
        return LocalLBProfileSCTPPortWSDDServiceName;
    }

    public void setLocalLBProfileSCTPPortWSDDServiceName(java.lang.String name) {
        LocalLBProfileSCTPPortWSDDServiceName = name;
    }

    public iControl.LocalLBProfileSCTPPortType getLocalLBProfileSCTPPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LocalLBProfileSCTPPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLocalLBProfileSCTPPort(endpoint);
    }

    public iControl.LocalLBProfileSCTPPortType getLocalLBProfileSCTPPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.LocalLBProfileSCTPBindingStub _stub = new iControl.LocalLBProfileSCTPBindingStub(portAddress, this);
            _stub.setPortName(getLocalLBProfileSCTPPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLocalLBProfileSCTPPortEndpointAddress(java.lang.String address) {
        LocalLBProfileSCTPPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.LocalLBProfileSCTPPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.LocalLBProfileSCTPBindingStub _stub = new iControl.LocalLBProfileSCTPBindingStub(new java.net.URL(LocalLBProfileSCTPPort_address), this);
                _stub.setPortName(getLocalLBProfileSCTPPortWSDDServiceName());
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
        if ("LocalLB.ProfileSCTPPort".equals(inputPortName)) {
            return getLocalLBProfileSCTPPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileSCTP");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileSCTPPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LocalLBProfileSCTPPort".equals(portName)) {
            setLocalLBProfileSCTPPortEndpointAddress(address);
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
