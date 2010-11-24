/**
 * GlobalLBDataCenterLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBDataCenterLocator extends org.apache.axis.client.Service implements iControl.GlobalLBDataCenter {

/**
 * The DataCenter interface enables you to manipulate the data center
 * attributes for a Global TM.  
 *  For example, use the DataCenter interface to add or remove a data
 * center, transfer server assignments 
 *  from one data center to another, get and set data center attributes,
 * remove a server from a data center, 
 *  and so on.
 */

    public GlobalLBDataCenterLocator() {
    }


    public GlobalLBDataCenterLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GlobalLBDataCenterLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GlobalLBDataCenterPort
    private java.lang.String GlobalLBDataCenterPort_address = "https://url_to_service";

    public java.lang.String getGlobalLBDataCenterPortAddress() {
        return GlobalLBDataCenterPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GlobalLBDataCenterPortWSDDServiceName = "GlobalLB.DataCenterPort";

    public java.lang.String getGlobalLBDataCenterPortWSDDServiceName() {
        return GlobalLBDataCenterPortWSDDServiceName;
    }

    public void setGlobalLBDataCenterPortWSDDServiceName(java.lang.String name) {
        GlobalLBDataCenterPortWSDDServiceName = name;
    }

    public iControl.GlobalLBDataCenterPortType getGlobalLBDataCenterPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GlobalLBDataCenterPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGlobalLBDataCenterPort(endpoint);
    }

    public iControl.GlobalLBDataCenterPortType getGlobalLBDataCenterPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.GlobalLBDataCenterBindingStub _stub = new iControl.GlobalLBDataCenterBindingStub(portAddress, this);
            _stub.setPortName(getGlobalLBDataCenterPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGlobalLBDataCenterPortEndpointAddress(java.lang.String address) {
        GlobalLBDataCenterPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.GlobalLBDataCenterPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.GlobalLBDataCenterBindingStub _stub = new iControl.GlobalLBDataCenterBindingStub(new java.net.URL(GlobalLBDataCenterPort_address), this);
                _stub.setPortName(getGlobalLBDataCenterPortWSDDServiceName());
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
        if ("GlobalLB.DataCenterPort".equals(inputPortName)) {
            return getGlobalLBDataCenterPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "GlobalLB.DataCenter");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.DataCenterPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GlobalLBDataCenterPort".equals(portName)) {
            setGlobalLBDataCenterPortEndpointAddress(address);
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
