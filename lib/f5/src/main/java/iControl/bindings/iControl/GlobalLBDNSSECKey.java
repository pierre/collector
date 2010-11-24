/**
 * GlobalLBDNSSECKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public interface GlobalLBDNSSECKey extends javax.xml.rpc.Service {

/**
 * The DNSSECKey interface manages the cryptographic keys used for
 * securing DNS information, i.e., DNSSEC.  The keys managed by this
 *  interface can be used to sign DNS record groups and the keys
 *  themselves.
 * 
 *  Technically, there is not a single key for each key object.  This
 * key
 *  is re-created on a regular schedule, which can be controlled via
 * this
 *  interface.  Each re-generated key is considered a new "generation"
 * - a
 *  term used more in its genealogical sense than a creation sense. 
 * A
 *  single key generation can have its lifetime changed.  Thus when using
 * this interface, be careful to distinguish the attributes which apply
 * to this whole process vs those that apply to a single key generation.
 * 
 *  Once a key generation is created, it is fully active for the "rollover
 * period".  At the end of that period, the next generation's key is
 *  created and both keys are in use.  Once the first key reaches the
 * end
 *  of its "expiration period", it is no longer handed out, the generation
 * is deleted, and only the second key is in use.  This process continues
 * ad infinitum.
 * 
 *  It is important to note that these keys do not affect the processing
 * by
 *  their mere existence.  To take effect, they must be assigned to a
 * DNSSEC zone (See the DNSSECZone interface).
 */
    public java.lang.String getGlobalLBDNSSECKeyPortAddress();

    public iControl.GlobalLBDNSSECKeyPortType getGlobalLBDNSSECKeyPort() throws javax.xml.rpc.ServiceException;

    public iControl.GlobalLBDNSSECKeyPortType getGlobalLBDNSSECKeyPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
