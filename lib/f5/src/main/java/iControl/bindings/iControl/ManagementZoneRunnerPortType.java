/**
 * ManagementZoneRunnerPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementZoneRunnerPortType extends java.rmi.Remote {

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * (re)init ZoneRunner
     *  instructs ZoneRunner to re-read named.conf and rebuild its 
     *  internal data structures based on contents
     */
    public void init() throws java.rmi.RemoteException;

    /**
     * Set the logging level for messages
     */
    public void set_loglevel(iControl.ManagementDebugLevel level) throws java.rmi.RemoteException;
}
