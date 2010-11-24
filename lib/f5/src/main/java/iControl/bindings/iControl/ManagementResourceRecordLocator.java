/**
 * ManagementResourceRecordLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementResourceRecordLocator extends org.apache.axis.client.Service implements iControl.ManagementResourceRecord {

/**
 * The ResourceRecord interface contains all the calls necessary for
 * manipulating 
 *  Resource Records: adding/deleting/updating
 */

    public ManagementResourceRecordLocator() {
    }


    public ManagementResourceRecordLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ManagementResourceRecordLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ManagementResourceRecordPort
    private java.lang.String ManagementResourceRecordPort_address = "https://url_to_service";

    public java.lang.String getManagementResourceRecordPortAddress() {
        return ManagementResourceRecordPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ManagementResourceRecordPortWSDDServiceName = "Management.ResourceRecordPort";

    public java.lang.String getManagementResourceRecordPortWSDDServiceName() {
        return ManagementResourceRecordPortWSDDServiceName;
    }

    public void setManagementResourceRecordPortWSDDServiceName(java.lang.String name) {
        ManagementResourceRecordPortWSDDServiceName = name;
    }

    public iControl.ManagementResourceRecordPortType getManagementResourceRecordPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ManagementResourceRecordPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getManagementResourceRecordPort(endpoint);
    }

    public iControl.ManagementResourceRecordPortType getManagementResourceRecordPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.ManagementResourceRecordBindingStub _stub = new iControl.ManagementResourceRecordBindingStub(portAddress, this);
            _stub.setPortName(getManagementResourceRecordPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setManagementResourceRecordPortEndpointAddress(java.lang.String address) {
        ManagementResourceRecordPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.ManagementResourceRecordPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.ManagementResourceRecordBindingStub _stub = new iControl.ManagementResourceRecordBindingStub(new java.net.URL(ManagementResourceRecordPort_address), this);
                _stub.setPortName(getManagementResourceRecordPortWSDDServiceName());
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
        if ("Management.ResourceRecordPort".equals(inputPortName)) {
            return getManagementResourceRecordPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "Management.ResourceRecord");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "Management.ResourceRecordPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ManagementResourceRecordPort".equals(portName)) {
            setManagementResourceRecordPortEndpointAddress(address);
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
