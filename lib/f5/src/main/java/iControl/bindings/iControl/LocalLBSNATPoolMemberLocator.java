/**
 * LocalLBSNATPoolMemberLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBSNATPoolMemberLocator extends org.apache.axis.client.Service implements iControl.LocalLBSNATPoolMember {

/**
 * The SNATPoolMember interface enables you to work with the SNATPool
 * members and their settings, and statistics.
 */

    public LocalLBSNATPoolMemberLocator() {
    }


    public LocalLBSNATPoolMemberLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LocalLBSNATPoolMemberLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LocalLBSNATPoolMemberPort
    private java.lang.String LocalLBSNATPoolMemberPort_address = "https://url_to_service";

    public java.lang.String getLocalLBSNATPoolMemberPortAddress() {
        return LocalLBSNATPoolMemberPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LocalLBSNATPoolMemberPortWSDDServiceName = "LocalLB.SNATPoolMemberPort";

    public java.lang.String getLocalLBSNATPoolMemberPortWSDDServiceName() {
        return LocalLBSNATPoolMemberPortWSDDServiceName;
    }

    public void setLocalLBSNATPoolMemberPortWSDDServiceName(java.lang.String name) {
        LocalLBSNATPoolMemberPortWSDDServiceName = name;
    }

    public iControl.LocalLBSNATPoolMemberPortType getLocalLBSNATPoolMemberPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LocalLBSNATPoolMemberPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLocalLBSNATPoolMemberPort(endpoint);
    }

    public iControl.LocalLBSNATPoolMemberPortType getLocalLBSNATPoolMemberPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.LocalLBSNATPoolMemberBindingStub _stub = new iControl.LocalLBSNATPoolMemberBindingStub(portAddress, this);
            _stub.setPortName(getLocalLBSNATPoolMemberPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLocalLBSNATPoolMemberPortEndpointAddress(java.lang.String address) {
        LocalLBSNATPoolMemberPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.LocalLBSNATPoolMemberPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.LocalLBSNATPoolMemberBindingStub _stub = new iControl.LocalLBSNATPoolMemberBindingStub(new java.net.URL(LocalLBSNATPoolMemberPort_address), this);
                _stub.setPortName(getLocalLBSNATPoolMemberPortWSDDServiceName());
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
        if ("LocalLB.SNATPoolMemberPort".equals(inputPortName)) {
            return getLocalLBSNATPoolMemberPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "LocalLB.SNATPoolMember");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "LocalLB.SNATPoolMemberPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LocalLBSNATPoolMemberPort".equals(portName)) {
            setLocalLBSNATPoolMemberPortEndpointAddress(address);
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
