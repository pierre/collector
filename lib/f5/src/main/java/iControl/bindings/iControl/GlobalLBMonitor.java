/**
 * GlobalLBMonitor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface GlobalLBMonitor extends javax.xml.rpc.Service {

/**
 * The Monitor interface enables you to manipulate a load balancer's
 * monitor templates and instances.  
 *  For example, use the Monitor interface to enable or disable a monitor
 * instance, or to create a monitor template,
 *  or to get and set different attributes of a monitor template.
 */
    public java.lang.String getGlobalLBMonitorPortAddress();

    public iControl.GlobalLBMonitorPortType getGlobalLBMonitorPort() throws javax.xml.rpc.ServiceException;

    public iControl.GlobalLBMonitorPortType getGlobalLBMonitorPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
