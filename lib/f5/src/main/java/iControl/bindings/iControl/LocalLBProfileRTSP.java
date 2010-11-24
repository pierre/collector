/**
 * LocalLBProfileRTSP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBProfileRTSP extends javax.xml.rpc.Service {

/**
 * The ProfileRTSP interface enables you to manipulate a local load
 * balancer's RTSP profile.
 */
    public java.lang.String getLocalLBProfileRTSPPortAddress();

    public iControl.LocalLBProfileRTSPPortType getLocalLBProfileRTSPPort() throws javax.xml.rpc.ServiceException;

    public iControl.LocalLBProfileRTSPPortType getLocalLBProfileRTSPPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
