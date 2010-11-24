/**
 * LocalLBSNATPoolLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBSNATPoolLocator extends org.apache.axis.client.Service implements iControl.LocalLBSNATPool {

/**
 * The SNATPool interface enables you to work with the definitions
 * contained in a local load balancer's SNAT pool,
 *  which is a set of translation addresses.  Either a virtual server,
 * an iRule or a top-level SNAT object can 
 *  reference a SNAT pool.
 */

    public LocalLBSNATPoolLocator() {
    }


    public LocalLBSNATPoolLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LocalLBSNATPoolLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LocalLBSNATPoolPort
    private java.lang.String LocalLBSNATPoolPort_address = "https://url_to_service";

    public java.lang.String getLocalLBSNATPoolPortAddress() {
        return LocalLBSNATPoolPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LocalLBSNATPoolPortWSDDServiceName = "LocalLB.SNATPoolPort";

    public java.lang.String getLocalLBSNATPoolPortWSDDServiceName() {
        return LocalLBSNATPoolPortWSDDServiceName;
    }

    public void setLocalLBSNATPoolPortWSDDServiceName(java.lang.String name) {
        LocalLBSNATPoolPortWSDDServiceName = name;
    }

    public iControl.LocalLBSNATPoolPortType getLocalLBSNATPoolPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LocalLBSNATPoolPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLocalLBSNATPoolPort(endpoint);
    }

    public iControl.LocalLBSNATPoolPortType getLocalLBSNATPoolPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.LocalLBSNATPoolBindingStub _stub = new iControl.LocalLBSNATPoolBindingStub(portAddress, this);
            _stub.setPortName(getLocalLBSNATPoolPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLocalLBSNATPoolPortEndpointAddress(java.lang.String address) {
        LocalLBSNATPoolPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.LocalLBSNATPoolPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.LocalLBSNATPoolBindingStub _stub = new iControl.LocalLBSNATPoolBindingStub(new java.net.URL(LocalLBSNATPoolPort_address), this);
                _stub.setPortName(getLocalLBSNATPoolPortWSDDServiceName());
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
        if ("LocalLB.SNATPoolPort".equals(inputPortName)) {
            return getLocalLBSNATPoolPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "LocalLB.SNATPool");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "LocalLB.SNATPoolPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LocalLBSNATPoolPort".equals(portName)) {
            setLocalLBSNATPoolPortEndpointAddress(address);
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
