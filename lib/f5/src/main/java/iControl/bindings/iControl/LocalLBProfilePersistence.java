/**
 * LocalLBProfilePersistence.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBProfilePersistence extends javax.xml.rpc.Service {

/**
 * The ProfilePersistence interface enables you to manipulate a local
 * load balancer's Persistence profile.
 */
    public java.lang.String getLocalLBProfilePersistencePortAddress();

    public iControl.LocalLBProfilePersistencePortType getLocalLBProfilePersistencePort() throws javax.xml.rpc.ServiceException;

    public iControl.LocalLBProfilePersistencePortType getLocalLBProfilePersistencePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
