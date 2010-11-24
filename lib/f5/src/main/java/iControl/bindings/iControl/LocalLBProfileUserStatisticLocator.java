/**
 * LocalLBProfileUserStatisticLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBProfileUserStatisticLocator extends org.apache.axis.client.Service implements iControl.LocalLBProfileUserStatistic {

/**
 * The ProfileUserStatistic interface enables you to manage user-defined
 * statistics in a profile.
 *  The user can define up to 32 user-defined statistics in each profile.
 */

    public LocalLBProfileUserStatisticLocator() {
    }


    public LocalLBProfileUserStatisticLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LocalLBProfileUserStatisticLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LocalLBProfileUserStatisticPort
    private java.lang.String LocalLBProfileUserStatisticPort_address = "https://url_to_service";

    public java.lang.String getLocalLBProfileUserStatisticPortAddress() {
        return LocalLBProfileUserStatisticPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LocalLBProfileUserStatisticPortWSDDServiceName = "LocalLB.ProfileUserStatisticPort";

    public java.lang.String getLocalLBProfileUserStatisticPortWSDDServiceName() {
        return LocalLBProfileUserStatisticPortWSDDServiceName;
    }

    public void setLocalLBProfileUserStatisticPortWSDDServiceName(java.lang.String name) {
        LocalLBProfileUserStatisticPortWSDDServiceName = name;
    }

    public iControl.LocalLBProfileUserStatisticPortType getLocalLBProfileUserStatisticPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LocalLBProfileUserStatisticPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLocalLBProfileUserStatisticPort(endpoint);
    }

    public iControl.LocalLBProfileUserStatisticPortType getLocalLBProfileUserStatisticPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.LocalLBProfileUserStatisticBindingStub _stub = new iControl.LocalLBProfileUserStatisticBindingStub(portAddress, this);
            _stub.setPortName(getLocalLBProfileUserStatisticPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLocalLBProfileUserStatisticPortEndpointAddress(java.lang.String address) {
        LocalLBProfileUserStatisticPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.LocalLBProfileUserStatisticPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.LocalLBProfileUserStatisticBindingStub _stub = new iControl.LocalLBProfileUserStatisticBindingStub(new java.net.URL(LocalLBProfileUserStatisticPort_address), this);
                _stub.setPortName(getLocalLBProfileUserStatisticPortWSDDServiceName());
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
        if ("LocalLB.ProfileUserStatisticPort".equals(inputPortName)) {
            return getLocalLBProfileUserStatisticPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileUserStatistic");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "LocalLB.ProfileUserStatisticPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LocalLBProfileUserStatisticPort".equals(portName)) {
            setLocalLBProfileUserStatisticPortEndpointAddress(address);
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
