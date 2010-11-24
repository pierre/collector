/**
 * LocalLBProfileUserStatistic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBProfileUserStatistic extends javax.xml.rpc.Service {

/**
 * The ProfileUserStatistic interface enables you to manage user-defined
 * statistics in a profile.
 *  The user can define up to 32 user-defined statistics in each profile.
 */
    public java.lang.String getLocalLBProfileUserStatisticPortAddress();

    public iControl.LocalLBProfileUserStatisticPortType getLocalLBProfileUserStatisticPort() throws javax.xml.rpc.ServiceException;

    public iControl.LocalLBProfileUserStatisticPortType getLocalLBProfileUserStatisticPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
