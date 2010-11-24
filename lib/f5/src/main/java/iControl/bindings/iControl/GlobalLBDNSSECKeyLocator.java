/**
 * GlobalLBDNSSECKeyLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBDNSSECKeyLocator extends org.apache.axis.client.Service implements iControl.GlobalLBDNSSECKey {

/**
 * The DNSSECKey interface manages the cryptographic keys used for
 * securing DNS information, i.e., DNSSEC.  The keys managed by this
 *  interface can be used to sign DNS record groups and the keys
 *  themselves.
 * 
 *  Technically, there is not a single key for each key object.  This
 * key
 *  is re-created on a regular schedule, which can be controlled via
 * this
 *  interface.  Each re-generated key is considered a new "generation"
 * - a
 *  term used more in its genealogical sense than a creation sense. 
 * A
 *  single key generation can have its lifetime changed.  Thus when using
 * this interface, be careful to distinguish the attributes which apply
 * to this whole process vs those that apply to a single key generation.
 * 
 *  Once a key generation is created, it is fully active for the "rollover
 * period".  At the end of that period, the next generation's key is
 *  created and both keys are in use.  Once the first key reaches the
 * end
 *  of its "expiration period", it is no longer handed out, the generation
 * is deleted, and only the second key is in use.  This process continues
 * ad infinitum.
 * 
 *  It is important to note that these keys do not affect the processing
 * by
 *  their mere existence.  To take effect, they must be assigned to a
 * DNSSEC zone (See the DNSSECZone interface).
 */

    public GlobalLBDNSSECKeyLocator() {
    }


    public GlobalLBDNSSECKeyLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GlobalLBDNSSECKeyLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GlobalLBDNSSECKeyPort
    private java.lang.String GlobalLBDNSSECKeyPort_address = "https://url_to_service";

    public java.lang.String getGlobalLBDNSSECKeyPortAddress() {
        return GlobalLBDNSSECKeyPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GlobalLBDNSSECKeyPortWSDDServiceName = "GlobalLB.DNSSECKeyPort";

    public java.lang.String getGlobalLBDNSSECKeyPortWSDDServiceName() {
        return GlobalLBDNSSECKeyPortWSDDServiceName;
    }

    public void setGlobalLBDNSSECKeyPortWSDDServiceName(java.lang.String name) {
        GlobalLBDNSSECKeyPortWSDDServiceName = name;
    }

    public iControl.GlobalLBDNSSECKeyPortType getGlobalLBDNSSECKeyPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GlobalLBDNSSECKeyPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGlobalLBDNSSECKeyPort(endpoint);
    }

    public iControl.GlobalLBDNSSECKeyPortType getGlobalLBDNSSECKeyPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.GlobalLBDNSSECKeyBindingStub _stub = new iControl.GlobalLBDNSSECKeyBindingStub(portAddress, this);
            _stub.setPortName(getGlobalLBDNSSECKeyPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGlobalLBDNSSECKeyPortEndpointAddress(java.lang.String address) {
        GlobalLBDNSSECKeyPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.GlobalLBDNSSECKeyPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.GlobalLBDNSSECKeyBindingStub _stub = new iControl.GlobalLBDNSSECKeyBindingStub(new java.net.URL(GlobalLBDNSSECKeyPort_address), this);
                _stub.setPortName(getGlobalLBDNSSECKeyPortWSDDServiceName());
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
        if ("GlobalLB.DNSSECKeyPort".equals(inputPortName)) {
            return getGlobalLBDNSSECKeyPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "GlobalLB.DNSSECKey");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.DNSSECKeyPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GlobalLBDNSSECKeyPort".equals(portName)) {
            setGlobalLBDNSSECKeyPortEndpointAddress(address);
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
