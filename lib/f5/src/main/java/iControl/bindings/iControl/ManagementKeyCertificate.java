/**
 * ManagementKeyCertificate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface ManagementKeyCertificate extends javax.xml.rpc.Service {

/**
 * The KeyCertificate interface exposes methods that enable you to
 * manage keys, certificates,
 *  and certificate requests.  All methods in this interface are atomic
 * operations, such that 
 *  each operation involves creating a session context with the key/certificate
 * management 
 *  library, performing the required action, and cleaning up and/or destroying
 * the session 
 *  context when completed.  Therefore, all operations are stateless.
 * 
 *  Note that all operations on keys, certificates, and certificate requests
 * are performed in 
 *  the directory location containing keys, certs, csr's... as structured
 * for Apache, which is 
 *  currently /config/ssl.  For archiving operations, you have the option
 * of exporting
 *  or importing archives to/from other locations.  If the location is
 * not specified, the default
 *  location of /config/ssl will be used.
 */
    public java.lang.String getManagementKeyCertificatePortAddress();

    public iControl.ManagementKeyCertificatePortType getManagementKeyCertificatePort() throws javax.xml.rpc.ServiceException;

    public iControl.ManagementKeyCertificatePortType getManagementKeyCertificatePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
