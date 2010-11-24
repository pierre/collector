/**
 * LocalLBClassPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBClassPortType extends java.rmi.Remote {

    /**
     * Incrementally adds address class members.
     */
    public void add_address_class_member(iControl.LocalLBClassAddressClass[] class_members) throws java.rmi.RemoteException;

    /**
     * Incrementally adds string class members.
     */
    public void add_string_class_member(iControl.LocalLBClassStringClass[] class_members) throws java.rmi.RemoteException;

    /**
     * Incrementally adds value class members.
     */
    public void add_value_class_member(iControl.LocalLBClassValueClass[] class_members) throws java.rmi.RemoteException;

    /**
     * Creates address classes. The specified classes must not already
     * exist.
     */
    public void create_address_class(iControl.LocalLBClassAddressClass[] classes) throws java.rmi.RemoteException;

    /**
     * Creates external classes.
     *  
     *  Note: As of v9.6.0, the validation on the file_name field
     *  in external_classes was improved to ensure the class file
     *  exists on pain of Common::OperationFailed exception.
     */
    public void create_external_class(iControl.LocalLBClassMetaInformation[] external_classes) throws java.rmi.RemoteException;

    /**
     * Creates string classes. The specified classes must not already
     * exist.
     */
    public void create_string_class(iControl.LocalLBClassStringClass[] classes) throws java.rmi.RemoteException;

    /**
     * Creates value classes. The specified classes must not already
     * exist.
     */
    public void create_value_class(iControl.LocalLBClassValueClass[] classes) throws java.rmi.RemoteException;

    /**
     * Incrementally deletes address class members.
     */
    public void delete_address_class_member(iControl.LocalLBClassAddressClass[] class_members) throws java.rmi.RemoteException;

    /**
     * Deletes all address classes.
     */
    public void delete_all_address_classes() throws java.rmi.RemoteException;

    /**
     * Deletes all string classes.
     */
    public void delete_all_string_classes() throws java.rmi.RemoteException;

    /**
     * Deletes all value classes.
     */
    public void delete_all_value_classes() throws java.rmi.RemoteException;

    /**
     * Deletes the specified classes.  The specified classes can be
     * of any class type, even external classes.
     */
    public void delete_class(java.lang.String[] classes) throws java.rmi.RemoteException;

    /**
     * Incrementally deletes string class members.
     */
    public void delete_string_class_member(iControl.LocalLBClassStringClass[] class_members) throws java.rmi.RemoteException;

    /**
     * Incrementally deletes value class members.
     */
    public void delete_value_class_member(iControl.LocalLBClassValueClass[] class_members) throws java.rmi.RemoteException;

    /**
     * Checks to see if the specified class members are in the specified
     * class names.
     */
    public boolean[][] find_address_class_member(iControl.LocalLBClassAddressClass[] class_members) throws java.rmi.RemoteException;

    /**
     * Checks to see if the specified class members are in the specified
     * class names.
     */
    public boolean[][] find_string_class_member(iControl.LocalLBClassStringClass[] class_members) throws java.rmi.RemoteException;

    /**
     * Checks to see if the specified class members are in the specified
     * class names.
     */
    public boolean[][] find_value_class_member(iControl.LocalLBClassValueClass[] class_members) throws java.rmi.RemoteException;

    /**
     * Gets the specified address classes.
     */
    public iControl.LocalLBClassAddressClass[] get_address_class(java.lang.String[] class_names) throws java.rmi.RemoteException;

    /**
     * Gets the list of available address classes.
     */
    public java.lang.String[] get_address_class_list() throws java.rmi.RemoteException;

    /**
     * Gets the data values associated with a set of address class
     * members.  This method is effectively the lookup method for using
     *  the class as a value map.
     */
    public java.lang.String[][] get_address_class_member_data_value(iControl.LocalLBClassAddressClass[] class_members) throws java.rmi.RemoteException;

    /**
     * Gets the meta data information for the specified classes. For
     * external classes,
     *  the meta information will indicate the external file and other relevant
     * information.
     *  For non-external classes, only applicable information such as class
     * name/type will be 
     *  of importance.
     */
    public iControl.LocalLBClassMetaInformation[] get_class_meta_information(java.lang.String[] class_names) throws java.rmi.RemoteException;

    /**
     * Gets the class types for the specified classes.
     */
    public iControl.LocalLBClassClassType[] get_class_type(java.lang.String[] class_names) throws java.rmi.RemoteException;

    /**
     * Gets the strings used to separate a class member value from
     * its
     *  optional associated data value for a set of classes.
     */
    public java.lang.String[] get_data_separator(java.lang.String[] class_names) throws java.rmi.RemoteException;

    /**
     * Gets the file format for the specified classes. This should
     * only be called
     *  for external classes, since it does not make sense for non-external
     * classes.
     */
    public iControl.LocalLBClassFileFormatType[] get_external_class_file_format(java.lang.String[] class_names) throws java.rmi.RemoteException;

    /**
     * Gets the file modes for the specified classes. This should
     * only be called
     *  for external classes, since it does not make sense for non-external
     * classes.
     */
    public iControl.LocalLBClassFileModeType[] get_external_class_file_mode(java.lang.String[] class_names) throws java.rmi.RemoteException;

    /**
     * Gets the file names for the specified classes. This should
     * only be called
     *  for external classes, since it does not make sense for non-external
     * classes.
     */
    public java.lang.String[] get_external_class_file_name(java.lang.String[] class_names) throws java.rmi.RemoteException;

    /**
     * Gets the list of all available external classes.
     */
    public iControl.LocalLBClassMetaInformation[] get_external_class_list() throws java.rmi.RemoteException;

    /**
     * Gets the specified string classes.
     */
    public iControl.LocalLBClassStringClass[] get_string_class(java.lang.String[] class_names) throws java.rmi.RemoteException;

    /**
     * Gets the list of available string classes.
     */
    public java.lang.String[] get_string_class_list() throws java.rmi.RemoteException;

    /**
     * Gets the data values associated with a set of string class
     * members.
     *  This method is effectively the lookup method for using the class
     * as
     *  a value map.
     */
    public java.lang.String[][] get_string_class_member_data_value(iControl.LocalLBClassStringClass[] class_members) throws java.rmi.RemoteException;

    /**
     * Gets the specified value classes.
     */
    public iControl.LocalLBClassValueClass[] get_value_class(java.lang.String[] class_names) throws java.rmi.RemoteException;

    /**
     * Gets the list of available value classes.
     */
    public java.lang.String[] get_value_class_list() throws java.rmi.RemoteException;

    /**
     * Gets the data values associated with a set of value class members.
     * This method is effectively the lookup method for using the class as
     * a value map.
     */
    public java.lang.String[][] get_value_class_member_data_value(iControl.LocalLBClassValueClass[] class_members) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Modifies address classes. The specified classes must already
     * exist.
     */
    public void modify_address_class(iControl.LocalLBClassAddressClass[] classes) throws java.rmi.RemoteException;

    /**
     * Modifies  string classes. The specified classes must already
     * exist.
     */
    public void modify_string_class(iControl.LocalLBClassStringClass[] classes) throws java.rmi.RemoteException;

    /**
     * Modifies value classes. The specified classes must already
     * exist.
     */
    public void modify_value_class(iControl.LocalLBClassValueClass[] classes) throws java.rmi.RemoteException;

    /**
     * Sets the data values associated with a set of address class
     * members.  This data value is an optional arbitrary string, which
     *  can be retrieved given the class member information, allowing the
     * class to be used as a value map.
     */
    public void set_address_class_member_data_value(iControl.LocalLBClassAddressClass[] class_members, java.lang.String[][] values) throws java.rmi.RemoteException;

    /**
     * Sets the strings used to separate a class member value from
     * its
     *  optional associated data value for a set of classes.  This is used
     * for listing and storing both external and internal classes.
     */
    public void set_data_separator(java.lang.String[] class_names, java.lang.String[] separators) throws java.rmi.RemoteException;

    /**
     * Sets the file format for the specified classes. This should
     * only be called
     *  for external classes, since it does not make sense for non-external
     * classes.
     *  If called for non-external classes, it will silently accept it, but
     * nothing
     *  will be done.
     */
    public void set_external_class_file_format(java.lang.String[] class_names, iControl.LocalLBClassFileFormatType[] file_formats) throws java.rmi.RemoteException;

    /**
     * Sets the file mode for the specified classes. This should only
     * be called
     *  for external classes, since it does not make sense for non-external
     * classes.
     *  If called for non-external classes, it will silently accept it, but
     * nothing
     *  will be done.
     */
    public void set_external_class_file_mode(java.lang.String[] class_names, iControl.LocalLBClassFileModeType[] file_modes) throws java.rmi.RemoteException;

    /**
     * Sets the file names for the specified external classes. This
     * should only be called
     *  for external classes, since it does not make sense for non-external
     * classes.
     *  If called for non-external classes, it will silently accept it, but
     * nothing
     *  will be done.
     */
    public void set_external_class_file_name(java.lang.String[] class_names, java.lang.String[] file_names) throws java.rmi.RemoteException;

    /**
     * Sets the data values associated with a set of string class
     * members.
     *  This data value is an optional arbitrary string, which can be
     *  retrieved given the class member information, allowing the class
     * to
     *  be used as a value map.
     */
    public void set_string_class_member_data_value(iControl.LocalLBClassStringClass[] class_members, java.lang.String[][] values) throws java.rmi.RemoteException;

    /**
     * Sets the data values associated with a set of value class members.
     * This data value is an arbitrary optional string, which can be
     *  retrieved given the class member information, allowing the class
     * to
     *  be used as a value map.
     */
    public void set_value_class_member_data_value(iControl.LocalLBClassValueClass[] class_members, java.lang.String[][] values) throws java.rmi.RemoteException;
}
