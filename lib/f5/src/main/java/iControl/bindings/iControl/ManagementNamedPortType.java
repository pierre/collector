/**
 * ManagementNamedPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementNamedPortType extends java.rmi.Remote {

    /**
     * Deletes the "acl" statements specified by the statement names.
     */
    public void delete_acl_statement(java.lang.String[] statement_names) throws java.rmi.RemoteException;

    /**
     * Deletes the "controls"  statement. There can only be one "controls"
     * statement in the file.
     */
    public void delete_controls_statement() throws java.rmi.RemoteException;

    /**
     * Deletes the "include"  statements.
     */
    public void delete_include_statement(java.lang.String[] path_names) throws java.rmi.RemoteException;

    /**
     * Deletes the specified "key" statements.
     */
    public void delete_key_statement(java.lang.String[] statement_names) throws java.rmi.RemoteException;

    /**
     * Deletes an "logging"  statement. There can only be one "logging"
     * statement in the file.
     */
    public void delete_logging_statement() throws java.rmi.RemoteException;

    /**
     * Deletes the "options"  statement. There can only be one "options"
     * statement in the file.
     */
    public void delete_options_statement() throws java.rmi.RemoteException;

    /**
     * Deletes the "server" statements.
     */
    public void delete_server_statement(java.lang.String[] statement_names) throws java.rmi.RemoteException;

    /**
     * Deletes an "trusted_keys"  statement. There can only be one
     * "trusted_keys" statement in the file.
     */
    public void delete_trusted_keys_statement() throws java.rmi.RemoteException;

    /**
     * Get the version of bind (named) running on the server as a
     * string
     */
    public java.lang.String get_bind_version() throws java.rmi.RemoteException;

    /**
     * Gets the entire contents of the named.conf file in a sequence
     * of strings, one per line.
     */
    public java.lang.String[] get_named_configuration_file() throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Adds the new "acl name" statements if they do not already exist.
     * If the "acl name" statement already exists, it will delete the 
     *  existing statement and replace it with this one.
     */
    public void set_acl_statement(iControl.ManagementStatementDefinition[] statements) throws java.rmi.RemoteException;

    /**
     * Sets the "controls" statement. If there is no existing controls
     * statement, one is added. If one exists, it is deleted and replaced
     * with this new one.  There can only be one "controls" statement in
     * the file.
     */
    public void set_controls_statement(iControl.ManagementStatementDefinition statement) throws java.rmi.RemoteException;

    /**
     * Adds the specified "include" statements
     */
    public void set_include_statement(iControl.ManagementStatementDefinition[] statements) throws java.rmi.RemoteException;

    /**
     * Sets the "key"  statements. If a key statement with this name
     * already exists, it is deleted and the new one is added.
     *  Otherwise the key statements will be added.
     */
    public void set_key_statement(iControl.ManagementStatementDefinition[] statements) throws java.rmi.RemoteException;

    /**
     * Sets a new "logging" statement.
     *  If the logging statement exists, it is deleted and replaced with
     *  the new statement. If there is no logging statement, this one is
     * added.
     *  There can only be one "logging" statement in the file.
     */
    public void set_logging_statement(iControl.ManagementStatementDefinition statement) throws java.rmi.RemoteException;

    /**
     * If there is an existing "options" statement, it is replaced
     * with this statement. If there is no existing "options" statement,
     * this new one is added.
     *  There can only be one "options" statement in the file.
     */
    public void set_options_statement(iControl.ManagementStatementDefinition statement) throws java.rmi.RemoteException;

    /**
     * Adds the new "server" statements if they do not exist.
     *  If they exist, these statements will replace them.
     */
    public void set_server_statement(iControl.ManagementStatementDefinition[] statements) throws java.rmi.RemoteException;

    /**
     * Adds a new "trusted-keys" statement or replaces the existing
     * one.
     *  There can only be one "trusted_keys" statement in the file.
     */
    public void set_trusted_keys_statement(iControl.ManagementStatementDefinition statement) throws java.rmi.RemoteException;
}
