/**
 * GlobalLBTopologyLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBTopologyLocator extends org.apache.axis.client.Service implements iControl.GlobalLBTopology {

/**
 * The Topology interface enables you to work with topology attributes.
 * For example, you can create and 
 *  delete a topology.  You can also use the Topology interface to add
 * virtual server entries to, 
 *  or remove virtual server entries from, a topology.
 */

    public GlobalLBTopologyLocator() {
    }


    public GlobalLBTopologyLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GlobalLBTopologyLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GlobalLBTopologyPort
    private java.lang.String GlobalLBTopologyPort_address = "https://url_to_service";

    public java.lang.String getGlobalLBTopologyPortAddress() {
        return GlobalLBTopologyPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GlobalLBTopologyPortWSDDServiceName = "GlobalLB.TopologyPort";

    public java.lang.String getGlobalLBTopologyPortWSDDServiceName() {
        return GlobalLBTopologyPortWSDDServiceName;
    }

    public void setGlobalLBTopologyPortWSDDServiceName(java.lang.String name) {
        GlobalLBTopologyPortWSDDServiceName = name;
    }

    public iControl.GlobalLBTopologyPortType getGlobalLBTopologyPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GlobalLBTopologyPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGlobalLBTopologyPort(endpoint);
    }

    public iControl.GlobalLBTopologyPortType getGlobalLBTopologyPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.GlobalLBTopologyBindingStub _stub = new iControl.GlobalLBTopologyBindingStub(portAddress, this);
            _stub.setPortName(getGlobalLBTopologyPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGlobalLBTopologyPortEndpointAddress(java.lang.String address) {
        GlobalLBTopologyPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.GlobalLBTopologyPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.GlobalLBTopologyBindingStub _stub = new iControl.GlobalLBTopologyBindingStub(new java.net.URL(GlobalLBTopologyPort_address), this);
                _stub.setPortName(getGlobalLBTopologyPortWSDDServiceName());
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
        if ("GlobalLB.TopologyPort".equals(inputPortName)) {
            return getGlobalLBTopologyPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "GlobalLB.Topology");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.TopologyPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GlobalLBTopologyPort".equals(portName)) {
            setGlobalLBTopologyPortEndpointAddress(address);
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
