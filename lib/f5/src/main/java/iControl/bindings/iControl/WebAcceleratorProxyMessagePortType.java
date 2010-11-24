/**
 * WebAcceleratorProxyMessagePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface WebAcceleratorProxyMessagePortType extends java.rmi.Remote {

    /**
     * Invalidates the content on the peer pvac after receiving a
     * trigger in a HTTP request.
     */
    public void invalidate_content(byte[] invalidation_message) throws java.rmi.RemoteException;

    /**
     * Invalidates the WA content after receiving an ESI Invaidation.
     */
    public void esi_invalidate_content(byte[] invalidation_message) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;
}
