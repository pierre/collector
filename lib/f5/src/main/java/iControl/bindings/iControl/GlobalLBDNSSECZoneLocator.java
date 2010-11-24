/**
 * GlobalLBDNSSECZoneLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBDNSSECZoneLocator extends org.apache.axis.client.Service implements iControl.GlobalLBDNSSECZone {

/**
 * The DNSSECZone interface manages the zones in which securing DNS
 * information, i.e., DNSSEC, is active.  When a zone is active, its
 * DNS
 *  record groups are digitally signed, the DNS record names are hashed,
 * and keys sent to upstream DNS servers are digitally signed.
 * 
 *  A DNSSEC zone can contain any number of DNSSEC keys, and a single
 * DNSSEC key can be used in more than one DNSSEC zone.  Note that a
 * large
 *  number of DNSSEC keys in a single DNSSEC zone can affect the
 *  responsiveness to DNS requests.
 * 
 *  Note that the term "zone" in this interface is not necessarily "zone"
 * in a DNS sense.
 * 
 *  See the DNSSECKey interface for managing the keys themselves.
 */

    public GlobalLBDNSSECZoneLocator() {
    }


    public GlobalLBDNSSECZoneLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GlobalLBDNSSECZoneLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GlobalLBDNSSECZonePort
    private java.lang.String GlobalLBDNSSECZonePort_address = "https://url_to_service";

    public java.lang.String getGlobalLBDNSSECZonePortAddress() {
        return GlobalLBDNSSECZonePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GlobalLBDNSSECZonePortWSDDServiceName = "GlobalLB.DNSSECZonePort";

    public java.lang.String getGlobalLBDNSSECZonePortWSDDServiceName() {
        return GlobalLBDNSSECZonePortWSDDServiceName;
    }

    public void setGlobalLBDNSSECZonePortWSDDServiceName(java.lang.String name) {
        GlobalLBDNSSECZonePortWSDDServiceName = name;
    }

    public iControl.GlobalLBDNSSECZonePortType getGlobalLBDNSSECZonePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GlobalLBDNSSECZonePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGlobalLBDNSSECZonePort(endpoint);
    }

    public iControl.GlobalLBDNSSECZonePortType getGlobalLBDNSSECZonePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.GlobalLBDNSSECZoneBindingStub _stub = new iControl.GlobalLBDNSSECZoneBindingStub(portAddress, this);
            _stub.setPortName(getGlobalLBDNSSECZonePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGlobalLBDNSSECZonePortEndpointAddress(java.lang.String address) {
        GlobalLBDNSSECZonePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.GlobalLBDNSSECZonePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.GlobalLBDNSSECZoneBindingStub _stub = new iControl.GlobalLBDNSSECZoneBindingStub(new java.net.URL(GlobalLBDNSSECZonePort_address), this);
                _stub.setPortName(getGlobalLBDNSSECZonePortWSDDServiceName());
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
        if ("GlobalLB.DNSSECZonePort".equals(inputPortName)) {
            return getGlobalLBDNSSECZonePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "GlobalLB.DNSSECZone");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.DNSSECZonePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GlobalLBDNSSECZonePort".equals(portName)) {
            setGlobalLBDNSSECZonePortEndpointAddress(address);
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
