/**
 * LocalLBRuleLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class LocalLBRuleLocator extends org.apache.axis.client.Service implements iControl.LocalLBRule {

/**
 * The Rule interface enables you to manipulate a local load balancer's
 * rules.  For example, use the Rule interface to get a list of all rules,
 * create rules, delete rules, modify rules, and query rules.
 */

    public LocalLBRuleLocator() {
    }


    public LocalLBRuleLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LocalLBRuleLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LocalLBRulePort
    private java.lang.String LocalLBRulePort_address = "https://url_to_service";

    public java.lang.String getLocalLBRulePortAddress() {
        return LocalLBRulePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LocalLBRulePortWSDDServiceName = "LocalLB.RulePort";

    public java.lang.String getLocalLBRulePortWSDDServiceName() {
        return LocalLBRulePortWSDDServiceName;
    }

    public void setLocalLBRulePortWSDDServiceName(java.lang.String name) {
        LocalLBRulePortWSDDServiceName = name;
    }

    public iControl.LocalLBRulePortType getLocalLBRulePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LocalLBRulePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLocalLBRulePort(endpoint);
    }

    public iControl.LocalLBRulePortType getLocalLBRulePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.LocalLBRuleBindingStub _stub = new iControl.LocalLBRuleBindingStub(portAddress, this);
            _stub.setPortName(getLocalLBRulePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLocalLBRulePortEndpointAddress(java.lang.String address) {
        LocalLBRulePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.LocalLBRulePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.LocalLBRuleBindingStub _stub = new iControl.LocalLBRuleBindingStub(new java.net.URL(LocalLBRulePort_address), this);
                _stub.setPortName(getLocalLBRulePortWSDDServiceName());
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
        if ("LocalLB.RulePort".equals(inputPortName)) {
            return getLocalLBRulePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "LocalLB.Rule");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "LocalLB.RulePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LocalLBRulePort".equals(portName)) {
            setLocalLBRulePortEndpointAddress(address);
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
