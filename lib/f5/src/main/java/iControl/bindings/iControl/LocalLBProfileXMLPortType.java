/**
 * LocalLBProfileXMLPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBProfileXMLPortType extends java.rmi.Remote {

    /**
     * Adds sets of namespace mappings to a set of XML profiles.
     *  Specifies a list of mappings between namespaces and prefixes to be
     * used 
     *  in the profile context.
     *  
     *  For example, to define a namespace mapping of XML schema namespace
     * one would add   
     *  the namespace mapping of the prefix "xsd" to the namespace "http://www.w3.org/2001/XMLSchema".
     */
    public void add_namespace_mappings(java.lang.String[] profile_names, iControl.LocalLBProfileXMLNamespaceMapping[][] namespace_mappings) throws java.rmi.RemoteException;

    /**
     * Adds sets of XPath query strings to a set of XML profiles.
     *  A match of any of the queries will trigger an iRule event.
     * 
     *  For example, to trigger an iRule event on document having 
     *  title of the first book node under the bookstore element it's needed
     * to add the
     *  "/bookstore/book[1]/title" XPath query to a xml profile.
     */
    public void add_xpath_queries(java.lang.String[] profile_names, java.lang.String[][] xpath_queries) throws java.rmi.RemoteException;

    /**
     * Creates the specified XML profiles.
     */
    public void create(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Deletes all XML profiles.
     */
    public void delete_all_profiles() throws java.rmi.RemoteException;

    /**
     * Deletes the specified XML profiles.
     */
    public void delete_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the state that if true, abort the connection on errors.
     */
    public iControl.LocalLBProfileEnabledState[] get_abort_on_error_state(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for all the XML profiles.
     */
    public iControl.LocalLBProfileXMLProfileXMLStatistics get_all_statistics() throws java.rmi.RemoteException;

    /**
     * Gets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public java.lang.String[] get_default_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets a list of all XML profiles.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the values that specify the maximum buffer size for the
     * specified profiles.
     */
    public iControl.LocalLBProfileULong[] get_maximum_buffer_size(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets sets of namespace mappings of a set of XML profiles.
     */
    public iControl.LocalLBProfileXMLProfileNamespaceMappingSequence[] get_namespace_mappings(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for the specified XML profiles.
     */
    public iControl.LocalLBProfileXMLProfileXMLStatistics get_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Gets sets of XPath query strings of a set of XML profiles.
     */
    public iControl.LocalLBProfileStringArray[] get_xpath_queries(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Determines whether the specified profiles are base/pre-configured
     * profiles, or user-defined profiles.
     */
    public boolean[] is_base_profile(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Removes all the namespace mappings from a set of XML profiles.
     */
    public void remove_all_namespace_mappings(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Removes all the XPath queries from a set of XML profiles.
     */
    public void remove_all_xpath_queries(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Removes sets of namespace mappings from a set of XML profiles.
     */
    public void remove_namespace_mappings(java.lang.String[] profile_names, iControl.LocalLBProfileXMLNamespaceMapping[][] namespace_mappings) throws java.rmi.RemoteException;

    /**
     * Removes sets of XPath query strings from a set of XML profiles.
     */
    public void remove_xpath_queries(java.lang.String[] profile_names, java.lang.String[][] xpath_queries) throws java.rmi.RemoteException;

    /**
     * Resets the statistics for the specified XML profiles.
     */
    public void reset_statistics(java.lang.String[] profile_names) throws java.rmi.RemoteException;

    /**
     * Sets the state that if true, abort the connection on errors.
     */
    public void set_abort_on_error_state(java.lang.String[] profile_names, iControl.LocalLBProfileEnabledState[] states) throws java.rmi.RemoteException;

    /**
     * Sets the names of the default profiles from which the specified
     * profiles will derive
     *  default values for its attributes.
     */
    public void set_default_profile(java.lang.String[] profile_names, java.lang.String[] defaults) throws java.rmi.RemoteException;

    /**
     * Sets the values that specify the maximum buffer size for the
     * specified profiles.
     */
    public void set_maximum_buffer_size(java.lang.String[] profile_names, iControl.LocalLBProfileULong[] sizes) throws java.rmi.RemoteException;
}
