/**
 * GlobalLBRulePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface GlobalLBRulePortType extends java.rmi.Remote {

    /**
     * Creates the specified rules.
     */
    public void create(iControl.GlobalLBRuleRuleDefinition[] rules) throws java.rmi.RemoteException;

    /**
     * Deletes all user-defined rules.
     */
    public void delete_all_rules() throws java.rmi.RemoteException;

    /**
     * Deletes the specified rules.  An exception will be raised when
     * attempting to delete
     *  a default system rule.
     */
    public void delete_rule(java.lang.String[] rule_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for all the rules.
     */
    public iControl.GlobalLBRuleRuleStatistics get_all_statistics() throws java.rmi.RemoteException;

    /**
     * Gets a list of all rules.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the statistics for the specified rules.
     */
    public iControl.GlobalLBRuleRuleStatistics get_statistics(java.lang.String[] rule_names) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Modifies the specified rules.
     */
    public void modify_rule(iControl.GlobalLBRuleRuleDefinition[] rules) throws java.rmi.RemoteException;

    /**
     * Queries all rules.
     */
    public iControl.GlobalLBRuleRuleDefinition[] query_all_rules() throws java.rmi.RemoteException;

    /**
     * Queries the specified rules.
     */
    public iControl.GlobalLBRuleRuleDefinition[] query_rule(java.lang.String[] rule_names) throws java.rmi.RemoteException;

    /**
     * Resets the statistics for the specified rules.
     */
    public void reset_statistics(java.lang.String[] rule_names) throws java.rmi.RemoteException;
}
