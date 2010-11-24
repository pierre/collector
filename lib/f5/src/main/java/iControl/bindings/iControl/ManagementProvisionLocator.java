/**
 * ManagementProvisionLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class ManagementProvisionLocator extends org.apache.axis.client.Service implements iControl.ManagementProvision {

/**
 * The Provision interface manages the partitioning of system memory,
 * disk
 *  space, and CPU usage among the modules (e.g., LTM, GTM, WOM) licensed
 * to run on the system.  The modules and the "host" system (everything
 * not dedicated to network traffic processing) are first assigned a
 *  minimal set of resources, based on pre-determined values and the
 *  available system memory.  The remaining resources are distributed
 * among
 *  the modules, according to pre-determined rules, which can be modified
 * by values which can be set via this iControl interface.  The
 *  pre-defined module resource allocation handles a wide variety of
 *  circumstances, so this allocation should only need to be changed
 * for
 *  unusual circumstances, such as turning modules on or off and large
 * network traffic or configurations.
 */

    public ManagementProvisionLocator() {
    }


    public ManagementProvisionLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ManagementProvisionLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ManagementProvisionPort
    private java.lang.String ManagementProvisionPort_address = "https://url_to_service";

    public java.lang.String getManagementProvisionPortAddress() {
        return ManagementProvisionPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ManagementProvisionPortWSDDServiceName = "Management.ProvisionPort";

    public java.lang.String getManagementProvisionPortWSDDServiceName() {
        return ManagementProvisionPortWSDDServiceName;
    }

    public void setManagementProvisionPortWSDDServiceName(java.lang.String name) {
        ManagementProvisionPortWSDDServiceName = name;
    }

    public iControl.ManagementProvisionPortType getManagementProvisionPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ManagementProvisionPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getManagementProvisionPort(endpoint);
    }

    public iControl.ManagementProvisionPortType getManagementProvisionPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.ManagementProvisionBindingStub _stub = new iControl.ManagementProvisionBindingStub(portAddress, this);
            _stub.setPortName(getManagementProvisionPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setManagementProvisionPortEndpointAddress(java.lang.String address) {
        ManagementProvisionPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.ManagementProvisionPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.ManagementProvisionBindingStub _stub = new iControl.ManagementProvisionBindingStub(new java.net.URL(ManagementProvisionPort_address), this);
                _stub.setPortName(getManagementProvisionPortWSDDServiceName());
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
        if ("Management.ProvisionPort".equals(inputPortName)) {
            return getManagementProvisionPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "Management.Provision");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "Management.ProvisionPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ManagementProvisionPort".equals(portName)) {
            setManagementProvisionPortEndpointAddress(address);
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
