/**
 * LocalLBRAMCacheInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBRAMCacheInformation extends javax.xml.rpc.Service {

/**
 * The RAMCacheInformation interface enables you to query for RAM
 * cache entries/statistics, 
 *  as well as evicting RAM cache entries.
 */
    public java.lang.String getLocalLBRAMCacheInformationPortAddress();

    public iControl.LocalLBRAMCacheInformationPortType getLocalLBRAMCacheInformationPort() throws javax.xml.rpc.ServiceException;

    public iControl.LocalLBRAMCacheInformationPortType getLocalLBRAMCacheInformationPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
