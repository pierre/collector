/**
 * LocalLBRateClassLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBRateClassLocator extends org.apache.axis.client.Service implements iControl.LocalLBRateClass {

/**
 * The RateClass interface enables you to work with the definitions
 * and attributes of a rate class class. 
 *  Rate filtering refers to the ability to enforce configurable bandwidth
 * consumption limitations upon 
 *  user-defined traffic classes. The purpose of a Rate class is to allow
 * the network administrator to 
 *  effectively divide a single bandwidth resource through a gateway
 * among preferred applications or traffic 
 *  classes. Rate filtering is somewhat related to packet filtering.
 * The key difference between the two is 
 *  that packet filters seek to enforce an access policy on traffic,
 * and Rate Filter classes seek to enforce a 
 *  throughput policy on traffic.
 */

    public LocalLBRateClassLocator() {
    }


    public LocalLBRateClassLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LocalLBRateClassLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LocalLBRateClassPort
    private java.lang.String LocalLBRateClassPort_address = "https://url_to_service";

    public java.lang.String getLocalLBRateClassPortAddress() {
        return LocalLBRateClassPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LocalLBRateClassPortWSDDServiceName = "LocalLB.RateClassPort";

    public java.lang.String getLocalLBRateClassPortWSDDServiceName() {
        return LocalLBRateClassPortWSDDServiceName;
    }

    public void setLocalLBRateClassPortWSDDServiceName(java.lang.String name) {
        LocalLBRateClassPortWSDDServiceName = name;
    }

    public iControl.LocalLBRateClassPortType getLocalLBRateClassPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LocalLBRateClassPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLocalLBRateClassPort(endpoint);
    }

    public iControl.LocalLBRateClassPortType getLocalLBRateClassPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.LocalLBRateClassBindingStub _stub = new iControl.LocalLBRateClassBindingStub(portAddress, this);
            _stub.setPortName(getLocalLBRateClassPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLocalLBRateClassPortEndpointAddress(java.lang.String address) {
        LocalLBRateClassPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.LocalLBRateClassPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.LocalLBRateClassBindingStub _stub = new iControl.LocalLBRateClassBindingStub(new java.net.URL(LocalLBRateClassPort_address), this);
                _stub.setPortName(getLocalLBRateClassPortWSDDServiceName());
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
        if ("LocalLB.RateClassPort".equals(inputPortName)) {
            return getLocalLBRateClassPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "LocalLB.RateClass");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "LocalLB.RateClassPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LocalLBRateClassPort".equals(portName)) {
            setLocalLBRateClassPortEndpointAddress(address);
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
