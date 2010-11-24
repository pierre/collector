/**
 * LocalLBRAMCacheInformationLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBRAMCacheInformationLocator extends org.apache.axis.client.Service implements iControl.LocalLBRAMCacheInformation {

/**
 * The RAMCacheInformation interface enables you to query for RAM
 * cache entries/statistics, 
 *  as well as evicting RAM cache entries.
 */

    public LocalLBRAMCacheInformationLocator() {
    }


    public LocalLBRAMCacheInformationLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LocalLBRAMCacheInformationLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LocalLBRAMCacheInformationPort
    private java.lang.String LocalLBRAMCacheInformationPort_address = "https://url_to_service";

    public java.lang.String getLocalLBRAMCacheInformationPortAddress() {
        return LocalLBRAMCacheInformationPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LocalLBRAMCacheInformationPortWSDDServiceName = "LocalLB.RAMCacheInformationPort";

    public java.lang.String getLocalLBRAMCacheInformationPortWSDDServiceName() {
        return LocalLBRAMCacheInformationPortWSDDServiceName;
    }

    public void setLocalLBRAMCacheInformationPortWSDDServiceName(java.lang.String name) {
        LocalLBRAMCacheInformationPortWSDDServiceName = name;
    }

    public iControl.LocalLBRAMCacheInformationPortType getLocalLBRAMCacheInformationPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LocalLBRAMCacheInformationPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLocalLBRAMCacheInformationPort(endpoint);
    }

    public iControl.LocalLBRAMCacheInformationPortType getLocalLBRAMCacheInformationPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.LocalLBRAMCacheInformationBindingStub _stub = new iControl.LocalLBRAMCacheInformationBindingStub(portAddress, this);
            _stub.setPortName(getLocalLBRAMCacheInformationPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLocalLBRAMCacheInformationPortEndpointAddress(java.lang.String address) {
        LocalLBRAMCacheInformationPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.LocalLBRAMCacheInformationPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.LocalLBRAMCacheInformationBindingStub _stub = new iControl.LocalLBRAMCacheInformationBindingStub(new java.net.URL(LocalLBRAMCacheInformationPort_address), this);
                _stub.setPortName(getLocalLBRAMCacheInformationPortWSDDServiceName());
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
        if ("LocalLB.RAMCacheInformationPort".equals(inputPortName)) {
            return getLocalLBRAMCacheInformationPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "LocalLB.RAMCacheInformation");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "LocalLB.RAMCacheInformationPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LocalLBRAMCacheInformationPort".equals(portName)) {
            setLocalLBRAMCacheInformationPortEndpointAddress(address);
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
