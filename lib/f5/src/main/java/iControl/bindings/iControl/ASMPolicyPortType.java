/**
 * ASMPolicyPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ASMPolicyPortType extends java.rmi.Remote {

    /**
     * Add predictable resource location
     */
    public boolean add_predictable_resource_location(java.lang.String policy_name, java.lang.String[] uris) throws java.rmi.RemoteException;

    /**
     * Associates the WA web applictions to the ASM policy.
     */
    public void associate_wa_webapp(java.lang.String[] policy_names, java.lang.String[] wa_webapp_names) throws java.rmi.RemoteException;

    /**
     * Create policies for the specified web applications.
     */
    public void create(java.lang.String[] webapp_names, java.lang.String[][] policy_names) throws java.rmi.RemoteException;

    /**
     * Create policies from template for the specified web applications.
     */
    public void create_from_template(java.lang.String[] webapp_names, java.lang.String[][] policy_names, iControl.ASMPolicyTemplate[][] policy_templates) throws java.rmi.RemoteException;

    /**
     * Deletes a policy.
     */
    public void delete_policy(java.lang.String[] policy_names) throws java.rmi.RemoteException;

    /**
     * Detaches the WA web applictions from the ASM policy.
     */
    public void detach_wa_webapp(java.lang.String[] policy_names, java.lang.String[] wa_webapp_names) throws java.rmi.RemoteException;

    /**
     * Downloads the policy from the device.
     *  The download_policy is typically called after having called to export_policy.
     * 
     *  The parameter policy_name must be the same as used during export_policy.
     * The file is downloaded in chunks. Each chunk should be concatenated
     * to the previous one
     *  on the client side.
     *  The return value has two fields:
     *  - file_data: The relevant part of the content of the file
     *  - chunk_type: Indicates the current chunk whether it is the first,
     * middle, last chunk
     *                or the current call includes the entire file.
     */
    public iControl.ASMFileTransferContext download_policy(java.lang.String policy_name, long chunk_size, javax.xml.rpc.holders.LongHolder file_offset) throws java.rmi.RemoteException;

    /**
     * Export Policy
     *  The export_policy method exports the policy specified in parameter
     * policy_name
     *  and writes the file to the device's local disk.
     *  This method is typically followed by a call to download_policy which
     * gets this full path
     *  filename as a parameter.
     */
    public void export_policy(java.lang.String policy_name, java.lang.String filename) throws java.rmi.RemoteException;

    /**
     * Get the max cookie length.
     */
    public long[] get_cookie_length(java.lang.String[] policy_names) throws java.rmi.RemoteException;

    /**
     * Get blocking flag.
     */
    public boolean[] get_disable_blocking_flag(java.lang.String[] policy_names) throws java.rmi.RemoteException;

    /**
     * Get the "dynamic sessions in URL" for the specified policies.
     */
    public iControl.ASMDynamicSessionsInUrl[] get_dynamic_sessions_in_url(java.lang.String[] policy_names) throws java.rmi.RemoteException;

    /**
     * Get max http header length.
     */
    public long[] get_http_header_length(java.lang.String[] policy_names) throws java.rmi.RemoteException;

    /**
     * Get the list of policies.
     */
    public java.lang.String[] get_list() throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Gets violation blocking flag.
     */
    public iControl.ASMViolation[][] get_violation_flags(java.lang.String[] policy_names) throws java.rmi.RemoteException;

    /**
     * Import Policy
     *  
     *  Before calling import_policy, upload_policy should be done.
     *  Once the policy is completely uploaded, you can import it.
     */
    public void import_policy(java.lang.String webapp_name, java.lang.String filename) throws java.rmi.RemoteException;

    /**
     * Updates max cookie length.
     */
    public void set_cookie_length(java.lang.String[] policy_names, long[] cookie_lengths) throws java.rmi.RemoteException;

    /**
     * Updates blocking flag.
     */
    public void set_disable_blocking_flag(java.lang.String[] policy_names, boolean[] blocking_flags) throws java.rmi.RemoteException;

    /**
     * Set the "dynamic sessions in URL" for the specified policies.
     */
    public void set_dynamic_sessions_in_url(java.lang.String[] policy_names, iControl.ASMDynamicSessionsInUrl[] settings) throws java.rmi.RemoteException;

    /**
     * Updates max http header length.
     */
    public void set_http_header_length(java.lang.String[] policy_names, long[] http_header_lengths) throws java.rmi.RemoteException;

    /**
     * Set HTTP response splitting
     */
    public boolean set_http_response_splitting(java.lang.String policy_name) throws java.rmi.RemoteException;

    /**
     * Set path traversal
     */
    public boolean set_path_traversal(java.lang.String policy_name) throws java.rmi.RemoteException;

    /**
     * Updates prerequisite expiration period flag.
     */
    public void set_prerequisite_expiration_period(java.lang.String[] policy_names, long[] expiration_periods) throws java.rmi.RemoteException;

    /**
     * Updates violation blocking flag.
     */
    public void set_violation_flags(java.lang.String[] policy_names, iControl.ASMViolation[][] violations) throws java.rmi.RemoteException;

    /**
     * Uploads the policy to the device.
     *  In order to import a policy two things have to be done in this order
     * - call upload_policy
     *  - call import_policy
     *  upload_policy uploads the policy to the device to /var/tmp/ directory.
     * The filename is the name of the policy given in policy_name.
     *  If the policy is big, it should be uploaded in chunks using a loop
     * on the client side.
     */
    public void upload_policy(java.lang.String policy_name, iControl.ASMFileTransferContext file_context) throws java.rmi.RemoteException;

    /**
     * Uploads the the wsdl and attaches it to a specific xml profile
     * of a policy.
     */
    public void upload_xml_profile_wsdl(java.lang.String policy_name, java.lang.String profile_name, java.lang.String wsdl_filename, java.lang.String wsdl_text) throws java.rmi.RemoteException;
}
