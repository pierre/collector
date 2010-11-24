/**
 * WebAcceleratorPoliciesPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface WebAcceleratorPoliciesPortType extends java.rmi.Remote {

    /**
     * Delete a named Policy.
     */
    public void delete_policy(java.lang.String name) throws java.rmi.RemoteException;

    /**
     * Get a list of Policies present on this WebAccelerator.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Import a Policy onto this WebAccelerator.
     */
    public void import_policy(java.lang.String filename, boolean overwrite) throws java.rmi.RemoteException;
}
