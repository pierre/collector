/**
 * GlobalLBDNSSECZone.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface GlobalLBDNSSECZone extends javax.xml.rpc.Service {

/**
 * The DNSSECZone interface manages the zones in which securing DNS
 * information, i.e., DNSSEC, is active.  When a zone is active, its
 * DNS
 *  record groups are digitally signed, the DNS record names are hashed,
 * and keys sent to upstream DNS servers are digitally signed.
 * 
 *  A DNSSEC zone can contain any number of DNSSEC keys, and a single
 * DNSSEC key can be used in more than one DNSSEC zone.  Note that a
 * large
 *  number of DNSSEC keys in a single DNSSEC zone can affect the
 *  responsiveness to DNS requests.
 * 
 *  Note that the term "zone" in this interface is not necessarily "zone"
 * in a DNS sense.
 * 
 *  See the DNSSECKey interface for managing the keys themselves.
 */
    public java.lang.String getGlobalLBDNSSECZonePortAddress();

    public iControl.GlobalLBDNSSECZonePortType getGlobalLBDNSSECZonePort() throws javax.xml.rpc.ServiceException;

    public iControl.GlobalLBDNSSECZonePortType getGlobalLBDNSSECZonePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
