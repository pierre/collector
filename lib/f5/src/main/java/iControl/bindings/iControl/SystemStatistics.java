/**
 * SystemStatistics.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface SystemStatistics extends javax.xml.rpc.Service {

/**
 * The Statistics interface enables you to get information on various
 * system statistics.
 */
    public java.lang.String getSystemStatisticsPortAddress();

    public iControl.SystemStatisticsPortType getSystemStatisticsPort() throws javax.xml.rpc.ServiceException;

    public iControl.SystemStatisticsPortType getSystemStatisticsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
