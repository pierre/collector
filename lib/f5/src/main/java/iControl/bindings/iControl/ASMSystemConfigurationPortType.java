/**
 * ASMSystemConfigurationPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ASMSystemConfigurationPortType extends java.rmi.Remote {

    /**
     * Returns the current version of the installed signature file
     */
    public java.lang.String get_signature_file_version() throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Get the severity of violations.
     */
    public iControl.ASMViolationSeverity[] get_violation_severities() throws java.rmi.RemoteException;

    /**
     * Returns the current status of ASM: '1'=ASM ready '0'=ASM not
     * ready
     */
    public boolean is_asm_ready() throws java.rmi.RemoteException;

    /**
     * Set the severity of violations.
     */
    public void set_violation_severities(iControl.ASMViolationSeverity[] violation_severities) throws java.rmi.RemoteException;

    /**
     * Updates the factory negsig file automatically from F5 server
     */
    public iControl.ASMSignatureFileUpdateReturnValue update_signature_file_automatic(boolean flg_is_user_defined, boolean do_set_active, boolean force, java.lang.String user_name, boolean check_interval) throws java.rmi.RemoteException;

    /**
     * Updates the factory negsig file manually
     */
    public iControl.ASMSignatureFileUpdateReturnValue update_signature_file_manual(iControl.ASMFileTransferContext file_context, boolean flg_is_user_defined, boolean do_set_active, boolean force, java.lang.String user_name, boolean check_interval) throws java.rmi.RemoteException;
}
