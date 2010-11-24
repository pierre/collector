/**
 * ManagementKeyCertificateLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementKeyCertificateLocator extends org.apache.axis.client.Service implements iControl.ManagementKeyCertificate {

/**
 * The KeyCertificate interface exposes methods that enable you to
 * manage keys, certificates,
 *  and certificate requests.  All methods in this interface are atomic
 * operations, such that 
 *  each operation involves creating a session context with the key/certificate
 * management 
 *  library, performing the required action, and cleaning up and/or destroying
 * the session 
 *  context when completed.  Therefore, all operations are stateless.
 * 
 *  Note that all operations on keys, certificates, and certificate requests
 * are performed in 
 *  the directory location containing keys, certs, csr's... as structured
 * for Apache, which is 
 *  currently /config/ssl.  For archiving operations, you have the option
 * of exporting
 *  or importing archives to/from other locations.  If the location is
 * not specified, the default
 *  location of /config/ssl will be used.
 */

    public ManagementKeyCertificateLocator() {
    }


    public ManagementKeyCertificateLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ManagementKeyCertificateLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ManagementKeyCertificatePort
    private java.lang.String ManagementKeyCertificatePort_address = "https://url_to_service";

    public java.lang.String getManagementKeyCertificatePortAddress() {
        return ManagementKeyCertificatePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ManagementKeyCertificatePortWSDDServiceName = "Management.KeyCertificatePort";

    public java.lang.String getManagementKeyCertificatePortWSDDServiceName() {
        return ManagementKeyCertificatePortWSDDServiceName;
    }

    public void setManagementKeyCertificatePortWSDDServiceName(java.lang.String name) {
        ManagementKeyCertificatePortWSDDServiceName = name;
    }

    public iControl.ManagementKeyCertificatePortType getManagementKeyCertificatePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ManagementKeyCertificatePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getManagementKeyCertificatePort(endpoint);
    }

    public iControl.ManagementKeyCertificatePortType getManagementKeyCertificatePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.ManagementKeyCertificateBindingStub _stub = new iControl.ManagementKeyCertificateBindingStub(portAddress, this);
            _stub.setPortName(getManagementKeyCertificatePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setManagementKeyCertificatePortEndpointAddress(java.lang.String address) {
        ManagementKeyCertificatePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.ManagementKeyCertificatePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.ManagementKeyCertificateBindingStub _stub = new iControl.ManagementKeyCertificateBindingStub(new java.net.URL(ManagementKeyCertificatePort_address), this);
                _stub.setPortName(getManagementKeyCertificatePortWSDDServiceName());
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
        if ("Management.KeyCertificatePort".equals(inputPortName)) {
            return getManagementKeyCertificatePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "Management.KeyCertificate");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "Management.KeyCertificatePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ManagementKeyCertificatePort".equals(portName)) {
            setManagementKeyCertificatePortEndpointAddress(address);
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
