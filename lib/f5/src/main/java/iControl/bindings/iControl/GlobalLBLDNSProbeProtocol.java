/**
 * GlobalLBLDNSProbeProtocol.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class GlobalLBLDNSProbeProtocol implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GlobalLBLDNSProbeProtocol(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _LDNS_PROBE_PROTOCOL_ICMP = "LDNS_PROBE_PROTOCOL_ICMP";
    public static final java.lang.String _LDNS_PROBE_PROTOCOL_TCP = "LDNS_PROBE_PROTOCOL_TCP";
    public static final java.lang.String _LDNS_PROBE_PROTOCOL_UDP = "LDNS_PROBE_PROTOCOL_UDP";
    public static final java.lang.String _LDNS_PROBE_PROTOCOL_DNS_DOT = "LDNS_PROBE_PROTOCOL_DNS_DOT";
    public static final java.lang.String _LDNS_PROBE_PROTOCOL_DNS_REV = "LDNS_PROBE_PROTOCOL_DNS_REV";
    public static final GlobalLBLDNSProbeProtocol LDNS_PROBE_PROTOCOL_ICMP = new GlobalLBLDNSProbeProtocol(_LDNS_PROBE_PROTOCOL_ICMP);
    public static final GlobalLBLDNSProbeProtocol LDNS_PROBE_PROTOCOL_TCP = new GlobalLBLDNSProbeProtocol(_LDNS_PROBE_PROTOCOL_TCP);
    public static final GlobalLBLDNSProbeProtocol LDNS_PROBE_PROTOCOL_UDP = new GlobalLBLDNSProbeProtocol(_LDNS_PROBE_PROTOCOL_UDP);
    public static final GlobalLBLDNSProbeProtocol LDNS_PROBE_PROTOCOL_DNS_DOT = new GlobalLBLDNSProbeProtocol(_LDNS_PROBE_PROTOCOL_DNS_DOT);
    public static final GlobalLBLDNSProbeProtocol LDNS_PROBE_PROTOCOL_DNS_REV = new GlobalLBLDNSProbeProtocol(_LDNS_PROBE_PROTOCOL_DNS_REV);
    public java.lang.String getValue() { return _value_;}
    public static GlobalLBLDNSProbeProtocol fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GlobalLBLDNSProbeProtocol enumeration = (GlobalLBLDNSProbeProtocol)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GlobalLBLDNSProbeProtocol fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GlobalLBLDNSProbeProtocol.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "GlobalLB.LDNSProbeProtocol"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
