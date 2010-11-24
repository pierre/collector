/**
 * ManagementDBVariablePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementDBVariablePortType extends java.rmi.Remote {

    /**
     * Creates the specified variables in the database.
     */
    public void create(iControl.ManagementDBVariableVariableNameValue[] variables) throws java.rmi.RemoteException;

    /**
     * Deletes the variables referenced from the database.
     */
    public void delete_variable(java.lang.String[] variables) throws java.rmi.RemoteException;

    /**
     * Retrieves the values of all variables defined in the database.
     * This list can potentially be huge.
     */
    public iControl.ManagementDBVariableVariableNameValue[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Verifies the existence of the specified variables in the database.
     */
    public boolean[] is_variable_available(java.lang.String[] variables) throws java.rmi.RemoteException;

    /**
     * Modifies the specified variables in the database.
     */
    public void modify(iControl.ManagementDBVariableVariableNameValue[] variables) throws java.rmi.RemoteException;

    /**
     * Queries the values of the specified variables.
     */
    public iControl.ManagementDBVariableVariableNameValue[] query(java.lang.String[] variables) throws java.rmi.RemoteException;

    /**
     * Resets the specified variables to their default values.
     */
    public void reset(java.lang.String[] variables) throws java.rmi.RemoteException;
}
