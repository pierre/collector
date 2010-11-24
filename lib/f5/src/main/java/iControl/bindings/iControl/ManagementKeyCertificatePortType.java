/**
 * ManagementKeyCertificatePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementKeyCertificatePortType extends java.rmi.Remote {

    /**
     * Adds certificates identified by "certificate_files" to the
     * certificate bundles, which are 
     *  presumed to exist already. Each of the original certificate bundle
     * can theoretically be a 
     *  normal certificate, i.e. a certificate bundle of one. After the add
     * operation, the bundles 
     *  will contain more than one certificate.
     */
    public void certificate_add_file_to_bundle(iControl.ManagementKeyCertificateManagementModeType mode, java.lang.String[] cert_ids, java.lang.String[] certificate_files) throws java.rmi.RemoteException;

    /**
     * Adds certificates identified by "pem_data" to the certificate
     * bundles, which are presumed
     *  to exist already. Each of the original certificate bundle can theoretically
     * be a normal
     *  certificate, i.e. a certificate bundle of one. After the add operation,
     * the bundles will
     *  contain more than one certificate.
     */
    public void certificate_add_pem_to_bundle(iControl.ManagementKeyCertificateManagementModeType mode, java.lang.String[] cert_ids, java.lang.String[] pem_data) throws java.rmi.RemoteException;

    /**
     * Binds/associates the specified keys and certificates.
     */
    public void certificate_bind(iControl.ManagementKeyCertificateManagementModeType mode, java.lang.String[] cert_ids, java.lang.String[] key_ids) throws java.rmi.RemoteException;

    /**
     * Gets the validity of the specified certificates.
     */
    public iControl.ManagementKeyCertificateValidityType[] certificate_check_validity(iControl.ManagementKeyCertificateManagementModeType mode, java.lang.String[] cert_ids, long[] watermark_days) throws java.rmi.RemoteException;

    /**
     * Deletes/uninstalls the specified certificates.
     */
    public void certificate_delete(iControl.ManagementKeyCertificateManagementModeType mode, java.lang.String[] cert_ids) throws java.rmi.RemoteException;

    /**
     * Deletes certificates, identified by their subject's X509 data,
     * from the certificate bundles.
     *  If the last certificate has been deleted from the bundle, the certificate
     * file will 
     *  automatically be deleted.
     */
    public void certificate_delete_from_bundle(iControl.ManagementKeyCertificateManagementModeType mode, java.lang.String[] cert_ids, iControl.ManagementKeyCertificateX509Data[] x509_data) throws java.rmi.RemoteException;

    /**
     * Exports the specified certificates to the given files.
     */
    public void certificate_export_to_file(iControl.ManagementKeyCertificateManagementModeType mode, java.lang.String[] cert_ids, java.lang.String[] file_names, boolean overwrite) throws java.rmi.RemoteException;

    /**
     * Exports the specified certificates to PEM-formatted data.
     */
    public java.lang.String[] certificate_export_to_pem(iControl.ManagementKeyCertificateManagementModeType mode, java.lang.String[] cert_ids) throws java.rmi.RemoteException;

    /**
     * Generates the specified certificates.  This assumes that each
     * of the associated keys,
     *  having the same identification as each certificate, has already been
     * created.
     */
    public void certificate_generate(iControl.ManagementKeyCertificateManagementModeType mode, iControl.ManagementKeyCertificateCertificate[] certs, iControl.ManagementKeyCertificateX509Data[] x509_data, long[] lifetime_days, boolean overwrite) throws java.rmi.RemoteException;

    /**
     * Imports/installs the specified certificates from the given
     * files.
     */
    public void certificate_import_from_file(iControl.ManagementKeyCertificateManagementModeType mode, java.lang.String[] cert_ids, java.lang.String[] file_names, boolean overwrite) throws java.rmi.RemoteException;

    /**
     * Imports/installs the specified certificates from the given
     * PEM-formatted data.
     */
    public void certificate_import_from_pem(iControl.ManagementKeyCertificateManagementModeType mode, java.lang.String[] cert_ids, java.lang.String[] pem_data, boolean overwrite) throws java.rmi.RemoteException;

    /**
     * Deletes the specified CSRs.
     */
    public void certificate_request_delete(iControl.ManagementKeyCertificateManagementModeType mode, java.lang.String[] csr_ids) throws java.rmi.RemoteException;

    /**
     * Exports the specified certificate requests to the given files.
     */
    public void certificate_request_export_to_file(iControl.ManagementKeyCertificateManagementModeType mode, java.lang.String[] csr_ids, java.lang.String[] file_names, boolean overwrite) throws java.rmi.RemoteException;

    /**
     * Exports the specified certificate requests to PEM-formatted
     * data.
     */
    public java.lang.String[] certificate_request_export_to_pem(iControl.ManagementKeyCertificateManagementModeType mode, java.lang.String[] csr_ids) throws java.rmi.RemoteException;

    /**
     * Generates the specified certificate signing requests.  This
     * assumes that each of the 
     *  associated keys, having the same identification as each certificate
     * request, has 
     *  already been created.
     */
    public void certificate_request_generate(iControl.ManagementKeyCertificateManagementModeType mode, iControl.ManagementKeyCertificateCertificateRequest[] csrs, iControl.ManagementKeyCertificateX509Data[] x509_data, boolean overwrite) throws java.rmi.RemoteException;

    /**
     * Imports/installs the specified certificate requests from the
     * given files.
     */
    public void certificate_request_import_from_file(iControl.ManagementKeyCertificateManagementModeType mode, java.lang.String[] csr_ids, java.lang.String[] file_names, boolean overwrite) throws java.rmi.RemoteException;

    /**
     * Imports/installs the specified certificate requests from the
     * given PEM-formatted data.
     */
    public void certificate_request_import_from_pem(iControl.ManagementKeyCertificateManagementModeType mode, java.lang.String[] csr_ids, java.lang.String[] pem_data, boolean overwrite) throws java.rmi.RemoteException;

    /**
     * Exports all currently installed keys and certificates into
     * the specified archive file.
     *  The archive file is a .tgz file that will contain all keys and certificates.
     */
    public void export_all_to_archive_file(iControl.ManagementKeyCertificateManagementModeType mode, java.lang.String archive_location, java.lang.String archive_name) throws java.rmi.RemoteException;

    /**
     * Exports all currently installed keys and certificates into
     * the returned archive stream.
     *  The returned archive stream is basically the contents of a .tgz file
     * that contains 
     *  all keys and certificates.
     */
    public byte[] export_all_to_archive_stream(iControl.ManagementKeyCertificateManagementModeType mode) throws java.rmi.RemoteException;

    /**
     * Exports the specified keys and certificates into the specified
     * archive file.
     *  The archive file is a .tgz file that will contain only the specified
     * keys and 
     *  certificates that have been exported.
     */
    public void export_to_archive_file(iControl.ManagementKeyCertificateManagementModeType mode, java.lang.String archive_location, java.lang.String archive_name, java.lang.String[] keys, java.lang.String[] certs) throws java.rmi.RemoteException;

    /**
     * Exports the specified keys and certificates into the returned
     * archive stream.
     *  The returned archive stream is basically the contents of a .tgz file
     * that contains 
     *  the exported keys and certificates.
     */
    public byte[] export_to_archive_stream(iControl.ManagementKeyCertificateManagementModeType mode, java.lang.String[] keys, java.lang.String[] certs) throws java.rmi.RemoteException;

    /**
     * Gets the list of all certificates bundled in the certificate
     * files as 
     *  specified by the file_names.  Each file_name will contain multiple
     * certficates.
     *  Note: only call this method when the results of get_certificate_list
     * indicate
     *  that there are multiple certificated bundled in a particular file.
     */
    public iControl.ManagementKeyCertificateCertificateDetail[][] get_certificate_bundle(iControl.ManagementKeyCertificateManagementModeType mode, java.lang.String[] file_names) throws java.rmi.RemoteException;

    /**
     * Gets the list of all installed certificates and their information.
     * If there's 
     *  a certificate bundle, only the first certificate in the bundle is
     * returned, and
     *  and is_bundle flag will be set to true for the correponding bundle
     * file name.
     */
    public iControl.ManagementKeyCertificateCertificateInformation[] get_certificate_list(iControl.ManagementKeyCertificateManagementModeType mode) throws java.rmi.RemoteException;

    /**
     * Gets the list of all CSRs and their information.
     */
    public iControl.ManagementKeyCertificateCertificateRequestInformation[] get_certificate_request_list(iControl.ManagementKeyCertificateManagementModeType mode) throws java.rmi.RemoteException;

    /**
     * Gets the list of all installed keys and their information.
     */
    public iControl.ManagementKeyCertificateKeyInformation[] get_key_list(iControl.ManagementKeyCertificateManagementModeType mode) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Imports/installs all keys and certificates from the specified
     * archive file.
     *  The archive file should be a .tgz file that contains all keys and
     * certificates.
     */
    public void import_all_from_archive_file(iControl.ManagementKeyCertificateManagementModeType mode, java.lang.String archive_location, java.lang.String archive_name) throws java.rmi.RemoteException;

    /**
     * Imports/installs all keys and certificates from the incoming
     * archive stream.
     *  The archive stream should be the contents of a .tgz file that contains
     * all 
     *  keys and certificates.
     */
    public void import_all_from_archive_stream(iControl.ManagementKeyCertificateManagementModeType mode, byte[] archive_stream) throws java.rmi.RemoteException;

    /**
     * Imports/installs the specified keys and certificates from the
     * specified archive file.
     *  The archive file should be a .tgz file that may contain more keys
     * and certificates 
     *  than what will be imported/installed.
     */
    public void import_from_archive_file(iControl.ManagementKeyCertificateManagementModeType mode, java.lang.String archive_location, java.lang.String archive_name, java.lang.String[] keys, java.lang.String[] certs) throws java.rmi.RemoteException;

    /**
     * Imports/installs the specified keys and certificates from the
     * incoming archive stream.
     *  The archive stream should be the contents of a .tgz file that may
     * contain more keys 
     *  and certificates than what will be imported/installed.
     */
    public void import_from_archive_stream(iControl.ManagementKeyCertificateManagementModeType mode, byte[] archive_stream, java.lang.String[] keys, java.lang.String[] certs) throws java.rmi.RemoteException;

    /**
     * Checks to see if the device supports FIPS security.
     */
    public boolean is_fips_available(iControl.ManagementKeyCertificateManagementModeType mode) throws java.rmi.RemoteException;

    /**
     * Deletes/uninstalls the specified keys.
     */
    public void key_delete(iControl.ManagementKeyCertificateManagementModeType mode, java.lang.String[] key_ids) throws java.rmi.RemoteException;

    /**
     * Exports the specified keys to the given files.
     */
    public void key_export_to_file(iControl.ManagementKeyCertificateManagementModeType mode, java.lang.String[] key_ids, java.lang.String[] file_names, boolean overwrite) throws java.rmi.RemoteException;

    /**
     * Exports the specified keys to PEM-formatted data.
     */
    public java.lang.String[] key_export_to_pem(iControl.ManagementKeyCertificateManagementModeType mode, java.lang.String[] key_ids) throws java.rmi.RemoteException;

    /**
     * Generates the specified keys.
     */
    public void key_generate(iControl.ManagementKeyCertificateManagementModeType mode, iControl.ManagementKeyCertificateKey[] keys, iControl.ManagementKeyCertificateX509Data[] x509_data, boolean create_optional_cert_csr, boolean overwrite) throws java.rmi.RemoteException;

    /**
     * Imports/installs the specified keys from the given files.
     */
    public void key_import_from_file(iControl.ManagementKeyCertificateManagementModeType mode, java.lang.String[] key_ids, java.lang.String[] file_names, boolean overwrite) throws java.rmi.RemoteException;

    /**
     * Imports/installs the specified keys from the given PEM-formatted
     * data.
     */
    public void key_import_from_pem(iControl.ManagementKeyCertificateManagementModeType mode, java.lang.String[] key_ids, java.lang.String[] pem_data, boolean overwrite) throws java.rmi.RemoteException;

    /**
     * Converts the specified keys to FIPS-enabled keys.
     */
    public void key_to_fips(iControl.ManagementKeyCertificateManagementModeType mode, java.lang.String[] key_ids) throws java.rmi.RemoteException;

    /**
     * Imports/installs the specified pkcs12 (Public Key
     *  Cryptography Standard #12) information from the given
     *  files. This includes keys and certificates, and each file
     *  is optionally password-encrypted.
     */
    public void pkcs12_import_from_file(iControl.ManagementKeyCertificateManagementModeType mode, java.lang.String[] ids, java.lang.String[] file_names, java.lang.String[] passwords, boolean overwrite) throws java.rmi.RemoteException;
}
