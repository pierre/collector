/**
 * LocalLBSNATPoolMemberPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface LocalLBSNATPoolMemberPortType extends java.rmi.Remote {

    /**
     * Gets the statistics for all SNATPool members in the specified
     * SNAT pools.
     */
    public iControl.LocalLBSNATPoolMemberSNATPoolMemberStatistics[] get_all_statistics(java.lang.String[] snat_pools) throws java.rmi.RemoteException;

    /**
     * Gets the statistics for a list of SNATPool members in the specified
     * SNAT pools.
     */
    public iControl.LocalLBSNATPoolMemberSNATPoolMemberStatistics[] get_statistics(java.lang.String[] snat_pools, java.lang.String[][] members) throws java.rmi.RemoteException;

    /**
     * Gets the version information for this interface.
     */
    public java.lang.String get_version() throws java.rmi.RemoteException;

    /**
     * Resets the statistics for a list of SNATPool members in the
     * specified SNAT pools.
     */
    public void reset_statistics(java.lang.String[] snat_pools, java.lang.String[][] members) throws java.rmi.RemoteException;
}
