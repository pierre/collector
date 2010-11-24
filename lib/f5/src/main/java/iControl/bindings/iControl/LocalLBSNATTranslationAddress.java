/**
 * LocalLBSNATTranslationAddress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBSNATTranslationAddress extends javax.xml.rpc.Service {

/**
 * The SNATTranslationAddress interface enables you to work with the
 * definitions contained in a local load balancer's SNAT translation
 * address. 
 *  A translation address defines an address to which a client address
 * may be translated on the server side.
 */
    public java.lang.String getLocalLBSNATTranslationAddressPortAddress();

    public iControl.LocalLBSNATTranslationAddressPortType getLocalLBSNATTranslationAddressPort() throws javax.xml.rpc.ServiceException;

    public iControl.LocalLBSNATTranslationAddressPortType getLocalLBSNATTranslationAddressPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
