/**
 * SystemFailoverPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface SystemFailoverPortType extends java.rmi.Remote {

    /**
     * Gets the current fail-over mode that the device is running
     * in.
     */
    public iControl.SystemFailoverFailoverMode get_failover_mode() throws java.rmi.RemoteException;

    /**
     * Gets the current fail-over state that the device is running
     * in.
     */
    public iControl.SystemFailoverFailoverState get_failover_state() throws java.rmi.RemoteException;

    /**
     * Gets the peer IP address(es) in a redundant pair.  There will
     * be a primary
     *  address and possibly a secondary address.  The primary will be the
     * first
     *  entry in the returned list.
     */
    public java.lang.String[] get_peer_address() throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Checks to see if this device is part of a redundant pair.
     */
    public boolean is_redundant() throws java.rmi.RemoteException;

    /**
     * Restores an active-active device configuration after a failure.
     * 
     *  You can only use this command after the DB key "Failover.ManFailBack"
     * has been created, 
     *  and set to a value of "enable".
     */
    public void set_failback() throws java.rmi.RemoteException;

    /**
     * Sets the device to "forced offline" state.
     */
    public void set_offline() throws java.rmi.RemoteException;

    /**
     * Sets the device to release the "forced offline" state.
     */
    public void set_offline_release() throws java.rmi.RemoteException;

    /**
     * Sets the device to standby mode.
     */
    public void set_standby() throws java.rmi.RemoteException;
}
