/**
 * LocalLBProfileFTP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBProfileFTP extends javax.xml.rpc.Service {

/**
 * The ProfileFTP interface enables you to manipulate a local load
 * balancer's FTP profile.
 */
    public java.lang.String getLocalLBProfileFTPPortAddress();

    public iControl.LocalLBProfileFTPPortType getLocalLBProfileFTPPort() throws javax.xml.rpc.ServiceException;

    public iControl.LocalLBProfileFTPPortType getLocalLBProfileFTPPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
