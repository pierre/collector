/**
 * ManagementUserManagementPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementUserManagementPortType extends java.rmi.Remote {

    /**
     * Change the password of the user making the request.
     */
    public void change_my_password(iControl.ManagementUserManagementPasswordInfo password) throws java.rmi.RemoteException;

    /**
     * Change the user's password.
     */
    public void change_password(java.lang.String[] user_names, java.lang.String[] passwords) throws java.rmi.RemoteException;

    /**
     * Change the user's password.
     */
    public void change_password_2(java.lang.String[] user_names, iControl.ManagementUserManagementPasswordInfo[] passwords) throws java.rmi.RemoteException;

    /**
     * Note: this method is deprecated; please use create_user_3 and
     * associated data.
     *  (home directory, user id, and group id are now computed by the system,
     * and
     *  there is now a choice of whether the password is encrypted)
     * 
     *  Create the specified new users.
     * 
     *  Note: as of v10.1.0, this method will silently ignore any
     *  of user id, group id, and home directory passed in.
     */
    public void create_user(iControl.ManagementUserManagementUserInfo[] users) throws java.rmi.RemoteException;

    /**
     * Note: this method is deprecated; please use create_user_3 and
     * associated data.
     *  (home directory, user id, and group id are now computed by the system)
     * 
     *  Create the specified new users.
     * 
     *  Note: as of v10.1.0, this method will silently ignore any
     *  of user id, group id, and home directory passed in.
     */
    public void create_user_2(iControl.ManagementUserManagementUserInfo2[] users) throws java.rmi.RemoteException;

    /**
     * Create the specified new users.
     */
    public void create_user_3(iControl.ManagementUserManagementUserInfo3[] users) throws java.rmi.RemoteException;

    /**
     * Delete the specified users.
     */
    public void delete_user(java.lang.String[] user_names) throws java.rmi.RemoteException;

    /**
     * Get the authentication method that the system will use to authenticate
     * users.
     */
    public iControl.CommonAuthenticationMethod get_authentication_method() throws java.rmi.RemoteException;

    /**
     * Get the default user partition for the device.
     */
    public java.lang.String get_default_partition() throws java.rmi.RemoteException;

    /**
     * Get the default user role for the device.
     */
    public iControl.ManagementUserManagementUserRole get_default_role() throws java.rmi.RemoteException;

    /**
     * Gets the encrypted passwords of the specified users.
     */
    public java.lang.String[] get_encrypted_password(java.lang.String[] user_names) throws java.rmi.RemoteException;

    /**
     * Get the full names for the given users.
     */
    public java.lang.String[] get_fullname(java.lang.String[] user_names) throws java.rmi.RemoteException;

    /**
     * Get the Group IDs for the given usernames.
     */
    public long[] get_group_id(java.lang.String[] user_names) throws java.rmi.RemoteException;

    /**
     * Get the default home directories for the given usernames.
     */
    public java.lang.String[] get_home_directory(java.lang.String[] user_names) throws java.rmi.RemoteException;

    /**
     * List all users.
     */
    public iControl.ManagementUserManagementUserID[] get_list() throws java.rmi.RemoteException;

    /**
     * Get the login shells for the given usernames.
     */
    public java.lang.String[] get_login_shell(java.lang.String[] user_names) throws java.rmi.RemoteException;

    /**
     * Gets the credentials of the user making the request.  This
     *  is useful in getting your own permission information
     *  (regardless of which partitions you may otherwise
     *  read). The results indicate what role you have on a what
     *  partitions.
     */
    public iControl.ManagementUserManagementUserPermission[] get_my_permission() throws java.rmi.RemoteException;

    /**
     * Get the user remote console access for the device.
     */
    public boolean get_remote_console_access() throws java.rmi.RemoteException;

    /**
     * This method is now deprecated.  Please use get_user_permission
     * in
     *  its stead, which uses a larger concept of user roles.
     * 
     *  Gets the roles of the specified users.
     */
    public iControl.ManagementUserManagementUserRole[] get_role(java.lang.String[] user_names) throws java.rmi.RemoteException;

    /**
     * Get the User IDs for the given usernames.
     */
    public long[] get_user_id(java.lang.String[] user_names) throws java.rmi.RemoteException;

    /**
     * Gets the permissions of the specified users. The permission
     * basically
     *  indicates what role a user has on a given partition.  A user could
     * have
     *  one role on a partition, and a different role on another partition,
     * hence
     *  the return list is a sequence of sequence.
     */
    public iControl.ManagementUserManagementUserPermission[][] get_user_permission(java.lang.String[] user_names) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Checks to see if a user is locked out due to exceeding the
     * maximum number of
     *  allowed login failures.  Return whether the user is locked out.
     */
    public boolean[] is_locked_out(java.lang.String[] user_names) throws java.rmi.RemoteException;

    /**
     * Resets the lockout status of a user that has exceeded the maximum
     * number of
     *  allowed login failures.
     *  Unlocks all users provided in user_names unless an error occurs where
     * it
     *  may unlock up to that user that caused the error.
     */
    public void reset_locked_out(java.lang.String[] user_names) throws java.rmi.RemoteException;

    /**
     * Sets the authentication method that the system will use to
     * authenticate users.
     */
    public void set_authentication_method(iControl.CommonAuthenticationMethod auth_method) throws java.rmi.RemoteException;

    /**
     * Sets the default user partition for the device if the user
     * does not have an explicit partition.
     */
    public void set_default_partition(java.lang.String partition) throws java.rmi.RemoteException;

    /**
     * Sets the default user role for the device if the user does
     * not have an explicit role.
     */
    public void set_default_role(iControl.ManagementUserManagementUserRole role) throws java.rmi.RemoteException;

    /**
     * Sets the full names for the specified users.
     */
    public void set_fullname(java.lang.String[] user_names, java.lang.String[] fullnames) throws java.rmi.RemoteException;

    /**
     * This method is deprecated, as the operation is not allowed
     * (and will return an error).
     * 
     *  Sets the Group IDs for the specified users.
     */
    public void set_group_id(java.lang.String[] user_names, long[] gids) throws java.rmi.RemoteException;

    /**
     * This method is deprecated, as the operation is not allowed
     * (and will return an error).
     * 
     *  Sets the home directories for the specified users.
     */
    public void set_home_directory(java.lang.String[] user_names, java.lang.String[] directories) throws java.rmi.RemoteException;

    /**
     * Sets the login shells for the specified users.
     */
    public void set_login_shell(java.lang.String[] user_names, java.lang.String[] shells) throws java.rmi.RemoteException;

    /**
     * Sets the user remote console access for the device if the user
     * does not have an explicit remote console access.
     */
    public void set_remote_console_access(boolean enabled) throws java.rmi.RemoteException;

    /**
     * This method is now deprecated.  Please use set_user_permission
     * in
     *  its stead, which uses a larger concept of user roles.
     * 
     *  Change the user's role.
     */
    public void set_role(java.lang.String[] user_names, iControl.ManagementUserManagementUserRole[] roles) throws java.rmi.RemoteException;

    /**
     * This method is deprecated, as the operation is not allowed
     * (and will return an error).
     * 
     *  Sets the User IDs for the specified users.
     */
    public void set_user_id(java.lang.String[] user_names, long[] uids) throws java.rmi.RemoteException;

    /**
     * Sets the permissions of the specified users. The permission
     * basically
     *  indicates what role a user has on a given partition. A user could
     * have
     *  one role on a partition, and a different role on another partition,
     * hence
     *  the permission list is a sequence of sequence.
     */
    public void set_user_permission(java.lang.String[] user_names, iControl.ManagementUserManagementUserPermission[][] permissions) throws java.rmi.RemoteException;
}
