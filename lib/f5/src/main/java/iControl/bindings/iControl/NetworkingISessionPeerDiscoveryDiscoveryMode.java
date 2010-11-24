/**
 * NetworkingISessionPeerDiscoveryDiscoveryMode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iControl;

public class NetworkingISessionPeerDiscoveryDiscoveryMode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected NetworkingISessionPeerDiscoveryDiscoveryMode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _DISCOVERY_MODE_ENABLE_ALL = "DISCOVERY_MODE_ENABLE_ALL";
    public static final java.lang.String _DISCOVERY_MODE_DISABLE = "DISCOVERY_MODE_DISABLE";
    public static final java.lang.String _DISCOVERY_MODE_ENABLE_ICMP = "DISCOVERY_MODE_ENABLE_ICMP";
    public static final java.lang.String _DISCOVERY_MODE_ENABLE_TCP = "DISCOVERY_MODE_ENABLE_TCP";
    public static final NetworkingISessionPeerDiscoveryDiscoveryMode DISCOVERY_MODE_ENABLE_ALL = new NetworkingISessionPeerDiscoveryDiscoveryMode(_DISCOVERY_MODE_ENABLE_ALL);
    public static final NetworkingISessionPeerDiscoveryDiscoveryMode DISCOVERY_MODE_DISABLE = new NetworkingISessionPeerDiscoveryDiscoveryMode(_DISCOVERY_MODE_DISABLE);
    public static final NetworkingISessionPeerDiscoveryDiscoveryMode DISCOVERY_MODE_ENABLE_ICMP = new NetworkingISessionPeerDiscoveryDiscoveryMode(_DISCOVERY_MODE_ENABLE_ICMP);
    public static final NetworkingISessionPeerDiscoveryDiscoveryMode DISCOVERY_MODE_ENABLE_TCP = new NetworkingISessionPeerDiscoveryDiscoveryMode(_DISCOVERY_MODE_ENABLE_TCP);
    public java.lang.String getValue() { return _value_;}
    public static NetworkingISessionPeerDiscoveryDiscoveryMode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        NetworkingISessionPeerDiscoveryDiscoveryMode enumeration = (NetworkingISessionPeerDiscoveryDiscoveryMode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static NetworkingISessionPeerDiscoveryDiscoveryMode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(NetworkingISessionPeerDiscoveryDiscoveryMode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iControl", "Networking.iSessionPeerDiscovery.DiscoveryMode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
