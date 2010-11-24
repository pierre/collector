/**
 * ManagementOCSPConfigurationPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementOCSPConfigurationPortType extends java.rmi.Remote {

    /**
     * Adds/associates responders to the specified OCSP configurations.
     */
    public void add_responder(java.lang.String[] config_names, java.lang.String[][] responders) throws java.rmi.RemoteException;

    /**
     * Creates the specified OCSP configurations.
     */
    public void create(java.lang.String[] config_names, java.lang.String[][] responders) throws java.rmi.RemoteException;

    /**
     * Deletes all OCSP configurations.
     */
    public void delete_all_configurations() throws java.rmi.RemoteException;

    /**
     * Deletes the specified OCSP configurations.
     */
    public void delete_configuration(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets a list of all OCSP configurations.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the lists of responders the specified OCSP configurations
     * are associated with.
     */
    public java.lang.String[][] get_responder(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Removes all responders from the specified OCSP configurations.
     */
    public void remove_all_responders(java.lang.String[] config_names) throws java.rmi.RemoteException;

    /**
     * Removes responders from the specified OCSP configurations.
     */
    public void remove_responder(java.lang.String[] config_names, java.lang.String[][] responders) throws java.rmi.RemoteException;
}
