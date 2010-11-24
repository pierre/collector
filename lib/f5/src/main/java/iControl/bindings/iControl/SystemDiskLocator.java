/**
 * SystemDiskLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class SystemDiskLocator extends org.apache.axis.client.Service implements iControl.SystemDisk {

/**
 * The Disk interface enables you to manage the disks in the system.
 * 
 *  The disk objects come in two flavors.  "Physical disks" are the actual
 * hardware disk drives, which can be anything from a true hard disk
 * to a
 *  compact flash drive to a USB flash drive.  Physical disks are addressed
 * by their serial numbers.  "Logical disks" are the view of the disk
 * drives from the system's point of view, abstracting the disk itself,
 * making all disk drives look the same whether they are a true hard
 * disk,
 *  a flash drive, or a full disk array.  In other words, a logical disk
 * can hold one or more physical disks.  Logical disks are addressed
 * by
 *  the LogicalDisk identifier, which includes their logical name (e.g.,
 * "HD2", "CF1", "MD1") and their chassis slot identifier.
 * 
 *  It is important to note the potentially confusing relationship between
 * logical and physical disks and their identifiers.  All physical disks
 * can be addressed by a LogicalDisk identifier, though it is not
 *  guaranteed that all physical disks have an entry in the logical disk
 * table.  The logical disk
 *  identifier for a physical disk is dependent on the connection of
 * the
 *  disk drive to the system, so can change if the system's disk drive
 * configuration changes.  On the other hand, all logical disks hold
 * one
 *  or more physical disks, which can have a direct one-to-one mapping
 * for a
 *  single disk drive or a one-to-many mapping for a disk array.  To
 * avoid
 *  problems, physical disks should be ideally addressed only by their
 * serial numbers and logical disks only by their LogicalDisk identifiers.
 * Addressing physical disks by their LogicalDisk identifier is supported
 * as a convenience for any user-generated input.  Be careful with these
 * distinctions as you use this interface.
 */

    public SystemDiskLocator() {
    }


    public SystemDiskLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SystemDiskLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SystemDiskPort
    private java.lang.String SystemDiskPort_address = "https://url_to_service";

    public java.lang.String getSystemDiskPortAddress() {
        return SystemDiskPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SystemDiskPortWSDDServiceName = "System.DiskPort";

    public java.lang.String getSystemDiskPortWSDDServiceName() {
        return SystemDiskPortWSDDServiceName;
    }

    public void setSystemDiskPortWSDDServiceName(java.lang.String name) {
        SystemDiskPortWSDDServiceName = name;
    }

    public iControl.SystemDiskPortType getSystemDiskPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SystemDiskPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSystemDiskPort(endpoint);
    }

    public iControl.SystemDiskPortType getSystemDiskPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iControl.SystemDiskBindingStub _stub = new iControl.SystemDiskBindingStub(portAddress, this);
            _stub.setPortName(getSystemDiskPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSystemDiskPortEndpointAddress(java.lang.String address) {
        SystemDiskPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iControl.SystemDiskPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                iControl.SystemDiskBindingStub _stub = new iControl.SystemDiskBindingStub(new java.net.URL(SystemDiskPort_address), this);
                _stub.setPortName(getSystemDiskPortWSDDServiceName());
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
        if ("System.DiskPort".equals(inputPortName)) {
            return getSystemDiskPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:iControl", "System.Disk");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:iControl", "System.DiskPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SystemDiskPort".equals(portName)) {
            setSystemDiskPortEndpointAddress(address);
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
